package h9;

import java.io.Serializable;
public final class t extends r1 implements Serializable {
    public final a3.c f14063a;

    public t(a3.c cVar) {
        this.f14063a = cVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f14063a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            return this.f14063a.equals(((t) obj).f14063a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14063a.hashCode();
    }

    public final String toString() {
        return this.f14063a.toString();
    }
}
