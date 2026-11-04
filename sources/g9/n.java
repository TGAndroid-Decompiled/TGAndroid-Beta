package g9;

import java.io.Serializable;
import java.util.Arrays;
public final class n extends q1 implements Serializable {
    public final f9.k f12104a;
    public final q1 f12105b;

    public n(f9.k kVar, q1 q1Var) {
        this.f12104a = kVar;
        this.f12105b = q1Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        f9.k kVar = this.f12104a;
        return this.f12105b.compare(kVar.apply(obj), kVar.apply(obj2));
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f12104a.equals(nVar.f12104a) && this.f12105b.equals(nVar.f12105b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12104a, this.f12105b});
    }

    public final String toString() {
        return this.f12105b + ".onResultOf(" + this.f12104a + ")";
    }
}
