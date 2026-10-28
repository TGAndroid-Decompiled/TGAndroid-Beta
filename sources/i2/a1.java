package i2;

import a8.yb;
import java.util.ArrayList;
public final class a1 {
    public final j2.e f13477c;
    public final e2.i0 d;
    public final e1.c e;
    public long f13478f;
    public int f13479g;
    public boolean h;
    public y0 f13480i;
    public y0 f13481j;
    public y0 f13482k;
    public y0 f13483l;
    public y0 f13484m;
    public int f13485n;
    public Object f13486o;
    public long f13487p;
    public final b2.m1 f13475a = new b2.m1();
    public final b2.o1 f13476b = new b2.o1();
    public ArrayList f13488q = new ArrayList();

    public a1(j2.e eVar, e2.i0 i0Var, e1.c cVar) {
        this.f13477c = eVar;
        this.d = i0Var;
        this.e = cVar;
    }

    public static u2.g0 o(b2.p1 p1Var, Object obj, long j10, long j11, b2.o1 o1Var, b2.m1 m1Var) {
        p1Var.g(obj, m1Var);
        p1Var.n(m1Var.f3280c, o1Var);
        p1Var.b(obj);
        int i10 = m1Var.f3282g.f3154a;
        if (i10 != 0) {
            if (i10 == 1) {
                m1Var.f(0);
            }
            m1Var.f3282g.getClass();
            m1Var.g(0);
        }
        p1Var.g(obj, m1Var);
        int c10 = m1Var.c(j10);
        if (c10 == -1) {
            return new u2.g0(obj, j11, m1Var.b(j10));
        }
        return new u2.g0(c10, m1Var.e(c10), -1, j11, obj);
    }

    public final y0 a() {
        y0 y0Var = this.f13480i;
        if (y0Var == null) {
            return null;
        }
        if (y0Var == this.f13481j) {
            this.f13481j = y0Var.f13798m;
        }
        if (y0Var == this.f13482k) {
            this.f13482k = y0Var.f13798m;
        }
        y0Var.i();
        int i10 = this.f13485n - 1;
        this.f13485n = i10;
        if (i10 == 0) {
            this.f13483l = null;
            y0 y0Var2 = this.f13480i;
            this.f13486o = y0Var2.f13790b;
            this.f13487p = y0Var2.f13793g.f13805a.d;
        }
        this.f13480i = this.f13480i.f13798m;
        l();
        return this.f13480i;
    }

    public final void b() {
        if (this.f13485n == 0) {
            return;
        }
        y0 y0Var = this.f13480i;
        y0Var.getClass();
        this.f13486o = y0Var.f13790b;
        this.f13487p = y0Var.f13793g.f13805a.d;
        while (y0Var != null) {
            y0Var.i();
            y0Var = y0Var.f13798m;
        }
        this.f13480i = null;
        this.f13483l = null;
        this.f13481j = null;
        this.f13482k = null;
        this.f13485n = 0;
        l();
    }

    public final i2.z0 c(b2.p1 r21, i2.y0 r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: i2.a1.c(b2.p1, i2.y0, long):i2.z0");
    }

    public final z0 d(b2.p1 p1Var, u2.g0 g0Var, long j10, long j11, long j12) {
        p1Var.g(g0Var.f49332a, this.f13475a);
        if (g0Var.b()) {
            return e(p1Var, g0Var.f49332a, g0Var.f49333b, g0Var.f49334c, j10, g0Var.d, false);
        }
        return f(p1Var, g0Var.f49332a, j11, j12, j10, g0Var.d, false);
    }

    public final z0 e(b2.p1 p1Var, Object obj, int i10, int i11, long j10, long j11, boolean z10) {
        u2.g0 g0Var = new u2.g0(i10, i11, -1, j11, obj);
        b2.m1 m1Var = this.f13475a;
        long a2 = p1Var.g(obj, m1Var).a(i10, i11);
        if (i11 == m1Var.e(i10)) {
            m1Var.f3282g.getClass();
        }
        m1Var.g(i10);
        long j12 = 0;
        if (a2 != -9223372036854775807L && 0 >= a2) {
            j12 = Math.max(0L, a2 - 1);
        }
        return new z0(g0Var, j12, -9223372036854775807L, j10, -9223372036854775807L, a2, z10, false, false, false, false);
    }

    public final z0 f(b2.p1 p1Var, Object obj, long j10, long j11, long j12, long j13, boolean z10) {
        long j14;
        long j15;
        long j16;
        b2.m1 m1Var = this.f13475a;
        p1Var.g(obj, m1Var);
        int b10 = m1Var.b(j10);
        boolean z11 = false;
        if (b10 == -1) {
            if (m1Var.f3282g.f3154a > 0) {
                m1Var.g(0);
            }
        } else {
            m1Var.g(b10);
        }
        u2.g0 g0Var = new u2.g0(obj, j13, b10);
        if (!g0Var.b() && b10 == -1) {
            z11 = true;
        }
        boolean j17 = j(p1Var, g0Var);
        boolean i10 = i(p1Var, g0Var, z11);
        if (b10 != -1) {
            m1Var.g(b10);
        }
        if (b10 != -1) {
            m1Var.f(b10);
        }
        if (b10 != -1) {
            m1Var.d(b10);
            j14 = 0;
        } else {
            j14 = -9223372036854775807L;
        }
        if (j14 != -9223372036854775807L && j14 != Long.MIN_VALUE) {
            j15 = j14;
        } else {
            j15 = m1Var.d;
        }
        if (j15 != -9223372036854775807L && j10 >= j15) {
            j16 = Math.max(0L, j15 - 1);
        } else {
            j16 = j10;
        }
        return new z0(g0Var, j16, j11, j12, j14, j15, z10, false, z11, j17, i10);
    }

    public final y0 g() {
        return this.f13482k;
    }

    public final z0 h(b2.p1 p1Var, z0 z0Var) {
        boolean z10;
        long j10;
        long j11;
        u2.g0 g0Var = z0Var.f13805a;
        boolean b10 = g0Var.b();
        int i10 = g0Var.e;
        if (!b10 && i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        int i11 = g0Var.f49333b;
        boolean j12 = j(p1Var, g0Var);
        boolean i12 = i(p1Var, g0Var, z11);
        Object obj = g0Var.f49332a;
        b2.m1 m1Var = this.f13475a;
        p1Var.g(obj, m1Var);
        if (!g0Var.b() && i10 != -1) {
            m1Var.d(i10);
            j10 = 0;
        } else {
            j10 = -9223372036854775807L;
        }
        if (g0Var.b()) {
            j11 = m1Var.a(i11, g0Var.f49334c);
        } else if (j10 != -9223372036854775807L && j10 != Long.MIN_VALUE) {
            j11 = j10;
        } else {
            j11 = m1Var.d;
        }
        if (g0Var.b()) {
            m1Var.g(i11);
        } else if (i10 != -1) {
            m1Var.g(i10);
        }
        return new z0(g0Var, z0Var.f13806b, z0Var.f13807c, z0Var.d, j10, j11, z0Var.f13809g, false, z11, j12, i12);
    }

    public final boolean i(b2.p1 p1Var, u2.g0 g0Var, boolean z10) {
        int b10 = p1Var.b(g0Var.f49332a);
        if (!p1Var.m(p1Var.f(b10, this.f13475a, false).f3280c, this.f13476b, 0L).f3330i) {
            if (p1Var.d(b10, this.f13475a, this.f13476b, this.f13479g, this.h) == -1 && z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(b2.p1 p1Var, u2.g0 g0Var) {
        boolean z10;
        if (!g0Var.b() && g0Var.e == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object obj = g0Var.f49332a;
        if (z10) {
            if (p1Var.m(p1Var.g(obj, this.f13475a).f3280c, this.f13476b, 0L).f3336o == p1Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        y0 y0Var = this.f13484m;
        if (y0Var == null || y0Var.h()) {
            this.f13484m = null;
            for (int i10 = 0; i10 < this.f13488q.size(); i10++) {
                y0 y0Var2 = (y0) this.f13488q.get(i10);
                if (!y0Var2.h()) {
                    this.f13484m = y0Var2;
                    return;
                }
            }
        }
    }

    public final void l() {
        u2.g0 g0Var;
        f9.f0 t10 = f9.i0.t();
        for (y0 y0Var = this.f13480i; y0Var != null; y0Var = y0Var.f13798m) {
            t10.c(y0Var.f13793g.f13805a);
        }
        y0 y0Var2 = this.f13481j;
        if (y0Var2 == null) {
            g0Var = null;
        } else {
            g0Var = y0Var2.f13793g.f13805a;
        }
        this.d.d(new e2.m0(this, t10, g0Var, 15));
    }

    public final void m(long j10) {
        boolean z10;
        y0 y0Var = this.f13483l;
        if (y0Var != null) {
            if (y0Var.f13798m == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            yb.p(z10);
            if (y0Var.e) {
                y0Var.f13789a.s(j10 - y0Var.f13801p);
            }
        }
    }

    public final int n(y0 y0Var) {
        y0Var.getClass();
        int i10 = 0;
        if (y0Var.equals(this.f13483l)) {
            return 0;
        }
        this.f13483l = y0Var;
        while (true) {
            y0Var = y0Var.f13798m;
            if (y0Var == null) {
                break;
            }
            if (y0Var == this.f13481j) {
                y0 y0Var2 = this.f13480i;
                this.f13481j = y0Var2;
                this.f13482k = y0Var2;
                i10 = 3;
            }
            if (y0Var == this.f13482k) {
                this.f13482k = this.f13481j;
                i10 |= 2;
            }
            y0Var.i();
            this.f13485n--;
        }
        y0 y0Var3 = this.f13483l;
        y0Var3.getClass();
        if (y0Var3.f13798m != null) {
            y0Var3.b();
            y0Var3.f13798m = null;
            y0Var3.c();
        }
        l();
        return i10;
    }

    public final u2.g0 p(b2.p1 p1Var, Object obj, long j10) {
        long q5;
        int b10;
        Object obj2 = obj;
        b2.m1 m1Var = this.f13475a;
        int i10 = p1Var.g(obj2, m1Var).f3280c;
        Object obj3 = this.f13486o;
        if (obj3 != null && (b10 = p1Var.b(obj3)) != -1 && p1Var.f(b10, m1Var, false).f3280c == i10) {
            q5 = this.f13487p;
        } else {
            y0 y0Var = this.f13480i;
            while (true) {
                if (y0Var != null) {
                    if (y0Var.f13790b.equals(obj2)) {
                        q5 = y0Var.f13793g.f13805a.d;
                        break;
                    }
                    y0Var = y0Var.f13798m;
                } else {
                    y0 y0Var2 = this.f13480i;
                    while (true) {
                        if (y0Var2 != null) {
                            int b11 = p1Var.b(y0Var2.f13790b);
                            if (b11 != -1 && p1Var.f(b11, m1Var, false).f3280c == i10) {
                                q5 = y0Var2.f13793g.f13805a.d;
                                break;
                            }
                            y0Var2 = y0Var2.f13798m;
                        } else {
                            q5 = q(obj2);
                            if (q5 == -1) {
                                q5 = this.f13478f;
                                this.f13478f = 1 + q5;
                                if (this.f13480i == null) {
                                    this.f13486o = obj2;
                                    this.f13487p = q5;
                                }
                            }
                        }
                    }
                }
            }
        }
        p1Var.g(obj2, m1Var);
        int i11 = m1Var.f3280c;
        b2.o1 o1Var = this.f13476b;
        p1Var.n(i11, o1Var);
        boolean z10 = false;
        for (int b12 = p1Var.b(obj); b12 >= o1Var.f3335n; b12--) {
            boolean z11 = true;
            p1Var.f(b12, m1Var, true);
            if (m1Var.f3282g.f3154a <= 0) {
                z11 = false;
            }
            z10 |= z11;
            if (m1Var.c(m1Var.d) != -1) {
                obj2 = m1Var.f3279b;
                obj2.getClass();
            }
            if (z10 && (!z11 || m1Var.d != 0)) {
                break;
            }
        }
        return o(p1Var, obj2, j10, q5, this.f13476b, this.f13475a);
    }

    public final long q(Object obj) {
        for (int i10 = 0; i10 < this.f13488q.size(); i10++) {
            y0 y0Var = (y0) this.f13488q.get(i10);
            if (y0Var.f13790b.equals(obj)) {
                return y0Var.f13793g.f13805a.d;
            }
        }
        return -1L;
    }

    public final int r(b2.p1 p1Var) {
        b2.p1 p1Var2;
        y0 y0Var;
        y0 y0Var2 = this.f13480i;
        if (y0Var2 == null) {
            return 0;
        }
        int b10 = p1Var.b(y0Var2.f13790b);
        while (true) {
            p1Var2 = p1Var;
            b10 = p1Var2.d(b10, this.f13475a, this.f13476b, this.f13479g, this.h);
            while (true) {
                y0Var2.getClass();
                y0Var = y0Var2.f13798m;
                if (y0Var == null || y0Var2.f13793g.f13810i) {
                    break;
                }
                y0Var2 = y0Var;
            }
            if (b10 == -1 || y0Var == null || p1Var2.b(y0Var.f13790b) != b10) {
                break;
            }
            y0Var2 = y0Var;
            p1Var = p1Var2;
        }
        int n10 = n(y0Var2);
        y0Var2.f13793g = h(p1Var2, y0Var2.f13793g);
        return n10;
    }

    public final int s(b2.p1 r23, long r24, long r26, long r28) {
        throw new UnsupportedOperationException("Method not decompiled: i2.a1.s(b2.p1, long, long, long):int");
    }
}
