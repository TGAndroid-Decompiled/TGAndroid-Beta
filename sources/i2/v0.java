package i2;

import j$.util.Objects;
public final class v0 {
    public final u2.f0 f11907a;
    public final long f11908b;
    public final long f11909c;
    public final long d;
    public final long f11910e;
    public final boolean f11911f;
    public final boolean f11912g;
    public final boolean h;
    public final boolean f11913i;
    public final boolean f11914j;

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
        this.f11907a = f0Var;
        this.f11908b = j3;
        this.f11909c = j10;
        this.d = j11;
        this.f11910e = j12;
        this.f11911f = z10;
        this.f11912g = z11;
        this.h = z12;
        this.f11913i = z13;
        this.f11914j = z14;
    }

    public final v0 a(long j3) {
        if (j3 == this.f11909c) {
            return this;
        }
        return new v0(this.f11907a, this.f11908b, j3, this.d, this.f11910e, this.f11911f, this.f11912g, this.h, this.f11913i, this.f11914j);
    }

    public final v0 b(long j3) {
        if (j3 == this.f11908b) {
            return this;
        }
        return new v0(this.f11907a, j3, this.f11909c, this.d, this.f11910e, this.f11911f, this.f11912g, this.h, this.f11913i, this.f11914j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass()) {
            v0 v0Var = (v0) obj;
            if (this.f11908b == v0Var.f11908b && this.f11909c == v0Var.f11909c && this.d == v0Var.d && this.f11910e == v0Var.f11910e && this.f11911f == v0Var.f11911f && this.f11912g == v0Var.f11912g && this.h == v0Var.h && this.f11913i == v0Var.f11913i && this.f11914j == v0Var.f11914j && Objects.equals(this.f11907a, v0Var.f11907a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f11907a.hashCode() + 527) * 31) + ((int) this.f11908b)) * 31) + ((int) this.f11909c)) * 31) + ((int) this.d)) * 31) + ((int) this.f11910e)) * 31) + (this.f11911f ? 1 : 0)) * 31) + (this.f11912g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f11913i ? 1 : 0)) * 31) + (this.f11914j ? 1 : 0);
    }
}
