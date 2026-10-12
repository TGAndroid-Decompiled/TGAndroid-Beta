package fb;

import java.util.Map;
public final class m implements Map.Entry {
    public m f9825a;
    public m f9826b;
    public m f9827c;
    public m d;
    public m f9828e;
    public final Object f9829f;
    public final boolean h;
    public Object f9830n;
    public int f9831r;

    public m(boolean z10) {
        this.f9829f = null;
        this.h = z10;
        this.f9828e = this;
        this.d = this;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f9829f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f9830n;
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
        return this.f9829f;
    }

    @Override
    public final Object getValue() {
        return this.f9830n;
    }

    @Override
    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f9829f;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f9830n;
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
        Object obj2 = this.f9830n;
        this.f9830n = obj;
        return obj2;
    }

    public final String toString() {
        return this.f9829f + "=" + this.f9830n;
    }

    public m(boolean z10, m mVar, Object obj, m mVar2, m mVar3) {
        this.f9825a = mVar;
        this.f9829f = obj;
        this.h = z10;
        this.f9831r = 1;
        this.d = mVar2;
        this.f9828e = mVar3;
        mVar3.d = this;
        mVar2.f9828e = this;
    }
}
