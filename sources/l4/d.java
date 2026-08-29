package l4;

import j3.j2;
public final class d implements z, y {
    public final z f14292a;
    public y f14293b;
    public c[] f14294c = new c[0];
    public long d;
    public long f14295e;
    public long f14296f;
    public f h;

    public d(z zVar, boolean z10, long j10, long j11) {
        long j12;
        this.f14292a = zVar;
        if (z10) {
            j12 = j10;
        } else {
            j12 = -9223372036854775807L;
        }
        this.d = j12;
        this.f14295e = j10;
        this.f14296f = j11;
    }

    @Override
    public final long A(d5.r[] r15, boolean[] r16, l4.c1[] r17, boolean[] r18, long r19) {
        throw new UnsupportedOperationException("Method not decompiled: l4.d.A(d5.r[], boolean[], l4.c1[], boolean[], long):long");
    }

    @Override
    public final long E() {
        boolean z10;
        if (d()) {
            long j10 = this.d;
            this.d = -9223372036854775807L;
            long E = E();
            if (E != -9223372036854775807L) {
                return E;
            }
            return j10;
        }
        long E2 = this.f14292a.E();
        if (E2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z11 = false;
        if (E2 >= this.f14295e) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.i(z10);
        long j11 = this.f14296f;
        f5.a.i((j11 == Long.MIN_VALUE || E2 <= j11) ? true : true);
        return E2;
    }

    @Override
    public final k1 J() {
        return this.f14292a.J();
    }

    @Override
    public final long L() {
        long L = this.f14292a.L();
        if (L != Long.MIN_VALUE) {
            long j10 = this.f14296f;
            if (j10 == Long.MIN_VALUE || L < j10) {
                return L;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final void U(long j10) {
        this.f14292a.U(j10);
    }

    @Override
    public final void a(e1 e1Var) {
        z zVar = (z) e1Var;
        y yVar = this.f14293b;
        yVar.getClass();
        yVar.a(this);
    }

    @Override
    public final boolean b() {
        return this.f14292a.b();
    }

    @Override
    public final void c(z zVar) {
        if (this.h != null) {
            return;
        }
        y yVar = this.f14293b;
        yVar.getClass();
        yVar.c(this);
    }

    public final boolean d() {
        if (this.d != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final long f(long j10, j2 j2Var) {
        long j11;
        long j12 = this.f14295e;
        if (j10 == j12) {
            return j12;
        }
        long i10 = f5.d0.i(j2Var.f10561a, 0L, j10 - j12);
        long j13 = j2Var.f10562b;
        long j14 = this.f14296f;
        if (j14 == Long.MIN_VALUE) {
            j11 = Long.MAX_VALUE;
        } else {
            j11 = j14 - j10;
        }
        long i11 = f5.d0.i(j13, 0L, j11);
        if (i10 != j2Var.f10561a || i11 != j2Var.f10562b) {
            j2Var = new j2(i10, i11);
        }
        return this.f14292a.f(j10, j2Var);
    }

    @Override
    public final long h() {
        long h = this.f14292a.h();
        if (h != Long.MIN_VALUE) {
            long j10 = this.f14296f;
            if (j10 == Long.MIN_VALUE || h < j10) {
                return h;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final void n(y yVar, long j10) {
        this.f14293b = yVar;
        this.f14292a.n(this, j10);
    }

    @Override
    public final void o() {
        f fVar = this.h;
        if (fVar == null) {
            this.f14292a.o();
            return;
        }
        throw fVar;
    }

    @Override
    public final long p(long r7) {
        throw new UnsupportedOperationException("Method not decompiled: l4.d.p(long):long");
    }

    @Override
    public final void r(long j10) {
        this.f14292a.r(j10);
    }

    @Override
    public final boolean s(long j10) {
        return this.f14292a.s(j10);
    }
}
