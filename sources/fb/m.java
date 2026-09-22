package fb;

import java.util.Map;
public final class m implements Map.Entry {
    public m f9036a;
    public m f9037b;
    public m f9038c;
    public m d;
    public m e;
    public final Object f9039f;
    public final boolean h;
    public Object f9040n;
    public int f9041r;

    public m(boolean z10) {
        this.f9039f = null;
        this.h = z10;
        this.e = this;
        this.d = this;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f9039f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f9040n;
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
        return this.f9039f;
    }

    @Override
    public final Object getValue() {
        return this.f9040n;
    }

    @Override
    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f9039f;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f9040n;
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
        Object obj2 = this.f9040n;
        this.f9040n = obj;
        return obj2;
    }

    public final String toString() {
        return this.f9039f + "=" + this.f9040n;
    }

    public m(boolean z10, m mVar, Object obj, m mVar2, m mVar3) {
        this.f9036a = mVar;
        this.f9039f = obj;
        this.h = z10;
        this.f9041r = 1;
        this.d = mVar2;
        this.e = mVar3;
        mVar3.d = this;
        mVar2.e = this;
    }
}
