package h9;

import java.io.Serializable;
public final class b2 extends r1 implements Serializable {
    public final r1 f13979a;

    public b2(r1 r1Var) {
        this.f13979a = r1Var;
    }

    @Override
    public final r1 a() {
        return this.f13979a;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f13979a.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            return this.f13979a.equals(((b2) obj).f13979a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f13979a.hashCode();
    }

    public final String toString() {
        return this.f13979a + ".reverse()";
    }
}
