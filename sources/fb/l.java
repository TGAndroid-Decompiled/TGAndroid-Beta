package fb;

import java.util.Map;
public final class l implements Map.Entry {
    public l f9021a;
    public l f9022b;
    public l f9023c;
    public l d;
    public l e;
    public final Object f9024f;
    public final boolean h;
    public Object f9025n;
    public int f9026r;

    public l(boolean z10) {
        this.f9024f = null;
        this.h = z10;
        this.e = this;
        this.d = this;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f9024f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f9025n;
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
        return this.f9024f;
    }

    @Override
    public final Object getValue() {
        return this.f9025n;
    }

    @Override
    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f9024f;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f9025n;
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
        Object obj2 = this.f9025n;
        this.f9025n = obj;
        return obj2;
    }

    public final String toString() {
        return this.f9024f + "=" + this.f9025n;
    }

    public l(boolean z10, l lVar, Object obj, l lVar2, l lVar3) {
        this.f9021a = lVar;
        this.f9024f = obj;
        this.h = z10;
        this.f9026r = 1;
        this.d = lVar2;
        this.e = lVar3;
        lVar3.d = this;
        lVar2.e = this;
    }
}
