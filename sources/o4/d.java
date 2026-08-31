package o4;

import j3.h2;
public final class d implements t, s {
    public final t f16451a;
    public s f16452b;
    public c[] f16453c = new c[0];
    public long d;
    public long f16454e;
    public long f16455f;

    public d(t tVar, boolean z4, long j10, long j11) {
        long j12;
        this.f16451a = tVar;
        if (z4) {
            j12 = j10;
        } else {
            j12 = -9223372036854775807L;
        }
        this.d = j12;
        this.f16454e = j10;
        this.f16455f = j11;
    }

    @Override
    public final void a(t tVar) {
        s sVar = this.f16452b;
        sVar.getClass();
        sVar.a(this);
    }

    @Override
    public final boolean b() {
        return this.f16451a.b();
    }

    public final boolean c() {
        if (this.d != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final long d(long j10, h2 h2Var) {
        long j11;
        long j12 = this.f16454e;
        if (j10 == j12) {
            return j12;
        }
        long i10 = h5.d0.i(h2Var.f9182a, 0L, j10 - j12);
        long j13 = h2Var.f9183b;
        long j14 = this.f16455f;
        if (j14 == Long.MIN_VALUE) {
            j11 = Long.MAX_VALUE;
        } else {
            j11 = j14 - j10;
        }
        long i11 = h5.d0.i(j13, 0L, j11);
        if (i10 != h2Var.f9182a || i11 != h2Var.f9183b) {
            h2Var = new h2(i10, i11);
        }
        return this.f16451a.d(j10, h2Var);
    }

    @Override
    public final long e() {
        long e6 = this.f16451a.e();
        if (e6 != Long.MIN_VALUE) {
            long j10 = this.f16455f;
            if (j10 == Long.MIN_VALUE || e6 < j10) {
                return e6;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final void f(s sVar, long j10) {
        this.f16452b = sVar;
        this.f16451a.f(this, j10);
    }

    @Override
    public final long g(f5.c[] r15, boolean[] r16, o4.l0[] r17, boolean[] r18, long r19) {
        throw new UnsupportedOperationException("Method not decompiled: o4.d.g(f5.c[], boolean[], o4.l0[], boolean[], long):long");
    }

    @Override
    public final void i() {
        this.f16451a.i();
    }

    @Override
    public final long j(long r7) {
        throw new UnsupportedOperationException("Method not decompiled: o4.d.j(long):long");
    }

    @Override
    public final void k(long j10) {
        this.f16451a.k(j10);
    }

    @Override
    public final boolean m(long j10) {
        return this.f16451a.m(j10);
    }

    @Override
    public final long n() {
        boolean z4;
        if (c()) {
            long j10 = this.d;
            this.d = -9223372036854775807L;
            long n10 = n();
            if (n10 != -9223372036854775807L) {
                return n10;
            }
            return j10;
        }
        long n11 = this.f16451a.n();
        if (n11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z10 = false;
        if (n11 >= this.f16454e) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.i(z4);
        long j11 = this.f16455f;
        h5.a.i((j11 == Long.MIN_VALUE || n11 <= j11) ? true : true);
        return n11;
    }

    @Override
    public final t0 o() {
        return this.f16451a.o();
    }

    @Override
    public final long r() {
        long r10 = this.f16451a.r();
        if (r10 != Long.MIN_VALUE) {
            long j10 = this.f16455f;
            if (j10 == Long.MIN_VALUE || r10 < j10) {
                return r10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final void s(n0 n0Var) {
        t tVar = (t) n0Var;
        s sVar = this.f16452b;
        sVar.getClass();
        sVar.s(this);
    }

    @Override
    public final void t(long j10) {
        this.f16451a.t(j10);
    }
}
