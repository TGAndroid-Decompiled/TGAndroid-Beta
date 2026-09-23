package e9;

import java.io.Serializable;
import java.util.Arrays;
public final class p extends y0 implements Serializable {
    public final d9.e f8096a;
    public final y0 f8097b;

    public p(d9.e eVar, y0 y0Var) {
        this.f8096a = eVar;
        this.f8097b = y0Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        d9.e eVar = this.f8096a;
        return this.f8097b.compare(eVar.apply(obj), eVar.apply(obj2));
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f8096a.equals(pVar.f8096a) && this.f8097b.equals(pVar.f8097b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8096a, this.f8097b});
    }

    public final String toString() {
        return this.f8097b + ".onResultOf(" + this.f8096a + ")";
    }
}
