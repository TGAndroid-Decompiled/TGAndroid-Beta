package n7;

import java.util.Arrays;
public final class i1 {
    public final hb f15450a;
    public final Boolean f15451b;
    public final we f15452c;

    public i1(l7.w0 w0Var) {
        this.f15450a = (hb) w0Var.f12080b;
        this.f15451b = (Boolean) w0Var.f12081c;
        this.f15452c = (we) w0Var.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (b6.m.l(this.f15450a, i1Var.f15450a) && b6.m.l(this.f15451b, i1Var.f15451b) && b6.m.l(null, null) && b6.m.l(this.f15452c, i1Var.f15452c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15450a, this.f15451b, null, this.f15452c});
    }
}
