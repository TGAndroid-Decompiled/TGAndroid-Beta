package i2;

import j$.util.Objects;
public final class t0 {
    public final u2.g0 f10368a;
    public final long f10369b;
    public final long f10370c;
    public final long d;
    public final long e;
    public final boolean f10371f;
    public final boolean f10372g;
    public final boolean h;
    public final boolean f10373i;
    public final boolean f10374j;

    public t0(u2.g0 g0Var, long j3, long j10, long j11, long j12, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
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
        this.f10368a = g0Var;
        this.f10369b = j3;
        this.f10370c = j10;
        this.d = j11;
        this.e = j12;
        this.f10371f = z10;
        this.f10372g = z11;
        this.h = z12;
        this.f10373i = z13;
        this.f10374j = z14;
    }

    public final t0 a(long j3) {
        if (j3 == this.f10370c) {
            return this;
        }
        return new t0(this.f10368a, this.f10369b, j3, this.d, this.e, this.f10371f, this.f10372g, this.h, this.f10373i, this.f10374j);
    }

    public final t0 b(long j3) {
        if (j3 == this.f10369b) {
            return this;
        }
        return new t0(this.f10368a, j3, this.f10370c, this.d, this.e, this.f10371f, this.f10372g, this.h, this.f10373i, this.f10374j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t0.class == obj.getClass()) {
            t0 t0Var = (t0) obj;
            if (this.f10369b == t0Var.f10369b && this.f10370c == t0Var.f10370c && this.d == t0Var.d && this.e == t0Var.e && this.f10371f == t0Var.f10371f && this.f10372g == t0Var.f10372g && this.h == t0Var.h && this.f10373i == t0Var.f10373i && this.f10374j == t0Var.f10374j && Objects.equals(this.f10368a, t0Var.f10368a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f10368a.hashCode() + 527) * 31) + ((int) this.f10369b)) * 31) + ((int) this.f10370c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f10371f ? 1 : 0)) * 31) + (this.f10372g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f10373i ? 1 : 0)) * 31) + (this.f10374j ? 1 : 0);
    }
}
