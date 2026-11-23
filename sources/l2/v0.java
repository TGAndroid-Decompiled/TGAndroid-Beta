package l2;

import a8.ma;
import j$.util.Objects;
public final class v0 {
    public final x2.g0 f19561a;
    public final long f19562b;
    public final long f19563c;
    public final long d;
    public final long f19564e;
    public final long f19565f;
    public final boolean f19566g;
    public final boolean h;
    public final boolean f19567i;
    public final boolean f19568j;
    public final boolean f19569k;

    public v0(x2.g0 g0Var, long j3, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        boolean z16;
        boolean z17 = true;
        if (z14 && !z12) {
            z15 = false;
        } else {
            z15 = true;
        }
        ma.f(z15);
        if (z13 && !z12) {
            z16 = false;
        } else {
            z16 = true;
        }
        ma.f(z16);
        if (z11 && (z12 || z13 || z14)) {
            z17 = false;
        }
        ma.f(z17);
        this.f19561a = g0Var;
        this.f19562b = j3;
        this.f19563c = j10;
        this.d = j11;
        this.f19564e = j12;
        this.f19565f = j13;
        this.f19566g = z10;
        this.h = z11;
        this.f19567i = z12;
        this.f19568j = z13;
        this.f19569k = z14;
    }

    public final v0 a(long j3) {
        if (j3 == this.d) {
            return this;
        }
        return new v0(this.f19561a, this.f19562b, this.f19563c, j3, this.f19564e, this.f19565f, this.f19566g, this.h, this.f19567i, this.f19568j, this.f19569k);
    }

    public final v0 b(long j3, long j10) {
        if (j3 == this.f19562b && j10 == this.f19563c) {
            return this;
        }
        return new v0(this.f19561a, j3, j10, this.d, this.f19564e, this.f19565f, this.f19566g, this.h, this.f19567i, this.f19568j, this.f19569k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass()) {
            v0 v0Var = (v0) obj;
            if (this.f19562b == v0Var.f19562b && this.d == v0Var.d && this.f19564e == v0Var.f19564e && this.f19565f == v0Var.f19565f && this.f19566g == v0Var.f19566g && this.h == v0Var.h && this.f19567i == v0Var.f19567i && this.f19568j == v0Var.f19568j && this.f19569k == v0Var.f19569k && Objects.equals(this.f19561a, v0Var.f19561a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f19561a.hashCode() + 527) * 31) + ((int) this.f19562b)) * 31) + ((int) this.d)) * 31) + ((int) this.f19564e)) * 31) + ((int) this.f19565f)) * 31) + (this.f19566g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f19567i ? 1 : 0)) * 31) + (this.f19568j ? 1 : 0)) * 31) + (this.f19569k ? 1 : 0);
    }
}
