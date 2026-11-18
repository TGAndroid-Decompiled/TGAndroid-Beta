package l2;

import a8.la;
import j$.util.Objects;
public final class v0 {
    public final x2.g0 f19567a;
    public final long f19568b;
    public final long f19569c;
    public final long d;
    public final long f19570e;
    public final long f19571f;
    public final boolean f19572g;
    public final boolean h;
    public final boolean f19573i;
    public final boolean f19574j;
    public final boolean f19575k;

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
        this.f19567a = g0Var;
        this.f19568b = j3;
        this.f19569c = j10;
        this.d = j11;
        this.f19570e = j12;
        this.f19571f = j13;
        this.f19572g = z10;
        this.h = z11;
        this.f19573i = z12;
        this.f19574j = z13;
        this.f19575k = z14;
    }

    public final v0 a(long j3) {
        if (j3 == this.d) {
            return this;
        }
        return new v0(this.f19567a, this.f19568b, this.f19569c, j3, this.f19570e, this.f19571f, this.f19572g, this.h, this.f19573i, this.f19574j, this.f19575k);
    }

    public final v0 b(long j3, long j10) {
        if (j3 == this.f19568b && j10 == this.f19569c) {
            return this;
        }
        return new v0(this.f19567a, j3, j10, this.d, this.f19570e, this.f19571f, this.f19572g, this.h, this.f19573i, this.f19574j, this.f19575k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass()) {
            v0 v0Var = (v0) obj;
            if (this.f19568b == v0Var.f19568b && this.d == v0Var.d && this.f19570e == v0Var.f19570e && this.f19571f == v0Var.f19571f && this.f19572g == v0Var.f19572g && this.h == v0Var.h && this.f19573i == v0Var.f19573i && this.f19574j == v0Var.f19574j && this.f19575k == v0Var.f19575k && Objects.equals(this.f19567a, v0Var.f19567a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f19567a.hashCode() + 527) * 31) + ((int) this.f19568b)) * 31) + ((int) this.d)) * 31) + ((int) this.f19570e)) * 31) + ((int) this.f19571f)) * 31) + (this.f19572g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f19573i ? 1 : 0)) * 31) + (this.f19574j ? 1 : 0)) * 31) + (this.f19575k ? 1 : 0);
    }
}
