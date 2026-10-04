package i2;

import j$.util.Objects;
public final class v0 {
    public final u2.f0 f11858a;
    public final long f11859b;
    public final long f11860c;
    public final long d;
    public final long f11861e;
    public final boolean f11862f;
    public final boolean f11863g;
    public final boolean h;
    public final boolean f11864i;
    public final boolean f11865j;

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
        this.f11858a = f0Var;
        this.f11859b = j3;
        this.f11860c = j10;
        this.d = j11;
        this.f11861e = j12;
        this.f11862f = z10;
        this.f11863g = z11;
        this.h = z12;
        this.f11864i = z13;
        this.f11865j = z14;
    }

    public final v0 a(long j3) {
        if (j3 == this.f11860c) {
            return this;
        }
        return new v0(this.f11858a, this.f11859b, j3, this.d, this.f11861e, this.f11862f, this.f11863g, this.h, this.f11864i, this.f11865j);
    }

    public final v0 b(long j3) {
        if (j3 == this.f11859b) {
            return this;
        }
        return new v0(this.f11858a, j3, this.f11860c, this.d, this.f11861e, this.f11862f, this.f11863g, this.h, this.f11864i, this.f11865j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass()) {
            v0 v0Var = (v0) obj;
            if (this.f11859b == v0Var.f11859b && this.f11860c == v0Var.f11860c && this.d == v0Var.d && this.f11861e == v0Var.f11861e && this.f11862f == v0Var.f11862f && this.f11863g == v0Var.f11863g && this.h == v0Var.h && this.f11864i == v0Var.f11864i && this.f11865j == v0Var.f11865j && Objects.equals(this.f11858a, v0Var.f11858a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f11858a.hashCode() + 527) * 31) + ((int) this.f11859b)) * 31) + ((int) this.f11860c)) * 31) + ((int) this.d)) * 31) + ((int) this.f11861e)) * 31) + (this.f11862f ? 1 : 0)) * 31) + (this.f11863g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f11864i ? 1 : 0)) * 31) + (this.f11865j ? 1 : 0);
    }
}
