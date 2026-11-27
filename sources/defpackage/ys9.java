package defpackage;

import android.util.SparseArray;
import j$.util.Objects;
import java.io.EOFException;
public class ys9 implements x1c {
    public boolean C;
    public ko4 D;
    public ko4 E;
    public long F;
    public boolean H;
    public long I;
    public boolean J;
    public final us9 a;
    public final pr3 d;
    public final mr3 e;
    public xs9 f;
    public ko4 g;
    public jr3 h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean z;
    public final sd1 b = new Object();
    public int i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public w1c[] o = new w1c[1000];
    public final lp c = new lp(new vr9((byte) 4));
    public long t = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public long w = Long.MIN_VALUE;
    public boolean B = true;
    public boolean A = true;
    public boolean G = true;
    public long u = Long.MIN_VALUE;
    public int x = -1;
    public int y = -1;

    public ys9(rx6 rx6Var, pr3 pr3Var, mr3 mr3Var) {
        this.d = pr3Var;
        this.e = mr3Var;
        this.a = new us9(rx6Var);
    }

    public final synchronized boolean A(boolean z) {
        boolean z2;
        ko4 ko4Var;
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
                if (((ws9) this.c.l(v)).a != this.g) {
                    return true;
                }
                return B(w(this.s));
            }
        }
        if (!z && !this.z && ((ko4Var = this.E) == null || ko4Var == this.g)) {
            z4 = false;
        }
        return z4;
    }

    public final boolean B(int i) {
        jr3 jr3Var = this.h;
        if (jr3Var != null && jr3Var.e() != 4) {
            if ((this.m[i] & 1073741824) != 0 || !this.h.b()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void C() {
        jr3 jr3Var = this.h;
        if (jr3Var != null && jr3Var.e() == 1) {
            ir3 g = this.h.g();
            g.getClass();
            throw g;
        }
    }

    public final void D(ko4 ko4Var, ym4 ym4Var) {
        hr3 hr3Var;
        boolean z;
        ko4 ko4Var2;
        ko4 ko4Var3 = this.g;
        if (ko4Var3 == null) {
            z = true;
            hr3Var = null;
        } else {
            hr3Var = ko4Var3.x;
            z = false;
        }
        this.g = ko4Var;
        hr3 hr3Var2 = ko4Var.x;
        pr3 pr3Var = this.d;
        if (pr3Var != null) {
            int x = pr3Var.x(ko4Var);
            jo4 a = ko4Var.a();
            a.W = x;
            ko4Var2 = new ko4(a);
        } else {
            ko4Var2 = ko4Var;
        }
        ym4Var.c = ko4Var2;
        ym4Var.b = this.h;
        if (pr3Var != null) {
            if (z || !Objects.equals(hr3Var, hr3Var2)) {
                jr3 jr3Var = this.h;
                mr3 mr3Var = this.e;
                jr3 c = pr3Var.c(mr3Var, ko4Var);
                this.h = c;
                ym4Var.b = c;
                if (jr3Var != null) {
                    jr3Var.c(mr3Var);
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

    public final int F(ym4 ym4Var, s93 s93Var, int i, boolean z) {
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
        sd1 sd1Var = this.b;
        synchronized (this) {
            s93Var.d = false;
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
                    ko4 ko4Var = ((ws9) this.c.l(v)).a;
                    if (!z2 && ko4Var == this.g) {
                        int w = w(this.s);
                        if (!B(w)) {
                            s93Var.d = true;
                            i2 = -3;
                        } else {
                            s93Var.setFlags(this.m[w]);
                            if (this.s == this.p - 1 && (z || this.z)) {
                                s93Var.addFlag(536870912);
                            }
                            s93Var.e = this.n[w];
                            sd1Var.a = this.l[w];
                            sd1Var.b = this.k[w];
                            sd1Var.c = this.o[w];
                            i2 = -4;
                        }
                    } else {
                        D(ko4Var, ym4Var);
                    }
                }
            }
            if (!z && !this.z && !z3) {
                ko4 ko4Var2 = this.E;
                if (ko4Var2 == null || (!z2 && ko4Var2 == this.g)) {
                    i2 = -3;
                } else {
                    D(ko4Var2, ym4Var);
                }
            } else {
                s93Var.setFlags(4);
                s93Var.e = Long.MIN_VALUE;
                i2 = -4;
            }
        }
        if (i2 == -4 && !s93Var.isEndOfStream()) {
            if ((i & 1) != 0) {
                z6 = true;
            }
            if ((i & 4) == 0) {
                us9 us9Var = this.a;
                sd1 sd1Var2 = this.b;
                if (z6) {
                    us9.f(us9Var.e, s93Var, sd1Var2, us9Var.c);
                } else {
                    us9Var.e = us9.f(us9Var.e, s93Var, sd1Var2, us9Var.c);
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
        us9 us9Var = this.a;
        ty0 ty0Var = us9Var.d;
        if (((nj) ty0Var.c) != null) {
            rx6 rx6Var = us9Var.a;
            synchronized (rx6Var) {
                ((ec3) rx6Var.d).c.z(ty0Var);
                ty0 ty0Var2 = ty0Var;
                while (ty0Var2 != null) {
                    nj njVar = (nj) ty0Var2.c;
                    njVar.getClass();
                    rx6Var.h0(njVar);
                    ty0Var2 = (ty0) ty0Var2.d;
                    if (ty0Var2 == null || ((nj) ty0Var2.c) == null) {
                        ty0Var2 = null;
                    }
                }
            }
            ty0Var.c = null;
            ty0Var.d = null;
        }
        ty0 ty0Var3 = us9Var.d;
        int i = us9Var.b;
        if (((nj) ty0Var3.c) == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        yve.p(z2);
        ty0Var3.a = 0L;
        ty0Var3.b = i;
        ty0 ty0Var4 = us9Var.d;
        us9Var.e = ty0Var4;
        us9Var.f = ty0Var4;
        us9Var.g = 0L;
        us9Var.a.y0();
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
        lp lpVar = this.c;
        SparseArray sparseArray = (SparseArray) lpVar.c;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((vr9) lpVar.d).accept(sparseArray.valueAt(i2));
        }
        lpVar.b = -1;
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
        us9 us9Var = this.a;
        us9Var.e = us9Var.d;
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
        ys9 ys9Var;
        Throwable th;
        int w;
        long j2;
        boolean z2;
        ys9 ys9Var2;
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
                        ys9Var = this;
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
                        ys9Var2 = this;
                        p = i6;
                        j3 = j;
                    } else {
                        int i7 = i3 - i2;
                        ys9Var2 = this;
                        j3 = j;
                        p = ys9Var2.p(w, i7, j3, true);
                    }
                    if (p == -1) {
                        return false;
                    }
                    ys9Var2.t = j3;
                    ys9Var2.s += p;
                    return true;
                }
            } catch (Throwable th4) {
                ys9Var = this;
                th = th4;
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            ys9Var = this;
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
                yve.f(z);
                this.s += i;
            }
        }
        z = false;
        yve.f(z);
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
            ko4 ko4Var = this.E;
            if (i4 < ((ko4Var == null || (r6 = ko4Var.v) == -1) ? 16 : 16) + 1 && !z && !z2) {
                return;
            }
            this.x = i3;
            this.y = -1;
        }
    }

    @Override
    public final void a(long r13, int r15, int r16, int r17, defpackage.w1c r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ys9.a(long, int, int, int, w1c):void");
    }

    @Override
    public final void b(ey7 ey7Var, int i, int i2) {
        while (i > 0) {
            us9 us9Var = this.a;
            int c = us9Var.c(i);
            ty0 ty0Var = us9Var.f;
            nj njVar = (nj) ty0Var.c;
            ey7Var.k(((int) (us9Var.g - ty0Var.a)) + njVar.b, c, njVar.a);
            i -= c;
            long j = us9Var.g + c;
            us9Var.g = j;
            ty0 ty0Var2 = us9Var.f;
            if (j == ty0Var2.b) {
                us9Var.f = (ty0) ty0Var2.d;
            }
        }
    }

    @Override
    public final int c(z63 z63Var, int i, boolean z) {
        us9 us9Var = this.a;
        int c = us9Var.c(i);
        ty0 ty0Var = us9Var.f;
        nj njVar = (nj) ty0Var.c;
        int read = z63Var.read(njVar.a, ((int) (us9Var.g - ty0Var.a)) + njVar.b, c);
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = us9Var.g + read;
        us9Var.g = j;
        ty0 ty0Var2 = us9Var.f;
        if (j == ty0Var2.b) {
            us9Var.f = (ty0) ty0Var2.d;
        }
        return read;
    }

    @Override
    public final void e(int i, ey7 ey7Var) {
        xnb.b(this, ey7Var, i);
    }

    @Override
    public final int f(z63 z63Var, int i, boolean z) {
        return c(z63Var, i, z);
    }

    @Override
    public final void g(ko4 ko4Var) {
        boolean z;
        String str;
        boolean z2;
        ko4 q = q(ko4Var);
        boolean z3 = false;
        this.C = false;
        this.D = ko4Var;
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
                    if (((ws9) sparseArray.valueAt(sparseArray.size() - 1)).a.equals(q)) {
                        SparseArray sparseArray2 = (SparseArray) this.c.c;
                        q = ((ws9) sparseArray2.valueAt(sparseArray2.size() - 1)).a;
                        this.E = q;
                        boolean z4 = this.G;
                        str = q.t;
                        String str2 = q.l;
                        if (dg7.h(str) != 1 && dg7.a(str, str2)) {
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
                if (dg7.h(str) != 1) {
                }
                z2 = false;
                this.G = z42 & z2;
                this.H = false;
                z3 = true;
            }
        }
        xs9 xs9Var = this.f;
        if (xs9Var != null && z3) {
            xs9Var.a();
        }
    }

    public final synchronized void h(long r9, int r11, long r12, int r14, defpackage.w1c r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ys9.h(long, int, long, int, w1c):void");
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
        lp lpVar = this.c;
        SparseArray sparseArray = (SparseArray) lpVar.c;
        while (i7 < sparseArray.size() - 1) {
            int i8 = i7 + 1;
            if (i3 < sparseArray.keyAt(i8)) {
                break;
            }
            ((vr9) lpVar.d).accept(sparseArray.valueAt(i7));
            sparseArray.removeAt(i7);
            int i9 = lpVar.b;
            if (i9 > 0) {
                lpVar.b = i9 - 1;
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
        ys9 ys9Var;
        long j2;
        us9 us9Var = this.a;
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
                                    ys9Var = this;
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
                    ys9Var = this;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        us9Var.b(j2);
    }

    public final void l() {
        long j;
        us9 us9Var = this.a;
        synchronized (this) {
            int i = this.p;
            if (i == 0) {
                j = -1;
            } else {
                j = j(i);
            }
        }
        us9Var.b(j);
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
        yve.f(z);
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
        yve.f(z);
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
        lp lpVar = this.c;
        SparseArray sparseArray = (SparseArray) lpVar.c;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            ((vr9) lpVar.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        if (sparseArray.size() > 0) {
            i4 = Math.min(lpVar.b, sparseArray.size() - 1);
        }
        lpVar.b = i4;
        int i6 = this.p;
        if (i6 != 0) {
            return this.k[w(i6 - 1)] + this.l[w];
        }
        return 0L;
    }

    public final void o(int i) {
        boolean z;
        ty0 ty0Var;
        us9 us9Var = this.a;
        long n = n(i);
        int i2 = us9Var.b;
        if (n <= us9Var.g) {
            z = true;
        } else {
            z = false;
        }
        yve.f(z);
        us9Var.g = n;
        if (n != 0) {
            ty0 ty0Var2 = us9Var.d;
            if (n != ty0Var2.a) {
                while (true) {
                    int i3 = (us9Var.g > ty0Var2.b ? 1 : (us9Var.g == ty0Var2.b ? 0 : -1));
                    ty0Var = (ty0) ty0Var2.d;
                    if (i3 <= 0) {
                        break;
                    }
                    ty0Var2 = ty0Var;
                }
                ty0Var.getClass();
                if (((nj) ty0Var.c) != null) {
                    rx6 rx6Var = us9Var.a;
                    synchronized (rx6Var) {
                        ((ec3) rx6Var.d).c.z(ty0Var);
                        ty0 ty0Var3 = ty0Var;
                        while (ty0Var3 != null) {
                            nj njVar = (nj) ty0Var3.c;
                            njVar.getClass();
                            rx6Var.h0(njVar);
                            ty0Var3 = (ty0) ty0Var3.d;
                            if (ty0Var3 == null || ((nj) ty0Var3.c) == null) {
                                ty0Var3 = null;
                            }
                        }
                    }
                    ty0Var.c = null;
                    ty0Var.d = null;
                }
                ty0 ty0Var4 = new ty0(ty0Var2.b, i2);
                ty0Var2.d = ty0Var4;
                if (us9Var.g == ty0Var2.b) {
                    ty0Var2 = ty0Var4;
                }
                us9Var.f = ty0Var2;
                if (us9Var.e == ty0Var) {
                    us9Var.e = ty0Var4;
                    return;
                }
                return;
            }
        }
        us9Var.a(us9Var.d);
        ty0 ty0Var5 = new ty0(us9Var.g, i2);
        us9Var.d = ty0Var5;
        us9Var.e = ty0Var5;
        us9Var.f = ty0Var5;
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

    public ko4 q(ko4 ko4Var) {
        if (this.I != 0 && ko4Var.y != Long.MAX_VALUE) {
            jo4 a = ko4Var.a();
            a.x = ko4Var.y + this.I;
            return new ko4(a);
        }
        return ko4Var;
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

    public final synchronized ko4 y() {
        ko4 ko4Var;
        if (this.B) {
            ko4Var = null;
        } else {
            ko4Var = this.E;
        }
        return ko4Var;
    }

    public final int z() {
        return this.q + this.p;
    }

    @Override
    public final void d(long j) {
    }
}
