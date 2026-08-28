package j4;

import h3.j2;
public final class e implements a0, z {
    public final a0 f13436a;
    public z f13437b;
    public d[] f13438c = new d[0];
    public long d;
    public long f13439e;
    public long f13440f;
    public g h;

    public e(a0 a0Var, boolean z10, long j10, long j11) {
        long j12;
        this.f13436a = a0Var;
        if (z10) {
            j12 = j10;
        } else {
            j12 = -9223372036854775807L;
        }
        this.d = j12;
        this.f13439e = j10;
        this.f13440f = j11;
    }

    public final boolean a() {
        if (this.d != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        return this.f13436a.b();
    }

    @Override
    public final void c(d1 d1Var) {
        a0 a0Var = (a0) d1Var;
        z zVar = this.f13437b;
        zVar.getClass();
        zVar.c(this);
    }

    @Override
    public final long d() {
        long d = this.f13436a.d();
        if (d != Long.MIN_VALUE) {
            long j10 = this.f13440f;
            if (j10 == Long.MIN_VALUE || d < j10) {
                return d;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final void f(a0 a0Var) {
        if (this.h != null) {
            return;
        }
        z zVar = this.f13437b;
        zVar.getClass();
        zVar.f(this);
    }

    @Override
    public final void g() {
        g gVar = this.h;
        if (gVar == null) {
            this.f13436a.g();
            return;
        }
        throw gVar;
    }

    @Override
    public final long i(long r7) {
        throw new UnsupportedOperationException("Method not decompiled: j4.e.i(long):long");
    }

    @Override
    public final void k(long j10) {
        this.f13436a.k(j10);
    }

    @Override
    public final boolean n(long j10) {
        return this.f13436a.n(j10);
    }

    @Override
    public final long o() {
        boolean z10;
        if (a()) {
            long j10 = this.d;
            this.d = -9223372036854775807L;
            long o6 = o();
            if (o6 != -9223372036854775807L) {
                return o6;
            }
            return j10;
        }
        long o9 = this.f13436a.o();
        if (o9 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z11 = false;
        if (o9 >= this.f13439e) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.i(z10);
        long j11 = this.f13440f;
        d5.a.i((j11 == Long.MIN_VALUE || o9 <= j11) ? true : true);
        return o9;
    }

    @Override
    public final j1 q() {
        return this.f13436a.q();
    }

    @Override
    public final long u(long j10, j2 j2Var) {
        long j11;
        long j12 = this.f13439e;
        if (j10 == j12) {
            return j12;
        }
        long i9 = d5.f0.i(j2Var.f9524a, 0L, j10 - j12);
        long j13 = j2Var.f9525b;
        long j14 = this.f13440f;
        if (j14 == Long.MIN_VALUE) {
            j11 = Long.MAX_VALUE;
        } else {
            j11 = j14 - j10;
        }
        long i10 = d5.f0.i(j13, 0L, j11);
        if (i9 != j2Var.f9524a || i10 != j2Var.f9525b) {
            j2Var = new j2(i9, i10);
        }
        return this.f13436a.u(j10, j2Var);
    }

    @Override
    public final long v() {
        long v = this.f13436a.v();
        if (v != Long.MIN_VALUE) {
            long j10 = this.f13440f;
            if (j10 == Long.MIN_VALUE || v < j10) {
                return v;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final void w(z zVar, long j10) {
        this.f13437b = zVar;
        this.f13436a.w(this, j10);
    }

    @Override
    public final long x(b5.t[] r15, boolean[] r16, j4.b1[] r17, boolean[] r18, long r19) {
        throw new UnsupportedOperationException("Method not decompiled: j4.e.x(b5.t[], boolean[], j4.b1[], boolean[], long):long");
    }

    @Override
    public final void z(long j10) {
        this.f13436a.z(j10);
    }
}
