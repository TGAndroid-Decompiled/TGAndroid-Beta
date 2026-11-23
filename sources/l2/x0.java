package l2;

import a8.ma;
import java.util.ArrayList;
public final class x0 {
    public final m2.d f19678c;
    public final h2.i0 d;
    public final kg.f1 f19679e;
    public long f19680f;
    public int f19681g;
    public boolean h;
    public v0 f19682i;
    public v0 f19683j;
    public v0 f19684k;
    public v0 f19685l;
    public v0 f19686m;
    public int f19687n;
    public Object f19688o;
    public long f19689p;
    public final e2.i1 f19676a = new e2.i1();
    public final e2.k1 f19677b = new e2.k1();
    public ArrayList f19690q = new ArrayList();

    public x0(m2.d dVar, h2.i0 i0Var, kg.f1 f1Var) {
        this.f19678c = dVar;
        this.d = i0Var;
        this.f19679e = f1Var;
    }

    public static x2.g0 o(e2.l1 l1Var, Object obj, long j3, long j10, e2.k1 k1Var, e2.i1 i1Var) {
        l1Var.g(obj, i1Var);
        l1Var.n(i1Var.f10426c, k1Var);
        l1Var.b(obj);
        int i7 = i1Var.f10429g.f10336a;
        if (i7 != 0) {
            if (i7 == 1) {
                i1Var.f(0);
            }
            i1Var.f10429g.getClass();
            i1Var.g(0);
        }
        l1Var.g(obj, i1Var);
        int c10 = i1Var.c(j3);
        if (c10 == -1) {
            return new x2.g0(obj, j10, i1Var.b(j3));
        }
        return new x2.g0(c10, i1Var.e(c10), -1, j10, obj);
    }

    public final v0 a() {
        v0 v0Var = this.f19682i;
        if (v0Var == null) {
            return null;
        }
        if (v0Var == this.f19683j) {
            this.f19683j = v0Var.f19659m;
        }
        if (v0Var == this.f19684k) {
            this.f19684k = v0Var.f19659m;
        }
        v0Var.i();
        int i7 = this.f19687n - 1;
        this.f19687n = i7;
        if (i7 == 0) {
            this.f19685l = null;
            v0 v0Var2 = this.f19682i;
            this.f19688o = v0Var2.f19650b;
            this.f19689p = v0Var2.f19654g.f19665a.d;
        }
        this.f19682i = this.f19682i.f19659m;
        l();
        return this.f19682i;
    }

    public final void b() {
        if (this.f19687n == 0) {
            return;
        }
        v0 v0Var = this.f19682i;
        v0Var.getClass();
        this.f19688o = v0Var.f19650b;
        this.f19689p = v0Var.f19654g.f19665a.d;
        while (v0Var != null) {
            v0Var.i();
            v0Var = v0Var.f19659m;
        }
        this.f19682i = null;
        this.f19685l = null;
        this.f19683j = null;
        this.f19684k = null;
        this.f19687n = 0;
        l();
    }

    public final l2.w0 c(e2.l1 r21, l2.v0 r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: l2.x0.c(e2.l1, l2.v0, long):l2.w0");
    }

    public final w0 d(e2.l1 l1Var, x2.g0 g0Var, long j3, long j10, long j11) {
        l1Var.g(g0Var.f60216a, this.f19676a);
        if (g0Var.b()) {
            return e(l1Var, g0Var.f60216a, g0Var.f60217b, g0Var.f60218c, j3, g0Var.d, false);
        }
        return f(l1Var, g0Var.f60216a, j10, j11, j3, g0Var.d, false);
    }

    public final w0 e(e2.l1 l1Var, Object obj, int i7, int i10, long j3, long j10, boolean z10) {
        x2.g0 g0Var = new x2.g0(i7, i10, -1, j10, obj);
        e2.i1 i1Var = this.f19676a;
        long a10 = l1Var.g(obj, i1Var).a(i7, i10);
        if (i10 == i1Var.e(i7)) {
            i1Var.f10429g.getClass();
        }
        i1Var.g(i7);
        long j11 = 0;
        if (a10 != -9223372036854775807L && 0 >= a10) {
            j11 = Math.max(0L, a10 - 1);
        }
        return new w0(g0Var, j11, -9223372036854775807L, j3, -9223372036854775807L, a10, z10, false, false, false, false);
    }

    public final w0 f(e2.l1 l1Var, Object obj, long j3, long j10, long j11, long j12, boolean z10) {
        long j13;
        long j14;
        long j15;
        e2.i1 i1Var = this.f19676a;
        l1Var.g(obj, i1Var);
        int b10 = i1Var.b(j3);
        boolean z11 = false;
        if (b10 == -1) {
            if (i1Var.f10429g.f10336a > 0) {
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
        return new w0(g0Var, j15, j10, j11, j13, j14, z10, false, z11, j16, i7);
    }

    public final v0 g() {
        return this.f19684k;
    }

    public final w0 h(e2.l1 l1Var, w0 w0Var) {
        boolean z10;
        long j3;
        long j10;
        x2.g0 g0Var = w0Var.f19665a;
        boolean b10 = g0Var.b();
        int i7 = g0Var.f60219e;
        if (!b10 && i7 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        int i10 = g0Var.f60217b;
        boolean j11 = j(l1Var, g0Var);
        boolean i11 = i(l1Var, g0Var, z11);
        Object obj = g0Var.f60216a;
        e2.i1 i1Var = this.f19676a;
        l1Var.g(obj, i1Var);
        if (!g0Var.b() && i7 != -1) {
            i1Var.d(i7);
            j3 = 0;
        } else {
            j3 = -9223372036854775807L;
        }
        if (g0Var.b()) {
            j10 = i1Var.a(i10, g0Var.f60218c);
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
        return new w0(g0Var, w0Var.f19666b, w0Var.f19667c, w0Var.d, j3, j10, w0Var.f19670g, false, z11, j11, i11);
    }

    public final boolean i(e2.l1 l1Var, x2.g0 g0Var, boolean z10) {
        int b10 = l1Var.b(g0Var.f60216a);
        if (!l1Var.m(l1Var.f(b10, this.f19676a, false).f10426c, this.f19677b, 0L).f10474i) {
            if (l1Var.d(b10, this.f19676a, this.f19677b, this.f19681g, this.h) == -1 && z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(e2.l1 l1Var, x2.g0 g0Var) {
        boolean z10;
        if (!g0Var.b() && g0Var.f60219e == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object obj = g0Var.f60216a;
        if (z10) {
            if (l1Var.m(l1Var.g(obj, this.f19676a).f10426c, this.f19677b, 0L).f10480o == l1Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        v0 v0Var = this.f19686m;
        if (v0Var == null || v0Var.h()) {
            this.f19686m = null;
            for (int i7 = 0; i7 < this.f19690q.size(); i7++) {
                v0 v0Var2 = (v0) this.f19690q.get(i7);
                if (!v0Var2.h()) {
                    this.f19686m = v0Var2;
                    return;
                }
            }
        }
    }

    public final void l() {
        x2.g0 g0Var;
        h9.f0 p10 = h9.i0.p();
        for (v0 v0Var = this.f19682i; v0Var != null; v0Var = v0Var.f19659m) {
            p10.c(v0Var.f19654g.f19665a);
        }
        v0 v0Var2 = this.f19683j;
        if (v0Var2 == null) {
            g0Var = null;
        } else {
            g0Var = v0Var2.f19654g.f19665a;
        }
        this.d.d(new kg.x(this, p10, g0Var, 11));
    }

    public final void m(long j3) {
        boolean z10;
        v0 v0Var = this.f19685l;
        if (v0Var != null) {
            if (v0Var.f19659m == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ma.p(z10);
            if (v0Var.f19652e) {
                v0Var.f19649a.u(j3 - v0Var.f19662p);
            }
        }
    }

    public final int n(v0 v0Var) {
        v0Var.getClass();
        int i7 = 0;
        if (v0Var.equals(this.f19685l)) {
            return 0;
        }
        this.f19685l = v0Var;
        while (true) {
            v0Var = v0Var.f19659m;
            if (v0Var == null) {
                break;
            }
            if (v0Var == this.f19683j) {
                v0 v0Var2 = this.f19682i;
                this.f19683j = v0Var2;
                this.f19684k = v0Var2;
                i7 = 3;
            }
            if (v0Var == this.f19684k) {
                this.f19684k = this.f19683j;
                i7 |= 2;
            }
            v0Var.i();
            this.f19687n--;
        }
        v0 v0Var3 = this.f19685l;
        v0Var3.getClass();
        if (v0Var3.f19659m != null) {
            v0Var3.b();
            v0Var3.f19659m = null;
            v0Var3.c();
        }
        l();
        return i7;
    }

    public final x2.g0 p(e2.l1 l1Var, Object obj, long j3) {
        long q10;
        int b10;
        Object obj2 = obj;
        e2.i1 i1Var = this.f19676a;
        int i7 = l1Var.g(obj2, i1Var).f10426c;
        Object obj3 = this.f19688o;
        if (obj3 != null && (b10 = l1Var.b(obj3)) != -1 && l1Var.f(b10, i1Var, false).f10426c == i7) {
            q10 = this.f19689p;
        } else {
            v0 v0Var = this.f19682i;
            while (true) {
                if (v0Var != null) {
                    if (v0Var.f19650b.equals(obj2)) {
                        q10 = v0Var.f19654g.f19665a.d;
                        break;
                    }
                    v0Var = v0Var.f19659m;
                } else {
                    v0 v0Var2 = this.f19682i;
                    while (true) {
                        if (v0Var2 != null) {
                            int b11 = l1Var.b(v0Var2.f19650b);
                            if (b11 != -1 && l1Var.f(b11, i1Var, false).f10426c == i7) {
                                q10 = v0Var2.f19654g.f19665a.d;
                                break;
                            }
                            v0Var2 = v0Var2.f19659m;
                        } else {
                            q10 = q(obj2);
                            if (q10 == -1) {
                                q10 = this.f19680f;
                                this.f19680f = 1 + q10;
                                if (this.f19682i == null) {
                                    this.f19688o = obj2;
                                    this.f19689p = q10;
                                }
                            }
                        }
                    }
                }
            }
        }
        l1Var.g(obj2, i1Var);
        int i10 = i1Var.f10426c;
        e2.k1 k1Var = this.f19677b;
        l1Var.n(i10, k1Var);
        boolean z10 = false;
        for (int b12 = l1Var.b(obj); b12 >= k1Var.f10479n; b12--) {
            boolean z11 = true;
            l1Var.f(b12, i1Var, true);
            if (i1Var.f10429g.f10336a <= 0) {
                z11 = false;
            }
            z10 |= z11;
            if (i1Var.c(i1Var.d) != -1) {
                obj2 = i1Var.f10425b;
                obj2.getClass();
            }
            if (z10 && (!z11 || i1Var.d != 0)) {
                break;
            }
        }
        return o(l1Var, obj2, j3, q10, this.f19677b, this.f19676a);
    }

    public final long q(Object obj) {
        for (int i7 = 0; i7 < this.f19690q.size(); i7++) {
            v0 v0Var = (v0) this.f19690q.get(i7);
            if (v0Var.f19650b.equals(obj)) {
                return v0Var.f19654g.f19665a.d;
            }
        }
        return -1L;
    }

    public final int r(e2.l1 l1Var) {
        e2.l1 l1Var2;
        v0 v0Var;
        v0 v0Var2 = this.f19682i;
        if (v0Var2 == null) {
            return 0;
        }
        int b10 = l1Var.b(v0Var2.f19650b);
        while (true) {
            l1Var2 = l1Var;
            b10 = l1Var2.d(b10, this.f19676a, this.f19677b, this.f19681g, this.h);
            while (true) {
                v0Var2.getClass();
                v0Var = v0Var2.f19659m;
                if (v0Var == null || v0Var2.f19654g.f19671i) {
                    break;
                }
                v0Var2 = v0Var;
            }
            if (b10 == -1 || v0Var == null || l1Var2.b(v0Var.f19650b) != b10) {
                break;
            }
            v0Var2 = v0Var;
            l1Var = l1Var2;
        }
        int n10 = n(v0Var2);
        v0Var2.f19654g = h(l1Var2, v0Var2.f19654g);
        return n10;
    }

    public final int s(e2.l1 r23, long r24, long r26, long r28) {
        throw new UnsupportedOperationException("Method not decompiled: l2.x0.s(e2.l1, long, long, long):int");
    }
}
