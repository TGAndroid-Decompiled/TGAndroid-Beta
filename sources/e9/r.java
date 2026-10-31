package e9;

import java.io.Serializable;
import java.util.Arrays;
public final class r extends v1 implements Serializable {
    public final d9.k f6406a;
    public final v1 f6407b;

    public r(d9.k kVar, v1 v1Var) {
        this.f6406a = kVar;
        this.f6407b = v1Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        d9.k kVar = this.f6406a;
        return this.f6407b.compare(kVar.apply(obj), kVar.apply(obj2));
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f6406a.equals(rVar.f6406a) && this.f6407b.equals(rVar.f6407b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6406a, this.f6407b});
    }

    public final String toString() {
        return this.f6407b + ".onResultOf(" + this.f6406a + ")";
    }
}
