package i2;

import ei.z1;
import java.util.ArrayList;
import v7.u6;
public final class z0 {
    public final j2.f f12630c;
    public final e2.i0 d;
    public final e1.c e;
    public long f12631f;
    public int f12632g;
    public boolean h;
    public x0 f12633i;
    public x0 f12634j;
    public x0 f12635k;
    public x0 f12636l;
    public x0 f12637m;
    public int f12638n;
    public Object f12639o;
    public long f12640p;
    public final b2.l1 f12628a = new b2.l1();
    public final b2.n1 f12629b = new b2.n1();
    public ArrayList f12641q = new ArrayList();

    public z0(j2.f fVar, e2.i0 i0Var, e1.c cVar) {
        this.f12630c = fVar;
        this.d = i0Var;
        this.e = cVar;
    }

    public static u2.g0 o(b2.o1 o1Var, Object obj, long j10, long j11, b2.n1 n1Var, b2.l1 l1Var) {
        o1Var.g(obj, l1Var);
        o1Var.n(l1Var.f3822c, n1Var);
        o1Var.b(obj);
        int i10 = l1Var.f3824g.f3702a;
        if (i10 != 0) {
            if (i10 == 1) {
                l1Var.f(0);
            }
            l1Var.f3824g.getClass();
            l1Var.g(0);
        }
        o1Var.g(obj, l1Var);
        int c10 = l1Var.c(j10);
        if (c10 == -1) {
            return new u2.g0(obj, j11, l1Var.b(j10));
        }
        return new u2.g0(c10, l1Var.e(c10), -1, j11, obj);
    }

    public final x0 a() {
        x0 x0Var = this.f12633i;
        if (x0Var == null) {
            return null;
        }
        if (x0Var == this.f12634j) {
            this.f12634j = x0Var.f12612m;
        }
        if (x0Var == this.f12635k) {
            this.f12635k = x0Var.f12612m;
        }
        x0Var.i();
        int i10 = this.f12638n - 1;
        this.f12638n = i10;
        if (i10 == 0) {
            this.f12636l = null;
            x0 x0Var2 = this.f12633i;
            this.f12639o = x0Var2.f12604b;
            this.f12640p = x0Var2.f12607g.f12618a.d;
        }
        this.f12633i = this.f12633i.f12612m;
        l();
        return this.f12633i;
    }

    public final void b() {
        if (this.f12638n == 0) {
            return;
        }
        x0 x0Var = this.f12633i;
        x0Var.getClass();
        this.f12639o = x0Var.f12604b;
        this.f12640p = x0Var.f12607g.f12618a.d;
        while (x0Var != null) {
            x0Var.i();
            x0Var = x0Var.f12612m;
        }
        this.f12633i = null;
        this.f12636l = null;
        this.f12634j = null;
        this.f12635k = null;
        this.f12638n = 0;
        l();
    }

    public final i2.y0 c(b2.o1 r21, i2.x0 r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: i2.z0.c(b2.o1, i2.x0, long):i2.y0");
    }

    public final y0 d(b2.o1 o1Var, u2.g0 g0Var, long j10, long j11, long j12) {
        o1Var.g(g0Var.f47314a, this.f12628a);
        if (g0Var.b()) {
            return e(o1Var, g0Var.f47314a, g0Var.f47315b, g0Var.f47316c, j10, g0Var.d, false);
        }
        return f(o1Var, g0Var.f47314a, j11, j12, j10, g0Var.d, false);
    }

    public final y0 e(b2.o1 o1Var, Object obj, int i10, int i11, long j10, long j11, boolean z10) {
        u2.g0 g0Var = new u2.g0(i10, i11, -1, j11, obj);
        b2.l1 l1Var = this.f12628a;
        long a2 = o1Var.g(obj, l1Var).a(i10, i11);
        if (i11 == l1Var.e(i10)) {
            l1Var.f3824g.getClass();
        }
        l1Var.g(i10);
        long j12 = 0;
        if (a2 != -9223372036854775807L && 0 >= a2) {
            j12 = Math.max(0L, a2 - 1);
        }
        return new y0(g0Var, j12, -9223372036854775807L, j10, -9223372036854775807L, a2, z10, false, false, false, false);
    }

    public final y0 f(b2.o1 o1Var, Object obj, long j10, long j11, long j12, long j13, boolean z10) {
        long j14;
        long j15;
        long j16;
        b2.l1 l1Var = this.f12628a;
        o1Var.g(obj, l1Var);
        int b10 = l1Var.b(j10);
        boolean z11 = false;
        if (b10 == -1) {
            if (l1Var.f3824g.f3702a > 0) {
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
        return new y0(g0Var, j16, j11, j12, j14, j15, z10, false, z11, j17, i10);
    }

    public final x0 g() {
        return this.f12635k;
    }

    public final y0 h(b2.o1 o1Var, y0 y0Var) {
        boolean z10;
        long j10;
        long j11;
        u2.g0 g0Var = y0Var.f12618a;
        boolean b10 = g0Var.b();
        int i10 = g0Var.e;
        if (!b10 && i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        int i11 = g0Var.f47315b;
        boolean j12 = j(o1Var, g0Var);
        boolean i12 = i(o1Var, g0Var, z11);
        Object obj = g0Var.f47314a;
        b2.l1 l1Var = this.f12628a;
        o1Var.g(obj, l1Var);
        if (!g0Var.b() && i10 != -1) {
            l1Var.d(i10);
            j10 = 0;
        } else {
            j10 = -9223372036854775807L;
        }
        if (g0Var.b()) {
            j11 = l1Var.a(i11, g0Var.f47316c);
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
        return new y0(g0Var, y0Var.f12619b, y0Var.f12620c, y0Var.d, j10, j11, y0Var.f12622g, false, z11, j12, i12);
    }

    public final boolean i(b2.o1 o1Var, u2.g0 g0Var, boolean z10) {
        int b10 = o1Var.b(g0Var.f47314a);
        if (!o1Var.m(o1Var.f(b10, this.f12628a, false).f3822c, this.f12629b, 0L).f3872i) {
            if (o1Var.d(b10, this.f12628a, this.f12629b, this.f12632g, this.h) == -1 && z10) {
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
        Object obj = g0Var.f47314a;
        if (z10) {
            if (o1Var.m(o1Var.g(obj, this.f12628a).f3822c, this.f12629b, 0L).f3878o == o1Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        x0 x0Var = this.f12637m;
        if (x0Var == null || x0Var.h()) {
            this.f12637m = null;
            for (int i10 = 0; i10 < this.f12641q.size(); i10++) {
                x0 x0Var2 = (x0) this.f12641q.get(i10);
                if (!x0Var2.h()) {
                    this.f12637m = x0Var2;
                    return;
                }
            }
        }
    }

    public final void l() {
        u2.g0 g0Var;
        e9.k0 t10 = e9.n0.t();
        for (x0 x0Var = this.f12633i; x0Var != null; x0Var = x0Var.f12612m) {
            t10.c(x0Var.f12607g.f12618a);
        }
        x0 x0Var2 = this.f12634j;
        if (x0Var2 == null) {
            g0Var = null;
        } else {
            g0Var = x0Var2.f12607g.f12618a;
        }
        this.d.d(new z1(this, t10, g0Var, 20));
    }

    public final void m(long j10) {
        boolean z10;
        x0 x0Var = this.f12636l;
        if (x0Var != null) {
            if (x0Var.f12612m == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.p(z10);
            if (x0Var.e) {
                x0Var.f12603a.u(j10 - x0Var.f12615p);
            }
        }
    }

    public final int n(x0 x0Var) {
        x0Var.getClass();
        int i10 = 0;
        if (x0Var.equals(this.f12636l)) {
            return 0;
        }
        this.f12636l = x0Var;
        while (true) {
            x0Var = x0Var.f12612m;
            if (x0Var == null) {
                break;
            }
            if (x0Var == this.f12634j) {
                x0 x0Var2 = this.f12633i;
                this.f12634j = x0Var2;
                this.f12635k = x0Var2;
                i10 = 3;
            }
            if (x0Var == this.f12635k) {
                this.f12635k = this.f12634j;
                i10 |= 2;
            }
            x0Var.i();
            this.f12638n--;
        }
        x0 x0Var3 = this.f12636l;
        x0Var3.getClass();
        if (x0Var3.f12612m != null) {
            x0Var3.b();
            x0Var3.f12612m = null;
            x0Var3.c();
        }
        l();
        return i10;
    }

    public final u2.g0 p(b2.o1 o1Var, Object obj, long j10) {
        long q6;
        int b10;
        Object obj2 = obj;
        b2.l1 l1Var = this.f12628a;
        int i10 = o1Var.g(obj2, l1Var).f3822c;
        Object obj3 = this.f12639o;
        if (obj3 != null && (b10 = o1Var.b(obj3)) != -1 && o1Var.f(b10, l1Var, false).f3822c == i10) {
            q6 = this.f12640p;
        } else {
            x0 x0Var = this.f12633i;
            while (true) {
                if (x0Var != null) {
                    if (x0Var.f12604b.equals(obj2)) {
                        q6 = x0Var.f12607g.f12618a.d;
                        break;
                    }
                    x0Var = x0Var.f12612m;
                } else {
                    x0 x0Var2 = this.f12633i;
                    while (true) {
                        if (x0Var2 != null) {
                            int b11 = o1Var.b(x0Var2.f12604b);
                            if (b11 != -1 && o1Var.f(b11, l1Var, false).f3822c == i10) {
                                q6 = x0Var2.f12607g.f12618a.d;
                                break;
                            }
                            x0Var2 = x0Var2.f12612m;
                        } else {
                            q6 = q(obj2);
                            if (q6 == -1) {
                                q6 = this.f12631f;
                                this.f12631f = 1 + q6;
                                if (this.f12633i == null) {
                                    this.f12639o = obj2;
                                    this.f12640p = q6;
                                }
                            }
                        }
                    }
                }
            }
        }
        o1Var.g(obj2, l1Var);
        int i11 = l1Var.f3822c;
        b2.n1 n1Var = this.f12629b;
        o1Var.n(i11, n1Var);
        boolean z10 = false;
        for (int b12 = o1Var.b(obj); b12 >= n1Var.f3877n; b12--) {
            boolean z11 = true;
            o1Var.f(b12, l1Var, true);
            if (l1Var.f3824g.f3702a <= 0) {
                z11 = false;
            }
            z10 |= z11;
            if (l1Var.c(l1Var.d) != -1) {
                obj2 = l1Var.f3821b;
                obj2.getClass();
            }
            if (z10 && (!z11 || l1Var.d != 0)) {
                break;
            }
        }
        return o(o1Var, obj2, j10, q6, this.f12629b, this.f12628a);
    }

    public final long q(Object obj) {
        for (int i10 = 0; i10 < this.f12641q.size(); i10++) {
            x0 x0Var = (x0) this.f12641q.get(i10);
            if (x0Var.f12604b.equals(obj)) {
                return x0Var.f12607g.f12618a.d;
            }
        }
        return -1L;
    }

    public final int r(b2.o1 o1Var) {
        b2.o1 o1Var2;
        x0 x0Var;
        x0 x0Var2 = this.f12633i;
        if (x0Var2 == null) {
            return 0;
        }
        int b10 = o1Var.b(x0Var2.f12604b);
        while (true) {
            o1Var2 = o1Var;
            b10 = o1Var2.d(b10, this.f12628a, this.f12629b, this.f12632g, this.h);
            while (true) {
                x0Var2.getClass();
                x0Var = x0Var2.f12612m;
                if (x0Var == null || x0Var2.f12607g.f12623i) {
                    break;
                }
                x0Var2 = x0Var;
            }
            if (b10 == -1 || x0Var == null || o1Var2.b(x0Var.f12604b) != b10) {
                break;
            }
            x0Var2 = x0Var;
            o1Var = o1Var2;
        }
        int n10 = n(x0Var2);
        x0Var2.f12607g = h(o1Var2, x0Var2.f12607g);
        return n10;
    }

    public final int s(b2.o1 r23, long r24, long r26, long r28) {
        throw new UnsupportedOperationException("Method not decompiled: i2.z0.s(b2.o1, long, long, long):int");
    }
}
