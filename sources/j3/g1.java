package j3;
public final class g1 {
    public final o4.v f8567a;
    public final long f8568b;
    public final long f8569c;
    public final long d;
    public final long e;
    public final boolean f8570f;
    public final boolean f8571g;
    public final boolean h;
    public final boolean f8572i;

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
        this.f8567a = vVar;
        this.f8568b = j10;
        this.f8569c = j11;
        this.d = j12;
        this.e = j13;
        this.f8570f = z4;
        this.f8571g = z10;
        this.h = z11;
        this.f8572i = z12;
    }

    public final g1 a(long j10) {
        if (j10 == this.f8569c) {
            return this;
        }
        return new g1(this.f8567a, this.f8568b, j10, this.d, this.e, this.f8570f, this.f8571g, this.h, this.f8572i);
    }

    public final g1 b(long j10) {
        if (j10 == this.f8568b) {
            return this;
        }
        return new g1(this.f8567a, j10, this.f8569c, this.d, this.e, this.f8570f, this.f8571g, this.h, this.f8572i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g1.class == obj.getClass()) {
            g1 g1Var = (g1) obj;
            if (this.f8568b == g1Var.f8568b && this.f8569c == g1Var.f8569c && this.d == g1Var.d && this.e == g1Var.e && this.f8570f == g1Var.f8570f && this.f8571g == g1Var.f8571g && this.h == g1Var.h && this.f8572i == g1Var.f8572i && h5.d0.a(this.f8567a, g1Var.f8567a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f8567a.hashCode() + 527) * 31) + ((int) this.f8568b)) * 31) + ((int) this.f8569c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f8570f ? 1 : 0)) * 31) + (this.f8571g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f8572i ? 1 : 0);
    }
}
