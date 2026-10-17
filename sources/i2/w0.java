package i2;

import j$.util.Objects;
import v7.u6;
public final class w0 {
    public final u2.g0 f12616a;
    public final long f12617b;
    public final long f12618c;
    public final long d;
    public final long e;
    public final long f12619f;
    public final boolean f12620g;
    public final boolean h;
    public final boolean f12621i;
    public final boolean f12622j;
    public final boolean f12623k;

    public w0(u2.g0 g0Var, long j10, long j11, long j12, long j13, long j14, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
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
        this.f12616a = g0Var;
        this.f12617b = j10;
        this.f12618c = j11;
        this.d = j12;
        this.e = j13;
        this.f12619f = j14;
        this.f12620g = z10;
        this.h = z11;
        this.f12621i = z12;
        this.f12622j = z13;
        this.f12623k = z14;
    }

    public final w0 a(long j10) {
        if (j10 == this.d) {
            return this;
        }
        return new w0(this.f12616a, this.f12617b, this.f12618c, j10, this.e, this.f12619f, this.f12620g, this.h, this.f12621i, this.f12622j, this.f12623k);
    }

    public final w0 b(long j10, long j11) {
        if (j10 == this.f12617b && j11 == this.f12618c) {
            return this;
        }
        return new w0(this.f12616a, j10, j11, this.d, this.e, this.f12619f, this.f12620g, this.h, this.f12621i, this.f12622j, this.f12623k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w0.class == obj.getClass()) {
            w0 w0Var = (w0) obj;
            if (this.f12617b == w0Var.f12617b && this.d == w0Var.d && this.e == w0Var.e && this.f12619f == w0Var.f12619f && this.f12620g == w0Var.f12620g && this.h == w0Var.h && this.f12621i == w0Var.f12621i && this.f12622j == w0Var.f12622j && this.f12623k == w0Var.f12623k && Objects.equals(this.f12616a, w0Var.f12616a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f12616a.hashCode() + 527) * 31) + ((int) this.f12617b)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + ((int) this.f12619f)) * 31) + (this.f12620g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f12621i ? 1 : 0)) * 31) + (this.f12622j ? 1 : 0)) * 31) + (this.f12623k ? 1 : 0);
    }
}
