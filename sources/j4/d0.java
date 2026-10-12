package j4;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import b2.x0;
import e2.k0;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v7.m8;
import v7.u6;
public final class d0 implements c3.o {
    public final int f12600a;
    public final int f12601b;
    public final List f12602c;
    public final e2.x d;
    public final SparseIntArray e;
    public final f f12603f;
    public final z3.l f12604g;
    public final SparseArray h;
    public final SparseBooleanArray f12605i;
    public final SparseBooleanArray f12606j;
    public final x f12607k;
    public h3.a f12608l;
    public c3.q f12609m;
    public int f12610n;
    public boolean f12611o;
    public boolean f12612p;
    public boolean f12613q;
    public g0 f12614r;
    public int f12615s;
    public int f12616t;

    public d0(int i10, int i11, z3.l lVar, k0 k0Var, f fVar) {
        this.f12603f = fVar;
        this.f12600a = i10;
        this.f12601b = i11;
        this.f12604g = lVar;
        if (i10 != 1 && i10 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f12602c = arrayList;
            arrayList.add(k0Var);
        } else {
            this.f12602c = Collections.singletonList(k0Var);
        }
        this.d = new e2.x(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f12605i = sparseBooleanArray;
        this.f12606j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        this.e = new SparseIntArray();
        this.f12607k = new x(1);
        this.f12609m = c3.q.f4278i;
        this.f12616t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i12 = 0; i12 < size; i12++) {
            sparseArray.put(sparseArray2.keyAt(i12), (g0) sparseArray2.valueAt(i12));
        }
        sparseArray.put(0, new b0(new qf.b(this)));
        this.f12614r = null;
    }

    @Override
    public final boolean a(c3.p r7) {
        throw new UnsupportedOperationException("Method not decompiled: j4.d0.a(c3.p):boolean");
    }

    @Override
    public final void c(c3.q qVar) {
        if ((this.f12601b & 1) == 0) {
            qVar = new c2.b(qVar, this.f12604g);
        }
        this.f12609m = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        boolean z10;
        h3.a aVar;
        boolean z11;
        if (this.f12600a != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        List list = this.f12602c;
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
        if (j11 != 0 && (aVar = this.f12608l) != null) {
            aVar.d(j11);
        }
        this.d.K(0);
        this.e.clear();
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.h;
            if (i11 < sparseArray.size()) {
                ((g0) sparseArray.valueAt(i11)).c();
                i11++;
            } else {
                this.f12615s = 0;
                return;
            }
        }
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8592b;
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
        int i17 = this.f12600a;
        if (i17 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f12611o) {
            int i18 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
            long j10 = -9223372036854775807L;
            x xVar = this.f12607k;
            if (i18 != 0 && !z10 && !xVar.d) {
                int i19 = this.f12616t;
                k0 k0Var = xVar.f12818b;
                e2.x xVar2 = xVar.f12819c;
                if (i19 <= 0) {
                    xVar.a(pVar);
                    return 0;
                } else if (!xVar.f12820f) {
                    long length2 = pVar.getLength();
                    int min = (int) Math.min(112800, length2);
                    long j11 = length2 - min;
                    if (pVar.getPosition() != j11) {
                        sVar.f4279a = j11;
                        return 1;
                    }
                    xVar2.K(min);
                    pVar.q();
                    pVar.a(0, min, xVar2.f8411a);
                    int i20 = xVar2.f8412b;
                    int i21 = xVar2.f8413c;
                    int i22 = i21 - 188;
                    while (true) {
                        if (i22 < i20) {
                            break;
                        }
                        byte[] bArr = xVar2.f8411a;
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
                                    long a2 = m8.a(xVar2, i22, i19);
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
                    xVar.h = j10;
                    xVar.f12820f = true;
                    return 0;
                } else if (xVar.h == -9223372036854775807L) {
                    xVar.a(pVar);
                    return 0;
                } else if (!xVar.e) {
                    int min2 = (int) Math.min(112800, pVar.getLength());
                    long j12 = 0;
                    if (pVar.getPosition() != j12) {
                        sVar.f4279a = j12;
                        return 1;
                    }
                    xVar2.K(min2);
                    pVar.q();
                    pVar.a(0, min2, xVar2.f8411a);
                    int i26 = xVar2.f8412b;
                    int i27 = xVar2.f8413c;
                    while (true) {
                        if (i26 >= i27) {
                            break;
                        }
                        if (xVar2.f8411a[i26] == 71) {
                            long a10 = m8.a(xVar2, i26, i19);
                            if (a10 != -9223372036854775807L) {
                                j10 = a10;
                                break;
                            }
                        }
                        i26++;
                    }
                    xVar.f12821g = j10;
                    xVar.e = true;
                    return 0;
                } else {
                    long j13 = xVar.f12821g;
                    if (j13 == -9223372036854775807L) {
                        xVar.a(pVar);
                        return 0;
                    }
                    xVar.f12822i = k0Var.c(xVar.h) - k0Var.b(j13);
                    xVar.a(pVar);
                    return 0;
                }
            }
            if (!this.f12612p) {
                this.f12612p = true;
                long j14 = xVar.f12822i;
                if (j14 != -9223372036854775807L) {
                    i10 = 1;
                    z12 = false;
                    i11 = i17;
                    h3.a aVar = new h3.a(new t7.u(3), new a5.a(this.f12616t, xVar.f12818b), j14, 1 + j14, 0L, length, 188L, 940);
                    this.f12608l = aVar;
                    this.f12609m.K(aVar.f10341a);
                } else {
                    i10 = 1;
                    z12 = false;
                    i11 = i17;
                    this.f12609m.K(new c3.t(j14));
                }
            } else {
                i10 = 1;
                z12 = false;
                i11 = i17;
            }
            if (this.f12613q) {
                this.f12613q = z12;
                d(0L, 0L);
                if (pVar.getPosition() != 0) {
                    sVar.f4279a = 0L;
                    return i10;
                }
            }
            h3.a aVar2 = this.f12608l;
            if (aVar2 != null && aVar2.f10343c != null) {
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
        e2.x xVar3 = this.d;
        byte[] bArr2 = xVar3.f8411a;
        if (9400 - xVar3.f8412b < 188) {
            int a11 = xVar3.a();
            if (a11 > 0) {
                System.arraycopy(bArr2, xVar3.f8412b, bArr2, r12, a11);
            }
            xVar3.L(a11, bArr2);
        }
        while (true) {
            int a12 = xVar3.a();
            SparseArray sparseArray = this.h;
            if (a12 < 188) {
                int i28 = xVar3.f8413c;
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
                            if (wVar.f12810c == 3 && wVar.f12814j == -1 && ((!z10 || !(wVar.f12808a instanceof k)) && i16 != 0)) {
                                wVar.a(i10, new e2.x());
                            }
                        }
                        i29++;
                        i10 = 1;
                    }
                    return -1;
                }
                xVar3.M(i28 + read);
                i10 = 1;
            } else {
                int i30 = xVar3.f8412b;
                int i31 = xVar3.f8413c;
                byte[] bArr3 = xVar3.f8411a;
                int i32 = i30;
                while (i32 < i31 && bArr3[i32] != 71) {
                    i32++;
                }
                xVar3.N(i32);
                int i33 = i32 + 188;
                g0 g0Var2 = null;
                if (i33 > i31) {
                    int i34 = (i32 - i30) + this.f12615s;
                    this.f12615s = i34;
                    i12 = i11;
                    i13 = 2;
                    if (i12 == 2 && i34 > 376) {
                        throw x0.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i12 = i11;
                    i13 = 2;
                    this.f12615s = r12;
                }
                int i35 = xVar3.f8413c;
                if (i33 > i35) {
                    return r12;
                }
                int m10 = xVar3.m();
                if ((8388608 & m10) != 0) {
                    xVar3.N(i33);
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
                    g0Var2 = (g0) sparseArray.get(i36);
                }
                if (g0Var2 == null) {
                    xVar3.N(i33);
                    return r12;
                }
                if (i12 != i13) {
                    int i37 = m10 & 15;
                    SparseIntArray sparseIntArray = this.e;
                    int i38 = sparseIntArray.get(i36, i37 - 1);
                    sparseIntArray.put(i36, i37);
                    if (i38 == i37) {
                        xVar3.N(i33);
                        return r12;
                    } else if (i37 != ((i38 + 1) & 15)) {
                        g0Var2.c();
                    }
                }
                if (z11) {
                    int A = xVar3.A();
                    if ((xVar3.A() & 64) != 0) {
                        i15 = i13;
                    } else {
                        i15 = r12;
                    }
                    i14 |= i15;
                    xVar3.O(A - 1);
                }
                boolean z13 = this.f12611o;
                if (i12 == i13 || z13 || !this.f12606j.get(i36, r12)) {
                    xVar3.M(i33);
                    g0Var2.a(i14, xVar3);
                    xVar3.M(i35);
                }
                if (i12 != i13 && !z13 && this.f12611o && length != -1) {
                    this.f12613q = true;
                }
                xVar3.N(i33);
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
