package j3;

import java.util.Arrays;
public final class n2 extends g2 {
    public static final String f10647e;
    public static final String f10648f;
    public static final d0 h;
    public final boolean f10649c;
    public final boolean d;

    static {
        int i10 = f5.d0.f6579a;
        f10647e = Integer.toString(1, 36);
        f10648f = Integer.toString(2, 36);
        h = new d0(11);
    }

    public n2() {
        this.f10649c = false;
        this.d = false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n2) {
            n2 n2Var = (n2) obj;
            if (this.d == n2Var.d && this.f10649c == n2Var.f10649c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f10649c), Boolean.valueOf(this.d)});
    }

    public n2(boolean z10) {
        this.f10649c = true;
        this.d = z10;
    }
}
