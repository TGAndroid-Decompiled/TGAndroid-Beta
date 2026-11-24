package defpackage;
public final class pi2 implements sr6, rr6 {
    public final sr6 a;
    public rr6 b;
    public oi2[] c = new oi2[0];
    public long d;
    public boolean e;
    public boolean f;
    public long h;
    public long n;
    public long r;
    public ri2 s;

    public pi2(sr6 sr6Var, boolean z, long j, long j2, int i) {
        long j3;
        this.a = sr6Var;
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
    public final void a(sr6 sr6Var) {
        if (this.s != null) {
            return;
        }
        rr6 rr6Var = this.b;
        rr6Var.getClass();
        rr6Var.a(this);
    }

    @Override
    public final void b(q4a q4aVar) {
        sr6 sr6Var = (sr6) q4aVar;
        rr6 rr6Var = this.b;
        rr6Var.getClass();
        rr6Var.b(this);
    }

    public final boolean c() {
        if (this.d != -9223372036854775807L && !this.e) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean d() {
        return this.a.d();
    }

    @Override
    public final long e(defpackage.k64[] r18, boolean[] r19, defpackage.ip9[] r20, boolean[] r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi2.e(k64[], boolean[], ip9[], boolean[], long):long");
    }

    @Override
    public final void f() {
        this.f = true;
        this.a.f();
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
    public final long i(long j, gv9 gv9Var) {
        long j2;
        long j3 = this.n;
        if (j == j3) {
            return j3;
        }
        long j4 = g8c.j(gv9Var.a, 0L, j - j3);
        long j5 = gv9Var.b;
        long j6 = this.r;
        if (j6 == Long.MIN_VALUE) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = j6 - j;
        }
        long j7 = g8c.j(j5, 0L, j2);
        if (j4 != gv9Var.a || j7 != gv9Var.b) {
            gv9Var = new gv9(j4, j7);
        }
        return this.a.i(j, gv9Var);
    }

    @Override
    public final void k() {
        ri2 ri2Var = this.s;
        if (ri2Var == null) {
            this.a.k();
            return;
        }
        throw ri2Var;
    }

    @Override
    public final long l(long j) {
        oi2[] oi2VarArr;
        this.d = -9223372036854775807L;
        for (oi2 oi2Var : this.c) {
            if (oi2Var != null) {
                oi2Var.c = false;
            }
        }
        long l = this.a.l(j);
        long j2 = this.n;
        long j3 = this.r;
        long max = Math.max(l, j2);
        if (j3 != Long.MIN_VALUE) {
            return Math.min(max, j3);
        }
        return max;
    }

    @Override
    public final void m(long j) {
        this.a.m(j);
    }

    @Override
    public final long o() {
        if (c()) {
            this.e = true;
            long j = this.d;
            this.d = -9223372036854775807L;
            this.h = j;
            long o = o();
            if (o != -9223372036854775807L) {
                return o;
            }
            return j;
        }
        long o2 = this.a.o();
        if (o2 != -9223372036854775807L) {
            long j2 = this.n;
            long j3 = this.r;
            long max = Math.max(o2, j2);
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
    public final void p(rr6 rr6Var, long j) {
        this.b = rr6Var;
        this.a.p(this, j);
    }

    @Override
    public final txb q() {
        return this.a.q();
    }

    @Override
    public final boolean r(t86 t86Var) {
        return this.a.r(t86Var);
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
