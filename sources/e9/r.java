package e9;

import java.io.Serializable;
import java.util.Arrays;
public final class r extends v1 implements Serializable {
    public final d9.k f8608a;
    public final v1 f8609b;

    public r(d9.k kVar, v1 v1Var) {
        this.f8608a = kVar;
        this.f8609b = v1Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        d9.k kVar = this.f8608a;
        return this.f8609b.compare(kVar.apply(obj), kVar.apply(obj2));
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f8608a.equals(rVar.f8608a) && this.f8609b.equals(rVar.f8609b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8608a, this.f8609b});
    }

    public final String toString() {
        return this.f8609b + ".onResultOf(" + this.f8608a + ")";
    }
}
