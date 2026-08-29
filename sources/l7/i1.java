package l7;

import java.util.Arrays;
public final class i1 {
    public final gb f14821a;
    public final Boolean f14822b;
    public final ve f14823c;

    public i1(l3.g0 g0Var) {
        this.f14821a = (gb) g0Var.f14096b;
        this.f14822b = (Boolean) g0Var.f14097c;
        this.f14823c = (ve) g0Var.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (z5.l.l(this.f14821a, i1Var.f14821a) && z5.l.l(this.f14822b, i1Var.f14822b) && z5.l.l(null, null) && z5.l.l(this.f14823c, i1Var.f14823c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14821a, this.f14822b, null, this.f14823c});
    }
}
