package i2;

import ei.z1;
import java.util.ArrayList;
import v7.u6;
public final class y0 {
    public final j2.f f12627c;
    public final e2.i0 d;
    public final e1.c e;
    public long f12628f;
    public int f12629g;
    public boolean h;
    public w0 f12630i;
    public w0 f12631j;
    public w0 f12632k;
    public w0 f12633l;
    public w0 f12634m;
    public int f12635n;
    public Object f12636o;
    public long f12637p;
    public final b2.l1 f12625a = new b2.l1();
    public final b2.n1 f12626b = new b2.n1();
    public ArrayList f12638q = new ArrayList();

    public y0(j2.f fVar, e2.i0 i0Var, e1.c cVar) {
        this.f12627c = fVar;
        this.d = i0Var;
        this.e = cVar;
    }

    public static u2.g0 o(b2.o1 o1Var, Object obj, long j10, long j11, b2.n1 n1Var, b2.l1 l1Var) {
        o1Var.g(obj, l1Var);
        o1Var.n(l1Var.f3826c, n1Var);
        o1Var.b(obj);
        int i10 = l1Var.f3828g.f3706a;
        if (i10 != 0) {
            if (i10 == 1) {
                l1Var.f(0);
            }
            l1Var.f3828g.getClass();
            l1Var.g(0);
        }
        o1Var.g(obj, l1Var);
        int c10 = l1Var.c(j10);
        if (c10 == -1) {
            return new u2.g0(obj, j11, l1Var.b(j10));
        }
        return new u2.g0(c10, l1Var.e(c10), -1, j11, obj);
    }

    public final w0 a() {
        w0 w0Var = this.f12630i;
        if (w0Var == null) {
            return null;
        }
        if (w0Var == this.f12631j) {
            this.f12631j = w0Var.f12609m;
        }
        if (w0Var == this.f12632k) {
            this.f12632k = w0Var.f12609m;
        }
        w0Var.i();
        int i10 = this.f12635n - 1;
        this.f12635n = i10;
        if (i10 == 0) {
            this.f12633l = null;
            w0 w0Var2 = this.f12630i;
            this.f12636o = w0Var2.f12601b;
            this.f12637p = w0Var2.f12604g.f12615a.d;
        }
        this.f12630i = this.f12630i.f12609m;
        l();
        return this.f12630i;
    }

    public final void b() {
        if (this.f12635n == 0) {
            return;
        }
        w0 w0Var = this.f12630i;
        w0Var.getClass();
        this.f12636o = w0Var.f12601b;
        this.f12637p = w0Var.f12604g.f12615a.d;
        while (w0Var != null) {
            w0Var.i();
            w0Var = w0Var.f12609m;
        }
        this.f12630i = null;
        this.f12633l = null;
        this.f12631j = null;
        this.f12632k = null;
        this.f12635n = 0;
        l();
    }

    public final i2.x0 c(b2.o1 r21, i2.w0 r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: i2.y0.c(b2.o1, i2.w0, long):i2.x0");
    }

    public final x0 d(b2.o1 o1Var, u2.g0 g0Var, long j10, long j11, long j12) {
        o1Var.g(g0Var.f47305a, this.f12625a);
        if (g0Var.b()) {
            return e(o1Var, g0Var.f47305a, g0Var.f47306b, g0Var.f47307c, j10, g0Var.d, false);
        }
        return f(o1Var, g0Var.f47305a, j11, j12, j10, g0Var.d, false);
    }

    public final x0 e(b2.o1 o1Var, Object obj, int i10, int i11, long j10, long j11, boolean z10) {
        u2.g0 g0Var = new u2.g0(i10, i11, -1, j11, obj);
        b2.l1 l1Var = this.f12625a;
        long a2 = o1Var.g(obj, l1Var).a(i10, i11);
        if (i11 == l1Var.e(i10)) {
            l1Var.f3828g.getClass();
        }
        l1Var.g(i10);
        long j12 = 0;
        if (a2 != -9223372036854775807L && 0 >= a2) {
            j12 = Math.max(0L, a2 - 1);
        }
        return new x0(g0Var, j12, -9223372036854775807L, j10, -9223372036854775807L, a2, z10, false, false, false, false);
    }

    public final x0 f(b2.o1 o1Var, Object obj, long j10, long j11, long j12, long j13, boolean z10) {
        long j14;
        long j15;
        long j16;
        b2.l1 l1Var = this.f12625a;
        o1Var.g(obj, l1Var);
        int b10 = l1Var.b(j10);
        boolean z11 = false;
        if (b10 == -1) {
            if (l1Var.f3828g.f3706a > 0) {
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
        return new x0(g0Var, j16, j11, j12, j14, j15, z10, false, z11, j17, i10);
    }

    public final w0 g() {
        return this.f12632k;
    }

    public final x0 h(b2.o1 o1Var, x0 x0Var) {
        boolean z10;
        long j10;
        long j11;
        u2.g0 g0Var = x0Var.f12615a;
        boolean b10 = g0Var.b();
        int i10 = g0Var.e;
        if (!b10 && i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        int i11 = g0Var.f47306b;
        boolean j12 = j(o1Var, g0Var);
        boolean i12 = i(o1Var, g0Var, z11);
        Object obj = g0Var.f47305a;
        b2.l1 l1Var = this.f12625a;
        o1Var.g(obj, l1Var);
        if (!g0Var.b() && i10 != -1) {
            l1Var.d(i10);
            j10 = 0;
        } else {
            j10 = -9223372036854775807L;
        }
        if (g0Var.b()) {
            j11 = l1Var.a(i11, g0Var.f47307c);
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
        return new x0(g0Var, x0Var.f12616b, x0Var.f12617c, x0Var.d, j10, j11, x0Var.f12619g, false, z11, j12, i12);
    }

    public final boolean i(b2.o1 o1Var, u2.g0 g0Var, boolean z10) {
        int b10 = o1Var.b(g0Var.f47305a);
        if (!o1Var.m(o1Var.f(b10, this.f12625a, false).f3826c, this.f12626b, 0L).f3876i) {
            if (o1Var.d(b10, this.f12625a, this.f12626b, this.f12629g, this.h) == -1 && z10) {
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
        Object obj = g0Var.f47305a;
        if (z10) {
            if (o1Var.m(o1Var.g(obj, this.f12625a).f3826c, this.f12626b, 0L).f3882o == o1Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        w0 w0Var = this.f12634m;
        if (w0Var == null || w0Var.h()) {
            this.f12634m = null;
            for (int i10 = 0; i10 < this.f12638q.size(); i10++) {
                w0 w0Var2 = (w0) this.f12638q.get(i10);
                if (!w0Var2.h()) {
                    this.f12634m = w0Var2;
                    return;
                }
            }
        }
    }

    public final void l() {
        u2.g0 g0Var;
        e9.k0 t10 = e9.n0.t();
        for (w0 w0Var = this.f12630i; w0Var != null; w0Var = w0Var.f12609m) {
            t10.c(w0Var.f12604g.f12615a);
        }
        w0 w0Var2 = this.f12631j;
        if (w0Var2 == null) {
            g0Var = null;
        } else {
            g0Var = w0Var2.f12604g.f12615a;
        }
        this.d.d(new z1(this, t10, g0Var, 20));
    }

    public final void m(long j10) {
        boolean z10;
        w0 w0Var = this.f12633l;
        if (w0Var != null) {
            if (w0Var.f12609m == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.p(z10);
            if (w0Var.e) {
                w0Var.f12600a.u(j10 - w0Var.f12612p);
            }
        }
    }

    public final int n(w0 w0Var) {
        w0Var.getClass();
        int i10 = 0;
        if (w0Var.equals(this.f12633l)) {
            return 0;
        }
        this.f12633l = w0Var;
        while (true) {
            w0Var = w0Var.f12609m;
            if (w0Var == null) {
                break;
            }
            if (w0Var == this.f12631j) {
                w0 w0Var2 = this.f12630i;
                this.f12631j = w0Var2;
                this.f12632k = w0Var2;
                i10 = 3;
            }
            if (w0Var == this.f12632k) {
                this.f12632k = this.f12631j;
                i10 |= 2;
            }
            w0Var.i();
            this.f12635n--;
        }
        w0 w0Var3 = this.f12633l;
        w0Var3.getClass();
        if (w0Var3.f12609m != null) {
            w0Var3.b();
            w0Var3.f12609m = null;
            w0Var3.c();
        }
        l();
        return i10;
    }

    public final u2.g0 p(b2.o1 o1Var, Object obj, long j10) {
        long q6;
        int b10;
        Object obj2 = obj;
        b2.l1 l1Var = this.f12625a;
        int i10 = o1Var.g(obj2, l1Var).f3826c;
        Object obj3 = this.f12636o;
        if (obj3 != null && (b10 = o1Var.b(obj3)) != -1 && o1Var.f(b10, l1Var, false).f3826c == i10) {
            q6 = this.f12637p;
        } else {
            w0 w0Var = this.f12630i;
            while (true) {
                if (w0Var != null) {
                    if (w0Var.f12601b.equals(obj2)) {
                        q6 = w0Var.f12604g.f12615a.d;
                        break;
                    }
                    w0Var = w0Var.f12609m;
                } else {
                    w0 w0Var2 = this.f12630i;
                    while (true) {
                        if (w0Var2 != null) {
                            int b11 = o1Var.b(w0Var2.f12601b);
                            if (b11 != -1 && o1Var.f(b11, l1Var, false).f3826c == i10) {
                                q6 = w0Var2.f12604g.f12615a.d;
                                break;
                            }
                            w0Var2 = w0Var2.f12609m;
                        } else {
                            q6 = q(obj2);
                            if (q6 == -1) {
                                q6 = this.f12628f;
                                this.f12628f = 1 + q6;
                                if (this.f12630i == null) {
                                    this.f12636o = obj2;
                                    this.f12637p = q6;
                                }
                            }
                        }
                    }
                }
            }
        }
        o1Var.g(obj2, l1Var);
        int i11 = l1Var.f3826c;
        b2.n1 n1Var = this.f12626b;
        o1Var.n(i11, n1Var);
        boolean z10 = false;
        for (int b12 = o1Var.b(obj); b12 >= n1Var.f3881n; b12--) {
            boolean z11 = true;
            o1Var.f(b12, l1Var, true);
            if (l1Var.f3828g.f3706a <= 0) {
                z11 = false;
            }
            z10 |= z11;
            if (l1Var.c(l1Var.d) != -1) {
                obj2 = l1Var.f3825b;
                obj2.getClass();
            }
            if (z10 && (!z11 || l1Var.d != 0)) {
                break;
            }
        }
        return o(o1Var, obj2, j10, q6, this.f12626b, this.f12625a);
    }

    public final long q(Object obj) {
        for (int i10 = 0; i10 < this.f12638q.size(); i10++) {
            w0 w0Var = (w0) this.f12638q.get(i10);
            if (w0Var.f12601b.equals(obj)) {
                return w0Var.f12604g.f12615a.d;
            }
        }
        return -1L;
    }

    public final int r(b2.o1 o1Var) {
        b2.o1 o1Var2;
        w0 w0Var;
        w0 w0Var2 = this.f12630i;
        if (w0Var2 == null) {
            return 0;
        }
        int b10 = o1Var.b(w0Var2.f12601b);
        while (true) {
            o1Var2 = o1Var;
            b10 = o1Var2.d(b10, this.f12625a, this.f12626b, this.f12629g, this.h);
            while (true) {
                w0Var2.getClass();
                w0Var = w0Var2.f12609m;
                if (w0Var == null || w0Var2.f12604g.f12620i) {
                    break;
                }
                w0Var2 = w0Var;
            }
            if (b10 == -1 || w0Var == null || o1Var2.b(w0Var.f12601b) != b10) {
                break;
            }
            w0Var2 = w0Var;
            o1Var = o1Var2;
        }
        int n10 = n(w0Var2);
        w0Var2.f12604g = h(o1Var2, w0Var2.f12604g);
        return n10;
    }

    public final int s(b2.o1 r23, long r24, long r26, long r28) {
        throw new UnsupportedOperationException("Method not decompiled: i2.y0.s(b2.o1, long, long, long):int");
    }
}
