package i2;

import android.util.Pair;
import java.util.ArrayList;
public final class v0 {
    public final j2.f f11786c;
    public final e2.z d;
    public final fi.f f11787e;
    public long f11788f;
    public int f11789g;
    public boolean h;
    public t0 f11790i;
    public t0 f11791j;
    public t0 f11792k;
    public t0 f11793l;
    public t0 f11794m;
    public int f11795n;
    public Object f11796o;
    public long f11797p;
    public final b2.h1 f11784a = new b2.h1();
    public final b2.j1 f11785b = new b2.j1();
    public ArrayList f11798q = new ArrayList();

    public v0(j2.f fVar, e2.z zVar, fi.f fVar2) {
        this.f11786c = fVar;
        this.d = zVar;
        this.f11787e = fVar2;
    }

    public static u2.f0 o(b2.k1 k1Var, Object obj, long j3, long j10, b2.j1 j1Var, b2.h1 h1Var) {
        k1Var.g(obj, h1Var);
        k1Var.n(h1Var.f2083c, j1Var);
        k1Var.b(obj);
        int i10 = h1Var.f2086g.f1995a;
        if (i10 != 0) {
            if (i10 == 1) {
                h1Var.f(0);
            }
            h1Var.f2086g.getClass();
            h1Var.g(0);
        }
        k1Var.g(obj, h1Var);
        int c10 = h1Var.c(j3);
        if (c10 == -1) {
            return new u2.f0(obj, j10, h1Var.b(j3));
        }
        return new u2.f0(c10, h1Var.e(c10), -1, j10, obj);
    }

    public final t0 a() {
        t0 t0Var = this.f11790i;
        if (t0Var == null) {
            return null;
        }
        if (t0Var == this.f11791j) {
            this.f11791j = t0Var.f11769m;
        }
        if (t0Var == this.f11792k) {
            this.f11792k = t0Var.f11769m;
        }
        t0Var.i();
        int i10 = this.f11795n - 1;
        this.f11795n = i10;
        if (i10 == 0) {
            this.f11793l = null;
            t0 t0Var2 = this.f11790i;
            this.f11796o = t0Var2.f11760b;
            this.f11797p = t0Var2.f11764g.f11775a.d;
        }
        this.f11790i = this.f11790i.f11769m;
        l();
        return this.f11790i;
    }

    public final void b() {
        if (this.f11795n == 0) {
            return;
        }
        t0 t0Var = this.f11790i;
        e2.d.h(t0Var);
        this.f11796o = t0Var.f11760b;
        this.f11797p = t0Var.f11764g.f11775a.d;
        while (t0Var != null) {
            t0Var.i();
            t0Var = t0Var.f11769m;
        }
        this.f11790i = null;
        this.f11793l = null;
        this.f11791j = null;
        this.f11792k = null;
        this.f11795n = 0;
        l();
    }

    public final u0 c(b2.k1 k1Var, t0 t0Var, long j3) {
        b2.h1 h1Var;
        long j10;
        b2.k1 k1Var2;
        Object obj;
        long j11;
        long j12;
        long j13;
        long q6;
        u0 u0Var = t0Var.f11764g;
        long j14 = (t0Var.f11772p + u0Var.f11778e) - j3;
        if (u0Var.h) {
            u0 u0Var2 = t0Var.f11764g;
            u2.f0 f0Var = u0Var2.f11775a;
            long j15 = u0Var2.f11777c;
            int d = k1Var.d(k1Var.b(f0Var.f46695a), this.f11784a, this.f11785b, this.f11789g, this.h);
            if (d != -1) {
                b2.h1 h1Var2 = this.f11784a;
                int i10 = k1Var.f(d, h1Var2, true).f2083c;
                Object obj2 = h1Var2.f2082b;
                obj2.getClass();
                long j16 = f0Var.d;
                if (k1Var.m(i10, this.f11785b, 0L).f2144n == d) {
                    Pair j17 = k1Var.j(this.f11785b, this.f11784a, i10, -9223372036854775807L, Math.max(0L, j14));
                    if (j17 != null) {
                        Object obj3 = j17.first;
                        long longValue = ((Long) j17.second).longValue();
                        t0 t0Var2 = t0Var.f11769m;
                        if (t0Var2 != null && t0Var2.f11760b.equals(obj3)) {
                            q6 = t0Var2.f11764g.f11775a.d;
                        } else {
                            q6 = q(obj3);
                            if (q6 == -1) {
                                q6 = this.f11788f;
                                this.f11788f = 1 + q6;
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
                u2.f0 o9 = o(k1Var, obj, j11, j13, this.f11785b, this.f11784a);
                if (j12 != -9223372036854775807L && j15 != -9223372036854775807L) {
                    int i11 = k1Var.g(f0Var.f46695a, h1Var2).f2086g.f1995a;
                    h1Var2.f2086g.getClass();
                    if (i11 > 0) {
                        h1Var2.g(0);
                    }
                }
                return d(k1Var, o9, j12, j11);
            }
            return null;
        }
        u2.f0 f0Var2 = u0Var.f11775a;
        Object obj4 = f0Var2.f46695a;
        int i12 = f0Var2.f46698e;
        b2.h1 h1Var3 = this.f11784a;
        k1Var.g(obj4, h1Var3);
        boolean z10 = u0Var.f11780g;
        if (f0Var2.b()) {
            int i13 = f0Var2.f46696b;
            int i14 = h1Var3.f2086g.a(i13).f1972a;
            if (i14 != -1) {
                int a2 = h1Var3.f2086g.a(i13).a(f0Var2.f46697c);
                if (a2 < i14) {
                    return e(k1Var, f0Var2.f46695a, i13, a2, u0Var.f11777c, f0Var2.d, z10);
                }
                long j18 = u0Var.f11777c;
                if (j18 == -9223372036854775807L) {
                    int i15 = h1Var3.f2083c;
                    long max = Math.max(0L, j14);
                    j10 = 0;
                    Pair j19 = k1Var.j(this.f11785b, h1Var3, i15, -9223372036854775807L, max);
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
                int i16 = f0Var2.f46696b;
                k1Var2.g(obj4, h1Var);
                h1Var.d(i16);
                h1Var.f2086g.a(i16).getClass();
                return f(k1Var, f0Var2.f46695a, Math.max(j10, j18), u0Var.f11777c, f0Var2.d, z10);
            }
            return null;
        }
        if (i12 != -1) {
            h1Var3.f(i12);
        }
        int e7 = h1Var3.e(i12);
        h1Var3.g(i12);
        if (e7 != h1Var3.f2086g.a(i12).f1972a) {
            return e(k1Var, f0Var2.f46695a, f0Var2.f46698e, e7, u0Var.f11778e, f0Var2.d, z10);
        }
        k1Var.g(obj4, h1Var3);
        h1Var3.d(i12);
        h1Var3.f2086g.a(i12).getClass();
        return f(k1Var, f0Var2.f46695a, 0L, u0Var.f11778e, f0Var2.d, false);
    }

    public final u0 d(b2.k1 k1Var, u2.f0 f0Var, long j3, long j10) {
        k1Var.g(f0Var.f46695a, this.f11784a);
        if (f0Var.b()) {
            return e(k1Var, f0Var.f46695a, f0Var.f46696b, f0Var.f46697c, j3, f0Var.d, false);
        }
        return f(k1Var, f0Var.f46695a, j10, j3, f0Var.d, false);
    }

    public final u0 e(b2.k1 k1Var, Object obj, int i10, int i11, long j3, long j10, boolean z10) {
        u2.f0 f0Var = new u2.f0(i10, i11, -1, j10, obj);
        b2.h1 h1Var = this.f11784a;
        long a2 = k1Var.g(obj, h1Var).a(i10, i11);
        if (i11 == h1Var.e(i10)) {
            h1Var.f2086g.getClass();
        }
        h1Var.g(i10);
        long j11 = 0;
        if (a2 != -9223372036854775807L && 0 >= a2) {
            j11 = Math.max(0L, a2 - 1);
        }
        return new u0(f0Var, j11, j3, -9223372036854775807L, a2, z10, false, false, false, false);
    }

    public final u0 f(b2.k1 k1Var, Object obj, long j3, long j10, long j11, boolean z10) {
        long j12;
        long j13;
        long j14;
        b2.h1 h1Var = this.f11784a;
        k1Var.g(obj, h1Var);
        int b10 = h1Var.b(j3);
        boolean z11 = false;
        if (b10 == -1) {
            if (h1Var.f2086g.f1995a > 0) {
                h1Var.g(0);
            }
        } else {
            h1Var.g(b10);
        }
        u2.f0 f0Var = new u2.f0(obj, j11, b10);
        if (!f0Var.b() && b10 == -1) {
            z11 = true;
        }
        boolean j15 = j(k1Var, f0Var);
        boolean i10 = i(k1Var, f0Var, z11);
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
        return new u0(f0Var, j14, j10, j12, j13, z10, false, z11, j15, i10);
    }

    public final t0 g() {
        return this.f11792k;
    }

    public final u0 h(b2.k1 k1Var, u0 u0Var) {
        boolean z10;
        long j3;
        long j10;
        u2.f0 f0Var = u0Var.f11775a;
        boolean b10 = f0Var.b();
        int i10 = f0Var.f46698e;
        if (!b10 && i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = f0Var.f46696b;
        boolean j11 = j(k1Var, f0Var);
        boolean i12 = i(k1Var, f0Var, z10);
        Object obj = f0Var.f46695a;
        b2.h1 h1Var = this.f11784a;
        k1Var.g(obj, h1Var);
        if (!f0Var.b() && i10 != -1) {
            h1Var.d(i10);
            j3 = 0;
        } else {
            j3 = -9223372036854775807L;
        }
        if (f0Var.b()) {
            j10 = h1Var.a(i11, f0Var.f46697c);
        } else if (j3 != -9223372036854775807L && j3 != Long.MIN_VALUE) {
            j10 = j3;
        } else {
            j10 = h1Var.d;
        }
        if (f0Var.b()) {
            h1Var.g(i11);
        } else if (i10 != -1) {
            h1Var.g(i10);
        }
        return new u0(f0Var, u0Var.f11776b, u0Var.f11777c, j3, j10, u0Var.f11779f, false, z10, j11, i12);
    }

    public final boolean i(b2.k1 k1Var, u2.f0 f0Var, boolean z10) {
        int b10 = k1Var.b(f0Var.f46695a);
        if (!k1Var.m(k1Var.f(b10, this.f11784a, false).f2083c, this.f11785b, 0L).f2139i) {
            if (k1Var.d(b10, this.f11784a, this.f11785b, this.f11789g, this.h) == -1 && z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(b2.k1 k1Var, u2.f0 f0Var) {
        boolean z10;
        if (!f0Var.b() && f0Var.f46698e == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object obj = f0Var.f46695a;
        if (z10) {
            int i10 = k1Var.g(obj, this.f11784a).f2083c;
            if (k1Var.m(i10, this.f11785b, 0L).f2145o == k1Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        t0 t0Var = this.f11794m;
        if (t0Var == null || t0Var.h()) {
            this.f11794m = null;
            for (int i10 = 0; i10 < this.f11798q.size(); i10++) {
                t0 t0Var2 = (t0) this.f11798q.get(i10);
                if (!t0Var2.h()) {
                    this.f11794m = t0Var2;
                    return;
                }
            }
        }
    }

    public final void l() {
        u2.f0 f0Var;
        e9.f0 u10 = e9.i0.u();
        for (t0 t0Var = this.f11790i; t0Var != null; t0Var = t0Var.f11769m) {
            u10.b(t0Var.f11764g.f11775a);
        }
        t0 t0Var2 = this.f11791j;
        if (t0Var2 == null) {
            f0Var = null;
        } else {
            f0Var = t0Var2.f11764g.f11775a;
        }
        this.d.c(new hg.t(this, u10, f0Var, 5));
    }

    public final void m(long j3) {
        boolean z10;
        t0 t0Var = this.f11793l;
        if (t0Var != null) {
            if (t0Var.f11769m == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            if (t0Var.f11762e) {
                t0Var.f11759a.u(j3 - t0Var.f11772p);
            }
        }
    }

    public final int n(t0 t0Var) {
        e2.d.h(t0Var);
        int i10 = 0;
        if (t0Var.equals(this.f11793l)) {
            return 0;
        }
        this.f11793l = t0Var;
        while (true) {
            t0Var = t0Var.f11769m;
            if (t0Var == null) {
                break;
            }
            if (t0Var == this.f11791j) {
                t0 t0Var2 = this.f11790i;
                this.f11791j = t0Var2;
                this.f11792k = t0Var2;
                i10 = 3;
            }
            if (t0Var == this.f11792k) {
                this.f11792k = this.f11791j;
                i10 |= 2;
            }
            t0Var.i();
            this.f11795n--;
        }
        t0 t0Var3 = this.f11793l;
        t0Var3.getClass();
        if (t0Var3.f11769m != null) {
            t0Var3.b();
            t0Var3.f11769m = null;
            t0Var3.c();
        }
        l();
        return i10;
    }

    public final u2.f0 p(b2.k1 k1Var, Object obj, long j3) {
        long q6;
        int b10;
        Object obj2 = obj;
        b2.h1 h1Var = this.f11784a;
        int i10 = k1Var.g(obj2, h1Var).f2083c;
        Object obj3 = this.f11796o;
        if (obj3 != null && (b10 = k1Var.b(obj3)) != -1 && k1Var.f(b10, h1Var, false).f2083c == i10) {
            q6 = this.f11797p;
        } else {
            t0 t0Var = this.f11790i;
            while (true) {
                if (t0Var != null) {
                    if (t0Var.f11760b.equals(obj2)) {
                        q6 = t0Var.f11764g.f11775a.d;
                        break;
                    }
                    t0Var = t0Var.f11769m;
                } else {
                    t0 t0Var2 = this.f11790i;
                    while (true) {
                        if (t0Var2 != null) {
                            int b11 = k1Var.b(t0Var2.f11760b);
                            if (b11 != -1 && k1Var.f(b11, h1Var, false).f2083c == i10) {
                                q6 = t0Var2.f11764g.f11775a.d;
                                break;
                            }
                            t0Var2 = t0Var2.f11769m;
                        } else {
                            q6 = q(obj2);
                            if (q6 == -1) {
                                q6 = this.f11788f;
                                this.f11788f = 1 + q6;
                                if (this.f11790i == null) {
                                    this.f11796o = obj2;
                                    this.f11797p = q6;
                                }
                            }
                        }
                    }
                }
            }
        }
        k1Var.g(obj2, h1Var);
        int i11 = h1Var.f2083c;
        b2.j1 j1Var = this.f11785b;
        k1Var.n(i11, j1Var);
        boolean z10 = false;
        for (int b12 = k1Var.b(obj); b12 >= j1Var.f2144n; b12--) {
            boolean z11 = true;
            k1Var.f(b12, h1Var, true);
            if (h1Var.f2086g.f1995a <= 0) {
                z11 = false;
            }
            z10 |= z11;
            if (h1Var.c(h1Var.d) != -1) {
                obj2 = h1Var.f2082b;
                obj2.getClass();
            }
            if (z10 && (!z11 || h1Var.d != 0)) {
                break;
            }
        }
        return o(k1Var, obj2, j3, q6, this.f11785b, this.f11784a);
    }

    public final long q(Object obj) {
        for (int i10 = 0; i10 < this.f11798q.size(); i10++) {
            t0 t0Var = (t0) this.f11798q.get(i10);
            if (t0Var.f11760b.equals(obj)) {
                return t0Var.f11764g.f11775a.d;
            }
        }
        return -1L;
    }

    public final int r(b2.k1 k1Var) {
        b2.k1 k1Var2;
        t0 t0Var;
        t0 t0Var2 = this.f11790i;
        if (t0Var2 == null) {
            return 0;
        }
        int b10 = k1Var.b(t0Var2.f11760b);
        while (true) {
            k1Var2 = k1Var;
            b10 = k1Var2.d(b10, this.f11784a, this.f11785b, this.f11789g, this.h);
            while (true) {
                t0Var2.getClass();
                t0Var = t0Var2.f11769m;
                if (t0Var == null || t0Var2.f11764g.h) {
                    break;
                }
                t0Var2 = t0Var;
            }
            if (b10 == -1 || t0Var == null || k1Var2.b(t0Var.f11760b) != b10) {
                break;
            }
            t0Var2 = t0Var;
            k1Var = k1Var2;
        }
        int n10 = n(t0Var2);
        t0Var2.f11764g = h(k1Var2, t0Var2.f11764g);
        return n10;
    }

    public final int s(b2.k1 r18, long r19, long r21, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: i2.v0.s(b2.k1, long, long, long):int");
    }
}
