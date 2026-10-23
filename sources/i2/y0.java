package i2;

import ei.z1;
import java.util.ArrayList;
import v7.u6;
public final class y0 {
    public final j2.e f12659c;
    public final e2.i0 d;
    public final e1.c e;
    public long f12660f;
    public int f12661g;
    public boolean h;
    public w0 f12662i;
    public w0 f12663j;
    public w0 f12664k;
    public w0 f12665l;
    public w0 f12666m;
    public int f12667n;
    public Object f12668o;
    public long f12669p;
    public final b2.l1 f12657a = new b2.l1();
    public final b2.n1 f12658b = new b2.n1();
    public ArrayList f12670q = new ArrayList();

    public y0(j2.e eVar, e2.i0 i0Var, e1.c cVar) {
        this.f12659c = eVar;
        this.d = i0Var;
        this.e = cVar;
    }

    public static u2.h0 o(b2.o1 o1Var, Object obj, long j10, long j11, b2.n1 n1Var, b2.l1 l1Var) {
        o1Var.g(obj, l1Var);
        o1Var.n(l1Var.f3829c, n1Var);
        o1Var.b(obj);
        int i10 = l1Var.f3831g.f3709a;
        if (i10 != 0) {
            if (i10 == 1) {
                l1Var.f(0);
            }
            l1Var.f3831g.getClass();
            l1Var.g(0);
        }
        o1Var.g(obj, l1Var);
        int c10 = l1Var.c(j10);
        if (c10 == -1) {
            return new u2.h0(obj, j11, l1Var.b(j10));
        }
        return new u2.h0(c10, l1Var.e(c10), -1, j11, obj);
    }

    public final w0 a() {
        w0 w0Var = this.f12662i;
        if (w0Var == null) {
            return null;
        }
        if (w0Var == this.f12663j) {
            this.f12663j = w0Var.f12641m;
        }
        if (w0Var == this.f12664k) {
            this.f12664k = w0Var.f12641m;
        }
        w0Var.i();
        int i10 = this.f12667n - 1;
        this.f12667n = i10;
        if (i10 == 0) {
            this.f12665l = null;
            w0 w0Var2 = this.f12662i;
            this.f12668o = w0Var2.f12633b;
            this.f12669p = w0Var2.f12636g.f12647a.d;
        }
        this.f12662i = this.f12662i.f12641m;
        l();
        return this.f12662i;
    }

    public final void b() {
        if (this.f12667n == 0) {
            return;
        }
        w0 w0Var = this.f12662i;
        w0Var.getClass();
        this.f12668o = w0Var.f12633b;
        this.f12669p = w0Var.f12636g.f12647a.d;
        while (w0Var != null) {
            w0Var.i();
            w0Var = w0Var.f12641m;
        }
        this.f12662i = null;
        this.f12665l = null;
        this.f12663j = null;
        this.f12664k = null;
        this.f12667n = 0;
        l();
    }

    public final i2.x0 c(b2.o1 r21, i2.w0 r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: i2.y0.c(b2.o1, i2.w0, long):i2.x0");
    }

    public final x0 d(b2.o1 o1Var, u2.h0 h0Var, long j10, long j11, long j12) {
        o1Var.g(h0Var.f47767a, this.f12657a);
        if (h0Var.b()) {
            return e(o1Var, h0Var.f47767a, h0Var.f47768b, h0Var.f47769c, j10, h0Var.d, false);
        }
        return f(o1Var, h0Var.f47767a, j11, j12, j10, h0Var.d, false);
    }

    public final x0 e(b2.o1 o1Var, Object obj, int i10, int i11, long j10, long j11, boolean z10) {
        u2.h0 h0Var = new u2.h0(i10, i11, -1, j11, obj);
        b2.l1 l1Var = this.f12657a;
        long a2 = o1Var.g(obj, l1Var).a(i10, i11);
        if (i11 == l1Var.e(i10)) {
            l1Var.f3831g.getClass();
        }
        l1Var.g(i10);
        long j12 = 0;
        if (a2 != -9223372036854775807L && 0 >= a2) {
            j12 = Math.max(0L, a2 - 1);
        }
        return new x0(h0Var, j12, -9223372036854775807L, j10, -9223372036854775807L, a2, z10, false, false, false, false);
    }

    public final x0 f(b2.o1 o1Var, Object obj, long j10, long j11, long j12, long j13, boolean z10) {
        long j14;
        long j15;
        long j16;
        b2.l1 l1Var = this.f12657a;
        o1Var.g(obj, l1Var);
        int b10 = l1Var.b(j10);
        boolean z11 = false;
        if (b10 == -1) {
            if (l1Var.f3831g.f3709a > 0) {
                l1Var.g(0);
            }
        } else {
            l1Var.g(b10);
        }
        u2.h0 h0Var = new u2.h0(obj, j13, b10);
        if (!h0Var.b() && b10 == -1) {
            z11 = true;
        }
        boolean j17 = j(o1Var, h0Var);
        boolean i10 = i(o1Var, h0Var, z11);
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
        return new x0(h0Var, j16, j11, j12, j14, j15, z10, false, z11, j17, i10);
    }

    public final w0 g() {
        return this.f12664k;
    }

    public final x0 h(b2.o1 o1Var, x0 x0Var) {
        boolean z10;
        long j10;
        long j11;
        u2.h0 h0Var = x0Var.f12647a;
        boolean b10 = h0Var.b();
        int i10 = h0Var.e;
        if (!b10 && i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        int i11 = h0Var.f47768b;
        boolean j12 = j(o1Var, h0Var);
        boolean i12 = i(o1Var, h0Var, z11);
        Object obj = h0Var.f47767a;
        b2.l1 l1Var = this.f12657a;
        o1Var.g(obj, l1Var);
        if (!h0Var.b() && i10 != -1) {
            l1Var.d(i10);
            j10 = 0;
        } else {
            j10 = -9223372036854775807L;
        }
        if (h0Var.b()) {
            j11 = l1Var.a(i11, h0Var.f47769c);
        } else if (j10 != -9223372036854775807L && j10 != Long.MIN_VALUE) {
            j11 = j10;
        } else {
            j11 = l1Var.d;
        }
        if (h0Var.b()) {
            l1Var.g(i11);
        } else if (i10 != -1) {
            l1Var.g(i10);
        }
        return new x0(h0Var, x0Var.f12648b, x0Var.f12649c, x0Var.d, j10, j11, x0Var.f12651g, false, z11, j12, i12);
    }

    public final boolean i(b2.o1 o1Var, u2.h0 h0Var, boolean z10) {
        int b10 = o1Var.b(h0Var.f47767a);
        if (!o1Var.m(o1Var.f(b10, this.f12657a, false).f3829c, this.f12658b, 0L).f3879i) {
            if (o1Var.d(b10, this.f12657a, this.f12658b, this.f12661g, this.h) == -1 && z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(b2.o1 o1Var, u2.h0 h0Var) {
        boolean z10;
        if (!h0Var.b() && h0Var.e == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object obj = h0Var.f47767a;
        if (z10) {
            if (o1Var.m(o1Var.g(obj, this.f12657a).f3829c, this.f12658b, 0L).f3885o == o1Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        w0 w0Var = this.f12666m;
        if (w0Var == null || w0Var.h()) {
            this.f12666m = null;
            for (int i10 = 0; i10 < this.f12670q.size(); i10++) {
                w0 w0Var2 = (w0) this.f12670q.get(i10);
                if (!w0Var2.h()) {
                    this.f12666m = w0Var2;
                    return;
                }
            }
        }
    }

    public final void l() {
        u2.h0 h0Var;
        e9.k0 t10 = e9.n0.t();
        for (w0 w0Var = this.f12662i; w0Var != null; w0Var = w0Var.f12641m) {
            t10.c(w0Var.f12636g.f12647a);
        }
        w0 w0Var2 = this.f12663j;
        if (w0Var2 == null) {
            h0Var = null;
        } else {
            h0Var = w0Var2.f12636g.f12647a;
        }
        this.d.d(new z1(this, t10, h0Var, 20));
    }

    public final void m(long j10) {
        boolean z10;
        w0 w0Var = this.f12665l;
        if (w0Var != null) {
            if (w0Var.f12641m == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.p(z10);
            if (w0Var.e) {
                w0Var.f12632a.u(j10 - w0Var.f12644p);
            }
        }
    }

    public final int n(w0 w0Var) {
        w0Var.getClass();
        int i10 = 0;
        if (w0Var.equals(this.f12665l)) {
            return 0;
        }
        this.f12665l = w0Var;
        while (true) {
            w0Var = w0Var.f12641m;
            if (w0Var == null) {
                break;
            }
            if (w0Var == this.f12663j) {
                w0 w0Var2 = this.f12662i;
                this.f12663j = w0Var2;
                this.f12664k = w0Var2;
                i10 = 3;
            }
            if (w0Var == this.f12664k) {
                this.f12664k = this.f12663j;
                i10 |= 2;
            }
            w0Var.i();
            this.f12667n--;
        }
        w0 w0Var3 = this.f12665l;
        w0Var3.getClass();
        if (w0Var3.f12641m != null) {
            w0Var3.b();
            w0Var3.f12641m = null;
            w0Var3.c();
        }
        l();
        return i10;
    }

    public final u2.h0 p(b2.o1 o1Var, Object obj, long j10) {
        long q6;
        int b10;
        Object obj2 = obj;
        b2.l1 l1Var = this.f12657a;
        int i10 = o1Var.g(obj2, l1Var).f3829c;
        Object obj3 = this.f12668o;
        if (obj3 != null && (b10 = o1Var.b(obj3)) != -1 && o1Var.f(b10, l1Var, false).f3829c == i10) {
            q6 = this.f12669p;
        } else {
            w0 w0Var = this.f12662i;
            while (true) {
                if (w0Var != null) {
                    if (w0Var.f12633b.equals(obj2)) {
                        q6 = w0Var.f12636g.f12647a.d;
                        break;
                    }
                    w0Var = w0Var.f12641m;
                } else {
                    w0 w0Var2 = this.f12662i;
                    while (true) {
                        if (w0Var2 != null) {
                            int b11 = o1Var.b(w0Var2.f12633b);
                            if (b11 != -1 && o1Var.f(b11, l1Var, false).f3829c == i10) {
                                q6 = w0Var2.f12636g.f12647a.d;
                                break;
                            }
                            w0Var2 = w0Var2.f12641m;
                        } else {
                            q6 = q(obj2);
                            if (q6 == -1) {
                                q6 = this.f12660f;
                                this.f12660f = 1 + q6;
                                if (this.f12662i == null) {
                                    this.f12668o = obj2;
                                    this.f12669p = q6;
                                }
                            }
                        }
                    }
                }
            }
        }
        o1Var.g(obj2, l1Var);
        int i11 = l1Var.f3829c;
        b2.n1 n1Var = this.f12658b;
        o1Var.n(i11, n1Var);
        boolean z10 = false;
        for (int b12 = o1Var.b(obj); b12 >= n1Var.f3884n; b12--) {
            boolean z11 = true;
            o1Var.f(b12, l1Var, true);
            if (l1Var.f3831g.f3709a <= 0) {
                z11 = false;
            }
            z10 |= z11;
            if (l1Var.c(l1Var.d) != -1) {
                obj2 = l1Var.f3828b;
                obj2.getClass();
            }
            if (z10 && (!z11 || l1Var.d != 0)) {
                break;
            }
        }
        return o(o1Var, obj2, j10, q6, this.f12658b, this.f12657a);
    }

    public final long q(Object obj) {
        for (int i10 = 0; i10 < this.f12670q.size(); i10++) {
            w0 w0Var = (w0) this.f12670q.get(i10);
            if (w0Var.f12633b.equals(obj)) {
                return w0Var.f12636g.f12647a.d;
            }
        }
        return -1L;
    }

    public final int r(b2.o1 o1Var) {
        b2.o1 o1Var2;
        w0 w0Var;
        w0 w0Var2 = this.f12662i;
        if (w0Var2 == null) {
            return 0;
        }
        int b10 = o1Var.b(w0Var2.f12633b);
        while (true) {
            o1Var2 = o1Var;
            b10 = o1Var2.d(b10, this.f12657a, this.f12658b, this.f12661g, this.h);
            while (true) {
                w0Var2.getClass();
                w0Var = w0Var2.f12641m;
                if (w0Var == null || w0Var2.f12636g.f12652i) {
                    break;
                }
                w0Var2 = w0Var;
            }
            if (b10 == -1 || w0Var == null || o1Var2.b(w0Var.f12633b) != b10) {
                break;
            }
            w0Var2 = w0Var;
            o1Var = o1Var2;
        }
        int n10 = n(w0Var2);
        w0Var2.f12636g = h(o1Var2, w0Var2.f12636g);
        return n10;
    }

    public final int s(b2.o1 r23, long r24, long r26, long r28) {
        throw new UnsupportedOperationException("Method not decompiled: i2.y0.s(b2.o1, long, long, long):int");
    }
}
