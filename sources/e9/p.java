package e9;

import java.io.Serializable;
import java.util.Arrays;
public final class p extends y0 implements Serializable {
    public final d9.e f8989a;
    public final y0 f8990b;

    public p(d9.e eVar, y0 y0Var) {
        this.f8989a = eVar;
        this.f8990b = y0Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        d9.e eVar = this.f8989a;
        return this.f8990b.compare(eVar.apply(obj), eVar.apply(obj2));
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f8989a.equals(pVar.f8989a) && this.f8990b.equals(pVar.f8990b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8989a, this.f8990b});
    }

    public final String toString() {
        return this.f8990b + ".onResultOf(" + this.f8989a + ")";
    }
}
