package j4;

import h3.j2;
public final class u implements a0, z {
    public final d0 f13570a;
    public final long f13571b;
    public final com.google.android.exoplayer2.upstream.r f13572c;
    public a d;
    public a0 f13573e;
    public z f13574f;
    public long h = -9223372036854775807L;

    public u(d0 d0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        this.f13570a = d0Var;
        this.f13572c = rVar;
        this.f13571b = j10;
    }

    public final void a(d0 d0Var) {
        long j10 = this.h;
        if (j10 == -9223372036854775807L) {
            j10 = this.f13571b;
        }
        a aVar = this.d;
        aVar.getClass();
        a0 b10 = aVar.b(d0Var, this.f13572c, j10);
        this.f13573e = b10;
        if (this.f13574f != null) {
            b10.w(this, j10);
        }
    }

    @Override
    public final boolean b() {
        a0 a0Var = this.f13573e;
        if (a0Var != null && a0Var.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(d1 d1Var) {
        a0 a0Var = (a0) d1Var;
        z zVar = this.f13574f;
        int i9 = d5.f0.f4349a;
        zVar.c(this);
    }

    @Override
    public final long d() {
        a0 a0Var = this.f13573e;
        int i9 = d5.f0.f4349a;
        return a0Var.d();
    }

    @Override
    public final void f(a0 a0Var) {
        z zVar = this.f13574f;
        int i9 = d5.f0.f4349a;
        zVar.f(this);
    }

    @Override
    public final void g() {
        a0 a0Var = this.f13573e;
        if (a0Var != null) {
            a0Var.g();
            return;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.j();
        }
    }

    @Override
    public final long i(long j10) {
        a0 a0Var = this.f13573e;
        int i9 = d5.f0.f4349a;
        return a0Var.i(j10);
    }

    @Override
    public final void k(long j10) {
        a0 a0Var = this.f13573e;
        int i9 = d5.f0.f4349a;
        a0Var.k(j10);
    }

    @Override
    public final boolean n(long j10) {
        a0 a0Var = this.f13573e;
        if (a0Var != null && a0Var.n(j10)) {
            return true;
        }
        return false;
    }

    @Override
    public final long o() {
        a0 a0Var = this.f13573e;
        int i9 = d5.f0.f4349a;
        return a0Var.o();
    }

    @Override
    public final j1 q() {
        a0 a0Var = this.f13573e;
        int i9 = d5.f0.f4349a;
        return a0Var.q();
    }

    @Override
    public final long u(long j10, j2 j2Var) {
        a0 a0Var = this.f13573e;
        int i9 = d5.f0.f4349a;
        return a0Var.u(j10, j2Var);
    }

    @Override
    public final long v() {
        a0 a0Var = this.f13573e;
        int i9 = d5.f0.f4349a;
        return a0Var.v();
    }

    @Override
    public final void w(z zVar, long j10) {
        this.f13574f = zVar;
        a0 a0Var = this.f13573e;
        if (a0Var != null) {
            long j11 = this.h;
            if (j11 == -9223372036854775807L) {
                j11 = this.f13571b;
            }
            a0Var.w(this, j11);
        }
    }

    @Override
    public final long x(b5.t[] tVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.h;
        if (j12 != -9223372036854775807L && j10 == this.f13571b) {
            this.h = -9223372036854775807L;
            j11 = j12;
        } else {
            j11 = j10;
        }
        a0 a0Var = this.f13573e;
        int i9 = d5.f0.f4349a;
        return a0Var.x(tVarArr, zArr, b1VarArr, zArr2, j11);
    }

    @Override
    public final void z(long j10) {
        a0 a0Var = this.f13573e;
        int i9 = d5.f0.f4349a;
        a0Var.z(j10);
    }
}
