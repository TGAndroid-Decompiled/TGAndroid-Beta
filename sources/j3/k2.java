package j3;

import java.util.Arrays;
public final class k2 extends f2 {
    public static final String e;
    public static final String f8660f;
    public static final q0 h;
    public final boolean f8661c;
    public final boolean d;

    static {
        int i10 = h5.d0.f6937a;
        e = Integer.toString(1, 36);
        f8660f = Integer.toString(2, 36);
        h = new q0(12);
    }

    public k2() {
        this.f8661c = false;
        this.d = false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k2) {
            k2 k2Var = (k2) obj;
            if (this.d == k2Var.d && this.f8661c == k2Var.f8661c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f8661c), Boolean.valueOf(this.d)});
    }

    public k2(boolean z4) {
        this.f8661c = true;
        this.d = z4;
    }
}
