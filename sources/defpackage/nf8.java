package defpackage;

import android.os.SystemClock;
import java.util.List;
public final class nf8 {
    public static final vz6 u = new vz6(new Object());
    public final asb a;
    public final vz6 b;
    public final long c;
    public final long d;
    public final int e;
    public final e64 f;
    public final boolean g;
    public final u1c h;
    public final d2c i;
    public final List j;
    public final vz6 k;
    public final boolean l;
    public final int m;
    public final int n;
    public final of8 o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public nf8(asb asbVar, vz6 vz6Var, long j, long j2, int i, e64 e64Var, boolean z, u1c u1cVar, d2c d2cVar, List list, vz6 vz6Var2, boolean z2, int i2, int i3, of8 of8Var, long j3, long j4, long j5, long j6, boolean z3) {
        this.a = asbVar;
        this.b = vz6Var;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = e64Var;
        this.g = z;
        this.h = u1cVar;
        this.i = d2cVar;
        this.j = list;
        this.k = vz6Var2;
        this.l = z2;
        this.m = i2;
        this.n = i3;
        this.o = of8Var;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.t = j6;
        this.p = z3;
    }

    public static nf8 k(d2c d2cVar) {
        wrb wrbVar = asb.a;
        u1c u1cVar = u1c.d;
        no5 no5Var = po5.b;
        j99 j99Var = j99.e;
        of8 of8Var = of8.d;
        vz6 vz6Var = u;
        return new nf8(wrbVar, vz6Var, -9223372036854775807L, 0L, 1, null, false, u1cVar, d2cVar, j99Var, vz6Var, false, 1, 0, of8Var, 0L, 0L, 0L, 0L, false);
    }

    public final nf8 a() {
        return new nf8(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, l(), SystemClock.elapsedRealtime(), this.p);
    }

    public final nf8 b(boolean z) {
        return new nf8(this.a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final nf8 c(vz6 vz6Var) {
        return new nf8(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, vz6Var, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final nf8 d(vz6 vz6Var, long j, long j2, long j3, long j4, u1c u1cVar, d2c d2cVar, List list) {
        return new nf8(this.a, vz6Var, j2, j3, this.e, this.f, this.g, u1cVar, d2cVar, list, this.k, this.l, this.m, this.n, this.o, this.q, j4, j, SystemClock.elapsedRealtime(), this.p);
    }

    public final nf8 e(int i, int i2, boolean z) {
        return new nf8(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, i2, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final nf8 f(e64 e64Var) {
        return new nf8(this.a, this.b, this.c, this.d, this.e, e64Var, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final nf8 g(of8 of8Var) {
        return new nf8(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, of8Var, this.q, this.r, this.s, this.t, this.p);
    }

    public final nf8 h(int i) {
        return new nf8(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final nf8 i(boolean z) {
        return new nf8(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, z);
    }

    public final nf8 j(asb asbVar) {
        return new nf8(asbVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
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
        return gcc.T(gcc.i0(j2) + (((float) (SystemClock.elapsedRealtime() - j)) * this.o.a));
    }

    public final boolean m() {
        if (this.e == 3 && this.l && this.n == 0) {
            return true;
        }
        return false;
    }
}
