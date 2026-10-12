package i2;

import java.util.ArrayList;
import v7.u6;
public final class z0 {
    public final j2.f f11241c;
    public final e2.i0 d;
    public final f1.a e;
    public long f11242f;
    public int f11243g;
    public boolean h;
    public x0 f11244i;
    public x0 f11245j;
    public x0 f11246k;
    public x0 f11247l;
    public x0 f11248m;
    public int f11249n;
    public Object f11250o;
    public long f11251p;
    public final b2.m1 f11239a = new b2.m1();
    public final b2.o1 f11240b = new b2.o1();
    public ArrayList f11252q = new ArrayList();

    public z0(j2.f fVar, e2.i0 i0Var, f1.a aVar) {
        this.f11241c = fVar;
        this.d = i0Var;
        this.e = aVar;
    }

    public static u2.g0 o(b2.p1 p1Var, Object obj, long j10, long j11, b2.o1 o1Var, b2.m1 m1Var) {
        p1Var.g(obj, m1Var);
        p1Var.n(m1Var.f2213c, o1Var);
        p1Var.b(obj);
        int i10 = m1Var.f2215g.f2087a;
        if (i10 != 0) {
            if (i10 == 1) {
                m1Var.f(0);
            }
            m1Var.f2215g.getClass();
            m1Var.g(0);
        }
        p1Var.g(obj, m1Var);
        int c10 = m1Var.c(j10);
        if (c10 == -1) {
            return new u2.g0(obj, j11, m1Var.b(j10));
        }
        return new u2.g0(c10, m1Var.e(c10), -1, j11, obj);
    }

    public final x0 a() {
        x0 x0Var = this.f11244i;
        if (x0Var == null) {
            return null;
        }
        if (x0Var == this.f11245j) {
            this.f11245j = x0Var.f11222m;
        }
        if (x0Var == this.f11246k) {
            this.f11246k = x0Var.f11222m;
        }
        x0Var.i();
        int i10 = this.f11249n - 1;
        this.f11249n = i10;
        if (i10 == 0) {
            this.f11247l = null;
            x0 x0Var2 = this.f11244i;
            this.f11250o = x0Var2.f11214b;
            this.f11251p = x0Var2.f11217g.f11228a.d;
        }
        this.f11244i = this.f11244i.f11222m;
        l();
        return this.f11244i;
    }

    public final void b() {
        if (this.f11249n == 0) {
            return;
        }
        x0 x0Var = this.f11244i;
        x0Var.getClass();
        this.f11250o = x0Var.f11214b;
        this.f11251p = x0Var.f11217g.f11228a.d;
        while (x0Var != null) {
            x0Var.i();
            x0Var = x0Var.f11222m;
        }
        this.f11244i = null;
        this.f11247l = null;
        this.f11245j = null;
        this.f11246k = null;
        this.f11249n = 0;
        l();
    }

    public final i2.y0 c(b2.p1 r21, i2.x0 r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: i2.z0.c(b2.p1, i2.x0, long):i2.y0");
    }

    public final y0 d(b2.p1 p1Var, u2.g0 g0Var, long j10, long j11, long j12) {
        p1Var.g(g0Var.f45920a, this.f11239a);
        if (g0Var.b()) {
            return e(p1Var, g0Var.f45920a, g0Var.f45921b, g0Var.f45922c, j10, g0Var.d, false);
        }
        return f(p1Var, g0Var.f45920a, j11, j12, j10, g0Var.d, false);
    }

    public final y0 e(b2.p1 p1Var, Object obj, int i10, int i11, long j10, long j11, boolean z10) {
        u2.g0 g0Var = new u2.g0(i10, i11, -1, j11, obj);
        b2.m1 m1Var = this.f11239a;
        long a2 = p1Var.g(obj, m1Var).a(i10, i11);
        if (i11 == m1Var.e(i10)) {
            m1Var.f2215g.getClass();
        }
        m1Var.g(i10);
        long j12 = 0;
        if (a2 != -9223372036854775807L && 0 >= a2) {
            j12 = Math.max(0L, a2 - 1);
        }
        return new y0(g0Var, j12, -9223372036854775807L, j10, -9223372036854775807L, a2, z10, false, false, false, false);
    }

    public final y0 f(b2.p1 p1Var, Object obj, long j10, long j11, long j12, long j13, boolean z10) {
        long j14;
        long j15;
        long j16;
        b2.m1 m1Var = this.f11239a;
        p1Var.g(obj, m1Var);
        int b10 = m1Var.b(j10);
        boolean z11 = false;
        if (b10 == -1) {
            if (m1Var.f2215g.f2087a > 0) {
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
        return new y0(g0Var, j16, j11, j12, j14, j15, z10, false, z11, j17, i10);
    }

    public final x0 g() {
        return this.f11246k;
    }

    public final y0 h(b2.p1 p1Var, y0 y0Var) {
        boolean z10;
        long j10;
        long j11;
        u2.g0 g0Var = y0Var.f11228a;
        boolean b10 = g0Var.b();
        int i10 = g0Var.e;
        if (!b10 && i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        int i11 = g0Var.f45921b;
        boolean j12 = j(p1Var, g0Var);
        boolean i12 = i(p1Var, g0Var, z11);
        Object obj = g0Var.f45920a;
        b2.m1 m1Var = this.f11239a;
        p1Var.g(obj, m1Var);
        if (!g0Var.b() && i10 != -1) {
            m1Var.d(i10);
            j10 = 0;
        } else {
            j10 = -9223372036854775807L;
        }
        if (g0Var.b()) {
            j11 = m1Var.a(i11, g0Var.f45922c);
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
        return new y0(g0Var, y0Var.f11229b, y0Var.f11230c, y0Var.d, j10, j11, y0Var.f11232g, false, z11, j12, i12);
    }

    public final boolean i(b2.p1 p1Var, u2.g0 g0Var, boolean z10) {
        int b10 = p1Var.b(g0Var.f45920a);
        if (!p1Var.m(p1Var.f(b10, this.f11239a, false).f2213c, this.f11240b, 0L).f2263i) {
            if (p1Var.d(b10, this.f11239a, this.f11240b, this.f11243g, this.h) == -1 && z10) {
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
        Object obj = g0Var.f45920a;
        if (z10) {
            if (p1Var.m(p1Var.g(obj, this.f11239a).f2213c, this.f11240b, 0L).f2269o == p1Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        x0 x0Var = this.f11248m;
        if (x0Var == null || x0Var.h()) {
            this.f11248m = null;
            for (int i10 = 0; i10 < this.f11252q.size(); i10++) {
                x0 x0Var2 = (x0) this.f11252q.get(i10);
                if (!x0Var2.h()) {
                    this.f11248m = x0Var2;
                    return;
                }
            }
        }
    }

    public final void l() {
        u2.g0 g0Var;
        e9.k0 t10 = e9.n0.t();
        for (x0 x0Var = this.f11244i; x0Var != null; x0Var = x0Var.f11222m) {
            t10.c(x0Var.f11217g.f11228a);
        }
        x0 x0Var2 = this.f11245j;
        if (x0Var2 == null) {
            g0Var = null;
        } else {
            g0Var = x0Var2.f11217g.f11228a;
        }
        this.d.d(new hg.t(this, t10, g0Var, 5));
    }

    public final void m(long j10) {
        boolean z10;
        x0 x0Var = this.f11247l;
        if (x0Var != null) {
            if (x0Var.f11222m == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.p(z10);
            if (x0Var.e) {
                x0Var.f11213a.u(j10 - x0Var.f11225p);
            }
        }
    }

    public final int n(x0 x0Var) {
        x0Var.getClass();
        int i10 = 0;
        if (x0Var.equals(this.f11247l)) {
            return 0;
        }
        this.f11247l = x0Var;
        while (true) {
            x0Var = x0Var.f11222m;
            if (x0Var == null) {
                break;
            }
            if (x0Var == this.f11245j) {
                x0 x0Var2 = this.f11244i;
                this.f11245j = x0Var2;
                this.f11246k = x0Var2;
                i10 = 3;
            }
            if (x0Var == this.f11246k) {
                this.f11246k = this.f11245j;
                i10 |= 2;
            }
            x0Var.i();
            this.f11249n--;
        }
        x0 x0Var3 = this.f11247l;
        x0Var3.getClass();
        if (x0Var3.f11222m != null) {
            x0Var3.b();
            x0Var3.f11222m = null;
            x0Var3.c();
        }
        l();
        return i10;
    }

    public final u2.g0 p(b2.p1 p1Var, Object obj, long j10) {
        long q6;
        int b10;
        Object obj2 = obj;
        b2.m1 m1Var = this.f11239a;
        int i10 = p1Var.g(obj2, m1Var).f2213c;
        Object obj3 = this.f11250o;
        if (obj3 != null && (b10 = p1Var.b(obj3)) != -1 && p1Var.f(b10, m1Var, false).f2213c == i10) {
            q6 = this.f11251p;
        } else {
            x0 x0Var = this.f11244i;
            while (true) {
                if (x0Var != null) {
                    if (x0Var.f11214b.equals(obj2)) {
                        q6 = x0Var.f11217g.f11228a.d;
                        break;
                    }
                    x0Var = x0Var.f11222m;
                } else {
                    x0 x0Var2 = this.f11244i;
                    while (true) {
                        if (x0Var2 != null) {
                            int b11 = p1Var.b(x0Var2.f11214b);
                            if (b11 != -1 && p1Var.f(b11, m1Var, false).f2213c == i10) {
                                q6 = x0Var2.f11217g.f11228a.d;
                                break;
                            }
                            x0Var2 = x0Var2.f11222m;
                        } else {
                            q6 = q(obj2);
                            if (q6 == -1) {
                                q6 = this.f11242f;
                                this.f11242f = 1 + q6;
                                if (this.f11244i == null) {
                                    this.f11250o = obj2;
                                    this.f11251p = q6;
                                }
                            }
                        }
                    }
                }
            }
        }
        p1Var.g(obj2, m1Var);
        int i11 = m1Var.f2213c;
        b2.o1 o1Var = this.f11240b;
        p1Var.n(i11, o1Var);
        boolean z10 = false;
        for (int b12 = p1Var.b(obj); b12 >= o1Var.f2268n; b12--) {
            boolean z11 = true;
            p1Var.f(b12, m1Var, true);
            if (m1Var.f2215g.f2087a <= 0) {
                z11 = false;
            }
            z10 |= z11;
            if (m1Var.c(m1Var.d) != -1) {
                obj2 = m1Var.f2212b;
                obj2.getClass();
            }
            if (z10 && (!z11 || m1Var.d != 0)) {
                break;
            }
        }
        return o(p1Var, obj2, j10, q6, this.f11240b, this.f11239a);
    }

    public final long q(Object obj) {
        for (int i10 = 0; i10 < this.f11252q.size(); i10++) {
            x0 x0Var = (x0) this.f11252q.get(i10);
            if (x0Var.f11214b.equals(obj)) {
                return x0Var.f11217g.f11228a.d;
            }
        }
        return -1L;
    }

    public final int r(b2.p1 p1Var) {
        b2.p1 p1Var2;
        x0 x0Var;
        x0 x0Var2 = this.f11244i;
        if (x0Var2 == null) {
            return 0;
        }
        int b10 = p1Var.b(x0Var2.f11214b);
        while (true) {
            p1Var2 = p1Var;
            b10 = p1Var2.d(b10, this.f11239a, this.f11240b, this.f11243g, this.h);
            while (true) {
                x0Var2.getClass();
                x0Var = x0Var2.f11222m;
                if (x0Var == null || x0Var2.f11217g.f11233i) {
                    break;
                }
                x0Var2 = x0Var;
            }
            if (b10 == -1 || x0Var == null || p1Var2.b(x0Var.f11214b) != b10) {
                break;
            }
            x0Var2 = x0Var;
            p1Var = p1Var2;
        }
        int n10 = n(x0Var2);
        x0Var2.f11217g = h(p1Var2, x0Var2.f11217g);
        return n10;
    }

    public final int s(b2.p1 r23, long r24, long r26, long r28) {
        throw new UnsupportedOperationException("Method not decompiled: i2.z0.s(b2.p1, long, long, long):int");
    }
}
