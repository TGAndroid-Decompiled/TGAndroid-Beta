package e9;

import java.io.Serializable;
import java.util.Arrays;
public final class r extends v1 implements Serializable {
    public final d9.k f8497a;
    public final v1 f8498b;

    public r(d9.k kVar, v1 v1Var) {
        this.f8497a = kVar;
        this.f8498b = v1Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        d9.k kVar = this.f8497a;
        return this.f8498b.compare(kVar.apply(obj), kVar.apply(obj2));
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f8497a.equals(rVar.f8497a) && this.f8498b.equals(rVar.f8498b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8497a, this.f8498b});
    }

    public final String toString() {
        return this.f8498b + ".onResultOf(" + this.f8497a + ")";
    }
}
