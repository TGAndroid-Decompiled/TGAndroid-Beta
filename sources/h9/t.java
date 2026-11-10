package h9;

import java.io.Serializable;
public final class t extends r1 implements Serializable {
    public final a3.c f14396a;

    public t(a3.c cVar) {
        this.f14396a = cVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f14396a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            return this.f14396a.equals(((t) obj).f14396a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14396a.hashCode();
    }

    public final String toString() {
        return this.f14396a.toString();
    }
}
