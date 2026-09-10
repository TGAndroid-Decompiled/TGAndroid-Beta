package e9;

import java.io.Serializable;
import java.util.Arrays;
public final class p extends y0 implements Serializable {
    public final d9.e f7413a;
    public final y0 f7414b;

    public p(d9.e eVar, y0 y0Var) {
        this.f7413a = eVar;
        this.f7414b = y0Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        d9.e eVar = this.f7413a;
        return this.f7414b.compare(eVar.apply(obj), eVar.apply(obj2));
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f7413a.equals(pVar.f7413a) && this.f7414b.equals(pVar.f7414b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7413a, this.f7414b});
    }

    public final String toString() {
        return this.f7414b + ".onResultOf(" + this.f7413a + ")";
    }
}
