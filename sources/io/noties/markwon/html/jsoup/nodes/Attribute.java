package io.noties.markwon.html.jsoup.nodes;

import java.util.Map;

public final class Attribute implements Map.Entry, Cloneable {
    public String key;
    public Attributes parent;
    public String val;

    public final Object clone() {
        try {
            return (Attribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Attribute.class == obj.getClass()) {
            Attribute attribute = (Attribute) obj;
            String str = attribute.key;
            String str2 = this.key;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = this.val;
            String str4 = attribute.val;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.key;
    }

    @Override
    public final Object getValue() {
        return this.val;
    }

    @Override
    public final int hashCode() {
        String str = this.key;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.val;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override
    public final Object setValue(Object obj) {
        String str;
        String str2 = (String) obj;
        Attributes attributes = this.parent;
        String str3 = this.key;
        int iIndexOfKey = attributes.indexOfKey(str3);
        String str4 = "";
        if (iIndexOfKey != -1 && (str = attributes.vals[iIndexOfKey]) != null) {
            str4 = str;
        }
        int iIndexOfKey2 = attributes.indexOfKey(str3);
        if (iIndexOfKey2 != -1) {
            attributes.vals[iIndexOfKey2] = str2;
        }
        this.val = str2;
        return str4;
    }
}
