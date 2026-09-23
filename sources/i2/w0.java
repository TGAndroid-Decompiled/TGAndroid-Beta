package i2;

import android.util.Pair;
import ei.d5;
import java.util.ArrayList;
public final class w0 {
    public final j2.f f10895c;
    public final e2.z d;
    public final d5 e;
    public long f10896f;
    public int f10897g;
    public boolean h;
    public u0 f10898i;
    public u0 f10899j;
    public u0 f10900k;
    public u0 f10901l;
    public u0 f10902m;
    public int f10903n;
    public Object f10904o;
    public long f10905p;
    public final b2.h1 f10893a = new b2.h1();
    public final b2.j1 f10894b = new b2.j1();
    public ArrayList f10906q = new ArrayList();

    public w0(j2.f fVar, e2.z zVar, d5 d5Var) {
        this.f10895c = fVar;
        this.d = zVar;
        this.e = d5Var;
    }

    public static u2.f0 o(b2.k1 k1Var, Object obj, long j3, long j10, b2.j1 j1Var, b2.h1 h1Var) {
        k1Var.g(obj, h1Var);
        k1Var.n(h1Var.f3006c, j1Var);
        k1Var.b(obj);
        int i10 = h1Var.f3008g.f2928a;
        if (i10 != 0) {
            if (i10 == 1) {
                h1Var.f(0);
            }
            h1Var.f3008g.getClass();
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
        u0 u0Var = this.f10898i;
        if (u0Var == null) {
            return null;
        }
        if (u0Var == this.f10899j) {
            this.f10899j = u0Var.f10878m;
        }
        if (u0Var == this.f10900k) {
            this.f10900k = u0Var.f10878m;
        }
        u0Var.i();
        int i10 = this.f10903n - 1;
        this.f10903n = i10;
        if (i10 == 0) {
            this.f10901l = null;
            u0 u0Var2 = this.f10898i;
            this.f10904o = u0Var2.f10870b;
            this.f10905p = u0Var2.f10873g.f10884a.d;
        }
        this.f10898i = this.f10898i.f10878m;
        l();
        return this.f10898i;
    }

    public final void b() {
        if (this.f10903n == 0) {
            return;
        }
        u0 u0Var = this.f10898i;
        e2.d.h(u0Var);
        this.f10904o = u0Var.f10870b;
        this.f10905p = u0Var.f10873g.f10884a.d;
        while (u0Var != null) {
            u0Var.i();
            u0Var = u0Var.f10878m;
        }
        this.f10898i = null;
        this.f10901l = null;
        this.f10899j = null;
        this.f10900k = null;
        this.f10903n = 0;
        l();
    }

    public final v0 c(b2.k1 k1Var, u0 u0Var, long j3) {
        b2.h1 h1Var;
        long j10;
        b2.k1 k1Var2;
        Object obj;
        long j11;
        long j12;
        long j13;
        long q6;
        v0 v0Var = u0Var.f10873g;
        long j14 = (u0Var.f10881p + v0Var.e) - j3;
        if (v0Var.h) {
            v0 v0Var2 = u0Var.f10873g;
            u2.f0 f0Var = v0Var2.f10884a;
            long j15 = v0Var2.f10886c;
            int d = k1Var.d(k1Var.b(f0Var.f43287a), this.f10893a, this.f10894b, this.f10897g, this.h);
            if (d != -1) {
                b2.h1 h1Var2 = this.f10893a;
                int i10 = k1Var.f(d, h1Var2, true).f3006c;
                Object obj2 = h1Var2.f3005b;
                obj2.getClass();
                long j16 = f0Var.d;
                if (k1Var.m(i10, this.f10894b, 0L).f3060n == d) {
                    Pair j17 = k1Var.j(this.f10894b, this.f10893a, i10, -9223372036854775807L, Math.max(0L, j14));
                    if (j17 != null) {
                        Object obj3 = j17.first;
                        long longValue = ((Long) j17.second).longValue();
                        u0 u0Var2 = u0Var.f10878m;
                        if (u0Var2 != null && u0Var2.f10870b.equals(obj3)) {
                            q6 = u0Var2.f10873g.f10884a.d;
                        } else {
                            q6 = q(obj3);
                            if (q6 == -1) {
                                q6 = this.f10896f;
                                this.f10896f = 1 + q6;
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
                u2.f0 o9 = o(k1Var, obj, j11, j13, this.f10894b, this.f10893a);
                if (j12 != -9223372036854775807L && j15 != -9223372036854775807L) {
                    int i11 = k1Var.g(f0Var.f43287a, h1Var2).f3008g.f2928a;
                    h1Var2.f3008g.getClass();
                    if (i11 > 0) {
                        h1Var2.g(0);
                    }
                }
                return d(k1Var, o9, j12, j11);
            }
            return null;
        }
        u2.f0 f0Var2 = v0Var.f10884a;
        Object obj4 = f0Var2.f43287a;
        int i12 = f0Var2.e;
        b2.h1 h1Var3 = this.f10893a;
        k1Var.g(obj4, h1Var3);
        boolean z10 = v0Var.f10888g;
        if (f0Var2.b()) {
            int i13 = f0Var2.f43288b;
            int i14 = h1Var3.f3008g.a(i13).f2908a;
            if (i14 != -1) {
                int a2 = h1Var3.f3008g.a(i13).a(f0Var2.f43289c);
                if (a2 < i14) {
                    return e(k1Var, f0Var2.f43287a, i13, a2, v0Var.f10886c, f0Var2.d, z10);
                }
                long j18 = v0Var.f10886c;
                if (j18 == -9223372036854775807L) {
                    int i15 = h1Var3.f3006c;
                    long max = Math.max(0L, j14);
                    j10 = 0;
                    Pair j19 = k1Var.j(this.f10894b, h1Var3, i15, -9223372036854775807L, max);
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
                int i16 = f0Var2.f43288b;
                k1Var2.g(obj4, h1Var);
                h1Var.d(i16);
                h1Var.f3008g.a(i16).getClass();
                return f(k1Var, f0Var2.f43287a, Math.max(j10, j18), v0Var.f10886c, f0Var2.d, z10);
            }
            return null;
        }
        if (i12 != -1) {
            h1Var3.f(i12);
        }
        int e = h1Var3.e(i12);
        h1Var3.g(i12);
        if (e != h1Var3.f3008g.a(i12).f2908a) {
            return e(k1Var, f0Var2.f43287a, f0Var2.e, e, v0Var.e, f0Var2.d, z10);
        }
        k1Var.g(obj4, h1Var3);
        h1Var3.d(i12);
        h1Var3.f3008g.a(i12).getClass();
        return f(k1Var, f0Var2.f43287a, 0L, v0Var.e, f0Var2.d, false);
    }

    public final v0 d(b2.k1 k1Var, u2.f0 f0Var, long j3, long j10) {
        k1Var.g(f0Var.f43287a, this.f10893a);
        if (f0Var.b()) {
            return e(k1Var, f0Var.f43287a, f0Var.f43288b, f0Var.f43289c, j3, f0Var.d, false);
        }
        return f(k1Var, f0Var.f43287a, j10, j3, f0Var.d, false);
    }

    public final v0 e(b2.k1 k1Var, Object obj, int i10, int i11, long j3, long j10, boolean z10) {
        u2.f0 f0Var = new u2.f0(i10, i11, -1, j10, obj);
        b2.h1 h1Var = this.f10893a;
        long a2 = k1Var.g(obj, h1Var).a(i10, i11);
        if (i11 == h1Var.e(i10)) {
            h1Var.f3008g.getClass();
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
        b2.h1 h1Var = this.f10893a;
        k1Var.g(obj, h1Var);
        int b10 = h1Var.b(j3);
        boolean z11 = false;
        if (b10 == -1) {
            if (h1Var.f3008g.f2928a > 0) {
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
        return this.f10900k;
    }

    public final v0 h(b2.k1 k1Var, v0 v0Var) {
        boolean z10;
        long j3;
        long j10;
        u2.f0 f0Var = v0Var.f10884a;
        boolean b10 = f0Var.b();
        int i10 = f0Var.e;
        if (!b10 && i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = f0Var.f43288b;
        boolean j11 = j(k1Var, f0Var);
        boolean i12 = i(k1Var, f0Var, z10);
        Object obj = f0Var.f43287a;
        b2.h1 h1Var = this.f10893a;
        k1Var.g(obj, h1Var);
        if (!f0Var.b() && i10 != -1) {
            h1Var.d(i10);
            j3 = 0;
        } else {
            j3 = -9223372036854775807L;
        }
        if (f0Var.b()) {
            j10 = h1Var.a(i11, f0Var.f43289c);
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
        return new v0(f0Var, v0Var.f10885b, v0Var.f10886c, j3, j10, v0Var.f10887f, false, z10, j11, i12);
    }

    public final boolean i(b2.k1 k1Var, u2.f0 f0Var, boolean z10) {
        int b10 = k1Var.b(f0Var.f43287a);
        if (!k1Var.m(k1Var.f(b10, this.f10893a, false).f3006c, this.f10894b, 0L).f3055i) {
            if (k1Var.d(b10, this.f10893a, this.f10894b, this.f10897g, this.h) == -1 && z10) {
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
        Object obj = f0Var.f43287a;
        if (z10) {
            int i10 = k1Var.g(obj, this.f10893a).f3006c;
            if (k1Var.m(i10, this.f10894b, 0L).f3061o == k1Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        u0 u0Var = this.f10902m;
        if (u0Var == null || u0Var.h()) {
            this.f10902m = null;
            for (int i10 = 0; i10 < this.f10906q.size(); i10++) {
                u0 u0Var2 = (u0) this.f10906q.get(i10);
                if (!u0Var2.h()) {
                    this.f10902m = u0Var2;
                    return;
                }
            }
        }
    }

    public final void l() {
        u2.f0 f0Var;
        e9.f0 u10 = e9.i0.u();
        for (u0 u0Var = this.f10898i; u0Var != null; u0Var = u0Var.f10878m) {
            u10.b(u0Var.f10873g.f10884a);
        }
        u0 u0Var2 = this.f10899j;
        if (u0Var2 == null) {
            f0Var = null;
        } else {
            f0Var = u0Var2.f10873g.f10884a;
        }
        this.d.c(new gg.t(this, u10, f0Var, 13));
    }

    public final void m(long j3) {
        boolean z10;
        u0 u0Var = this.f10901l;
        if (u0Var != null) {
            if (u0Var.f10878m == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            if (u0Var.e) {
                u0Var.f10869a.u(j3 - u0Var.f10881p);
            }
        }
    }

    public final int n(u0 u0Var) {
        e2.d.h(u0Var);
        int i10 = 0;
        if (u0Var.equals(this.f10901l)) {
            return 0;
        }
        this.f10901l = u0Var;
        while (true) {
            u0Var = u0Var.f10878m;
            if (u0Var == null) {
                break;
            }
            if (u0Var == this.f10899j) {
                u0 u0Var2 = this.f10898i;
                this.f10899j = u0Var2;
                this.f10900k = u0Var2;
                i10 = 3;
            }
            if (u0Var == this.f10900k) {
                this.f10900k = this.f10899j;
                i10 |= 2;
            }
            u0Var.i();
            this.f10903n--;
        }
        u0 u0Var3 = this.f10901l;
        u0Var3.getClass();
        if (u0Var3.f10878m != null) {
            u0Var3.b();
            u0Var3.f10878m = null;
            u0Var3.c();
        }
        l();
        return i10;
    }

    public final u2.f0 p(b2.k1 k1Var, Object obj, long j3) {
        long q6;
        int b10;
        Object obj2 = obj;
        b2.h1 h1Var = this.f10893a;
        int i10 = k1Var.g(obj2, h1Var).f3006c;
        Object obj3 = this.f10904o;
        if (obj3 != null && (b10 = k1Var.b(obj3)) != -1 && k1Var.f(b10, h1Var, false).f3006c == i10) {
            q6 = this.f10905p;
        } else {
            u0 u0Var = this.f10898i;
            while (true) {
                if (u0Var != null) {
                    if (u0Var.f10870b.equals(obj2)) {
                        q6 = u0Var.f10873g.f10884a.d;
                        break;
                    }
                    u0Var = u0Var.f10878m;
                } else {
                    u0 u0Var2 = this.f10898i;
                    while (true) {
                        if (u0Var2 != null) {
                            int b11 = k1Var.b(u0Var2.f10870b);
                            if (b11 != -1 && k1Var.f(b11, h1Var, false).f3006c == i10) {
                                q6 = u0Var2.f10873g.f10884a.d;
                                break;
                            }
                            u0Var2 = u0Var2.f10878m;
                        } else {
                            q6 = q(obj2);
                            if (q6 == -1) {
                                q6 = this.f10896f;
                                this.f10896f = 1 + q6;
                                if (this.f10898i == null) {
                                    this.f10904o = obj2;
                                    this.f10905p = q6;
                                }
                            }
                        }
                    }
                }
            }
        }
        k1Var.g(obj2, h1Var);
        int i11 = h1Var.f3006c;
        b2.j1 j1Var = this.f10894b;
        k1Var.n(i11, j1Var);
        boolean z10 = false;
        for (int b12 = k1Var.b(obj); b12 >= j1Var.f3060n; b12--) {
            boolean z11 = true;
            k1Var.f(b12, h1Var, true);
            if (h1Var.f3008g.f2928a <= 0) {
                z11 = false;
            }
            z10 |= z11;
            if (h1Var.c(h1Var.d) != -1) {
                obj2 = h1Var.f3005b;
                obj2.getClass();
            }
            if (z10 && (!z11 || h1Var.d != 0)) {
                break;
            }
        }
        return o(k1Var, obj2, j3, q6, this.f10894b, this.f10893a);
    }

    public final long q(Object obj) {
        for (int i10 = 0; i10 < this.f10906q.size(); i10++) {
            u0 u0Var = (u0) this.f10906q.get(i10);
            if (u0Var.f10870b.equals(obj)) {
                return u0Var.f10873g.f10884a.d;
            }
        }
        return -1L;
    }

    public final int r(b2.k1 k1Var) {
        b2.k1 k1Var2;
        u0 u0Var;
        u0 u0Var2 = this.f10898i;
        if (u0Var2 == null) {
            return 0;
        }
        int b10 = k1Var.b(u0Var2.f10870b);
        while (true) {
            k1Var2 = k1Var;
            b10 = k1Var2.d(b10, this.f10893a, this.f10894b, this.f10897g, this.h);
            while (true) {
                u0Var2.getClass();
                u0Var = u0Var2.f10878m;
                if (u0Var == null || u0Var2.f10873g.h) {
                    break;
                }
                u0Var2 = u0Var;
            }
            if (b10 == -1 || u0Var == null || k1Var2.b(u0Var.f10870b) != b10) {
                break;
            }
            u0Var2 = u0Var;
            k1Var = k1Var2;
        }
        int n10 = n(u0Var2);
        u0Var2.f10873g = h(k1Var2, u0Var2.f10873g);
        return n10;
    }

    public final int s(b2.k1 r18, long r19, long r21, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: i2.w0.s(b2.k1, long, long, long):int");
    }
}
