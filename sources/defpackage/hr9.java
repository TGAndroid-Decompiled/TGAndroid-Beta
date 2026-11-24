package defpackage;

import android.util.SparseArray;
import j$.util.Objects;
import java.io.EOFException;
public class hr9 implements yzb {
    public boolean C;
    public go4 D;
    public go4 E;
    public long F;
    public boolean H;
    public long I;
    public boolean J;
    public final dr9 a;
    public final is3 d;
    public final fs3 e;
    public gr9 f;
    public go4 g;
    public cs3 h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean z;
    public final re1 b = new Object();
    public int i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public xzb[] o = new xzb[1000];
    public final kq c = new kq(new dq9((byte) 2));
    public long t = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public long w = Long.MIN_VALUE;
    public boolean B = true;
    public boolean A = true;
    public boolean G = true;
    public long u = Long.MIN_VALUE;
    public int x = -1;
    public int y = -1;

    public hr9(mx6 mx6Var, is3 is3Var, fs3 fs3Var) {
        this.d = is3Var;
        this.e = fs3Var;
        this.a = new dr9(mx6Var);
    }

    public final synchronized boolean A(boolean z) {
        boolean z2;
        go4 go4Var;
        boolean z3;
        int v = v();
        int i = this.x;
        boolean z4 = true;
        if (i != -1 && v >= i) {
            return true;
        }
        if (this.s != this.p) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (i == -1 && this.y != -1 && v() >= this.y) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                if (((fr9) this.c.l(v)).a != this.g) {
                    return true;
                }
                return B(w(this.s));
            }
        }
        if (!z && !this.z && ((go4Var = this.E) == null || go4Var == this.g)) {
            z4 = false;
        }
        return z4;
    }

    public final boolean B(int i) {
        cs3 cs3Var = this.h;
        if (cs3Var != null && cs3Var.e() != 4) {
            if ((this.m[i] & 1073741824) != 0 || !this.h.b()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void C() {
        cs3 cs3Var = this.h;
        if (cs3Var != null && cs3Var.e() == 1) {
            bs3 g = this.h.g();
            g.getClass();
            throw g;
        }
    }

    public final void D(go4 go4Var, mj4 mj4Var) {
        as3 as3Var;
        boolean z;
        go4 go4Var2;
        go4 go4Var3 = this.g;
        if (go4Var3 == null) {
            z = true;
            as3Var = null;
        } else {
            as3Var = go4Var3.x;
            z = false;
        }
        this.g = go4Var;
        as3 as3Var2 = go4Var.x;
        is3 is3Var = this.d;
        if (is3Var != null) {
            int x = is3Var.x(go4Var);
            fo4 a = go4Var.a();
            a.W = x;
            go4Var2 = new go4(a);
        } else {
            go4Var2 = go4Var;
        }
        mj4Var.c = go4Var2;
        mj4Var.b = this.h;
        if (is3Var != null) {
            if (z || !Objects.equals(as3Var, as3Var2)) {
                cs3 cs3Var = this.h;
                fs3 fs3Var = this.e;
                cs3 d = is3Var.d(fs3Var, go4Var);
                this.h = d;
                mj4Var.b = d;
                if (cs3Var != null) {
                    cs3Var.c(fs3Var);
                }
            }
        }
    }

    public final synchronized long E() {
        boolean z;
        long j;
        int w = w(this.s);
        if (this.s != this.p) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            j = this.j[w];
        } else {
            j = this.F;
        }
        return j;
    }

    public final int F(mj4 mj4Var, la3 la3Var, int i, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        boolean z5;
        boolean z6 = false;
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        re1 re1Var = this.b;
        synchronized (this) {
            la3Var.d = false;
            int v = v();
            int i3 = this.x;
            if (i3 != -1 && v >= i3) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (this.s != this.p) {
                z4 = true;
            } else {
                z4 = false;
            }
            i2 = -5;
            if (z4) {
                if (i3 == -1 && this.y != -1 && v() >= this.y) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z5 && !z3) {
                    go4 go4Var = ((fr9) this.c.l(v)).a;
                    if (!z2 && go4Var == this.g) {
                        int w = w(this.s);
                        if (!B(w)) {
                            la3Var.d = true;
                            i2 = -3;
                        } else {
                            la3Var.setFlags(this.m[w]);
                            if (this.s == this.p - 1 && (z || this.z)) {
                                la3Var.addFlag(536870912);
                            }
                            la3Var.e = this.n[w];
                            re1Var.a = this.l[w];
                            re1Var.b = this.k[w];
                            re1Var.c = this.o[w];
                            i2 = -4;
                        }
                    } else {
                        D(go4Var, mj4Var);
                    }
                }
            }
            if (!z && !this.z && !z3) {
                go4 go4Var2 = this.E;
                if (go4Var2 == null || (!z2 && go4Var2 == this.g)) {
                    i2 = -3;
                } else {
                    D(go4Var2, mj4Var);
                }
            } else {
                la3Var.setFlags(4);
                la3Var.e = Long.MIN_VALUE;
                i2 = -4;
            }
        }
        if (i2 == -4 && !la3Var.isEndOfStream()) {
            if ((i & 1) != 0) {
                z6 = true;
            }
            if ((i & 4) == 0) {
                dr9 dr9Var = this.a;
                re1 re1Var2 = this.b;
                if (z6) {
                    dr9.f(dr9Var.e, la3Var, re1Var2, dr9Var.c);
                } else {
                    dr9Var.e = dr9.f(dr9Var.e, la3Var, re1Var2, dr9Var.c);
                }
            }
            if (!z6) {
                this.s++;
            }
        }
        return i2;
    }

    public final void G(boolean z) {
        boolean z2;
        dr9 dr9Var = this.a;
        sz0 sz0Var = dr9Var.d;
        if (((mk) sz0Var.c) != null) {
            mx6 mx6Var = dr9Var.a;
            synchronized (mx6Var) {
                ((xc3) mx6Var.d).c.z(sz0Var);
                sz0 sz0Var2 = sz0Var;
                while (sz0Var2 != null) {
                    mk mkVar = (mk) sz0Var2.c;
                    mkVar.getClass();
                    mx6Var.g0(mkVar);
                    sz0Var2 = (sz0) sz0Var2.d;
                    if (sz0Var2 == null || ((mk) sz0Var2.c) == null) {
                        sz0Var2 = null;
                    }
                }
            }
            sz0Var.c = null;
            sz0Var.d = null;
        }
        sz0 sz0Var3 = dr9Var.d;
        int i = dr9Var.b;
        if (((mk) sz0Var3.c) == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        jte.p(z2);
        sz0Var3.a = 0L;
        sz0Var3.b = i;
        sz0 sz0Var4 = dr9Var.d;
        dr9Var.e = sz0Var4;
        dr9Var.f = sz0Var4;
        dr9Var.g = 0L;
        dr9Var.a.x0();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = -1;
        this.y = -1;
        this.A = true;
        this.t = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = Long.MIN_VALUE;
        this.z = false;
        kq kqVar = this.c;
        SparseArray sparseArray = (SparseArray) kqVar.c;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((dq9) kqVar.d).accept(sparseArray.valueAt(i2));
        }
        kqVar.b = -1;
        sparseArray.clear();
        if (z) {
            this.D = null;
            this.E = null;
            this.B = true;
            this.G = true;
        }
    }

    public final synchronized void H() {
        this.s = 0;
        dr9 dr9Var = this.a;
        dr9Var.e = dr9Var.d;
    }

    public final synchronized boolean I(int i) {
        H();
        int i2 = this.q;
        if (i < i2 || i > this.p + i2) {
            return false;
        }
        int i3 = this.x;
        if (i3 != -1 && i >= i3) {
            return false;
        }
        int i4 = this.y;
        if (i4 != -1 && i >= i4) {
            return false;
        }
        this.t = Long.MIN_VALUE;
        this.s = i - i2;
        return true;
    }

    public final synchronized boolean J(long j, boolean z) {
        hr9 hr9Var;
        Throwable th;
        int w;
        long j2;
        boolean z2;
        hr9 hr9Var2;
        long j3;
        int p;
        try {
            try {
                H();
                w = w(this.s);
                long j4 = this.u;
                int i = (j4 > Long.MIN_VALUE ? 1 : (j4 == Long.MIN_VALUE ? 0 : -1));
                j2 = this.w;
                if (i != 0) {
                    try {
                        j2 = Math.min(j2, j4);
                    } catch (Throwable th2) {
                        th = th2;
                        hr9Var = this;
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
            try {
                int i2 = this.s;
                int i3 = this.p;
                if (i2 != i3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && j >= this.n[w] && (j <= j2 || z)) {
                    if (this.G) {
                        int i4 = i3 - i2;
                        int i5 = 0;
                        while (true) {
                            if (i5 < i4) {
                                if (this.n[w] >= j) {
                                    i4 = i5;
                                    break;
                                }
                                w++;
                                if (w == this.i) {
                                    w = 0;
                                }
                                i5++;
                            } else if (!z) {
                                i4 = -1;
                            }
                        }
                        int i6 = i4;
                        hr9Var2 = this;
                        p = i6;
                        j3 = j;
                    } else {
                        int i7 = i3 - i2;
                        hr9Var2 = this;
                        j3 = j;
                        p = hr9Var2.p(w, i7, j3, true);
                    }
                    if (p == -1) {
                        return false;
                    }
                    hr9Var2.t = j3;
                    hr9Var2.s += p;
                    return true;
                }
            } catch (Throwable th4) {
                hr9Var = this;
                th = th4;
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            hr9Var = this;
            th = th;
            throw th;
        }
        return false;
    }

    public final synchronized void K(long j) {
        if (j == this.u) {
            return;
        }
        this.u = j;
        this.x = -1;
        this.y = -1;
        if (j != Long.MIN_VALUE && j <= this.w) {
            for (int i = 0; i < this.p; i++) {
                int w = w(i);
                M(this.q + i, this.m[w], this.n[w]);
                if (this.x != -1) {
                    break;
                }
            }
        }
    }

    public final synchronized void L(int i) {
        boolean z;
        if (i >= 0) {
            if (this.s + i <= this.p) {
                z = true;
                jte.f(z);
                this.s += i;
            }
        }
        z = false;
        jte.f(z);
        this.s += i;
    }

    public final void M(int i, int i2, long j) {
        boolean z;
        long j2 = this.u;
        if (j2 != Long.MIN_VALUE && this.x == -1) {
            if (j < j2) {
                this.y = -1;
                return;
            }
            int i3 = this.y;
            if (i3 == -1) {
                this.y = i;
                i3 = i;
            }
            int i4 = (i - i3) + 1;
            boolean z2 = false;
            if ((i2 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i2 & 536870912) != 0) {
                z2 = true;
            }
            go4 go4Var = this.E;
            if (i4 < ((go4Var == null || (r6 = go4Var.v) == -1) ? 16 : 16) + 1 && !z && !z2) {
                return;
            }
            this.x = i3;
            this.y = -1;
        }
    }

    @Override
    public final void a(long r13, int r15, int r16, int r17, defpackage.xzb r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hr9.a(long, int, int, int, xzb):void");
    }

    @Override
    public final void b(yw7 yw7Var, int i, int i2) {
        while (i > 0) {
            dr9 dr9Var = this.a;
            int c = dr9Var.c(i);
            sz0 sz0Var = dr9Var.f;
            mk mkVar = (mk) sz0Var.c;
            yw7Var.k(((int) (dr9Var.g - sz0Var.a)) + mkVar.b, c, mkVar.a);
            i -= c;
            long j = dr9Var.g + c;
            dr9Var.g = j;
            sz0 sz0Var2 = dr9Var.f;
            if (j == sz0Var2.b) {
                dr9Var.f = (sz0) sz0Var2.d;
            }
        }
    }

    @Override
    public final int c(s73 s73Var, int i, boolean z) {
        dr9 dr9Var = this.a;
        int c = dr9Var.c(i);
        sz0 sz0Var = dr9Var.f;
        mk mkVar = (mk) sz0Var.c;
        int read = s73Var.read(mkVar.a, ((int) (dr9Var.g - sz0Var.a)) + mkVar.b, c);
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = dr9Var.g + read;
        dr9Var.g = j;
        sz0 sz0Var2 = dr9Var.f;
        if (j == sz0Var2.b) {
            dr9Var.f = (sz0) sz0Var2.d;
        }
        return read;
    }

    @Override
    public final void e(int i, yw7 yw7Var) {
        mlb.b(this, yw7Var, i);
    }

    @Override
    public final int f(s73 s73Var, int i, boolean z) {
        return c(s73Var, i, z);
    }

    @Override
    public final void g(go4 go4Var) {
        boolean z;
        String str;
        boolean z2;
        go4 q = q(go4Var);
        boolean z3 = false;
        this.C = false;
        this.D = go4Var;
        synchronized (this) {
            this.B = false;
            if (!Objects.equals(q, this.E)) {
                if (((SparseArray) this.c.c).size() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    SparseArray sparseArray = (SparseArray) this.c.c;
                    if (((fr9) sparseArray.valueAt(sparseArray.size() - 1)).a.equals(q)) {
                        SparseArray sparseArray2 = (SparseArray) this.c.c;
                        q = ((fr9) sparseArray2.valueAt(sparseArray2.size() - 1)).a;
                        this.E = q;
                        boolean z4 = this.G;
                        str = q.t;
                        String str2 = q.l;
                        if (wf7.h(str) != 1 && wf7.a(str, str2)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.G = z4 & z2;
                        this.H = false;
                        z3 = true;
                    }
                }
                this.E = q;
                boolean z42 = this.G;
                str = q.t;
                String str22 = q.l;
                if (wf7.h(str) != 1) {
                }
                z2 = false;
                this.G = z42 & z2;
                this.H = false;
                z3 = true;
            }
        }
        gr9 gr9Var = this.f;
        if (gr9Var != null && z3) {
            gr9Var.a();
        }
    }

    public final synchronized void h(long r9, int r11, long r12, int r14, defpackage.xzb r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hr9.h(long, int, long, int, xzb):void");
    }

    public final int i(long j) {
        int i = this.p;
        int w = w(i - 1);
        while (i > this.s && this.n[w] >= j) {
            i--;
            w--;
            if (w == -1) {
                w = this.i - 1;
            }
        }
        return i;
    }

    public final long j(int i) {
        int i2;
        this.v = Math.max(this.v, u(i));
        this.p -= i;
        int i3 = this.q + i;
        this.q = i3;
        int i4 = this.r + i;
        this.r = i4;
        int i5 = this.i;
        if (i4 >= i5) {
            this.r = i4 - i5;
        }
        int i6 = this.s - i;
        this.s = i6;
        int i7 = 0;
        if (i6 < 0) {
            this.s = 0;
        }
        kq kqVar = this.c;
        SparseArray sparseArray = (SparseArray) kqVar.c;
        while (i7 < sparseArray.size() - 1) {
            int i8 = i7 + 1;
            if (i3 < sparseArray.keyAt(i8)) {
                break;
            }
            ((dq9) kqVar.d).accept(sparseArray.valueAt(i7));
            sparseArray.removeAt(i7);
            int i9 = kqVar.b;
            if (i9 > 0) {
                kqVar.b = i9 - 1;
            }
            i7 = i8;
        }
        if (this.p == 0) {
            int i10 = this.r;
            if (i10 == 0) {
                i10 = this.i;
            }
            return this.k[i10 - 1] + this.l[i2];
        }
        return this.k[this.r];
    }

    public final void k(long j, boolean z) {
        Throwable th;
        hr9 hr9Var;
        long j2;
        dr9 dr9Var = this.a;
        synchronized (this) {
            try {
                try {
                    int i = this.p;
                    j2 = -1;
                    if (i != 0) {
                        long[] jArr = this.n;
                        int i2 = this.r;
                        if (j >= jArr[i2]) {
                            if (z) {
                                try {
                                    int i3 = this.s;
                                    if (i3 != i) {
                                        i = i3 + 1;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    hr9Var = this;
                                    throw th;
                                }
                            }
                            int p = p(i2, i, j, false);
                            if (p != -1) {
                                j2 = j(p);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    hr9Var = this;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        dr9Var.b(j2);
    }

    public final void l() {
        long j;
        dr9 dr9Var = this.a;
        synchronized (this) {
            int i = this.p;
            if (i == 0) {
                j = -1;
            } else {
                j = j(i);
            }
        }
        dr9Var.b(j);
    }

    public final void m(long j) {
        boolean z;
        if (this.p == 0) {
            return;
        }
        if (j > t()) {
            z = true;
        } else {
            z = false;
        }
        jte.f(z);
        o(this.q + i(j));
    }

    public final long n(int i) {
        boolean z;
        int w;
        int z2 = z() - i;
        boolean z3 = false;
        if (z2 >= 0 && z2 <= this.p - this.s) {
            z = true;
        } else {
            z = false;
        }
        jte.f(z);
        int i2 = this.p - z2;
        this.p = i2;
        this.w = Math.max(this.v, u(i2));
        if (z2 == 0 && this.z) {
            z3 = true;
        }
        this.z = z3;
        int i3 = this.x;
        int i4 = -1;
        if (i3 != -1 && i < i3) {
            this.x = -1;
        }
        int i5 = this.y;
        if (i5 != -1 && i < i5) {
            this.y = -1;
        }
        kq kqVar = this.c;
        SparseArray sparseArray = (SparseArray) kqVar.c;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            ((dq9) kqVar.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        if (sparseArray.size() > 0) {
            i4 = Math.min(kqVar.b, sparseArray.size() - 1);
        }
        kqVar.b = i4;
        int i6 = this.p;
        if (i6 != 0) {
            return this.k[w(i6 - 1)] + this.l[w];
        }
        return 0L;
    }

    public final void o(int i) {
        boolean z;
        sz0 sz0Var;
        dr9 dr9Var = this.a;
        long n = n(i);
        int i2 = dr9Var.b;
        if (n <= dr9Var.g) {
            z = true;
        } else {
            z = false;
        }
        jte.f(z);
        dr9Var.g = n;
        if (n != 0) {
            sz0 sz0Var2 = dr9Var.d;
            if (n != sz0Var2.a) {
                while (true) {
                    int i3 = (dr9Var.g > sz0Var2.b ? 1 : (dr9Var.g == sz0Var2.b ? 0 : -1));
                    sz0Var = (sz0) sz0Var2.d;
                    if (i3 <= 0) {
                        break;
                    }
                    sz0Var2 = sz0Var;
                }
                sz0Var.getClass();
                if (((mk) sz0Var.c) != null) {
                    mx6 mx6Var = dr9Var.a;
                    synchronized (mx6Var) {
                        ((xc3) mx6Var.d).c.z(sz0Var);
                        sz0 sz0Var3 = sz0Var;
                        while (sz0Var3 != null) {
                            mk mkVar = (mk) sz0Var3.c;
                            mkVar.getClass();
                            mx6Var.g0(mkVar);
                            sz0Var3 = (sz0) sz0Var3.d;
                            if (sz0Var3 == null || ((mk) sz0Var3.c) == null) {
                                sz0Var3 = null;
                            }
                        }
                    }
                    sz0Var.c = null;
                    sz0Var.d = null;
                }
                sz0 sz0Var4 = new sz0(sz0Var2.b, i2);
                sz0Var2.d = sz0Var4;
                if (dr9Var.g == sz0Var2.b) {
                    sz0Var2 = sz0Var4;
                }
                dr9Var.f = sz0Var2;
                if (dr9Var.e == sz0Var) {
                    dr9Var.e = sz0Var4;
                    return;
                }
                return;
            }
        }
        dr9Var.a(dr9Var.d);
        sz0 sz0Var5 = new sz0(dr9Var.g, i2);
        dr9Var.d = sz0Var5;
        dr9Var.e = sz0Var5;
        dr9Var.f = sz0Var5;
    }

    public final int p(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = (this.n[i] > j ? 1 : (this.n[i] == j ? 0 : -1));
            if (i5 > 0) {
                break;
            }
            if (!z || (this.m[i] & 1) != 0) {
                if (i5 == 0) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        return i3;
    }

    public go4 q(go4 go4Var) {
        if (this.I != 0 && go4Var.y != Long.MAX_VALUE) {
            fo4 a = go4Var.a();
            a.x = go4Var.y + this.I;
            return new go4(a);
        }
        return go4Var;
    }

    public final synchronized long r() {
        long j;
        if (this.p == 0) {
            j = Long.MIN_VALUE;
        } else {
            j = this.n[this.r];
        }
        return j;
    }

    public final synchronized long s() {
        return this.w;
    }

    public final synchronized long t() {
        return Math.max(this.v, u(this.s));
    }

    public final long u(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int w = w(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.n[w]);
            if ((this.m[w] & 1) != 0) {
                return j;
            }
            w--;
            if (w == -1) {
                w = this.i - 1;
            }
        }
        return j;
    }

    public final int v() {
        return this.q + this.s;
    }

    public final int w(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        if (i2 < i3) {
            return i2;
        }
        return i2 - i3;
    }

    public final synchronized int x(long j, boolean z) {
        boolean z2;
        try {
            try {
                int w = w(this.s);
                int i = this.s;
                int i2 = this.p;
                if (i != i2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 || j < this.n[w]) {
                    return 0;
                }
                if (j > this.w && z) {
                    return i2 - i;
                }
                int p = p(w, i2 - i, j, true);
                if (p == -1) {
                    return 0;
                }
                return p;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized go4 y() {
        go4 go4Var;
        if (this.B) {
            go4Var = null;
        } else {
            go4Var = this.E;
        }
        return go4Var;
    }

    public final int z() {
        return this.q + this.p;
    }

    @Override
    public final void d(long j) {
    }
}
