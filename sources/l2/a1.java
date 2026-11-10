package l2;

import a8.ia;
import java.util.ArrayList;
public final class a1 {
    public final m2.e f17747c;
    public final h2.i0 d;
    public final x f17748e;
    public long f17749f;
    public int f17750g;
    public boolean h;
    public x0 f17751i;
    public x0 f17752j;
    public x0 f17753k;
    public x0 f17754l;
    public x0 f17755m;
    public int f17756n;
    public Object f17757o;
    public long f17758p;
    public final e2.i1 f17745a = new e2.i1();
    public final e2.k1 f17746b = new e2.k1();
    public ArrayList f17759q = new ArrayList();

    public a1(m2.e eVar, h2.i0 i0Var, x xVar) {
        this.f17747c = eVar;
        this.d = i0Var;
        this.f17748e = xVar;
    }

    public static x2.f0 o(e2.l1 l1Var, Object obj, long j3, long j10, e2.k1 k1Var, e2.i1 i1Var) {
        l1Var.g(obj, i1Var);
        l1Var.n(i1Var.f10287c, k1Var);
        l1Var.b(obj);
        int i7 = i1Var.f10290g.f10197a;
        if (i7 != 0) {
            if (i7 == 1) {
                i1Var.f(0);
            }
            i1Var.f10290g.getClass();
            i1Var.g(0);
        }
        l1Var.g(obj, i1Var);
        int c10 = i1Var.c(j3);
        if (c10 == -1) {
            return new x2.f0(obj, j10, i1Var.b(j3));
        }
        return new x2.f0(c10, i1Var.e(c10), -1, j10, obj);
    }

    public final x0 a() {
        x0 x0Var = this.f17751i;
        if (x0Var == null) {
            return null;
        }
        if (x0Var == this.f17752j) {
            this.f17752j = x0Var.f18085m;
        }
        if (x0Var == this.f17753k) {
            this.f17753k = x0Var.f18085m;
        }
        x0Var.i();
        int i7 = this.f17756n - 1;
        this.f17756n = i7;
        if (i7 == 0) {
            this.f17754l = null;
            x0 x0Var2 = this.f17751i;
            this.f17757o = x0Var2.f18076b;
            this.f17758p = x0Var2.f18080g.f18091a.d;
        }
        this.f17751i = this.f17751i.f18085m;
        l();
        return this.f17751i;
    }

    public final void b() {
        if (this.f17756n == 0) {
            return;
        }
        x0 x0Var = this.f17751i;
        x0Var.getClass();
        this.f17757o = x0Var.f18076b;
        this.f17758p = x0Var.f18080g.f18091a.d;
        while (x0Var != null) {
            x0Var.i();
            x0Var = x0Var.f18085m;
        }
        this.f17751i = null;
        this.f17754l = null;
        this.f17752j = null;
        this.f17753k = null;
        this.f17756n = 0;
        l();
    }

    public final l2.y0 c(e2.l1 r21, l2.x0 r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: l2.a1.c(e2.l1, l2.x0, long):l2.y0");
    }

    public final y0 d(e2.l1 l1Var, x2.f0 f0Var, long j3, long j10, long j11) {
        l1Var.g(f0Var.f58342a, this.f17745a);
        if (f0Var.b()) {
            return e(l1Var, f0Var.f58342a, f0Var.f58343b, f0Var.f58344c, j3, f0Var.d, false);
        }
        return f(l1Var, f0Var.f58342a, j10, j11, j3, f0Var.d, false);
    }

    public final y0 e(e2.l1 l1Var, Object obj, int i7, int i10, long j3, long j10, boolean z9) {
        x2.f0 f0Var = new x2.f0(i7, i10, -1, j10, obj);
        e2.i1 i1Var = this.f17745a;
        long a10 = l1Var.g(obj, i1Var).a(i7, i10);
        if (i10 == i1Var.e(i7)) {
            i1Var.f10290g.getClass();
        }
        i1Var.g(i7);
        long j11 = 0;
        if (a10 != -9223372036854775807L && 0 >= a10) {
            j11 = Math.max(0L, a10 - 1);
        }
        return new y0(f0Var, j11, -9223372036854775807L, j3, -9223372036854775807L, a10, z9, false, false, false, false);
    }

    public final y0 f(e2.l1 l1Var, Object obj, long j3, long j10, long j11, long j12, boolean z9) {
        long j13;
        long j14;
        long j15;
        e2.i1 i1Var = this.f17745a;
        l1Var.g(obj, i1Var);
        int b10 = i1Var.b(j3);
        boolean z10 = false;
        if (b10 == -1) {
            if (i1Var.f10290g.f10197a > 0) {
                i1Var.g(0);
            }
        } else {
            i1Var.g(b10);
        }
        x2.f0 f0Var = new x2.f0(obj, j12, b10);
        if (!f0Var.b() && b10 == -1) {
            z10 = true;
        }
        boolean j16 = j(l1Var, f0Var);
        boolean i7 = i(l1Var, f0Var, z10);
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
        return new y0(f0Var, j15, j10, j11, j13, j14, z9, false, z10, j16, i7);
    }

    public final x0 g() {
        return this.f17753k;
    }

    public final y0 h(e2.l1 l1Var, y0 y0Var) {
        boolean z9;
        long j3;
        long j10;
        x2.f0 f0Var = y0Var.f18091a;
        boolean b10 = f0Var.b();
        int i7 = f0Var.f58345e;
        if (!b10 && i7 == -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z10 = z9;
        int i10 = f0Var.f58343b;
        boolean j11 = j(l1Var, f0Var);
        boolean i11 = i(l1Var, f0Var, z10);
        Object obj = f0Var.f58342a;
        e2.i1 i1Var = this.f17745a;
        l1Var.g(obj, i1Var);
        if (!f0Var.b() && i7 != -1) {
            i1Var.d(i7);
            j3 = 0;
        } else {
            j3 = -9223372036854775807L;
        }
        if (f0Var.b()) {
            j10 = i1Var.a(i10, f0Var.f58344c);
        } else if (j3 != -9223372036854775807L && j3 != Long.MIN_VALUE) {
            j10 = j3;
        } else {
            j10 = i1Var.d;
        }
        if (f0Var.b()) {
            i1Var.g(i10);
        } else if (i7 != -1) {
            i1Var.g(i7);
        }
        return new y0(f0Var, y0Var.f18092b, y0Var.f18093c, y0Var.d, j3, j10, y0Var.f18096g, false, z10, j11, i11);
    }

    public final boolean i(e2.l1 l1Var, x2.f0 f0Var, boolean z9) {
        int b10 = l1Var.b(f0Var.f58342a);
        if (!l1Var.m(l1Var.f(b10, this.f17745a, false).f10287c, this.f17746b, 0L).f10335i) {
            if (l1Var.d(b10, this.f17745a, this.f17746b, this.f17750g, this.h) == -1 && z9) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(e2.l1 l1Var, x2.f0 f0Var) {
        boolean z9;
        if (!f0Var.b() && f0Var.f58345e == -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        Object obj = f0Var.f58342a;
        if (z9) {
            if (l1Var.m(l1Var.g(obj, this.f17745a).f10287c, this.f17746b, 0L).f10341o == l1Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        x0 x0Var = this.f17755m;
        if (x0Var == null || x0Var.h()) {
            this.f17755m = null;
            for (int i7 = 0; i7 < this.f17759q.size(); i7++) {
                x0 x0Var2 = (x0) this.f17759q.get(i7);
                if (!x0Var2.h()) {
                    this.f17755m = x0Var2;
                    return;
                }
            }
        }
    }

    public final void l() {
        x2.f0 f0Var;
        h9.f0 p10 = h9.i0.p();
        for (x0 x0Var = this.f17751i; x0Var != null; x0Var = x0Var.f18085m) {
            p10.c(x0Var.f18080g.f18091a);
        }
        x0 x0Var2 = this.f17752j;
        if (x0Var2 == null) {
            f0Var = null;
        } else {
            f0Var = x0Var2.f18080g.f18091a;
        }
        this.d.d(new z0(this, p10, f0Var, 0));
    }

    public final void m(long j3) {
        boolean z9;
        x0 x0Var = this.f17754l;
        if (x0Var != null) {
            if (x0Var.f18085m == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            ia.p(z9);
            if (x0Var.f18078e) {
                x0Var.f18075a.r(j3 - x0Var.f18088p);
            }
        }
    }

    public final int n(x0 x0Var) {
        x0Var.getClass();
        int i7 = 0;
        if (x0Var.equals(this.f17754l)) {
            return 0;
        }
        this.f17754l = x0Var;
        while (true) {
            x0Var = x0Var.f18085m;
            if (x0Var == null) {
                break;
            }
            if (x0Var == this.f17752j) {
                x0 x0Var2 = this.f17751i;
                this.f17752j = x0Var2;
                this.f17753k = x0Var2;
                i7 = 3;
            }
            if (x0Var == this.f17753k) {
                this.f17753k = this.f17752j;
                i7 |= 2;
            }
            x0Var.i();
            this.f17756n--;
        }
        x0 x0Var3 = this.f17754l;
        x0Var3.getClass();
        if (x0Var3.f18085m != null) {
            x0Var3.b();
            x0Var3.f18085m = null;
            x0Var3.c();
        }
        l();
        return i7;
    }

    public final x2.f0 p(e2.l1 l1Var, Object obj, long j3) {
        long q10;
        int b10;
        Object obj2 = obj;
        e2.i1 i1Var = this.f17745a;
        int i7 = l1Var.g(obj2, i1Var).f10287c;
        Object obj3 = this.f17757o;
        if (obj3 != null && (b10 = l1Var.b(obj3)) != -1 && l1Var.f(b10, i1Var, false).f10287c == i7) {
            q10 = this.f17758p;
        } else {
            x0 x0Var = this.f17751i;
            while (true) {
                if (x0Var != null) {
                    if (x0Var.f18076b.equals(obj2)) {
                        q10 = x0Var.f18080g.f18091a.d;
                        break;
                    }
                    x0Var = x0Var.f18085m;
                } else {
                    x0 x0Var2 = this.f17751i;
                    while (true) {
                        if (x0Var2 != null) {
                            int b11 = l1Var.b(x0Var2.f18076b);
                            if (b11 != -1 && l1Var.f(b11, i1Var, false).f10287c == i7) {
                                q10 = x0Var2.f18080g.f18091a.d;
                                break;
                            }
                            x0Var2 = x0Var2.f18085m;
                        } else {
                            q10 = q(obj2);
                            if (q10 == -1) {
                                q10 = this.f17749f;
                                this.f17749f = 1 + q10;
                                if (this.f17751i == null) {
                                    this.f17757o = obj2;
                                    this.f17758p = q10;
                                }
                            }
                        }
                    }
                }
            }
        }
        l1Var.g(obj2, i1Var);
        int i10 = i1Var.f10287c;
        e2.k1 k1Var = this.f17746b;
        l1Var.n(i10, k1Var);
        boolean z9 = false;
        for (int b12 = l1Var.b(obj); b12 >= k1Var.f10340n; b12--) {
            boolean z10 = true;
            l1Var.f(b12, i1Var, true);
            if (i1Var.f10290g.f10197a <= 0) {
                z10 = false;
            }
            z9 |= z10;
            if (i1Var.c(i1Var.d) != -1) {
                obj2 = i1Var.f10286b;
                obj2.getClass();
            }
            if (z9 && (!z10 || i1Var.d != 0)) {
                break;
            }
        }
        return o(l1Var, obj2, j3, q10, this.f17746b, this.f17745a);
    }

    public final long q(Object obj) {
        for (int i7 = 0; i7 < this.f17759q.size(); i7++) {
            x0 x0Var = (x0) this.f17759q.get(i7);
            if (x0Var.f18076b.equals(obj)) {
                return x0Var.f18080g.f18091a.d;
            }
        }
        return -1L;
    }

    public final int r(e2.l1 l1Var) {
        e2.l1 l1Var2;
        x0 x0Var;
        x0 x0Var2 = this.f17751i;
        if (x0Var2 == null) {
            return 0;
        }
        int b10 = l1Var.b(x0Var2.f18076b);
        while (true) {
            l1Var2 = l1Var;
            b10 = l1Var2.d(b10, this.f17745a, this.f17746b, this.f17750g, this.h);
            while (true) {
                x0Var2.getClass();
                x0Var = x0Var2.f18085m;
                if (x0Var == null || x0Var2.f18080g.f18097i) {
                    break;
                }
                x0Var2 = x0Var;
            }
            if (b10 == -1 || x0Var == null || l1Var2.b(x0Var.f18076b) != b10) {
                break;
            }
            x0Var2 = x0Var;
            l1Var = l1Var2;
        }
        int n10 = n(x0Var2);
        x0Var2.f18080g = h(l1Var2, x0Var2.f18080g);
        return n10;
    }

    public final int s(e2.l1 r23, long r24, long r26, long r28) {
        throw new UnsupportedOperationException("Method not decompiled: l2.a1.s(e2.l1, long, long, long):int");
    }
}
