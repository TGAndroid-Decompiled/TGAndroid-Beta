package i2;

import android.util.Pair;
import ei.c5;
import java.util.ArrayList;
public final class w0 {
    public final j2.f f11919c;
    public final e2.z d;
    public final c5 f11920e;
    public long f11921f;
    public int f11922g;
    public boolean h;
    public u0 f11923i;
    public u0 f11924j;
    public u0 f11925k;
    public u0 f11926l;
    public u0 f11927m;
    public int f11928n;
    public Object f11929o;
    public long f11930p;
    public final b2.h1 f11917a = new b2.h1();
    public final b2.j1 f11918b = new b2.j1();
    public ArrayList f11931q = new ArrayList();

    public w0(j2.f fVar, e2.z zVar, c5 c5Var) {
        this.f11919c = fVar;
        this.d = zVar;
        this.f11920e = c5Var;
    }

    public static u2.f0 o(b2.k1 k1Var, Object obj, long j3, long j10, b2.j1 j1Var, b2.h1 h1Var) {
        k1Var.g(obj, h1Var);
        k1Var.n(h1Var.f3329c, j1Var);
        k1Var.b(obj);
        int i10 = h1Var.f3332g.f3241a;
        if (i10 != 0) {
            if (i10 == 1) {
                h1Var.f(0);
            }
            h1Var.f3332g.getClass();
            h1Var.g(0);
        }
        k1Var.g(obj, h1Var);
        int c10 = h1Var.c(j3);
        if (c10 == -1) {
            return new u2.f0(obj, j10, h1Var.b(j3));
        }
        return new u2.f0(c10, h1Var.e(c10), -1, j10, obj);
    }

    public final u0 a() {
        u0 u0Var = this.f11923i;
        if (u0Var == null) {
            return null;
        }
        if (u0Var == this.f11924j) {
            this.f11924j = u0Var.f11901m;
        }
        if (u0Var == this.f11925k) {
            this.f11925k = u0Var.f11901m;
        }
        u0Var.i();
        int i10 = this.f11928n - 1;
        this.f11928n = i10;
        if (i10 == 0) {
            this.f11926l = null;
            u0 u0Var2 = this.f11923i;
            this.f11929o = u0Var2.f11892b;
            this.f11930p = u0Var2.f11896g.f11907a.d;
        }
        this.f11923i = this.f11923i.f11901m;
        l();
        return this.f11923i;
    }

    public final void b() {
        if (this.f11928n == 0) {
            return;
        }
        u0 u0Var = this.f11923i;
        e2.d.h(u0Var);
        this.f11929o = u0Var.f11892b;
        this.f11930p = u0Var.f11896g.f11907a.d;
        while (u0Var != null) {
            u0Var.i();
            u0Var = u0Var.f11901m;
        }
        this.f11923i = null;
        this.f11926l = null;
        this.f11924j = null;
        this.f11925k = null;
        this.f11928n = 0;
        l();
    }

    public final v0 c(b2.k1 k1Var, u0 u0Var, long j3) {
        long j10;
        b2.h1 h1Var;
        b2.k1 k1Var2;
        Object obj;
        long j11;
        long j12;
        long j13;
        long q6;
        v0 v0Var = u0Var.f11896g;
        long j14 = (u0Var.f11904p + v0Var.f11910e) - j3;
        if (v0Var.h) {
            v0 v0Var2 = u0Var.f11896g;
            u2.f0 f0Var = v0Var2.f11907a;
            long j15 = v0Var2.f11909c;
            int d = k1Var.d(k1Var.b(f0Var.f48640a), this.f11917a, this.f11918b, this.f11922g, this.h);
            if (d != -1) {
                b2.h1 h1Var2 = this.f11917a;
                int i10 = k1Var.f(d, h1Var2, true).f3329c;
                Object obj2 = h1Var2.f3328b;
                obj2.getClass();
                long j16 = f0Var.d;
                if (k1Var.m(i10, this.f11918b, 0L).f3390n == d) {
                    Pair j17 = k1Var.j(this.f11918b, this.f11917a, i10, -9223372036854775807L, Math.max(0L, j14));
                    if (j17 != null) {
                        Object obj3 = j17.first;
                        long longValue = ((Long) j17.second).longValue();
                        u0 u0Var2 = u0Var.f11901m;
                        if (u0Var2 != null && u0Var2.f11892b.equals(obj3)) {
                            q6 = u0Var2.f11896g.f11907a.d;
                        } else {
                            q6 = q(obj3);
                            if (q6 == -1) {
                                q6 = this.f11921f;
                                this.f11921f = 1 + q6;
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
                u2.f0 o9 = o(k1Var, obj, j11, j13, this.f11918b, this.f11917a);
                if (j12 != -9223372036854775807L && j15 != -9223372036854775807L) {
                    int i11 = k1Var.g(f0Var.f48640a, h1Var2).f3332g.f3241a;
                    h1Var2.f3332g.getClass();
                    if (i11 > 0) {
                        h1Var2.g(0);
                    }
                }
                return d(k1Var, o9, j12, j11);
            }
            return null;
        }
        u2.f0 f0Var2 = v0Var.f11907a;
        Object obj4 = f0Var2.f48640a;
        int i12 = f0Var2.f48643e;
        b2.h1 h1Var3 = this.f11917a;
        k1Var.g(obj4, h1Var3);
        boolean z10 = v0Var.f11912g;
        if (f0Var2.b()) {
            int i13 = f0Var2.f48641b;
            int i14 = h1Var3.f3332g.a(i13).f3218a;
            if (i14 != -1) {
                int a2 = h1Var3.f3332g.a(i13).a(f0Var2.f48642c);
                if (a2 < i14) {
                    return e(k1Var, f0Var2.f48640a, i13, a2, v0Var.f11909c, f0Var2.d, z10);
                }
                long j18 = v0Var.f11909c;
                if (j18 == -9223372036854775807L) {
                    int i15 = h1Var3.f3329c;
                    long max = Math.max(0L, j14);
                    j10 = 0;
                    Pair j19 = k1Var.j(this.f11918b, h1Var3, i15, -9223372036854775807L, max);
                    h1Var = h1Var3;
                    k1Var2 = k1Var;
                    if (j19 == null) {
                        return null;
                    }
                    j18 = ((Long) j19.second).longValue();
                } else {
                    j10 = 0;
                    h1Var = h1Var3;
                    k1Var2 = k1Var;
                }
                int i16 = f0Var2.f48641b;
                k1Var2.g(obj4, h1Var);
                h1Var.d(i16);
                h1Var.f3332g.a(i16).getClass();
                return f(k1Var, f0Var2.f48640a, Math.max(j10, j18), v0Var.f11909c, f0Var2.d, z10);
            }
            return null;
        }
        if (i12 != -1) {
            h1Var3.f(i12);
        }
        int e7 = h1Var3.e(i12);
        h1Var3.g(i12);
        if (e7 != h1Var3.f3332g.a(i12).f3218a) {
            return e(k1Var, f0Var2.f48640a, f0Var2.f48643e, e7, v0Var.f11910e, f0Var2.d, z10);
        }
        k1Var.g(obj4, h1Var3);
        h1Var3.d(i12);
        h1Var3.f3332g.a(i12).getClass();
        return f(k1Var, f0Var2.f48640a, 0L, v0Var.f11910e, f0Var2.d, false);
    }

    public final v0 d(b2.k1 k1Var, u2.f0 f0Var, long j3, long j10) {
        k1Var.g(f0Var.f48640a, this.f11917a);
        if (f0Var.b()) {
            return e(k1Var, f0Var.f48640a, f0Var.f48641b, f0Var.f48642c, j3, f0Var.d, false);
        }
        return f(k1Var, f0Var.f48640a, j10, j3, f0Var.d, false);
    }

    public final v0 e(b2.k1 k1Var, Object obj, int i10, int i11, long j3, long j10, boolean z10) {
        u2.f0 f0Var = new u2.f0(i10, i11, -1, j10, obj);
        b2.h1 h1Var = this.f11917a;
        long a2 = k1Var.g(obj, h1Var).a(i10, i11);
        if (i11 == h1Var.e(i10)) {
            h1Var.f3332g.getClass();
        }
        h1Var.g(i10);
        long j11 = 0;
        if (a2 != -9223372036854775807L && 0 >= a2) {
            j11 = Math.max(0L, a2 - 1);
        }
        return new v0(f0Var, j11, j3, -9223372036854775807L, a2, z10, false, false, false, false);
    }

    public final v0 f(b2.k1 k1Var, Object obj, long j3, long j10, long j11, boolean z10) {
        long j12;
        long j13;
        long j14;
        b2.h1 h1Var = this.f11917a;
        k1Var.g(obj, h1Var);
        int b10 = h1Var.b(j3);
        boolean z11 = false;
        if (b10 == -1) {
            if (h1Var.f3332g.f3241a > 0) {
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
        return new v0(f0Var, j14, j10, j12, j13, z10, false, z11, j15, i10);
    }

    public final u0 g() {
        return this.f11925k;
    }

    public final v0 h(b2.k1 k1Var, v0 v0Var) {
        boolean z10;
        long j3;
        long j10;
        u2.f0 f0Var = v0Var.f11907a;
        boolean b10 = f0Var.b();
        int i10 = f0Var.f48643e;
        if (!b10 && i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        int i11 = f0Var.f48641b;
        boolean j11 = j(k1Var, f0Var);
        boolean i12 = i(k1Var, f0Var, z11);
        Object obj = f0Var.f48640a;
        b2.h1 h1Var = this.f11917a;
        k1Var.g(obj, h1Var);
        if (!f0Var.b() && i10 != -1) {
            h1Var.d(i10);
            j3 = 0;
        } else {
            j3 = -9223372036854775807L;
        }
        if (f0Var.b()) {
            j10 = h1Var.a(i11, f0Var.f48642c);
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
        return new v0(f0Var, v0Var.f11908b, v0Var.f11909c, j3, j10, v0Var.f11911f, false, z11, j11, i12);
    }

    public final boolean i(b2.k1 k1Var, u2.f0 f0Var, boolean z10) {
        int b10 = k1Var.b(f0Var.f48640a);
        if (!k1Var.m(k1Var.f(b10, this.f11917a, false).f3329c, this.f11918b, 0L).f3385i) {
            if (k1Var.d(b10, this.f11917a, this.f11918b, this.f11922g, this.h) == -1 && z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(b2.k1 k1Var, u2.f0 f0Var) {
        boolean z10;
        if (!f0Var.b() && f0Var.f48643e == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object obj = f0Var.f48640a;
        if (z10) {
            if (k1Var.m(k1Var.g(obj, this.f11917a).f3329c, this.f11918b, 0L).f3391o == k1Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        u0 u0Var = this.f11927m;
        if (u0Var == null || u0Var.h()) {
            this.f11927m = null;
            for (int i10 = 0; i10 < this.f11931q.size(); i10++) {
                u0 u0Var2 = (u0) this.f11931q.get(i10);
                if (!u0Var2.h()) {
                    this.f11927m = u0Var2;
                    return;
                }
            }
        }
    }

    public final void l() {
        u2.f0 f0Var;
        e9.f0 u10 = e9.i0.u();
        for (u0 u0Var = this.f11923i; u0Var != null; u0Var = u0Var.f11901m) {
            u10.b(u0Var.f11896g.f11907a);
        }
        u0 u0Var2 = this.f11924j;
        if (u0Var2 == null) {
            f0Var = null;
        } else {
            f0Var = u0Var2.f11896g.f11907a;
        }
        this.d.c(new gg.t(this, u10, f0Var, 13));
    }

    public final void m(long j3) {
        boolean z10;
        u0 u0Var = this.f11926l;
        if (u0Var != null) {
            if (u0Var.f11901m == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            if (u0Var.f11894e) {
                u0Var.f11891a.s(j3 - u0Var.f11904p);
            }
        }
    }

    public final int n(u0 u0Var) {
        e2.d.h(u0Var);
        int i10 = 0;
        if (u0Var.equals(this.f11926l)) {
            return 0;
        }
        this.f11926l = u0Var;
        while (true) {
            u0Var = u0Var.f11901m;
            if (u0Var == null) {
                break;
            }
            if (u0Var == this.f11924j) {
                u0 u0Var2 = this.f11923i;
                this.f11924j = u0Var2;
                this.f11925k = u0Var2;
                i10 = 3;
            }
            if (u0Var == this.f11925k) {
                this.f11925k = this.f11924j;
                i10 |= 2;
            }
            u0Var.i();
            this.f11928n--;
        }
        u0 u0Var3 = this.f11926l;
        u0Var3.getClass();
        if (u0Var3.f11901m != null) {
            u0Var3.b();
            u0Var3.f11901m = null;
            u0Var3.c();
        }
        l();
        return i10;
    }

    public final u2.f0 p(b2.k1 k1Var, Object obj, long j3) {
        long q6;
        int b10;
        Object obj2 = obj;
        b2.h1 h1Var = this.f11917a;
        int i10 = k1Var.g(obj2, h1Var).f3329c;
        Object obj3 = this.f11929o;
        if (obj3 != null && (b10 = k1Var.b(obj3)) != -1 && k1Var.f(b10, h1Var, false).f3329c == i10) {
            q6 = this.f11930p;
        } else {
            u0 u0Var = this.f11923i;
            while (true) {
                if (u0Var != null) {
                    if (u0Var.f11892b.equals(obj2)) {
                        q6 = u0Var.f11896g.f11907a.d;
                        break;
                    }
                    u0Var = u0Var.f11901m;
                } else {
                    u0 u0Var2 = this.f11923i;
                    while (true) {
                        if (u0Var2 != null) {
                            int b11 = k1Var.b(u0Var2.f11892b);
                            if (b11 != -1 && k1Var.f(b11, h1Var, false).f3329c == i10) {
                                q6 = u0Var2.f11896g.f11907a.d;
                                break;
                            }
                            u0Var2 = u0Var2.f11901m;
                        } else {
                            q6 = q(obj2);
                            if (q6 == -1) {
                                q6 = this.f11921f;
                                this.f11921f = 1 + q6;
                                if (this.f11923i == null) {
                                    this.f11929o = obj2;
                                    this.f11930p = q6;
                                }
                            }
                        }
                    }
                }
            }
        }
        k1Var.g(obj2, h1Var);
        int i11 = h1Var.f3329c;
        b2.j1 j1Var = this.f11918b;
        k1Var.n(i11, j1Var);
        boolean z10 = false;
        for (int b12 = k1Var.b(obj); b12 >= j1Var.f3390n; b12--) {
            boolean z11 = true;
            k1Var.f(b12, h1Var, true);
            if (h1Var.f3332g.f3241a <= 0) {
                z11 = false;
            }
            z10 |= z11;
            if (h1Var.c(h1Var.d) != -1) {
                obj2 = h1Var.f3328b;
                obj2.getClass();
            }
            if (z10 && (!z11 || h1Var.d != 0)) {
                break;
            }
        }
        return o(k1Var, obj2, j3, q6, this.f11918b, this.f11917a);
    }

    public final long q(Object obj) {
        for (int i10 = 0; i10 < this.f11931q.size(); i10++) {
            u0 u0Var = (u0) this.f11931q.get(i10);
            if (u0Var.f11892b.equals(obj)) {
                return u0Var.f11896g.f11907a.d;
            }
        }
        return -1L;
    }

    public final int r(b2.k1 k1Var) {
        b2.k1 k1Var2;
        u0 u0Var;
        u0 u0Var2 = this.f11923i;
        if (u0Var2 == null) {
            return 0;
        }
        int b10 = k1Var.b(u0Var2.f11892b);
        while (true) {
            k1Var2 = k1Var;
            b10 = k1Var2.d(b10, this.f11917a, this.f11918b, this.f11922g, this.h);
            while (true) {
                u0Var2.getClass();
                u0Var = u0Var2.f11901m;
                if (u0Var == null || u0Var2.f11896g.h) {
                    break;
                }
                u0Var2 = u0Var;
            }
            if (b10 == -1 || u0Var == null || k1Var2.b(u0Var.f11892b) != b10) {
                break;
            }
            u0Var2 = u0Var;
            k1Var = k1Var2;
        }
        int n10 = n(u0Var2);
        u0Var2.f11896g = h(k1Var2, u0Var2.f11896g);
        return n10;
    }

    public final int s(b2.k1 r18, long r19, long r21, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: i2.w0.s(b2.k1, long, long, long):int");
    }
}
