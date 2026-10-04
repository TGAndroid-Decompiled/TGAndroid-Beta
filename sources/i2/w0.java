package i2;

import android.util.Pair;
import java.util.ArrayList;
public final class w0 {
    public final j2.f f11869c;
    public final e2.z d;
    public final ei.f f11870e;
    public long f11871f;
    public int f11872g;
    public boolean h;
    public u0 f11873i;
    public u0 f11874j;
    public u0 f11875k;
    public u0 f11876l;
    public u0 f11877m;
    public int f11878n;
    public Object f11879o;
    public long f11880p;
    public final b2.h1 f11867a = new b2.h1();
    public final b2.j1 f11868b = new b2.j1();
    public ArrayList f11881q = new ArrayList();

    public w0(j2.f fVar, e2.z zVar, ei.f fVar2) {
        this.f11869c = fVar;
        this.d = zVar;
        this.f11870e = fVar2;
    }

    public static u2.f0 o(b2.k1 k1Var, Object obj, long j3, long j10, b2.j1 j1Var, b2.h1 h1Var) {
        k1Var.g(obj, h1Var);
        k1Var.n(h1Var.f3250c, j1Var);
        k1Var.b(obj);
        int i10 = h1Var.f3253g.f3162a;
        if (i10 != 0) {
            if (i10 == 1) {
                h1Var.f(0);
            }
            h1Var.f3253g.getClass();
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
        u0 u0Var = this.f11873i;
        if (u0Var == null) {
            return null;
        }
        if (u0Var == this.f11874j) {
            this.f11874j = u0Var.f11851m;
        }
        if (u0Var == this.f11875k) {
            this.f11875k = u0Var.f11851m;
        }
        u0Var.i();
        int i10 = this.f11878n - 1;
        this.f11878n = i10;
        if (i10 == 0) {
            this.f11876l = null;
            u0 u0Var2 = this.f11873i;
            this.f11879o = u0Var2.f11842b;
            this.f11880p = u0Var2.f11846g.f11857a.d;
        }
        this.f11873i = this.f11873i.f11851m;
        l();
        return this.f11873i;
    }

    public final void b() {
        if (this.f11878n == 0) {
            return;
        }
        u0 u0Var = this.f11873i;
        e2.d.h(u0Var);
        this.f11879o = u0Var.f11842b;
        this.f11880p = u0Var.f11846g.f11857a.d;
        while (u0Var != null) {
            u0Var.i();
            u0Var = u0Var.f11851m;
        }
        this.f11873i = null;
        this.f11876l = null;
        this.f11874j = null;
        this.f11875k = null;
        this.f11878n = 0;
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
        v0 v0Var = u0Var.f11846g;
        long j14 = (u0Var.f11854p + v0Var.f11860e) - j3;
        if (v0Var.h) {
            v0 v0Var2 = u0Var.f11846g;
            u2.f0 f0Var = v0Var2.f11857a;
            long j15 = v0Var2.f11859c;
            int d = k1Var.d(k1Var.b(f0Var.f47255a), this.f11867a, this.f11868b, this.f11872g, this.h);
            if (d != -1) {
                b2.h1 h1Var2 = this.f11867a;
                int i10 = k1Var.f(d, h1Var2, true).f3250c;
                Object obj2 = h1Var2.f3249b;
                obj2.getClass();
                long j16 = f0Var.d;
                if (k1Var.m(i10, this.f11868b, 0L).f3311n == d) {
                    Pair j17 = k1Var.j(this.f11868b, this.f11867a, i10, -9223372036854775807L, Math.max(0L, j14));
                    if (j17 != null) {
                        Object obj3 = j17.first;
                        long longValue = ((Long) j17.second).longValue();
                        u0 u0Var2 = u0Var.f11851m;
                        if (u0Var2 != null && u0Var2.f11842b.equals(obj3)) {
                            q6 = u0Var2.f11846g.f11857a.d;
                        } else {
                            q6 = q(obj3);
                            if (q6 == -1) {
                                q6 = this.f11871f;
                                this.f11871f = 1 + q6;
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
                u2.f0 o9 = o(k1Var, obj, j11, j13, this.f11868b, this.f11867a);
                if (j12 != -9223372036854775807L && j15 != -9223372036854775807L) {
                    int i11 = k1Var.g(f0Var.f47255a, h1Var2).f3253g.f3162a;
                    h1Var2.f3253g.getClass();
                    if (i11 > 0) {
                        h1Var2.g(0);
                    }
                }
                return d(k1Var, o9, j12, j11);
            }
            return null;
        }
        u2.f0 f0Var2 = v0Var.f11857a;
        Object obj4 = f0Var2.f47255a;
        int i12 = f0Var2.f47258e;
        b2.h1 h1Var3 = this.f11867a;
        k1Var.g(obj4, h1Var3);
        boolean z10 = v0Var.f11862g;
        if (f0Var2.b()) {
            int i13 = f0Var2.f47256b;
            int i14 = h1Var3.f3253g.a(i13).f3139a;
            if (i14 != -1) {
                int a2 = h1Var3.f3253g.a(i13).a(f0Var2.f47257c);
                if (a2 < i14) {
                    return e(k1Var, f0Var2.f47255a, i13, a2, v0Var.f11859c, f0Var2.d, z10);
                }
                long j18 = v0Var.f11859c;
                if (j18 == -9223372036854775807L) {
                    int i15 = h1Var3.f3250c;
                    long max = Math.max(0L, j14);
                    j10 = 0;
                    Pair j19 = k1Var.j(this.f11868b, h1Var3, i15, -9223372036854775807L, max);
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
                int i16 = f0Var2.f47256b;
                k1Var2.g(obj4, h1Var);
                h1Var.d(i16);
                h1Var.f3253g.a(i16).getClass();
                return f(k1Var, f0Var2.f47255a, Math.max(j10, j18), v0Var.f11859c, f0Var2.d, z10);
            }
            return null;
        }
        if (i12 != -1) {
            h1Var3.f(i12);
        }
        int e7 = h1Var3.e(i12);
        h1Var3.g(i12);
        if (e7 != h1Var3.f3253g.a(i12).f3139a) {
            return e(k1Var, f0Var2.f47255a, f0Var2.f47258e, e7, v0Var.f11860e, f0Var2.d, z10);
        }
        k1Var.g(obj4, h1Var3);
        h1Var3.d(i12);
        h1Var3.f3253g.a(i12).getClass();
        return f(k1Var, f0Var2.f47255a, 0L, v0Var.f11860e, f0Var2.d, false);
    }

    public final v0 d(b2.k1 k1Var, u2.f0 f0Var, long j3, long j10) {
        k1Var.g(f0Var.f47255a, this.f11867a);
        if (f0Var.b()) {
            return e(k1Var, f0Var.f47255a, f0Var.f47256b, f0Var.f47257c, j3, f0Var.d, false);
        }
        return f(k1Var, f0Var.f47255a, j10, j3, f0Var.d, false);
    }

    public final v0 e(b2.k1 k1Var, Object obj, int i10, int i11, long j3, long j10, boolean z10) {
        u2.f0 f0Var = new u2.f0(i10, i11, -1, j10, obj);
        b2.h1 h1Var = this.f11867a;
        long a2 = k1Var.g(obj, h1Var).a(i10, i11);
        if (i11 == h1Var.e(i10)) {
            h1Var.f3253g.getClass();
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
        b2.h1 h1Var = this.f11867a;
        k1Var.g(obj, h1Var);
        int b10 = h1Var.b(j3);
        boolean z11 = false;
        if (b10 == -1) {
            if (h1Var.f3253g.f3162a > 0) {
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
        return this.f11875k;
    }

    public final v0 h(b2.k1 k1Var, v0 v0Var) {
        boolean z10;
        long j3;
        long j10;
        u2.f0 f0Var = v0Var.f11857a;
        boolean b10 = f0Var.b();
        int i10 = f0Var.f47258e;
        if (!b10 && i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = f0Var.f47256b;
        boolean j11 = j(k1Var, f0Var);
        boolean i12 = i(k1Var, f0Var, z10);
        Object obj = f0Var.f47255a;
        b2.h1 h1Var = this.f11867a;
        k1Var.g(obj, h1Var);
        if (!f0Var.b() && i10 != -1) {
            h1Var.d(i10);
            j3 = 0;
        } else {
            j3 = -9223372036854775807L;
        }
        if (f0Var.b()) {
            j10 = h1Var.a(i11, f0Var.f47257c);
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
        return new v0(f0Var, v0Var.f11858b, v0Var.f11859c, j3, j10, v0Var.f11861f, false, z10, j11, i12);
    }

    public final boolean i(b2.k1 k1Var, u2.f0 f0Var, boolean z10) {
        int b10 = k1Var.b(f0Var.f47255a);
        if (!k1Var.m(k1Var.f(b10, this.f11867a, false).f3250c, this.f11868b, 0L).f3306i) {
            if (k1Var.d(b10, this.f11867a, this.f11868b, this.f11872g, this.h) == -1 && z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(b2.k1 k1Var, u2.f0 f0Var) {
        boolean z10;
        if (!f0Var.b() && f0Var.f47258e == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object obj = f0Var.f47255a;
        if (z10) {
            int i10 = k1Var.g(obj, this.f11867a).f3250c;
            if (k1Var.m(i10, this.f11868b, 0L).f3312o == k1Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        u0 u0Var = this.f11877m;
        if (u0Var == null || u0Var.h()) {
            this.f11877m = null;
            for (int i10 = 0; i10 < this.f11881q.size(); i10++) {
                u0 u0Var2 = (u0) this.f11881q.get(i10);
                if (!u0Var2.h()) {
                    this.f11877m = u0Var2;
                    return;
                }
            }
        }
    }

    public final void l() {
        u2.f0 f0Var;
        e9.f0 u10 = e9.i0.u();
        for (u0 u0Var = this.f11873i; u0Var != null; u0Var = u0Var.f11851m) {
            u10.b(u0Var.f11846g.f11857a);
        }
        u0 u0Var2 = this.f11874j;
        if (u0Var2 == null) {
            f0Var = null;
        } else {
            f0Var = u0Var2.f11846g.f11857a;
        }
        this.d.c(new gg.t(this, u10, f0Var, 13));
    }

    public final void m(long j3) {
        boolean z10;
        u0 u0Var = this.f11876l;
        if (u0Var != null) {
            if (u0Var.f11851m == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            if (u0Var.f11844e) {
                u0Var.f11841a.r(j3 - u0Var.f11854p);
            }
        }
    }

    public final int n(u0 u0Var) {
        e2.d.h(u0Var);
        int i10 = 0;
        if (u0Var.equals(this.f11876l)) {
            return 0;
        }
        this.f11876l = u0Var;
        while (true) {
            u0Var = u0Var.f11851m;
            if (u0Var == null) {
                break;
            }
            if (u0Var == this.f11874j) {
                u0 u0Var2 = this.f11873i;
                this.f11874j = u0Var2;
                this.f11875k = u0Var2;
                i10 = 3;
            }
            if (u0Var == this.f11875k) {
                this.f11875k = this.f11874j;
                i10 |= 2;
            }
            u0Var.i();
            this.f11878n--;
        }
        u0 u0Var3 = this.f11876l;
        u0Var3.getClass();
        if (u0Var3.f11851m != null) {
            u0Var3.b();
            u0Var3.f11851m = null;
            u0Var3.c();
        }
        l();
        return i10;
    }

    public final u2.f0 p(b2.k1 k1Var, Object obj, long j3) {
        long q6;
        int b10;
        Object obj2 = obj;
        b2.h1 h1Var = this.f11867a;
        int i10 = k1Var.g(obj2, h1Var).f3250c;
        Object obj3 = this.f11879o;
        if (obj3 != null && (b10 = k1Var.b(obj3)) != -1 && k1Var.f(b10, h1Var, false).f3250c == i10) {
            q6 = this.f11880p;
        } else {
            u0 u0Var = this.f11873i;
            while (true) {
                if (u0Var != null) {
                    if (u0Var.f11842b.equals(obj2)) {
                        q6 = u0Var.f11846g.f11857a.d;
                        break;
                    }
                    u0Var = u0Var.f11851m;
                } else {
                    u0 u0Var2 = this.f11873i;
                    while (true) {
                        if (u0Var2 != null) {
                            int b11 = k1Var.b(u0Var2.f11842b);
                            if (b11 != -1 && k1Var.f(b11, h1Var, false).f3250c == i10) {
                                q6 = u0Var2.f11846g.f11857a.d;
                                break;
                            }
                            u0Var2 = u0Var2.f11851m;
                        } else {
                            q6 = q(obj2);
                            if (q6 == -1) {
                                q6 = this.f11871f;
                                this.f11871f = 1 + q6;
                                if (this.f11873i == null) {
                                    this.f11879o = obj2;
                                    this.f11880p = q6;
                                }
                            }
                        }
                    }
                }
            }
        }
        k1Var.g(obj2, h1Var);
        int i11 = h1Var.f3250c;
        b2.j1 j1Var = this.f11868b;
        k1Var.n(i11, j1Var);
        boolean z10 = false;
        for (int b12 = k1Var.b(obj); b12 >= j1Var.f3311n; b12--) {
            boolean z11 = true;
            k1Var.f(b12, h1Var, true);
            if (h1Var.f3253g.f3162a <= 0) {
                z11 = false;
            }
            z10 |= z11;
            if (h1Var.c(h1Var.d) != -1) {
                obj2 = h1Var.f3249b;
                obj2.getClass();
            }
            if (z10 && (!z11 || h1Var.d != 0)) {
                break;
            }
        }
        return o(k1Var, obj2, j3, q6, this.f11868b, this.f11867a);
    }

    public final long q(Object obj) {
        for (int i10 = 0; i10 < this.f11881q.size(); i10++) {
            u0 u0Var = (u0) this.f11881q.get(i10);
            if (u0Var.f11842b.equals(obj)) {
                return u0Var.f11846g.f11857a.d;
            }
        }
        return -1L;
    }

    public final int r(b2.k1 k1Var) {
        b2.k1 k1Var2;
        u0 u0Var;
        u0 u0Var2 = this.f11873i;
        if (u0Var2 == null) {
            return 0;
        }
        int b10 = k1Var.b(u0Var2.f11842b);
        while (true) {
            k1Var2 = k1Var;
            b10 = k1Var2.d(b10, this.f11867a, this.f11868b, this.f11872g, this.h);
            while (true) {
                u0Var2.getClass();
                u0Var = u0Var2.f11851m;
                if (u0Var == null || u0Var2.f11846g.h) {
                    break;
                }
                u0Var2 = u0Var;
            }
            if (b10 == -1 || u0Var == null || k1Var2.b(u0Var.f11842b) != b10) {
                break;
            }
            u0Var2 = u0Var;
            k1Var = k1Var2;
        }
        int n10 = n(u0Var2);
        u0Var2.f11846g = h(k1Var2, u0Var2.f11846g);
        return n10;
    }

    public final int s(b2.k1 r18, long r19, long r21, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: i2.w0.s(b2.k1, long, long, long):int");
    }
}
