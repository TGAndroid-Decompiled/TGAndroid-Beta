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
import v7.s8;
public final class d0 implements c3.o {
    public final int f13763a;
    public final int f13764b;
    public final List f13765c;
    public final e2.v d;
    public final SparseIntArray f13766e;
    public final f f13767f;
    public final z3.k f13768g;
    public final SparseArray h;
    public final SparseBooleanArray f13769i;
    public final SparseBooleanArray f13770j;
    public final x f13771k;
    public h3.a f13772l;
    public c3.q f13773m;
    public int f13774n;
    public boolean f13775o;
    public boolean f13776p;
    public boolean f13777q;
    public g0 f13778r;
    public int f13779s;
    public int f13780t;

    public d0(int i10, int i11, z3.k kVar, e2.b0 b0Var, f fVar) {
        this.f13767f = fVar;
        this.f13763a = i10;
        this.f13764b = i11;
        this.f13768g = kVar;
        if (i10 != 1 && i10 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f13765c = arrayList;
            arrayList.add(b0Var);
        } else {
            this.f13765c = Collections.singletonList(b0Var);
        }
        this.d = new e2.v(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f13769i = sparseBooleanArray;
        this.f13770j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        this.f13766e = new SparseIntArray();
        this.f13771k = new x(1);
        this.f13773m = c3.q.f4149m;
        this.f13780t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i12 = 0; i12 < size; i12++) {
            sparseArray.put(sparseArray2.keyAt(i12), (g0) sparseArray2.valueAt(i12));
        }
        sparseArray.put(0, new b0(new pf.b(this)));
        this.f13778r = null;
    }

    @Override
    public final boolean a(c3.p r7) {
        throw new UnsupportedOperationException("Method not decompiled: j4.d0.a(c3.p):boolean");
    }

    @Override
    public final void g(c3.q qVar) {
        if ((this.f13764b & 1) == 0) {
            qVar = new com.google.firebase.messaging.m(qVar, this.f13768g);
        }
        this.f13773m = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        boolean z10;
        h3.a aVar;
        boolean z11;
        if (this.f13763a != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        List list = this.f13765c;
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
        if (j10 != 0 && (aVar = this.f13772l) != null) {
            aVar.d(j10);
        }
        this.d.G(0);
        this.f13766e.clear();
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.h;
            if (i11 < sparseArray.size()) {
                ((g0) sparseArray.valueAt(i11)).c();
                i11++;
            } else {
                this.f13779s = 0;
                return;
            }
        }
    }

    @Override
    public final List i() {
        e9.g0 g0Var = i0.f8752b;
        return a1.f8715e;
    }

    @Override
    public final int m(c3.p pVar, c3.s sVar) {
        boolean z10;
        c3.p pVar2;
        ?? r12;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z11;
        int i15;
        int i16;
        boolean z12;
        long length = pVar.getLength();
        int i17 = this.f13763a;
        if (i17 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f13775o) {
            int i18 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
            long j3 = -9223372036854775807L;
            x xVar = this.f13771k;
            if (i18 != 0 && !z10 && !xVar.d) {
                int i19 = this.f13780t;
                e2.b0 b0Var = xVar.f14000b;
                e2.v vVar = xVar.f14001c;
                if (i19 <= 0) {
                    xVar.a(pVar);
                    return 0;
                } else if (!xVar.f14003f) {
                    long length2 = pVar.getLength();
                    int min = (int) Math.min(112800, length2);
                    long j10 = length2 - min;
                    if (pVar.getPosition() != j10) {
                        sVar.f4150a = j10;
                        return 1;
                    }
                    vVar.G(min);
                    pVar.q();
                    pVar.a(0, min, vVar.f8584a);
                    int i20 = vVar.f8585b;
                    int i21 = vVar.f8586c;
                    int i22 = i21 - 188;
                    while (true) {
                        if (i22 < i20) {
                            break;
                        }
                        byte[] bArr = vVar.f8584a;
                        int i23 = -4;
                        int i24 = 0;
                        while (true) {
                            if (i23 > 4) {
                                break;
                            }
                            int i25 = (i23 * 188) + i22;
                            if (i25 >= i20 && i25 < i21 && bArr[i25] == 71) {
                                i24++;
                                if (i24 == 5) {
                                    long a2 = s8.a(vVar, i22, i19);
                                    if (a2 != -9223372036854775807L) {
                                        j3 = a2;
                                        break;
                                    }
                                }
                            } else {
                                i24 = 0;
                            }
                            i23++;
                        }
                        i22--;
                    }
                    xVar.h = j3;
                    xVar.f14003f = true;
                    return 0;
                } else if (xVar.h == -9223372036854775807L) {
                    xVar.a(pVar);
                    return 0;
                } else if (!xVar.f14002e) {
                    int min2 = (int) Math.min(112800, pVar.getLength());
                    long j11 = 0;
                    if (pVar.getPosition() != j11) {
                        sVar.f4150a = j11;
                        return 1;
                    }
                    vVar.G(min2);
                    pVar.q();
                    pVar.a(0, min2, vVar.f8584a);
                    int i26 = vVar.f8585b;
                    int i27 = vVar.f8586c;
                    while (true) {
                        if (i26 >= i27) {
                            break;
                        }
                        if (vVar.f8584a[i26] == 71) {
                            long a10 = s8.a(vVar, i26, i19);
                            if (a10 != -9223372036854775807L) {
                                j3 = a10;
                                break;
                            }
                        }
                        i26++;
                    }
                    xVar.f14004g = j3;
                    xVar.f14002e = true;
                    return 0;
                } else {
                    long j12 = xVar.f14004g;
                    if (j12 == -9223372036854775807L) {
                        xVar.a(pVar);
                        return 0;
                    }
                    xVar.f14005i = b0Var.c(xVar.h) - b0Var.b(j12);
                    xVar.a(pVar);
                    return 0;
                }
            }
            if (!this.f13776p) {
                this.f13776p = true;
                long j13 = xVar.f14005i;
                if (j13 != -9223372036854775807L) {
                    i10 = 1;
                    z12 = false;
                    i11 = i17;
                    h3.a aVar = new h3.a(new Object(), new a5.a(this.f13780t, xVar.f14000b), j13, 1 + j13, 0L, length, 188L, 940);
                    this.f13772l = aVar;
                    this.f13773m.d2(aVar.f11002a);
                } else {
                    i10 = 1;
                    z12 = false;
                    i11 = i17;
                    this.f13773m.d2(new c3.t(j13));
                }
            } else {
                i10 = 1;
                z12 = false;
                i11 = i17;
            }
            if (this.f13777q) {
                this.f13777q = z12;
                h(0L, 0L);
                if (pVar.getPosition() != 0) {
                    sVar.f4150a = 0L;
                    return i10;
                }
            }
            h3.a aVar2 = this.f13772l;
            if (aVar2 != null && aVar2.f11004c != null) {
                return aVar2.b(pVar, sVar);
            }
            pVar2 = pVar;
            r12 = z12;
        } else {
            pVar2 = pVar;
            r12 = 0;
            i10 = 1;
            i11 = i17;
        }
        e2.v vVar2 = this.d;
        byte[] bArr2 = vVar2.f8584a;
        if (9400 - vVar2.f8585b < 188) {
            int a11 = vVar2.a();
            if (a11 > 0) {
                System.arraycopy(bArr2, vVar2.f8585b, bArr2, r12, a11);
            }
            vVar2.H(a11, bArr2);
        }
        while (true) {
            int a12 = vVar2.a();
            SparseArray sparseArray = this.h;
            if (a12 < 188) {
                int i28 = vVar2.f8586c;
                int read = pVar2.read(bArr2, i28, 9400 - i28);
                if (read == -1) {
                    int i29 = r12;
                    while (i29 < sparseArray.size()) {
                        g0 g0Var = (g0) sparseArray.valueAt(i29);
                        if (g0Var instanceof w) {
                            w wVar = (w) g0Var;
                            if (z10 && !wVar.e()) {
                                i16 = r12;
                            } else {
                                i16 = i10;
                            }
                            if (wVar.f13991c == 3 && wVar.f13996j == -1 && ((!z10 || !(wVar.f13989a instanceof k)) && i16 != 0)) {
                                wVar.a(i10, new e2.v());
                            }
                        }
                        i29++;
                        i10 = 1;
                    }
                    return -1;
                }
                vVar2.I(i28 + read);
                i10 = 1;
            } else {
                int i30 = vVar2.f8585b;
                int i31 = vVar2.f8586c;
                byte[] bArr3 = vVar2.f8584a;
                int i32 = i30;
                while (i32 < i31 && bArr3[i32] != 71) {
                    i32++;
                }
                vVar2.J(i32);
                int i33 = i32 + 188;
                g0 g0Var2 = null;
                if (i33 > i31) {
                    int i34 = (i32 - i30) + this.f13779s;
                    this.f13779s = i34;
                    i12 = i11;
                    i13 = 2;
                    if (i12 == 2 && i34 > 376) {
                        throw s0.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i12 = i11;
                    i13 = 2;
                    this.f13779s = r12;
                }
                int i35 = vVar2.f8586c;
                if (i33 > i35) {
                    return r12;
                }
                int j14 = vVar2.j();
                if ((8388608 & j14) != 0) {
                    vVar2.J(i33);
                    return r12;
                }
                if ((4194304 & j14) != 0) {
                    i14 = 1;
                } else {
                    i14 = r12;
                }
                int i36 = (2096896 & j14) >> 8;
                if ((j14 & 32) != 0) {
                    z11 = true;
                } else {
                    z11 = r12;
                }
                if ((j14 & 16) != 0) {
                    g0Var2 = (g0) sparseArray.get(i36);
                }
                if (g0Var2 == null) {
                    vVar2.J(i33);
                    return r12;
                }
                if (i12 != i13) {
                    int i37 = j14 & 15;
                    SparseIntArray sparseIntArray = this.f13766e;
                    int i38 = sparseIntArray.get(i36, i37 - 1);
                    sparseIntArray.put(i36, i37);
                    if (i38 == i37) {
                        vVar2.J(i33);
                        return r12;
                    } else if (i37 != ((i38 + 1) & 15)) {
                        g0Var2.c();
                    }
                }
                if (z11) {
                    int x10 = vVar2.x();
                    if ((vVar2.x() & 64) != 0) {
                        i15 = i13;
                    } else {
                        i15 = r12;
                    }
                    i14 |= i15;
                    vVar2.K(x10 - 1);
                }
                boolean z13 = this.f13775o;
                if (i12 == i13 || z13 || !this.f13770j.get(i36, r12)) {
                    vVar2.I(i33);
                    g0Var2.a(i14, vVar2);
                    vVar2.I(i35);
                }
                if (i12 != i13 && !z13 && this.f13775o && length != -1) {
                    this.f13777q = true;
                }
                vVar2.J(i33);
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
