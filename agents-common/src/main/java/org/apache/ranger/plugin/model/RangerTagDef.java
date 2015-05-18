/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.ranger.plugin.model;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@JsonAutoDetect(getterVisibility= JsonAutoDetect.Visibility.NONE, setterVisibility= JsonAutoDetect.Visibility.NONE, fieldVisibility= JsonAutoDetect.Visibility.ANY)
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL )
@JsonIgnoreProperties(ignoreUnknown=true)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

/**
 * Represents a TAG definition known to Ranger. In general, this will be provided
 * by some external system identified by 'source'.
 *
 */

public class RangerTagDef extends RangerBaseModelObject {
    private static final long serialVersionUID = 1L;

    private String name = null;
    private String source = null;

    private List<RangerTagAttributeDef> attributeDefs;

    public RangerTagDef() {
        this(null, "Internal");
    }

    public RangerTagDef(String name) {
        this(name, "Internal");
    }

    public RangerTagDef(String name, String source) {
        super();
        setName(name);
        setSource(source);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name == null ? new String() : name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source =  source == null ? new String() : source;
    }

    public List<RangerTagAttributeDef> getAttributeDefs() {
        return attributeDefs;
    }

    public void setAttributeDefs(List<RangerTagAttributeDef> attributeDefs) {
        this.attributeDefs = attributeDefs == null ? new ArrayList<RangerTagAttributeDef>() :  attributeDefs;
    }

    /**
     * Represents one attribute for a TAG. TAG-Attribute consists of a name and type.
     * name provides a handle for possible specification of additional information
     * associated with the TAG.
     * Interpretation of type is up to the policy-engine.
     */

    @JsonAutoDetect(getterVisibility= JsonAutoDetect.Visibility.NONE, setterVisibility= JsonAutoDetect.Visibility.NONE, fieldVisibility= JsonAutoDetect.Visibility.ANY)
    @JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL )
    @JsonIgnoreProperties(ignoreUnknown=true)
    @XmlRootElement
    @XmlAccessorType(XmlAccessType.FIELD)

    public static class RangerTagAttributeDef implements java.io.Serializable {

        private String name = null;
        private String type = null;

        public RangerTagAttributeDef() {
            this(null, null);
        }

        public RangerTagAttributeDef(String name, String type) {
            setName(name);
            setType(type);
        }

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }

        public void setName(String name) {
            this.name = name == null ? new String() : name;
        }
        public void setType(String type) {
            this.type = type == null ? new String() : type;
        }
    }
}
