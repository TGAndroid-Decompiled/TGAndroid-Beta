package h3;
public final class j1 {
    public final j4.d0 f9515a;
    public final long f9516b;
    public final long f9517c;
    public final long d;
    public final long f9518e;
    public final boolean f9519f;
    public final boolean f9520g;
    public final boolean h;
    public final boolean f9521i;

    public j1(j4.d0 d0Var, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        boolean z15;
        boolean z16 = true;
        if (z13 && !z11) {
            z14 = false;
        } else {
            z14 = true;
        }
        d5.a.f(z14);
        if (z12 && !z11) {
            z15 = false;
        } else {
            z15 = true;
        }
        d5.a.f(z15);
        if (z10 && (z11 || z12 || z13)) {
            z16 = false;
        }
        d5.a.f(z16);
        this.f9515a = d0Var;
        this.f9516b = j10;
        this.f9517c = j11;
        this.d = j12;
        this.f9518e = j13;
        this.f9519f = z10;
        this.f9520g = z11;
        this.h = z12;
        this.f9521i = z13;
    }

    public final j1 a(long j10) {
        if (j10 == this.f9517c) {
            return this;
        }
        return new j1(this.f9515a, this.f9516b, j10, this.d, this.f9518e, this.f9519f, this.f9520g, this.h, this.f9521i);
    }

    public final j1 b(long j10) {
        if (j10 == this.f9516b) {
            return this;
        }
        return new j1(this.f9515a, j10, this.f9517c, this.d, this.f9518e, this.f9519f, this.f9520g, this.h, this.f9521i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j1.class == obj.getClass()) {
            j1 j1Var = (j1) obj;
            if (this.f9516b == j1Var.f9516b && this.f9517c == j1Var.f9517c && this.d == j1Var.d && this.f9518e == j1Var.f9518e && this.f9519f == j1Var.f9519f && this.f9520g == j1Var.f9520g && this.h == j1Var.h && this.f9521i == j1Var.f9521i && d5.f0.a(this.f9515a, j1Var.f9515a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f9515a.hashCode() + 527) * 31) + ((int) this.f9516b)) * 31) + ((int) this.f9517c)) * 31) + ((int) this.d)) * 31) + ((int) this.f9518e)) * 31) + (this.f9519f ? 1 : 0)) * 31) + (this.f9520g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f9521i ? 1 : 0);
    }
}
