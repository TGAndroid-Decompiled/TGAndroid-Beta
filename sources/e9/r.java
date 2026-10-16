package e9;

import java.io.Serializable;
import java.util.Arrays;
public final class r extends v1 implements Serializable {
    public final d9.k f8611a;
    public final v1 f8612b;

    public r(d9.k kVar, v1 v1Var) {
        this.f8611a = kVar;
        this.f8612b = v1Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        d9.k kVar = this.f8611a;
        return this.f8612b.compare(kVar.apply(obj), kVar.apply(obj2));
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f8611a.equals(rVar.f8611a) && this.f8612b.equals(rVar.f8612b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8611a, this.f8612b});
    }

    public final String toString() {
        return this.f8612b + ".onResultOf(" + this.f8611a + ")";
    }
}
