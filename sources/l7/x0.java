package l7;

import java.util.Arrays;
public final class x0 {
    public final t7 f12089a;
    public final Boolean f12090b;
    public final n8 f12091c;

    public x0(w0 w0Var) {
        this.f12089a = (t7) w0Var.f12080b;
        this.f12090b = (Boolean) w0Var.f12081c;
        this.f12091c = (n8) w0Var.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        if (b6.m.l(this.f12089a, x0Var.f12089a) && b6.m.l(this.f12090b, x0Var.f12090b) && b6.m.l(null, null) && b6.m.l(this.f12091c, x0Var.f12091c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12089a, this.f12090b, null, this.f12091c});
    }
}
