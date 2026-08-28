package h3;

import fh.y5;
public abstract class y0 implements g {
    public static final z0 f9817f = new y0(new x0());
    public static final String h;
    public static final String f9818n;
    public static final String f9819r;
    public static final String f9820s;
    public static final String v;
    public static final y5 f9821w;
    public final long f9822a;
    public final long f9823b;
    public final boolean f9824c;
    public final boolean d;
    public final boolean f9825e;

    static {
        int i9 = d5.f0.f4349a;
        h = Integer.toString(0, 36);
        f9818n = Integer.toString(1, 36);
        f9819r = Integer.toString(2, 36);
        f9820s = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f9821w = new y5(17);
    }

    public y0(x0 x0Var) {
        this.f9822a = x0Var.f9807a;
        this.f9823b = x0Var.f9808b;
        this.f9824c = x0Var.f9809c;
        this.d = x0Var.d;
        this.f9825e = x0Var.f9810e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        if (this.f9822a == y0Var.f9822a && this.f9823b == y0Var.f9823b && this.f9824c == y0Var.f9824c && this.d == y0Var.d && this.f9825e == y0Var.f9825e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f9822a;
        long j11 = this.f9823b;
        return (((((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f9824c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f9825e ? 1 : 0);
    }
}
