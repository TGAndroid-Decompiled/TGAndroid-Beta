package i2;

import j$.util.Objects;
import v7.u6;
public final class x0 {
    public final u2.f0 f12617a;
    public final long f12618b;
    public final long f12619c;
    public final long d;
    public final long e;
    public final long f12620f;
    public final boolean f12621g;
    public final boolean h;
    public final boolean f12622i;
    public final boolean f12623j;
    public final boolean f12624k;

    public x0(u2.f0 f0Var, long j10, long j11, long j12, long j13, long j14, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
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
        this.f12617a = f0Var;
        this.f12618b = j10;
        this.f12619c = j11;
        this.d = j12;
        this.e = j13;
        this.f12620f = j14;
        this.f12621g = z10;
        this.h = z11;
        this.f12622i = z12;
        this.f12623j = z13;
        this.f12624k = z14;
    }

    public final x0 a(long j10) {
        if (j10 == this.d) {
            return this;
        }
        return new x0(this.f12617a, this.f12618b, this.f12619c, j10, this.e, this.f12620f, this.f12621g, this.h, this.f12622i, this.f12623j, this.f12624k);
    }

    public final x0 b(long j10, long j11) {
        if (j10 == this.f12618b && j11 == this.f12619c) {
            return this;
        }
        return new x0(this.f12617a, j10, j11, this.d, this.e, this.f12620f, this.f12621g, this.h, this.f12622i, this.f12623j, this.f12624k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x0.class == obj.getClass()) {
            x0 x0Var = (x0) obj;
            if (this.f12618b == x0Var.f12618b && this.d == x0Var.d && this.e == x0Var.e && this.f12620f == x0Var.f12620f && this.f12621g == x0Var.f12621g && this.h == x0Var.h && this.f12622i == x0Var.f12622i && this.f12623j == x0Var.f12623j && this.f12624k == x0Var.f12624k && Objects.equals(this.f12617a, x0Var.f12617a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f12617a.hashCode() + 527) * 31) + ((int) this.f12618b)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + ((int) this.f12620f)) * 31) + (this.f12621g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f12622i ? 1 : 0)) * 31) + (this.f12623j ? 1 : 0)) * 31) + (this.f12624k ? 1 : 0);
    }
}
