package k2;

import b8.zb;
import ei.h9;
import ei.y8;
import java.util.ArrayList;
public final class z0 {
    public final l2.f f16790c;
    public final g2.j0 d;
    public final y8 f16791e;
    public long f16792f;
    public int f16793g;
    public boolean h;
    public x0 f16794i;
    public x0 f16795j;
    public x0 f16796k;
    public x0 f16797l;
    public x0 f16798m;
    public int f16799n;
    public Object f16800o;
    public long f16801p;
    public final d2.k1 f16788a = new d2.k1();
    public final d2.m1 f16789b = new d2.m1();
    public ArrayList f16802q = new ArrayList();

    public z0(l2.f fVar, g2.j0 j0Var, y8 y8Var) {
        this.f16790c = fVar;
        this.d = j0Var;
        this.f16791e = y8Var;
    }

    public static w2.g0 o(d2.n1 n1Var, Object obj, long j10, long j11, d2.m1 m1Var, d2.k1 k1Var) {
        n1Var.g(obj, k1Var);
        n1Var.n(k1Var.f8163c, m1Var);
        n1Var.b(obj);
        int i3 = k1Var.f8166g.f8041a;
        if (i3 != 0) {
            if (i3 == 1) {
                k1Var.f(0);
            }
            k1Var.f8166g.getClass();
            k1Var.g(0);
        }
        n1Var.g(obj, k1Var);
        int c2 = k1Var.c(j10);
        if (c2 == -1) {
            return new w2.g0(obj, j11, k1Var.b(j10));
        }
        return new w2.g0(c2, k1Var.e(c2), -1, j11, obj);
    }

    public final x0 a() {
        x0 x0Var = this.f16794i;
        if (x0Var == null) {
            return null;
        }
        if (x0Var == this.f16795j) {
            this.f16795j = x0Var.f16770m;
        }
        if (x0Var == this.f16796k) {
            this.f16796k = x0Var.f16770m;
        }
        x0Var.i();
        int i3 = this.f16799n - 1;
        this.f16799n = i3;
        if (i3 == 0) {
            this.f16797l = null;
            x0 x0Var2 = this.f16794i;
            this.f16800o = x0Var2.f16761b;
            this.f16801p = x0Var2.f16765g.f16777a.d;
        }
        this.f16794i = this.f16794i.f16770m;
        l();
        return this.f16794i;
    }

    public final void b() {
        if (this.f16799n == 0) {
            return;
        }
        x0 x0Var = this.f16794i;
        x0Var.getClass();
        this.f16800o = x0Var.f16761b;
        this.f16801p = x0Var.f16765g.f16777a.d;
        while (x0Var != null) {
            x0Var.i();
            x0Var = x0Var.f16770m;
        }
        this.f16794i = null;
        this.f16797l = null;
        this.f16795j = null;
        this.f16796k = null;
        this.f16799n = 0;
        l();
    }

    public final k2.y0 c(d2.n1 r21, k2.x0 r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: k2.z0.c(d2.n1, k2.x0, long):k2.y0");
    }

    public final y0 d(d2.n1 n1Var, w2.g0 g0Var, long j10, long j11, long j12) {
        n1Var.g(g0Var.f57081a, this.f16788a);
        if (g0Var.b()) {
            return e(n1Var, g0Var.f57081a, g0Var.f57082b, g0Var.f57083c, j10, g0Var.d, false);
        }
        return f(n1Var, g0Var.f57081a, j11, j12, j10, g0Var.d, false);
    }

    public final y0 e(d2.n1 n1Var, Object obj, int i3, int i10, long j10, long j11, boolean z10) {
        w2.g0 g0Var = new w2.g0(i3, i10, -1, j11, obj);
        d2.k1 k1Var = this.f16788a;
        long a10 = n1Var.g(obj, k1Var).a(i3, i10);
        if (i10 == k1Var.e(i3)) {
            k1Var.f8166g.getClass();
        }
        k1Var.g(i3);
        long j12 = 0;
        if (a10 != -9223372036854775807L && 0 >= a10) {
            j12 = Math.max(0L, a10 - 1);
        }
        return new y0(g0Var, j12, -9223372036854775807L, j10, -9223372036854775807L, a10, z10, false, false, false, false);
    }

    public final y0 f(d2.n1 n1Var, Object obj, long j10, long j11, long j12, long j13, boolean z10) {
        long j14;
        long j15;
        long j16;
        d2.k1 k1Var = this.f16788a;
        n1Var.g(obj, k1Var);
        int b10 = k1Var.b(j10);
        boolean z11 = false;
        if (b10 == -1) {
            if (k1Var.f8166g.f8041a > 0) {
                k1Var.g(0);
            }
        } else {
            k1Var.g(b10);
        }
        w2.g0 g0Var = new w2.g0(obj, j13, b10);
        if (!g0Var.b() && b10 == -1) {
            z11 = true;
        }
        boolean j17 = j(n1Var, g0Var);
        boolean i3 = i(n1Var, g0Var, z11);
        if (b10 != -1) {
            k1Var.g(b10);
        }
        if (b10 != -1) {
            k1Var.f(b10);
        }
        if (b10 != -1) {
            k1Var.d(b10);
            j14 = 0;
        } else {
            j14 = -9223372036854775807L;
        }
        if (j14 != -9223372036854775807L && j14 != Long.MIN_VALUE) {
            j15 = j14;
        } else {
            j15 = k1Var.d;
        }
        if (j15 != -9223372036854775807L && j10 >= j15) {
            j16 = Math.max(0L, j15 - 1);
        } else {
            j16 = j10;
        }
        return new y0(g0Var, j16, j11, j12, j14, j15, z10, false, z11, j17, i3);
    }

    public final x0 g() {
        return this.f16796k;
    }

    public final y0 h(d2.n1 n1Var, y0 y0Var) {
        boolean z10;
        long j10;
        long j11;
        w2.g0 g0Var = y0Var.f16777a;
        boolean b10 = g0Var.b();
        int i3 = g0Var.f57084e;
        if (!b10 && i3 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        int i10 = g0Var.f57082b;
        boolean j12 = j(n1Var, g0Var);
        boolean i11 = i(n1Var, g0Var, z11);
        Object obj = g0Var.f57081a;
        d2.k1 k1Var = this.f16788a;
        n1Var.g(obj, k1Var);
        if (!g0Var.b() && i3 != -1) {
            k1Var.d(i3);
            j10 = 0;
        } else {
            j10 = -9223372036854775807L;
        }
        if (g0Var.b()) {
            j11 = k1Var.a(i10, g0Var.f57083c);
        } else if (j10 != -9223372036854775807L && j10 != Long.MIN_VALUE) {
            j11 = j10;
        } else {
            j11 = k1Var.d;
        }
        if (g0Var.b()) {
            k1Var.g(i10);
        } else if (i3 != -1) {
            k1Var.g(i3);
        }
        return new y0(g0Var, y0Var.f16778b, y0Var.f16779c, y0Var.d, j10, j11, y0Var.f16782g, false, z11, j12, i11);
    }

    public final boolean i(d2.n1 n1Var, w2.g0 g0Var, boolean z10) {
        int b10 = n1Var.b(g0Var.f57081a);
        if (!n1Var.m(n1Var.f(b10, this.f16788a, false).f8163c, this.f16789b, 0L).f8214i) {
            if (n1Var.d(b10, this.f16788a, this.f16789b, this.f16793g, this.h) == -1 && z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(d2.n1 n1Var, w2.g0 g0Var) {
        boolean z10;
        if (!g0Var.b() && g0Var.f57084e == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object obj = g0Var.f57081a;
        if (z10) {
            if (n1Var.m(n1Var.g(obj, this.f16788a).f8163c, this.f16789b, 0L).f8220o == n1Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        x0 x0Var = this.f16798m;
        if (x0Var == null || x0Var.h()) {
            this.f16798m = null;
            for (int i3 = 0; i3 < this.f16802q.size(); i3++) {
                x0 x0Var2 = (x0) this.f16802q.get(i3);
                if (!x0Var2.h()) {
                    this.f16798m = x0Var2;
                    return;
                }
            }
        }
    }

    public final void l() {
        w2.g0 g0Var;
        g9.f0 p10 = g9.i0.p();
        for (x0 x0Var = this.f16794i; x0Var != null; x0Var = x0Var.f16770m) {
            p10.c(x0Var.f16765g.f16777a);
        }
        x0 x0Var2 = this.f16795j;
        if (x0Var2 == null) {
            g0Var = null;
        } else {
            g0Var = x0Var2.f16765g.f16777a;
        }
        this.d.d(new h9(this, p10, g0Var, 18));
    }

    public final void m(long j10) {
        boolean z10;
        x0 x0Var = this.f16797l;
        if (x0Var != null) {
            if (x0Var.f16770m == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            zb.p(z10);
            if (x0Var.f16763e) {
                x0Var.f16760a.t(j10 - x0Var.f16773p);
            }
        }
    }

    public final int n(x0 x0Var) {
        x0Var.getClass();
        int i3 = 0;
        if (x0Var.equals(this.f16797l)) {
            return 0;
        }
        this.f16797l = x0Var;
        while (true) {
            x0Var = x0Var.f16770m;
            if (x0Var == null) {
                break;
            }
            if (x0Var == this.f16795j) {
                x0 x0Var2 = this.f16794i;
                this.f16795j = x0Var2;
                this.f16796k = x0Var2;
                i3 = 3;
            }
            if (x0Var == this.f16796k) {
                this.f16796k = this.f16795j;
                i3 |= 2;
            }
            x0Var.i();
            this.f16799n--;
        }
        x0 x0Var3 = this.f16797l;
        x0Var3.getClass();
        if (x0Var3.f16770m != null) {
            x0Var3.b();
            x0Var3.f16770m = null;
            x0Var3.c();
        }
        l();
        return i3;
    }

    public final w2.g0 p(d2.n1 n1Var, Object obj, long j10) {
        long q10;
        int b10;
        Object obj2 = obj;
        d2.k1 k1Var = this.f16788a;
        int i3 = n1Var.g(obj2, k1Var).f8163c;
        Object obj3 = this.f16800o;
        if (obj3 != null && (b10 = n1Var.b(obj3)) != -1 && n1Var.f(b10, k1Var, false).f8163c == i3) {
            q10 = this.f16801p;
        } else {
            x0 x0Var = this.f16794i;
            while (true) {
                if (x0Var != null) {
                    if (x0Var.f16761b.equals(obj2)) {
                        q10 = x0Var.f16765g.f16777a.d;
                        break;
                    }
                    x0Var = x0Var.f16770m;
                } else {
                    x0 x0Var2 = this.f16794i;
                    while (true) {
                        if (x0Var2 != null) {
                            int b11 = n1Var.b(x0Var2.f16761b);
                            if (b11 != -1 && n1Var.f(b11, k1Var, false).f8163c == i3) {
                                q10 = x0Var2.f16765g.f16777a.d;
                                break;
                            }
                            x0Var2 = x0Var2.f16770m;
                        } else {
                            q10 = q(obj2);
                            if (q10 == -1) {
                                q10 = this.f16792f;
                                this.f16792f = 1 + q10;
                                if (this.f16794i == null) {
                                    this.f16800o = obj2;
                                    this.f16801p = q10;
                                }
                            }
                        }
                    }
                }
            }
        }
        n1Var.g(obj2, k1Var);
        int i10 = k1Var.f8163c;
        d2.m1 m1Var = this.f16789b;
        n1Var.n(i10, m1Var);
        boolean z10 = false;
        for (int b12 = n1Var.b(obj); b12 >= m1Var.f8219n; b12--) {
            boolean z11 = true;
            n1Var.f(b12, k1Var, true);
            if (k1Var.f8166g.f8041a <= 0) {
                z11 = false;
            }
            z10 |= z11;
            if (k1Var.c(k1Var.d) != -1) {
                obj2 = k1Var.f8162b;
                obj2.getClass();
            }
            if (z10 && (!z11 || k1Var.d != 0)) {
                break;
            }
        }
        return o(n1Var, obj2, j10, q10, this.f16789b, this.f16788a);
    }

    public final long q(Object obj) {
        for (int i3 = 0; i3 < this.f16802q.size(); i3++) {
            x0 x0Var = (x0) this.f16802q.get(i3);
            if (x0Var.f16761b.equals(obj)) {
                return x0Var.f16765g.f16777a.d;
            }
        }
        return -1L;
    }

    public final int r(d2.n1 n1Var) {
        d2.n1 n1Var2;
        x0 x0Var;
        x0 x0Var2 = this.f16794i;
        if (x0Var2 == null) {
            return 0;
        }
        int b10 = n1Var.b(x0Var2.f16761b);
        while (true) {
            n1Var2 = n1Var;
            b10 = n1Var2.d(b10, this.f16788a, this.f16789b, this.f16793g, this.h);
            while (true) {
                x0Var2.getClass();
                x0Var = x0Var2.f16770m;
                if (x0Var == null || x0Var2.f16765g.f16783i) {
                    break;
                }
                x0Var2 = x0Var;
            }
            if (b10 == -1 || x0Var == null || n1Var2.b(x0Var.f16761b) != b10) {
                break;
            }
            x0Var2 = x0Var;
            n1Var = n1Var2;
        }
        int n4 = n(x0Var2);
        x0Var2.f16765g = h(n1Var2, x0Var2.f16765g);
        return n4;
    }

    public final int s(d2.n1 r23, long r24, long r26, long r28) {
        throw new UnsupportedOperationException("Method not decompiled: k2.z0.s(d2.n1, long, long, long):int");
    }
}
