package j7;

import java.util.Arrays;
public final class k7 {
    public final j7 f11070a;
    public final Integer f11071b;

    public k7(g9.l lVar) {
        this.f11070a = (j7) lVar.f7168b;
        this.f11071b = (Integer) lVar.f7169c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k7)) {
            return false;
        }
        k7 k7Var = (k7) obj;
        if (z5.l.l(this.f11070a, k7Var.f11070a) && z5.l.l(this.f11071b, k7Var.f11071b) && z5.l.l(null, null) && z5.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11070a, this.f11071b, null, null});
    }
}
