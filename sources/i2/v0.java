package i2;

import android.util.Pair;
import ei.d5;
import java.util.ArrayList;
public final class v0 {
    public final j2.f f10902c;
    public final e2.z d;
    public final d5 e;
    public long f10903f;
    public int f10904g;
    public boolean h;
    public t0 f10905i;
    public t0 f10906j;
    public t0 f10907k;
    public t0 f10908l;
    public t0 f10909m;
    public int f10910n;
    public Object f10911o;
    public long f10912p;
    public final b2.h1 f10900a = new b2.h1();
    public final b2.j1 f10901b = new b2.j1();
    public ArrayList f10913q = new ArrayList();

    public v0(j2.f fVar, e2.z zVar, d5 d5Var) {
        this.f10902c = fVar;
        this.d = zVar;
        this.e = d5Var;
    }

    public static u2.f0 o(b2.k1 k1Var, Object obj, long j3, long j10, b2.j1 j1Var, b2.h1 h1Var) {
        k1Var.g(obj, h1Var);
        k1Var.n(h1Var.f3014c, j1Var);
        k1Var.b(obj);
        int i10 = h1Var.f3016g.f2936a;
        if (i10 != 0) {
            if (i10 == 1) {
                h1Var.f(0);
            }
            h1Var.f3016g.getClass();
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
        t0 t0Var = this.f10905i;
        if (t0Var == null) {
            return null;
        }
        if (t0Var == this.f10906j) {
            this.f10906j = t0Var.f10886m;
        }
        if (t0Var == this.f10907k) {
            this.f10907k = t0Var.f10886m;
        }
        t0Var.i();
        int i10 = this.f10910n - 1;
        this.f10910n = i10;
        if (i10 == 0) {
            this.f10908l = null;
            t0 t0Var2 = this.f10905i;
            this.f10911o = t0Var2.f10878b;
            this.f10912p = t0Var2.f10881g.f10891a.d;
        }
        this.f10905i = this.f10905i.f10886m;
        l();
        return this.f10905i;
    }

    public final void b() {
        if (this.f10910n == 0) {
            return;
        }
        t0 t0Var = this.f10905i;
        e2.d.h(t0Var);
        this.f10911o = t0Var.f10878b;
        this.f10912p = t0Var.f10881g.f10891a.d;
        while (t0Var != null) {
            t0Var.i();
            t0Var = t0Var.f10886m;
        }
        this.f10905i = null;
        this.f10908l = null;
        this.f10906j = null;
        this.f10907k = null;
        this.f10910n = 0;
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
        u0 u0Var = t0Var.f10881g;
        long j14 = (t0Var.f10889p + u0Var.e) - j3;
        if (u0Var.h) {
            u0 u0Var2 = t0Var.f10881g;
            u2.f0 f0Var = u0Var2.f10891a;
            long j15 = u0Var2.f10893c;
            int d = k1Var.d(k1Var.b(f0Var.f43385a), this.f10900a, this.f10901b, this.f10904g, this.h);
            if (d != -1) {
                b2.h1 h1Var2 = this.f10900a;
                int i10 = k1Var.f(d, h1Var2, true).f3014c;
                Object obj2 = h1Var2.f3013b;
                obj2.getClass();
                long j16 = f0Var.d;
                if (k1Var.m(i10, this.f10901b, 0L).f3068n == d) {
                    Pair j17 = k1Var.j(this.f10901b, this.f10900a, i10, -9223372036854775807L, Math.max(0L, j14));
                    if (j17 != null) {
                        Object obj3 = j17.first;
                        long longValue = ((Long) j17.second).longValue();
                        t0 t0Var2 = t0Var.f10886m;
                        if (t0Var2 != null && t0Var2.f10878b.equals(obj3)) {
                            q6 = t0Var2.f10881g.f10891a.d;
                        } else {
                            q6 = q(obj3);
                            if (q6 == -1) {
                                q6 = this.f10903f;
                                this.f10903f = 1 + q6;
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
                u2.f0 o9 = o(k1Var, obj, j11, j13, this.f10901b, this.f10900a);
                if (j12 != -9223372036854775807L && j15 != -9223372036854775807L) {
                    int i11 = k1Var.g(f0Var.f43385a, h1Var2).f3016g.f2936a;
                    h1Var2.f3016g.getClass();
                    if (i11 > 0) {
                        h1Var2.g(0);
                    }
                }
                return d(k1Var, o9, j12, j11);
            }
            return null;
        }
        u2.f0 f0Var2 = u0Var.f10891a;
        Object obj4 = f0Var2.f43385a;
        int i12 = f0Var2.e;
        b2.h1 h1Var3 = this.f10900a;
        k1Var.g(obj4, h1Var3);
        boolean z10 = u0Var.f10895g;
        if (f0Var2.b()) {
            int i13 = f0Var2.f43386b;
            int i14 = h1Var3.f3016g.a(i13).f2916a;
            if (i14 != -1) {
                int a2 = h1Var3.f3016g.a(i13).a(f0Var2.f43387c);
                if (a2 < i14) {
                    return e(k1Var, f0Var2.f43385a, i13, a2, u0Var.f10893c, f0Var2.d, z10);
                }
                long j18 = u0Var.f10893c;
                if (j18 == -9223372036854775807L) {
                    int i15 = h1Var3.f3014c;
                    long max = Math.max(0L, j14);
                    j10 = 0;
                    Pair j19 = k1Var.j(this.f10901b, h1Var3, i15, -9223372036854775807L, max);
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
                int i16 = f0Var2.f43386b;
                k1Var2.g(obj4, h1Var);
                h1Var.d(i16);
                h1Var.f3016g.a(i16).getClass();
                return f(k1Var, f0Var2.f43385a, Math.max(j10, j18), u0Var.f10893c, f0Var2.d, z10);
            }
            return null;
        }
        if (i12 != -1) {
            h1Var3.f(i12);
        }
        int e = h1Var3.e(i12);
        h1Var3.g(i12);
        if (e != h1Var3.f3016g.a(i12).f2916a) {
            return e(k1Var, f0Var2.f43385a, f0Var2.e, e, u0Var.e, f0Var2.d, z10);
        }
        k1Var.g(obj4, h1Var3);
        h1Var3.d(i12);
        h1Var3.f3016g.a(i12).getClass();
        return f(k1Var, f0Var2.f43385a, 0L, u0Var.e, f0Var2.d, false);
    }

    public final u0 d(b2.k1 k1Var, u2.f0 f0Var, long j3, long j10) {
        k1Var.g(f0Var.f43385a, this.f10900a);
        if (f0Var.b()) {
            return e(k1Var, f0Var.f43385a, f0Var.f43386b, f0Var.f43387c, j3, f0Var.d, false);
        }
        return f(k1Var, f0Var.f43385a, j10, j3, f0Var.d, false);
    }

    public final u0 e(b2.k1 k1Var, Object obj, int i10, int i11, long j3, long j10, boolean z10) {
        u2.f0 f0Var = new u2.f0(i10, i11, -1, j10, obj);
        b2.h1 h1Var = this.f10900a;
        long a2 = k1Var.g(obj, h1Var).a(i10, i11);
        if (i11 == h1Var.e(i10)) {
            h1Var.f3016g.getClass();
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
        b2.h1 h1Var = this.f10900a;
        k1Var.g(obj, h1Var);
        int b10 = h1Var.b(j3);
        boolean z11 = false;
        if (b10 == -1) {
            if (h1Var.f3016g.f2936a > 0) {
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
        return this.f10907k;
    }

    public final u0 h(b2.k1 k1Var, u0 u0Var) {
        boolean z10;
        long j3;
        long j10;
        u2.f0 f0Var = u0Var.f10891a;
        boolean b10 = f0Var.b();
        int i10 = f0Var.e;
        if (!b10 && i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = f0Var.f43386b;
        boolean j11 = j(k1Var, f0Var);
        boolean i12 = i(k1Var, f0Var, z10);
        Object obj = f0Var.f43385a;
        b2.h1 h1Var = this.f10900a;
        k1Var.g(obj, h1Var);
        if (!f0Var.b() && i10 != -1) {
            h1Var.d(i10);
            j3 = 0;
        } else {
            j3 = -9223372036854775807L;
        }
        if (f0Var.b()) {
            j10 = h1Var.a(i11, f0Var.f43387c);
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
        return new u0(f0Var, u0Var.f10892b, u0Var.f10893c, j3, j10, u0Var.f10894f, false, z10, j11, i12);
    }

    public final boolean i(b2.k1 k1Var, u2.f0 f0Var, boolean z10) {
        int b10 = k1Var.b(f0Var.f43385a);
        if (!k1Var.m(k1Var.f(b10, this.f10900a, false).f3014c, this.f10901b, 0L).f3063i) {
            if (k1Var.d(b10, this.f10900a, this.f10901b, this.f10904g, this.h) == -1 && z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(b2.k1 k1Var, u2.f0 f0Var) {
        boolean z10;
        if (!f0Var.b() && f0Var.e == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object obj = f0Var.f43385a;
        if (z10) {
            int i10 = k1Var.g(obj, this.f10900a).f3014c;
            if (k1Var.m(i10, this.f10901b, 0L).f3069o == k1Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        t0 t0Var = this.f10909m;
        if (t0Var == null || t0Var.h()) {
            this.f10909m = null;
            for (int i10 = 0; i10 < this.f10913q.size(); i10++) {
                t0 t0Var2 = (t0) this.f10913q.get(i10);
                if (!t0Var2.h()) {
                    this.f10909m = t0Var2;
                    return;
                }
            }
        }
    }

    public final void l() {
        u2.f0 f0Var;
        e9.f0 u10 = e9.i0.u();
        for (t0 t0Var = this.f10905i; t0Var != null; t0Var = t0Var.f10886m) {
            u10.b(t0Var.f10881g.f10891a);
        }
        t0 t0Var2 = this.f10906j;
        if (t0Var2 == null) {
            f0Var = null;
        } else {
            f0Var = t0Var2.f10881g.f10891a;
        }
        this.d.c(new gg.t(this, u10, f0Var, 13));
    }

    public final void m(long j3) {
        boolean z10;
        t0 t0Var = this.f10908l;
        if (t0Var != null) {
            if (t0Var.f10886m == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            if (t0Var.e) {
                t0Var.f10877a.u(j3 - t0Var.f10889p);
            }
        }
    }

    public final int n(t0 t0Var) {
        e2.d.h(t0Var);
        int i10 = 0;
        if (t0Var.equals(this.f10908l)) {
            return 0;
        }
        this.f10908l = t0Var;
        while (true) {
            t0Var = t0Var.f10886m;
            if (t0Var == null) {
                break;
            }
            if (t0Var == this.f10906j) {
                t0 t0Var2 = this.f10905i;
                this.f10906j = t0Var2;
                this.f10907k = t0Var2;
                i10 = 3;
            }
            if (t0Var == this.f10907k) {
                this.f10907k = this.f10906j;
                i10 |= 2;
            }
            t0Var.i();
            this.f10910n--;
        }
        t0 t0Var3 = this.f10908l;
        t0Var3.getClass();
        if (t0Var3.f10886m != null) {
            t0Var3.b();
            t0Var3.f10886m = null;
            t0Var3.c();
        }
        l();
        return i10;
    }

    public final u2.f0 p(b2.k1 k1Var, Object obj, long j3) {
        long q6;
        int b10;
        Object obj2 = obj;
        b2.h1 h1Var = this.f10900a;
        int i10 = k1Var.g(obj2, h1Var).f3014c;
        Object obj3 = this.f10911o;
        if (obj3 != null && (b10 = k1Var.b(obj3)) != -1 && k1Var.f(b10, h1Var, false).f3014c == i10) {
            q6 = this.f10912p;
        } else {
            t0 t0Var = this.f10905i;
            while (true) {
                if (t0Var != null) {
                    if (t0Var.f10878b.equals(obj2)) {
                        q6 = t0Var.f10881g.f10891a.d;
                        break;
                    }
                    t0Var = t0Var.f10886m;
                } else {
                    t0 t0Var2 = this.f10905i;
                    while (true) {
                        if (t0Var2 != null) {
                            int b11 = k1Var.b(t0Var2.f10878b);
                            if (b11 != -1 && k1Var.f(b11, h1Var, false).f3014c == i10) {
                                q6 = t0Var2.f10881g.f10891a.d;
                                break;
                            }
                            t0Var2 = t0Var2.f10886m;
                        } else {
                            q6 = q(obj2);
                            if (q6 == -1) {
                                q6 = this.f10903f;
                                this.f10903f = 1 + q6;
                                if (this.f10905i == null) {
                                    this.f10911o = obj2;
                                    this.f10912p = q6;
                                }
                            }
                        }
                    }
                }
            }
        }
        k1Var.g(obj2, h1Var);
        int i11 = h1Var.f3014c;
        b2.j1 j1Var = this.f10901b;
        k1Var.n(i11, j1Var);
        boolean z10 = false;
        for (int b12 = k1Var.b(obj); b12 >= j1Var.f3068n; b12--) {
            boolean z11 = true;
            k1Var.f(b12, h1Var, true);
            if (h1Var.f3016g.f2936a <= 0) {
                z11 = false;
            }
            z10 |= z11;
            if (h1Var.c(h1Var.d) != -1) {
                obj2 = h1Var.f3013b;
                obj2.getClass();
            }
            if (z10 && (!z11 || h1Var.d != 0)) {
                break;
            }
        }
        return o(k1Var, obj2, j3, q6, this.f10901b, this.f10900a);
    }

    public final long q(Object obj) {
        for (int i10 = 0; i10 < this.f10913q.size(); i10++) {
            t0 t0Var = (t0) this.f10913q.get(i10);
            if (t0Var.f10878b.equals(obj)) {
                return t0Var.f10881g.f10891a.d;
            }
        }
        return -1L;
    }

    public final int r(b2.k1 k1Var) {
        b2.k1 k1Var2;
        t0 t0Var;
        t0 t0Var2 = this.f10905i;
        if (t0Var2 == null) {
            return 0;
        }
        int b10 = k1Var.b(t0Var2.f10878b);
        while (true) {
            k1Var2 = k1Var;
            b10 = k1Var2.d(b10, this.f10900a, this.f10901b, this.f10904g, this.h);
            while (true) {
                t0Var2.getClass();
                t0Var = t0Var2.f10886m;
                if (t0Var == null || t0Var2.f10881g.h) {
                    break;
                }
                t0Var2 = t0Var;
            }
            if (b10 == -1 || t0Var == null || k1Var2.b(t0Var.f10878b) != b10) {
                break;
            }
            t0Var2 = t0Var;
            k1Var = k1Var2;
        }
        int n10 = n(t0Var2);
        t0Var2.f10881g = h(k1Var2, t0Var2.f10881g);
        return n10;
    }

    public final int s(b2.k1 r18, long r19, long r21, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: i2.v0.s(b2.k1, long, long, long):int");
    }
}
