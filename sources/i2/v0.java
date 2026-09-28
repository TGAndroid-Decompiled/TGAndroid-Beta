package i2;

import j$.util.Objects;
public final class v0 {
    public final u2.f0 f10884a;
    public final long f10885b;
    public final long f10886c;
    public final long d;
    public final long e;
    public final boolean f10887f;
    public final boolean f10888g;
    public final boolean h;
    public final boolean f10889i;
    public final boolean f10890j;

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
        this.f10884a = f0Var;
        this.f10885b = j3;
        this.f10886c = j10;
        this.d = j11;
        this.e = j12;
        this.f10887f = z10;
        this.f10888g = z11;
        this.h = z12;
        this.f10889i = z13;
        this.f10890j = z14;
    }

    public final v0 a(long j3) {
        if (j3 == this.f10886c) {
            return this;
        }
        return new v0(this.f10884a, this.f10885b, j3, this.d, this.e, this.f10887f, this.f10888g, this.h, this.f10889i, this.f10890j);
    }

    public final v0 b(long j3) {
        if (j3 == this.f10885b) {
            return this;
        }
        return new v0(this.f10884a, j3, this.f10886c, this.d, this.e, this.f10887f, this.f10888g, this.h, this.f10889i, this.f10890j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass()) {
            v0 v0Var = (v0) obj;
            if (this.f10885b == v0Var.f10885b && this.f10886c == v0Var.f10886c && this.d == v0Var.d && this.e == v0Var.e && this.f10887f == v0Var.f10887f && this.f10888g == v0Var.f10888g && this.h == v0Var.h && this.f10889i == v0Var.f10889i && this.f10890j == v0Var.f10890j && Objects.equals(this.f10884a, v0Var.f10884a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f10884a.hashCode() + 527) * 31) + ((int) this.f10885b)) * 31) + ((int) this.f10886c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f10887f ? 1 : 0)) * 31) + (this.f10888g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f10889i ? 1 : 0)) * 31) + (this.f10890j ? 1 : 0);
    }
}
