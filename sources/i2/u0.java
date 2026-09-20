package i2;

import j$.util.Objects;
public final class u0 {
    public final u2.f0 f10892a;
    public final long f10893b;
    public final long f10894c;
    public final long d;
    public final long e;
    public final boolean f10895f;
    public final boolean f10896g;
    public final boolean h;
    public final boolean f10897i;
    public final boolean f10898j;

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
        this.f10892a = f0Var;
        this.f10893b = j3;
        this.f10894c = j10;
        this.d = j11;
        this.e = j12;
        this.f10895f = z10;
        this.f10896g = z11;
        this.h = z12;
        this.f10897i = z13;
        this.f10898j = z14;
    }

    public final u0 a(long j3) {
        if (j3 == this.f10894c) {
            return this;
        }
        return new u0(this.f10892a, this.f10893b, j3, this.d, this.e, this.f10895f, this.f10896g, this.h, this.f10897i, this.f10898j);
    }

    public final u0 b(long j3) {
        if (j3 == this.f10893b) {
            return this;
        }
        return new u0(this.f10892a, j3, this.f10894c, this.d, this.e, this.f10895f, this.f10896g, this.h, this.f10897i, this.f10898j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u0.class == obj.getClass()) {
            u0 u0Var = (u0) obj;
            if (this.f10893b == u0Var.f10893b && this.f10894c == u0Var.f10894c && this.d == u0Var.d && this.e == u0Var.e && this.f10895f == u0Var.f10895f && this.f10896g == u0Var.f10896g && this.h == u0Var.h && this.f10897i == u0Var.f10897i && this.f10898j == u0Var.f10898j && Objects.equals(this.f10892a, u0Var.f10892a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f10892a.hashCode() + 527) * 31) + ((int) this.f10893b)) * 31) + ((int) this.f10894c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f10895f ? 1 : 0)) * 31) + (this.f10896g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f10897i ? 1 : 0)) * 31) + (this.f10898j ? 1 : 0);
    }
}
