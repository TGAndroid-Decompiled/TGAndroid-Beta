package b2;
public class e0 {
    public static final e0 f2099i = new e0(new d0());
    public static final String f2100j = Integer.toString(0, 36);
    public static final String f2101k = Integer.toString(1, 36);
    public static final String f2102l = Integer.toString(2, 36);
    public static final String f2103m = Integer.toString(3, 36);
    public static final String f2104n = Integer.toString(4, 36);
    public static final String f2105o = Integer.toString(5, 36);
    public static final String f2106p = Integer.toString(6, 36);
    public static final String f2107q = Integer.toString(7, 36);
    public final long f2108a;
    public final long f2109b;
    public final long f2110c;
    public final long d;
    public final boolean e;
    public final boolean f2111f;
    public final boolean f2112g;
    public final boolean h;

    public e0(d0 d0Var) {
        this.f2108a = e2.m0.h0(d0Var.f2094a);
        this.f2110c = e2.m0.h0(d0Var.f2095b);
        this.f2109b = d0Var.f2094a;
        this.d = d0Var.f2095b;
        this.e = d0Var.f2096c;
        this.f2111f = d0Var.d;
        this.f2112g = d0Var.e;
        this.h = d0Var.f2097f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (this.f2109b == e0Var.f2109b && this.d == e0Var.d && this.e == e0Var.e && this.f2111f == e0Var.f2111f && this.f2112g == e0Var.f2112g && this.h == e0Var.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f2109b;
        long j11 = this.d;
        return (((((((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f2111f ? 1 : 0)) * 31) + (this.f2112g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
