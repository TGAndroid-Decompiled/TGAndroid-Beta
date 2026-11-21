package h9;

import java.io.Serializable;
import java.util.Arrays;
public final class n extends r1 implements Serializable {
    public final g9.k f14055a;
    public final r1 f14056b;

    public n(g9.k kVar, r1 r1Var) {
        this.f14055a = kVar;
        this.f14056b = r1Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        g9.k kVar = this.f14055a;
        return this.f14056b.compare(kVar.apply(obj), kVar.apply(obj2));
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f14055a.equals(nVar.f14055a) && this.f14056b.equals(nVar.f14056b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14055a, this.f14056b});
    }

    public final String toString() {
        return this.f14056b + ".onResultOf(" + this.f14055a + ")";
    }
}
