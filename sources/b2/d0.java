package b2;
public class d0 {
    public static final d0 f3711i = new d0(new c0());
    public static final String f3712j = Integer.toString(0, 36);
    public static final String f3713k = Integer.toString(1, 36);
    public static final String f3714l = Integer.toString(2, 36);
    public static final String f3715m = Integer.toString(3, 36);
    public static final String f3716n = Integer.toString(4, 36);
    public static final String f3717o = Integer.toString(5, 36);
    public static final String f3718p = Integer.toString(6, 36);
    public static final String f3719q = Integer.toString(7, 36);
    public final long f3720a;
    public final long f3721b;
    public final long f3722c;
    public final long d;
    public final boolean e;
    public final boolean f3723f;
    public final boolean f3724g;
    public final boolean h;

    public d0(c0 c0Var) {
        this.f3720a = e2.m0.h0(c0Var.f3706a);
        this.f3722c = e2.m0.h0(c0Var.f3707b);
        this.f3721b = c0Var.f3706a;
        this.d = c0Var.f3707b;
        this.e = c0Var.f3708c;
        this.f3723f = c0Var.d;
        this.f3724g = c0Var.e;
        this.h = c0Var.f3709f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (this.f3721b == d0Var.f3721b && this.d == d0Var.d && this.e == d0Var.e && this.f3723f == d0Var.f3723f && this.f3724g == d0Var.f3724g && this.h == d0Var.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f3721b;
        long j11 = this.d;
        return (((((((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f3723f ? 1 : 0)) * 31) + (this.f3724g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
