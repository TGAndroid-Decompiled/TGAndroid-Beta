package l7;

import java.util.Arrays;
public final class x0 {
    public final t7 f11795a;
    public final Boolean f11796b;
    public final n8 f11797c;

    public x0(w0 w0Var) {
        this.f11795a = (t7) w0Var.f11786b;
        this.f11796b = (Boolean) w0Var.f11787c;
        this.f11797c = (n8) w0Var.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        if (b6.m.l(this.f11795a, x0Var.f11795a) && b6.m.l(this.f11796b, x0Var.f11796b) && b6.m.l(null, null) && b6.m.l(this.f11797c, x0Var.f11797c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11795a, this.f11796b, null, this.f11797c});
    }
}
