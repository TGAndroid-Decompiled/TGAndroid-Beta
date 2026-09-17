package i2;

import j$.util.Objects;
public final class u0 {
    public final u2.f0 f10891a;
    public final long f10892b;
    public final long f10893c;
    public final long d;
    public final long e;
    public final boolean f10894f;
    public final boolean f10895g;
    public final boolean h;
    public final boolean f10896i;
    public final boolean f10897j;

    public u0(u2.f0 f0Var, long j3, long j10, long j11, long j12, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        boolean z16;
        boolean z17 = true;
        if (z14 && !z12) {
            z15 = false;
        } else {
            z15 = true;
        }
        e2.d.b(z15);
        if (z13 && !z12) {
            z16 = false;
        } else {
            z16 = true;
        }
        e2.d.b(z16);
        if (z11 && (z12 || z13 || z14)) {
            z17 = false;
        }
        e2.d.b(z17);
        this.f10891a = f0Var;
        this.f10892b = j3;
        this.f10893c = j10;
        this.d = j11;
        this.e = j12;
        this.f10894f = z10;
        this.f10895g = z11;
        this.h = z12;
        this.f10896i = z13;
        this.f10897j = z14;
    }

    public final u0 a(long j3) {
        if (j3 == this.f10893c) {
            return this;
        }
        return new u0(this.f10891a, this.f10892b, j3, this.d, this.e, this.f10894f, this.f10895g, this.h, this.f10896i, this.f10897j);
    }

    public final u0 b(long j3) {
        if (j3 == this.f10892b) {
            return this;
        }
        return new u0(this.f10891a, j3, this.f10893c, this.d, this.e, this.f10894f, this.f10895g, this.h, this.f10896i, this.f10897j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u0.class == obj.getClass()) {
            u0 u0Var = (u0) obj;
            if (this.f10892b == u0Var.f10892b && this.f10893c == u0Var.f10893c && this.d == u0Var.d && this.e == u0Var.e && this.f10894f == u0Var.f10894f && this.f10895g == u0Var.f10895g && this.h == u0Var.h && this.f10896i == u0Var.f10896i && this.f10897j == u0Var.f10897j && Objects.equals(this.f10891a, u0Var.f10891a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f10891a.hashCode() + 527) * 31) + ((int) this.f10892b)) * 31) + ((int) this.f10893c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f10894f ? 1 : 0)) * 31) + (this.f10895g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f10896i ? 1 : 0)) * 31) + (this.f10897j ? 1 : 0);
    }
}
