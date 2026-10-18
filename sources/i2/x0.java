package i2;

import j$.util.Objects;
import v7.u6;
public final class x0 {
    public final u2.g0 f12615a;
    public final long f12616b;
    public final long f12617c;
    public final long d;
    public final long e;
    public final long f12618f;
    public final boolean f12619g;
    public final boolean h;
    public final boolean f12620i;
    public final boolean f12621j;
    public final boolean f12622k;

    public x0(u2.g0 g0Var, long j10, long j11, long j12, long j13, long j14, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
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
        this.f12615a = g0Var;
        this.f12616b = j10;
        this.f12617c = j11;
        this.d = j12;
        this.e = j13;
        this.f12618f = j14;
        this.f12619g = z10;
        this.h = z11;
        this.f12620i = z12;
        this.f12621j = z13;
        this.f12622k = z14;
    }

    public final x0 a(long j10) {
        if (j10 == this.d) {
            return this;
        }
        return new x0(this.f12615a, this.f12616b, this.f12617c, j10, this.e, this.f12618f, this.f12619g, this.h, this.f12620i, this.f12621j, this.f12622k);
    }

    public final x0 b(long j10, long j11) {
        if (j10 == this.f12616b && j11 == this.f12617c) {
            return this;
        }
        return new x0(this.f12615a, j10, j11, this.d, this.e, this.f12618f, this.f12619g, this.h, this.f12620i, this.f12621j, this.f12622k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x0.class == obj.getClass()) {
            x0 x0Var = (x0) obj;
            if (this.f12616b == x0Var.f12616b && this.d == x0Var.d && this.e == x0Var.e && this.f12618f == x0Var.f12618f && this.f12619g == x0Var.f12619g && this.h == x0Var.h && this.f12620i == x0Var.f12620i && this.f12621j == x0Var.f12621j && this.f12622k == x0Var.f12622k && Objects.equals(this.f12615a, x0Var.f12615a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f12615a.hashCode() + 527) * 31) + ((int) this.f12616b)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + ((int) this.f12618f)) * 31) + (this.f12619g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f12620i ? 1 : 0)) * 31) + (this.f12621j ? 1 : 0)) * 31) + (this.f12622k ? 1 : 0);
    }
}
