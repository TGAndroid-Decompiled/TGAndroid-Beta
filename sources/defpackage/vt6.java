package defpackage;
public final class vt6 {
    public final rz6 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public vt6(rz6 rz6Var, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        boolean z6;
        boolean z7 = true;
        if (z4 && !z2) {
            z5 = false;
        } else {
            z5 = true;
        }
        jte.f(z5);
        if (z3 && !z2) {
            z6 = false;
        } else {
            z6 = true;
        }
        jte.f(z6);
        if (z && (z2 || z3 || z4)) {
            z7 = false;
        }
        jte.f(z7);
        this.a = rz6Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final vt6 a(long j) {
        if (j == this.d) {
            return this;
        }
        return new vt6(this.a, this.b, this.c, j, this.e, this.f, this.g, this.h, this.i);
    }

    public final vt6 b(long j, long j2) {
        if (j == this.b && j2 == this.c) {
            return this;
        }
        return new vt6(this.a, j, j2, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && vt6.class == obj.getClass()) {
                vt6 vt6Var = (vt6) obj;
                if (this.b == vt6Var.b && this.d == vt6Var.d && this.e == vt6Var.e && this.f == vt6Var.f && this.g == vt6Var.g && this.h == vt6Var.h && this.i == vt6Var.i && this.a.equals(vt6Var.a)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
