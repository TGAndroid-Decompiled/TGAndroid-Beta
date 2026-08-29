package l4;

import ag.j2;
import android.util.SparseArray;
import java.io.EOFException;
public class b1 implements o3.w {
    public j3.t0 A;
    public j3.t0 B;
    public int C;
    public boolean D;
    public boolean E;
    public long F;
    public boolean G;
    public final w0 f14266a;
    public final n3.i d;
    public final j2 f14269e;
    public Object f14270f;
    public j3.t0 f14271g;
    public n3.e h;
    public int f14279p;
    public int f14280q;
    public int f14281r;
    public int f14282s;
    public boolean f14285w;
    public boolean f14288z;
    public final y0 f14267b = new Object();
    public int f14272i = 1000;
    public int[] f14273j = new int[1000];
    public long[] f14274k = new long[1000];
    public long[] f14277n = new long[1000];
    public int[] f14276m = new int[1000];
    public int[] f14275l = new int[1000];
    public o3.v[] f14278o = new o3.v[1000];
    public final j2 f14268c = new j2(new x0(0));
    public long f14283t = Long.MIN_VALUE;
    public long f14284u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean f14287y = true;
    public boolean f14286x = true;

    public b1(com.google.android.exoplayer2.upstream.r rVar, n3.i iVar, j2 j2Var) {
        this.d = iVar;
        this.f14269e = j2Var;
        this.f14266a = new w0(rVar);
    }

    public final void A(boolean z10) {
        boolean z11;
        w0 w0Var = this.f14266a;
        w0Var.a((v0) w0Var.f14461e);
        v0 v0Var = (v0) w0Var.f14461e;
        int i10 = w0Var.f14458a;
        if (((com.google.android.exoplayer2.upstream.a) v0Var.f14449c) == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        f5.a.i(z11);
        v0Var.f14447a = 0L;
        v0Var.f14448b = i10;
        v0 v0Var2 = (v0) w0Var.f14461e;
        w0Var.f14462f = v0Var2;
        w0Var.f14463g = v0Var2;
        w0Var.f14459b = 0L;
        ((com.google.android.exoplayer2.upstream.r) w0Var.f14460c).b();
        this.f14279p = 0;
        this.f14280q = 0;
        this.f14281r = 0;
        this.f14282s = 0;
        this.f14286x = true;
        this.f14283t = Long.MIN_VALUE;
        this.f14284u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.f14285w = false;
        j2 j2Var = this.f14268c;
        SparseArray sparseArray = (SparseArray) j2Var.f559c;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            ((x0) j2Var.d).accept(sparseArray.valueAt(i11));
        }
        j2Var.f558b = -1;
        sparseArray.clear();
        if (z10) {
            this.A = null;
            this.B = null;
            this.f14287y = true;
        }
    }

    public final synchronized void B() {
        this.f14282s = 0;
        w0 w0Var = this.f14266a;
        w0Var.f14462f = (v0) w0Var.f14461e;
    }

    public final int C(com.google.android.exoplayer2.upstream.j jVar, int i10, boolean z10) {
        w0 w0Var = this.f14266a;
        int c3 = w0Var.c(i10);
        v0 v0Var = (v0) w0Var.f14463g;
        com.google.android.exoplayer2.upstream.a aVar = (com.google.android.exoplayer2.upstream.a) v0Var.f14449c;
        int read = jVar.read(aVar.f3534a, ((int) (w0Var.f14459b - v0Var.f14447a)) + aVar.f3535b, c3);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j10 = w0Var.f14459b + read;
        w0Var.f14459b = j10;
        v0 v0Var2 = (v0) w0Var.f14463g;
        if (j10 == v0Var2.f14448b) {
            w0Var.f14463g = (v0) v0Var2.d;
        }
        return read;
    }

    public final synchronized boolean D(long j10, boolean z10) {
        boolean z11;
        try {
            try {
                B();
                int r6 = r(this.f14282s);
                int i10 = this.f14282s;
                int i11 = this.f14279p;
                if (i10 != i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 && j10 >= this.f14277n[r6]) {
                    if (j10 <= this.v || z10) {
                        int l10 = l(j10, r6, i11 - i10, true);
                        if (l10 == -1) {
                            return false;
                        }
                        this.f14283t = j10;
                        this.f14282s += l10;
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
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f14282s + i10 <= this.f14279p) {
                    z10 = true;
                    f5.a.f(z10);
                    this.f14282s += i10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z10 = false;
        f5.a.f(z10);
        this.f14282s += i10;
    }

    @Override
    public final int a(com.google.android.exoplayer2.upstream.j jVar, int i10, boolean z10) {
        return C(jVar, i10, z10);
    }

    @Override
    public final void b(j3.t0 r6) {
        throw new UnsupportedOperationException("Method not decompiled: l4.b1.b(j3.t0):void");
    }

    @Override
    public void c(long r14, int r16, int r17, int r18, o3.v r19) {
        throw new UnsupportedOperationException("Method not decompiled: l4.b1.c(long, int, int, int, o3.v):void");
    }

    @Override
    public final void d(int i10, f5.w wVar) {
        while (true) {
            w0 w0Var = this.f14266a;
            if (i10 > 0) {
                int c3 = w0Var.c(i10);
                v0 v0Var = (v0) w0Var.f14463g;
                com.google.android.exoplayer2.upstream.a aVar = (com.google.android.exoplayer2.upstream.a) v0Var.f14449c;
                wVar.c(((int) (w0Var.f14459b - v0Var.f14447a)) + aVar.f3535b, c3, aVar.f3534a);
                i10 -= c3;
                long j10 = w0Var.f14459b + c3;
                w0Var.f14459b = j10;
                v0 v0Var2 = (v0) w0Var.f14463g;
                if (j10 == v0Var2.f14448b) {
                    w0Var.f14463g = (v0) v0Var2.d;
                }
            } else {
                w0Var.getClass();
                return;
            }
        }
    }

    @Override
    public final void e(int i10, f5.w wVar) {
        d(i10, wVar);
    }

    public final synchronized void f(long r9, int r11, long r12, int r14, o3.v r15) {
        throw new UnsupportedOperationException("Method not decompiled: l4.b1.f(long, int, long, int, o3.v):void");
    }

    public final long g(int i10) {
        int i11;
        this.f14284u = Math.max(this.f14284u, p(i10));
        this.f14279p -= i10;
        int i12 = this.f14280q + i10;
        this.f14280q = i12;
        int i13 = this.f14281r + i10;
        this.f14281r = i13;
        int i14 = this.f14272i;
        if (i13 >= i14) {
            this.f14281r = i13 - i14;
        }
        int i15 = this.f14282s - i10;
        this.f14282s = i15;
        int i16 = 0;
        if (i15 < 0) {
            this.f14282s = 0;
        }
        j2 j2Var = this.f14268c;
        SparseArray sparseArray = (SparseArray) j2Var.f559c;
        while (i16 < sparseArray.size() - 1) {
            int i17 = i16 + 1;
            if (i12 < sparseArray.keyAt(i17)) {
                break;
            }
            ((x0) j2Var.d).accept(sparseArray.valueAt(i16));
            sparseArray.removeAt(i16);
            int i18 = j2Var.f558b;
            if (i18 > 0) {
                j2Var.f558b = i18 - 1;
            }
            i16 = i17;
        }
        if (this.f14279p == 0) {
            int i19 = this.f14281r;
            if (i19 == 0) {
                i19 = this.f14272i;
            }
            return this.f14274k[i19 - 1] + this.f14275l[i11];
        }
        return this.f14274k[this.f14281r];
    }

    public final void h(long j10, boolean z10) {
        Throwable th2;
        w0 w0Var = this.f14266a;
        synchronized (this) {
            try {
                try {
                    int i10 = this.f14279p;
                    long j11 = -1;
                    if (i10 != 0) {
                        long[] jArr = this.f14277n;
                        int i11 = this.f14281r;
                        if (j10 >= jArr[i11]) {
                            if (z10) {
                                try {
                                    int i12 = this.f14282s;
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
                            w0Var.b(j11);
                        }
                    }
                    w0Var.b(j11);
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
        w0 w0Var = this.f14266a;
        synchronized (this) {
            int i10 = this.f14279p;
            if (i10 == 0) {
                g10 = -1;
            } else {
                g10 = g(i10);
            }
        }
        w0Var.b(g10);
    }

    public final long j(int i10) {
        boolean z10;
        int i11;
        int r6;
        int i12 = this.f14280q;
        int i13 = this.f14279p;
        int i14 = (i12 + i13) - i10;
        boolean z11 = false;
        if (i14 >= 0 && i14 <= i13 - this.f14282s) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.f(z10);
        int i15 = this.f14279p - i14;
        this.f14279p = i15;
        this.v = Math.max(this.f14284u, p(i15));
        if (i14 == 0 && this.f14285w) {
            z11 = true;
        }
        this.f14285w = z11;
        j2 j2Var = this.f14268c;
        SparseArray sparseArray = (SparseArray) j2Var.f559c;
        for (int size = sparseArray.size() - 1; size >= 0 && i10 < sparseArray.keyAt(size); size--) {
            ((x0) j2Var.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        if (sparseArray.size() > 0) {
            i11 = Math.min(j2Var.f558b, sparseArray.size() - 1);
        } else {
            i11 = -1;
        }
        j2Var.f558b = i11;
        int i16 = this.f14279p;
        if (i16 != 0) {
            return this.f14274k[r(i16 - 1)] + this.f14275l[r6];
        }
        return 0L;
    }

    public final void k(int i10) {
        boolean z10;
        long j10 = j(i10);
        w0 w0Var = this.f14266a;
        int i11 = w0Var.f14458a;
        if (j10 <= w0Var.f14459b) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.f(z10);
        w0Var.f14459b = j10;
        if (j10 != 0) {
            v0 v0Var = (v0) w0Var.f14461e;
            if (j10 != v0Var.f14447a) {
                while (w0Var.f14459b > v0Var.f14448b) {
                    v0Var = (v0) v0Var.d;
                }
                v0 v0Var2 = (v0) v0Var.d;
                v0Var2.getClass();
                w0Var.a(v0Var2);
                v0 v0Var3 = new v0(v0Var.f14448b, i11);
                v0Var.d = v0Var3;
                if (w0Var.f14459b == v0Var.f14448b) {
                    v0Var = v0Var3;
                }
                w0Var.f14463g = v0Var;
                if (((v0) w0Var.f14462f) == v0Var2) {
                    w0Var.f14462f = v0Var3;
                    return;
                }
                return;
            }
        }
        w0Var.a((v0) w0Var.f14461e);
        v0 v0Var4 = new v0(w0Var.f14459b, i11);
        w0Var.f14461e = v0Var4;
        w0Var.f14462f = v0Var4;
        w0Var.f14463g = v0Var4;
    }

    public final int l(long j10, int i10, int i11, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = (this.f14277n[i10] > j10 ? 1 : (this.f14277n[i10] == j10 ? 0 : -1));
            if (i14 > 0) {
                break;
            }
            if (!z10 || (this.f14276m[i10] & 1) != 0) {
                if (i14 == 0) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f14272i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public j3.t0 m(j3.t0 t0Var) {
        if (this.F != 0 && t0Var.F != Long.MAX_VALUE) {
            j3.s0 a2 = t0Var.a();
            a2.f10746s = t0Var.F + this.F;
            return new j3.t0(a2);
        }
        return t0Var;
    }

    public final synchronized long n() {
        return this.v;
    }

    public final synchronized long o() {
        return Math.max(this.f14284u, p(this.f14282s));
    }

    public final long p(int i10) {
        long j10 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int r6 = r(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.f14277n[r6]);
            if ((this.f14276m[r6] & 1) != 0) {
                return j10;
            }
            r6--;
            if (r6 == -1) {
                r6 = this.f14272i - 1;
            }
        }
        return j10;
    }

    public final int q() {
        return this.f14280q + this.f14282s;
    }

    public final int r(int i10) {
        int i11 = this.f14281r + i10;
        int i12 = this.f14272i;
        if (i11 < i12) {
            return i11;
        }
        return i11 - i12;
    }

    public final synchronized int s(long j10, boolean z10) {
        boolean z11;
        try {
            try {
                int r6 = r(this.f14282s);
                int i10 = this.f14282s;
                int i11 = this.f14279p;
                if (i10 != i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 || j10 < this.f14277n[r6]) {
                    return 0;
                }
                if (j10 > this.v && z10) {
                    return i11 - i10;
                }
                int l10 = l(j10, r6, i11 - i10, true);
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

    public final synchronized j3.t0 t() {
        j3.t0 t0Var;
        if (this.f14287y) {
            t0Var = null;
        } else {
            t0Var = this.B;
        }
        return t0Var;
    }

    public final synchronized boolean u(boolean z10) {
        boolean z11;
        j3.t0 t0Var;
        boolean z12 = false;
        if (this.f14282s != this.f14279p) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            if (z10 || this.f14285w || ((t0Var = this.B) != null && t0Var != this.f14271g)) {
                z12 = true;
            }
            return z12;
        } else if (((z0) this.f14268c.i(q())).f14474a != this.f14271g) {
            return true;
        } else {
            return v(r(this.f14282s));
        }
    }

    public final boolean v(int i10) {
        n3.e eVar = this.h;
        if (eVar != null && eVar.t() != 4) {
            if ((this.f14276m[i10] & 1073741824) != 0 || !this.h.r()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void w() {
        n3.e eVar = this.h;
        if (eVar != null && eVar.t() == 1) {
            n3.d D = this.h.D();
            D.getClass();
            throw D;
        }
    }

    public final void x(j3.t0 t0Var, j3.u0 u0Var) {
        boolean z10;
        n3.c cVar;
        j3.t0 t0Var2;
        j3.t0 t0Var3 = this.f14271g;
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
        this.f14271g = t0Var;
        n3.c cVar2 = t0Var.E;
        n3.i iVar = this.d;
        if (iVar != null) {
            int b10 = iVar.b(t0Var);
            j3.s0 a2 = t0Var.a();
            a2.J = b10;
            t0Var2 = new j3.t0(a2);
        } else {
            t0Var2 = t0Var;
        }
        u0Var.f10815b = t0Var2;
        u0Var.f10814a = this.h;
        if (iVar != null) {
            if (z10 || !f5.d0.a(cVar, cVar2)) {
                n3.e eVar = this.h;
                j2 j2Var = this.f14269e;
                n3.e h = iVar.h(j2Var, t0Var);
                this.h = h;
                u0Var.f10814a = h;
                if (eVar != null) {
                    eVar.p(j2Var);
                }
            }
        }
    }

    public final synchronized int y() {
        boolean z10;
        int i10;
        try {
            int r6 = r(this.f14282s);
            if (this.f14282s != this.f14279p) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i10 = this.f14273j[r6];
            } else {
                i10 = this.C;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i10;
    }

    public final int z(j3.u0 u0Var, m3.i iVar, int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        boolean z13 = false;
        if ((i10 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        y0 y0Var = this.f14267b;
        synchronized (this) {
            try {
                iVar.f16829c = false;
                if (this.f14282s != this.f14279p) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i11 = -3;
                if (!z12) {
                    if (!z10 && !this.f14285w) {
                        j3.t0 t0Var = this.B;
                        if (t0Var == null || (!z11 && t0Var == this.f14271g)) {
                        }
                        x(t0Var, u0Var);
                        i11 = -5;
                    }
                    iVar.setFlags(4);
                    i11 = -4;
                } else {
                    j3.t0 t0Var2 = ((z0) this.f14268c.i(q())).f14474a;
                    if (!z11 && t0Var2 == this.f14271g) {
                        int r6 = r(this.f14282s);
                        if (!v(r6)) {
                            iVar.f16829c = true;
                        } else {
                            iVar.setFlags(this.f14276m[r6]);
                            long j10 = this.f14277n[r6];
                            iVar.d = j10;
                            if (j10 < this.f14283t) {
                                iVar.addFlag(Integer.MIN_VALUE);
                            }
                            y0Var.f14472b = this.f14275l[r6];
                            y0Var.f14471a = this.f14274k[r6];
                            y0Var.f14473c = this.f14278o[r6];
                            i11 = -4;
                        }
                    }
                    x(t0Var2, u0Var);
                    i11 = -5;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i11 == -4 && !iVar.isEndOfStream()) {
            if ((i10 & 1) != 0) {
                z13 = true;
            }
            if ((i10 & 4) == 0) {
                if (z13) {
                    w0 w0Var = this.f14266a;
                    w0.f((v0) w0Var.f14462f, iVar, this.f14267b, (f5.w) w0Var.d);
                } else {
                    w0 w0Var2 = this.f14266a;
                    w0Var2.f14462f = w0.f((v0) w0Var2.f14462f, iVar, this.f14267b, (f5.w) w0Var2.d);
                }
            }
            if (!z13) {
                this.f14282s++;
            }
        }
        return i11;
    }
}
