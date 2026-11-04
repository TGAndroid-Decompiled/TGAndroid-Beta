package k2;

import b8.zb;
import j$.util.Objects;
public final class y0 {
    public final w2.g0 f16777a;
    public final long f16778b;
    public final long f16779c;
    public final long d;
    public final long f16780e;
    public final long f16781f;
    public final boolean f16782g;
    public final boolean h;
    public final boolean f16783i;
    public final boolean f16784j;
    public final boolean f16785k;

    public y0(w2.g0 g0Var, long j10, long j11, long j12, long j13, long j14, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        boolean z16;
        boolean z17 = true;
        if (z14 && !z12) {
            z15 = false;
        } else {
            z15 = true;
        }
        zb.f(z15);
        if (z13 && !z12) {
            z16 = false;
        } else {
            z16 = true;
        }
        zb.f(z16);
        if (z11 && (z12 || z13 || z14)) {
            z17 = false;
        }
        zb.f(z17);
        this.f16777a = g0Var;
        this.f16778b = j10;
        this.f16779c = j11;
        this.d = j12;
        this.f16780e = j13;
        this.f16781f = j14;
        this.f16782g = z10;
        this.h = z11;
        this.f16783i = z12;
        this.f16784j = z13;
        this.f16785k = z14;
    }

    public final y0 a(long j10) {
        if (j10 == this.d) {
            return this;
        }
        return new y0(this.f16777a, this.f16778b, this.f16779c, j10, this.f16780e, this.f16781f, this.f16782g, this.h, this.f16783i, this.f16784j, this.f16785k);
    }

    public final y0 b(long j10, long j11) {
        if (j10 == this.f16778b && j11 == this.f16779c) {
            return this;
        }
        return new y0(this.f16777a, j10, j11, this.d, this.f16780e, this.f16781f, this.f16782g, this.h, this.f16783i, this.f16784j, this.f16785k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y0.class == obj.getClass()) {
            y0 y0Var = (y0) obj;
            if (this.f16778b == y0Var.f16778b && this.d == y0Var.d && this.f16780e == y0Var.f16780e && this.f16781f == y0Var.f16781f && this.f16782g == y0Var.f16782g && this.h == y0Var.h && this.f16783i == y0Var.f16783i && this.f16784j == y0Var.f16784j && this.f16785k == y0Var.f16785k && Objects.equals(this.f16777a, y0Var.f16777a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f16777a.hashCode() + 527) * 31) + ((int) this.f16778b)) * 31) + ((int) this.d)) * 31) + ((int) this.f16780e)) * 31) + ((int) this.f16781f)) * 31) + (this.f16782g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f16783i ? 1 : 0)) * 31) + (this.f16784j ? 1 : 0)) * 31) + (this.f16785k ? 1 : 0);
    }
}
