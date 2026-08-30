package n7;

import java.util.Arrays;
public final class i1 {
    public final hb f14462a;
    public final Boolean f14463b;
    public final we f14464c;

    public i1(l7.w0 w0Var) {
        this.f14462a = (hb) w0Var.f11676b;
        this.f14463b = (Boolean) w0Var.f11677c;
        this.f14464c = (we) w0Var.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (b6.m.l(this.f14462a, i1Var.f14462a) && b6.m.l(this.f14463b, i1Var.f14463b) && b6.m.l(null, null) && b6.m.l(this.f14464c, i1Var.f14464c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14462a, this.f14463b, null, this.f14464c});
    }
}
