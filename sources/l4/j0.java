package l4;

import j3.j2;
public final class j0 implements z, y {
    public final z f14342a;
    public final long f14343b;
    public y f14344c;

    public j0(z zVar, long j10) {
        this.f14342a = zVar;
        this.f14343b = j10;
    }

    @Override
    public final long A(d5.r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        c1[] c1VarArr2 = new c1[c1VarArr.length];
        int i10 = 0;
        while (true) {
            c1 c1Var = null;
            if (i10 >= c1VarArr.length) {
                break;
            }
            k0 k0Var = (k0) c1VarArr[i10];
            if (k0Var != null) {
                c1Var = k0Var.f14354a;
            }
            c1VarArr2[i10] = c1Var;
            i10++;
        }
        z zVar = this.f14342a;
        long j11 = this.f14343b;
        long A = zVar.A(rVarArr, zArr, c1VarArr2, zArr2, j10 - j11);
        for (int i11 = 0; i11 < c1VarArr.length; i11++) {
            c1 c1Var2 = c1VarArr2[i11];
            if (c1Var2 == null) {
                c1VarArr[i11] = null;
            } else {
                c1 c1Var3 = c1VarArr[i11];
                if (c1Var3 == null || ((k0) c1Var3).f14354a != c1Var2) {
                    c1VarArr[i11] = new k0(c1Var2, j11);
                }
            }
        }
        return A + j11;
    }

    @Override
    public final long E() {
        long E = this.f14342a.E();
        if (E == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return E + this.f14343b;
    }

    @Override
    public final k1 J() {
        return this.f14342a.J();
    }

    @Override
    public final long L() {
        long L = this.f14342a.L();
        if (L == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return L + this.f14343b;
    }

    @Override
    public final void U(long j10) {
        this.f14342a.U(j10 - this.f14343b);
    }

    @Override
    public final void a(e1 e1Var) {
        z zVar = (z) e1Var;
        y yVar = this.f14344c;
        yVar.getClass();
        yVar.a(this);
    }

    @Override
    public final boolean b() {
        return this.f14342a.b();
    }

    @Override
    public final void c(z zVar) {
        y yVar = this.f14344c;
        yVar.getClass();
        yVar.c(this);
    }

    @Override
    public final long f(long j10, j2 j2Var) {
        long j11 = this.f14343b;
        return this.f14342a.f(j10 - j11, j2Var) + j11;
    }

    @Override
    public final long h() {
        long h = this.f14342a.h();
        if (h == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return h + this.f14343b;
    }

    @Override
    public final void n(y yVar, long j10) {
        this.f14344c = yVar;
        this.f14342a.n(this, j10 - this.f14343b);
    }

    @Override
    public final void o() {
        this.f14342a.o();
    }

    @Override
    public final long p(long j10) {
        long j11 = this.f14343b;
        return this.f14342a.p(j10 - j11) + j11;
    }

    @Override
    public final void r(long j10) {
        this.f14342a.r(j10 - this.f14343b);
    }

    @Override
    public final boolean s(long j10) {
        return this.f14342a.s(j10 - this.f14343b);
    }
}
