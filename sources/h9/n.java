package h9;

import java.io.Serializable;
import java.util.Arrays;
public final class n extends q1 implements Serializable {
    public final g9.k f14016a;
    public final q1 f14017b;

    public n(g9.k kVar, q1 q1Var) {
        this.f14016a = kVar;
        this.f14017b = q1Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        g9.k kVar = this.f14016a;
        return this.f14017b.compare(kVar.apply(obj), kVar.apply(obj2));
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f14016a.equals(nVar.f14016a) && this.f14017b.equals(nVar.f14017b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14016a, this.f14017b});
    }

    public final String toString() {
        return this.f14017b + ".onResultOf(" + this.f14016a + ")";
    }
}
