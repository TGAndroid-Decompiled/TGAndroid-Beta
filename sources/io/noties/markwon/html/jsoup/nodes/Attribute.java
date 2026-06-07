package io.noties.markwon.html.jsoup.nodes;

import io.noties.markwon.html.jsoup.helper.Validate;
import java.util.Map;

public class Attribute implements Map.Entry, Cloneable {
    private String key;
    Attributes parent;
    private String val;

    public Attribute(String str, String str2, Attributes attributes) {
        Validate.notNull(str);
        this.key = str.trim();
        Validate.notEmpty(str);
        this.val = str2;
        this.parent = attributes;
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public String getValue() {
        return this.val;
    }

    @Override
    public String setValue(String str) {
        int iIndexOfKey;
        String str2 = this.parent.get(this.key);
        Attributes attributes = this.parent;
        if (attributes != null && (iIndexOfKey = attributes.indexOfKey(this.key)) != -1) {
            this.parent.vals[iIndexOfKey] = str;
        }
        this.val = str;
        return str2;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Attribute attribute = (Attribute) obj;
        String str = this.key;
        if (str == null ? attribute.key != null : !str.equals(attribute.key)) {
            return false;
        }
        String str2 = this.val;
        String str3 = attribute.val;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    @Override
    public int hashCode() {
        String str = this.key;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.val;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public Attribute m288clone() {
        try {
            return (Attribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
