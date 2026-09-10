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
public final class e0 implements c3.o {
    public final int f11557a;
    public final int f11558b;
    public final List f11559c;
    public final e2.v d;
    public final SparseIntArray e;
    public final f f11560f;
    public final z3.k f11561g;
    public final SparseArray h;
    public final SparseBooleanArray f11562i;
    public final SparseBooleanArray f11563j;
    public final y f11564k;
    public h3.a f11565l;
    public c3.q f11566m;
    public int f11567n;
    public boolean f11568o;
    public boolean f11569p;
    public boolean f11570q;
    public h0 f11571r;
    public int f11572s;
    public int f11573t;

    public e0(int i10, int i11, z3.k kVar, e2.b0 b0Var, f fVar) {
        this.f11560f = fVar;
        this.f11557a = i10;
        this.f11558b = i11;
        this.f11561g = kVar;
        if (i10 != 1 && i10 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f11559c = arrayList;
            arrayList.add(b0Var);
        } else {
            this.f11559c = Collections.singletonList(b0Var);
        }
        this.d = new e2.v(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f11562i = sparseBooleanArray;
        this.f11563j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        this.e = new SparseIntArray();
        this.f11564k = new y(1);
        this.f11566m = c3.q.f4211p;
        this.f11573t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i12 = 0; i12 < size; i12++) {
            sparseArray.put(sparseArray2.keyAt(i12), (h0) sparseArray2.valueAt(i12));
        }
        sparseArray.put(0, new c0(new n4.y(this)));
        this.f11571r = null;
    }

    @Override
    public final boolean b(c3.p r7) {
        throw new UnsupportedOperationException("Method not decompiled: j4.e0.b(c3.p):boolean");
    }

    @Override
    public final void g(c3.q qVar) {
        if ((this.f11558b & 1) == 0) {
            qVar = new com.google.firebase.messaging.m(qVar, this.f11561g);
        }
        this.f11566m = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        boolean z10;
        h3.a aVar;
        boolean z11;
        if (this.f11557a != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        List list = this.f11559c;
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
        if (j10 != 0 && (aVar = this.f11565l) != null) {
            aVar.d(j10);
        }
        this.d.G(0);
        this.e.clear();
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.h;
            if (i11 < sparseArray.size()) {
                ((h0) sparseArray.valueAt(i11)).b();
                i11++;
            } else {
                this.f11572s = 0;
                return;
            }
        }
    }

    @Override
    public final List i() {
        e9.g0 g0Var = i0.f7384b;
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
        int i16 = this.f11557a;
        if (i16 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f11568o) {
            long j3 = -9223372036854775807L;
            y yVar = this.f11564k;
            if (length != -1 && !z10 && !yVar.d) {
                int i17 = this.f11573t;
                e2.b0 b0Var = yVar.f11758b;
                e2.v vVar = yVar.f11759c;
                if (i17 <= 0) {
                    yVar.a(pVar);
                    return 0;
                } else if (!yVar.f11760f) {
                    long length2 = pVar.getLength();
                    int min = (int) Math.min(112800, length2);
                    long j10 = length2 - min;
                    if (pVar.getPosition() != j10) {
                        sVar.f4212a = j10;
                        return 1;
                    }
                    vVar.G(min);
                    pVar.p();
                    pVar.b(0, min, vVar.f7234a);
                    int i18 = vVar.f7235b;
                    int i19 = vVar.f7236c;
                    int i20 = i19 - 188;
                    while (true) {
                        if (i20 < i18) {
                            break;
                        }
                        byte[] bArr = vVar.f7234a;
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
                    yVar.h = j3;
                    yVar.f11760f = true;
                    return 0;
                } else if (yVar.h == -9223372036854775807L) {
                    yVar.a(pVar);
                    return 0;
                } else if (!yVar.e) {
                    int min2 = (int) Math.min(112800, pVar.getLength());
                    long j11 = 0;
                    if (pVar.getPosition() != j11) {
                        sVar.f4212a = j11;
                        return 1;
                    }
                    vVar.G(min2);
                    pVar.p();
                    pVar.b(0, min2, vVar.f7234a);
                    int i24 = vVar.f7235b;
                    int i25 = vVar.f7236c;
                    while (true) {
                        if (i24 >= i25) {
                            break;
                        }
                        if (vVar.f7234a[i24] == 71) {
                            long a10 = t8.a(vVar, i24, i17);
                            if (a10 != -9223372036854775807L) {
                                j3 = a10;
                                break;
                            }
                        }
                        i24++;
                    }
                    yVar.f11761g = j3;
                    yVar.e = true;
                    return 0;
                } else {
                    long j12 = yVar.f11761g;
                    if (j12 == -9223372036854775807L) {
                        yVar.a(pVar);
                        return 0;
                    }
                    yVar.f11762i = b0Var.c(yVar.h) - b0Var.b(j12);
                    yVar.a(pVar);
                    return 0;
                }
            }
            if (!this.f11569p) {
                this.f11569p = true;
                long j13 = yVar.f11762i;
                if (j13 != -9223372036854775807L) {
                    i10 = i16;
                    z13 = false;
                    i15 = 1;
                    h3.a aVar = new h3.a(new rb.a(5), new a5.a(this.f11573t, yVar.f11758b), j13, j13 + 1, 0L, length, 188L, 940);
                    this.f11565l = aVar;
                    this.f11566m.G(aVar.f9226a);
                } else {
                    i10 = i16;
                    z13 = false;
                    i15 = 1;
                    this.f11566m.G(new c3.t(j13));
                }
            } else {
                i10 = i16;
                z13 = false;
                i15 = 1;
            }
            if (this.f11570q) {
                this.f11570q = z13;
                h(0L, 0L);
                if (pVar.getPosition() != 0) {
                    sVar.f4212a = 0L;
                    return i15;
                }
            }
            h3.a aVar2 = this.f11565l;
            if (aVar2 != null && aVar2.f9228c != null) {
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
        byte[] bArr2 = vVar2.f7234a;
        if (9400 - vVar2.f7235b < 188) {
            int a11 = vVar2.a();
            if (a11 > 0) {
                System.arraycopy(bArr2, vVar2.f7235b, bArr2, r12, a11);
            }
            vVar2.H(a11, bArr2);
        }
        while (true) {
            int a12 = vVar2.a();
            SparseArray sparseArray = this.h;
            if (a12 < 188) {
                int i26 = vVar2.f7236c;
                int read = pVar2.read(bArr2, i26, 9400 - i26);
                if (read == -1) {
                    for (int i27 = 0; i27 < sparseArray.size(); i27++) {
                        h0 h0Var = (h0) sparseArray.valueAt(i27);
                        if (h0Var instanceof x) {
                            x xVar = (x) h0Var;
                            if (z10 && !xVar.e()) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            if (xVar.f11750c == 3 && xVar.f11754j == -1 && ((!z10 || !(xVar.f11748a instanceof k)) && z12)) {
                                xVar.a(1, new e2.v());
                            }
                        }
                    }
                    return -1;
                }
                vVar2.I(i26 + read);
            } else {
                int i28 = vVar2.f7235b;
                int i29 = vVar2.f7236c;
                byte[] bArr3 = vVar2.f7234a;
                int i30 = i28;
                while (i30 < i29 && bArr3[i30] != 71) {
                    i30++;
                }
                vVar2.J(i30);
                int i31 = i30 + 188;
                h0 h0Var2 = null;
                if (i31 > i29) {
                    int i32 = (i30 - i28) + this.f11572s;
                    this.f11572s = i32;
                    i11 = i10;
                    i12 = 2;
                    if (i11 == 2 && i32 > 376) {
                        throw s0.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i11 = i10;
                    i12 = 2;
                    this.f11572s = r12;
                }
                int i33 = vVar2.f7236c;
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
                    h0Var2 = (h0) sparseArray.get(i34);
                }
                if (h0Var2 == null) {
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
                        h0Var2.b();
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
                boolean z14 = this.f11568o;
                if (i11 == i12 || z14 || !this.f11563j.get(i34, r12)) {
                    vVar2.I(i31);
                    h0Var2.a(i13, vVar2);
                    vVar2.I(i33);
                }
                if (i11 != i12 && !z14 && this.f11568o && length != -1) {
                    this.f11570q = true;
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
