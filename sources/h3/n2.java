package h3;

import fh.y5;
import java.util.Arrays;
public final class n2 extends g2 {
    public static final String f9610e;
    public static final String f9611f;
    public static final y5 h;
    public final boolean f9612c;
    public final boolean d;

    static {
        int i9 = d5.f0.f4349a;
        f9610e = Integer.toString(1, 36);
        f9611f = Integer.toString(2, 36);
        h = new y5(24);
    }

    public n2() {
        this.f9612c = false;
        this.d = false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n2) {
            n2 n2Var = (n2) obj;
            if (this.d == n2Var.d && this.f9612c == n2Var.f9612c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f9612c), Boolean.valueOf(this.d)});
    }

    public n2(boolean z10) {
        this.f9612c = true;
        this.d = z10;
    }
}
