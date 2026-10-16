package gb;

import java.util.Map;
public final class n implements Map.Entry {
    public n f10064a;
    public n f10065b;
    public n f10066c;
    public n d;
    public n e;
    public final Object f10067f;
    public final boolean h;
    public Object f10068n;
    public int f10069r;

    public n(boolean z10) {
        this.f10067f = null;
        this.h = z10;
        this.e = this;
        this.d = this;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f10067f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f10068n;
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
        return this.f10067f;
    }

    @Override
    public final Object getValue() {
        return this.f10068n;
    }

    @Override
    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f10067f;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f10068n;
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
        Object obj2 = this.f10068n;
        this.f10068n = obj;
        return obj2;
    }

    public final String toString() {
        return this.f10067f + "=" + this.f10068n;
    }

    public n(boolean z10, n nVar, Object obj, n nVar2, n nVar3) {
        this.f10064a = nVar;
        this.f10067f = obj;
        this.h = z10;
        this.f10069r = 1;
        this.d = nVar2;
        this.e = nVar3;
        nVar3.d = this;
        nVar2.e = this;
    }
}
