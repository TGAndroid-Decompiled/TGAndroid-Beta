package i2;

import j$.util.Objects;
import v7.u6;
public final class y0 {
    public final u2.g0 f11232a;
    public final long f11233b;
    public final long f11234c;
    public final long d;
    public final long e;
    public final long f11235f;
    public final boolean f11236g;
    public final boolean h;
    public final boolean f11237i;
    public final boolean f11238j;
    public final boolean f11239k;

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
        this.f11232a = g0Var;
        this.f11233b = j10;
        this.f11234c = j11;
        this.d = j12;
        this.e = j13;
        this.f11235f = j14;
        this.f11236g = z10;
        this.h = z11;
        this.f11237i = z12;
        this.f11238j = z13;
        this.f11239k = z14;
    }

    public final y0 a(long j10) {
        if (j10 == this.d) {
            return this;
        }
        return new y0(this.f11232a, this.f11233b, this.f11234c, j10, this.e, this.f11235f, this.f11236g, this.h, this.f11237i, this.f11238j, this.f11239k);
    }

    public final y0 b(long j10, long j11) {
        if (j10 == this.f11233b && j11 == this.f11234c) {
            return this;
        }
        return new y0(this.f11232a, j10, j11, this.d, this.e, this.f11235f, this.f11236g, this.h, this.f11237i, this.f11238j, this.f11239k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y0.class == obj.getClass()) {
            y0 y0Var = (y0) obj;
            if (this.f11233b == y0Var.f11233b && this.d == y0Var.d && this.e == y0Var.e && this.f11235f == y0Var.f11235f && this.f11236g == y0Var.f11236g && this.h == y0Var.h && this.f11237i == y0Var.f11237i && this.f11238j == y0Var.f11238j && this.f11239k == y0Var.f11239k && Objects.equals(this.f11232a, y0Var.f11232a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f11232a.hashCode() + 527) * 31) + ((int) this.f11233b)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + ((int) this.f11235f)) * 31) + (this.f11236g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f11237i ? 1 : 0)) * 31) + (this.f11238j ? 1 : 0)) * 31) + (this.f11239k ? 1 : 0);
    }
}
