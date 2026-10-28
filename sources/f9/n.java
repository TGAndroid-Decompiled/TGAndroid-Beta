package f9;

import java.io.Serializable;
import java.util.Arrays;
public final class n extends q1 implements Serializable {
    public final e9.k f10303a;
    public final q1 f10304b;

    public n(e9.k kVar, q1 q1Var) {
        this.f10303a = kVar;
        this.f10304b = q1Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        e9.k kVar = this.f10303a;
        return this.f10304b.compare(kVar.apply(obj), kVar.apply(obj2));
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f10303a.equals(nVar.f10303a) && this.f10304b.equals(nVar.f10304b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10303a, this.f10304b});
    }

    public final String toString() {
        return this.f10304b + ".onResultOf(" + this.f10303a + ")";
    }
}
