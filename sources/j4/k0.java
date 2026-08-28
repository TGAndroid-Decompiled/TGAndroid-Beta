package j4;

import h3.j2;
public final class k0 implements a0, z {
    public final a0 f13496a;
    public final long f13497b;
    public z f13498c;

    public k0(a0 a0Var, long j10) {
        this.f13496a = a0Var;
        this.f13497b = j10;
    }

    @Override
    public final boolean b() {
        return this.f13496a.b();
    }

    @Override
    public final void c(d1 d1Var) {
        a0 a0Var = (a0) d1Var;
        z zVar = this.f13498c;
        zVar.getClass();
        zVar.c(this);
    }

    @Override
    public final long d() {
        long d = this.f13496a.d();
        if (d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d + this.f13497b;
    }

    @Override
    public final void f(a0 a0Var) {
        z zVar = this.f13498c;
        zVar.getClass();
        zVar.f(this);
    }

    @Override
    public final void g() {
        this.f13496a.g();
    }

    @Override
    public final long i(long j10) {
        long j11 = this.f13497b;
        return this.f13496a.i(j10 - j11) + j11;
    }

    @Override
    public final void k(long j10) {
        this.f13496a.k(j10 - this.f13497b);
    }

    @Override
    public final boolean n(long j10) {
        return this.f13496a.n(j10 - this.f13497b);
    }

    @Override
    public final long o() {
        long o6 = this.f13496a.o();
        if (o6 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return o6 + this.f13497b;
    }

    @Override
    public final j1 q() {
        return this.f13496a.q();
    }

    @Override
    public final long u(long j10, j2 j2Var) {
        long j11 = this.f13497b;
        return this.f13496a.u(j10 - j11, j2Var) + j11;
    }

    @Override
    public final long v() {
        long v = this.f13496a.v();
        if (v == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return v + this.f13497b;
    }

    @Override
    public final void w(z zVar, long j10) {
        this.f13498c = zVar;
        this.f13496a.w(this, j10 - this.f13497b);
    }

    @Override
    public final long x(b5.t[] tVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10) {
        b1[] b1VarArr2 = new b1[b1VarArr.length];
        int i9 = 0;
        while (true) {
            b1 b1Var = null;
            if (i9 >= b1VarArr.length) {
                break;
            }
            l0 l0Var = (l0) b1VarArr[i9];
            if (l0Var != null) {
                b1Var = l0Var.f13502a;
            }
            b1VarArr2[i9] = b1Var;
            i9++;
        }
        a0 a0Var = this.f13496a;
        long j11 = this.f13497b;
        long x10 = a0Var.x(tVarArr, zArr, b1VarArr2, zArr2, j10 - j11);
        for (int i10 = 0; i10 < b1VarArr.length; i10++) {
            b1 b1Var2 = b1VarArr2[i10];
            if (b1Var2 == null) {
                b1VarArr[i10] = null;
            } else {
                b1 b1Var3 = b1VarArr[i10];
                if (b1Var3 == null || ((l0) b1Var3).f13502a != b1Var2) {
                    b1VarArr[i10] = new l0(b1Var2, j11);
                }
            }
        }
        return x10 + j11;
    }

    @Override
    public final void z(long j10) {
        this.f13496a.z(j10 - this.f13497b);
    }
}
