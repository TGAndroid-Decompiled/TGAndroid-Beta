package o4;

import j3.h2;
public final class d implements t, s {
    public final t f16308a;
    public s f16309b;
    public c[] f16310c = new c[0];
    public long d;
    public long e;
    public long f16311f;

    public d(t tVar, boolean z4, long j10, long j11) {
        long j12;
        this.f16308a = tVar;
        if (z4) {
            j12 = j10;
        } else {
            j12 = -9223372036854775807L;
        }
        this.d = j12;
        this.e = j10;
        this.f16311f = j11;
    }

    @Override
    public final void B(long j10) {
        this.f16308a.B(j10);
    }

    @Override
    public final boolean C(long j10) {
        return this.f16308a.C(j10);
    }

    @Override
    public final long K() {
        boolean z4;
        if (a()) {
            long j10 = this.d;
            this.d = -9223372036854775807L;
            long K = K();
            if (K != -9223372036854775807L) {
                return K;
            }
            return j10;
        }
        long K2 = this.f16308a.K();
        if (K2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z10 = false;
        if (K2 >= this.e) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.i(z4);
        long j11 = this.f16311f;
        h5.a.i((j11 == Long.MIN_VALUE || K2 <= j11) ? true : true);
        return K2;
    }

    @Override
    public final t0 V() {
        return this.f16308a.V();
    }

    @Override
    public final long X() {
        long X = this.f16308a.X();
        if (X != Long.MIN_VALUE) {
            long j10 = this.f16311f;
            if (j10 == Long.MIN_VALUE || X < j10) {
                return X;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final void Z(n0 n0Var) {
        t tVar = (t) n0Var;
        s sVar = this.f16309b;
        sVar.getClass();
        sVar.Z(this);
    }

    public final boolean a() {
        if (this.d != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        return this.f16308a.b();
    }

    @Override
    public final void f0(long j10) {
        this.f16308a.f0(j10);
    }

    @Override
    public final long h(long j10, h2 h2Var) {
        long j11;
        long j12 = this.e;
        if (j10 == j12) {
            return j12;
        }
        long i10 = h5.d0.i(h2Var.f8610a, 0L, j10 - j12);
        long j13 = h2Var.f8611b;
        long j14 = this.f16311f;
        if (j14 == Long.MIN_VALUE) {
            j11 = Long.MAX_VALUE;
        } else {
            j11 = j14 - j10;
        }
        long i11 = h5.d0.i(j13, 0L, j11);
        if (i10 != h2Var.f8610a || i11 != h2Var.f8611b) {
            h2Var = new h2(i10, i11);
        }
        return this.f16308a.h(j10, h2Var);
    }

    @Override
    public final long l() {
        long l10 = this.f16308a.l();
        if (l10 != Long.MIN_VALUE) {
            long j10 = this.f16311f;
            if (j10 == Long.MIN_VALUE || l10 < j10) {
                return l10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final void n(t tVar) {
        s sVar = this.f16309b;
        sVar.getClass();
        sVar.n(this);
    }

    @Override
    public final void p(s sVar, long j10) {
        this.f16309b = sVar;
        this.f16308a.p(this, j10);
    }

    @Override
    public final long v(f5.c[] r15, boolean[] r16, o4.l0[] r17, boolean[] r18, long r19) {
        throw new UnsupportedOperationException("Method not decompiled: o4.d.v(f5.c[], boolean[], o4.l0[], boolean[], long):long");
    }

    @Override
    public final void x() {
        this.f16308a.x();
    }

    @Override
    public final long z(long r7) {
        throw new UnsupportedOperationException("Method not decompiled: o4.d.z(long):long");
    }
}
