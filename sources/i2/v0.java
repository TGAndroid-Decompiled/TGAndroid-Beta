package i2;

import j$.util.Objects;
public final class v0 {
    public final u2.f0 f11906a;
    public final long f11907b;
    public final long f11908c;
    public final long d;
    public final long f11909e;
    public final boolean f11910f;
    public final boolean f11911g;
    public final boolean h;
    public final boolean f11912i;
    public final boolean f11913j;

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
        this.f11906a = f0Var;
        this.f11907b = j3;
        this.f11908c = j10;
        this.d = j11;
        this.f11909e = j12;
        this.f11910f = z10;
        this.f11911g = z11;
        this.h = z12;
        this.f11912i = z13;
        this.f11913j = z14;
    }

    public final v0 a(long j3) {
        if (j3 == this.f11908c) {
            return this;
        }
        return new v0(this.f11906a, this.f11907b, j3, this.d, this.f11909e, this.f11910f, this.f11911g, this.h, this.f11912i, this.f11913j);
    }

    public final v0 b(long j3) {
        if (j3 == this.f11907b) {
            return this;
        }
        return new v0(this.f11906a, j3, this.f11908c, this.d, this.f11909e, this.f11910f, this.f11911g, this.h, this.f11912i, this.f11913j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass()) {
            v0 v0Var = (v0) obj;
            if (this.f11907b == v0Var.f11907b && this.f11908c == v0Var.f11908c && this.d == v0Var.d && this.f11909e == v0Var.f11909e && this.f11910f == v0Var.f11910f && this.f11911g == v0Var.f11911g && this.h == v0Var.h && this.f11912i == v0Var.f11912i && this.f11913j == v0Var.f11913j && Objects.equals(this.f11906a, v0Var.f11906a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f11906a.hashCode() + 527) * 31) + ((int) this.f11907b)) * 31) + ((int) this.f11908c)) * 31) + ((int) this.d)) * 31) + ((int) this.f11909e)) * 31) + (this.f11910f ? 1 : 0)) * 31) + (this.f11911g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f11912i ? 1 : 0)) * 31) + (this.f11913j ? 1 : 0);
    }
}
