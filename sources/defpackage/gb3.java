package defpackage;

import java.io.IOException;
public final class gb3 {
    public final n41 a;
    public final ka9 b;
    public final wh0 c;
    public final d73 d;
    public final long e;
    public final long f;

    public gb3(long j, ka9 ka9Var, wh0 wh0Var, n41 n41Var, long j2, d73 d73Var) {
        this.e = j;
        this.b = ka9Var;
        this.c = wh0Var;
        this.f = j2;
        this.a = n41Var;
        this.d = d73Var;
    }

    public final gb3 a(long j, ka9 ka9Var) {
        long J;
        long j2;
        d73 b = this.b.b();
        d73 b2 = ka9Var.b();
        if (b != null && b2 != null && b.T() && b.X(j) != 0 && b2.X(j) != 0) {
            long X = b.X(j);
            long V = b.V();
            long e = b.e(V);
            long j3 = X + V;
            long j4 = j3 - 1;
            long j5 = b.j(j4, j) + b.e(j4);
            long V2 = b2.V();
            long e2 = b2.e(V2);
            int i = (j5 > e2 ? 1 : (j5 == e2 ? 0 : -1));
            long j6 = this.f;
            if (i == 0) {
                j2 = (j3 - V2) + j6;
            } else if (i >= 0) {
                if (e2 < e) {
                    J = j6 - (b2.J(e, j) - V);
                } else {
                    J = (b.J(e2, j) - V2) + j6;
                }
                j2 = J;
            } else {
                throw new IOException();
            }
            return new gb3(j, ka9Var, this.c, this.a, j2, b2);
        }
        return new gb3(j, ka9Var, this.c, this.a, this.f, b2);
    }

    public final long b(long j) {
        d73 d73Var = this.d;
        d73Var.getClass();
        long j2 = this.e;
        d73Var.getClass();
        return (d73Var.e0(j2, j) + (d73Var.m(j2, j) + this.f)) - 1;
    }

    public final long c() {
        d73 d73Var = this.d;
        d73Var.getClass();
        return d73Var.X(this.e);
    }

    public final long d(long j) {
        long e = e(j);
        d73 d73Var = this.d;
        d73Var.getClass();
        return d73Var.j(j - this.f, this.e) + e;
    }

    public final long e(long j) {
        d73 d73Var = this.d;
        d73Var.getClass();
        return d73Var.e(j - this.f);
    }

    public final boolean f(long j, long j2) {
        d73 d73Var = this.d;
        d73Var.getClass();
        if (!d73Var.T() && j2 != -9223372036854775807L && d(j) > j2) {
            return false;
        }
        return true;
    }
}
