package f9;

import java.io.Serializable;
import java.util.Arrays;
public final class n extends q1 implements Serializable {
    public final e9.k f10304a;
    public final q1 f10305b;

    public n(e9.k kVar, q1 q1Var) {
        this.f10304a = kVar;
        this.f10305b = q1Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        e9.k kVar = this.f10304a;
        return this.f10305b.compare(kVar.apply(obj), kVar.apply(obj2));
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f10304a.equals(nVar.f10304a) && this.f10305b.equals(nVar.f10305b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10304a, this.f10305b});
    }

    public final String toString() {
        return this.f10305b + ".onResultOf(" + this.f10304a + ")";
    }
}
