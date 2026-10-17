package b2;
public class d0 {
    public static final d0 f3712i = new d0(new c0());
    public static final String f3713j = Integer.toString(0, 36);
    public static final String f3714k = Integer.toString(1, 36);
    public static final String f3715l = Integer.toString(2, 36);
    public static final String f3716m = Integer.toString(3, 36);
    public static final String f3717n = Integer.toString(4, 36);
    public static final String f3718o = Integer.toString(5, 36);
    public static final String f3719p = Integer.toString(6, 36);
    public static final String f3720q = Integer.toString(7, 36);
    public final long f3721a;
    public final long f3722b;
    public final long f3723c;
    public final long d;
    public final boolean e;
    public final boolean f3724f;
    public final boolean f3725g;
    public final boolean h;

    public d0(c0 c0Var) {
        this.f3721a = e2.m0.h0(c0Var.f3707a);
        this.f3723c = e2.m0.h0(c0Var.f3708b);
        this.f3722b = c0Var.f3707a;
        this.d = c0Var.f3708b;
        this.e = c0Var.f3709c;
        this.f3724f = c0Var.d;
        this.f3725g = c0Var.e;
        this.h = c0Var.f3710f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (this.f3722b == d0Var.f3722b && this.d == d0Var.d && this.e == d0Var.e && this.f3724f == d0Var.f3724f && this.f3725g == d0Var.f3725g && this.h == d0Var.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f3722b;
        long j11 = this.d;
        return (((((((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f3724f ? 1 : 0)) * 31) + (this.f3725g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
