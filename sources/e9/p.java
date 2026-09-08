package e9;

import java.io.Serializable;
import java.util.Arrays;
public final class p extends y0 implements Serializable {
    public final d9.e f9017a;
    public final y0 f9018b;

    public p(d9.e eVar, y0 y0Var) {
        this.f9017a = eVar;
        this.f9018b = y0Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        d9.e eVar = this.f9017a;
        return this.f9018b.compare(eVar.apply(obj), eVar.apply(obj2));
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f9017a.equals(pVar.f9017a) && this.f9018b.equals(pVar.f9018b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9017a, this.f9018b});
    }

    public final String toString() {
        return this.f9018b + ".onResultOf(" + this.f9017a + ")";
    }
}
