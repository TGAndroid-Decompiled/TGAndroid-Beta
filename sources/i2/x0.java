package i2;

import ei.z1;
import java.util.ArrayList;
import v7.u6;
public final class x0 {
    public final j2.f f12628c;
    public final e2.i0 d;
    public final e1.c e;
    public long f12629f;
    public int f12630g;
    public boolean h;
    public v0 f12631i;
    public v0 f12632j;
    public v0 f12633k;
    public v0 f12634l;
    public v0 f12635m;
    public int f12636n;
    public Object f12637o;
    public long f12638p;
    public final b2.l1 f12626a = new b2.l1();
    public final b2.n1 f12627b = new b2.n1();
    public ArrayList f12639q = new ArrayList();

    public x0(j2.f fVar, e2.i0 i0Var, e1.c cVar) {
        this.f12628c = fVar;
        this.d = i0Var;
        this.e = cVar;
    }

    public static u2.g0 o(b2.o1 o1Var, Object obj, long j10, long j11, b2.n1 n1Var, b2.l1 l1Var) {
        o1Var.g(obj, l1Var);
        o1Var.n(l1Var.f3825c, n1Var);
        o1Var.b(obj);
        int i10 = l1Var.f3827g.f3705a;
        if (i10 != 0) {
            if (i10 == 1) {
                l1Var.f(0);
            }
            l1Var.f3827g.getClass();
            l1Var.g(0);
        }
        o1Var.g(obj, l1Var);
        int c10 = l1Var.c(j10);
        if (c10 == -1) {
            return new u2.g0(obj, j11, l1Var.b(j10));
        }
        return new u2.g0(c10, l1Var.e(c10), -1, j11, obj);
    }

    public final v0 a() {
        v0 v0Var = this.f12631i;
        if (v0Var == null) {
            return null;
        }
        if (v0Var == this.f12632j) {
            this.f12632j = v0Var.f12610m;
        }
        if (v0Var == this.f12633k) {
            this.f12633k = v0Var.f12610m;
        }
        v0Var.i();
        int i10 = this.f12636n - 1;
        this.f12636n = i10;
        if (i10 == 0) {
            this.f12634l = null;
            v0 v0Var2 = this.f12631i;
            this.f12637o = v0Var2.f12602b;
            this.f12638p = v0Var2.f12605g.f12616a.d;
        }
        this.f12631i = this.f12631i.f12610m;
        l();
        return this.f12631i;
    }

    public final void b() {
        if (this.f12636n == 0) {
            return;
        }
        v0 v0Var = this.f12631i;
        v0Var.getClass();
        this.f12637o = v0Var.f12602b;
        this.f12638p = v0Var.f12605g.f12616a.d;
        while (v0Var != null) {
            v0Var.i();
            v0Var = v0Var.f12610m;
        }
        this.f12631i = null;
        this.f12634l = null;
        this.f12632j = null;
        this.f12633k = null;
        this.f12636n = 0;
        l();
    }

    public final i2.w0 c(b2.o1 r21, i2.v0 r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: i2.x0.c(b2.o1, i2.v0, long):i2.w0");
    }

    public final w0 d(b2.o1 o1Var, u2.g0 g0Var, long j10, long j11, long j12) {
        o1Var.g(g0Var.f47327a, this.f12626a);
        if (g0Var.b()) {
            return e(o1Var, g0Var.f47327a, g0Var.f47328b, g0Var.f47329c, j10, g0Var.d, false);
        }
        return f(o1Var, g0Var.f47327a, j11, j12, j10, g0Var.d, false);
    }

    public final w0 e(b2.o1 o1Var, Object obj, int i10, int i11, long j10, long j11, boolean z10) {
        u2.g0 g0Var = new u2.g0(i10, i11, -1, j11, obj);
        b2.l1 l1Var = this.f12626a;
        long a2 = o1Var.g(obj, l1Var).a(i10, i11);
        if (i11 == l1Var.e(i10)) {
            l1Var.f3827g.getClass();
        }
        l1Var.g(i10);
        long j12 = 0;
        if (a2 != -9223372036854775807L && 0 >= a2) {
            j12 = Math.max(0L, a2 - 1);
        }
        return new w0(g0Var, j12, -9223372036854775807L, j10, -9223372036854775807L, a2, z10, false, false, false, false);
    }

    public final w0 f(b2.o1 o1Var, Object obj, long j10, long j11, long j12, long j13, boolean z10) {
        long j14;
        long j15;
        long j16;
        b2.l1 l1Var = this.f12626a;
        o1Var.g(obj, l1Var);
        int b10 = l1Var.b(j10);
        boolean z11 = false;
        if (b10 == -1) {
            if (l1Var.f3827g.f3705a > 0) {
                l1Var.g(0);
            }
        } else {
            l1Var.g(b10);
        }
        u2.g0 g0Var = new u2.g0(obj, j13, b10);
        if (!g0Var.b() && b10 == -1) {
            z11 = true;
        }
        boolean j17 = j(o1Var, g0Var);
        boolean i10 = i(o1Var, g0Var, z11);
        if (b10 != -1) {
            l1Var.g(b10);
        }
        if (b10 != -1) {
            l1Var.f(b10);
        }
        if (b10 != -1) {
            l1Var.d(b10);
            j14 = 0;
        } else {
            j14 = -9223372036854775807L;
        }
        if (j14 != -9223372036854775807L && j14 != Long.MIN_VALUE) {
            j15 = j14;
        } else {
            j15 = l1Var.d;
        }
        if (j15 != -9223372036854775807L && j10 >= j15) {
            j16 = Math.max(0L, j15 - 1);
        } else {
            j16 = j10;
        }
        return new w0(g0Var, j16, j11, j12, j14, j15, z10, false, z11, j17, i10);
    }

    public final v0 g() {
        return this.f12633k;
    }

    public final w0 h(b2.o1 o1Var, w0 w0Var) {
        boolean z10;
        long j10;
        long j11;
        u2.g0 g0Var = w0Var.f12616a;
        boolean b10 = g0Var.b();
        int i10 = g0Var.e;
        if (!b10 && i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        int i11 = g0Var.f47328b;
        boolean j12 = j(o1Var, g0Var);
        boolean i12 = i(o1Var, g0Var, z11);
        Object obj = g0Var.f47327a;
        b2.l1 l1Var = this.f12626a;
        o1Var.g(obj, l1Var);
        if (!g0Var.b() && i10 != -1) {
            l1Var.d(i10);
            j10 = 0;
        } else {
            j10 = -9223372036854775807L;
        }
        if (g0Var.b()) {
            j11 = l1Var.a(i11, g0Var.f47329c);
        } else if (j10 != -9223372036854775807L && j10 != Long.MIN_VALUE) {
            j11 = j10;
        } else {
            j11 = l1Var.d;
        }
        if (g0Var.b()) {
            l1Var.g(i11);
        } else if (i10 != -1) {
            l1Var.g(i10);
        }
        return new w0(g0Var, w0Var.f12617b, w0Var.f12618c, w0Var.d, j10, j11, w0Var.f12620g, false, z11, j12, i12);
    }

    public final boolean i(b2.o1 o1Var, u2.g0 g0Var, boolean z10) {
        int b10 = o1Var.b(g0Var.f47327a);
        if (!o1Var.m(o1Var.f(b10, this.f12626a, false).f3825c, this.f12627b, 0L).f3875i) {
            if (o1Var.d(b10, this.f12626a, this.f12627b, this.f12630g, this.h) == -1 && z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(b2.o1 o1Var, u2.g0 g0Var) {
        boolean z10;
        if (!g0Var.b() && g0Var.e == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object obj = g0Var.f47327a;
        if (z10) {
            if (o1Var.m(o1Var.g(obj, this.f12626a).f3825c, this.f12627b, 0L).f3881o == o1Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        v0 v0Var = this.f12635m;
        if (v0Var == null || v0Var.h()) {
            this.f12635m = null;
            for (int i10 = 0; i10 < this.f12639q.size(); i10++) {
                v0 v0Var2 = (v0) this.f12639q.get(i10);
                if (!v0Var2.h()) {
                    this.f12635m = v0Var2;
                    return;
                }
            }
        }
    }

    public final void l() {
        u2.g0 g0Var;
        e9.k0 t10 = e9.n0.t();
        for (v0 v0Var = this.f12631i; v0Var != null; v0Var = v0Var.f12610m) {
            t10.c(v0Var.f12605g.f12616a);
        }
        v0 v0Var2 = this.f12632j;
        if (v0Var2 == null) {
            g0Var = null;
        } else {
            g0Var = v0Var2.f12605g.f12616a;
        }
        this.d.d(new z1(this, t10, g0Var, 20));
    }

    public final void m(long j10) {
        boolean z10;
        v0 v0Var = this.f12634l;
        if (v0Var != null) {
            if (v0Var.f12610m == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.p(z10);
            if (v0Var.e) {
                v0Var.f12601a.u(j10 - v0Var.f12613p);
            }
        }
    }

    public final int n(v0 v0Var) {
        v0Var.getClass();
        int i10 = 0;
        if (v0Var.equals(this.f12634l)) {
            return 0;
        }
        this.f12634l = v0Var;
        while (true) {
            v0Var = v0Var.f12610m;
            if (v0Var == null) {
                break;
            }
            if (v0Var == this.f12632j) {
                v0 v0Var2 = this.f12631i;
                this.f12632j = v0Var2;
                this.f12633k = v0Var2;
                i10 = 3;
            }
            if (v0Var == this.f12633k) {
                this.f12633k = this.f12632j;
                i10 |= 2;
            }
            v0Var.i();
            this.f12636n--;
        }
        v0 v0Var3 = this.f12634l;
        v0Var3.getClass();
        if (v0Var3.f12610m != null) {
            v0Var3.b();
            v0Var3.f12610m = null;
            v0Var3.c();
        }
        l();
        return i10;
    }

    public final u2.g0 p(b2.o1 o1Var, Object obj, long j10) {
        long q6;
        int b10;
        Object obj2 = obj;
        b2.l1 l1Var = this.f12626a;
        int i10 = o1Var.g(obj2, l1Var).f3825c;
        Object obj3 = this.f12637o;
        if (obj3 != null && (b10 = o1Var.b(obj3)) != -1 && o1Var.f(b10, l1Var, false).f3825c == i10) {
            q6 = this.f12638p;
        } else {
            v0 v0Var = this.f12631i;
            while (true) {
                if (v0Var != null) {
                    if (v0Var.f12602b.equals(obj2)) {
                        q6 = v0Var.f12605g.f12616a.d;
                        break;
                    }
                    v0Var = v0Var.f12610m;
                } else {
                    v0 v0Var2 = this.f12631i;
                    while (true) {
                        if (v0Var2 != null) {
                            int b11 = o1Var.b(v0Var2.f12602b);
                            if (b11 != -1 && o1Var.f(b11, l1Var, false).f3825c == i10) {
                                q6 = v0Var2.f12605g.f12616a.d;
                                break;
                            }
                            v0Var2 = v0Var2.f12610m;
                        } else {
                            q6 = q(obj2);
                            if (q6 == -1) {
                                q6 = this.f12629f;
                                this.f12629f = 1 + q6;
                                if (this.f12631i == null) {
                                    this.f12637o = obj2;
                                    this.f12638p = q6;
                                }
                            }
                        }
                    }
                }
            }
        }
        o1Var.g(obj2, l1Var);
        int i11 = l1Var.f3825c;
        b2.n1 n1Var = this.f12627b;
        o1Var.n(i11, n1Var);
        boolean z10 = false;
        for (int b12 = o1Var.b(obj); b12 >= n1Var.f3880n; b12--) {
            boolean z11 = true;
            o1Var.f(b12, l1Var, true);
            if (l1Var.f3827g.f3705a <= 0) {
                z11 = false;
            }
            z10 |= z11;
            if (l1Var.c(l1Var.d) != -1) {
                obj2 = l1Var.f3824b;
                obj2.getClass();
            }
            if (z10 && (!z11 || l1Var.d != 0)) {
                break;
            }
        }
        return o(o1Var, obj2, j10, q6, this.f12627b, this.f12626a);
    }

    public final long q(Object obj) {
        for (int i10 = 0; i10 < this.f12639q.size(); i10++) {
            v0 v0Var = (v0) this.f12639q.get(i10);
            if (v0Var.f12602b.equals(obj)) {
                return v0Var.f12605g.f12616a.d;
            }
        }
        return -1L;
    }

    public final int r(b2.o1 o1Var) {
        b2.o1 o1Var2;
        v0 v0Var;
        v0 v0Var2 = this.f12631i;
        if (v0Var2 == null) {
            return 0;
        }
        int b10 = o1Var.b(v0Var2.f12602b);
        while (true) {
            o1Var2 = o1Var;
            b10 = o1Var2.d(b10, this.f12626a, this.f12627b, this.f12630g, this.h);
            while (true) {
                v0Var2.getClass();
                v0Var = v0Var2.f12610m;
                if (v0Var == null || v0Var2.f12605g.f12621i) {
                    break;
                }
                v0Var2 = v0Var;
            }
            if (b10 == -1 || v0Var == null || o1Var2.b(v0Var.f12602b) != b10) {
                break;
            }
            v0Var2 = v0Var;
            o1Var = o1Var2;
        }
        int n10 = n(v0Var2);
        v0Var2.f12605g = h(o1Var2, v0Var2.f12605g);
        return n10;
    }

    public final int s(b2.o1 r23, long r24, long r26, long r28) {
        throw new UnsupportedOperationException("Method not decompiled: i2.x0.s(b2.o1, long, long, long):int");
    }
}
