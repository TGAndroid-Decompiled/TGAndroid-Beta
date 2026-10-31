package i2;

import java.util.ArrayList;
import v7.t6;
public final class a1 {
    public final j2.g f7795c;
    public final e2.i0 d;
    public final a1.c e;
    public long f7796f;
    public int f7797g;
    public boolean h;
    public y0 f7798i;
    public y0 f7799j;
    public y0 f7800k;
    public y0 f7801l;
    public y0 f7802m;
    public int f7803n;
    public Object f7804o;
    public long f7805p;
    public final b2.l1 f7793a = new b2.l1();
    public final b2.n1 f7794b = new b2.n1();
    public ArrayList f7806q = new ArrayList();

    public a1(j2.g gVar, e2.i0 i0Var, a1.c cVar) {
        this.f7795c = gVar;
        this.d = i0Var;
        this.e = cVar;
    }

    public static u2.g0 o(b2.o1 o1Var, Object obj, long j10, long j11, b2.n1 n1Var, b2.l1 l1Var) {
        o1Var.g(obj, l1Var);
        o1Var.n(l1Var.f2109c, n1Var);
        o1Var.b(obj);
        int i10 = l1Var.f2111g.f1991a;
        if (i10 != 0) {
            if (i10 == 1) {
                l1Var.f(0);
            }
            l1Var.f2111g.getClass();
            l1Var.g(0);
        }
        o1Var.g(obj, l1Var);
        int c10 = l1Var.c(j10);
        if (c10 == -1) {
            return new u2.g0(obj, j11, l1Var.b(j10));
        }
        return new u2.g0(c10, l1Var.e(c10), -1, j11, obj);
    }

    public final y0 a() {
        y0 y0Var = this.f7798i;
        if (y0Var == null) {
            return null;
        }
        if (y0Var == this.f7799j) {
            this.f7799j = y0Var.f8126m;
        }
        if (y0Var == this.f7800k) {
            this.f7800k = y0Var.f8126m;
        }
        y0Var.i();
        int i10 = this.f7803n - 1;
        this.f7803n = i10;
        if (i10 == 0) {
            this.f7801l = null;
            y0 y0Var2 = this.f7798i;
            this.f7804o = y0Var2.f8118b;
            this.f7805p = y0Var2.f8121g.f8132a.d;
        }
        this.f7798i = this.f7798i.f8126m;
        l();
        return this.f7798i;
    }

    public final void b() {
        if (this.f7803n == 0) {
            return;
        }
        y0 y0Var = this.f7798i;
        y0Var.getClass();
        this.f7804o = y0Var.f8118b;
        this.f7805p = y0Var.f8121g.f8132a.d;
        while (y0Var != null) {
            y0Var.i();
            y0Var = y0Var.f8126m;
        }
        this.f7798i = null;
        this.f7801l = null;
        this.f7799j = null;
        this.f7800k = null;
        this.f7803n = 0;
        l();
    }

    public final i2.z0 c(b2.o1 r21, i2.y0 r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: i2.a1.c(b2.o1, i2.y0, long):i2.z0");
    }

    public final z0 d(b2.o1 o1Var, u2.g0 g0Var, long j10, long j11, long j12) {
        o1Var.g(g0Var.f49875a, this.f7793a);
        if (g0Var.b()) {
            return e(o1Var, g0Var.f49875a, g0Var.f49876b, g0Var.f49877c, j10, g0Var.d, false);
        }
        return f(o1Var, g0Var.f49875a, j11, j12, j10, g0Var.d, false);
    }

    public final z0 e(b2.o1 o1Var, Object obj, int i10, int i11, long j10, long j11, boolean z10) {
        u2.g0 g0Var = new u2.g0(i10, i11, -1, j11, obj);
        b2.l1 l1Var = this.f7793a;
        long a2 = o1Var.g(obj, l1Var).a(i10, i11);
        if (i11 == l1Var.e(i10)) {
            l1Var.f2111g.getClass();
        }
        l1Var.g(i10);
        long j12 = 0;
        if (a2 != -9223372036854775807L && 0 >= a2) {
            j12 = Math.max(0L, a2 - 1);
        }
        return new z0(g0Var, j12, -9223372036854775807L, j10, -9223372036854775807L, a2, z10, false, false, false, false);
    }

    public final z0 f(b2.o1 o1Var, Object obj, long j10, long j11, long j12, long j13, boolean z10) {
        long j14;
        long j15;
        long j16;
        b2.l1 l1Var = this.f7793a;
        o1Var.g(obj, l1Var);
        int b10 = l1Var.b(j10);
        boolean z11 = false;
        if (b10 == -1) {
            if (l1Var.f2111g.f1991a > 0) {
                l1Var.g(0);
            }
        } else {
            l1Var.g(b10);
        }
        u2.g0 g0Var = new u2.g0(obj, j13, b10);
        if (!g0Var.b() && b10 == -1) {
            z11 = true;
        }
        boolean j17 = j(o1Var, g0Var);
        boolean i10 = i(o1Var, g0Var, z11);
        if (b10 != -1) {
            l1Var.g(b10);
        }
        if (b10 != -1) {
            l1Var.f(b10);
        }
        if (b10 != -1) {
            l1Var.d(b10);
            j14 = 0;
        } else {
            j14 = -9223372036854775807L;
        }
        if (j14 != -9223372036854775807L && j14 != Long.MIN_VALUE) {
            j15 = j14;
        } else {
            j15 = l1Var.d;
        }
        if (j15 != -9223372036854775807L && j10 >= j15) {
            j16 = Math.max(0L, j15 - 1);
        } else {
            j16 = j10;
        }
        return new z0(g0Var, j16, j11, j12, j14, j15, z10, false, z11, j17, i10);
    }

    public final y0 g() {
        return this.f7800k;
    }

    public final z0 h(b2.o1 o1Var, z0 z0Var) {
        boolean z10;
        long j10;
        long j11;
        u2.g0 g0Var = z0Var.f8132a;
        boolean b10 = g0Var.b();
        int i10 = g0Var.e;
        if (!b10 && i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        int i11 = g0Var.f49876b;
        boolean j12 = j(o1Var, g0Var);
        boolean i12 = i(o1Var, g0Var, z11);
        Object obj = g0Var.f49875a;
        b2.l1 l1Var = this.f7793a;
        o1Var.g(obj, l1Var);
        if (!g0Var.b() && i10 != -1) {
            l1Var.d(i10);
            j10 = 0;
        } else {
            j10 = -9223372036854775807L;
        }
        if (g0Var.b()) {
            j11 = l1Var.a(i11, g0Var.f49877c);
        } else if (j10 != -9223372036854775807L && j10 != Long.MIN_VALUE) {
            j11 = j10;
        } else {
            j11 = l1Var.d;
        }
        if (g0Var.b()) {
            l1Var.g(i11);
        } else if (i10 != -1) {
            l1Var.g(i10);
        }
        return new z0(g0Var, z0Var.f8133b, z0Var.f8134c, z0Var.d, j10, j11, z0Var.f8136g, false, z11, j12, i12);
    }

    public final boolean i(b2.o1 o1Var, u2.g0 g0Var, boolean z10) {
        int b10 = o1Var.b(g0Var.f49875a);
        if (!o1Var.m(o1Var.f(b10, this.f7793a, false).f2109c, this.f7794b, 0L).f2142i) {
            if (o1Var.d(b10, this.f7793a, this.f7794b, this.f7797g, this.h) == -1 && z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(b2.o1 o1Var, u2.g0 g0Var) {
        boolean z10;
        if (!g0Var.b() && g0Var.e == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object obj = g0Var.f49875a;
        if (z10) {
            if (o1Var.m(o1Var.g(obj, this.f7793a).f2109c, this.f7794b, 0L).f2148o == o1Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        y0 y0Var = this.f7802m;
        if (y0Var == null || y0Var.h()) {
            this.f7802m = null;
            for (int i10 = 0; i10 < this.f7806q.size(); i10++) {
                y0 y0Var2 = (y0) this.f7806q.get(i10);
                if (!y0Var2.h()) {
                    this.f7802m = y0Var2;
                    return;
                }
            }
        }
    }

    public final void l() {
        u2.g0 g0Var;
        e9.k0 t10 = e9.n0.t();
        for (y0 y0Var = this.f7798i; y0Var != null; y0Var = y0Var.f8126m) {
            t10.c(y0Var.f8121g.f8132a);
        }
        y0 y0Var2 = this.f7799j;
        if (y0Var2 == null) {
            g0Var = null;
        } else {
            g0Var = y0Var2.f8121g.f8132a;
        }
        this.d.d(new a3.l0(this, t10, g0Var, 22));
    }

    public final void m(long j10) {
        boolean z10;
        y0 y0Var = this.f7801l;
        if (y0Var != null) {
            if (y0Var.f8126m == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            t6.p(z10);
            if (y0Var.e) {
                y0Var.f8117a.u(j10 - y0Var.f8129p);
            }
        }
    }

    public final int n(y0 y0Var) {
        y0Var.getClass();
        int i10 = 0;
        if (y0Var.equals(this.f7801l)) {
            return 0;
        }
        this.f7801l = y0Var;
        while (true) {
            y0Var = y0Var.f8126m;
            if (y0Var == null) {
                break;
            }
            if (y0Var == this.f7799j) {
                y0 y0Var2 = this.f7798i;
                this.f7799j = y0Var2;
                this.f7800k = y0Var2;
                i10 = 3;
            }
            if (y0Var == this.f7800k) {
                this.f7800k = this.f7799j;
                i10 |= 2;
            }
            y0Var.i();
            this.f7803n--;
        }
        y0 y0Var3 = this.f7801l;
        y0Var3.getClass();
        if (y0Var3.f8126m != null) {
            y0Var3.b();
            y0Var3.f8126m = null;
            y0Var3.c();
        }
        l();
        return i10;
    }

    public final u2.g0 p(b2.o1 o1Var, Object obj, long j10) {
        long q6;
        int b10;
        Object obj2 = obj;
        b2.l1 l1Var = this.f7793a;
        int i10 = o1Var.g(obj2, l1Var).f2109c;
        Object obj3 = this.f7804o;
        if (obj3 != null && (b10 = o1Var.b(obj3)) != -1 && o1Var.f(b10, l1Var, false).f2109c == i10) {
            q6 = this.f7805p;
        } else {
            y0 y0Var = this.f7798i;
            while (true) {
                if (y0Var != null) {
                    if (y0Var.f8118b.equals(obj2)) {
                        q6 = y0Var.f8121g.f8132a.d;
                        break;
                    }
                    y0Var = y0Var.f8126m;
                } else {
                    y0 y0Var2 = this.f7798i;
                    while (true) {
                        if (y0Var2 != null) {
                            int b11 = o1Var.b(y0Var2.f8118b);
                            if (b11 != -1 && o1Var.f(b11, l1Var, false).f2109c == i10) {
                                q6 = y0Var2.f8121g.f8132a.d;
                                break;
                            }
                            y0Var2 = y0Var2.f8126m;
                        } else {
                            q6 = q(obj2);
                            if (q6 == -1) {
                                q6 = this.f7796f;
                                this.f7796f = 1 + q6;
                                if (this.f7798i == null) {
                                    this.f7804o = obj2;
                                    this.f7805p = q6;
                                }
                            }
                        }
                    }
                }
            }
        }
        o1Var.g(obj2, l1Var);
        int i11 = l1Var.f2109c;
        b2.n1 n1Var = this.f7794b;
        o1Var.n(i11, n1Var);
        boolean z10 = false;
        for (int b12 = o1Var.b(obj); b12 >= n1Var.f2147n; b12--) {
            boolean z11 = true;
            o1Var.f(b12, l1Var, true);
            if (l1Var.f2111g.f1991a <= 0) {
                z11 = false;
            }
            z10 |= z11;
            if (l1Var.c(l1Var.d) != -1) {
                obj2 = l1Var.f2108b;
                obj2.getClass();
            }
            if (z10 && (!z11 || l1Var.d != 0)) {
                break;
            }
        }
        return o(o1Var, obj2, j10, q6, this.f7794b, this.f7793a);
    }

    public final long q(Object obj) {
        for (int i10 = 0; i10 < this.f7806q.size(); i10++) {
            y0 y0Var = (y0) this.f7806q.get(i10);
            if (y0Var.f8118b.equals(obj)) {
                return y0Var.f8121g.f8132a.d;
            }
        }
        return -1L;
    }

    public final int r(b2.o1 o1Var) {
        b2.o1 o1Var2;
        y0 y0Var;
        y0 y0Var2 = this.f7798i;
        if (y0Var2 == null) {
            return 0;
        }
        int b10 = o1Var.b(y0Var2.f8118b);
        while (true) {
            o1Var2 = o1Var;
            b10 = o1Var2.d(b10, this.f7793a, this.f7794b, this.f7797g, this.h);
            while (true) {
                y0Var2.getClass();
                y0Var = y0Var2.f8126m;
                if (y0Var == null || y0Var2.f8121g.f8137i) {
                    break;
                }
                y0Var2 = y0Var;
            }
            if (b10 == -1 || y0Var == null || o1Var2.b(y0Var.f8118b) != b10) {
                break;
            }
            y0Var2 = y0Var;
            o1Var = o1Var2;
        }
        int n10 = n(y0Var2);
        y0Var2.f8121g = h(o1Var2, y0Var2.f8121g);
        return n10;
    }

    public final int s(b2.o1 r23, long r24, long r26, long r28) {
        throw new UnsupportedOperationException("Method not decompiled: i2.a1.s(b2.o1, long, long, long):int");
    }
}
