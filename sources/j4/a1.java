package j4;

import android.util.SparseArray;
import java.io.EOFException;
public class a1 implements m3.w {
    public h3.t0 A;
    public h3.t0 B;
    public int C;
    public boolean D;
    public boolean E;
    public long F;
    public boolean G;
    public final w0 f13403a;
    public final l3.i d;
    public final a6.a f13406e;
    public Object f13407f;
    public h3.t0 f13408g;
    public l3.e h;
    public int f13416p;
    public int f13417q;
    public int f13418r;
    public int f13419s;
    public boolean f13422w;
    public boolean f13425z;
    public final x0 f13404b = new Object();
    public int f13409i = 1000;
    public int[] f13410j = new int[1000];
    public long[] f13411k = new long[1000];
    public long[] f13414n = new long[1000];
    public int[] f13413m = new int[1000];
    public int[] f13412l = new int[1000];
    public m3.v[] f13415o = new m3.v[1000];
    public final a6.a f13405c = new a6.a(new ih.e(3));
    public long f13420t = Long.MIN_VALUE;
    public long f13421u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean f13424y = true;
    public boolean f13423x = true;

    public a1(com.google.android.exoplayer2.upstream.r rVar, l3.i iVar, a6.a aVar) {
        this.d = iVar;
        this.f13406e = aVar;
        this.f13403a = new w0(rVar);
    }

    public final void A(boolean z10) {
        boolean z11;
        w0 w0Var = this.f13403a;
        w0Var.a((v0) w0Var.f13595e);
        v0 v0Var = (v0) w0Var.f13595e;
        int i9 = w0Var.f13592a;
        if (((com.google.android.exoplayer2.upstream.a) v0Var.f13590c) == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        d5.a.i(z11);
        v0Var.f13588a = 0L;
        v0Var.f13589b = i9;
        v0 v0Var2 = (v0) w0Var.f13595e;
        w0Var.f13596f = v0Var2;
        w0Var.f13597g = v0Var2;
        w0Var.f13593b = 0L;
        ((com.google.android.exoplayer2.upstream.r) w0Var.f13594c).b();
        this.f13416p = 0;
        this.f13417q = 0;
        this.f13418r = 0;
        this.f13419s = 0;
        this.f13423x = true;
        this.f13420t = Long.MIN_VALUE;
        this.f13421u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.f13422w = false;
        a6.a aVar = this.f13405c;
        SparseArray sparseArray = (SparseArray) aVar.f101b;
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            ((ih.e) aVar.d).accept(sparseArray.valueAt(i10));
        }
        aVar.f102c = -1;
        sparseArray.clear();
        if (z10) {
            this.A = null;
            this.B = null;
            this.f13424y = true;
        }
    }

    public final synchronized void B() {
        this.f13419s = 0;
        w0 w0Var = this.f13403a;
        w0Var.f13596f = (v0) w0Var.f13595e;
    }

    public final int C(com.google.android.exoplayer2.upstream.j jVar, int i9, boolean z10) {
        w0 w0Var = this.f13403a;
        int c10 = w0Var.c(i9);
        v0 v0Var = (v0) w0Var.f13597g;
        com.google.android.exoplayer2.upstream.a aVar = (com.google.android.exoplayer2.upstream.a) v0Var.f13590c;
        int read = jVar.read(aVar.f2520a, ((int) (w0Var.f13593b - v0Var.f13588a)) + aVar.f2521b, c10);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j10 = w0Var.f13593b + read;
        w0Var.f13593b = j10;
        v0 v0Var2 = (v0) w0Var.f13597g;
        if (j10 == v0Var2.f13589b) {
            w0Var.f13597g = (v0) v0Var2.d;
        }
        return read;
    }

    public final synchronized boolean D(long j10, boolean z10) {
        boolean z11;
        try {
            try {
                B();
                int r10 = r(this.f13419s);
                int i9 = this.f13419s;
                int i10 = this.f13416p;
                if (i9 != i10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 && j10 >= this.f13414n[r10]) {
                    if (j10 <= this.v || z10) {
                        int l10 = l(j10, r10, i10 - i9, true);
                        if (l10 == -1) {
                            return false;
                        }
                        this.f13420t = j10;
                        this.f13419s += l10;
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void E(int i9) {
        boolean z10;
        if (i9 >= 0) {
            try {
                if (this.f13419s + i9 <= this.f13416p) {
                    z10 = true;
                    d5.a.f(z10);
                    this.f13419s += i9;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z10 = false;
        d5.a.f(z10);
        this.f13419s += i9;
    }

    @Override
    public final void a(int i9, d5.y yVar) {
        d(i9, yVar);
    }

    @Override
    public final int b(com.google.android.exoplayer2.upstream.j jVar, int i9, boolean z10) {
        return C(jVar, i9, z10);
    }

    @Override
    public final void c(h3.t0 r6) {
        throw new UnsupportedOperationException("Method not decompiled: j4.a1.c(h3.t0):void");
    }

    @Override
    public final void d(int i9, d5.y yVar) {
        while (true) {
            w0 w0Var = this.f13403a;
            if (i9 > 0) {
                int c10 = w0Var.c(i9);
                v0 v0Var = (v0) w0Var.f13597g;
                com.google.android.exoplayer2.upstream.a aVar = (com.google.android.exoplayer2.upstream.a) v0Var.f13590c;
                yVar.c(((int) (w0Var.f13593b - v0Var.f13588a)) + aVar.f2521b, c10, aVar.f2520a);
                i9 -= c10;
                long j10 = w0Var.f13593b + c10;
                w0Var.f13593b = j10;
                v0 v0Var2 = (v0) w0Var.f13597g;
                if (j10 == v0Var2.f13589b) {
                    w0Var.f13597g = (v0) v0Var2.d;
                }
            } else {
                w0Var.getClass();
                return;
            }
        }
    }

    @Override
    public void e(long r14, int r16, int r17, int r18, m3.v r19) {
        throw new UnsupportedOperationException("Method not decompiled: j4.a1.e(long, int, int, int, m3.v):void");
    }

    public final synchronized void f(long r9, int r11, long r12, int r14, m3.v r15) {
        throw new UnsupportedOperationException("Method not decompiled: j4.a1.f(long, int, long, int, m3.v):void");
    }

    public final long g(int i9) {
        int i10;
        this.f13421u = Math.max(this.f13421u, p(i9));
        this.f13416p -= i9;
        int i11 = this.f13417q + i9;
        this.f13417q = i11;
        int i12 = this.f13418r + i9;
        this.f13418r = i12;
        int i13 = this.f13409i;
        if (i12 >= i13) {
            this.f13418r = i12 - i13;
        }
        int i14 = this.f13419s - i9;
        this.f13419s = i14;
        int i15 = 0;
        if (i14 < 0) {
            this.f13419s = 0;
        }
        a6.a aVar = this.f13405c;
        SparseArray sparseArray = (SparseArray) aVar.f101b;
        while (i15 < sparseArray.size() - 1) {
            int i16 = i15 + 1;
            if (i11 < sparseArray.keyAt(i16)) {
                break;
            }
            ((ih.e) aVar.d).accept(sparseArray.valueAt(i15));
            sparseArray.removeAt(i15);
            int i17 = aVar.f102c;
            if (i17 > 0) {
                aVar.f102c = i17 - 1;
            }
            i15 = i16;
        }
        if (this.f13416p == 0) {
            int i18 = this.f13418r;
            if (i18 == 0) {
                i18 = this.f13409i;
            }
            return this.f13411k[i18 - 1] + this.f13412l[i10];
        }
        return this.f13411k[this.f13418r];
    }

    public final void h(long j10, boolean z10) {
        Throwable th;
        w0 w0Var = this.f13403a;
        synchronized (this) {
            try {
                try {
                    int i9 = this.f13416p;
                    long j11 = -1;
                    if (i9 != 0) {
                        long[] jArr = this.f13414n;
                        int i10 = this.f13418r;
                        if (j10 >= jArr[i10]) {
                            if (z10) {
                                try {
                                    int i11 = this.f13419s;
                                    if (i11 != i9) {
                                        i9 = i11 + 1;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            int l10 = l(j10, i10, i9, false);
                            if (l10 != -1) {
                                j11 = g(l10);
                            }
                            w0Var.b(j11);
                        }
                    }
                    w0Var.b(j11);
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }

    public final void i() {
        long g10;
        w0 w0Var = this.f13403a;
        synchronized (this) {
            int i9 = this.f13416p;
            if (i9 == 0) {
                g10 = -1;
            } else {
                g10 = g(i9);
            }
        }
        w0Var.b(g10);
    }

    public final long j(int i9) {
        boolean z10;
        int i10;
        int r10;
        int i11 = this.f13417q;
        int i12 = this.f13416p;
        int i13 = (i11 + i12) - i9;
        boolean z11 = false;
        if (i13 >= 0 && i13 <= i12 - this.f13419s) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.f(z10);
        int i14 = this.f13416p - i13;
        this.f13416p = i14;
        this.v = Math.max(this.f13421u, p(i14));
        if (i13 == 0 && this.f13422w) {
            z11 = true;
        }
        this.f13422w = z11;
        a6.a aVar = this.f13405c;
        SparseArray sparseArray = (SparseArray) aVar.f101b;
        for (int size = sparseArray.size() - 1; size >= 0 && i9 < sparseArray.keyAt(size); size--) {
            ((ih.e) aVar.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        if (sparseArray.size() > 0) {
            i10 = Math.min(aVar.f102c, sparseArray.size() - 1);
        } else {
            i10 = -1;
        }
        aVar.f102c = i10;
        int i15 = this.f13416p;
        if (i15 != 0) {
            return this.f13411k[r(i15 - 1)] + this.f13412l[r10];
        }
        return 0L;
    }

    public final void k(int i9) {
        boolean z10;
        long j10 = j(i9);
        w0 w0Var = this.f13403a;
        int i10 = w0Var.f13592a;
        if (j10 <= w0Var.f13593b) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.f(z10);
        w0Var.f13593b = j10;
        if (j10 != 0) {
            v0 v0Var = (v0) w0Var.f13595e;
            if (j10 != v0Var.f13588a) {
                while (w0Var.f13593b > v0Var.f13589b) {
                    v0Var = (v0) v0Var.d;
                }
                v0 v0Var2 = (v0) v0Var.d;
                v0Var2.getClass();
                w0Var.a(v0Var2);
                v0 v0Var3 = new v0(v0Var.f13589b, i10);
                v0Var.d = v0Var3;
                if (w0Var.f13593b == v0Var.f13589b) {
                    v0Var = v0Var3;
                }
                w0Var.f13597g = v0Var;
                if (((v0) w0Var.f13596f) == v0Var2) {
                    w0Var.f13596f = v0Var3;
                    return;
                }
                return;
            }
        }
        w0Var.a((v0) w0Var.f13595e);
        v0 v0Var4 = new v0(w0Var.f13593b, i10);
        w0Var.f13595e = v0Var4;
        w0Var.f13596f = v0Var4;
        w0Var.f13597g = v0Var4;
    }

    public final int l(long j10, int i9, int i10, boolean z10) {
        int i11 = -1;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = (this.f13414n[i9] > j10 ? 1 : (this.f13414n[i9] == j10 ? 0 : -1));
            if (i13 > 0) {
                break;
            }
            if (!z10 || (this.f13413m[i9] & 1) != 0) {
                if (i13 == 0) {
                    return i12;
                }
                i11 = i12;
            }
            i9++;
            if (i9 == this.f13409i) {
                i9 = 0;
            }
        }
        return i11;
    }

    public h3.t0 m(h3.t0 t0Var) {
        if (this.F != 0 && t0Var.F != Long.MAX_VALUE) {
            h3.s0 a2 = t0Var.a();
            a2.f9709s = t0Var.F + this.F;
            return new h3.t0(a2);
        }
        return t0Var;
    }

    public final synchronized long n() {
        return this.v;
    }

    public final synchronized long o() {
        return Math.max(this.f13421u, p(this.f13419s));
    }

    public final long p(int i9) {
        long j10 = Long.MIN_VALUE;
        if (i9 == 0) {
            return Long.MIN_VALUE;
        }
        int r10 = r(i9 - 1);
        for (int i10 = 0; i10 < i9; i10++) {
            j10 = Math.max(j10, this.f13414n[r10]);
            if ((this.f13413m[r10] & 1) != 0) {
                return j10;
            }
            r10--;
            if (r10 == -1) {
                r10 = this.f13409i - 1;
            }
        }
        return j10;
    }

    public final int q() {
        return this.f13417q + this.f13419s;
    }

    public final int r(int i9) {
        int i10 = this.f13418r + i9;
        int i11 = this.f13409i;
        if (i10 < i11) {
            return i10;
        }
        return i10 - i11;
    }

    public final synchronized int s(long j10, boolean z10) {
        boolean z11;
        try {
            try {
                int r10 = r(this.f13419s);
                int i9 = this.f13419s;
                int i10 = this.f13416p;
                if (i9 != i10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 || j10 < this.f13414n[r10]) {
                    return 0;
                }
                if (j10 > this.v && z10) {
                    return i10 - i9;
                }
                int l10 = l(j10, r10, i10 - i9, true);
                if (l10 == -1) {
                    return 0;
                }
                return l10;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized h3.t0 t() {
        h3.t0 t0Var;
        if (this.f13424y) {
            t0Var = null;
        } else {
            t0Var = this.B;
        }
        return t0Var;
    }

    public final synchronized boolean u(boolean z10) {
        boolean z11;
        h3.t0 t0Var;
        boolean z12 = false;
        if (this.f13419s != this.f13416p) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            if (z10 || this.f13422w || ((t0Var = this.B) != null && t0Var != this.f13408g)) {
                z12 = true;
            }
            return z12;
        } else if (((y0) this.f13405c.g(q())).f13615a != this.f13408g) {
            return true;
        } else {
            return v(r(this.f13419s));
        }
    }

    public final boolean v(int i9) {
        l3.e eVar = this.h;
        if (eVar != null && eVar.j() != 4) {
            if ((this.f13413m[i9] & 1073741824) != 0 || !this.h.d()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void w() {
        l3.e eVar = this.h;
        if (eVar != null && eVar.j() == 1) {
            l3.d x10 = this.h.x();
            x10.getClass();
            throw x10;
        }
    }

    public final void x(h3.t0 t0Var, h3.u0 u0Var) {
        boolean z10;
        l3.c cVar;
        h3.t0 t0Var2;
        h3.t0 t0Var3 = this.f13408g;
        if (t0Var3 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            cVar = null;
        } else {
            cVar = t0Var3.E;
        }
        this.f13408g = t0Var;
        l3.c cVar2 = t0Var.E;
        l3.i iVar = this.d;
        if (iVar != null) {
            int G = iVar.G(t0Var);
            h3.s0 a2 = t0Var.a();
            a2.J = G;
            t0Var2 = new h3.t0(a2);
        } else {
            t0Var2 = t0Var;
        }
        u0Var.f9778b = t0Var2;
        u0Var.f9777a = this.h;
        if (iVar != null) {
            if (z10 || !d5.f0.a(cVar, cVar2)) {
                l3.e eVar = this.h;
                a6.a aVar = this.f13406e;
                l3.e n10 = iVar.n(aVar, t0Var);
                this.h = n10;
                u0Var.f9777a = n10;
                if (eVar != null) {
                    eVar.k(aVar);
                }
            }
        }
    }

    public final synchronized int y() {
        boolean z10;
        int i9;
        try {
            int r10 = r(this.f13419s);
            if (this.f13419s != this.f13416p) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i9 = this.f13410j[r10];
            } else {
                i9 = this.C;
            }
        } catch (Throwable th) {
            throw th;
        }
        return i9;
    }

    public final int z(h3.u0 u0Var, k3.i iVar, int i9, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        boolean z13 = false;
        if ((i9 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        x0 x0Var = this.f13404b;
        synchronized (this) {
            try {
                iVar.f14609c = false;
                if (this.f13419s != this.f13416p) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i10 = -3;
                if (!z12) {
                    if (!z10 && !this.f13422w) {
                        h3.t0 t0Var = this.B;
                        if (t0Var == null || (!z11 && t0Var == this.f13408g)) {
                        }
                        x(t0Var, u0Var);
                        i10 = -5;
                    }
                    iVar.setFlags(4);
                    i10 = -4;
                } else {
                    h3.t0 t0Var2 = ((y0) this.f13405c.g(q())).f13615a;
                    if (!z11 && t0Var2 == this.f13408g) {
                        int r10 = r(this.f13419s);
                        if (!v(r10)) {
                            iVar.f14609c = true;
                        } else {
                            iVar.setFlags(this.f13413m[r10]);
                            long j10 = this.f13414n[r10];
                            iVar.d = j10;
                            if (j10 < this.f13420t) {
                                iVar.addFlag(Integer.MIN_VALUE);
                            }
                            x0Var.f13607b = this.f13412l[r10];
                            x0Var.f13606a = this.f13411k[r10];
                            x0Var.f13608c = this.f13415o[r10];
                            i10 = -4;
                        }
                    }
                    x(t0Var2, u0Var);
                    i10 = -5;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i10 == -4 && !iVar.isEndOfStream()) {
            if ((i9 & 1) != 0) {
                z13 = true;
            }
            if ((i9 & 4) == 0) {
                if (z13) {
                    w0 w0Var = this.f13403a;
                    w0.f((v0) w0Var.f13596f, iVar, this.f13404b, (d5.y) w0Var.d);
                } else {
                    w0 w0Var2 = this.f13403a;
                    w0Var2.f13596f = w0.f((v0) w0Var2.f13596f, iVar, this.f13404b, (d5.y) w0Var2.d);
                }
            }
            if (!z13) {
                this.f13419s++;
            }
        }
        return i10;
    }
}
