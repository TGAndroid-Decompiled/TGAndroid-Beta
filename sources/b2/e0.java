package b2;
public class e0 {
    public static final e0 f2103i = new e0(new d0());
    public static final String f2104j = Integer.toString(0, 36);
    public static final String f2105k = Integer.toString(1, 36);
    public static final String f2106l = Integer.toString(2, 36);
    public static final String f2107m = Integer.toString(3, 36);
    public static final String f2108n = Integer.toString(4, 36);
    public static final String f2109o = Integer.toString(5, 36);
    public static final String f2110p = Integer.toString(6, 36);
    public static final String f2111q = Integer.toString(7, 36);
    public final long f2112a;
    public final long f2113b;
    public final long f2114c;
    public final long d;
    public final boolean e;
    public final boolean f2115f;
    public final boolean f2116g;
    public final boolean h;

    public e0(d0 d0Var) {
        this.f2112a = e2.m0.h0(d0Var.f2098a);
        this.f2114c = e2.m0.h0(d0Var.f2099b);
        this.f2113b = d0Var.f2098a;
        this.d = d0Var.f2099b;
        this.e = d0Var.f2100c;
        this.f2115f = d0Var.d;
        this.f2116g = d0Var.e;
        this.h = d0Var.f2101f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (this.f2113b == e0Var.f2113b && this.d == e0Var.d && this.e == e0Var.e && this.f2115f == e0Var.f2115f && this.f2116g == e0Var.f2116g && this.h == e0Var.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f2113b;
        long j11 = this.d;
        return (((((((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f2115f ? 1 : 0)) * 31) + (this.f2116g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
