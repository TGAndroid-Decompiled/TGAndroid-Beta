package l2;

import a8.ma;
import java.util.ArrayList;
import kg.y1;
public final class w0 {
    public final m2.d f19574c;
    public final h2.i0 d;
    public final y1 f19575e;
    public long f19576f;
    public int f19577g;
    public boolean h;
    public u0 f19578i;
    public u0 f19579j;
    public u0 f19580k;
    public u0 f19581l;
    public u0 f19582m;
    public int f19583n;
    public Object f19584o;
    public long f19585p;
    public final e2.i1 f19572a = new e2.i1();
    public final e2.k1 f19573b = new e2.k1();
    public ArrayList f19586q = new ArrayList();

    public w0(m2.d dVar, h2.i0 i0Var, y1 y1Var) {
        this.f19574c = dVar;
        this.d = i0Var;
        this.f19575e = y1Var;
    }

    public static x2.g0 o(e2.l1 l1Var, Object obj, long j3, long j10, e2.k1 k1Var, e2.i1 i1Var) {
        l1Var.g(obj, i1Var);
        l1Var.n(i1Var.f10428c, k1Var);
        l1Var.b(obj);
        int i7 = i1Var.f10431g.f10338a;
        if (i7 != 0) {
            if (i7 == 1) {
                i1Var.f(0);
            }
            i1Var.f10431g.getClass();
            i1Var.g(0);
        }
        l1Var.g(obj, i1Var);
        int c10 = i1Var.c(j3);
        if (c10 == -1) {
            return new x2.g0(obj, j10, i1Var.b(j3));
        }
        return new x2.g0(c10, i1Var.e(c10), -1, j10, obj);
    }

    public final u0 a() {
        u0 u0Var = this.f19578i;
        if (u0Var == null) {
            return null;
        }
        if (u0Var == this.f19579j) {
            this.f19579j = u0Var.f19555m;
        }
        if (u0Var == this.f19580k) {
            this.f19580k = u0Var.f19555m;
        }
        u0Var.i();
        int i7 = this.f19583n - 1;
        this.f19583n = i7;
        if (i7 == 0) {
            this.f19581l = null;
            u0 u0Var2 = this.f19578i;
            this.f19584o = u0Var2.f19546b;
            this.f19585p = u0Var2.f19550g.f19561a.d;
        }
        this.f19578i = this.f19578i.f19555m;
        l();
        return this.f19578i;
    }

    public final void b() {
        if (this.f19583n == 0) {
            return;
        }
        u0 u0Var = this.f19578i;
        u0Var.getClass();
        this.f19584o = u0Var.f19546b;
        this.f19585p = u0Var.f19550g.f19561a.d;
        while (u0Var != null) {
            u0Var.i();
            u0Var = u0Var.f19555m;
        }
        this.f19578i = null;
        this.f19581l = null;
        this.f19579j = null;
        this.f19580k = null;
        this.f19583n = 0;
        l();
    }

    public final l2.v0 c(e2.l1 r21, l2.u0 r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: l2.w0.c(e2.l1, l2.u0, long):l2.v0");
    }

    public final v0 d(e2.l1 l1Var, x2.g0 g0Var, long j3, long j10, long j11) {
        l1Var.g(g0Var.f60098a, this.f19572a);
        if (g0Var.b()) {
            return e(l1Var, g0Var.f60098a, g0Var.f60099b, g0Var.f60100c, j3, g0Var.d, false);
        }
        return f(l1Var, g0Var.f60098a, j10, j11, j3, g0Var.d, false);
    }

    public final v0 e(e2.l1 l1Var, Object obj, int i7, int i10, long j3, long j10, boolean z10) {
        x2.g0 g0Var = new x2.g0(i7, i10, -1, j10, obj);
        e2.i1 i1Var = this.f19572a;
        long a10 = l1Var.g(obj, i1Var).a(i7, i10);
        if (i10 == i1Var.e(i7)) {
            i1Var.f10431g.getClass();
        }
        i1Var.g(i7);
        long j11 = 0;
        if (a10 != -9223372036854775807L && 0 >= a10) {
            j11 = Math.max(0L, a10 - 1);
        }
        return new v0(g0Var, j11, -9223372036854775807L, j3, -9223372036854775807L, a10, z10, false, false, false, false);
    }

    public final v0 f(e2.l1 l1Var, Object obj, long j3, long j10, long j11, long j12, boolean z10) {
        long j13;
        long j14;
        long j15;
        e2.i1 i1Var = this.f19572a;
        l1Var.g(obj, i1Var);
        int b10 = i1Var.b(j3);
        boolean z11 = false;
        if (b10 == -1) {
            if (i1Var.f10431g.f10338a > 0) {
                i1Var.g(0);
            }
        } else {
            i1Var.g(b10);
        }
        x2.g0 g0Var = new x2.g0(obj, j12, b10);
        if (!g0Var.b() && b10 == -1) {
            z11 = true;
        }
        boolean j16 = j(l1Var, g0Var);
        boolean i7 = i(l1Var, g0Var, z11);
        if (b10 != -1) {
            i1Var.g(b10);
        }
        if (b10 != -1) {
            i1Var.f(b10);
        }
        if (b10 != -1) {
            i1Var.d(b10);
            j13 = 0;
        } else {
            j13 = -9223372036854775807L;
        }
        if (j13 != -9223372036854775807L && j13 != Long.MIN_VALUE) {
            j14 = j13;
        } else {
            j14 = i1Var.d;
        }
        if (j14 != -9223372036854775807L && j3 >= j14) {
            j15 = Math.max(0L, j14 - 1);
        } else {
            j15 = j3;
        }
        return new v0(g0Var, j15, j10, j11, j13, j14, z10, false, z11, j16, i7);
    }

    public final u0 g() {
        return this.f19580k;
    }

    public final v0 h(e2.l1 l1Var, v0 v0Var) {
        boolean z10;
        long j3;
        long j10;
        x2.g0 g0Var = v0Var.f19561a;
        boolean b10 = g0Var.b();
        int i7 = g0Var.f60101e;
        if (!b10 && i7 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        int i10 = g0Var.f60099b;
        boolean j11 = j(l1Var, g0Var);
        boolean i11 = i(l1Var, g0Var, z11);
        Object obj = g0Var.f60098a;
        e2.i1 i1Var = this.f19572a;
        l1Var.g(obj, i1Var);
        if (!g0Var.b() && i7 != -1) {
            i1Var.d(i7);
            j3 = 0;
        } else {
            j3 = -9223372036854775807L;
        }
        if (g0Var.b()) {
            j10 = i1Var.a(i10, g0Var.f60100c);
        } else if (j3 != -9223372036854775807L && j3 != Long.MIN_VALUE) {
            j10 = j3;
        } else {
            j10 = i1Var.d;
        }
        if (g0Var.b()) {
            i1Var.g(i10);
        } else if (i7 != -1) {
            i1Var.g(i7);
        }
        return new v0(g0Var, v0Var.f19562b, v0Var.f19563c, v0Var.d, j3, j10, v0Var.f19566g, false, z11, j11, i11);
    }

    public final boolean i(e2.l1 l1Var, x2.g0 g0Var, boolean z10) {
        int b10 = l1Var.b(g0Var.f60098a);
        if (!l1Var.m(l1Var.f(b10, this.f19572a, false).f10428c, this.f19573b, 0L).f10476i) {
            if (l1Var.d(b10, this.f19572a, this.f19573b, this.f19577g, this.h) == -1 && z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(e2.l1 l1Var, x2.g0 g0Var) {
        boolean z10;
        if (!g0Var.b() && g0Var.f60101e == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object obj = g0Var.f60098a;
        if (z10) {
            if (l1Var.m(l1Var.g(obj, this.f19572a).f10428c, this.f19573b, 0L).f10482o == l1Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        u0 u0Var = this.f19582m;
        if (u0Var == null || u0Var.h()) {
            this.f19582m = null;
            for (int i7 = 0; i7 < this.f19586q.size(); i7++) {
                u0 u0Var2 = (u0) this.f19586q.get(i7);
                if (!u0Var2.h()) {
                    this.f19582m = u0Var2;
                    return;
                }
            }
        }
    }

    public final void l() {
        x2.g0 g0Var;
        h9.f0 p10 = h9.i0.p();
        for (u0 u0Var = this.f19578i; u0Var != null; u0Var = u0Var.f19555m) {
            p10.c(u0Var.f19550g.f19561a);
        }
        u0 u0Var2 = this.f19579j;
        if (u0Var2 == null) {
            g0Var = null;
        } else {
            g0Var = u0Var2.f19550g.f19561a;
        }
        this.d.d(new kg.y(this, p10, g0Var, 10));
    }

    public final void m(long j3) {
        boolean z10;
        u0 u0Var = this.f19581l;
        if (u0Var != null) {
            if (u0Var.f19555m == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ma.p(z10);
            if (u0Var.f19548e) {
                u0Var.f19545a.u(j3 - u0Var.f19558p);
            }
        }
    }

    public final int n(u0 u0Var) {
        u0Var.getClass();
        int i7 = 0;
        if (u0Var.equals(this.f19581l)) {
            return 0;
        }
        this.f19581l = u0Var;
        while (true) {
            u0Var = u0Var.f19555m;
            if (u0Var == null) {
                break;
            }
            if (u0Var == this.f19579j) {
                u0 u0Var2 = this.f19578i;
                this.f19579j = u0Var2;
                this.f19580k = u0Var2;
                i7 = 3;
            }
            if (u0Var == this.f19580k) {
                this.f19580k = this.f19579j;
                i7 |= 2;
            }
            u0Var.i();
            this.f19583n--;
        }
        u0 u0Var3 = this.f19581l;
        u0Var3.getClass();
        if (u0Var3.f19555m != null) {
            u0Var3.b();
            u0Var3.f19555m = null;
            u0Var3.c();
        }
        l();
        return i7;
    }

    public final x2.g0 p(e2.l1 l1Var, Object obj, long j3) {
        long q10;
        int b10;
        Object obj2 = obj;
        e2.i1 i1Var = this.f19572a;
        int i7 = l1Var.g(obj2, i1Var).f10428c;
        Object obj3 = this.f19584o;
        if (obj3 != null && (b10 = l1Var.b(obj3)) != -1 && l1Var.f(b10, i1Var, false).f10428c == i7) {
            q10 = this.f19585p;
        } else {
            u0 u0Var = this.f19578i;
            while (true) {
                if (u0Var != null) {
                    if (u0Var.f19546b.equals(obj2)) {
                        q10 = u0Var.f19550g.f19561a.d;
                        break;
                    }
                    u0Var = u0Var.f19555m;
                } else {
                    u0 u0Var2 = this.f19578i;
                    while (true) {
                        if (u0Var2 != null) {
                            int b11 = l1Var.b(u0Var2.f19546b);
                            if (b11 != -1 && l1Var.f(b11, i1Var, false).f10428c == i7) {
                                q10 = u0Var2.f19550g.f19561a.d;
                                break;
                            }
                            u0Var2 = u0Var2.f19555m;
                        } else {
                            q10 = q(obj2);
                            if (q10 == -1) {
                                q10 = this.f19576f;
                                this.f19576f = 1 + q10;
                                if (this.f19578i == null) {
                                    this.f19584o = obj2;
                                    this.f19585p = q10;
                                }
                            }
                        }
                    }
                }
            }
        }
        l1Var.g(obj2, i1Var);
        int i10 = i1Var.f10428c;
        e2.k1 k1Var = this.f19573b;
        l1Var.n(i10, k1Var);
        boolean z10 = false;
        for (int b12 = l1Var.b(obj); b12 >= k1Var.f10481n; b12--) {
            boolean z11 = true;
            l1Var.f(b12, i1Var, true);
            if (i1Var.f10431g.f10338a <= 0) {
                z11 = false;
            }
            z10 |= z11;
            if (i1Var.c(i1Var.d) != -1) {
                obj2 = i1Var.f10427b;
                obj2.getClass();
            }
            if (z10 && (!z11 || i1Var.d != 0)) {
                break;
            }
        }
        return o(l1Var, obj2, j3, q10, this.f19573b, this.f19572a);
    }

    public final long q(Object obj) {
        for (int i7 = 0; i7 < this.f19586q.size(); i7++) {
            u0 u0Var = (u0) this.f19586q.get(i7);
            if (u0Var.f19546b.equals(obj)) {
                return u0Var.f19550g.f19561a.d;
            }
        }
        return -1L;
    }

    public final int r(e2.l1 l1Var) {
        e2.l1 l1Var2;
        u0 u0Var;
        u0 u0Var2 = this.f19578i;
        if (u0Var2 == null) {
            return 0;
        }
        int b10 = l1Var.b(u0Var2.f19546b);
        while (true) {
            l1Var2 = l1Var;
            b10 = l1Var2.d(b10, this.f19572a, this.f19573b, this.f19577g, this.h);
            while (true) {
                u0Var2.getClass();
                u0Var = u0Var2.f19555m;
                if (u0Var == null || u0Var2.f19550g.f19567i) {
                    break;
                }
                u0Var2 = u0Var;
            }
            if (b10 == -1 || u0Var == null || l1Var2.b(u0Var.f19546b) != b10) {
                break;
            }
            u0Var2 = u0Var;
            l1Var = l1Var2;
        }
        int n10 = n(u0Var2);
        u0Var2.f19550g = h(l1Var2, u0Var2.f19550g);
        return n10;
    }

    public final int s(e2.l1 r23, long r24, long r26, long r28) {
        throw new UnsupportedOperationException("Method not decompiled: l2.w0.s(e2.l1, long, long, long):int");
    }
}
