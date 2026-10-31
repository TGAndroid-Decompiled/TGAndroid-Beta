package j4;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import b2.w0;
import e2.k0;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v7.l8;
import v7.t6;
public final class e0 implements c3.o {
    public final int f9454a;
    public final int f9455b;
    public final List f9456c;
    public final e2.x d;
    public final SparseIntArray e;
    public final f f9457f;
    public final z3.k f9458g;
    public final SparseArray h;
    public final SparseBooleanArray f9459i;
    public final SparseBooleanArray f9460j;
    public final y f9461k;
    public h3.a f9462l;
    public c3.q f9463m;
    public int f9464n;
    public boolean f9465o;
    public boolean f9466p;
    public boolean f9467q;
    public h0 f9468r;
    public int f9469s;
    public int f9470t;

    public e0(int i10, int i11, z3.k kVar, k0 k0Var, f fVar) {
        this.f9457f = fVar;
        this.f9454a = i10;
        this.f9455b = i11;
        this.f9458g = kVar;
        if (i10 != 1 && i10 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f9456c = arrayList;
            arrayList.add(k0Var);
        } else {
            this.f9456c = Collections.singletonList(k0Var);
        }
        this.d = new e2.x(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f9459i = sparseBooleanArray;
        this.f9460j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        this.e = new SparseIntArray();
        this.f9461k = new y(1);
        this.f9463m = c3.q.f3686i;
        this.f9470t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i12 = 0; i12 < size; i12++) {
            sparseArray.put(sparseArray2.keyAt(i12), (h0) sparseArray2.valueAt(i12));
        }
        sparseArray.put(0, new c0(new hf.b(this)));
        this.f9468r = null;
    }

    @Override
    public final boolean a(c3.p r7) {
        throw new UnsupportedOperationException("Method not decompiled: j4.e0.a(c3.p):boolean");
    }

    @Override
    public final void c(c3.q qVar) {
        if ((this.f9455b & 1) == 0) {
            qVar = new ac.a(qVar, this.f9458g);
        }
        this.f9463m = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        boolean z10;
        h3.a aVar;
        boolean z11;
        if (this.f9454a != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.p(z10);
        List list = this.f9456c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            k0 k0Var = (k0) list.get(i10);
            if (k0Var.e() == -9223372036854775807L) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                long d = k0Var.d();
                if (d != -9223372036854775807L && d != 0 && d != j11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            if (z11) {
                k0Var.g(j11);
            }
        }
        if (j11 != 0 && (aVar = this.f9462l) != null) {
            aVar.d(j11);
        }
        this.d.K(0);
        this.e.clear();
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.h;
            if (i11 < sparseArray.size()) {
                ((h0) sparseArray.valueAt(i11)).e();
                i11++;
            } else {
                this.f9469s = 0;
                return;
            }
        }
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f6390b;
        return x1.e;
    }

    @Override
    public final int f(c3.p pVar, c3.s sVar) {
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
        int i17 = this.f9454a;
        if (i17 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f9465o) {
            int i18 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
            long j10 = -9223372036854775807L;
            y yVar = this.f9461k;
            if (i18 != 0 && !z10 && !yVar.d) {
                int i19 = this.f9470t;
                k0 k0Var = yVar.f9655b;
                e2.x xVar = yVar.f9656c;
                if (i19 <= 0) {
                    yVar.a(pVar);
                    return 0;
                } else if (!yVar.f9657f) {
                    long length2 = pVar.getLength();
                    int min = (int) Math.min(112800, length2);
                    long j11 = length2 - min;
                    if (pVar.getPosition() != j11) {
                        sVar.f3687a = j11;
                        return 1;
                    }
                    xVar.K(min);
                    pVar.m();
                    pVar.b(0, min, xVar.f6207a);
                    int i20 = xVar.f6208b;
                    int i21 = xVar.f6209c;
                    int i22 = i21 - 188;
                    while (true) {
                        if (i22 < i20) {
                            break;
                        }
                        byte[] bArr = xVar.f6207a;
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
                                    long a2 = l8.a(xVar, i22, i19);
                                    if (a2 != -9223372036854775807L) {
                                        j10 = a2;
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
                    yVar.h = j10;
                    yVar.f9657f = true;
                    return 0;
                } else if (yVar.h == -9223372036854775807L) {
                    yVar.a(pVar);
                    return 0;
                } else if (!yVar.e) {
                    int min2 = (int) Math.min(112800, pVar.getLength());
                    long j12 = 0;
                    if (pVar.getPosition() != j12) {
                        sVar.f3687a = j12;
                        return 1;
                    }
                    xVar.K(min2);
                    pVar.m();
                    pVar.b(0, min2, xVar.f6207a);
                    int i26 = xVar.f6208b;
                    int i27 = xVar.f6209c;
                    while (true) {
                        if (i26 >= i27) {
                            break;
                        }
                        if (xVar.f6207a[i26] == 71) {
                            long a10 = l8.a(xVar, i26, i19);
                            if (a10 != -9223372036854775807L) {
                                j10 = a10;
                                break;
                            }
                        }
                        i26++;
                    }
                    yVar.f9658g = j10;
                    yVar.e = true;
                    return 0;
                } else {
                    long j13 = yVar.f9658g;
                    if (j13 == -9223372036854775807L) {
                        yVar.a(pVar);
                        return 0;
                    }
                    yVar.f9659i = k0Var.c(yVar.h) - k0Var.b(j13);
                    yVar.a(pVar);
                    return 0;
                }
            }
            if (!this.f9466p) {
                this.f9466p = true;
                long j14 = yVar.f9659i;
                if (j14 != -9223372036854775807L) {
                    i10 = 1;
                    z12 = false;
                    i11 = i17;
                    h3.a aVar = new h3.a(new hb.a(4), new a5.a(this.f9470t, yVar.f9655b), j14, 1 + j14, 0L, length, 188L, 940);
                    this.f9462l = aVar;
                    this.f9463m.G1(aVar.f7602a);
                } else {
                    i10 = 1;
                    z12 = false;
                    i11 = i17;
                    this.f9463m.G1(new c3.t(j14));
                }
            } else {
                i10 = 1;
                z12 = false;
                i11 = i17;
            }
            if (this.f9467q) {
                this.f9467q = z12;
                d(0L, 0L);
                if (pVar.getPosition() != 0) {
                    sVar.f3687a = 0L;
                    return i10;
                }
            }
            h3.a aVar2 = this.f9462l;
            if (aVar2 != null && aVar2.f7604c != null) {
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
        e2.x xVar2 = this.d;
        byte[] bArr2 = xVar2.f6207a;
        if (9400 - xVar2.f6208b < 188) {
            int a11 = xVar2.a();
            if (a11 > 0) {
                System.arraycopy(bArr2, xVar2.f6208b, bArr2, r12, a11);
            }
            xVar2.L(a11, bArr2);
        }
        while (true) {
            int a12 = xVar2.a();
            SparseArray sparseArray = this.h;
            if (a12 < 188) {
                int i28 = xVar2.f6209c;
                int read = pVar2.read(bArr2, i28, 9400 - i28);
                if (read == -1) {
                    int i29 = r12;
                    while (i29 < sparseArray.size()) {
                        h0 h0Var = (h0) sparseArray.valueAt(i29);
                        if (h0Var instanceof x) {
                            x xVar3 = (x) h0Var;
                            if (z10 && !xVar3.c()) {
                                i16 = r12;
                            } else {
                                i16 = i10;
                            }
                            if (xVar3.f9647c == 3 && xVar3.f9651j == -1 && ((!z10 || !(xVar3.f9645a instanceof k)) && i16 != 0)) {
                                xVar3.a(i10, new e2.x());
                            }
                        }
                        i29++;
                        i10 = 1;
                    }
                    return -1;
                }
                xVar2.M(i28 + read);
                i10 = 1;
            } else {
                int i30 = xVar2.f6208b;
                int i31 = xVar2.f6209c;
                byte[] bArr3 = xVar2.f6207a;
                int i32 = i30;
                while (i32 < i31 && bArr3[i32] != 71) {
                    i32++;
                }
                xVar2.N(i32);
                int i33 = i32 + 188;
                h0 h0Var2 = null;
                if (i33 > i31) {
                    int i34 = (i32 - i30) + this.f9469s;
                    this.f9469s = i34;
                    i12 = i11;
                    i13 = 2;
                    if (i12 == 2 && i34 > 376) {
                        throw w0.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i12 = i11;
                    i13 = 2;
                    this.f9469s = r12;
                }
                int i35 = xVar2.f6209c;
                if (i33 > i35) {
                    return r12;
                }
                int m10 = xVar2.m();
                if ((8388608 & m10) != 0) {
                    xVar2.N(i33);
                    return r12;
                }
                if ((4194304 & m10) != 0) {
                    i14 = 1;
                } else {
                    i14 = r12;
                }
                int i36 = (2096896 & m10) >> 8;
                if ((m10 & 32) != 0) {
                    z11 = true;
                } else {
                    z11 = r12;
                }
                if ((m10 & 16) != 0) {
                    h0Var2 = (h0) sparseArray.get(i36);
                }
                if (h0Var2 == null) {
                    xVar2.N(i33);
                    return r12;
                }
                if (i12 != i13) {
                    int i37 = m10 & 15;
                    SparseIntArray sparseIntArray = this.e;
                    int i38 = sparseIntArray.get(i36, i37 - 1);
                    sparseIntArray.put(i36, i37);
                    if (i38 == i37) {
                        xVar2.N(i33);
                        return r12;
                    } else if (i37 != ((i38 + 1) & 15)) {
                        h0Var2.e();
                    }
                }
                if (z11) {
                    int A = xVar2.A();
                    if ((xVar2.A() & 64) != 0) {
                        i15 = i13;
                    } else {
                        i15 = r12;
                    }
                    i14 |= i15;
                    xVar2.O(A - 1);
                }
                boolean z13 = this.f9465o;
                if (i12 == i13 || z13 || !this.f9460j.get(i36, r12)) {
                    xVar2.M(i33);
                    h0Var2.a(i14, xVar2);
                    xVar2.M(i35);
                }
                if (i12 != i13 && !z13 && this.f9465o && length != -1) {
                    this.f9467q = true;
                }
                xVar2.N(i33);
                return r12;
            }
        }
    }

    @Override
    public final c3.o b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
