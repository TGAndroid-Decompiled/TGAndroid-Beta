package i2;

import j$.util.Objects;
public final class v0 {
    public final u2.f0 f11857a;
    public final long f11858b;
    public final long f11859c;
    public final long d;
    public final long f11860e;
    public final boolean f11861f;
    public final boolean f11862g;
    public final boolean h;
    public final boolean f11863i;
    public final boolean f11864j;

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
        this.f11857a = f0Var;
        this.f11858b = j3;
        this.f11859c = j10;
        this.d = j11;
        this.f11860e = j12;
        this.f11861f = z10;
        this.f11862g = z11;
        this.h = z12;
        this.f11863i = z13;
        this.f11864j = z14;
    }

    public final v0 a(long j3) {
        if (j3 == this.f11859c) {
            return this;
        }
        return new v0(this.f11857a, this.f11858b, j3, this.d, this.f11860e, this.f11861f, this.f11862g, this.h, this.f11863i, this.f11864j);
    }

    public final v0 b(long j3) {
        if (j3 == this.f11858b) {
            return this;
        }
        return new v0(this.f11857a, j3, this.f11859c, this.d, this.f11860e, this.f11861f, this.f11862g, this.h, this.f11863i, this.f11864j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass()) {
            v0 v0Var = (v0) obj;
            if (this.f11858b == v0Var.f11858b && this.f11859c == v0Var.f11859c && this.d == v0Var.d && this.f11860e == v0Var.f11860e && this.f11861f == v0Var.f11861f && this.f11862g == v0Var.f11862g && this.h == v0Var.h && this.f11863i == v0Var.f11863i && this.f11864j == v0Var.f11864j && Objects.equals(this.f11857a, v0Var.f11857a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f11857a.hashCode() + 527) * 31) + ((int) this.f11858b)) * 31) + ((int) this.f11859c)) * 31) + ((int) this.d)) * 31) + ((int) this.f11860e)) * 31) + (this.f11861f ? 1 : 0)) * 31) + (this.f11862g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f11863i ? 1 : 0)) * 31) + (this.f11864j ? 1 : 0);
    }
}
