package i2;

import j$.util.Objects;
import v7.t6;
public final class z0 {
    public final u2.g0 f8132a;
    public final long f8133b;
    public final long f8134c;
    public final long d;
    public final long e;
    public final long f8135f;
    public final boolean f8136g;
    public final boolean h;
    public final boolean f8137i;
    public final boolean f8138j;
    public final boolean f8139k;

    public z0(u2.g0 g0Var, long j10, long j11, long j12, long j13, long j14, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        boolean z16;
        boolean z17 = true;
        if (z14 && !z12) {
            z15 = false;
        } else {
            z15 = true;
        }
        t6.f(z15);
        if (z13 && !z12) {
            z16 = false;
        } else {
            z16 = true;
        }
        t6.f(z16);
        if (z11 && (z12 || z13 || z14)) {
            z17 = false;
        }
        t6.f(z17);
        this.f8132a = g0Var;
        this.f8133b = j10;
        this.f8134c = j11;
        this.d = j12;
        this.e = j13;
        this.f8135f = j14;
        this.f8136g = z10;
        this.h = z11;
        this.f8137i = z12;
        this.f8138j = z13;
        this.f8139k = z14;
    }

    public final z0 a(long j10) {
        if (j10 == this.d) {
            return this;
        }
        return new z0(this.f8132a, this.f8133b, this.f8134c, j10, this.e, this.f8135f, this.f8136g, this.h, this.f8137i, this.f8138j, this.f8139k);
    }

    public final z0 b(long j10, long j11) {
        if (j10 == this.f8133b && j11 == this.f8134c) {
            return this;
        }
        return new z0(this.f8132a, j10, j11, this.d, this.e, this.f8135f, this.f8136g, this.h, this.f8137i, this.f8138j, this.f8139k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z0.class == obj.getClass()) {
            z0 z0Var = (z0) obj;
            if (this.f8133b == z0Var.f8133b && this.d == z0Var.d && this.e == z0Var.e && this.f8135f == z0Var.f8135f && this.f8136g == z0Var.f8136g && this.h == z0Var.h && this.f8137i == z0Var.f8137i && this.f8138j == z0Var.f8138j && this.f8139k == z0Var.f8139k && Objects.equals(this.f8132a, z0Var.f8132a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f8132a.hashCode() + 527) * 31) + ((int) this.f8133b)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + ((int) this.f8135f)) * 31) + (this.f8136g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f8137i ? 1 : 0)) * 31) + (this.f8138j ? 1 : 0)) * 31) + (this.f8139k ? 1 : 0);
    }
}
