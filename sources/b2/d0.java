package b2;
public class d0 {
    public static final d0 f3713i = new d0(new c0());
    public static final String f3714j = Integer.toString(0, 36);
    public static final String f3715k = Integer.toString(1, 36);
    public static final String f3716l = Integer.toString(2, 36);
    public static final String f3717m = Integer.toString(3, 36);
    public static final String f3718n = Integer.toString(4, 36);
    public static final String f3719o = Integer.toString(5, 36);
    public static final String f3720p = Integer.toString(6, 36);
    public static final String f3721q = Integer.toString(7, 36);
    public final long f3722a;
    public final long f3723b;
    public final long f3724c;
    public final long d;
    public final boolean e;
    public final boolean f3725f;
    public final boolean f3726g;
    public final boolean h;

    public d0(c0 c0Var) {
        this.f3722a = e2.m0.h0(c0Var.f3708a);
        this.f3724c = e2.m0.h0(c0Var.f3709b);
        this.f3723b = c0Var.f3708a;
        this.d = c0Var.f3709b;
        this.e = c0Var.f3710c;
        this.f3725f = c0Var.d;
        this.f3726g = c0Var.e;
        this.h = c0Var.f3711f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (this.f3723b == d0Var.f3723b && this.d == d0Var.d && this.e == d0Var.e && this.f3725f == d0Var.f3725f && this.f3726g == d0Var.f3726g && this.h == d0Var.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f3723b;
        long j11 = this.d;
        return (((((((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f3725f ? 1 : 0)) * 31) + (this.f3726g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
