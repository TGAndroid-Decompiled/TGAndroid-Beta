package e9;

import java.io.Serializable;
import java.util.Arrays;
public final class p extends y0 implements Serializable {
    public final d9.e f8107a;
    public final y0 f8108b;

    public p(d9.e eVar, y0 y0Var) {
        this.f8107a = eVar;
        this.f8108b = y0Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        d9.e eVar = this.f8107a;
        return this.f8108b.compare(eVar.apply(obj), eVar.apply(obj2));
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f8107a.equals(pVar.f8107a) && this.f8108b.equals(pVar.f8108b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8107a, this.f8108b});
    }

    public final String toString() {
        return this.f8108b + ".onResultOf(" + this.f8107a + ")";
    }
}
