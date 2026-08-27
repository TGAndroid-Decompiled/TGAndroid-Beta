package j4;

import h3.j2;

public final class j0 implements z, y {

    public final z f12589a;

    public final long f12590b;

    public y f12591c;

    public j0(z zVar, long j10) {
        this.f12589a = zVar;
        this.f12590b = j10;
    }

    @Override
    public final long B(long j10, j2 j2Var) {
        long j11 = this.f12590b;
        return this.f12589a.B(j10 - j11, j2Var) + j11;
    }

    @Override
    public final long D() {
        long jD = this.f12589a.D();
        if (jD == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jD + this.f12590b;
    }

    @Override
    public final void E(y yVar, long j10) {
        this.f12591c = yVar;
        this.f12589a.E(this, j10 - this.f12590b);
    }

    @Override
    public final long F(b5.s[] sVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10) {
        b1[] b1VarArr2 = new b1[b1VarArr.length];
        int i10 = 0;
        while (true) {
            b1 b1Var = null;
            if (i10 >= b1VarArr.length) {
                break;
            }
            k0 k0Var = (k0) b1VarArr[i10];
            if (k0Var != null) {
                b1Var = k0Var.f12599a;
            }
            b1VarArr2[i10] = b1Var;
            i10++;
        }
        z zVar = this.f12589a;
        long j11 = this.f12590b;
        long jF = zVar.F(sVarArr, zArr, b1VarArr2, zArr2, j10 - j11);
        for (int i11 = 0; i11 < b1VarArr.length; i11++) {
            b1 b1Var2 = b1VarArr2[i11];
            if (b1Var2 == null) {
                b1VarArr[i11] = null;
            } else {
                b1 b1Var3 = b1VarArr[i11];
                if (b1Var3 == null || ((k0) b1Var3).f12599a != b1Var2) {
                    b1VarArr[i11] = new k0(b1Var2, j11);
                }
            }
        }
        return jF + j11;
    }

    @Override
    public final void I(long j10) {
        this.f12589a.I(j10 - this.f12590b);
    }

    @Override
    public final void a(d1 d1Var) {
        y yVar = this.f12591c;
        yVar.getClass();
        yVar.a(this);
    }

    @Override
    public final boolean b() {
        return this.f12589a.b();
    }

    @Override
    public final void e(z zVar) {
        y yVar = this.f12591c;
        yVar.getClass();
        yVar.e(this);
    }

    @Override
    public final long g() {
        long jG = this.f12589a.g();
        if (jG == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jG + this.f12590b;
    }

    @Override
    public final void m() {
        this.f12589a.m();
    }

    @Override
    public final long o(long j10) {
        long j11 = this.f12590b;
        return this.f12589a.o(j10 - j11) + j11;
    }

    @Override
    public final void p(long j10) {
        this.f12589a.p(j10 - this.f12590b);
    }

    @Override
    public final boolean q(long j10) {
        return this.f12589a.q(j10 - this.f12590b);
    }

    @Override
    public final long w() {
        long jW = this.f12589a.w();
        if (jW == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jW + this.f12590b;
    }

    @Override
    public final j1 z() {
        return this.f12589a.z();
    }
}
