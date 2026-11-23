package l2;

import a8.la;
import j$.util.Objects;
public final class v0 {
    public final x2.g0 f19595a;
    public final long f19596b;
    public final long f19597c;
    public final long d;
    public final long f19598e;
    public final long f19599f;
    public final boolean f19600g;
    public final boolean h;
    public final boolean f19601i;
    public final boolean f19602j;
    public final boolean f19603k;

    public v0(x2.g0 g0Var, long j3, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        boolean z16;
        boolean z17 = true;
        if (z14 && !z12) {
            z15 = false;
        } else {
            z15 = true;
        }
        la.f(z15);
        if (z13 && !z12) {
            z16 = false;
        } else {
            z16 = true;
        }
        la.f(z16);
        if (z11 && (z12 || z13 || z14)) {
            z17 = false;
        }
        la.f(z17);
        this.f19595a = g0Var;
        this.f19596b = j3;
        this.f19597c = j10;
        this.d = j11;
        this.f19598e = j12;
        this.f19599f = j13;
        this.f19600g = z10;
        this.h = z11;
        this.f19601i = z12;
        this.f19602j = z13;
        this.f19603k = z14;
    }

    public final v0 a(long j3) {
        if (j3 == this.d) {
            return this;
        }
        return new v0(this.f19595a, this.f19596b, this.f19597c, j3, this.f19598e, this.f19599f, this.f19600g, this.h, this.f19601i, this.f19602j, this.f19603k);
    }

    public final v0 b(long j3, long j10) {
        if (j3 == this.f19596b && j10 == this.f19597c) {
            return this;
        }
        return new v0(this.f19595a, j3, j10, this.d, this.f19598e, this.f19599f, this.f19600g, this.h, this.f19601i, this.f19602j, this.f19603k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass()) {
            v0 v0Var = (v0) obj;
            if (this.f19596b == v0Var.f19596b && this.d == v0Var.d && this.f19598e == v0Var.f19598e && this.f19599f == v0Var.f19599f && this.f19600g == v0Var.f19600g && this.h == v0Var.h && this.f19601i == v0Var.f19601i && this.f19602j == v0Var.f19602j && this.f19603k == v0Var.f19603k && Objects.equals(this.f19595a, v0Var.f19595a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f19595a.hashCode() + 527) * 31) + ((int) this.f19596b)) * 31) + ((int) this.d)) * 31) + ((int) this.f19598e)) * 31) + ((int) this.f19599f)) * 31) + (this.f19600g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f19601i ? 1 : 0)) * 31) + (this.f19602j ? 1 : 0)) * 31) + (this.f19603k ? 1 : 0);
    }
}
