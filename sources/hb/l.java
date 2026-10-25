package hb;

import java.util.Map;
public final class l implements Map.Entry {
    public l f12746a;
    public l f12747b;
    public l f12748c;
    public l d;
    public l e;
    public final Object f12749f;
    public final boolean h;
    public Object f12750n;
    public int f12751r;

    public l(boolean z10) {
        this.f12749f = null;
        this.h = z10;
        this.e = this;
        this.d = this;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f12749f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f12750n;
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
        return this.f12749f;
    }

    @Override
    public final Object getValue() {
        return this.f12750n;
    }

    @Override
    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f12749f;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f12750n;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i10 ^ hashCode;
    }

    @Override
    public final Object setValue(Object obj) {
        if (obj == null && !this.h) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f12750n;
        this.f12750n = obj;
        return obj2;
    }

    public final String toString() {
        return this.f12749f + "=" + this.f12750n;
    }

    public l(boolean z10, l lVar, Object obj, l lVar2, l lVar3) {
        this.f12746a = lVar;
        this.f12749f = obj;
        this.h = z10;
        this.f12751r = 1;
        this.d = lVar2;
        this.e = lVar3;
        lVar3.d = this;
        lVar2.e = this;
    }
}
