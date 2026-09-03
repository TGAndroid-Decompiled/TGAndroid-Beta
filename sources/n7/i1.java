package n7;

import java.util.Arrays;
public final class i1 {
    public final hb f14447a;
    public final Boolean f14448b;
    public final we f14449c;

    public i1(l7.w0 w0Var) {
        this.f14447a = (hb) w0Var.f11786b;
        this.f14448b = (Boolean) w0Var.f11787c;
        this.f14449c = (we) w0Var.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (b6.m.l(this.f14447a, i1Var.f14447a) && b6.m.l(this.f14448b, i1Var.f14448b) && b6.m.l(null, null) && b6.m.l(this.f14449c, i1Var.f14449c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14447a, this.f14448b, null, this.f14449c});
    }
}
