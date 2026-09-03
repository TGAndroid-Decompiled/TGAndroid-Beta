package o4;

import android.util.SparseArray;
import java.io.EOFException;
public class k0 implements r3.v {
    public j3.n0 A;
    public j3.n0 B;
    public long C;
    public boolean D;
    public boolean E;
    public long F;
    public boolean G;
    public final g0 f16339a;
    public final o3.p d;
    public final o3.m e;
    public Object f16342f;
    public j3.n0 f16343g;
    public o3.j h;
    public int f16351p;
    public int f16352q;
    public int f16353r;
    public int f16354s;
    public boolean f16357w;
    public boolean f16360z;
    public final h0 f16340b = new Object();
    public int f16344i = 1000;
    public long[] f16345j = new long[1000];
    public long[] f16346k = new long[1000];
    public long[] f16349n = new long[1000];
    public int[] f16348m = new int[1000];
    public int[] f16347l = new int[1000];
    public r3.u[] f16350o = new r3.u[1000];
    public final b4.e0 f16341c = new b4.e0(new nh.e(4));
    public long f16355t = Long.MIN_VALUE;
    public long f16356u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean f16359y = true;
    public boolean f16358x = true;

    public k0(g5.q qVar, o3.p pVar, o3.m mVar) {
        this.d = pVar;
        this.e = mVar;
        this.f16339a = new g0(qVar);
    }

    public final void A(boolean z4) {
        boolean z10;
        g0 g0Var = this.f16339a;
        g0Var.a((a4.c) g0Var.e);
        a4.c cVar = (a4.c) g0Var.e;
        int i10 = g0Var.f16323a;
        if (((g5.a) cVar.f57c) == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        h5.a.i(z10);
        cVar.f55a = 0L;
        cVar.f56b = i10;
        a4.c cVar2 = (a4.c) g0Var.e;
        g0Var.f16326f = cVar2;
        g0Var.f16327g = cVar2;
        g0Var.f16324b = 0L;
        ((g5.q) g0Var.f16325c).b();
        this.f16351p = 0;
        this.f16352q = 0;
        this.f16353r = 0;
        this.f16354s = 0;
        this.f16358x = true;
        this.f16355t = Long.MIN_VALUE;
        this.f16356u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.f16357w = false;
        b4.e0 e0Var = this.f16341c;
        SparseArray sparseArray = (SparseArray) e0Var.f1379c;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            ((nh.e) e0Var.d).accept(sparseArray.valueAt(i11));
        }
        e0Var.f1378b = -1;
        sparseArray.clear();
        if (z4) {
            this.A = null;
            this.B = null;
            this.f16359y = true;
        }
    }

    public final synchronized void B() {
        this.f16354s = 0;
        g0 g0Var = this.f16339a;
        g0Var.f16326f = (a4.c) g0Var.e;
    }

    public final int C(g5.j jVar, int i10, boolean z4) {
        g0 g0Var = this.f16339a;
        int c3 = g0Var.c(i10);
        a4.c cVar = (a4.c) g0Var.f16327g;
        g5.a aVar = (g5.a) cVar.f57c;
        int read = jVar.read(aVar.f6357a, ((int) (g0Var.f16324b - cVar.f55a)) + aVar.f6358b, c3);
        if (read == -1) {
            if (z4) {
                return -1;
            }
            throw new EOFException();
        }
        long j10 = g0Var.f16324b + read;
        g0Var.f16324b = j10;
        a4.c cVar2 = (a4.c) g0Var.f16327g;
        if (j10 == cVar2.f56b) {
            g0Var.f16327g = (a4.c) cVar2.d;
        }
        return read;
    }

    public final synchronized boolean D(long j10, boolean z4) {
        boolean z10;
        try {
            try {
                B();
                int r10 = r(this.f16354s);
                int i10 = this.f16354s;
                int i11 = this.f16351p;
                if (i10 != i11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && j10 >= this.f16349n[r10]) {
                    if (j10 <= this.v || z4) {
                        int l10 = l(j10, r10, i11 - i10, true);
                        if (l10 == -1) {
                            return false;
                        }
                        this.f16355t = j10;
                        this.f16354s += l10;
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized void E(int i10) {
        boolean z4;
        if (i10 >= 0) {
            try {
                if (this.f16354s + i10 <= this.f16351p) {
                    z4 = true;
                    h5.a.f(z4);
                    this.f16354s += i10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z4 = false;
        h5.a.f(z4);
        this.f16354s += i10;
    }

    @Override
    public final void a(int i10, h5.w wVar) {
        while (true) {
            g0 g0Var = this.f16339a;
            if (i10 > 0) {
                int c3 = g0Var.c(i10);
                a4.c cVar = (a4.c) g0Var.f16327g;
                g5.a aVar = (g5.a) cVar.f57c;
                wVar.e(((int) (g0Var.f16324b - cVar.f55a)) + aVar.f6358b, c3, aVar.f6357a);
                i10 -= c3;
                long j10 = g0Var.f16324b + c3;
                g0Var.f16324b = j10;
                a4.c cVar2 = (a4.c) g0Var.f16327g;
                if (j10 == cVar2.f56b) {
                    g0Var.f16327g = (a4.c) cVar2.d;
                }
            } else {
                g0Var.getClass();
                return;
            }
        }
    }

    @Override
    public final void b(j3.n0 r6) {
        throw new UnsupportedOperationException("Method not decompiled: o4.k0.b(j3.n0):void");
    }

    @Override
    public void c(long r14, int r16, int r17, int r18, r3.u r19) {
        throw new UnsupportedOperationException("Method not decompiled: o4.k0.c(long, int, int, int, r3.u):void");
    }

    @Override
    public final void d(int i10, h5.w wVar) {
        a(i10, wVar);
    }

    @Override
    public final int e(g5.j jVar, int i10, boolean z4) {
        return C(jVar, i10, z4);
    }

    public final synchronized void f(long r9, int r11, long r12, int r14, r3.u r15) {
        throw new UnsupportedOperationException("Method not decompiled: o4.k0.f(long, int, long, int, r3.u):void");
    }

    public final long g(int i10) {
        int i11;
        this.f16356u = Math.max(this.f16356u, p(i10));
        this.f16351p -= i10;
        int i12 = this.f16352q + i10;
        this.f16352q = i12;
        int i13 = this.f16353r + i10;
        this.f16353r = i13;
        int i14 = this.f16344i;
        if (i13 >= i14) {
            this.f16353r = i13 - i14;
        }
        int i15 = this.f16354s - i10;
        this.f16354s = i15;
        int i16 = 0;
        if (i15 < 0) {
            this.f16354s = 0;
        }
        b4.e0 e0Var = this.f16341c;
        SparseArray sparseArray = (SparseArray) e0Var.f1379c;
        while (i16 < sparseArray.size() - 1) {
            int i17 = i16 + 1;
            if (i12 < sparseArray.keyAt(i17)) {
                break;
            }
            ((nh.e) e0Var.d).accept(sparseArray.valueAt(i16));
            sparseArray.removeAt(i16);
            int i18 = e0Var.f1378b;
            if (i18 > 0) {
                e0Var.f1378b = i18 - 1;
            }
            i16 = i17;
        }
        if (this.f16351p == 0) {
            int i19 = this.f16353r;
            if (i19 == 0) {
                i19 = this.f16344i;
            }
            return this.f16346k[i19 - 1] + this.f16347l[i11];
        }
        return this.f16346k[this.f16353r];
    }

    public final void h(long j10, boolean z4) {
        Throwable th2;
        g0 g0Var = this.f16339a;
        synchronized (this) {
            try {
                try {
                    int i10 = this.f16351p;
                    long j11 = -1;
                    if (i10 != 0) {
                        long[] jArr = this.f16349n;
                        int i11 = this.f16353r;
                        if (j10 >= jArr[i11]) {
                            if (z4) {
                                try {
                                    int i12 = this.f16354s;
                                    if (i12 != i10) {
                                        i10 = i12 + 1;
                                    }
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    throw th2;
                                }
                            }
                            int l10 = l(j10, i11, i10, false);
                            if (l10 != -1) {
                                j11 = g(l10);
                            }
                            g0Var.b(j11);
                        }
                    }
                    g0Var.b(j11);
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th5) {
                th = th5;
                th2 = th;
                throw th2;
            }
        }
    }

    public final void i() {
        long g10;
        g0 g0Var = this.f16339a;
        synchronized (this) {
            int i10 = this.f16351p;
            if (i10 == 0) {
                g10 = -1;
            } else {
                g10 = g(i10);
            }
        }
        g0Var.b(g10);
    }

    public final long j(int i10) {
        boolean z4;
        int i11;
        int r10;
        int i12 = this.f16352q;
        int i13 = this.f16351p;
        int i14 = (i12 + i13) - i10;
        boolean z10 = false;
        if (i14 >= 0 && i14 <= i13 - this.f16354s) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.f(z4);
        int i15 = this.f16351p - i14;
        this.f16351p = i15;
        this.v = Math.max(this.f16356u, p(i15));
        if (i14 == 0 && this.f16357w) {
            z10 = true;
        }
        this.f16357w = z10;
        b4.e0 e0Var = this.f16341c;
        SparseArray sparseArray = (SparseArray) e0Var.f1379c;
        for (int size = sparseArray.size() - 1; size >= 0 && i10 < sparseArray.keyAt(size); size--) {
            ((nh.e) e0Var.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        if (sparseArray.size() > 0) {
            i11 = Math.min(e0Var.f1378b, sparseArray.size() - 1);
        } else {
            i11 = -1;
        }
        e0Var.f1378b = i11;
        int i16 = this.f16351p;
        if (i16 != 0) {
            return this.f16346k[r(i16 - 1)] + this.f16347l[r10];
        }
        return 0L;
    }

    public final void k(int i10) {
        boolean z4;
        long j10 = j(i10);
        g0 g0Var = this.f16339a;
        int i11 = g0Var.f16323a;
        if (j10 <= g0Var.f16324b) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.f(z4);
        g0Var.f16324b = j10;
        if (j10 != 0) {
            a4.c cVar = (a4.c) g0Var.e;
            if (j10 != cVar.f55a) {
                while (g0Var.f16324b > cVar.f56b) {
                    cVar = (a4.c) cVar.d;
                }
                a4.c cVar2 = (a4.c) cVar.d;
                cVar2.getClass();
                g0Var.a(cVar2);
                a4.c cVar3 = new a4.c(cVar.f56b, i11);
                cVar.d = cVar3;
                if (g0Var.f16324b == cVar.f56b) {
                    cVar = cVar3;
                }
                g0Var.f16327g = cVar;
                if (((a4.c) g0Var.f16326f) == cVar2) {
                    g0Var.f16326f = cVar3;
                    return;
                }
                return;
            }
        }
        g0Var.a((a4.c) g0Var.e);
        a4.c cVar4 = new a4.c(g0Var.f16324b, i11);
        g0Var.e = cVar4;
        g0Var.f16326f = cVar4;
        g0Var.f16327g = cVar4;
    }

    public final int l(long j10, int i10, int i11, boolean z4) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = (this.f16349n[i10] > j10 ? 1 : (this.f16349n[i10] == j10 ? 0 : -1));
            if (i14 > 0) {
                break;
            }
            if (!z4 || (this.f16348m[i10] & 1) != 0) {
                if (i14 == 0) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f16344i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public j3.n0 m(j3.n0 n0Var) {
        if (this.F != 0 && n0Var.G != Long.MAX_VALUE) {
            j3.m0 a2 = n0Var.a();
            a2.f8670s = n0Var.G + this.F;
            return new j3.n0(a2);
        }
        return n0Var;
    }

    public final synchronized long n() {
        return this.v;
    }

    public final synchronized long o() {
        return Math.max(this.f16356u, p(this.f16354s));
    }

    public final long p(int i10) {
        long j10 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int r10 = r(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.f16349n[r10]);
            if ((this.f16348m[r10] & 1) != 0) {
                return j10;
            }
            r10--;
            if (r10 == -1) {
                r10 = this.f16344i - 1;
            }
        }
        return j10;
    }

    public final int q() {
        return this.f16352q + this.f16354s;
    }

    public final int r(int i10) {
        int i11 = this.f16353r + i10;
        int i12 = this.f16344i;
        if (i11 < i12) {
            return i11;
        }
        return i11 - i12;
    }

    public final synchronized int s(long j10, boolean z4) {
        boolean z10;
        try {
            try {
                int r10 = r(this.f16354s);
                int i10 = this.f16354s;
                int i11 = this.f16351p;
                if (i10 != i11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 || j10 < this.f16349n[r10]) {
                    return 0;
                }
                if (j10 > this.v && z4) {
                    return i11 - i10;
                }
                int l10 = l(j10, r10, i11 - i10, true);
                if (l10 == -1) {
                    return 0;
                }
                return l10;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized j3.n0 t() {
        j3.n0 n0Var;
        if (this.f16359y) {
            n0Var = null;
        } else {
            n0Var = this.B;
        }
        return n0Var;
    }

    public final synchronized boolean u(boolean z4) {
        boolean z10;
        j3.n0 n0Var;
        boolean z11 = false;
        if (this.f16354s != this.f16351p) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (z4 || this.f16357w || ((n0Var = this.B) != null && n0Var != this.f16343g)) {
                z11 = true;
            }
            return z11;
        } else if (((i0) this.f16341c.k(q())).f16335a != this.f16343g) {
            return true;
        } else {
            return v(r(this.f16354s));
        }
    }

    public final boolean v(int i10) {
        o3.j jVar = this.h;
        if (jVar != null && jVar.e() != 4) {
            if ((this.f16348m[i10] & 1073741824) != 0 || !this.h.b()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void w() {
        o3.j jVar = this.h;
        if (jVar != null && jVar.e() == 1) {
            o3.i g10 = this.h.g();
            g10.getClass();
            throw g10;
        }
    }

    public final void x(j3.n0 n0Var, f7.b bVar) {
        boolean z4;
        o3.h hVar;
        j3.n0 n0Var2;
        j3.n0 n0Var3 = this.f16343g;
        if (n0Var3 == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            hVar = null;
        } else {
            hVar = n0Var3.F;
        }
        this.f16343g = n0Var;
        o3.h hVar2 = n0Var.F;
        o3.p pVar = this.d;
        if (pVar != null) {
            int z10 = pVar.z(n0Var);
            j3.m0 a2 = n0Var.a();
            a2.J = z10;
            n0Var2 = new j3.n0(a2);
        } else {
            n0Var2 = n0Var;
        }
        bVar.f6002c = n0Var2;
        bVar.f6001b = this.h;
        if (pVar != null) {
            if (z4 || !h5.d0.a(hVar, hVar2)) {
                o3.j jVar = this.h;
                o3.m mVar = this.e;
                o3.j W1 = pVar.W1(mVar, n0Var);
                this.h = W1;
                bVar.f6001b = W1;
                if (jVar != null) {
                    jVar.c(mVar);
                }
            }
        }
    }

    public final synchronized long y() {
        boolean z4;
        long j10;
        try {
            int r10 = r(this.f16354s);
            if (this.f16354s != this.f16351p) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                j10 = this.f16345j[r10];
            } else {
                j10 = this.C;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return j10;
    }

    public final int z(f7.b bVar, n3.i iVar, int i10, boolean z4) {
        boolean z10;
        boolean z11;
        int i11;
        boolean z12 = false;
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        h0 h0Var = this.f16340b;
        synchronized (this) {
            try {
                iVar.e = false;
                if (this.f16354s != this.f16351p) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i11 = -3;
                if (!z11) {
                    if (!z4 && !this.f16357w) {
                        j3.n0 n0Var = this.B;
                        if (n0Var == null || (!z10 && n0Var == this.f16343g)) {
                        }
                        x(n0Var, bVar);
                        i11 = -5;
                    }
                    iVar.f14207b = 4;
                    i11 = -4;
                } else {
                    j3.n0 n0Var2 = ((i0) this.f16341c.k(q())).f16335a;
                    if (!z10 && n0Var2 == this.f16343g) {
                        int r10 = r(this.f16354s);
                        if (!v(r10)) {
                            iVar.e = true;
                        } else {
                            iVar.f14207b = this.f16348m[r10];
                            if (this.f16354s == this.f16351p - 1 && (z4 || this.f16357w)) {
                                iVar.a(536870912);
                            }
                            long j10 = this.f16349n[r10];
                            iVar.f14227f = j10;
                            if (j10 < this.f16355t) {
                                iVar.a(Integer.MIN_VALUE);
                            }
                            h0Var.f16330b = this.f16347l[r10];
                            h0Var.f16329a = this.f16346k[r10];
                            h0Var.f16331c = this.f16350o[r10];
                            i11 = -4;
                        }
                    }
                    x(n0Var2, bVar);
                    i11 = -5;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i11 == -4 && !iVar.d(4)) {
            if ((i10 & 1) != 0) {
                z12 = true;
            }
            if ((i10 & 4) == 0) {
                if (z12) {
                    g0 g0Var = this.f16339a;
                    g0.f((a4.c) g0Var.f16326f, iVar, this.f16340b, (h5.w) g0Var.d);
                } else {
                    g0 g0Var2 = this.f16339a;
                    g0Var2.f16326f = g0.f((a4.c) g0Var2.f16326f, iVar, this.f16340b, (h5.w) g0Var2.d);
                }
            }
            if (!z12) {
                this.f16354s++;
            }
        }
        return i11;
    }
}
