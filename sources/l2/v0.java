package l2;

import a8.la;
import j$.util.Objects;
public final class v0 {
    public final x2.g0 f19592a;
    public final long f19593b;
    public final long f19594c;
    public final long d;
    public final long f19595e;
    public final long f19596f;
    public final boolean f19597g;
    public final boolean h;
    public final boolean f19598i;
    public final boolean f19599j;
    public final boolean f19600k;

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
        this.f19592a = g0Var;
        this.f19593b = j3;
        this.f19594c = j10;
        this.d = j11;
        this.f19595e = j12;
        this.f19596f = j13;
        this.f19597g = z10;
        this.h = z11;
        this.f19598i = z12;
        this.f19599j = z13;
        this.f19600k = z14;
    }

    public final v0 a(long j3) {
        if (j3 == this.d) {
            return this;
        }
        return new v0(this.f19592a, this.f19593b, this.f19594c, j3, this.f19595e, this.f19596f, this.f19597g, this.h, this.f19598i, this.f19599j, this.f19600k);
    }

    public final v0 b(long j3, long j10) {
        if (j3 == this.f19593b && j10 == this.f19594c) {
            return this;
        }
        return new v0(this.f19592a, j3, j10, this.d, this.f19595e, this.f19596f, this.f19597g, this.h, this.f19598i, this.f19599j, this.f19600k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass()) {
            v0 v0Var = (v0) obj;
            if (this.f19593b == v0Var.f19593b && this.d == v0Var.d && this.f19595e == v0Var.f19595e && this.f19596f == v0Var.f19596f && this.f19597g == v0Var.f19597g && this.h == v0Var.h && this.f19598i == v0Var.f19598i && this.f19599j == v0Var.f19599j && this.f19600k == v0Var.f19600k && Objects.equals(this.f19592a, v0Var.f19592a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f19592a.hashCode() + 527) * 31) + ((int) this.f19593b)) * 31) + ((int) this.d)) * 31) + ((int) this.f19595e)) * 31) + ((int) this.f19596f)) * 31) + (this.f19597g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f19598i ? 1 : 0)) * 31) + (this.f19599j ? 1 : 0)) * 31) + (this.f19600k ? 1 : 0);
    }
}
