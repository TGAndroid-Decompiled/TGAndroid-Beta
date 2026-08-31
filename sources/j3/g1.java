package j3;
public final class g1 {
    public final o4.v f9153a;
    public final long f9154b;
    public final long f9155c;
    public final long d;
    public final long f9156e;
    public final boolean f9157f;
    public final boolean f9158g;
    public final boolean h;
    public final boolean f9159i;

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
        this.f9153a = vVar;
        this.f9154b = j10;
        this.f9155c = j11;
        this.d = j12;
        this.f9156e = j13;
        this.f9157f = z4;
        this.f9158g = z10;
        this.h = z11;
        this.f9159i = z12;
    }

    public final g1 a(long j10) {
        if (j10 == this.f9155c) {
            return this;
        }
        return new g1(this.f9153a, this.f9154b, j10, this.d, this.f9156e, this.f9157f, this.f9158g, this.h, this.f9159i);
    }

    public final g1 b(long j10) {
        if (j10 == this.f9154b) {
            return this;
        }
        return new g1(this.f9153a, j10, this.f9155c, this.d, this.f9156e, this.f9157f, this.f9158g, this.h, this.f9159i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g1.class == obj.getClass()) {
            g1 g1Var = (g1) obj;
            if (this.f9154b == g1Var.f9154b && this.f9155c == g1Var.f9155c && this.d == g1Var.d && this.f9156e == g1Var.f9156e && this.f9157f == g1Var.f9157f && this.f9158g == g1Var.f9158g && this.h == g1Var.h && this.f9159i == g1Var.f9159i && h5.d0.a(this.f9153a, g1Var.f9153a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f9153a.hashCode() + 527) * 31) + ((int) this.f9154b)) * 31) + ((int) this.f9155c)) * 31) + ((int) this.d)) * 31) + ((int) this.f9156e)) * 31) + (this.f9157f ? 1 : 0)) * 31) + (this.f9158g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f9159i ? 1 : 0);
    }
}
