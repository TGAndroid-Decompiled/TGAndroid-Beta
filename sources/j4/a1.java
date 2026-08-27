package j4;

import android.util.SparseArray;
import java.io.EOFException;
import java.util.ArrayList;

public class a1 implements m3.w {
    public h3.t0 A;
    public h3.t0 B;
    public int C;
    public boolean D;
    public boolean E;
    public long F;
    public boolean G;

    public final v0 f12507a;
    public final l3.j d;

    public final b6.a f12510e;

    public Object f12511f;

    public h3.t0 f12512g;
    public l3.f h;

    public int f12520p;

    public int f12521q;

    public int f12522r;

    public int f12523s;

    public boolean f12526w;

    public boolean f12529z;

    public final x0 f12508b = new x0();

    public int f12513i = 1000;

    public int[] f12514j = new int[1000];

    public long[] f12515k = new long[1000];

    public long[] f12518n = new long[1000];

    public int[] f12517m = new int[1000];

    public int[] f12516l = new int[1000];

    public m3.v[] f12519o = new m3.v[1000];

    public final b6.a f12509c = new b6.a(new w0(0));

    public long f12524t = Long.MIN_VALUE;

    public long f12525u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;

    public boolean f12528y = true;

    public boolean f12527x = true;

    public a1(com.google.android.exoplayer2.upstream.r rVar, l3.j jVar, b6.a aVar) {
        this.d = jVar;
        this.f12510e = aVar;
        this.f12507a = new v0(rVar);
    }

    public final void A(boolean z10) {
        v0 v0Var = this.f12507a;
        v0Var.a((u0) v0Var.f12692e);
        u0 u0Var = (u0) v0Var.f12692e;
        int i10 = v0Var.f12689a;
        d5.a.i(((com.google.android.exoplayer2.upstream.a) u0Var.f12687c) == null);
        u0Var.f12685a = 0L;
        u0Var.f12686b = i10;
        u0 u0Var2 = (u0) v0Var.f12692e;
        v0Var.f12693f = u0Var2;
        v0Var.f12694g = u0Var2;
        v0Var.f12690b = 0L;
        ((com.google.android.exoplayer2.upstream.r) v0Var.f12691c).b();
        this.f12520p = 0;
        this.f12521q = 0;
        this.f12522r = 0;
        this.f12523s = 0;
        this.f12527x = true;
        this.f12524t = Long.MIN_VALUE;
        this.f12525u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.f12526w = false;
        b6.a aVar = this.f12509c;
        SparseArray sparseArray = (SparseArray) aVar.f2033b;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            ((w0) aVar.d).accept(sparseArray.valueAt(i11));
        }
        aVar.f2034c = -1;
        sparseArray.clear();
        if (z10) {
            this.A = null;
            this.B = null;
            this.f12528y = true;
        }
    }

    public final synchronized void B() {
        this.f12523s = 0;
        v0 v0Var = this.f12507a;
        v0Var.f12693f = (u0) v0Var.f12692e;
    }

    public final int C(com.google.android.exoplayer2.upstream.j jVar, int i10, boolean z10) throws EOFException {
        v0 v0Var = this.f12507a;
        int iC = v0Var.c(i10);
        u0 u0Var = (u0) v0Var.f12694g;
        com.google.android.exoplayer2.upstream.a aVar = (com.google.android.exoplayer2.upstream.a) u0Var.f12687c;
        int i11 = jVar.read(aVar.f2957a, ((int) (v0Var.f12690b - u0Var.f12685a)) + aVar.f2958b, iC);
        if (i11 == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j10 = v0Var.f12690b + ((long) i11);
        v0Var.f12690b = j10;
        u0 u0Var2 = (u0) v0Var.f12694g;
        if (j10 == u0Var2.f12686b) {
            v0Var.f12694g = (u0) u0Var2.d;
        }
        return i11;
    }

    public final synchronized boolean D(long j10, boolean z10) throws Throwable {
        try {
            try {
                B();
                int iR = r(this.f12523s);
                int i10 = this.f12523s;
                int i11 = this.f12520p;
                if (!(i10 != i11) || j10 < this.f12518n[iR] || (j10 > this.v && !z10)) {
                    return false;
                }
                int iL = l(j10, iR, i11 - i10, true);
                if (iL == -1) {
                    return false;
                }
                this.f12524t = j10;
                this.f12523s += iL;
                return true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void E(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f12523s + i10 <= this.f12520p) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z10 = false;
        }
        d5.a.f(z10);
        this.f12523s += i10;
    }

    @Override
    public final void a(int i10, d5.z zVar) {
        d(i10, zVar);
    }

    @Override
    public final int b(com.google.android.exoplayer2.upstream.j jVar, int i10, boolean z10) {
        return C(jVar, i10, z10);
    }

    @Override
    public final void c(h3.t0 t0Var) {
        boolean z10;
        d5.p pVarE;
        int iA;
        h3.t0 t0VarM = m(t0Var);
        boolean z11 = false;
        this.f12529z = false;
        this.A = t0Var;
        synchronized (this) {
            try {
                this.f12528y = false;
                if (!d5.g0.a(t0VarM, this.B)) {
                    if (((SparseArray) this.f12509c.f2033b).size() == 0) {
                        this.B = t0VarM;
                    } else {
                        SparseArray sparseArray = (SparseArray) this.f12509c.f2033b;
                        if (((y0) sparseArray.valueAt(sparseArray.size() - 1)).f12713a.equals(t0VarM)) {
                            SparseArray sparseArray2 = (SparseArray) this.f12509c.f2033b;
                            this.B = ((y0) sparseArray2.valueAt(sparseArray2.size() - 1)).f12713a;
                        } else {
                            this.B = t0VarM;
                        }
                    }
                    h3.t0 t0Var2 = this.B;
                    String str = t0Var2.B;
                    String str2 = t0Var2.f8190r;
                    ArrayList arrayList = d5.q.f4823a;
                    if (str != null) {
                        switch (str) {
                            case "audio/eac3-joc":
                            case "audio/mpeg-L1":
                            case "audio/mpeg-L2":
                            case "audio/ac3":
                            case "audio/raw":
                            case "audio/eac3":
                            case "audio/flac":
                            case "audio/mpeg":
                            case "audio/g711-alaw":
                            case "audio/g711-mlaw":
                                z10 = true;
                                break;
                            case "audio/mp4a-latm":
                                if (str2 != null && (pVarE = d5.q.e(str2)) != null && (iA = pVarE.a()) != 0 && iA != 16) {
                                    z10 = true;
                                    break;
                                } else {
                                    z10 = false;
                                    break;
                                }
                                break;
                            default:
                                z10 = false;
                                break;
                        }
                    } else {
                        z10 = false;
                    }
                    this.D = z10;
                    this.E = false;
                    z11 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ?? r10 = this.f12511f;
        if (r10 == 0 || !z11) {
            return;
        }
        r10.a();
    }

    @Override
    public final void d(int i10, d5.z zVar) {
        while (true) {
            v0 v0Var = this.f12507a;
            if (i10 <= 0) {
                v0Var.getClass();
                return;
            }
            int iC = v0Var.c(i10);
            u0 u0Var = (u0) v0Var.f12694g;
            com.google.android.exoplayer2.upstream.a aVar = (com.google.android.exoplayer2.upstream.a) u0Var.f12687c;
            zVar.c(((int) (v0Var.f12690b - u0Var.f12685a)) + aVar.f2958b, iC, aVar.f2957a);
            i10 -= iC;
            long j10 = v0Var.f12690b + ((long) iC);
            v0Var.f12690b = j10;
            u0 u0Var2 = (u0) v0Var.f12694g;
            if (j10 == u0Var2.f12686b) {
                v0Var.f12694g = (u0) u0Var2.d;
            }
        }
    }

    @Override
    public void e(long j10, int i10, int i11, int i12, m3.v vVar) {
        int i13;
        if (this.f12529z) {
            h3.t0 t0Var = this.A;
            d5.a.j(t0Var);
            c(t0Var);
        }
        int i14 = i10 & 1;
        boolean z10 = true;
        boolean z11 = i14 != 0;
        if (this.f12527x) {
            if (!z11) {
                return;
            } else {
                this.f12527x = false;
            }
        }
        long j11 = this.F + j10;
        if (!this.D) {
            i13 = i10;
        } else {
            if (j11 < this.f12524t) {
                return;
            }
            if (i14 == 0) {
                if (!this.E) {
                    d5.a.K("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.B);
                    this.E = true;
                }
                i13 = i10 | 1;
            } else {
                i13 = i10;
            }
        }
        if (this.G) {
            if (!z11) {
                return;
            }
            synchronized (this) {
                if (this.f12520p == 0) {
                    z10 = j11 > this.f12525u;
                } else if (o() >= j11) {
                    z10 = false;
                } else {
                    int i15 = this.f12520p;
                    int iR = r(i15 - 1);
                    while (i15 > this.f12523s && this.f12518n[iR] >= j11) {
                        i15--;
                        iR--;
                        if (iR == -1) {
                            iR = this.f12513i - 1;
                        }
                    }
                    j(this.f12521q + i15);
                }
            }
            if (!z10) {
                return;
            } else {
                this.G = false;
            }
        }
        f(j11, i13, (this.f12507a.f12690b - ((long) i11)) - ((long) i12), i11, vVar);
    }

    public final synchronized void f(long j10, int i10, long j11, int i11, m3.v vVar) {
        l3.j jVar;
        l3.i iVarG;
        b6.a aVar;
        int i12;
        SparseArray sparseArray;
        int iKeyAt;
        boolean z10;
        boolean z11;
        try {
            int i13 = this.f12520p;
            if (i13 > 0) {
                int iR = r(i13 - 1);
                d5.a.f(this.f12515k[iR] + ((long) this.f12516l[iR]) <= j11);
            }
            this.f12526w = (536870912 & i10) != 0;
            this.v = Math.max(this.v, j10);
            int iR2 = r(this.f12520p);
            this.f12518n[iR2] = j10;
            this.f12515k[iR2] = j11;
            this.f12516l[iR2] = i11;
            this.f12517m[iR2] = i10;
            this.f12519o[iR2] = vVar;
            this.f12514j[iR2] = this.C;
            if (((SparseArray) this.f12509c.f2033b).size() == 0) {
                jVar = this.d;
                if (jVar != null) {
                    iVarG = jVar.g(this.f12510e, this.B);
                } else {
                    iVarG = l3.i.f15395a;
                }
                aVar = this.f12509c;
                i12 = this.f12521q + this.f12520p;
                h3.t0 t0Var = this.B;
                t0Var.getClass();
                y0 y0Var = new y0(t0Var, iVarG);
                sparseArray = (SparseArray) aVar.f2033b;
                if (aVar.f2034c == -1) {
                    if (sparseArray.size() == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    d5.a.i(z11);
                    aVar.f2034c = 0;
                }
                if (sparseArray.size() > 0) {
                    iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                    if (i12 >= iKeyAt) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    d5.a.f(z10);
                    if (iKeyAt == i12) {
                        ((w0) aVar.d).accept(sparseArray.valueAt(sparseArray.size() - 1));
                    }
                }
                sparseArray.append(i12, y0Var);
            } else {
                SparseArray sparseArray2 = (SparseArray) this.f12509c.f2033b;
                if (!((y0) sparseArray2.valueAt(sparseArray2.size() - 1)).f12713a.equals(this.B)) {
                    jVar = this.d;
                    if (jVar != null) {
                        iVarG = jVar.g(this.f12510e, this.B);
                    } else {
                        iVarG = l3.i.f15395a;
                    }
                    aVar = this.f12509c;
                    i12 = this.f12521q + this.f12520p;
                    h3.t0 t0Var2 = this.B;
                    t0Var2.getClass();
                    y0 y0Var2 = new y0(t0Var2, iVarG);
                    sparseArray = (SparseArray) aVar.f2033b;
                    if (aVar.f2034c == -1) {
                        if (sparseArray.size() == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        d5.a.i(z11);
                        aVar.f2034c = 0;
                    }
                    if (sparseArray.size() > 0) {
                        iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                        if (i12 >= iKeyAt) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        d5.a.f(z10);
                        if (iKeyAt == i12) {
                            ((w0) aVar.d).accept(sparseArray.valueAt(sparseArray.size() - 1));
                        }
                    }
                    sparseArray.append(i12, y0Var2);
                }
            }
            int i14 = this.f12520p + 1;
            this.f12520p = i14;
            int i15 = this.f12513i;
            if (i14 == i15) {
                int i16 = i15 + 1000;
                int[] iArr = new int[i16];
                long[] jArr = new long[i16];
                long[] jArr2 = new long[i16];
                int[] iArr2 = new int[i16];
                int[] iArr3 = new int[i16];
                m3.v[] vVarArr = new m3.v[i16];
                int i17 = this.f12522r;
                int i18 = i15 - i17;
                System.arraycopy(this.f12515k, i17, jArr, 0, i18);
                System.arraycopy(this.f12518n, this.f12522r, jArr2, 0, i18);
                System.arraycopy(this.f12517m, this.f12522r, iArr2, 0, i18);
                System.arraycopy(this.f12516l, this.f12522r, iArr3, 0, i18);
                System.arraycopy(this.f12519o, this.f12522r, vVarArr, 0, i18);
                System.arraycopy(this.f12514j, this.f12522r, iArr, 0, i18);
                int i19 = this.f12522r;
                System.arraycopy(this.f12515k, 0, jArr, i18, i19);
                System.arraycopy(this.f12518n, 0, jArr2, i18, i19);
                System.arraycopy(this.f12517m, 0, iArr2, i18, i19);
                System.arraycopy(this.f12516l, 0, iArr3, i18, i19);
                System.arraycopy(this.f12519o, 0, vVarArr, i18, i19);
                System.arraycopy(this.f12514j, 0, iArr, i18, i19);
                this.f12515k = jArr;
                this.f12518n = jArr2;
                this.f12517m = iArr2;
                this.f12516l = iArr3;
                this.f12519o = vVarArr;
                this.f12514j = iArr;
                this.f12522r = 0;
                this.f12513i = i16;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final long g(int i10) {
        this.f12525u = Math.max(this.f12525u, p(i10));
        this.f12520p -= i10;
        int i11 = this.f12521q + i10;
        this.f12521q = i11;
        int i12 = this.f12522r + i10;
        this.f12522r = i12;
        int i13 = this.f12513i;
        if (i12 >= i13) {
            this.f12522r = i12 - i13;
        }
        int i14 = this.f12523s - i10;
        this.f12523s = i14;
        int i15 = 0;
        if (i14 < 0) {
            this.f12523s = 0;
        }
        b6.a aVar = this.f12509c;
        SparseArray sparseArray = (SparseArray) aVar.f2033b;
        while (i15 < sparseArray.size() - 1) {
            int i16 = i15 + 1;
            if (i11 < sparseArray.keyAt(i16)) {
                break;
            }
            ((w0) aVar.d).accept(sparseArray.valueAt(i15));
            sparseArray.removeAt(i15);
            int i17 = aVar.f2034c;
            if (i17 > 0) {
                aVar.f2034c = i17 - 1;
            }
            i15 = i16;
        }
        if (this.f12520p != 0) {
            return this.f12515k[this.f12522r];
        }
        int i18 = this.f12522r;
        if (i18 == 0) {
            i18 = this.f12513i;
        }
        int i19 = i18 - 1;
        return this.f12515k[i19] + ((long) this.f12516l[i19]);
    }

    public final void h(long j10, boolean z10) {
        Throwable th;
        v0 v0Var = this.f12507a;
        synchronized (this) {
            try {
                try {
                    int i10 = this.f12520p;
                    long jG = -1;
                    if (i10 != 0) {
                        long[] jArr = this.f12518n;
                        int i11 = this.f12522r;
                        if (j10 >= jArr[i11]) {
                            if (z10) {
                                try {
                                    int i12 = this.f12523s;
                                    if (i12 != i10) {
                                        i10 = i12 + 1;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            int iL = l(j10, i11, i10, false);
                            if (iL != -1) {
                                jG = g(iL);
                            }
                        }
                    }
                    v0Var.b(jG);
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
        long jG;
        v0 v0Var = this.f12507a;
        synchronized (this) {
            int i10 = this.f12520p;
            jG = i10 == 0 ? -1L : g(i10);
        }
        v0Var.b(jG);
    }

    public final long j(int i10) {
        int i11 = this.f12521q;
        int i12 = this.f12520p;
        int i13 = (i11 + i12) - i10;
        boolean z10 = false;
        d5.a.f(i13 >= 0 && i13 <= i12 - this.f12523s);
        int i14 = this.f12520p - i13;
        this.f12520p = i14;
        this.v = Math.max(this.f12525u, p(i14));
        if (i13 == 0 && this.f12526w) {
            z10 = true;
        }
        this.f12526w = z10;
        b6.a aVar = this.f12509c;
        SparseArray sparseArray = (SparseArray) aVar.f2033b;
        for (int size = sparseArray.size() - 1; size >= 0 && i10 < sparseArray.keyAt(size); size--) {
            ((w0) aVar.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        aVar.f2034c = sparseArray.size() > 0 ? Math.min(aVar.f2034c, sparseArray.size() - 1) : -1;
        int i15 = this.f12520p;
        if (i15 == 0) {
            return 0L;
        }
        int iR = r(i15 - 1);
        return this.f12515k[iR] + ((long) this.f12516l[iR]);
    }

    public final void k(int i10) {
        long j10 = j(i10);
        v0 v0Var = this.f12507a;
        int i11 = v0Var.f12689a;
        d5.a.f(j10 <= v0Var.f12690b);
        v0Var.f12690b = j10;
        if (j10 != 0) {
            u0 u0Var = (u0) v0Var.f12692e;
            if (j10 != u0Var.f12685a) {
                while (v0Var.f12690b > u0Var.f12686b) {
                    u0Var = (u0) u0Var.d;
                }
                u0 u0Var2 = (u0) u0Var.d;
                u0Var2.getClass();
                v0Var.a(u0Var2);
                u0 u0Var3 = new u0(u0Var.f12686b, i11);
                u0Var.d = u0Var3;
                if (v0Var.f12690b == u0Var.f12686b) {
                    u0Var = u0Var3;
                }
                v0Var.f12694g = u0Var;
                if (((u0) v0Var.f12693f) == u0Var2) {
                    v0Var.f12693f = u0Var3;
                    return;
                }
                return;
            }
        }
        v0Var.a((u0) v0Var.f12692e);
        u0 u0Var4 = new u0(v0Var.f12690b, i11);
        v0Var.f12692e = u0Var4;
        v0Var.f12693f = u0Var4;
        v0Var.f12694g = u0Var4;
    }

    public final int l(long j10, int i10, int i11, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f12518n[i10];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.f12517m[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f12513i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public h3.t0 m(h3.t0 t0Var) {
        if (this.F == 0 || t0Var.F == Long.MAX_VALUE) {
            return t0Var;
        }
        h3.s0 s0VarA = t0Var.a();
        s0VarA.f8139s = t0Var.F + this.F;
        return new h3.t0(s0VarA);
    }

    public final synchronized long n() {
        return this.v;
    }

    public final synchronized long o() {
        return Math.max(this.f12525u, p(this.f12523s));
    }

    public final long p(int i10) {
        long jMax = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int iR = r(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.f12518n[iR]);
            if ((this.f12517m[iR] & 1) != 0) {
                return jMax;
            }
            iR--;
            if (iR == -1) {
                iR = this.f12513i - 1;
            }
        }
        return jMax;
    }

    public final int q() {
        return this.f12521q + this.f12523s;
    }

    public final int r(int i10) {
        int i11 = this.f12522r + i10;
        int i12 = this.f12513i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    public final synchronized int s(long j10, boolean z10) throws Throwable {
        try {
            try {
                int iR = r(this.f12523s);
                int i10 = this.f12523s;
                int i11 = this.f12520p;
                if (!(i10 != i11) || j10 < this.f12518n[iR]) {
                    return 0;
                }
                if (j10 > this.v && z10) {
                    return i11 - i10;
                }
                int iL = l(j10, iR, i11 - i10, true);
                if (iL == -1) {
                    return 0;
                }
                return iL;
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
        return this.f12528y ? null : this.B;
    }

    public final synchronized boolean u(boolean z10) {
        h3.t0 t0Var;
        boolean z11 = false;
        if (this.f12523s != this.f12520p) {
            if (((y0) this.f12509c.g(q())).f12713a != this.f12512g) {
                return true;
            }
            return v(r(this.f12523s));
        }
        if (z10 || this.f12526w || ((t0Var = this.B) != null && t0Var != this.f12512g)) {
            z11 = true;
        }
        return z11;
    }

    public final boolean v(int i10) {
        l3.f fVar = this.h;
        if (fVar == null || fVar.p() == 4) {
            return true;
        }
        return (this.f12517m[i10] & 1073741824) == 0 && this.h.j();
    }

    public final void w() throws l3.e {
        l3.f fVar = this.h;
        if (fVar == null || fVar.p() != 1) {
            return;
        }
        l3.e eVarX = this.h.x();
        eVarX.getClass();
        throw eVarX;
    }

    public final void x(h3.t0 t0Var, h3.u0 u0Var) {
        h3.t0 t0Var2;
        h3.t0 t0Var3 = this.f12512g;
        boolean z10 = t0Var3 == null;
        l3.d dVar = z10 ? null : t0Var3.E;
        this.f12512g = t0Var;
        l3.d dVar2 = t0Var.E;
        l3.j jVar = this.d;
        if (jVar != null) {
            int iM = jVar.m(t0Var);
            h3.s0 s0VarA = t0Var.a();
            s0VarA.J = iM;
            t0Var2 = new h3.t0(s0VarA);
        } else {
            t0Var2 = t0Var;
        }
        u0Var.f8207b = t0Var2;
        u0Var.f8206a = this.h;
        if (jVar == null) {
            return;
        }
        if (z10 || !d5.g0.a(dVar, dVar2)) {
            l3.f fVar = this.h;
            b6.a aVar = this.f12510e;
            l3.f fVarL = jVar.l(aVar, t0Var);
            this.h = fVarL;
            u0Var.f8206a = fVarL;
            if (fVar != null) {
                fVar.h(aVar);
            }
        }
    }

    public final synchronized int y() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.f12523s != this.f12520p ? this.f12514j[r(this.f12523s)] : this.C;
    }

    public final int z(h3.u0 u0Var, k3.i iVar, int i10, boolean z10) {
        int i11;
        boolean z11 = (i10 & 2) != 0;
        x0 x0Var = this.f12508b;
        synchronized (this) {
            try {
                iVar.f14430c = false;
                i11 = -3;
                if (this.f12523s != this.f12520p) {
                    h3.t0 t0Var = ((y0) this.f12509c.g(q())).f12713a;
                    if (z11 || t0Var != this.f12512g) {
                        x(t0Var, u0Var);
                        i11 = -5;
                    } else {
                        int iR = r(this.f12523s);
                        if (v(iR)) {
                            iVar.setFlags(this.f12517m[iR]);
                            long j10 = this.f12518n[iR];
                            iVar.d = j10;
                            if (j10 < this.f12524t) {
                                iVar.addFlag(Integer.MIN_VALUE);
                            }
                            x0Var.f12711b = this.f12516l[iR];
                            x0Var.f12710a = this.f12515k[iR];
                            x0Var.f12712c = this.f12519o[iR];
                            i11 = -4;
                        } else {
                            iVar.f14430c = true;
                        }
                    }
                } else if (z10 || this.f12526w) {
                    iVar.setFlags(4);
                    i11 = -4;
                } else {
                    h3.t0 t0Var2 = this.B;
                    if (t0Var2 != null && (z11 || t0Var2 != this.f12512g)) {
                        x(t0Var2, u0Var);
                        i11 = -5;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i11 == -4 && !iVar.isEndOfStream()) {
            boolean z12 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z12) {
                    v0 v0Var = this.f12507a;
                    v0.f((u0) v0Var.f12693f, iVar, this.f12508b, (d5.z) v0Var.d);
                } else {
                    v0 v0Var2 = this.f12507a;
                    v0Var2.f12693f = v0.f((u0) v0Var2.f12693f, iVar, this.f12508b, (d5.z) v0Var2.d);
                }
            }
            if (!z12) {
                this.f12523s++;
            }
        }
        return i11;
    }
}
