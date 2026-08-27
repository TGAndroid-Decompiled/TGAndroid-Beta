package h3;

import java.util.Arrays;

public final class n2 extends g2 {

    public static final String f8040e;

    public static final String f8041f;
    public static final f9.z h;

    public final boolean f8042c;
    public final boolean d;

    static {
        int i10 = d5.g0.f4795a;
        f8040e = Integer.toString(1, 36);
        f8041f = Integer.toString(2, 36);
        h = new f9.z(28);
    }

    public n2() {
        this.f8042c = false;
        this.d = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return this.d == n2Var.d && this.f8042c == n2Var.f8042c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f8042c), Boolean.valueOf(this.d)});
    }

    public n2(boolean z10) {
        this.f8042c = true;
        this.d = z10;
    }
}
