package defpackage;

import android.os.SystemClock;
import java.util.List;
public final class be8 {
    public static final rz6 u = new rz6(new Object());
    public final bqb a;
    public final rz6 b;
    public final long c;
    public final long d;
    public final int e;
    public final u64 f;
    public final boolean g;
    public final vzb h;
    public final e0c i;
    public final List j;
    public final rz6 k;
    public final boolean l;
    public final int m;
    public final int n;
    public final ce8 o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public be8(bqb bqbVar, rz6 rz6Var, long j, long j2, int i, u64 u64Var, boolean z, vzb vzbVar, e0c e0cVar, List list, rz6 rz6Var2, boolean z2, int i2, int i3, ce8 ce8Var, long j3, long j4, long j5, long j6, boolean z3) {
        this.a = bqbVar;
        this.b = rz6Var;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = u64Var;
        this.g = z;
        this.h = vzbVar;
        this.i = e0cVar;
        this.j = list;
        this.k = rz6Var2;
        this.l = z2;
        this.m = i2;
        this.n = i3;
        this.o = ce8Var;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.t = j6;
        this.p = z3;
    }

    public static be8 k(e0c e0cVar) {
        xpb xpbVar = bqb.a;
        vzb vzbVar = vzb.d;
        ko5 ko5Var = mo5.b;
        y79 y79Var = y79.e;
        ce8 ce8Var = ce8.d;
        rz6 rz6Var = u;
        return new be8(xpbVar, rz6Var, -9223372036854775807L, 0L, 1, null, false, vzbVar, e0cVar, y79Var, rz6Var, false, 1, 0, ce8Var, 0L, 0L, 0L, 0L, false);
    }

    public final be8 a() {
        return new be8(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, l(), SystemClock.elapsedRealtime(), this.p);
    }

    public final be8 b(boolean z) {
        return new be8(this.a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final be8 c(rz6 rz6Var) {
        return new be8(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, rz6Var, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final be8 d(rz6 rz6Var, long j, long j2, long j3, long j4, vzb vzbVar, e0c e0cVar, List list) {
        return new be8(this.a, rz6Var, j2, j3, this.e, this.f, this.g, vzbVar, e0cVar, list, this.k, this.l, this.m, this.n, this.o, this.q, j4, j, SystemClock.elapsedRealtime(), this.p);
    }

    public final be8 e(int i, int i2, boolean z) {
        return new be8(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, i2, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final be8 f(u64 u64Var) {
        return new be8(this.a, this.b, this.c, this.d, this.e, u64Var, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final be8 g(ce8 ce8Var) {
        return new be8(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, ce8Var, this.q, this.r, this.s, this.t, this.p);
    }

    public final be8 h(int i) {
        return new be8(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final be8 i(boolean z) {
        return new be8(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, z);
    }

    public final be8 j(bqb bqbVar) {
        return new be8(bqbVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
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
        return hac.T(hac.i0(j2) + (((float) (SystemClock.elapsedRealtime() - j)) * this.o.a));
    }

    public final boolean m() {
        if (this.e == 3 && this.l && this.n == 0) {
            return true;
        }
        return false;
    }
}
