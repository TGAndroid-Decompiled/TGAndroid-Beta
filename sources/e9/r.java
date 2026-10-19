package e9;

import java.io.Serializable;
import java.util.Arrays;
public final class r extends v1 implements Serializable {
    public final d9.k f8490a;
    public final v1 f8491b;

    public r(d9.k kVar, v1 v1Var) {
        this.f8490a = kVar;
        this.f8491b = v1Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        d9.k kVar = this.f8490a;
        return this.f8491b.compare(kVar.apply(obj), kVar.apply(obj2));
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f8490a.equals(rVar.f8490a) && this.f8491b.equals(rVar.f8491b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8490a, this.f8491b});
    }

    public final String toString() {
        return this.f8491b + ".onResultOf(" + this.f8490a + ")";
    }
}
