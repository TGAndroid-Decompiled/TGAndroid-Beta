package n7;

import java.util.Arrays;
public final class i1 {
    public final hb f15452a;
    public final Boolean f15453b;
    public final we f15454c;

    public i1(l7.w0 w0Var) {
        this.f15452a = (hb) w0Var.f12080b;
        this.f15453b = (Boolean) w0Var.f12081c;
        this.f15454c = (we) w0Var.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (b6.m.l(this.f15452a, i1Var.f15452a) && b6.m.l(this.f15453b, i1Var.f15453b) && b6.m.l(null, null) && b6.m.l(this.f15454c, i1Var.f15454c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15452a, this.f15453b, null, this.f15454c});
    }
}
