package l2;

import a8.ia;
import j$.util.Objects;
public final class y0 {
    public final x2.g0 f18087a;
    public final long f18088b;
    public final long f18089c;
    public final long d;
    public final long f18090e;
    public final long f18091f;
    public final boolean f18092g;
    public final boolean h;
    public final boolean f18093i;
    public final boolean f18094j;
    public final boolean f18095k;

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
        this.f18087a = g0Var;
        this.f18088b = j3;
        this.f18089c = j10;
        this.d = j11;
        this.f18090e = j12;
        this.f18091f = j13;
        this.f18092g = z9;
        this.h = z10;
        this.f18093i = z11;
        this.f18094j = z12;
        this.f18095k = z13;
    }

    public final y0 a(long j3) {
        if (j3 == this.d) {
            return this;
        }
        return new y0(this.f18087a, this.f18088b, this.f18089c, j3, this.f18090e, this.f18091f, this.f18092g, this.h, this.f18093i, this.f18094j, this.f18095k);
    }

    public final y0 b(long j3, long j10) {
        if (j3 == this.f18088b && j10 == this.f18089c) {
            return this;
        }
        return new y0(this.f18087a, j3, j10, this.d, this.f18090e, this.f18091f, this.f18092g, this.h, this.f18093i, this.f18094j, this.f18095k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y0.class == obj.getClass()) {
            y0 y0Var = (y0) obj;
            if (this.f18088b == y0Var.f18088b && this.d == y0Var.d && this.f18090e == y0Var.f18090e && this.f18091f == y0Var.f18091f && this.f18092g == y0Var.f18092g && this.h == y0Var.h && this.f18093i == y0Var.f18093i && this.f18094j == y0Var.f18094j && this.f18095k == y0Var.f18095k && Objects.equals(this.f18087a, y0Var.f18087a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f18087a.hashCode() + 527) * 31) + ((int) this.f18088b)) * 31) + ((int) this.d)) * 31) + ((int) this.f18090e)) * 31) + ((int) this.f18091f)) * 31) + (this.f18092g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f18093i ? 1 : 0)) * 31) + (this.f18094j ? 1 : 0)) * 31) + (this.f18095k ? 1 : 0);
    }
}
