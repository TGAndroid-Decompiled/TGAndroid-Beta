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
    public final g0 f16357a;
    public final o3.o d;
    public final o3.l e;
    public Object f16360f;
    public j3.n0 f16361g;
    public o3.i h;
    public int f16369p;
    public int f16370q;
    public int f16371r;
    public int f16372s;
    public boolean f16375w;
    public boolean f16378z;
    public final h0 f16358b = new Object();
    public int f16362i = 1000;
    public long[] f16363j = new long[1000];
    public long[] f16364k = new long[1000];
    public long[] f16367n = new long[1000];
    public int[] f16366m = new int[1000];
    public int[] f16365l = new int[1000];
    public r3.u[] f16368o = new r3.u[1000];
    public final b4.e0 f16359c = new b4.e0(new nh.e(4));
    public long f16373t = Long.MIN_VALUE;
    public long f16374u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean f16377y = true;
    public boolean f16376x = true;

    public k0(g5.q qVar, o3.o oVar, o3.l lVar) {
        this.d = oVar;
        this.e = lVar;
        this.f16357a = new g0(qVar);
    }

    public final void A(boolean z4) {
        boolean z10;
        g0 g0Var = this.f16357a;
        g0Var.a((a4.c) g0Var.e);
        a4.c cVar = (a4.c) g0Var.e;
        int i10 = g0Var.f16341a;
        if (((g5.a) cVar.f58c) == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        h5.a.i(z10);
        cVar.f56a = 0L;
        cVar.f57b = i10;
        a4.c cVar2 = (a4.c) g0Var.e;
        g0Var.f16344f = cVar2;
        g0Var.f16345g = cVar2;
        g0Var.f16342b = 0L;
        ((g5.q) g0Var.f16343c).b();
        this.f16369p = 0;
        this.f16370q = 0;
        this.f16371r = 0;
        this.f16372s = 0;
        this.f16376x = true;
        this.f16373t = Long.MIN_VALUE;
        this.f16374u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.f16375w = false;
        b4.e0 e0Var = this.f16359c;
        SparseArray sparseArray = (SparseArray) e0Var.f1368c;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            ((nh.e) e0Var.d).accept(sparseArray.valueAt(i11));
        }
        e0Var.f1367b = -1;
        sparseArray.clear();
        if (z4) {
            this.A = null;
            this.B = null;
            this.f16377y = true;
        }
    }

    public final synchronized void B() {
        this.f16372s = 0;
        g0 g0Var = this.f16357a;
        g0Var.f16344f = (a4.c) g0Var.e;
    }

    public final int C(g5.j jVar, int i10, boolean z4) {
        g0 g0Var = this.f16357a;
        int c3 = g0Var.c(i10);
        a4.c cVar = (a4.c) g0Var.f16345g;
        g5.a aVar = (g5.a) cVar.f58c;
        int read = jVar.read(aVar.f6357a, ((int) (g0Var.f16342b - cVar.f56a)) + aVar.f6358b, c3);
        if (read == -1) {
            if (z4) {
                return -1;
            }
            throw new EOFException();
        }
        long j10 = g0Var.f16342b + read;
        g0Var.f16342b = j10;
        a4.c cVar2 = (a4.c) g0Var.f16345g;
        if (j10 == cVar2.f57b) {
            g0Var.f16345g = (a4.c) cVar2.d;
        }
        return read;
    }

    public final synchronized boolean D(long j10, boolean z4) {
        boolean z10;
        try {
            try {
                B();
                int r10 = r(this.f16372s);
                int i10 = this.f16372s;
                int i11 = this.f16369p;
                if (i10 != i11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && j10 >= this.f16367n[r10]) {
                    if (j10 <= this.v || z4) {
                        int l10 = l(j10, r10, i11 - i10, true);
                        if (l10 == -1) {
                            return false;
                        }
                        this.f16373t = j10;
                        this.f16372s += l10;
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
                if (this.f16372s + i10 <= this.f16369p) {
                    z4 = true;
                    h5.a.f(z4);
                    this.f16372s += i10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z4 = false;
        h5.a.f(z4);
        this.f16372s += i10;
    }

    @Override
    public final void a(int i10, h5.w wVar) {
        while (true) {
            g0 g0Var = this.f16357a;
            if (i10 > 0) {
                int c3 = g0Var.c(i10);
                a4.c cVar = (a4.c) g0Var.f16345g;
                g5.a aVar = (g5.a) cVar.f58c;
                wVar.e(((int) (g0Var.f16342b - cVar.f56a)) + aVar.f6358b, c3, aVar.f6357a);
                i10 -= c3;
                long j10 = g0Var.f16342b + c3;
                g0Var.f16342b = j10;
                a4.c cVar2 = (a4.c) g0Var.f16345g;
                if (j10 == cVar2.f57b) {
                    g0Var.f16345g = (a4.c) cVar2.d;
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
        this.f16374u = Math.max(this.f16374u, p(i10));
        this.f16369p -= i10;
        int i12 = this.f16370q + i10;
        this.f16370q = i12;
        int i13 = this.f16371r + i10;
        this.f16371r = i13;
        int i14 = this.f16362i;
        if (i13 >= i14) {
            this.f16371r = i13 - i14;
        }
        int i15 = this.f16372s - i10;
        this.f16372s = i15;
        int i16 = 0;
        if (i15 < 0) {
            this.f16372s = 0;
        }
        b4.e0 e0Var = this.f16359c;
        SparseArray sparseArray = (SparseArray) e0Var.f1368c;
        while (i16 < sparseArray.size() - 1) {
            int i17 = i16 + 1;
            if (i12 < sparseArray.keyAt(i17)) {
                break;
            }
            ((nh.e) e0Var.d).accept(sparseArray.valueAt(i16));
            sparseArray.removeAt(i16);
            int i18 = e0Var.f1367b;
            if (i18 > 0) {
                e0Var.f1367b = i18 - 1;
            }
            i16 = i17;
        }
        if (this.f16369p == 0) {
            int i19 = this.f16371r;
            if (i19 == 0) {
                i19 = this.f16362i;
            }
            return this.f16364k[i19 - 1] + this.f16365l[i11];
        }
        return this.f16364k[this.f16371r];
    }

    public final void h(long j10, boolean z4) {
        Throwable th2;
        g0 g0Var = this.f16357a;
        synchronized (this) {
            try {
                try {
                    int i10 = this.f16369p;
                    long j11 = -1;
                    if (i10 != 0) {
                        long[] jArr = this.f16367n;
                        int i11 = this.f16371r;
                        if (j10 >= jArr[i11]) {
                            if (z4) {
                                try {
                                    int i12 = this.f16372s;
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
        g0 g0Var = this.f16357a;
        synchronized (this) {
            int i10 = this.f16369p;
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
        int i12 = this.f16370q;
        int i13 = this.f16369p;
        int i14 = (i12 + i13) - i10;
        boolean z10 = false;
        if (i14 >= 0 && i14 <= i13 - this.f16372s) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.f(z4);
        int i15 = this.f16369p - i14;
        this.f16369p = i15;
        this.v = Math.max(this.f16374u, p(i15));
        if (i14 == 0 && this.f16375w) {
            z10 = true;
        }
        this.f16375w = z10;
        b4.e0 e0Var = this.f16359c;
        SparseArray sparseArray = (SparseArray) e0Var.f1368c;
        for (int size = sparseArray.size() - 1; size >= 0 && i10 < sparseArray.keyAt(size); size--) {
            ((nh.e) e0Var.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        if (sparseArray.size() > 0) {
            i11 = Math.min(e0Var.f1367b, sparseArray.size() - 1);
        } else {
            i11 = -1;
        }
        e0Var.f1367b = i11;
        int i16 = this.f16369p;
        if (i16 != 0) {
            return this.f16364k[r(i16 - 1)] + this.f16365l[r10];
        }
        return 0L;
    }

    public final void k(int i10) {
        boolean z4;
        long j10 = j(i10);
        g0 g0Var = this.f16357a;
        int i11 = g0Var.f16341a;
        if (j10 <= g0Var.f16342b) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.f(z4);
        g0Var.f16342b = j10;
        if (j10 != 0) {
            a4.c cVar = (a4.c) g0Var.e;
            if (j10 != cVar.f56a) {
                while (g0Var.f16342b > cVar.f57b) {
                    cVar = (a4.c) cVar.d;
                }
                a4.c cVar2 = (a4.c) cVar.d;
                cVar2.getClass();
                g0Var.a(cVar2);
                a4.c cVar3 = new a4.c(cVar.f57b, i11);
                cVar.d = cVar3;
                if (g0Var.f16342b == cVar.f57b) {
                    cVar = cVar3;
                }
                g0Var.f16345g = cVar;
                if (((a4.c) g0Var.f16344f) == cVar2) {
                    g0Var.f16344f = cVar3;
                    return;
                }
                return;
            }
        }
        g0Var.a((a4.c) g0Var.e);
        a4.c cVar4 = new a4.c(g0Var.f16342b, i11);
        g0Var.e = cVar4;
        g0Var.f16344f = cVar4;
        g0Var.f16345g = cVar4;
    }

    public final int l(long j10, int i10, int i11, boolean z4) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = (this.f16367n[i10] > j10 ? 1 : (this.f16367n[i10] == j10 ? 0 : -1));
            if (i14 > 0) {
                break;
            }
            if (!z4 || (this.f16366m[i10] & 1) != 0) {
                if (i14 == 0) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f16362i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public j3.n0 m(j3.n0 n0Var) {
        if (this.F != 0 && n0Var.G != Long.MAX_VALUE) {
            j3.m0 a2 = n0Var.a();
            a2.f8688s = n0Var.G + this.F;
            return new j3.n0(a2);
        }
        return n0Var;
    }

    public final synchronized long n() {
        return this.v;
    }

    public final synchronized long o() {
        return Math.max(this.f16374u, p(this.f16372s));
    }

    public final long p(int i10) {
        long j10 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int r10 = r(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.f16367n[r10]);
            if ((this.f16366m[r10] & 1) != 0) {
                return j10;
            }
            r10--;
            if (r10 == -1) {
                r10 = this.f16362i - 1;
            }
        }
        return j10;
    }

    public final int q() {
        return this.f16370q + this.f16372s;
    }

    public final int r(int i10) {
        int i11 = this.f16371r + i10;
        int i12 = this.f16362i;
        if (i11 < i12) {
            return i11;
        }
        return i11 - i12;
    }

    public final synchronized int s(long j10, boolean z4) {
        boolean z10;
        try {
            try {
                int r10 = r(this.f16372s);
                int i10 = this.f16372s;
                int i11 = this.f16369p;
                if (i10 != i11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 || j10 < this.f16367n[r10]) {
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
        if (this.f16377y) {
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
        if (this.f16372s != this.f16369p) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (z4 || this.f16375w || ((n0Var = this.B) != null && n0Var != this.f16361g)) {
                z11 = true;
            }
            return z11;
        } else if (((i0) this.f16359c.j(q())).f16353a != this.f16361g) {
            return true;
        } else {
            return v(r(this.f16372s));
        }
    }

    public final boolean v(int i10) {
        o3.i iVar = this.h;
        if (iVar != null && iVar.e() != 4) {
            if ((this.f16366m[i10] & 1073741824) != 0 || !this.h.b()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void w() {
        o3.i iVar = this.h;
        if (iVar != null && iVar.e() == 1) {
            o3.h g10 = this.h.g();
            g10.getClass();
            throw g10;
        }
    }

    public final void x(j3.n0 n0Var, f7.b bVar) {
        boolean z4;
        o3.g gVar;
        j3.n0 n0Var2;
        j3.n0 n0Var3 = this.f16361g;
        if (n0Var3 == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            gVar = null;
        } else {
            gVar = n0Var3.F;
        }
        this.f16361g = n0Var;
        o3.g gVar2 = n0Var.F;
        o3.o oVar = this.d;
        if (oVar != null) {
            int b10 = oVar.b(n0Var);
            j3.m0 a2 = n0Var.a();
            a2.J = b10;
            n0Var2 = new j3.n0(a2);
        } else {
            n0Var2 = n0Var;
        }
        bVar.f6013c = n0Var2;
        bVar.f6012b = this.h;
        if (oVar != null) {
            if (z4 || !h5.d0.a(gVar, gVar2)) {
                o3.i iVar = this.h;
                o3.l lVar = this.e;
                o3.i J = oVar.J(lVar, n0Var);
                this.h = J;
                bVar.f6012b = J;
                if (iVar != null) {
                    iVar.c(lVar);
                }
            }
        }
    }

    public final synchronized long y() {
        boolean z4;
        long j10;
        try {
            int r10 = r(this.f16372s);
            if (this.f16372s != this.f16369p) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                j10 = this.f16363j[r10];
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
        h0 h0Var = this.f16358b;
        synchronized (this) {
            try {
                iVar.e = false;
                if (this.f16372s != this.f16369p) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i11 = -3;
                if (!z11) {
                    if (!z4 && !this.f16375w) {
                        j3.n0 n0Var = this.B;
                        if (n0Var == null || (!z10 && n0Var == this.f16361g)) {
                        }
                        x(n0Var, bVar);
                        i11 = -5;
                    }
                    iVar.f14222b = 4;
                    i11 = -4;
                } else {
                    j3.n0 n0Var2 = ((i0) this.f16359c.j(q())).f16353a;
                    if (!z10 && n0Var2 == this.f16361g) {
                        int r10 = r(this.f16372s);
                        if (!v(r10)) {
                            iVar.e = true;
                        } else {
                            iVar.f14222b = this.f16366m[r10];
                            if (this.f16372s == this.f16369p - 1 && (z4 || this.f16375w)) {
                                iVar.a(536870912);
                            }
                            long j10 = this.f16367n[r10];
                            iVar.f14242f = j10;
                            if (j10 < this.f16373t) {
                                iVar.a(Integer.MIN_VALUE);
                            }
                            h0Var.f16348b = this.f16365l[r10];
                            h0Var.f16347a = this.f16364k[r10];
                            h0Var.f16349c = this.f16368o[r10];
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
        if (i11 == -4 && !iVar.e(4)) {
            if ((i10 & 1) != 0) {
                z12 = true;
            }
            if ((i10 & 4) == 0) {
                if (z12) {
                    g0 g0Var = this.f16357a;
                    g0.f((a4.c) g0Var.f16344f, iVar, this.f16358b, (h5.w) g0Var.d);
                } else {
                    g0 g0Var2 = this.f16357a;
                    g0Var2.f16344f = g0.f((a4.c) g0Var2.f16344f, iVar, this.f16358b, (h5.w) g0Var2.d);
                }
            }
            if (!z12) {
                this.f16372s++;
            }
        }
        return i11;
    }
}
