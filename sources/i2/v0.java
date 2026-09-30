package i2;

import j$.util.Objects;
public final class v0 {
    public final u2.f0 f10898a;
    public final long f10899b;
    public final long f10900c;
    public final long d;
    public final long e;
    public final boolean f10901f;
    public final boolean f10902g;
    public final boolean h;
    public final boolean f10903i;
    public final boolean f10904j;

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
        this.f10898a = f0Var;
        this.f10899b = j3;
        this.f10900c = j10;
        this.d = j11;
        this.e = j12;
        this.f10901f = z10;
        this.f10902g = z11;
        this.h = z12;
        this.f10903i = z13;
        this.f10904j = z14;
    }

    public final v0 a(long j3) {
        if (j3 == this.f10900c) {
            return this;
        }
        return new v0(this.f10898a, this.f10899b, j3, this.d, this.e, this.f10901f, this.f10902g, this.h, this.f10903i, this.f10904j);
    }

    public final v0 b(long j3) {
        if (j3 == this.f10899b) {
            return this;
        }
        return new v0(this.f10898a, j3, this.f10900c, this.d, this.e, this.f10901f, this.f10902g, this.h, this.f10903i, this.f10904j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass()) {
            v0 v0Var = (v0) obj;
            if (this.f10899b == v0Var.f10899b && this.f10900c == v0Var.f10900c && this.d == v0Var.d && this.e == v0Var.e && this.f10901f == v0Var.f10901f && this.f10902g == v0Var.f10902g && this.h == v0Var.h && this.f10903i == v0Var.f10903i && this.f10904j == v0Var.f10904j && Objects.equals(this.f10898a, v0Var.f10898a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f10898a.hashCode() + 527) * 31) + ((int) this.f10899b)) * 31) + ((int) this.f10900c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f10901f ? 1 : 0)) * 31) + (this.f10902g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f10903i ? 1 : 0)) * 31) + (this.f10904j ? 1 : 0);
    }
}
