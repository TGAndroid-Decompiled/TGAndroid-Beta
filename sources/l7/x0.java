package l7;

import java.util.Arrays;
public final class x0 {
    public final t7 f11685a;
    public final Boolean f11686b;
    public final n8 f11687c;

    public x0(w0 w0Var) {
        this.f11685a = (t7) w0Var.f11676b;
        this.f11686b = (Boolean) w0Var.f11677c;
        this.f11687c = (n8) w0Var.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        if (b6.m.l(this.f11685a, x0Var.f11685a) && b6.m.l(this.f11686b, x0Var.f11686b) && b6.m.l(null, null) && b6.m.l(this.f11687c, x0Var.f11687c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11685a, this.f11686b, null, this.f11687c});
    }
}
