package l4;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import b8.kg;
import b8.ud;
import b8.zb;
import d2.v0;
import g2.l0;
import g9.i0;
import g9.s1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class d0 implements e3.o {
    public final int f17777a;
    public final int f17778b;
    public final List f17779c;
    public final g2.y d;
    public final SparseIntArray f17780e;
    public final f f17781f;
    public final b4.k f17782g;
    public final SparseArray h;
    public final SparseBooleanArray f17783i;
    public final SparseBooleanArray f17784j;
    public final x f17785k;
    public j3.a f17786l;
    public e3.q f17787m;
    public int f17788n;
    public boolean f17789o;
    public boolean f17790p;
    public boolean f17791q;
    public g0 f17792r;
    public int f17793s;
    public int f17794t;

    public d0(int i3, int i10, b4.k kVar, l0 l0Var, f fVar) {
        this.f17781f = fVar;
        this.f17777a = i3;
        this.f17778b = i10;
        this.f17782g = kVar;
        if (i3 != 1 && i3 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f17779c = arrayList;
            arrayList.add(l0Var);
        } else {
            this.f17779c = Collections.singletonList(l0Var);
        }
        this.d = new g2.y(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f17783i = sparseBooleanArray;
        this.f17784j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        this.f17780e = new SparseIntArray();
        this.f17785k = new x(1);
        this.f17787m = e3.q.f9505k;
        this.f17794t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i11 = 0; i11 < size; i11++) {
            sparseArray.put(sparseArray2.keyAt(i11), (g0) sparseArray2.valueAt(i11));
        }
        ?? obj = new Object();
        obj.f55095b = this;
        obj.f55094a = new c4.f(new byte[4], 4);
        sparseArray.put(0, new b0(obj));
        this.f17792r = null;
    }

    @Override
    public final boolean b(e3.p r7) {
        throw new UnsupportedOperationException("Method not decompiled: l4.d0.b(e3.p):boolean");
    }

    @Override
    public final void c(e3.q qVar) {
        if ((this.f17778b & 1) == 0) {
            qVar = new b4.n(qVar, this.f17782g);
        }
        this.f17787m = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        boolean z10;
        j3.a aVar;
        boolean z11;
        if (this.f17777a != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.p(z10);
        List list = this.f17779c;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            l0 l0Var = (l0) list.get(i3);
            if (l0Var.e() == -9223372036854775807L) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                long d = l0Var.d();
                if (d != -9223372036854775807L && d != 0 && d != j11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            if (z11) {
                l0Var.g(j11);
            }
        }
        if (j11 != 0 && (aVar = this.f17786l) != null) {
            aVar.d(j11);
        }
        this.d.K(0);
        this.f17780e.clear();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.h;
            if (i10 < sparseArray.size()) {
                ((g0) sparseArray.valueAt(i10)).a();
                i10++;
            } else {
                this.f17793s = 0;
                return;
            }
        }
    }

    @Override
    public final List e() {
        g9.g0 g0Var = i0.f12083b;
        return s1.f12146e;
    }

    @Override
    public final int f(e3.p pVar, e3.s sVar) {
        boolean z10;
        e3.p pVar2;
        ?? r12;
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        int i14;
        int i15;
        boolean z12;
        long length = pVar.getLength();
        int i16 = this.f17777a;
        if (i16 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f17789o) {
            int i17 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
            long j10 = -9223372036854775807L;
            x xVar = this.f17785k;
            if (i17 != 0 && !z10 && !xVar.d) {
                int i18 = this.f17794t;
                l0 l0Var = xVar.f18014b;
                g2.y yVar = xVar.f18015c;
                if (i18 <= 0) {
                    xVar.a(pVar);
                    return 0;
                } else if (!xVar.f18017f) {
                    long length2 = pVar.getLength();
                    int min = (int) Math.min(112800, length2);
                    long j11 = length2 - min;
                    if (pVar.getPosition() != j11) {
                        sVar.f9506a = j11;
                        return 1;
                    }
                    yVar.K(min);
                    pVar.o();
                    pVar.c(0, min, yVar.f11923a);
                    int i19 = yVar.f11924b;
                    int i20 = yVar.f11925c;
                    int i21 = i20 - 188;
                    while (true) {
                        if (i21 < i19) {
                            break;
                        }
                        byte[] bArr = yVar.f11923a;
                        int i22 = -4;
                        int i23 = 0;
                        while (true) {
                            if (i22 > 4) {
                                break;
                            }
                            int i24 = (i22 * 188) + i21;
                            if (i24 >= i19 && i24 < i20 && bArr[i24] == 71) {
                                i23++;
                                if (i23 == 5) {
                                    long a10 = ud.a(yVar, i21, i18);
                                    if (a10 != -9223372036854775807L) {
                                        j10 = a10;
                                        break;
                                    }
                                }
                            } else {
                                i23 = 0;
                            }
                            i22++;
                        }
                        i21--;
                    }
                    xVar.h = j10;
                    xVar.f18017f = true;
                    return 0;
                } else if (xVar.h == -9223372036854775807L) {
                    xVar.a(pVar);
                    return 0;
                } else if (!xVar.f18016e) {
                    int min2 = (int) Math.min(112800, pVar.getLength());
                    long j12 = 0;
                    if (pVar.getPosition() != j12) {
                        sVar.f9506a = j12;
                        return 1;
                    }
                    yVar.K(min2);
                    pVar.o();
                    pVar.c(0, min2, yVar.f11923a);
                    int i25 = yVar.f11924b;
                    int i26 = yVar.f11925c;
                    while (true) {
                        if (i25 >= i26) {
                            break;
                        }
                        if (yVar.f11923a[i25] == 71) {
                            long a11 = ud.a(yVar, i25, i18);
                            if (a11 != -9223372036854775807L) {
                                j10 = a11;
                                break;
                            }
                        }
                        i25++;
                    }
                    xVar.f18018g = j10;
                    xVar.f18016e = true;
                    return 0;
                } else {
                    long j13 = xVar.f18018g;
                    if (j13 == -9223372036854775807L) {
                        xVar.a(pVar);
                        return 0;
                    }
                    xVar.f18019i = l0Var.c(xVar.h) - l0Var.b(j13);
                    xVar.a(pVar);
                    return 0;
                }
            }
            if (!this.f17790p) {
                this.f17790p = true;
                long j14 = xVar.f18019i;
                if (j14 != -9223372036854775807L) {
                    i3 = 1;
                    z12 = false;
                    i10 = i16;
                    j3.a aVar = new j3.a(new v7.s(5), new kg(this.f17794t, xVar.f18014b), j14, 1 + j14, 0L, length, 188L, 940);
                    this.f17786l = aVar;
                    this.f17787m.f(aVar.f16175a);
                } else {
                    i3 = 1;
                    z12 = false;
                    i10 = i16;
                    this.f17787m.f(new e3.t(j14));
                }
            } else {
                i3 = 1;
                z12 = false;
                i10 = i16;
            }
            if (this.f17791q) {
                this.f17791q = z12;
                d(0L, 0L);
                if (pVar.getPosition() != 0) {
                    sVar.f9506a = 0L;
                    return i3;
                }
            }
            j3.a aVar2 = this.f17786l;
            if (aVar2 != null && aVar2.f16177c != null) {
                return aVar2.b(pVar, sVar);
            }
            pVar2 = pVar;
            r12 = z12;
        } else {
            pVar2 = pVar;
            r12 = 0;
            i3 = 1;
            i10 = i16;
        }
        g2.y yVar2 = this.d;
        byte[] bArr2 = yVar2.f11923a;
        if (9400 - yVar2.f11924b < 188) {
            int a12 = yVar2.a();
            if (a12 > 0) {
                System.arraycopy(bArr2, yVar2.f11924b, bArr2, r12, a12);
            }
            yVar2.L(a12, bArr2);
        }
        while (true) {
            int a13 = yVar2.a();
            SparseArray sparseArray = this.h;
            if (a13 < 188) {
                int i27 = yVar2.f11925c;
                int read = pVar2.read(bArr2, i27, 9400 - i27);
                if (read == -1) {
                    int i28 = r12;
                    while (i28 < sparseArray.size()) {
                        g0 g0Var = (g0) sparseArray.valueAt(i28);
                        if (g0Var instanceof w) {
                            w wVar = (w) g0Var;
                            if (z10 && !wVar.e()) {
                                i15 = r12;
                            } else {
                                i15 = i3;
                            }
                            if (wVar.f18005c == 3 && wVar.f18010j == -1 && ((!z10 || !(wVar.f18003a instanceof k)) && i15 != 0)) {
                                wVar.c(i3, new g2.y());
                            }
                        }
                        i28++;
                        i3 = 1;
                    }
                    return -1;
                }
                yVar2.M(i27 + read);
                i3 = 1;
            } else {
                int i29 = yVar2.f11924b;
                int i30 = yVar2.f11925c;
                byte[] bArr3 = yVar2.f11923a;
                int i31 = i29;
                while (i31 < i30 && bArr3[i31] != 71) {
                    i31++;
                }
                yVar2.N(i31);
                int i32 = i31 + 188;
                g0 g0Var2 = null;
                if (i32 > i30) {
                    int i33 = (i31 - i29) + this.f17793s;
                    this.f17793s = i33;
                    i11 = i10;
                    i12 = 2;
                    if (i11 == 2 && i33 > 376) {
                        throw v0.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i11 = i10;
                    i12 = 2;
                    this.f17793s = r12;
                }
                int i34 = yVar2.f11925c;
                if (i32 > i34) {
                    return r12;
                }
                int m10 = yVar2.m();
                if ((8388608 & m10) != 0) {
                    yVar2.N(i32);
                    return r12;
                }
                if ((4194304 & m10) != 0) {
                    i13 = 1;
                } else {
                    i13 = r12;
                }
                int i35 = (2096896 & m10) >> 8;
                if ((m10 & 32) != 0) {
                    z11 = true;
                } else {
                    z11 = r12;
                }
                if ((m10 & 16) != 0) {
                    g0Var2 = (g0) sparseArray.get(i35);
                }
                if (g0Var2 == null) {
                    yVar2.N(i32);
                    return r12;
                }
                if (i11 != i12) {
                    int i36 = m10 & 15;
                    SparseIntArray sparseIntArray = this.f17780e;
                    int i37 = sparseIntArray.get(i35, i36 - 1);
                    sparseIntArray.put(i35, i36);
                    if (i37 == i36) {
                        yVar2.N(i32);
                        return r12;
                    } else if (i36 != ((i37 + 1) & 15)) {
                        g0Var2.a();
                    }
                }
                if (z11) {
                    int A = yVar2.A();
                    if ((yVar2.A() & 64) != 0) {
                        i14 = i12;
                    } else {
                        i14 = r12;
                    }
                    i13 |= i14;
                    yVar2.O(A - 1);
                }
                boolean z13 = this.f17789o;
                if (i11 == i12 || z13 || !this.f17784j.get(i35, r12)) {
                    yVar2.M(i32);
                    g0Var2.c(i13, yVar2);
                    yVar2.M(i34);
                }
                if (i11 != i12 && !z13 && this.f17789o && length != -1) {
                    this.f17791q = true;
                }
                yVar2.N(i32);
                return r12;
            }
        }
    }

    @Override
    public final e3.o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
