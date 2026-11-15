package h9;

import java.io.Serializable;
import java.util.Arrays;
public final class n extends q1 implements Serializable {
    public final g9.k f13707a;
    public final q1 f13708b;

    public n(g9.k kVar, q1 q1Var) {
        this.f13707a = kVar;
        this.f13708b = q1Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        g9.k kVar = this.f13707a;
        return this.f13708b.compare(kVar.apply(obj), kVar.apply(obj2));
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f13707a.equals(nVar.f13707a) && this.f13708b.equals(nVar.f13708b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13707a, this.f13708b});
    }

    public final String toString() {
        return this.f13708b + ".onResultOf(" + this.f13707a + ")";
    }
}
