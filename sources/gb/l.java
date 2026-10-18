package gb;

import java.util.Map;
public final class l implements Map.Entry {
    public l f10970a;
    public l f10971b;
    public l f10972c;
    public l d;
    public l e;
    public final Object f10973f;
    public final boolean h;
    public Object f10974n;
    public int f10975r;

    public l(boolean z10) {
        this.f10973f = null;
        this.h = z10;
        this.e = this;
        this.d = this;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f10973f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f10974n;
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
        return this.f10973f;
    }

    @Override
    public final Object getValue() {
        return this.f10974n;
    }

    @Override
    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f10973f;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f10974n;
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
        Object obj2 = this.f10974n;
        this.f10974n = obj;
        return obj2;
    }

    public final String toString() {
        return this.f10973f + "=" + this.f10974n;
    }

    public l(boolean z10, l lVar, Object obj, l lVar2, l lVar3) {
        this.f10970a = lVar;
        this.f10973f = obj;
        this.h = z10;
        this.f10975r = 1;
        this.d = lVar2;
        this.e = lVar3;
        lVar3.d = this;
        lVar2.e = this;
    }
}
