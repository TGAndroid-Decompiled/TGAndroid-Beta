package i2;

import j$.util.Objects;
import v7.u6;
public final class y0 {
    public final u2.g0 f12620a;
    public final long f12621b;
    public final long f12622c;
    public final long d;
    public final long e;
    public final long f12623f;
    public final boolean f12624g;
    public final boolean h;
    public final boolean f12625i;
    public final boolean f12626j;
    public final boolean f12627k;

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
        this.f12620a = g0Var;
        this.f12621b = j10;
        this.f12622c = j11;
        this.d = j12;
        this.e = j13;
        this.f12623f = j14;
        this.f12624g = z10;
        this.h = z11;
        this.f12625i = z12;
        this.f12626j = z13;
        this.f12627k = z14;
    }

    public final y0 a(long j10) {
        if (j10 == this.d) {
            return this;
        }
        return new y0(this.f12620a, this.f12621b, this.f12622c, j10, this.e, this.f12623f, this.f12624g, this.h, this.f12625i, this.f12626j, this.f12627k);
    }

    public final y0 b(long j10, long j11) {
        if (j10 == this.f12621b && j11 == this.f12622c) {
            return this;
        }
        return new y0(this.f12620a, j10, j11, this.d, this.e, this.f12623f, this.f12624g, this.h, this.f12625i, this.f12626j, this.f12627k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y0.class == obj.getClass()) {
            y0 y0Var = (y0) obj;
            if (this.f12621b == y0Var.f12621b && this.d == y0Var.d && this.e == y0Var.e && this.f12623f == y0Var.f12623f && this.f12624g == y0Var.f12624g && this.h == y0Var.h && this.f12625i == y0Var.f12625i && this.f12626j == y0Var.f12626j && this.f12627k == y0Var.f12627k && Objects.equals(this.f12620a, y0Var.f12620a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f12620a.hashCode() + 527) * 31) + ((int) this.f12621b)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + ((int) this.f12623f)) * 31) + (this.f12624g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f12625i ? 1 : 0)) * 31) + (this.f12626j ? 1 : 0)) * 31) + (this.f12627k ? 1 : 0);
    }
}
