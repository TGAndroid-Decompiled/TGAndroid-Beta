package l2;

import a8.ia;
import j$.util.Objects;
public final class y0 {
    public final x2.g0 f18088a;
    public final long f18089b;
    public final long f18090c;
    public final long d;
    public final long f18091e;
    public final long f18092f;
    public final boolean f18093g;
    public final boolean h;
    public final boolean f18094i;
    public final boolean f18095j;
    public final boolean f18096k;

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
        this.f18088a = g0Var;
        this.f18089b = j3;
        this.f18090c = j10;
        this.d = j11;
        this.f18091e = j12;
        this.f18092f = j13;
        this.f18093g = z9;
        this.h = z10;
        this.f18094i = z11;
        this.f18095j = z12;
        this.f18096k = z13;
    }

    public final y0 a(long j3) {
        if (j3 == this.d) {
            return this;
        }
        return new y0(this.f18088a, this.f18089b, this.f18090c, j3, this.f18091e, this.f18092f, this.f18093g, this.h, this.f18094i, this.f18095j, this.f18096k);
    }

    public final y0 b(long j3, long j10) {
        if (j3 == this.f18089b && j10 == this.f18090c) {
            return this;
        }
        return new y0(this.f18088a, j3, j10, this.d, this.f18091e, this.f18092f, this.f18093g, this.h, this.f18094i, this.f18095j, this.f18096k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y0.class == obj.getClass()) {
            y0 y0Var = (y0) obj;
            if (this.f18089b == y0Var.f18089b && this.d == y0Var.d && this.f18091e == y0Var.f18091e && this.f18092f == y0Var.f18092f && this.f18093g == y0Var.f18093g && this.h == y0Var.h && this.f18094i == y0Var.f18094i && this.f18095j == y0Var.f18095j && this.f18096k == y0Var.f18096k && Objects.equals(this.f18088a, y0Var.f18088a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f18088a.hashCode() + 527) * 31) + ((int) this.f18089b)) * 31) + ((int) this.d)) * 31) + ((int) this.f18091e)) * 31) + ((int) this.f18092f)) * 31) + (this.f18093g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f18094i ? 1 : 0)) * 31) + (this.f18095j ? 1 : 0)) * 31) + (this.f18096k ? 1 : 0);
    }
}
