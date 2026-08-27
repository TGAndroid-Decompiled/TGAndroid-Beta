package oa;

import java.util.Map;

public final class k implements Map.Entry {

    public k f19395a;

    public k f19396b;

    public k f19397c;
    public k d;

    public k f19398e;

    public final Object f19399f;
    public final boolean h;

    public Object f19400n;

    public int f19401r;

    public k(boolean z10) {
        this.f19399f = null;
        this.h = z10;
        this.f19398e = this;
        this.d = this;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f19399f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f19400n;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f19399f;
    }

    @Override
    public final Object getValue() {
        return this.f19400n;
    }

    @Override
    public final int hashCode() {
        Object obj = this.f19399f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f19400n;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override
    public final Object setValue(Object obj) {
        if (obj == null && !this.h) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f19400n;
        this.f19400n = obj;
        return obj2;
    }

    public final String toString() {
        return this.f19399f + "=" + this.f19400n;
    }

    public k(boolean z10, k kVar, Object obj, k kVar2, k kVar3) {
        this.f19395a = kVar;
        this.f19399f = obj;
        this.h = z10;
        this.f19401r = 1;
        this.d = kVar2;
        this.f19398e = kVar3;
        kVar3.d = this;
        kVar2.f19398e = this;
    }
}
