package i2;

import j$.util.Objects;
public final class v0 {
    public final u2.f0 f10887a;
    public final long f10888b;
    public final long f10889c;
    public final long d;
    public final long e;
    public final boolean f10890f;
    public final boolean f10891g;
    public final boolean h;
    public final boolean f10892i;
    public final boolean f10893j;

    public v0(u2.f0 f0Var, long j3, long j10, long j11, long j12, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
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
        this.f10887a = f0Var;
        this.f10888b = j3;
        this.f10889c = j10;
        this.d = j11;
        this.e = j12;
        this.f10890f = z10;
        this.f10891g = z11;
        this.h = z12;
        this.f10892i = z13;
        this.f10893j = z14;
    }

    public final v0 a(long j3) {
        if (j3 == this.f10889c) {
            return this;
        }
        return new v0(this.f10887a, this.f10888b, j3, this.d, this.e, this.f10890f, this.f10891g, this.h, this.f10892i, this.f10893j);
    }

    public final v0 b(long j3) {
        if (j3 == this.f10888b) {
            return this;
        }
        return new v0(this.f10887a, j3, this.f10889c, this.d, this.e, this.f10890f, this.f10891g, this.h, this.f10892i, this.f10893j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass()) {
            v0 v0Var = (v0) obj;
            if (this.f10888b == v0Var.f10888b && this.f10889c == v0Var.f10889c && this.d == v0Var.d && this.e == v0Var.e && this.f10890f == v0Var.f10890f && this.f10891g == v0Var.f10891g && this.h == v0Var.h && this.f10892i == v0Var.f10892i && this.f10893j == v0Var.f10893j && Objects.equals(this.f10887a, v0Var.f10887a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f10887a.hashCode() + 527) * 31) + ((int) this.f10888b)) * 31) + ((int) this.f10889c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f10890f ? 1 : 0)) * 31) + (this.f10891g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f10892i ? 1 : 0)) * 31) + (this.f10893j ? 1 : 0);
    }
}
