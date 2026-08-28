package h3;

import fh.y5;
import java.util.Arrays;
public final class v0 extends g2 {
    public static final String f9782e;
    public static final String f9783f;
    public static final y5 h;
    public final boolean f9784c;
    public final boolean d;

    static {
        int i9 = d5.f0.f4349a;
        f9782e = Integer.toString(1, 36);
        f9783f = Integer.toString(2, 36);
        h = new y5(15);
    }

    public v0() {
        this.f9784c = false;
        this.d = false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v0) {
            v0 v0Var = (v0) obj;
            if (this.d == v0Var.d && this.f9784c == v0Var.f9784c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f9784c), Boolean.valueOf(this.d)});
    }

    public v0(boolean z10) {
        this.f9784c = true;
        this.d = z10;
    }
}
