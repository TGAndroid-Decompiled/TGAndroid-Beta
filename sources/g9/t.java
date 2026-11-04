package g9;

import java.io.Serializable;
public final class t extends q1 implements Serializable {
    public final vg.i1 f12148a;

    public t(vg.i1 i1Var) {
        this.f12148a = i1Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f12148a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            return this.f12148a.equals(((t) obj).f12148a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12148a.hashCode();
    }

    public final String toString() {
        return this.f12148a.toString();
    }
}
