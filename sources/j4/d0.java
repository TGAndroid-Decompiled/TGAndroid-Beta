package j4;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import b2.s0;
import e9.a1;
import e9.i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v7.u8;
public final class d0 implements c3.o {
    public final int f12642a;
    public final int f12643b;
    public final List f12644c;
    public final e2.v d;
    public final SparseIntArray e;
    public final f f12645f;
    public final z3.k f12646g;
    public final SparseArray h;
    public final SparseBooleanArray f12647i;
    public final SparseBooleanArray f12648j;
    public final x f12649k;
    public h3.a f12650l;
    public c3.q f12651m;
    public int f12652n;
    public boolean f12653o;
    public boolean f12654p;
    public boolean f12655q;
    public g0 f12656r;
    public int f12657s;
    public int f12658t;

    public d0(int i10, int i11, z3.k kVar, e2.b0 b0Var, f fVar) {
        this.f12645f = fVar;
        this.f12642a = i10;
        this.f12643b = i11;
        this.f12646g = kVar;
        if (i10 != 1 && i10 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f12644c = arrayList;
            arrayList.add(b0Var);
        } else {
            this.f12644c = Collections.singletonList(b0Var);
        }
        this.d = new e2.v(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f12647i = sparseBooleanArray;
        this.f12648j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        this.e = new SparseIntArray();
        this.f12649k = new x(1);
        this.f12651m = c3.q.f3797m;
        this.f12658t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i12 = 0; i12 < size; i12++) {
            sparseArray.put(sparseArray2.keyAt(i12), (g0) sparseArray2.valueAt(i12));
        }
        sparseArray.put(0, new b0(new of.b(this)));
        this.f12656r = null;
    }

    @Override
    public final boolean a(c3.p r7) {
        throw new UnsupportedOperationException("Method not decompiled: j4.d0.a(c3.p):boolean");
    }

    @Override
    public final void g(c3.q qVar) {
        if ((this.f12643b & 1) == 0) {
            qVar = new com.google.firebase.messaging.m(qVar, this.f12646g);
        }
        this.f12651m = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        boolean z10;
        h3.a aVar;
        boolean z11;
        if (this.f12642a != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        List list = this.f12644c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            e2.b0 b0Var = (e2.b0) list.get(i10);
            if (b0Var.e() == -9223372036854775807L) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                long d = b0Var.d();
                if (d != -9223372036854775807L && d != 0 && d != j10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            if (z11) {
                b0Var.g(j10);
            }
        }
        if (j10 != 0 && (aVar = this.f12650l) != null) {
            aVar.d(j10);
        }
        this.d.G(0);
        this.e.clear();
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.h;
            if (i11 < sparseArray.size()) {
                ((g0) sparseArray.valueAt(i11)).d();
                i11++;
            } else {
                this.f12657s = 0;
                return;
            }
        }
    }

    @Override
    public final List i() {
        e9.g0 g0Var = i0.f8084b;
        return a1.e;
    }

    @Override
    public final int m(c3.p pVar, c3.s sVar) {
        boolean z10;
        c3.p pVar2;
        int i10;
        ?? r12;
        int i11;
        int i12;
        int i13;
        boolean z11;
        int i14;
        boolean z12;
        boolean z13;
        int i15;
        long length = pVar.getLength();
        int i16 = this.f12642a;
        if (i16 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f12653o) {
            long j3 = -9223372036854775807L;
            x xVar = this.f12649k;
            if (length != -1 && !z10 && !xVar.d) {
                int i17 = this.f12658t;
                e2.b0 b0Var = xVar.f12860b;
                e2.v vVar = xVar.f12861c;
                if (i17 <= 0) {
                    xVar.a(pVar);
                    return 0;
                } else if (!xVar.f12862f) {
                    long length2 = pVar.getLength();
                    int min = (int) Math.min(112800, length2);
                    long j10 = length2 - min;
                    if (pVar.getPosition() != j10) {
                        sVar.f3798a = j10;
                        return 1;
                    }
                    vVar.G(min);
                    pVar.p();
                    pVar.a(0, min, vVar.f7934a);
                    int i18 = vVar.f7935b;
                    int i19 = vVar.f7936c;
                    int i20 = i19 - 188;
                    while (true) {
                        if (i20 < i18) {
                            break;
                        }
                        byte[] bArr = vVar.f7934a;
                        int i21 = -4;
                        int i22 = 0;
                        while (true) {
                            if (i21 > 4) {
                                break;
                            }
                            int i23 = (i21 * 188) + i20;
                            if (i23 >= i18 && i23 < i19 && bArr[i23] == 71) {
                                i22++;
                                if (i22 == 5) {
                                    long a2 = u8.a(vVar, i20, i17);
                                    if (a2 != -9223372036854775807L) {
                                        j3 = a2;
                                        break;
                                    }
                                }
                            } else {
                                i22 = 0;
                            }
                            i21++;
                        }
                        i20--;
                    }
                    xVar.h = j3;
                    xVar.f12862f = true;
                    return 0;
                } else if (xVar.h == -9223372036854775807L) {
                    xVar.a(pVar);
                    return 0;
                } else if (!xVar.e) {
                    int min2 = (int) Math.min(112800, pVar.getLength());
                    long j11 = 0;
                    if (pVar.getPosition() != j11) {
                        sVar.f3798a = j11;
                        return 1;
                    }
                    vVar.G(min2);
                    pVar.p();
                    pVar.a(0, min2, vVar.f7934a);
                    int i24 = vVar.f7935b;
                    int i25 = vVar.f7936c;
                    while (true) {
                        if (i24 >= i25) {
                            break;
                        }
                        if (vVar.f7934a[i24] == 71) {
                            long a10 = u8.a(vVar, i24, i17);
                            if (a10 != -9223372036854775807L) {
                                j3 = a10;
                                break;
                            }
                        }
                        i24++;
                    }
                    xVar.f12863g = j3;
                    xVar.e = true;
                    return 0;
                } else {
                    long j12 = xVar.f12863g;
                    if (j12 == -9223372036854775807L) {
                        xVar.a(pVar);
                        return 0;
                    }
                    xVar.f12864i = b0Var.c(xVar.h) - b0Var.b(j12);
                    xVar.a(pVar);
                    return 0;
                }
            }
            if (!this.f12654p) {
                this.f12654p = true;
                long j13 = xVar.f12864i;
                if (j13 != -9223372036854775807L) {
                    i10 = i16;
                    z13 = false;
                    i15 = 1;
                    h3.a aVar = new h3.a(new Object(), new a5.a(this.f12658t, xVar.f12860b), j13, j13 + 1, 0L, length, 188L, 940);
                    this.f12650l = aVar;
                    this.f12651m.X1(aVar.f10113a);
                } else {
                    i10 = i16;
                    z13 = false;
                    i15 = 1;
                    this.f12651m.X1(new c3.t(j13));
                }
            } else {
                i10 = i16;
                z13 = false;
                i15 = 1;
            }
            if (this.f12655q) {
                this.f12655q = z13;
                h(0L, 0L);
                if (pVar.getPosition() != 0) {
                    sVar.f3798a = 0L;
                    return i15;
                }
            }
            h3.a aVar2 = this.f12650l;
            if (aVar2 != null && aVar2.f10115c != null) {
                return aVar2.b(pVar, sVar);
            }
            pVar2 = pVar;
            r12 = z13;
        } else {
            pVar2 = pVar;
            i10 = i16;
            r12 = 0;
        }
        e2.v vVar2 = this.d;
        byte[] bArr2 = vVar2.f7934a;
        if (9400 - vVar2.f7935b < 188) {
            int a11 = vVar2.a();
            if (a11 > 0) {
                System.arraycopy(bArr2, vVar2.f7935b, bArr2, r12, a11);
            }
            vVar2.H(a11, bArr2);
        }
        while (true) {
            int a12 = vVar2.a();
            SparseArray sparseArray = this.h;
            if (a12 < 188) {
                int i26 = vVar2.f7936c;
                int read = pVar2.read(bArr2, i26, 9400 - i26);
                if (read == -1) {
                    for (int i27 = 0; i27 < sparseArray.size(); i27++) {
                        g0 g0Var = (g0) sparseArray.valueAt(i27);
                        if (g0Var instanceof w) {
                            w wVar = (w) g0Var;
                            if (z10 && !wVar.e()) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            if (wVar.f12852c == 3 && wVar.f12856j == -1 && ((!z10 || !(wVar.f12850a instanceof k)) && z12)) {
                                wVar.a(1, new e2.v());
                            }
                        }
                    }
                    return -1;
                }
                vVar2.I(i26 + read);
            } else {
                int i28 = vVar2.f7935b;
                int i29 = vVar2.f7936c;
                byte[] bArr3 = vVar2.f7934a;
                int i30 = i28;
                while (i30 < i29 && bArr3[i30] != 71) {
                    i30++;
                }
                vVar2.J(i30);
                int i31 = i30 + 188;
                g0 g0Var2 = null;
                if (i31 > i29) {
                    int i32 = (i30 - i28) + this.f12657s;
                    this.f12657s = i32;
                    i11 = i10;
                    i12 = 2;
                    if (i11 == 2 && i32 > 376) {
                        throw s0.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i11 = i10;
                    i12 = 2;
                    this.f12657s = r12;
                }
                int i33 = vVar2.f7936c;
                if (i31 > i33) {
                    return r12;
                }
                int j14 = vVar2.j();
                if ((8388608 & j14) != 0) {
                    vVar2.J(i31);
                    return r12;
                }
                if ((4194304 & j14) != 0) {
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                int i34 = (2096896 & j14) >> 8;
                if ((j14 & 32) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((j14 & 16) != 0) {
                    g0Var2 = (g0) sparseArray.get(i34);
                }
                if (g0Var2 == null) {
                    vVar2.J(i31);
                    return r12;
                }
                if (i11 != i12) {
                    int i35 = j14 & 15;
                    SparseIntArray sparseIntArray = this.e;
                    int i36 = sparseIntArray.get(i34, i35 - 1);
                    sparseIntArray.put(i34, i35);
                    if (i36 == i35) {
                        vVar2.J(i31);
                        return r12;
                    } else if (i35 != ((i36 + 1) & 15)) {
                        g0Var2.d();
                    }
                }
                if (z11) {
                    int x10 = vVar2.x();
                    if ((vVar2.x() & 64) != 0) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i13 |= i14;
                    vVar2.K(x10 - 1);
                }
                boolean z14 = this.f12653o;
                if (i11 == i12 || z14 || !this.f12648j.get(i34, r12)) {
                    vVar2.I(i31);
                    g0Var2.a(i13, vVar2);
                    vVar2.I(i33);
                }
                if (i11 != i12 && !z14 && this.f12653o && length != -1) {
                    this.f12655q = true;
                }
                vVar2.J(i31);
                return r12;
            }
        }
    }

    @Override
    public final c3.o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
