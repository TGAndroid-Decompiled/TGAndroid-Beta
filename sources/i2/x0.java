package i2;

import j$.util.Objects;
import v7.u6;
public final class x0 {
    public final u2.h0 f12647a;
    public final long f12648b;
    public final long f12649c;
    public final long d;
    public final long e;
    public final long f12650f;
    public final boolean f12651g;
    public final boolean h;
    public final boolean f12652i;
    public final boolean f12653j;
    public final boolean f12654k;

    public x0(u2.h0 h0Var, long j10, long j11, long j12, long j13, long j14, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
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
        this.f12647a = h0Var;
        this.f12648b = j10;
        this.f12649c = j11;
        this.d = j12;
        this.e = j13;
        this.f12650f = j14;
        this.f12651g = z10;
        this.h = z11;
        this.f12652i = z12;
        this.f12653j = z13;
        this.f12654k = z14;
    }

    public final x0 a(long j10) {
        if (j10 == this.d) {
            return this;
        }
        return new x0(this.f12647a, this.f12648b, this.f12649c, j10, this.e, this.f12650f, this.f12651g, this.h, this.f12652i, this.f12653j, this.f12654k);
    }

    public final x0 b(long j10, long j11) {
        if (j10 == this.f12648b && j11 == this.f12649c) {
            return this;
        }
        return new x0(this.f12647a, j10, j11, this.d, this.e, this.f12650f, this.f12651g, this.h, this.f12652i, this.f12653j, this.f12654k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x0.class == obj.getClass()) {
            x0 x0Var = (x0) obj;
            if (this.f12648b == x0Var.f12648b && this.d == x0Var.d && this.e == x0Var.e && this.f12650f == x0Var.f12650f && this.f12651g == x0Var.f12651g && this.h == x0Var.h && this.f12652i == x0Var.f12652i && this.f12653j == x0Var.f12653j && this.f12654k == x0Var.f12654k && Objects.equals(this.f12647a, x0Var.f12647a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f12647a.hashCode() + 527) * 31) + ((int) this.f12648b)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + ((int) this.f12650f)) * 31) + (this.f12651g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f12652i ? 1 : 0)) * 31) + (this.f12653j ? 1 : 0)) * 31) + (this.f12654k ? 1 : 0);
    }
}
