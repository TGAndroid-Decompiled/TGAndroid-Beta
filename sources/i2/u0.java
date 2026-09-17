package i2;

import j$.util.Objects;
public final class u0 {
    public final u2.f0 f11749a;
    public final long f11750b;
    public final long f11751c;
    public final long d;
    public final long f11752e;
    public final boolean f11753f;
    public final boolean f11754g;
    public final boolean h;
    public final boolean f11755i;
    public final boolean f11756j;

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
        this.f11749a = f0Var;
        this.f11750b = j3;
        this.f11751c = j10;
        this.d = j11;
        this.f11752e = j12;
        this.f11753f = z10;
        this.f11754g = z11;
        this.h = z12;
        this.f11755i = z13;
        this.f11756j = z14;
    }

    public final u0 a(long j3) {
        if (j3 == this.f11751c) {
            return this;
        }
        return new u0(this.f11749a, this.f11750b, j3, this.d, this.f11752e, this.f11753f, this.f11754g, this.h, this.f11755i, this.f11756j);
    }

    public final u0 b(long j3) {
        if (j3 == this.f11750b) {
            return this;
        }
        return new u0(this.f11749a, j3, this.f11751c, this.d, this.f11752e, this.f11753f, this.f11754g, this.h, this.f11755i, this.f11756j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u0.class == obj.getClass()) {
            u0 u0Var = (u0) obj;
            if (this.f11750b == u0Var.f11750b && this.f11751c == u0Var.f11751c && this.d == u0Var.d && this.f11752e == u0Var.f11752e && this.f11753f == u0Var.f11753f && this.f11754g == u0Var.f11754g && this.h == u0Var.h && this.f11755i == u0Var.f11755i && this.f11756j == u0Var.f11756j && Objects.equals(this.f11749a, u0Var.f11749a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f11749a.hashCode() + 527) * 31) + ((int) this.f11750b)) * 31) + ((int) this.f11751c)) * 31) + ((int) this.d)) * 31) + ((int) this.f11752e)) * 31) + (this.f11753f ? 1 : 0)) * 31) + (this.f11754g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f11755i ? 1 : 0)) * 31) + (this.f11756j ? 1 : 0);
    }
}
