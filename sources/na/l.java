package na;

import java.util.Map;
public final class l implements Map.Entry {
    public l f18546a;
    public l f18547b;
    public l f18548c;
    public l d;
    public l f18549e;
    public final Object f18550f;
    public final boolean h;
    public Object f18551n;
    public int f18552r;

    public l(boolean z10) {
        this.f18550f = null;
        this.h = z10;
        this.f18549e = this;
        this.d = this;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f18550f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f18551n;
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
        return this.f18550f;
    }

    @Override
    public final Object getValue() {
        return this.f18551n;
    }

    @Override
    public final int hashCode() {
        int hashCode;
        int i9 = 0;
        Object obj = this.f18550f;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f18551n;
        if (obj2 != null) {
            i9 = obj2.hashCode();
        }
        return i9 ^ hashCode;
    }

    @Override
    public final Object setValue(Object obj) {
        if (obj == null && !this.h) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f18551n;
        this.f18551n = obj;
        return obj2;
    }

    public final String toString() {
        return this.f18550f + "=" + this.f18551n;
    }

    public l(boolean z10, l lVar, Object obj, l lVar2, l lVar3) {
        this.f18546a = lVar;
        this.f18550f = obj;
        this.h = z10;
        this.f18552r = 1;
        this.d = lVar2;
        this.f18549e = lVar3;
        lVar3.d = this;
        lVar2.f18549e = this;
    }
}
