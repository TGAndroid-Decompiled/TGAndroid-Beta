package i2;

import a8.yb;
import j$.util.Objects;
public final class z0 {
    public final u2.g0 f13805a;
    public final long f13806b;
    public final long f13807c;
    public final long d;
    public final long e;
    public final long f13808f;
    public final boolean f13809g;
    public final boolean h;
    public final boolean f13810i;
    public final boolean f13811j;
    public final boolean f13812k;

    public z0(u2.g0 g0Var, long j10, long j11, long j12, long j13, long j14, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        boolean z16;
        boolean z17 = true;
        if (z14 && !z12) {
            z15 = false;
        } else {
            z15 = true;
        }
        yb.g(z15);
        if (z13 && !z12) {
            z16 = false;
        } else {
            z16 = true;
        }
        yb.g(z16);
        if (z11 && (z12 || z13 || z14)) {
            z17 = false;
        }
        yb.g(z17);
        this.f13805a = g0Var;
        this.f13806b = j10;
        this.f13807c = j11;
        this.d = j12;
        this.e = j13;
        this.f13808f = j14;
        this.f13809g = z10;
        this.h = z11;
        this.f13810i = z12;
        this.f13811j = z13;
        this.f13812k = z14;
    }

    public final z0 a(long j10) {
        if (j10 == this.d) {
            return this;
        }
        return new z0(this.f13805a, this.f13806b, this.f13807c, j10, this.e, this.f13808f, this.f13809g, this.h, this.f13810i, this.f13811j, this.f13812k);
    }

    public final z0 b(long j10, long j11) {
        if (j10 == this.f13806b && j11 == this.f13807c) {
            return this;
        }
        return new z0(this.f13805a, j10, j11, this.d, this.e, this.f13808f, this.f13809g, this.h, this.f13810i, this.f13811j, this.f13812k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z0.class == obj.getClass()) {
            z0 z0Var = (z0) obj;
            if (this.f13806b == z0Var.f13806b && this.d == z0Var.d && this.e == z0Var.e && this.f13808f == z0Var.f13808f && this.f13809g == z0Var.f13809g && this.h == z0Var.h && this.f13810i == z0Var.f13810i && this.f13811j == z0Var.f13811j && this.f13812k == z0Var.f13812k && Objects.equals(this.f13805a, z0Var.f13805a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f13805a.hashCode() + 527) * 31) + ((int) this.f13806b)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + ((int) this.f13808f)) * 31) + (this.f13809g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f13810i ? 1 : 0)) * 31) + (this.f13811j ? 1 : 0)) * 31) + (this.f13812k ? 1 : 0);
    }
}
