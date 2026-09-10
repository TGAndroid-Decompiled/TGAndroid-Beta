package i2;

import android.util.Pair;
import hi.y1;
import java.util.ArrayList;
public final class u0 {
    public final j2.e f10378c;
    public final e2.z d;
    public final y1 e;
    public long f10379f;
    public int f10380g;
    public boolean h;
    public s0 f10381i;
    public s0 f10382j;
    public s0 f10383k;
    public s0 f10384l;
    public s0 f10385m;
    public int f10386n;
    public Object f10387o;
    public long f10388p;
    public final b2.h1 f10376a = new b2.h1();
    public final b2.j1 f10377b = new b2.j1();
    public ArrayList f10389q = new ArrayList();

    public u0(j2.e eVar, e2.z zVar, y1 y1Var) {
        this.f10378c = eVar;
        this.d = zVar;
        this.e = y1Var;
    }

    public static u2.g0 o(b2.k1 k1Var, Object obj, long j3, long j10, b2.j1 j1Var, b2.h1 h1Var) {
        k1Var.g(obj, h1Var);
        k1Var.n(h1Var.f1707c, j1Var);
        k1Var.b(obj);
        int i10 = h1Var.f1709g.f1629a;
        if (i10 != 0) {
            if (i10 == 1) {
                h1Var.f(0);
            }
            h1Var.f1709g.getClass();
            h1Var.g(0);
        }
        k1Var.g(obj, h1Var);
        int c10 = h1Var.c(j3);
        if (c10 == -1) {
            return new u2.g0(obj, j10, h1Var.b(j3));
        }
        return new u2.g0(c10, h1Var.e(c10), -1, j10, obj);
    }

    public final s0 a() {
        s0 s0Var = this.f10381i;
        if (s0Var == null) {
            return null;
        }
        if (s0Var == this.f10382j) {
            this.f10382j = s0Var.f10362m;
        }
        if (s0Var == this.f10383k) {
            this.f10383k = s0Var.f10362m;
        }
        s0Var.i();
        int i10 = this.f10386n - 1;
        this.f10386n = i10;
        if (i10 == 0) {
            this.f10384l = null;
            s0 s0Var2 = this.f10381i;
            this.f10387o = s0Var2.f10354b;
            this.f10388p = s0Var2.f10357g.f10368a.d;
        }
        this.f10381i = this.f10381i.f10362m;
        l();
        return this.f10381i;
    }

    public final void b() {
        if (this.f10386n == 0) {
            return;
        }
        s0 s0Var = this.f10381i;
        e2.d.h(s0Var);
        this.f10387o = s0Var.f10354b;
        this.f10388p = s0Var.f10357g.f10368a.d;
        while (s0Var != null) {
            s0Var.i();
            s0Var = s0Var.f10362m;
        }
        this.f10381i = null;
        this.f10384l = null;
        this.f10382j = null;
        this.f10383k = null;
        this.f10386n = 0;
        l();
    }

    public final t0 c(b2.k1 k1Var, s0 s0Var, long j3) {
        b2.h1 h1Var;
        long j10;
        b2.k1 k1Var2;
        Object obj;
        long j11;
        long j12;
        long j13;
        long q6;
        t0 t0Var = s0Var.f10357g;
        long j14 = (s0Var.f10365p + t0Var.e) - j3;
        if (t0Var.h) {
            t0 t0Var2 = s0Var.f10357g;
            u2.g0 g0Var = t0Var2.f10368a;
            long j15 = t0Var2.f10370c;
            int d = k1Var.d(k1Var.b(g0Var.f42324a), this.f10376a, this.f10377b, this.f10380g, this.h);
            if (d != -1) {
                b2.h1 h1Var2 = this.f10376a;
                int i10 = k1Var.f(d, h1Var2, true).f1707c;
                Object obj2 = h1Var2.f1706b;
                obj2.getClass();
                long j16 = g0Var.d;
                if (k1Var.m(i10, this.f10377b, 0L).f1761n == d) {
                    Pair j17 = k1Var.j(this.f10377b, this.f10376a, i10, -9223372036854775807L, Math.max(0L, j14));
                    if (j17 != null) {
                        Object obj3 = j17.first;
                        long longValue = ((Long) j17.second).longValue();
                        s0 s0Var2 = s0Var.f10362m;
                        if (s0Var2 != null && s0Var2.f10354b.equals(obj3)) {
                            q6 = s0Var2.f10357g.f10368a.d;
                        } else {
                            q6 = q(obj3);
                            if (q6 == -1) {
                                q6 = this.f10379f;
                                this.f10379f = 1 + q6;
                            }
                        }
                        obj = obj3;
                        j11 = longValue;
                        j13 = q6;
                        j12 = -9223372036854775807L;
                    }
                } else {
                    obj = obj2;
                    j11 = 0;
                    j12 = 0;
                    j13 = j16;
                }
                u2.g0 o9 = o(k1Var, obj, j11, j13, this.f10377b, this.f10376a);
                if (j12 != -9223372036854775807L && j15 != -9223372036854775807L) {
                    int i11 = k1Var.g(g0Var.f42324a, h1Var2).f1709g.f1629a;
                    h1Var2.f1709g.getClass();
                    if (i11 > 0) {
                        h1Var2.g(0);
                    }
                }
                return d(k1Var, o9, j12, j11);
            }
            return null;
        }
        u2.g0 g0Var2 = t0Var.f10368a;
        Object obj4 = g0Var2.f42324a;
        int i12 = g0Var2.e;
        b2.h1 h1Var3 = this.f10376a;
        k1Var.g(obj4, h1Var3);
        boolean z10 = t0Var.f10372g;
        if (g0Var2.b()) {
            int i13 = g0Var2.f42325b;
            int i14 = h1Var3.f1709g.a(i13).f1609a;
            if (i14 != -1) {
                int a2 = h1Var3.f1709g.a(i13).a(g0Var2.f42326c);
                if (a2 < i14) {
                    return e(k1Var, g0Var2.f42324a, i13, a2, t0Var.f10370c, g0Var2.d, z10);
                }
                long j18 = t0Var.f10370c;
                if (j18 == -9223372036854775807L) {
                    int i15 = h1Var3.f1707c;
                    long max = Math.max(0L, j14);
                    j10 = 0;
                    Pair j19 = k1Var.j(this.f10377b, h1Var3, i15, -9223372036854775807L, max);
                    h1Var = h1Var3;
                    k1Var2 = k1Var;
                    if (j19 == null) {
                        return null;
                    }
                    j18 = ((Long) j19.second).longValue();
                } else {
                    h1Var = h1Var3;
                    j10 = 0;
                    k1Var2 = k1Var;
                }
                int i16 = g0Var2.f42325b;
                k1Var2.g(obj4, h1Var);
                h1Var.d(i16);
                h1Var.f1709g.a(i16).getClass();
                return f(k1Var, g0Var2.f42324a, Math.max(j10, j18), t0Var.f10370c, g0Var2.d, z10);
            }
            return null;
        }
        if (i12 != -1) {
            h1Var3.f(i12);
        }
        int e = h1Var3.e(i12);
        h1Var3.g(i12);
        if (e != h1Var3.f1709g.a(i12).f1609a) {
            return e(k1Var, g0Var2.f42324a, g0Var2.e, e, t0Var.e, g0Var2.d, z10);
        }
        k1Var.g(obj4, h1Var3);
        h1Var3.d(i12);
        h1Var3.f1709g.a(i12).getClass();
        return f(k1Var, g0Var2.f42324a, 0L, t0Var.e, g0Var2.d, false);
    }

    public final t0 d(b2.k1 k1Var, u2.g0 g0Var, long j3, long j10) {
        k1Var.g(g0Var.f42324a, this.f10376a);
        if (g0Var.b()) {
            return e(k1Var, g0Var.f42324a, g0Var.f42325b, g0Var.f42326c, j3, g0Var.d, false);
        }
        return f(k1Var, g0Var.f42324a, j10, j3, g0Var.d, false);
    }

    public final t0 e(b2.k1 k1Var, Object obj, int i10, int i11, long j3, long j10, boolean z10) {
        u2.g0 g0Var = new u2.g0(i10, i11, -1, j10, obj);
        b2.h1 h1Var = this.f10376a;
        long a2 = k1Var.g(obj, h1Var).a(i10, i11);
        if (i11 == h1Var.e(i10)) {
            h1Var.f1709g.getClass();
        }
        h1Var.g(i10);
        long j11 = 0;
        if (a2 != -9223372036854775807L && 0 >= a2) {
            j11 = Math.max(0L, a2 - 1);
        }
        return new t0(g0Var, j11, j3, -9223372036854775807L, a2, z10, false, false, false, false);
    }

    public final t0 f(b2.k1 k1Var, Object obj, long j3, long j10, long j11, boolean z10) {
        long j12;
        long j13;
        long j14;
        b2.h1 h1Var = this.f10376a;
        k1Var.g(obj, h1Var);
        int b10 = h1Var.b(j3);
        boolean z11 = false;
        if (b10 == -1) {
            if (h1Var.f1709g.f1629a > 0) {
                h1Var.g(0);
            }
        } else {
            h1Var.g(b10);
        }
        u2.g0 g0Var = new u2.g0(obj, j11, b10);
        if (!g0Var.b() && b10 == -1) {
            z11 = true;
        }
        boolean j15 = j(k1Var, g0Var);
        boolean i10 = i(k1Var, g0Var, z11);
        if (b10 != -1) {
            h1Var.g(b10);
        }
        if (b10 != -1) {
            h1Var.f(b10);
        }
        if (b10 != -1) {
            h1Var.d(b10);
            j12 = 0;
        } else {
            j12 = -9223372036854775807L;
        }
        if (j12 != -9223372036854775807L && j12 != Long.MIN_VALUE) {
            j13 = j12;
        } else {
            j13 = h1Var.d;
        }
        if (j13 != -9223372036854775807L && j3 >= j13) {
            j14 = Math.max(0L, j13 - 1);
        } else {
            j14 = j3;
        }
        return new t0(g0Var, j14, j10, j12, j13, z10, false, z11, j15, i10);
    }

    public final s0 g() {
        return this.f10383k;
    }

    public final t0 h(b2.k1 k1Var, t0 t0Var) {
        boolean z10;
        long j3;
        long j10;
        u2.g0 g0Var = t0Var.f10368a;
        boolean b10 = g0Var.b();
        int i10 = g0Var.e;
        if (!b10 && i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = g0Var.f42325b;
        boolean j11 = j(k1Var, g0Var);
        boolean i12 = i(k1Var, g0Var, z10);
        Object obj = g0Var.f42324a;
        b2.h1 h1Var = this.f10376a;
        k1Var.g(obj, h1Var);
        if (!g0Var.b() && i10 != -1) {
            h1Var.d(i10);
            j3 = 0;
        } else {
            j3 = -9223372036854775807L;
        }
        if (g0Var.b()) {
            j10 = h1Var.a(i11, g0Var.f42326c);
        } else if (j3 != -9223372036854775807L && j3 != Long.MIN_VALUE) {
            j10 = j3;
        } else {
            j10 = h1Var.d;
        }
        if (g0Var.b()) {
            h1Var.g(i11);
        } else if (i10 != -1) {
            h1Var.g(i10);
        }
        return new t0(g0Var, t0Var.f10369b, t0Var.f10370c, j3, j10, t0Var.f10371f, false, z10, j11, i12);
    }

    public final boolean i(b2.k1 k1Var, u2.g0 g0Var, boolean z10) {
        int b10 = k1Var.b(g0Var.f42324a);
        if (!k1Var.m(k1Var.f(b10, this.f10376a, false).f1707c, this.f10377b, 0L).f1756i) {
            if (k1Var.d(b10, this.f10376a, this.f10377b, this.f10380g, this.h) == -1 && z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(b2.k1 k1Var, u2.g0 g0Var) {
        boolean z10;
        if (!g0Var.b() && g0Var.e == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object obj = g0Var.f42324a;
        if (z10) {
            int i10 = k1Var.g(obj, this.f10376a).f1707c;
            if (k1Var.m(i10, this.f10377b, 0L).f1762o == k1Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        s0 s0Var = this.f10385m;
        if (s0Var == null || s0Var.h()) {
            this.f10385m = null;
            for (int i10 = 0; i10 < this.f10389q.size(); i10++) {
                s0 s0Var2 = (s0) this.f10389q.get(i10);
                if (!s0Var2.h()) {
                    this.f10385m = s0Var2;
                    return;
                }
            }
        }
    }

    public final void l() {
        u2.g0 g0Var;
        e9.f0 u10 = e9.i0.u();
        for (s0 s0Var = this.f10381i; s0Var != null; s0Var = s0Var.f10362m) {
            u10.b(s0Var.f10357g.f10368a);
        }
        s0 s0Var2 = this.f10382j;
        if (s0Var2 == null) {
            g0Var = null;
        } else {
            g0Var = s0Var2.f10357g.f10368a;
        }
        this.d.c(new gg.a0(this, u10, g0Var, 9));
    }

    public final void m(long j3) {
        boolean z10;
        s0 s0Var = this.f10384l;
        if (s0Var != null) {
            if (s0Var.f10362m == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            if (s0Var.e) {
                s0Var.f10353a.u(j3 - s0Var.f10365p);
            }
        }
    }

    public final int n(s0 s0Var) {
        e2.d.h(s0Var);
        int i10 = 0;
        if (s0Var.equals(this.f10384l)) {
            return 0;
        }
        this.f10384l = s0Var;
        while (true) {
            s0Var = s0Var.f10362m;
            if (s0Var == null) {
                break;
            }
            if (s0Var == this.f10382j) {
                s0 s0Var2 = this.f10381i;
                this.f10382j = s0Var2;
                this.f10383k = s0Var2;
                i10 = 3;
            }
            if (s0Var == this.f10383k) {
                this.f10383k = this.f10382j;
                i10 |= 2;
            }
            s0Var.i();
            this.f10386n--;
        }
        s0 s0Var3 = this.f10384l;
        s0Var3.getClass();
        if (s0Var3.f10362m != null) {
            s0Var3.b();
            s0Var3.f10362m = null;
            s0Var3.c();
        }
        l();
        return i10;
    }

    public final u2.g0 p(b2.k1 k1Var, Object obj, long j3) {
        long q6;
        int b10;
        Object obj2 = obj;
        b2.h1 h1Var = this.f10376a;
        int i10 = k1Var.g(obj2, h1Var).f1707c;
        Object obj3 = this.f10387o;
        if (obj3 != null && (b10 = k1Var.b(obj3)) != -1 && k1Var.f(b10, h1Var, false).f1707c == i10) {
            q6 = this.f10388p;
        } else {
            s0 s0Var = this.f10381i;
            while (true) {
                if (s0Var != null) {
                    if (s0Var.f10354b.equals(obj2)) {
                        q6 = s0Var.f10357g.f10368a.d;
                        break;
                    }
                    s0Var = s0Var.f10362m;
                } else {
                    s0 s0Var2 = this.f10381i;
                    while (true) {
                        if (s0Var2 != null) {
                            int b11 = k1Var.b(s0Var2.f10354b);
                            if (b11 != -1 && k1Var.f(b11, h1Var, false).f1707c == i10) {
                                q6 = s0Var2.f10357g.f10368a.d;
                                break;
                            }
                            s0Var2 = s0Var2.f10362m;
                        } else {
                            q6 = q(obj2);
                            if (q6 == -1) {
                                q6 = this.f10379f;
                                this.f10379f = 1 + q6;
                                if (this.f10381i == null) {
                                    this.f10387o = obj2;
                                    this.f10388p = q6;
                                }
                            }
                        }
                    }
                }
            }
        }
        k1Var.g(obj2, h1Var);
        int i11 = h1Var.f1707c;
        b2.j1 j1Var = this.f10377b;
        k1Var.n(i11, j1Var);
        boolean z10 = false;
        for (int b12 = k1Var.b(obj); b12 >= j1Var.f1761n; b12--) {
            boolean z11 = true;
            k1Var.f(b12, h1Var, true);
            if (h1Var.f1709g.f1629a <= 0) {
                z11 = false;
            }
            z10 |= z11;
            if (h1Var.c(h1Var.d) != -1) {
                obj2 = h1Var.f1706b;
                obj2.getClass();
            }
            if (z10 && (!z11 || h1Var.d != 0)) {
                break;
            }
        }
        return o(k1Var, obj2, j3, q6, this.f10377b, this.f10376a);
    }

    public final long q(Object obj) {
        for (int i10 = 0; i10 < this.f10389q.size(); i10++) {
            s0 s0Var = (s0) this.f10389q.get(i10);
            if (s0Var.f10354b.equals(obj)) {
                return s0Var.f10357g.f10368a.d;
            }
        }
        return -1L;
    }

    public final int r(b2.k1 k1Var) {
        b2.k1 k1Var2;
        s0 s0Var;
        s0 s0Var2 = this.f10381i;
        if (s0Var2 == null) {
            return 0;
        }
        int b10 = k1Var.b(s0Var2.f10354b);
        while (true) {
            k1Var2 = k1Var;
            b10 = k1Var2.d(b10, this.f10376a, this.f10377b, this.f10380g, this.h);
            while (true) {
                s0Var2.getClass();
                s0Var = s0Var2.f10362m;
                if (s0Var == null || s0Var2.f10357g.h) {
                    break;
                }
                s0Var2 = s0Var;
            }
            if (b10 == -1 || s0Var == null || k1Var2.b(s0Var.f10354b) != b10) {
                break;
            }
            s0Var2 = s0Var;
            k1Var = k1Var2;
        }
        int n10 = n(s0Var2);
        s0Var2.f10357g = h(k1Var2, s0Var2.f10357g);
        return n10;
    }

    public final int s(b2.k1 r18, long r19, long r21, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: i2.u0.s(b2.k1, long, long, long):int");
    }
}
