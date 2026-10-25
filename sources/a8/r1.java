package a8;

import java.util.Arrays;
public final class r1 {
    public final qb f760a;
    public final Boolean f761b;
    public final ef f762c;

    public r1(h0 h0Var) {
        this.f760a = (qb) h0Var.f511b;
        this.f761b = (Boolean) h0Var.f512c;
        this.f762c = (ef) h0Var.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        if (o6.l.l(this.f760a, r1Var.f760a) && o6.l.l(this.f761b, r1Var.f761b) && o6.l.l(null, null) && o6.l.l(this.f762c, r1Var.f762c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f760a, this.f761b, null, this.f762c});
    }
}
