package b4;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import j3.r1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.ui.Components.jb;
public final class f0 implements r3.k {
    public final int f1382a;
    public final List f1383b;
    public final h5.w f1384c;
    public final SparseIntArray d;
    public final f e;
    public final SparseArray f1385f;
    public final SparseBooleanArray f1386g;
    public final SparseBooleanArray h;
    public final y f1387i;
    public x f1388j;
    public r3.m f1389k;
    public int f1390l;
    public boolean f1391m;
    public boolean f1392n;
    public boolean f1393o;
    public i0 f1394p;
    public int f1395q;
    public int f1396r;

    public f0(int i10, h5.c0 c0Var, f fVar) {
        this.e = fVar;
        this.f1382a = i10;
        if (i10 != 1 && i10 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f1383b = arrayList;
            arrayList.add(c0Var);
        } else {
            this.f1383b = Collections.singletonList(c0Var);
        }
        this.f1384c = new h5.w(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f1386g = sparseBooleanArray;
        this.h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f1385f = sparseArray;
        this.d = new SparseIntArray();
        this.f1387i = new y(1);
        this.f1389k = r3.m.A;
        this.f1396r = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i11 = 0; i11 < size; i11++) {
            sparseArray.put(sparseArray2.keyAt(i11), (i0) sparseArray2.valueAt(i11));
        }
        sparseArray.put(0, new c0(new af.c(this)));
        this.f1394p = null;
    }

    @Override
    public final void d(long j10, long j11) {
        boolean z4;
        x xVar;
        boolean z10;
        if (this.f1382a != 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.i(z4);
        List list = this.f1383b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            h5.c0 c0Var = (h5.c0) list.get(i10);
            if (c0Var.d() == -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                long c3 = c0Var.c();
                if (c3 != -9223372036854775807L && c3 != 0 && c3 != j11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                c0Var.f(j11);
            }
        }
        if (j11 != 0 && (xVar = this.f1388j) != null) {
            xVar.d(j11);
        }
        this.f1384c.C(0);
        this.d.clear();
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.f1385f;
            if (i11 < sparseArray.size()) {
                ((i0) sparseArray.valueAt(i11)).b();
                i11++;
            } else {
                this.f1395q = 0;
                return;
            }
        }
    }

    @Override
    public final void e(r3.m mVar) {
        this.f1389k = mVar;
    }

    @Override
    public final int h(r3.l lVar, jb jbVar) {
        r3.l lVar2;
        int i10;
        ?? r32;
        int i11;
        int i12;
        boolean z4;
        int i13;
        long j10;
        boolean z10;
        int i14;
        long j11 = ((r3.h) lVar).f43246c;
        boolean z11 = this.f1391m;
        int i15 = this.f1382a;
        if (z11) {
            long j12 = -9223372036854775807L;
            y yVar = this.f1387i;
            if (j11 != -1 && i15 != 2 && !yVar.d) {
                int i16 = this.f1396r;
                h5.c0 c0Var = yVar.f1555b;
                h5.w wVar = yVar.f1556c;
                if (i16 <= 0) {
                    yVar.a(lVar);
                    return 0;
                } else if (!yVar.f1557f) {
                    r3.h hVar = (r3.h) lVar;
                    long j13 = hVar.f43246c;
                    int min = (int) Math.min(112800, j13);
                    long j14 = j13 - min;
                    if (hVar.d != j14) {
                        jbVar.f25932a = j14;
                        return 1;
                    }
                    wVar.C(min);
                    hVar.f43247f = 0;
                    hVar.f(wVar.f6987a, 0, min, false);
                    int i17 = wVar.f6988b;
                    int i18 = wVar.f6989c;
                    int i19 = i18 - 188;
                    while (true) {
                        if (i19 < i17) {
                            break;
                        }
                        byte[] bArr = wVar.f6987a;
                        int i20 = -4;
                        int i21 = 0;
                        while (true) {
                            if (i20 > 4) {
                                break;
                            }
                            int i22 = (i20 * 188) + i19;
                            if (i22 >= i17 && i22 < i18 && bArr[i22] == 71) {
                                i21++;
                                if (i21 == 5) {
                                    long a2 = j7.c0.a(wVar, i19, i16);
                                    if (a2 != -9223372036854775807L) {
                                        j12 = a2;
                                        break;
                                    }
                                }
                            } else {
                                i21 = 0;
                            }
                            i20++;
                        }
                        i19--;
                    }
                    yVar.h = j12;
                    yVar.f1557f = true;
                    return 0;
                } else if (yVar.h == -9223372036854775807L) {
                    yVar.a(lVar);
                    return 0;
                } else if (!yVar.e) {
                    r3.h hVar2 = (r3.h) lVar;
                    int min2 = (int) Math.min(112800, hVar2.f43246c);
                    long j15 = 0;
                    if (hVar2.d != j15) {
                        jbVar.f25932a = j15;
                        return 1;
                    }
                    wVar.C(min2);
                    hVar2.f43247f = 0;
                    hVar2.f(wVar.f6987a, 0, min2, false);
                    int i23 = wVar.f6988b;
                    int i24 = wVar.f6989c;
                    while (true) {
                        if (i23 >= i24) {
                            break;
                        }
                        if (wVar.f6987a[i23] == 71) {
                            long a10 = j7.c0.a(wVar, i23, i16);
                            if (a10 != -9223372036854775807L) {
                                j12 = a10;
                                break;
                            }
                        }
                        i23++;
                    }
                    yVar.f1558g = j12;
                    yVar.e = true;
                    return 0;
                } else {
                    long j16 = yVar.f1558g;
                    if (j16 == -9223372036854775807L) {
                        yVar.a(lVar);
                        return 0;
                    }
                    long b10 = c0Var.b(yVar.h) - c0Var.b(j16);
                    yVar.f1559i = b10;
                    if (b10 < 0) {
                        h5.a.K("TsDurationReader", "Invalid duration: " + yVar.f1559i + ". Using TIME_UNSET instead.");
                        yVar.f1559i = -9223372036854775807L;
                    }
                    yVar.a(lVar);
                    return 0;
                }
            }
            if (!this.f1392n) {
                this.f1392n = true;
                long j17 = yVar.f1559i;
                if (j17 != -9223372036854775807L) {
                    h5.c0 c0Var2 = yVar.f1555b;
                    i10 = i15;
                    j10 = 0;
                    z10 = false;
                    i14 = 1;
                    x xVar = new x(new ab.a(21), new e0(this.f1396r, c0Var2), j17, j17 + 1, 0L, j11, 188L, 940);
                    this.f1388j = xVar;
                    this.f1389k.h2(xVar.f1551a);
                } else {
                    i10 = i15;
                    j10 = 0;
                    z10 = false;
                    i14 = 1;
                    this.f1389k.h2(new r3.n(j17));
                }
            } else {
                i10 = i15;
                j10 = 0;
                z10 = false;
                i14 = 1;
            }
            if (this.f1393o) {
                this.f1393o = z10;
                d(j10, j10);
                if (((r3.h) lVar).d != j10) {
                    jbVar.f25932a = j10;
                    return i14;
                }
            }
            x xVar2 = this.f1388j;
            if (xVar2 != null && xVar2.f1553c != null) {
                return xVar2.b(lVar, jbVar);
            }
            lVar2 = lVar;
            r32 = z10;
        } else {
            lVar2 = lVar;
            i10 = i15;
            r32 = 0;
        }
        h5.w wVar2 = this.f1384c;
        byte[] bArr2 = wVar2.f6987a;
        if (9400 - wVar2.f6988b < 188) {
            int a11 = wVar2.a();
            if (a11 > 0) {
                System.arraycopy(bArr2, wVar2.f6988b, bArr2, r32, a11);
            }
            wVar2.D(a11, bArr2);
        }
        while (wVar2.a() < 188) {
            int i25 = wVar2.f6989c;
            int read = ((r3.h) lVar2).read(bArr2, i25, 9400 - i25);
            if (read == -1) {
                return -1;
            }
            wVar2.E(i25 + read);
        }
        int i26 = wVar2.f6988b;
        int i27 = wVar2.f6989c;
        byte[] bArr3 = wVar2.f6987a;
        int i28 = i26;
        while (i28 < i27 && bArr3[i28] != 71) {
            i28++;
        }
        wVar2.F(i28);
        int i29 = i28 + 188;
        i0 i0Var = null;
        if (i29 > i27) {
            int i30 = (i28 - i26) + this.f1395q;
            this.f1395q = i30;
            i11 = i10;
            if (i11 == 2 && i30 > 376) {
                throw r1.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            i11 = i10;
            this.f1395q = r32;
        }
        int i31 = wVar2.f6989c;
        if (i29 > i31) {
            return r32;
        }
        int g10 = wVar2.g();
        if ((8388608 & g10) != 0) {
            wVar2.F(i29);
            return r32;
        }
        if ((4194304 & g10) != 0) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        int i32 = (2096896 & g10) >> 8;
        if ((g10 & 32) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((g10 & 16) != 0) {
            i0Var = (i0) this.f1385f.get(i32);
        }
        if (i0Var == null) {
            wVar2.F(i29);
            return r32;
        }
        if (i11 != 2) {
            int i33 = g10 & 15;
            SparseIntArray sparseIntArray = this.d;
            int i34 = sparseIntArray.get(i32, i33 - 1);
            sparseIntArray.put(i32, i33);
            if (i34 == i33) {
                wVar2.F(i29);
                return r32;
            } else if (i33 != ((i34 + 1) & 15)) {
                i0Var.b();
            }
        }
        if (z4) {
            int u10 = wVar2.u();
            if ((wVar2.u() & 64) != 0) {
                i13 = 2;
            } else {
                i13 = 0;
            }
            i12 |= i13;
            wVar2.G(u10 - 1);
        }
        boolean z12 = this.f1391m;
        if (i11 == 2 || z12 || !this.h.get(i32, r32)) {
            wVar2.E(i29);
            i0Var.a(i12, wVar2);
            wVar2.E(i31);
        }
        if (i11 != 2 && !z12 && this.f1391m && j11 != -1) {
            this.f1393o = true;
        }
        wVar2.F(i29);
        return r32;
    }

    @Override
    public final boolean i(r3.l r7) {
        throw new UnsupportedOperationException("Method not decompiled: b4.f0.i(r3.l):boolean");
    }

    @Override
    public final void release() {
    }
}
