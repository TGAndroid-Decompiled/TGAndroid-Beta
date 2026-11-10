package h9;

import java.io.Serializable;
import java.util.Arrays;
public final class n extends r1 implements Serializable {
    public final g9.k f14354a;
    public final r1 f14355b;

    public n(g9.k kVar, r1 r1Var) {
        this.f14354a = kVar;
        this.f14355b = r1Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        g9.k kVar = this.f14354a;
        return this.f14355b.compare(kVar.apply(obj), kVar.apply(obj2));
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f14354a.equals(nVar.f14354a) && this.f14355b.equals(nVar.f14355b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14354a, this.f14355b});
    }

    public final String toString() {
        return this.f14355b + ".onResultOf(" + this.f14354a + ")";
    }
}
