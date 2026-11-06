package l2;

import a8.ia;
import java.util.ArrayList;
public final class a1 {
    public final m2.e f17743c;
    public final h2.i0 d;
    public final y f17744e;
    public long f17745f;
    public int f17746g;
    public boolean h;
    public x0 f17747i;
    public x0 f17748j;
    public x0 f17749k;
    public x0 f17750l;
    public x0 f17751m;
    public int f17752n;
    public Object f17753o;
    public long f17754p;
    public final e2.i1 f17741a = new e2.i1();
    public final e2.k1 f17742b = new e2.k1();
    public ArrayList f17755q = new ArrayList();

    public a1(m2.e eVar, h2.i0 i0Var, y yVar) {
        this.f17743c = eVar;
        this.d = i0Var;
        this.f17744e = yVar;
    }

    public static x2.g0 o(e2.l1 l1Var, Object obj, long j3, long j10, e2.k1 k1Var, e2.i1 i1Var) {
        l1Var.g(obj, i1Var);
        l1Var.n(i1Var.f10282c, k1Var);
        l1Var.b(obj);
        int i7 = i1Var.f10285g.f10192a;
        if (i7 != 0) {
            if (i7 == 1) {
                i1Var.f(0);
            }
            i1Var.f10285g.getClass();
            i1Var.g(0);
        }
        l1Var.g(obj, i1Var);
        int c10 = i1Var.c(j3);
        if (c10 == -1) {
            return new x2.g0(obj, j10, i1Var.b(j3));
        }
        return new x2.g0(c10, i1Var.e(c10), -1, j10, obj);
    }

    public final x0 a() {
        x0 x0Var = this.f17747i;
        if (x0Var == null) {
            return null;
        }
        if (x0Var == this.f17748j) {
            this.f17748j = x0Var.f18081m;
        }
        if (x0Var == this.f17749k) {
            this.f17749k = x0Var.f18081m;
        }
        x0Var.i();
        int i7 = this.f17752n - 1;
        this.f17752n = i7;
        if (i7 == 0) {
            this.f17750l = null;
            x0 x0Var2 = this.f17747i;
            this.f17753o = x0Var2.f18072b;
            this.f17754p = x0Var2.f18076g.f18087a.d;
        }
        this.f17747i = this.f17747i.f18081m;
        l();
        return this.f17747i;
    }

    public final void b() {
        if (this.f17752n == 0) {
            return;
        }
        x0 x0Var = this.f17747i;
        x0Var.getClass();
        this.f17753o = x0Var.f18072b;
        this.f17754p = x0Var.f18076g.f18087a.d;
        while (x0Var != null) {
            x0Var.i();
            x0Var = x0Var.f18081m;
        }
        this.f17747i = null;
        this.f17750l = null;
        this.f17748j = null;
        this.f17749k = null;
        this.f17752n = 0;
        l();
    }

    public final l2.y0 c(e2.l1 r21, l2.x0 r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: l2.a1.c(e2.l1, l2.x0, long):l2.y0");
    }

    public final y0 d(e2.l1 l1Var, x2.g0 g0Var, long j3, long j10, long j11) {
        l1Var.g(g0Var.f58235a, this.f17741a);
        if (g0Var.b()) {
            return e(l1Var, g0Var.f58235a, g0Var.f58236b, g0Var.f58237c, j3, g0Var.d, false);
        }
        return f(l1Var, g0Var.f58235a, j10, j11, j3, g0Var.d, false);
    }

    public final y0 e(e2.l1 l1Var, Object obj, int i7, int i10, long j3, long j10, boolean z9) {
        x2.g0 g0Var = new x2.g0(i7, i10, -1, j10, obj);
        e2.i1 i1Var = this.f17741a;
        long a10 = l1Var.g(obj, i1Var).a(i7, i10);
        if (i10 == i1Var.e(i7)) {
            i1Var.f10285g.getClass();
        }
        i1Var.g(i7);
        long j11 = 0;
        if (a10 != -9223372036854775807L && 0 >= a10) {
            j11 = Math.max(0L, a10 - 1);
        }
        return new y0(g0Var, j11, -9223372036854775807L, j3, -9223372036854775807L, a10, z9, false, false, false, false);
    }

    public final y0 f(e2.l1 l1Var, Object obj, long j3, long j10, long j11, long j12, boolean z9) {
        long j13;
        long j14;
        long j15;
        e2.i1 i1Var = this.f17741a;
        l1Var.g(obj, i1Var);
        int b10 = i1Var.b(j3);
        boolean z10 = false;
        if (b10 == -1) {
            if (i1Var.f10285g.f10192a > 0) {
                i1Var.g(0);
            }
        } else {
            i1Var.g(b10);
        }
        x2.g0 g0Var = new x2.g0(obj, j12, b10);
        if (!g0Var.b() && b10 == -1) {
            z10 = true;
        }
        boolean j16 = j(l1Var, g0Var);
        boolean i7 = i(l1Var, g0Var, z10);
        if (b10 != -1) {
            i1Var.g(b10);
        }
        if (b10 != -1) {
            i1Var.f(b10);
        }
        if (b10 != -1) {
            i1Var.d(b10);
            j13 = 0;
        } else {
            j13 = -9223372036854775807L;
        }
        if (j13 != -9223372036854775807L && j13 != Long.MIN_VALUE) {
            j14 = j13;
        } else {
            j14 = i1Var.d;
        }
        if (j14 != -9223372036854775807L && j3 >= j14) {
            j15 = Math.max(0L, j14 - 1);
        } else {
            j15 = j3;
        }
        return new y0(g0Var, j15, j10, j11, j13, j14, z9, false, z10, j16, i7);
    }

    public final x0 g() {
        return this.f17749k;
    }

    public final y0 h(e2.l1 l1Var, y0 y0Var) {
        boolean z9;
        long j3;
        long j10;
        x2.g0 g0Var = y0Var.f18087a;
        boolean b10 = g0Var.b();
        int i7 = g0Var.f58238e;
        if (!b10 && i7 == -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z10 = z9;
        int i10 = g0Var.f58236b;
        boolean j11 = j(l1Var, g0Var);
        boolean i11 = i(l1Var, g0Var, z10);
        Object obj = g0Var.f58235a;
        e2.i1 i1Var = this.f17741a;
        l1Var.g(obj, i1Var);
        if (!g0Var.b() && i7 != -1) {
            i1Var.d(i7);
            j3 = 0;
        } else {
            j3 = -9223372036854775807L;
        }
        if (g0Var.b()) {
            j10 = i1Var.a(i10, g0Var.f58237c);
        } else if (j3 != -9223372036854775807L && j3 != Long.MIN_VALUE) {
            j10 = j3;
        } else {
            j10 = i1Var.d;
        }
        if (g0Var.b()) {
            i1Var.g(i10);
        } else if (i7 != -1) {
            i1Var.g(i7);
        }
        return new y0(g0Var, y0Var.f18088b, y0Var.f18089c, y0Var.d, j3, j10, y0Var.f18092g, false, z10, j11, i11);
    }

    public final boolean i(e2.l1 l1Var, x2.g0 g0Var, boolean z9) {
        int b10 = l1Var.b(g0Var.f58235a);
        if (!l1Var.m(l1Var.f(b10, this.f17741a, false).f10282c, this.f17742b, 0L).f10330i) {
            if (l1Var.d(b10, this.f17741a, this.f17742b, this.f17746g, this.h) == -1 && z9) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(e2.l1 l1Var, x2.g0 g0Var) {
        boolean z9;
        if (!g0Var.b() && g0Var.f58238e == -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        Object obj = g0Var.f58235a;
        if (z9) {
            if (l1Var.m(l1Var.g(obj, this.f17741a).f10282c, this.f17742b, 0L).f10336o == l1Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        x0 x0Var = this.f17751m;
        if (x0Var == null || x0Var.h()) {
            this.f17751m = null;
            for (int i7 = 0; i7 < this.f17755q.size(); i7++) {
                x0 x0Var2 = (x0) this.f17755q.get(i7);
                if (!x0Var2.h()) {
                    this.f17751m = x0Var2;
                    return;
                }
            }
        }
    }

    public final void l() {
        x2.g0 g0Var;
        h9.f0 p10 = h9.i0.p();
        for (x0 x0Var = this.f17747i; x0Var != null; x0Var = x0Var.f18081m) {
            p10.c(x0Var.f18076g.f18087a);
        }
        x0 x0Var2 = this.f17748j;
        if (x0Var2 == null) {
            g0Var = null;
        } else {
            g0Var = x0Var2.f18076g.f18087a;
        }
        this.d.d(new z0(this, p10, g0Var, 0));
    }

    public final void m(long j3) {
        boolean z9;
        x0 x0Var = this.f17750l;
        if (x0Var != null) {
            if (x0Var.f18081m == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            ia.p(z9);
            if (x0Var.f18074e) {
                x0Var.f18071a.r(j3 - x0Var.f18084p);
            }
        }
    }

    public final int n(x0 x0Var) {
        x0Var.getClass();
        int i7 = 0;
        if (x0Var.equals(this.f17750l)) {
            return 0;
        }
        this.f17750l = x0Var;
        while (true) {
            x0Var = x0Var.f18081m;
            if (x0Var == null) {
                break;
            }
            if (x0Var == this.f17748j) {
                x0 x0Var2 = this.f17747i;
                this.f17748j = x0Var2;
                this.f17749k = x0Var2;
                i7 = 3;
            }
            if (x0Var == this.f17749k) {
                this.f17749k = this.f17748j;
                i7 |= 2;
            }
            x0Var.i();
            this.f17752n--;
        }
        x0 x0Var3 = this.f17750l;
        x0Var3.getClass();
        if (x0Var3.f18081m != null) {
            x0Var3.b();
            x0Var3.f18081m = null;
            x0Var3.c();
        }
        l();
        return i7;
    }

    public final x2.g0 p(e2.l1 l1Var, Object obj, long j3) {
        long q10;
        int b10;
        Object obj2 = obj;
        e2.i1 i1Var = this.f17741a;
        int i7 = l1Var.g(obj2, i1Var).f10282c;
        Object obj3 = this.f17753o;
        if (obj3 != null && (b10 = l1Var.b(obj3)) != -1 && l1Var.f(b10, i1Var, false).f10282c == i7) {
            q10 = this.f17754p;
        } else {
            x0 x0Var = this.f17747i;
            while (true) {
                if (x0Var != null) {
                    if (x0Var.f18072b.equals(obj2)) {
                        q10 = x0Var.f18076g.f18087a.d;
                        break;
                    }
                    x0Var = x0Var.f18081m;
                } else {
                    x0 x0Var2 = this.f17747i;
                    while (true) {
                        if (x0Var2 != null) {
                            int b11 = l1Var.b(x0Var2.f18072b);
                            if (b11 != -1 && l1Var.f(b11, i1Var, false).f10282c == i7) {
                                q10 = x0Var2.f18076g.f18087a.d;
                                break;
                            }
                            x0Var2 = x0Var2.f18081m;
                        } else {
                            q10 = q(obj2);
                            if (q10 == -1) {
                                q10 = this.f17745f;
                                this.f17745f = 1 + q10;
                                if (this.f17747i == null) {
                                    this.f17753o = obj2;
                                    this.f17754p = q10;
                                }
                            }
                        }
                    }
                }
            }
        }
        l1Var.g(obj2, i1Var);
        int i10 = i1Var.f10282c;
        e2.k1 k1Var = this.f17742b;
        l1Var.n(i10, k1Var);
        boolean z9 = false;
        for (int b12 = l1Var.b(obj); b12 >= k1Var.f10335n; b12--) {
            boolean z10 = true;
            l1Var.f(b12, i1Var, true);
            if (i1Var.f10285g.f10192a <= 0) {
                z10 = false;
            }
            z9 |= z10;
            if (i1Var.c(i1Var.d) != -1) {
                obj2 = i1Var.f10281b;
                obj2.getClass();
            }
            if (z9 && (!z10 || i1Var.d != 0)) {
                break;
            }
        }
        return o(l1Var, obj2, j3, q10, this.f17742b, this.f17741a);
    }

    public final long q(Object obj) {
        for (int i7 = 0; i7 < this.f17755q.size(); i7++) {
            x0 x0Var = (x0) this.f17755q.get(i7);
            if (x0Var.f18072b.equals(obj)) {
                return x0Var.f18076g.f18087a.d;
            }
        }
        return -1L;
    }

    public final int r(e2.l1 l1Var) {
        e2.l1 l1Var2;
        x0 x0Var;
        x0 x0Var2 = this.f17747i;
        if (x0Var2 == null) {
            return 0;
        }
        int b10 = l1Var.b(x0Var2.f18072b);
        while (true) {
            l1Var2 = l1Var;
            b10 = l1Var2.d(b10, this.f17741a, this.f17742b, this.f17746g, this.h);
            while (true) {
                x0Var2.getClass();
                x0Var = x0Var2.f18081m;
                if (x0Var == null || x0Var2.f18076g.f18093i) {
                    break;
                }
                x0Var2 = x0Var;
            }
            if (b10 == -1 || x0Var == null || l1Var2.b(x0Var.f18072b) != b10) {
                break;
            }
            x0Var2 = x0Var;
            l1Var = l1Var2;
        }
        int n10 = n(x0Var2);
        x0Var2.f18076g = h(l1Var2, x0Var2.f18076g);
        return n10;
    }

    public final int s(e2.l1 r23, long r24, long r26, long r28) {
        throw new UnsupportedOperationException("Method not decompiled: l2.a1.s(e2.l1, long, long, long):int");
    }
}
