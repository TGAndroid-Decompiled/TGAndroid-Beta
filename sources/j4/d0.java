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
import v7.t8;
public final class d0 implements c3.o {
    public final int f13725a;
    public final int f13726b;
    public final List f13727c;
    public final e2.v d;
    public final SparseIntArray f13728e;
    public final f f13729f;
    public final z3.l f13730g;
    public final SparseArray h;
    public final SparseBooleanArray f13731i;
    public final SparseBooleanArray f13732j;
    public final x f13733k;
    public h3.a f13734l;
    public c3.q f13735m;
    public int f13736n;
    public boolean f13737o;
    public boolean f13738p;
    public boolean f13739q;
    public g0 f13740r;
    public int f13741s;
    public int f13742t;

    public d0(int i10, int i11, z3.l lVar, e2.b0 b0Var, f fVar) {
        this.f13729f = fVar;
        this.f13725a = i10;
        this.f13726b = i11;
        this.f13730g = lVar;
        if (i10 != 1 && i10 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f13727c = arrayList;
            arrayList.add(b0Var);
        } else {
            this.f13727c = Collections.singletonList(b0Var);
        }
        this.d = new e2.v(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f13731i = sparseBooleanArray;
        this.f13732j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        this.f13728e = new SparseIntArray();
        this.f13733k = new x(1);
        this.f13735m = c3.q.f4099m;
        this.f13742t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i12 = 0; i12 < size; i12++) {
            sparseArray.put(sparseArray2.keyAt(i12), (g0) sparseArray2.valueAt(i12));
        }
        sparseArray.put(0, new b0(new of.b(this)));
        this.f13740r = null;
    }

    @Override
    public final boolean b(c3.p r7) {
        throw new UnsupportedOperationException("Method not decompiled: j4.d0.b(c3.p):boolean");
    }

    @Override
    public final void g(c3.q qVar) {
        if ((this.f13726b & 1) == 0) {
            qVar = new com.google.firebase.messaging.m(qVar, this.f13730g);
        }
        this.f13735m = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        boolean z10;
        h3.a aVar;
        boolean z11;
        if (this.f13725a != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        List list = this.f13727c;
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
        if (j10 != 0 && (aVar = this.f13734l) != null) {
            aVar.d(j10);
        }
        this.d.G(0);
        this.f13728e.clear();
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.h;
            if (i11 < sparseArray.size()) {
                ((g0) sparseArray.valueAt(i11)).c();
                i11++;
            } else {
                this.f13741s = 0;
                return;
            }
        }
    }

    @Override
    public final List i() {
        e9.g0 g0Var = i0.f8757b;
        return a1.f8720e;
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
        int i16 = this.f13725a;
        if (i16 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f13737o) {
            long j3 = -9223372036854775807L;
            x xVar = this.f13733k;
            if (length != -1 && !z10 && !xVar.d) {
                int i17 = this.f13742t;
                e2.b0 b0Var = xVar.f13962b;
                e2.v vVar = xVar.f13963c;
                if (i17 <= 0) {
                    xVar.a(pVar);
                    return 0;
                } else if (!xVar.f13965f) {
                    long length2 = pVar.getLength();
                    int min = (int) Math.min(112800, length2);
                    long j10 = length2 - min;
                    if (pVar.getPosition() != j10) {
                        sVar.f4100a = j10;
                        return 1;
                    }
                    vVar.G(min);
                    pVar.m();
                    pVar.b(0, min, vVar.f8589a);
                    int i18 = vVar.f8590b;
                    int i19 = vVar.f8591c;
                    int i20 = i19 - 188;
                    while (true) {
                        if (i20 < i18) {
                            break;
                        }
                        byte[] bArr = vVar.f8589a;
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
                                    long a2 = t8.a(vVar, i20, i17);
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
                    xVar.f13965f = true;
                    return 0;
                } else if (xVar.h == -9223372036854775807L) {
                    xVar.a(pVar);
                    return 0;
                } else if (!xVar.f13964e) {
                    int min2 = (int) Math.min(112800, pVar.getLength());
                    long j11 = 0;
                    if (pVar.getPosition() != j11) {
                        sVar.f4100a = j11;
                        return 1;
                    }
                    vVar.G(min2);
                    pVar.m();
                    pVar.b(0, min2, vVar.f8589a);
                    int i24 = vVar.f8590b;
                    int i25 = vVar.f8591c;
                    while (true) {
                        if (i24 >= i25) {
                            break;
                        }
                        if (vVar.f8589a[i24] == 71) {
                            long a10 = t8.a(vVar, i24, i17);
                            if (a10 != -9223372036854775807L) {
                                j3 = a10;
                                break;
                            }
                        }
                        i24++;
                    }
                    xVar.f13966g = j3;
                    xVar.f13964e = true;
                    return 0;
                } else {
                    long j12 = xVar.f13966g;
                    if (j12 == -9223372036854775807L) {
                        xVar.a(pVar);
                        return 0;
                    }
                    xVar.f13967i = b0Var.c(xVar.h) - b0Var.b(j12);
                    xVar.a(pVar);
                    return 0;
                }
            }
            if (!this.f13738p) {
                this.f13738p = true;
                long j13 = xVar.f13967i;
                if (j13 != -9223372036854775807L) {
                    i10 = i16;
                    z13 = false;
                    i15 = 1;
                    h3.a aVar = new h3.a(new Object(), new a5.a(this.f13742t, xVar.f13962b), j13, j13 + 1, 0L, length, 188L, 940);
                    this.f13734l = aVar;
                    this.f13735m.X1(aVar.f10997a);
                } else {
                    i10 = i16;
                    z13 = false;
                    i15 = 1;
                    this.f13735m.X1(new c3.t(j13));
                }
            } else {
                i10 = i16;
                z13 = false;
                i15 = 1;
            }
            if (this.f13739q) {
                this.f13739q = z13;
                h(0L, 0L);
                if (pVar.getPosition() != 0) {
                    sVar.f4100a = 0L;
                    return i15;
                }
            }
            h3.a aVar2 = this.f13734l;
            if (aVar2 != null && aVar2.f10999c != null) {
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
        byte[] bArr2 = vVar2.f8589a;
        if (9400 - vVar2.f8590b < 188) {
            int a11 = vVar2.a();
            if (a11 > 0) {
                System.arraycopy(bArr2, vVar2.f8590b, bArr2, r12, a11);
            }
            vVar2.H(a11, bArr2);
        }
        while (true) {
            int a12 = vVar2.a();
            SparseArray sparseArray = this.h;
            if (a12 < 188) {
                int i26 = vVar2.f8591c;
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
                            if (wVar.f13953c == 3 && wVar.f13958j == -1 && ((!z10 || !(wVar.f13951a instanceof k)) && z12)) {
                                wVar.a(1, new e2.v());
                            }
                        }
                    }
                    return -1;
                }
                vVar2.I(i26 + read);
            } else {
                int i28 = vVar2.f8590b;
                int i29 = vVar2.f8591c;
                byte[] bArr3 = vVar2.f8589a;
                int i30 = i28;
                while (i30 < i29 && bArr3[i30] != 71) {
                    i30++;
                }
                vVar2.J(i30);
                int i31 = i30 + 188;
                g0 g0Var2 = null;
                if (i31 > i29) {
                    int i32 = (i30 - i28) + this.f13741s;
                    this.f13741s = i32;
                    i11 = i10;
                    i12 = 2;
                    if (i11 == 2 && i32 > 376) {
                        throw s0.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i11 = i10;
                    i12 = 2;
                    this.f13741s = r12;
                }
                int i33 = vVar2.f8591c;
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
                    SparseIntArray sparseIntArray = this.f13728e;
                    int i36 = sparseIntArray.get(i34, i35 - 1);
                    sparseIntArray.put(i34, i35);
                    if (i36 == i35) {
                        vVar2.J(i31);
                        return r12;
                    } else if (i35 != ((i36 + 1) & 15)) {
                        g0Var2.c();
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
                boolean z14 = this.f13737o;
                if (i11 == i12 || z14 || !this.f13732j.get(i34, r12)) {
                    vVar2.I(i31);
                    g0Var2.a(i13, vVar2);
                    vVar2.I(i33);
                }
                if (i11 != i12 && !z14 && this.f13737o && length != -1) {
                    this.f13739q = true;
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
