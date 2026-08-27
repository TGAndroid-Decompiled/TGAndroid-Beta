package h3;

public final class j1 {

    public final j4.c0 f7945a;

    public final long f7946b;

    public final long f7947c;
    public final long d;

    public final long f7948e;

    public final boolean f7949f;

    public final boolean f7950g;
    public final boolean h;

    public final boolean f7951i;

    public j1(j4.c0 c0Var, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = true;
        d5.a.f(!z13 || z11);
        d5.a.f(!z12 || z11);
        if (z10 && (z11 || z12 || z13)) {
            z14 = false;
        }
        d5.a.f(z14);
        this.f7945a = c0Var;
        this.f7946b = j10;
        this.f7947c = j11;
        this.d = j12;
        this.f7948e = j13;
        this.f7949f = z10;
        this.f7950g = z11;
        this.h = z12;
        this.f7951i = z13;
    }

    public final j1 a(long j10) {
        if (j10 == this.f7947c) {
            return this;
        }
        return new j1(this.f7945a, this.f7946b, j10, this.d, this.f7948e, this.f7949f, this.f7950g, this.h, this.f7951i);
    }

    public final j1 b(long j10) {
        if (j10 == this.f7946b) {
            return this;
        }
        return new j1(this.f7945a, j10, this.f7947c, this.d, this.f7948e, this.f7949f, this.f7950g, this.h, this.f7951i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j1.class == obj.getClass()) {
            j1 j1Var = (j1) obj;
            if (this.f7946b == j1Var.f7946b && this.f7947c == j1Var.f7947c && this.d == j1Var.d && this.f7948e == j1Var.f7948e && this.f7949f == j1Var.f7949f && this.f7950g == j1Var.f7950g && this.h == j1Var.h && this.f7951i == j1Var.f7951i && d5.g0.a(this.f7945a, j1Var.f7945a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f7945a.hashCode() + 527) * 31) + ((int) this.f7946b)) * 31) + ((int) this.f7947c)) * 31) + ((int) this.d)) * 31) + ((int) this.f7948e)) * 31) + (this.f7949f ? 1 : 0)) * 31) + (this.f7950g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f7951i ? 1 : 0);
    }
}
