package j3;
public final class g1 {
    public final o4.v f8585a;
    public final long f8586b;
    public final long f8587c;
    public final long d;
    public final long e;
    public final boolean f8588f;
    public final boolean f8589g;
    public final boolean h;
    public final boolean f8590i;

    public g1(o4.v vVar, long j10, long j11, long j12, long j13, boolean z4, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15 = true;
        if (z12 && !z10) {
            z13 = false;
        } else {
            z13 = true;
        }
        h5.a.f(z13);
        if (z11 && !z10) {
            z14 = false;
        } else {
            z14 = true;
        }
        h5.a.f(z14);
        if (z4 && (z10 || z11 || z12)) {
            z15 = false;
        }
        h5.a.f(z15);
        this.f8585a = vVar;
        this.f8586b = j10;
        this.f8587c = j11;
        this.d = j12;
        this.e = j13;
        this.f8588f = z4;
        this.f8589g = z10;
        this.h = z11;
        this.f8590i = z12;
    }

    public final g1 a(long j10) {
        if (j10 == this.f8587c) {
            return this;
        }
        return new g1(this.f8585a, this.f8586b, j10, this.d, this.e, this.f8588f, this.f8589g, this.h, this.f8590i);
    }

    public final g1 b(long j10) {
        if (j10 == this.f8586b) {
            return this;
        }
        return new g1(this.f8585a, j10, this.f8587c, this.d, this.e, this.f8588f, this.f8589g, this.h, this.f8590i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g1.class == obj.getClass()) {
            g1 g1Var = (g1) obj;
            if (this.f8586b == g1Var.f8586b && this.f8587c == g1Var.f8587c && this.d == g1Var.d && this.e == g1Var.e && this.f8588f == g1Var.f8588f && this.f8589g == g1Var.f8589g && this.h == g1Var.h && this.f8590i == g1Var.f8590i && h5.d0.a(this.f8585a, g1Var.f8585a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f8585a.hashCode() + 527) * 31) + ((int) this.f8586b)) * 31) + ((int) this.f8587c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f8588f ? 1 : 0)) * 31) + (this.f8589g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f8590i ? 1 : 0);
    }
}
