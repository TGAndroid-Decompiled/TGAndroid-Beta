package l2;

import a8.ia;
import j$.util.Objects;
public final class y0 {
    public final x2.f0 f18091a;
    public final long f18092b;
    public final long f18093c;
    public final long d;
    public final long f18094e;
    public final long f18095f;
    public final boolean f18096g;
    public final boolean h;
    public final boolean f18097i;
    public final boolean f18098j;
    public final boolean f18099k;

    public y0(x2.f0 f0Var, long j3, long j10, long j11, long j12, long j13, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
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
        this.f18091a = f0Var;
        this.f18092b = j3;
        this.f18093c = j10;
        this.d = j11;
        this.f18094e = j12;
        this.f18095f = j13;
        this.f18096g = z9;
        this.h = z10;
        this.f18097i = z11;
        this.f18098j = z12;
        this.f18099k = z13;
    }

    public final y0 a(long j3) {
        if (j3 == this.d) {
            return this;
        }
        return new y0(this.f18091a, this.f18092b, this.f18093c, j3, this.f18094e, this.f18095f, this.f18096g, this.h, this.f18097i, this.f18098j, this.f18099k);
    }

    public final y0 b(long j3, long j10) {
        if (j3 == this.f18092b && j10 == this.f18093c) {
            return this;
        }
        return new y0(this.f18091a, j3, j10, this.d, this.f18094e, this.f18095f, this.f18096g, this.h, this.f18097i, this.f18098j, this.f18099k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y0.class == obj.getClass()) {
            y0 y0Var = (y0) obj;
            if (this.f18092b == y0Var.f18092b && this.d == y0Var.d && this.f18094e == y0Var.f18094e && this.f18095f == y0Var.f18095f && this.f18096g == y0Var.f18096g && this.h == y0Var.h && this.f18097i == y0Var.f18097i && this.f18098j == y0Var.f18098j && this.f18099k == y0Var.f18099k && Objects.equals(this.f18091a, y0Var.f18091a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f18091a.hashCode() + 527) * 31) + ((int) this.f18092b)) * 31) + ((int) this.d)) * 31) + ((int) this.f18094e)) * 31) + ((int) this.f18095f)) * 31) + (this.f18096g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f18097i ? 1 : 0)) * 31) + (this.f18098j ? 1 : 0)) * 31) + (this.f18099k ? 1 : 0);
    }
}
