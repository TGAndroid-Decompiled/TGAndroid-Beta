package defpackage;

import android.os.SystemClock;
import java.util.List;
public final class yb8 {
    public static final rx6 u = new rx6(new Object());
    public final aob a;
    public final rx6 b;
    public final long c;
    public final long d;
    public final int e;
    public final j54 f;
    public final boolean g;
    public final txb h;
    public final cyb i;
    public final List j;
    public final rx6 k;
    public final boolean l;
    public final int m;
    public final int n;
    public final zb8 o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public yb8(aob aobVar, rx6 rx6Var, long j, long j2, int i, j54 j54Var, boolean z, txb txbVar, cyb cybVar, List list, rx6 rx6Var2, boolean z2, int i2, int i3, zb8 zb8Var, long j3, long j4, long j5, long j6, boolean z3) {
        this.a = aobVar;
        this.b = rx6Var;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = j54Var;
        this.g = z;
        this.h = txbVar;
        this.i = cybVar;
        this.j = list;
        this.k = rx6Var2;
        this.l = z2;
        this.m = i2;
        this.n = i3;
        this.o = zb8Var;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.t = j6;
        this.p = z3;
    }

    public static yb8 k(cyb cybVar) {
        wnb wnbVar = aob.a;
        txb txbVar = txb.d;
        km5 km5Var = mm5.b;
        w59 w59Var = w59.e;
        zb8 zb8Var = zb8.d;
        rx6 rx6Var = u;
        return new yb8(wnbVar, rx6Var, -9223372036854775807L, 0L, 1, null, false, txbVar, cybVar, w59Var, rx6Var, false, 1, 0, zb8Var, 0L, 0L, 0L, 0L, false);
    }

    public final yb8 a() {
        return new yb8(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, l(), SystemClock.elapsedRealtime(), this.p);
    }

    public final yb8 b(boolean z) {
        return new yb8(this.a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final yb8 c(rx6 rx6Var) {
        return new yb8(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, rx6Var, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final yb8 d(rx6 rx6Var, long j, long j2, long j3, long j4, txb txbVar, cyb cybVar, List list) {
        return new yb8(this.a, rx6Var, j2, j3, this.e, this.f, this.g, txbVar, cybVar, list, this.k, this.l, this.m, this.n, this.o, this.q, j4, j, SystemClock.elapsedRealtime(), this.p);
    }

    public final yb8 e(int i, int i2, boolean z) {
        return new yb8(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, i2, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final yb8 f(j54 j54Var) {
        return new yb8(this.a, this.b, this.c, this.d, this.e, j54Var, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final yb8 g(zb8 zb8Var) {
        return new yb8(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, zb8Var, this.q, this.r, this.s, this.t, this.p);
    }

    public final yb8 h(int i) {
        return new yb8(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final yb8 i(boolean z) {
        return new yb8(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, z);
    }

    public final yb8 j(aob aobVar) {
        return new yb8(aobVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final long l() {
        long j;
        long j2;
        if (!m()) {
            return this.s;
        }
        do {
            j = this.t;
            j2 = this.s;
        } while (j != this.t);
        return g8c.T(g8c.i0(j2) + (((float) (SystemClock.elapsedRealtime() - j)) * this.o.a));
    }

    public final boolean m() {
        if (this.e == 3 && this.l && this.n == 0) {
            return true;
        }
        return false;
    }
}
