package l2;

import a8.la;
import j$.util.Objects;
public final class v0 {
    public final x2.g0 f19564a;
    public final long f19565b;
    public final long f19566c;
    public final long d;
    public final long f19567e;
    public final long f19568f;
    public final boolean f19569g;
    public final boolean h;
    public final boolean f19570i;
    public final boolean f19571j;
    public final boolean f19572k;

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
        this.f19564a = g0Var;
        this.f19565b = j3;
        this.f19566c = j10;
        this.d = j11;
        this.f19567e = j12;
        this.f19568f = j13;
        this.f19569g = z10;
        this.h = z11;
        this.f19570i = z12;
        this.f19571j = z13;
        this.f19572k = z14;
    }

    public final v0 a(long j3) {
        if (j3 == this.d) {
            return this;
        }
        return new v0(this.f19564a, this.f19565b, this.f19566c, j3, this.f19567e, this.f19568f, this.f19569g, this.h, this.f19570i, this.f19571j, this.f19572k);
    }

    public final v0 b(long j3, long j10) {
        if (j3 == this.f19565b && j10 == this.f19566c) {
            return this;
        }
        return new v0(this.f19564a, j3, j10, this.d, this.f19567e, this.f19568f, this.f19569g, this.h, this.f19570i, this.f19571j, this.f19572k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass()) {
            v0 v0Var = (v0) obj;
            if (this.f19565b == v0Var.f19565b && this.d == v0Var.d && this.f19567e == v0Var.f19567e && this.f19568f == v0Var.f19568f && this.f19569g == v0Var.f19569g && this.h == v0Var.h && this.f19570i == v0Var.f19570i && this.f19571j == v0Var.f19571j && this.f19572k == v0Var.f19572k && Objects.equals(this.f19564a, v0Var.f19564a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f19564a.hashCode() + 527) * 31) + ((int) this.f19565b)) * 31) + ((int) this.d)) * 31) + ((int) this.f19567e)) * 31) + ((int) this.f19568f)) * 31) + (this.f19569g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f19570i ? 1 : 0)) * 31) + (this.f19571j ? 1 : 0)) * 31) + (this.f19572k ? 1 : 0);
    }
}
