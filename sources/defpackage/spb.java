package defpackage;
public final class spb implements tt6, st6 {
    public final tt6 a;
    public final long b;
    public st6 c;

    public spb(tt6 tt6Var, long j) {
        this.a = tt6Var;
        this.b = j;
    }

    @Override
    public final void a(tt6 tt6Var) {
        st6 st6Var = this.c;
        st6Var.getClass();
        st6Var.a(this);
    }

    @Override
    public final void b(s6a s6aVar) {
        tt6 tt6Var = (tt6) s6aVar;
        st6 st6Var = this.c;
        st6Var.getClass();
        st6Var.b(this);
    }

    @Override
    public final long c(t74[] t74VarArr, boolean[] zArr, jr9[] jr9VarArr, boolean[] zArr2, long j) {
        jr9[] jr9VarArr2 = new jr9[jr9VarArr.length];
        int i = 0;
        while (true) {
            jr9 jr9Var = null;
            if (i >= jr9VarArr.length) {
                break;
            }
            rpb rpbVar = (rpb) jr9VarArr[i];
            if (rpbVar != null) {
                jr9Var = rpbVar.a;
            }
            jr9VarArr2[i] = jr9Var;
            i++;
        }
        tt6 tt6Var = this.a;
        long j2 = this.b;
        long c = tt6Var.c(t74VarArr, zArr, jr9VarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < jr9VarArr.length; i2++) {
            jr9 jr9Var2 = jr9VarArr2[i2];
            if (jr9Var2 == null) {
                jr9VarArr[i2] = null;
            } else {
                jr9 jr9Var3 = jr9VarArr[i2];
                if (jr9Var3 == null || ((rpb) jr9Var3).a != jr9Var2) {
                    jr9VarArr[i2] = new rpb(jr9Var2, j2);
                }
            }
        }
        return c + j2;
    }

    @Override
    public final void e() {
        String str = hac.a;
        this.a.e();
    }

    @Override
    public final boolean f() {
        return this.a.f();
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
    public final long h(long j, jx9 jx9Var) {
        long j2 = this.b;
        return this.a.h(j - j2, jx9Var) + j2;
    }

    @Override
    public final void j() {
        this.a.j();
    }

    @Override
    public final long k(long j) {
        long j2 = this.b;
        return this.a.k(j - j2) + j2;
    }

    @Override
    public final void l(long j) {
        this.a.l(j - this.b);
    }

    @Override
    public final long n() {
        long n = this.a.n();
        if (n == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return n + this.b;
    }

    @Override
    public final void o(st6 st6Var, long j) {
        this.c = st6Var;
        this.a.o(this, j - this.b);
    }

    @Override
    public final vzb q() {
        return this.a.q();
    }

    @Override
    public final boolean r(sa6 sa6Var) {
        ?? obj = new Object();
        long j = sa6Var.a;
        obj.b = sa6Var.b;
        obj.c = sa6Var.c;
        obj.a = j - this.b;
        return this.a.r(new sa6(obj));
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
