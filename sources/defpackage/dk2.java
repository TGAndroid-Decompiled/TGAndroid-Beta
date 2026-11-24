package defpackage;
public final class dk2 implements tt6, st6 {
    public final tt6 a;
    public st6 b;
    public ck2[] c = new ck2[0];
    public long d;
    public boolean e;
    public boolean f;
    public long h;
    public long n;
    public long r;
    public fk2 s;

    public dk2(tt6 tt6Var, boolean z, long j, long j2, int i) {
        long j3;
        this.a = tt6Var;
        if (z) {
            j3 = j;
        } else {
            j3 = -9223372036854775807L;
        }
        this.d = j3;
        this.h = -9223372036854775807L;
        this.n = j;
        this.r = j2;
    }

    @Override
    public final void a(tt6 tt6Var) {
        if (this.s != null) {
            return;
        }
        st6 st6Var = this.b;
        st6Var.getClass();
        st6Var.a(this);
    }

    @Override
    public final void b(s6a s6aVar) {
        tt6 tt6Var = (tt6) s6aVar;
        st6 st6Var = this.b;
        st6Var.getClass();
        st6Var.b(this);
    }

    @Override
    public final long c(defpackage.t74[] r18, boolean[] r19, defpackage.jr9[] r20, boolean[] r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dk2.c(t74[], boolean[], jr9[], boolean[], long):long");
    }

    public final boolean d() {
        if (this.d != -9223372036854775807L && !this.e) {
            return true;
        }
        return false;
    }

    @Override
    public final void e() {
        this.f = true;
        this.a.e();
    }

    @Override
    public final boolean f() {
        return this.a.f();
    }

    @Override
    public final long g() {
        long g = this.a.g();
        if (g != Long.MIN_VALUE) {
            long j = this.r;
            if (j == Long.MIN_VALUE || g < j) {
                return g;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final long h(long j, jx9 jx9Var) {
        long j2;
        long j3 = this.n;
        if (j == j3) {
            return j3;
        }
        long j4 = hac.j(jx9Var.a, 0L, j - j3);
        long j5 = jx9Var.b;
        long j6 = this.r;
        if (j6 == Long.MIN_VALUE) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = j6 - j;
        }
        long j7 = hac.j(j5, 0L, j2);
        if (j4 != jx9Var.a || j7 != jx9Var.b) {
            jx9Var = new jx9(j4, j7);
        }
        return this.a.h(j, jx9Var);
    }

    @Override
    public final void j() {
        fk2 fk2Var = this.s;
        if (fk2Var == null) {
            this.a.j();
            return;
        }
        throw fk2Var;
    }

    @Override
    public final long k(long j) {
        ck2[] ck2VarArr;
        this.d = -9223372036854775807L;
        for (ck2 ck2Var : this.c) {
            if (ck2Var != null) {
                ck2Var.c = false;
            }
        }
        long k = this.a.k(j);
        long j2 = this.n;
        long j3 = this.r;
        long max = Math.max(k, j2);
        if (j3 != Long.MIN_VALUE) {
            return Math.min(max, j3);
        }
        return max;
    }

    @Override
    public final void l(long j) {
        this.a.l(j);
    }

    @Override
    public final long n() {
        if (d()) {
            this.e = true;
            long j = this.d;
            this.d = -9223372036854775807L;
            this.h = j;
            long n = n();
            if (n != -9223372036854775807L) {
                return n;
            }
            return j;
        }
        long n2 = this.a.n();
        if (n2 != -9223372036854775807L) {
            long j2 = this.n;
            long j3 = this.r;
            long max = Math.max(n2, j2);
            if (j3 != Long.MIN_VALUE) {
                max = Math.min(max, j3);
            }
            if (max != this.h) {
                this.h = max;
                return max;
            }
        }
        return -9223372036854775807L;
    }

    @Override
    public final void o(st6 st6Var, long j) {
        this.b = st6Var;
        this.a.o(this, j);
    }

    @Override
    public final vzb q() {
        return this.a.q();
    }

    @Override
    public final boolean r(sa6 sa6Var) {
        return this.a.r(sa6Var);
    }

    @Override
    public final long s() {
        long s = this.a.s();
        if (s != Long.MIN_VALUE) {
            long j = this.r;
            if (j == Long.MIN_VALUE || s < j) {
                return s;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final void t(long j) {
        this.a.t(j);
    }
}
