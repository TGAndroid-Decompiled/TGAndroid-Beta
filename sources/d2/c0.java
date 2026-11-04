package d2;
public class c0 {
    public static final c0 f8043i = new c0(new b0());
    public static final String f8044j = Integer.toString(0, 36);
    public static final String f8045k = Integer.toString(1, 36);
    public static final String f8046l = Integer.toString(2, 36);
    public static final String f8047m = Integer.toString(3, 36);
    public static final String f8048n = Integer.toString(4, 36);
    public static final String f8049o = Integer.toString(5, 36);
    public static final String f8050p = Integer.toString(6, 36);
    public static final String f8051q = Integer.toString(7, 36);
    public final long f8052a;
    public final long f8053b;
    public final long f8054c;
    public final long d;
    public final boolean f8055e;
    public final boolean f8056f;
    public final boolean f8057g;
    public final boolean h;

    public c0(b0 b0Var) {
        this.f8052a = g2.n0.h0(b0Var.f8033a);
        this.f8054c = g2.n0.h0(b0Var.f8034b);
        this.f8053b = b0Var.f8033a;
        this.d = b0Var.f8034b;
        this.f8055e = b0Var.f8035c;
        this.f8056f = b0Var.d;
        this.f8057g = b0Var.f8036e;
        this.h = b0Var.f8037f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (this.f8053b == c0Var.f8053b && this.d == c0Var.d && this.f8055e == c0Var.f8055e && this.f8056f == c0Var.f8056f && this.f8057g == c0Var.f8057g && this.h == c0Var.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f8053b;
        long j11 = this.d;
        return (((((((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f8055e ? 1 : 0)) * 31) + (this.f8056f ? 1 : 0)) * 31) + (this.f8057g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
