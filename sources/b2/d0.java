package b2;
public class d0 {
    public static final d0 f3716i = new d0(new c0());
    public static final String f3717j = Integer.toString(0, 36);
    public static final String f3718k = Integer.toString(1, 36);
    public static final String f3719l = Integer.toString(2, 36);
    public static final String f3720m = Integer.toString(3, 36);
    public static final String f3721n = Integer.toString(4, 36);
    public static final String f3722o = Integer.toString(5, 36);
    public static final String f3723p = Integer.toString(6, 36);
    public static final String f3724q = Integer.toString(7, 36);
    public final long f3725a;
    public final long f3726b;
    public final long f3727c;
    public final long d;
    public final boolean e;
    public final boolean f3728f;
    public final boolean f3729g;
    public final boolean h;

    public d0(c0 c0Var) {
        this.f3725a = e2.m0.h0(c0Var.f3711a);
        this.f3727c = e2.m0.h0(c0Var.f3712b);
        this.f3726b = c0Var.f3711a;
        this.d = c0Var.f3712b;
        this.e = c0Var.f3713c;
        this.f3728f = c0Var.d;
        this.f3729g = c0Var.e;
        this.h = c0Var.f3714f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (this.f3726b == d0Var.f3726b && this.d == d0Var.d && this.e == d0Var.e && this.f3728f == d0Var.f3728f && this.f3729g == d0Var.f3729g && this.h == d0Var.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f3726b;
        long j11 = this.d;
        return (((((((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f3728f ? 1 : 0)) * 31) + (this.f3729g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
