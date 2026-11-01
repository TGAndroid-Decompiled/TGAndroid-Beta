package i2;

import j$.util.Objects;
import v7.t6;
public final class z0 {
    public final u2.g0 f8133a;
    public final long f8134b;
    public final long f8135c;
    public final long d;
    public final long e;
    public final long f8136f;
    public final boolean f8137g;
    public final boolean h;
    public final boolean f8138i;
    public final boolean f8139j;
    public final boolean f8140k;

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
        this.f8133a = g0Var;
        this.f8134b = j10;
        this.f8135c = j11;
        this.d = j12;
        this.e = j13;
        this.f8136f = j14;
        this.f8137g = z10;
        this.h = z11;
        this.f8138i = z12;
        this.f8139j = z13;
        this.f8140k = z14;
    }

    public final z0 a(long j10) {
        if (j10 == this.d) {
            return this;
        }
        return new z0(this.f8133a, this.f8134b, this.f8135c, j10, this.e, this.f8136f, this.f8137g, this.h, this.f8138i, this.f8139j, this.f8140k);
    }

    public final z0 b(long j10, long j11) {
        if (j10 == this.f8134b && j11 == this.f8135c) {
            return this;
        }
        return new z0(this.f8133a, j10, j11, this.d, this.e, this.f8136f, this.f8137g, this.h, this.f8138i, this.f8139j, this.f8140k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z0.class == obj.getClass()) {
            z0 z0Var = (z0) obj;
            if (this.f8134b == z0Var.f8134b && this.d == z0Var.d && this.e == z0Var.e && this.f8136f == z0Var.f8136f && this.f8137g == z0Var.f8137g && this.h == z0Var.h && this.f8138i == z0Var.f8138i && this.f8139j == z0Var.f8139j && this.f8140k == z0Var.f8140k && Objects.equals(this.f8133a, z0Var.f8133a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f8133a.hashCode() + 527) * 31) + ((int) this.f8134b)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + ((int) this.f8136f)) * 31) + (this.f8137g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f8138i ? 1 : 0)) * 31) + (this.f8139j ? 1 : 0)) * 31) + (this.f8140k ? 1 : 0);
    }
}
