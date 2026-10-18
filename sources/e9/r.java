package e9;

import java.io.Serializable;
import java.util.Arrays;
public final class r extends v1 implements Serializable {
    public final d9.k f8491a;
    public final v1 f8492b;

    public r(d9.k kVar, v1 v1Var) {
        this.f8491a = kVar;
        this.f8492b = v1Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        d9.k kVar = this.f8491a;
        return this.f8492b.compare(kVar.apply(obj), kVar.apply(obj2));
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f8491a.equals(rVar.f8491a) && this.f8492b.equals(rVar.f8492b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8491a, this.f8492b});
    }

    public final String toString() {
        return this.f8492b + ".onResultOf(" + this.f8491a + ")";
    }
}
