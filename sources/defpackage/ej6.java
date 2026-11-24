package defpackage;
public final class ej6 implements sr6, rr6 {
    public final rx6 a;
    public final long b;
    public final mv6 c;
    public qg0 d;
    public sr6 e;
    public rr6 f;
    public long h = -9223372036854775807L;
    public boolean n;

    public ej6(rx6 rx6Var, mv6 mv6Var, long j) {
        this.a = rx6Var;
        this.c = mv6Var;
        this.b = j;
    }

    @Override
    public final void a(sr6 sr6Var) {
        rr6 rr6Var = this.f;
        String str = g8c.a;
        rr6Var.a(this);
    }

    @Override
    public final void b(q4a q4aVar) {
        sr6 sr6Var = (sr6) q4aVar;
        rr6 rr6Var = this.f;
        String str = g8c.a;
        rr6Var.b(this);
    }

    public final void c(rx6 rx6Var) {
        long j = this.h;
        if (j == -9223372036854775807L) {
            j = this.b;
        }
        qg0 qg0Var = this.d;
        qg0Var.getClass();
        sr6 c = qg0Var.c(rx6Var, this.c, j);
        this.e = c;
        if (this.n) {
            c.f();
        }
        if (this.f != null) {
            this.e.p(this, j);
        }
    }

    @Override
    public final boolean d() {
        sr6 sr6Var = this.e;
        if (sr6Var != null && sr6Var.d()) {
            return true;
        }
        return false;
    }

    @Override
    public final long e(k64[] k64VarArr, boolean[] zArr, ip9[] ip9VarArr, boolean[] zArr2, long j) {
        long j2 = this.h;
        if (j2 != -9223372036854775807L && j == this.b) {
            j = j2;
        }
        this.h = -9223372036854775807L;
        sr6 sr6Var = this.e;
        String str = g8c.a;
        return sr6Var.e(k64VarArr, zArr, ip9VarArr, zArr2, j);
    }

    @Override
    public final void f() {
        this.n = true;
        sr6 sr6Var = this.e;
        if (sr6Var != null) {
            sr6Var.f();
        }
    }

    @Override
    public final long g() {
        sr6 sr6Var = this.e;
        String str = g8c.a;
        return sr6Var.g();
    }

    @Override
    public final long i(long j, gv9 gv9Var) {
        sr6 sr6Var = this.e;
        String str = g8c.a;
        return sr6Var.i(j, gv9Var);
    }

    @Override
    public final void k() {
        sr6 sr6Var = this.e;
        if (sr6Var != null) {
            sr6Var.k();
            return;
        }
        qg0 qg0Var = this.d;
        if (qg0Var != null) {
            qg0Var.k();
        }
    }

    @Override
    public final long l(long j) {
        sr6 sr6Var = this.e;
        String str = g8c.a;
        return sr6Var.l(j);
    }

    @Override
    public final void m(long j) {
        sr6 sr6Var = this.e;
        String str = g8c.a;
        sr6Var.m(j);
    }

    @Override
    public final long o() {
        sr6 sr6Var = this.e;
        String str = g8c.a;
        return sr6Var.o();
    }

    @Override
    public final void p(rr6 rr6Var, long j) {
        this.f = rr6Var;
        sr6 sr6Var = this.e;
        if (sr6Var != null) {
            long j2 = this.h;
            if (j2 == -9223372036854775807L) {
                j2 = this.b;
            }
            sr6Var.p(this, j2);
        }
    }

    @Override
    public final txb q() {
        sr6 sr6Var = this.e;
        String str = g8c.a;
        return sr6Var.q();
    }

    @Override
    public final boolean r(t86 t86Var) {
        sr6 sr6Var = this.e;
        if (sr6Var != null && sr6Var.r(t86Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final long s() {
        sr6 sr6Var = this.e;
        String str = g8c.a;
        return sr6Var.s();
    }

    @Override
    public final void t(long j) {
        sr6 sr6Var = this.e;
        String str = g8c.a;
        sr6Var.t(j);
    }
}
