package defpackage;
public final class hl6 implements tt6, st6 {
    public final rz6 a;
    public final long b;
    public final mx6 c;
    public rh0 d;
    public tt6 e;
    public st6 f;
    public long h = -9223372036854775807L;
    public boolean n;

    public hl6(rz6 rz6Var, mx6 mx6Var, long j) {
        this.a = rz6Var;
        this.c = mx6Var;
        this.b = j;
    }

    @Override
    public final void a(tt6 tt6Var) {
        st6 st6Var = this.f;
        String str = hac.a;
        st6Var.a(this);
    }

    @Override
    public final void b(s6a s6aVar) {
        tt6 tt6Var = (tt6) s6aVar;
        st6 st6Var = this.f;
        String str = hac.a;
        st6Var.b(this);
    }

    @Override
    public final long c(t74[] t74VarArr, boolean[] zArr, jr9[] jr9VarArr, boolean[] zArr2, long j) {
        long j2 = this.h;
        if (j2 != -9223372036854775807L && j == this.b) {
            j = j2;
        }
        this.h = -9223372036854775807L;
        tt6 tt6Var = this.e;
        String str = hac.a;
        return tt6Var.c(t74VarArr, zArr, jr9VarArr, zArr2, j);
    }

    public final void d(rz6 rz6Var) {
        long j = this.h;
        if (j == -9223372036854775807L) {
            j = this.b;
        }
        rh0 rh0Var = this.d;
        rh0Var.getClass();
        tt6 c = rh0Var.c(rz6Var, this.c, j);
        this.e = c;
        if (this.n) {
            c.e();
        }
        if (this.f != null) {
            this.e.o(this, j);
        }
    }

    @Override
    public final void e() {
        this.n = true;
        tt6 tt6Var = this.e;
        if (tt6Var != null) {
            tt6Var.e();
        }
    }

    @Override
    public final boolean f() {
        tt6 tt6Var = this.e;
        if (tt6Var != null && tt6Var.f()) {
            return true;
        }
        return false;
    }

    @Override
    public final long g() {
        tt6 tt6Var = this.e;
        String str = hac.a;
        return tt6Var.g();
    }

    @Override
    public final long h(long j, jx9 jx9Var) {
        tt6 tt6Var = this.e;
        String str = hac.a;
        return tt6Var.h(j, jx9Var);
    }

    @Override
    public final void j() {
        tt6 tt6Var = this.e;
        if (tt6Var != null) {
            tt6Var.j();
            return;
        }
        rh0 rh0Var = this.d;
        if (rh0Var != null) {
            rh0Var.k();
        }
    }

    @Override
    public final long k(long j) {
        tt6 tt6Var = this.e;
        String str = hac.a;
        return tt6Var.k(j);
    }

    @Override
    public final void l(long j) {
        tt6 tt6Var = this.e;
        String str = hac.a;
        tt6Var.l(j);
    }

    @Override
    public final long n() {
        tt6 tt6Var = this.e;
        String str = hac.a;
        return tt6Var.n();
    }

    @Override
    public final void o(st6 st6Var, long j) {
        this.f = st6Var;
        tt6 tt6Var = this.e;
        if (tt6Var != null) {
            long j2 = this.h;
            if (j2 == -9223372036854775807L) {
                j2 = this.b;
            }
            tt6Var.o(this, j2);
        }
    }

    @Override
    public final vzb q() {
        tt6 tt6Var = this.e;
        String str = hac.a;
        return tt6Var.q();
    }

    @Override
    public final boolean r(sa6 sa6Var) {
        tt6 tt6Var = this.e;
        if (tt6Var != null && tt6Var.r(sa6Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final long s() {
        tt6 tt6Var = this.e;
        String str = hac.a;
        return tt6Var.s();
    }

    @Override
    public final void t(long j) {
        tt6 tt6Var = this.e;
        String str = hac.a;
        tt6Var.t(j);
    }
}
