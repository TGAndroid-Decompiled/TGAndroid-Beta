package i2;

import j$.util.Objects;
public final class u0 {
    public final u2.f0 f10890a;
    public final long f10891b;
    public final long f10892c;
    public final long d;
    public final long e;
    public final boolean f10893f;
    public final boolean f10894g;
    public final boolean h;
    public final boolean f10895i;
    public final boolean f10896j;

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
        this.f10890a = f0Var;
        this.f10891b = j3;
        this.f10892c = j10;
        this.d = j11;
        this.e = j12;
        this.f10893f = z10;
        this.f10894g = z11;
        this.h = z12;
        this.f10895i = z13;
        this.f10896j = z14;
    }

    public final u0 a(long j3) {
        if (j3 == this.f10892c) {
            return this;
        }
        return new u0(this.f10890a, this.f10891b, j3, this.d, this.e, this.f10893f, this.f10894g, this.h, this.f10895i, this.f10896j);
    }

    public final u0 b(long j3) {
        if (j3 == this.f10891b) {
            return this;
        }
        return new u0(this.f10890a, j3, this.f10892c, this.d, this.e, this.f10893f, this.f10894g, this.h, this.f10895i, this.f10896j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u0.class == obj.getClass()) {
            u0 u0Var = (u0) obj;
            if (this.f10891b == u0Var.f10891b && this.f10892c == u0Var.f10892c && this.d == u0Var.d && this.e == u0Var.e && this.f10893f == u0Var.f10893f && this.f10894g == u0Var.f10894g && this.h == u0Var.h && this.f10895i == u0Var.f10895i && this.f10896j == u0Var.f10896j && Objects.equals(this.f10890a, u0Var.f10890a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f10890a.hashCode() + 527) * 31) + ((int) this.f10891b)) * 31) + ((int) this.f10892c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f10893f ? 1 : 0)) * 31) + (this.f10894g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f10895i ? 1 : 0)) * 31) + (this.f10896j ? 1 : 0);
    }
}
