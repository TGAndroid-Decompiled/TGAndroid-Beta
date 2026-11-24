package defpackage;
public final class rnb implements sr6, rr6 {
    public final sr6 a;
    public final long b;
    public rr6 c;

    public rnb(sr6 sr6Var, long j) {
        this.a = sr6Var;
        this.b = j;
    }

    @Override
    public final void a(sr6 sr6Var) {
        rr6 rr6Var = this.c;
        rr6Var.getClass();
        rr6Var.a(this);
    }

    @Override
    public final void b(q4a q4aVar) {
        sr6 sr6Var = (sr6) q4aVar;
        rr6 rr6Var = this.c;
        rr6Var.getClass();
        rr6Var.b(this);
    }

    @Override
    public final boolean d() {
        return this.a.d();
    }

    @Override
    public final long e(k64[] k64VarArr, boolean[] zArr, ip9[] ip9VarArr, boolean[] zArr2, long j) {
        ip9[] ip9VarArr2 = new ip9[ip9VarArr.length];
        int i = 0;
        while (true) {
            ip9 ip9Var = null;
            if (i >= ip9VarArr.length) {
                break;
            }
            qnb qnbVar = (qnb) ip9VarArr[i];
            if (qnbVar != null) {
                ip9Var = qnbVar.a;
            }
            ip9VarArr2[i] = ip9Var;
            i++;
        }
        sr6 sr6Var = this.a;
        long j2 = this.b;
        long e = sr6Var.e(k64VarArr, zArr, ip9VarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < ip9VarArr.length; i2++) {
            ip9 ip9Var2 = ip9VarArr2[i2];
            if (ip9Var2 == null) {
                ip9VarArr[i2] = null;
            } else {
                ip9 ip9Var3 = ip9VarArr[i2];
                if (ip9Var3 == null || ((qnb) ip9Var3).a != ip9Var2) {
                    ip9VarArr[i2] = new qnb(ip9Var2, j2);
                }
            }
        }
        return e + j2;
    }

    @Override
    public final void f() {
        String str = g8c.a;
        this.a.f();
    }

    @Override
    public final long g() {
        long g = this.a.g();
        if (g == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return g + this.b;
    }

    @Override
    public final long i(long j, gv9 gv9Var) {
        long j2 = this.b;
        return this.a.i(j - j2, gv9Var) + j2;
    }

    @Override
    public final void k() {
        this.a.k();
    }

    @Override
    public final long l(long j) {
        long j2 = this.b;
        return this.a.l(j - j2) + j2;
    }

    @Override
    public final void m(long j) {
        this.a.m(j - this.b);
    }

    @Override
    public final long o() {
        long o = this.a.o();
        if (o == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return o + this.b;
    }

    @Override
    public final void p(rr6 rr6Var, long j) {
        this.c = rr6Var;
        this.a.p(this, j - this.b);
    }

    @Override
    public final txb q() {
        return this.a.q();
    }

    @Override
    public final boolean r(t86 t86Var) {
        ?? obj = new Object();
        long j = t86Var.a;
        obj.b = t86Var.b;
        obj.c = t86Var.c;
        obj.a = j - this.b;
        return this.a.r(new t86(obj));
    }

    @Override
    public final long s() {
        long s = this.a.s();
        if (s == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return s + this.b;
    }

    @Override
    public final void t(long j) {
        this.a.t(j - this.b);
    }
}
