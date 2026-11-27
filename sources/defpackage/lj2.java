package defpackage;
public final class lj2 implements xt6, wt6 {
    public final xt6 a;
    public wt6 b;
    public kj2[] c = new kj2[0];
    public long d;
    public boolean e;
    public boolean f;
    public long h;
    public long n;
    public long r;
    public nj2 s;

    public lj2(xt6 xt6Var, boolean z, long j, long j2, int i) {
        long j3;
        this.a = xt6Var;
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
    public final void a(xt6 xt6Var) {
        if (this.s != null) {
            return;
        }
        wt6 wt6Var = this.b;
        wt6Var.getClass();
        wt6Var.a(this);
    }

    public final boolean b() {
        if (this.d != -9223372036854775807L && !this.e) {
            return true;
        }
        return false;
    }

    @Override
    public final long c(defpackage.e74[] r18, boolean[] r19, defpackage.at9[] r20, boolean[] r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lj2.c(e74[], boolean[], at9[], boolean[], long):long");
    }

    @Override
    public final void d() {
        this.f = true;
        this.a.d();
    }

    @Override
    public final boolean e() {
        return this.a.e();
    }

    @Override
    public final void f(i8a i8aVar) {
        xt6 xt6Var = (xt6) i8aVar;
        wt6 wt6Var = this.b;
        wt6Var.getClass();
        wt6Var.f(this);
    }

    @Override
    public final long h() {
        long h = this.a.h();
        if (h != Long.MIN_VALUE) {
            long j = this.r;
            if (j == Long.MIN_VALUE || h < j) {
                return h;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final long j(long j, az9 az9Var) {
        long j2;
        long j3 = this.n;
        if (j == j3) {
            return j3;
        }
        long j4 = gcc.j(az9Var.a, 0L, j - j3);
        long j5 = az9Var.b;
        long j6 = this.r;
        if (j6 == Long.MIN_VALUE) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = j6 - j;
        }
        long j7 = gcc.j(j5, 0L, j2);
        if (j4 != az9Var.a || j7 != az9Var.b) {
            az9Var = new az9(j4, j7);
        }
        return this.a.j(j, az9Var);
    }

    @Override
    public final void l() {
        nj2 nj2Var = this.s;
        if (nj2Var == null) {
            this.a.l();
            return;
        }
        throw nj2Var;
    }

    @Override
    public final long m(long j) {
        kj2[] kj2VarArr;
        this.d = -9223372036854775807L;
        for (kj2 kj2Var : this.c) {
            if (kj2Var != null) {
                kj2Var.c = false;
            }
        }
        long m = this.a.m(j);
        long j2 = this.n;
        long j3 = this.r;
        long max = Math.max(m, j2);
        if (j3 != Long.MIN_VALUE) {
            return Math.min(max, j3);
        }
        return max;
    }

    @Override
    public final void n(long j) {
        this.a.n(j);
    }

    @Override
    public final long p() {
        if (b()) {
            this.e = true;
            long j = this.d;
            this.d = -9223372036854775807L;
            this.h = j;
            long p = p();
            if (p != -9223372036854775807L) {
                return p;
            }
            return j;
        }
        long p2 = this.a.p();
        if (p2 != -9223372036854775807L) {
            long j2 = this.n;
            long j3 = this.r;
            long max = Math.max(p2, j2);
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
    public final void q(wt6 wt6Var, long j) {
        this.b = wt6Var;
        this.a.q(this, j);
    }

    @Override
    public final u1c r() {
        return this.a.r();
    }

    @Override
    public final boolean s(xa6 xa6Var) {
        return this.a.s(xa6Var);
    }

    @Override
    public final long t() {
        long t = this.a.t();
        if (t != Long.MIN_VALUE) {
            long j = this.r;
            if (j == Long.MIN_VALUE || t < j) {
                return t;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final void u(long j) {
        this.a.u(j);
    }
}
