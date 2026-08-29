package j3;
public final class j1 {
    public final l4.c0 f10552a;
    public final long f10553b;
    public final long f10554c;
    public final long d;
    public final long f10555e;
    public final boolean f10556f;
    public final boolean f10557g;
    public final boolean h;
    public final boolean f10558i;

    public j1(l4.c0 c0Var, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        boolean z15;
        boolean z16 = true;
        if (z13 && !z11) {
            z14 = false;
        } else {
            z14 = true;
        }
        f5.a.f(z14);
        if (z12 && !z11) {
            z15 = false;
        } else {
            z15 = true;
        }
        f5.a.f(z15);
        if (z10 && (z11 || z12 || z13)) {
            z16 = false;
        }
        f5.a.f(z16);
        this.f10552a = c0Var;
        this.f10553b = j10;
        this.f10554c = j11;
        this.d = j12;
        this.f10555e = j13;
        this.f10556f = z10;
        this.f10557g = z11;
        this.h = z12;
        this.f10558i = z13;
    }

    public final j1 a(long j10) {
        if (j10 == this.f10554c) {
            return this;
        }
        return new j1(this.f10552a, this.f10553b, j10, this.d, this.f10555e, this.f10556f, this.f10557g, this.h, this.f10558i);
    }

    public final j1 b(long j10) {
        if (j10 == this.f10553b) {
            return this;
        }
        return new j1(this.f10552a, j10, this.f10554c, this.d, this.f10555e, this.f10556f, this.f10557g, this.h, this.f10558i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j1.class == obj.getClass()) {
            j1 j1Var = (j1) obj;
            if (this.f10553b == j1Var.f10553b && this.f10554c == j1Var.f10554c && this.d == j1Var.d && this.f10555e == j1Var.f10555e && this.f10556f == j1Var.f10556f && this.f10557g == j1Var.f10557g && this.h == j1Var.h && this.f10558i == j1Var.f10558i && f5.d0.a(this.f10552a, j1Var.f10552a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f10552a.hashCode() + 527) * 31) + ((int) this.f10553b)) * 31) + ((int) this.f10554c)) * 31) + ((int) this.d)) * 31) + ((int) this.f10555e)) * 31) + (this.f10556f ? 1 : 0)) * 31) + (this.f10557g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f10558i ? 1 : 0);
    }
}
