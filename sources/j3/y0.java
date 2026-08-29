package j3;
public abstract class y0 implements g {
    public static final z0 f10854f = new y0(new x0());
    public static final String h;
    public static final String f10855n;
    public static final String f10856r;
    public static final String f10857s;
    public static final String v;
    public static final d0 f10858w;
    public final long f10859a;
    public final long f10860b;
    public final boolean f10861c;
    public final boolean d;
    public final boolean f10862e;

    static {
        int i10 = f5.d0.f6579a;
        h = Integer.toString(0, 36);
        f10855n = Integer.toString(1, 36);
        f10856r = Integer.toString(2, 36);
        f10857s = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f10858w = new d0(4);
    }

    public y0(x0 x0Var) {
        this.f10859a = x0Var.f10844a;
        this.f10860b = x0Var.f10845b;
        this.f10861c = x0Var.f10846c;
        this.d = x0Var.d;
        this.f10862e = x0Var.f10847e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        if (this.f10859a == y0Var.f10859a && this.f10860b == y0Var.f10860b && this.f10861c == y0Var.f10861c && this.d == y0Var.d && this.f10862e == y0Var.f10862e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f10859a;
        long j11 = this.f10860b;
        return (((((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f10861c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f10862e ? 1 : 0);
    }
}
