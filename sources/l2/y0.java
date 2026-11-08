package l2;

import a8.ia;
import j$.util.Objects;
public final class y0 {
    public final x2.g0 f18090a;
    public final long f18091b;
    public final long f18092c;
    public final long d;
    public final long f18093e;
    public final long f18094f;
    public final boolean f18095g;
    public final boolean h;
    public final boolean f18096i;
    public final boolean f18097j;
    public final boolean f18098k;

    public y0(x2.g0 g0Var, long j3, long j10, long j11, long j12, long j13, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        boolean z15;
        boolean z16 = true;
        if (z13 && !z11) {
            z14 = false;
        } else {
            z14 = true;
        }
        ia.f(z14);
        if (z12 && !z11) {
            z15 = false;
        } else {
            z15 = true;
        }
        ia.f(z15);
        if (z10 && (z11 || z12 || z13)) {
            z16 = false;
        }
        ia.f(z16);
        this.f18090a = g0Var;
        this.f18091b = j3;
        this.f18092c = j10;
        this.d = j11;
        this.f18093e = j12;
        this.f18094f = j13;
        this.f18095g = z9;
        this.h = z10;
        this.f18096i = z11;
        this.f18097j = z12;
        this.f18098k = z13;
    }

    public final y0 a(long j3) {
        if (j3 == this.d) {
            return this;
        }
        return new y0(this.f18090a, this.f18091b, this.f18092c, j3, this.f18093e, this.f18094f, this.f18095g, this.h, this.f18096i, this.f18097j, this.f18098k);
    }

    public final y0 b(long j3, long j10) {
        if (j3 == this.f18091b && j10 == this.f18092c) {
            return this;
        }
        return new y0(this.f18090a, j3, j10, this.d, this.f18093e, this.f18094f, this.f18095g, this.h, this.f18096i, this.f18097j, this.f18098k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y0.class == obj.getClass()) {
            y0 y0Var = (y0) obj;
            if (this.f18091b == y0Var.f18091b && this.d == y0Var.d && this.f18093e == y0Var.f18093e && this.f18094f == y0Var.f18094f && this.f18095g == y0Var.f18095g && this.h == y0Var.h && this.f18096i == y0Var.f18096i && this.f18097j == y0Var.f18097j && this.f18098k == y0Var.f18098k && Objects.equals(this.f18090a, y0Var.f18090a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f18090a.hashCode() + 527) * 31) + ((int) this.f18091b)) * 31) + ((int) this.d)) * 31) + ((int) this.f18093e)) * 31) + ((int) this.f18094f)) * 31) + (this.f18095g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f18096i ? 1 : 0)) * 31) + (this.f18097j ? 1 : 0)) * 31) + (this.f18098k ? 1 : 0);
    }
}
