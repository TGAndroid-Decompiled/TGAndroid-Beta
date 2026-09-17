package i2;

import j$.util.Objects;
public final class u0 {
    public final u2.f0 f11775a;
    public final long f11776b;
    public final long f11777c;
    public final long d;
    public final long f11778e;
    public final boolean f11779f;
    public final boolean f11780g;
    public final boolean h;
    public final boolean f11781i;
    public final boolean f11782j;

    public u0(u2.f0 f0Var, long j3, long j10, long j11, long j12, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        boolean z16;
        boolean z17 = true;
        if (z14 && !z12) {
            z15 = false;
        } else {
            z15 = true;
        }
        e2.d.b(z15);
        if (z13 && !z12) {
            z16 = false;
        } else {
            z16 = true;
        }
        e2.d.b(z16);
        if (z11 && (z12 || z13 || z14)) {
            z17 = false;
        }
        e2.d.b(z17);
        this.f11775a = f0Var;
        this.f11776b = j3;
        this.f11777c = j10;
        this.d = j11;
        this.f11778e = j12;
        this.f11779f = z10;
        this.f11780g = z11;
        this.h = z12;
        this.f11781i = z13;
        this.f11782j = z14;
    }

    public final u0 a(long j3) {
        if (j3 == this.f11777c) {
            return this;
        }
        return new u0(this.f11775a, this.f11776b, j3, this.d, this.f11778e, this.f11779f, this.f11780g, this.h, this.f11781i, this.f11782j);
    }

    public final u0 b(long j3) {
        if (j3 == this.f11776b) {
            return this;
        }
        return new u0(this.f11775a, j3, this.f11777c, this.d, this.f11778e, this.f11779f, this.f11780g, this.h, this.f11781i, this.f11782j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u0.class == obj.getClass()) {
            u0 u0Var = (u0) obj;
            if (this.f11776b == u0Var.f11776b && this.f11777c == u0Var.f11777c && this.d == u0Var.d && this.f11778e == u0Var.f11778e && this.f11779f == u0Var.f11779f && this.f11780g == u0Var.f11780g && this.h == u0Var.h && this.f11781i == u0Var.f11781i && this.f11782j == u0Var.f11782j && Objects.equals(this.f11775a, u0Var.f11775a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f11775a.hashCode() + 527) * 31) + ((int) this.f11776b)) * 31) + ((int) this.f11777c)) * 31) + ((int) this.d)) * 31) + ((int) this.f11778e)) * 31) + (this.f11779f ? 1 : 0)) * 31) + (this.f11780g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f11781i ? 1 : 0)) * 31) + (this.f11782j ? 1 : 0);
    }
}
