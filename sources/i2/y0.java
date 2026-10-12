package i2;

import j$.util.Objects;
import v7.u6;
public final class y0 {
    public final u2.g0 f11228a;
    public final long f11229b;
    public final long f11230c;
    public final long d;
    public final long e;
    public final long f11231f;
    public final boolean f11232g;
    public final boolean h;
    public final boolean f11233i;
    public final boolean f11234j;
    public final boolean f11235k;

    public y0(u2.g0 g0Var, long j10, long j11, long j12, long j13, long j14, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        boolean z16;
        boolean z17 = true;
        if (z14 && !z12) {
            z15 = false;
        } else {
            z15 = true;
        }
        u6.g(z15);
        if (z13 && !z12) {
            z16 = false;
        } else {
            z16 = true;
        }
        u6.g(z16);
        if (z11 && (z12 || z13 || z14)) {
            z17 = false;
        }
        u6.g(z17);
        this.f11228a = g0Var;
        this.f11229b = j10;
        this.f11230c = j11;
        this.d = j12;
        this.e = j13;
        this.f11231f = j14;
        this.f11232g = z10;
        this.h = z11;
        this.f11233i = z12;
        this.f11234j = z13;
        this.f11235k = z14;
    }

    public final y0 a(long j10) {
        if (j10 == this.d) {
            return this;
        }
        return new y0(this.f11228a, this.f11229b, this.f11230c, j10, this.e, this.f11231f, this.f11232g, this.h, this.f11233i, this.f11234j, this.f11235k);
    }

    public final y0 b(long j10, long j11) {
        if (j10 == this.f11229b && j11 == this.f11230c) {
            return this;
        }
        return new y0(this.f11228a, j10, j11, this.d, this.e, this.f11231f, this.f11232g, this.h, this.f11233i, this.f11234j, this.f11235k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y0.class == obj.getClass()) {
            y0 y0Var = (y0) obj;
            if (this.f11229b == y0Var.f11229b && this.d == y0Var.d && this.e == y0Var.e && this.f11231f == y0Var.f11231f && this.f11232g == y0Var.f11232g && this.h == y0Var.h && this.f11233i == y0Var.f11233i && this.f11234j == y0Var.f11234j && this.f11235k == y0Var.f11235k && Objects.equals(this.f11228a, y0Var.f11228a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f11228a.hashCode() + 527) * 31) + ((int) this.f11229b)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + ((int) this.f11231f)) * 31) + (this.f11232g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f11233i ? 1 : 0)) * 31) + (this.f11234j ? 1 : 0)) * 31) + (this.f11235k ? 1 : 0);
    }
}
