package o4;

import j3.h2;
public final class d implements t, s {
    public final t f16290a;
    public s f16291b;
    public c[] f16292c = new c[0];
    public long d;
    public long e;
    public long f16293f;

    public d(t tVar, boolean z4, long j10, long j11) {
        long j12;
        this.f16290a = tVar;
        if (z4) {
            j12 = j10;
        } else {
            j12 = -9223372036854775807L;
        }
        this.d = j12;
        this.e = j10;
        this.f16293f = j11;
    }

    @Override
    public final void E1(t tVar) {
        s sVar = this.f16291b;
        sVar.getClass();
        sVar.E1(this);
    }

    @Override
    public final long H() {
        long H = this.f16290a.H();
        if (H != Long.MIN_VALUE) {
            long j10 = this.f16293f;
            if (j10 == Long.MIN_VALUE || H < j10) {
                return H;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final void J(s sVar, long j10) {
        this.f16291b = sVar;
        this.f16290a.J(this, j10);
    }

    @Override
    public final void X1(n0 n0Var) {
        t tVar = (t) n0Var;
        s sVar = this.f16291b;
        sVar.getClass();
        sVar.X1(this);
    }

    @Override
    public final long Y(f5.c[] r15, boolean[] r16, o4.l0[] r17, boolean[] r18, long r19) {
        throw new UnsupportedOperationException("Method not decompiled: o4.d.Y(f5.c[], boolean[], o4.l0[], boolean[], long):long");
    }

    public final boolean a() {
        if (this.d != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final long a1() {
        boolean z4;
        if (a()) {
            long j10 = this.d;
            this.d = -9223372036854775807L;
            long a12 = a1();
            if (a12 != -9223372036854775807L) {
                return a12;
            }
            return j10;
        }
        long a13 = this.f16290a.a1();
        if (a13 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z10 = false;
        if (a13 >= this.e) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.i(z4);
        long j11 = this.f16293f;
        h5.a.i((j11 == Long.MIN_VALUE || a13 <= j11) ? true : true);
        return a13;
    }

    @Override
    public final boolean b() {
        return this.f16290a.b();
    }

    @Override
    public final void d0() {
        this.f16290a.d0();
    }

    @Override
    public final long j0(long r7) {
        throw new UnsupportedOperationException("Method not decompiled: o4.d.j0(long):long");
    }

    @Override
    public final void k2(long j10) {
        this.f16290a.k2(j10);
    }

    @Override
    public final void m0(long j10) {
        this.f16290a.m0(j10);
    }

    @Override
    public final boolean n0(long j10) {
        return this.f16290a.n0(j10);
    }

    @Override
    public final t0 o1() {
        return this.f16290a.o1();
    }

    @Override
    public final long y1() {
        long y12 = this.f16290a.y1();
        if (y12 != Long.MIN_VALUE) {
            long j10 = this.f16293f;
            if (j10 == Long.MIN_VALUE || y12 < j10) {
                return y12;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final long z(long j10, h2 h2Var) {
        long j11;
        long j12 = this.e;
        if (j10 == j12) {
            return j12;
        }
        long i10 = h5.d0.i(h2Var.f8592a, 0L, j10 - j12);
        long j13 = h2Var.f8593b;
        long j14 = this.f16293f;
        if (j14 == Long.MIN_VALUE) {
            j11 = Long.MAX_VALUE;
        } else {
            j11 = j14 - j10;
        }
        long i11 = h5.d0.i(j13, 0L, j11);
        if (i10 != h2Var.f8592a || i11 != h2Var.f8593b) {
            h2Var = new h2(i10, i11);
        }
        return this.f16290a.z(j10, h2Var);
    }
}
