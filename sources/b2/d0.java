package b2;
public class d0 {
    public static final d0 f3709i = new d0(new c0());
    public static final String f3710j = Integer.toString(0, 36);
    public static final String f3711k = Integer.toString(1, 36);
    public static final String f3712l = Integer.toString(2, 36);
    public static final String f3713m = Integer.toString(3, 36);
    public static final String f3714n = Integer.toString(4, 36);
    public static final String f3715o = Integer.toString(5, 36);
    public static final String f3716p = Integer.toString(6, 36);
    public static final String f3717q = Integer.toString(7, 36);
    public final long f3718a;
    public final long f3719b;
    public final long f3720c;
    public final long d;
    public final boolean e;
    public final boolean f3721f;
    public final boolean f3722g;
    public final boolean h;

    public d0(c0 c0Var) {
        this.f3718a = e2.m0.h0(c0Var.f3704a);
        this.f3720c = e2.m0.h0(c0Var.f3705b);
        this.f3719b = c0Var.f3704a;
        this.d = c0Var.f3705b;
        this.e = c0Var.f3706c;
        this.f3721f = c0Var.d;
        this.f3722g = c0Var.e;
        this.h = c0Var.f3707f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (this.f3719b == d0Var.f3719b && this.d == d0Var.d && this.e == d0Var.e && this.f3721f == d0Var.f3721f && this.f3722g == d0Var.f3722g && this.h == d0Var.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f3719b;
        long j11 = this.d;
        return (((((((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f3721f ? 1 : 0)) * 31) + (this.f3722g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
