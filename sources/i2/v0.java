package i2;

import j$.util.Objects;
public final class v0 {
    public final u2.f0 f11908a;
    public final long f11909b;
    public final long f11910c;
    public final long d;
    public final long f11911e;
    public final boolean f11912f;
    public final boolean f11913g;
    public final boolean h;
    public final boolean f11914i;
    public final boolean f11915j;

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
        this.f11908a = f0Var;
        this.f11909b = j3;
        this.f11910c = j10;
        this.d = j11;
        this.f11911e = j12;
        this.f11912f = z10;
        this.f11913g = z11;
        this.h = z12;
        this.f11914i = z13;
        this.f11915j = z14;
    }

    public final v0 a(long j3) {
        if (j3 == this.f11910c) {
            return this;
        }
        return new v0(this.f11908a, this.f11909b, j3, this.d, this.f11911e, this.f11912f, this.f11913g, this.h, this.f11914i, this.f11915j);
    }

    public final v0 b(long j3) {
        if (j3 == this.f11909b) {
            return this;
        }
        return new v0(this.f11908a, j3, this.f11910c, this.d, this.f11911e, this.f11912f, this.f11913g, this.h, this.f11914i, this.f11915j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass()) {
            v0 v0Var = (v0) obj;
            if (this.f11909b == v0Var.f11909b && this.f11910c == v0Var.f11910c && this.d == v0Var.d && this.f11911e == v0Var.f11911e && this.f11912f == v0Var.f11912f && this.f11913g == v0Var.f11913g && this.h == v0Var.h && this.f11914i == v0Var.f11914i && this.f11915j == v0Var.f11915j && Objects.equals(this.f11908a, v0Var.f11908a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f11908a.hashCode() + 527) * 31) + ((int) this.f11909b)) * 31) + ((int) this.f11910c)) * 31) + ((int) this.d)) * 31) + ((int) this.f11911e)) * 31) + (this.f11912f ? 1 : 0)) * 31) + (this.f11913g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f11914i ? 1 : 0)) * 31) + (this.f11915j ? 1 : 0);
    }
}
