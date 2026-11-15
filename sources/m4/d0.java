package m4;

import a8.ja;
import a8.xa;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import c8.n9;
import e2.t0;
import h2.k0;
import h9.i0;
import h9.s1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class d0 implements f3.o {
    public final int f20207a;
    public final int f20208b;
    public final List f20209c;
    public final h2.x d;
    public final SparseIntArray f20210e;
    public final f f20211f;
    public final c4.k f20212g;
    public final SparseArray h;
    public final SparseBooleanArray f20213i;
    public final SparseBooleanArray f20214j;
    public final x f20215k;
    public k3.a f20216l;
    public f3.q f20217m;
    public int f20218n;
    public boolean f20219o;
    public boolean f20220p;
    public boolean f20221q;
    public g0 f20222r;
    public int f20223s;
    public int f20224t;

    public d0(int i7, int i10, c4.k kVar, k0 k0Var, f fVar) {
        this.f20211f = fVar;
        this.f20207a = i7;
        this.f20208b = i10;
        this.f20212g = kVar;
        if (i7 != 1 && i7 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f20209c = arrayList;
            arrayList.add(k0Var);
        } else {
            this.f20209c = Collections.singletonList(k0Var);
        }
        this.d = new h2.x(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f20213i = sparseBooleanArray;
        this.f20214j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        this.f20210e = new SparseIntArray();
        this.f20215k = new x(1);
        this.f20217m = f3.q.f10876q;
        this.f20224t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i11 = 0; i11 < size; i11++) {
            sparseArray.put(sparseArray2.keyAt(i11), (g0) sparseArray2.valueAt(i11));
        }
        sparseArray.put(0, new b0(new ji.j(this)));
        this.f20222r = null;
    }

    @Override
    public final boolean b(f3.p r7) {
        throw new UnsupportedOperationException("Method not decompiled: m4.d0.b(f3.p):boolean");
    }

    @Override
    public final void c(f3.q qVar) {
        if ((this.f20208b & 1) == 0) {
            qVar = new ab.q(qVar, this.f20212g);
        }
        this.f20217m = qVar;
    }

    @Override
    public final void d(long j3, long j10) {
        boolean z10;
        k3.a aVar;
        boolean z11;
        if (this.f20207a != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.p(z10);
        List list = this.f20209c;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            k0 k0Var = (k0) list.get(i7);
            if (k0Var.e() == -9223372036854775807L) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                long d = k0Var.d();
                if (d != -9223372036854775807L && d != 0 && d != j10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            if (z11) {
                k0Var.g(j10);
            }
        }
        if (j10 != 0 && (aVar = this.f20216l) != null) {
            aVar.d(j10);
        }
        this.d.K(0);
        this.f20210e.clear();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.h;
            if (i10 < sparseArray.size()) {
                ((g0) sparseArray.valueAt(i10)).d();
                i10++;
            } else {
                this.f20223s = 0;
                return;
            }
        }
    }

    @Override
    public final List e() {
        h9.g0 g0Var = i0.f13686b;
        return s1.f13749e;
    }

    @Override
    public final int f(f3.p pVar, f3.s sVar) {
        boolean z10;
        f3.p pVar2;
        ?? r12;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        int i14;
        int i15;
        boolean z12;
        long length = pVar.getLength();
        int i16 = this.f20207a;
        if (i16 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f20219o) {
            int i17 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
            long j3 = -9223372036854775807L;
            x xVar = this.f20215k;
            if (i17 != 0 && !z10 && !xVar.d) {
                int i18 = this.f20224t;
                k0 k0Var = xVar.f20444b;
                h2.x xVar2 = xVar.f20445c;
                if (i18 <= 0) {
                    xVar.a(pVar);
                    return 0;
                } else if (!xVar.f20447f) {
                    long length2 = pVar.getLength();
                    int min = (int) Math.min(112800, length2);
                    long j10 = length2 - min;
                    if (pVar.getPosition() != j10) {
                        sVar.f10877a = j10;
                        return 1;
                    }
                    xVar2.K(min);
                    pVar.l();
                    pVar.c(0, min, xVar2.f13521a);
                    int i19 = xVar2.f13522b;
                    int i20 = xVar2.f13523c;
                    int i21 = i20 - 188;
                    while (true) {
                        if (i21 < i19) {
                            break;
                        }
                        byte[] bArr = xVar2.f13521a;
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
                                    long a10 = n9.a(xVar2, i21, i18);
                                    if (a10 != -9223372036854775807L) {
                                        j3 = a10;
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
                    xVar.h = j3;
                    xVar.f20447f = true;
                    return 0;
                } else if (xVar.h == -9223372036854775807L) {
                    xVar.a(pVar);
                    return 0;
                } else if (!xVar.f20446e) {
                    int min2 = (int) Math.min(112800, pVar.getLength());
                    long j11 = 0;
                    if (pVar.getPosition() != j11) {
                        sVar.f10877a = j11;
                        return 1;
                    }
                    xVar2.K(min2);
                    pVar.l();
                    pVar.c(0, min2, xVar2.f13521a);
                    int i25 = xVar2.f13522b;
                    int i26 = xVar2.f13523c;
                    while (true) {
                        if (i25 >= i26) {
                            break;
                        }
                        if (xVar2.f13521a[i25] == 71) {
                            long a11 = n9.a(xVar2, i25, i18);
                            if (a11 != -9223372036854775807L) {
                                j3 = a11;
                                break;
                            }
                        }
                        i25++;
                    }
                    xVar.f20448g = j3;
                    xVar.f20446e = true;
                    return 0;
                } else {
                    long j12 = xVar.f20448g;
                    if (j12 == -9223372036854775807L) {
                        xVar.a(pVar);
                        return 0;
                    }
                    xVar.f20449i = k0Var.c(xVar.h) - k0Var.b(j12);
                    xVar.a(pVar);
                    return 0;
                }
            }
            if (!this.f20220p) {
                this.f20220p = true;
                long j13 = xVar.f20449i;
                if (j13 != -9223372036854775807L) {
                    i7 = 1;
                    z12 = false;
                    i10 = i16;
                    k3.a aVar = new k3.a(new pb.b(8), new xa(this.f20224t, xVar.f20444b), j13, 1 + j13, 0L, length, 188L, 940);
                    this.f20216l = aVar;
                    this.f20217m.f(aVar.f17750a);
                } else {
                    i7 = 1;
                    z12 = false;
                    i10 = i16;
                    this.f20217m.f(new f3.t(j13));
                }
            } else {
                i7 = 1;
                z12 = false;
                i10 = i16;
            }
            if (this.f20221q) {
                this.f20221q = z12;
                d(0L, 0L);
                if (pVar.getPosition() != 0) {
                    sVar.f10877a = 0L;
                    return i7;
                }
            }
            k3.a aVar2 = this.f20216l;
            if (aVar2 != null && aVar2.f17752c != null) {
                return aVar2.b(pVar, sVar);
            }
            pVar2 = pVar;
            r12 = z12;
        } else {
            pVar2 = pVar;
            r12 = 0;
            i7 = 1;
            i10 = i16;
        }
        h2.x xVar3 = this.d;
        byte[] bArr2 = xVar3.f13521a;
        if (9400 - xVar3.f13522b < 188) {
            int a12 = xVar3.a();
            if (a12 > 0) {
                System.arraycopy(bArr2, xVar3.f13522b, bArr2, r12, a12);
            }
            xVar3.L(a12, bArr2);
        }
        while (true) {
            int a13 = xVar3.a();
            SparseArray sparseArray = this.h;
            if (a13 < 188) {
                int i27 = xVar3.f13523c;
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
                                i15 = i7;
                            }
                            if (wVar.f20435c == 3 && wVar.f20440j == -1 && ((!z10 || !(wVar.f20433a instanceof k)) && i15 != 0)) {
                                wVar.a(i7, new h2.x());
                            }
                        }
                        i28++;
                        i7 = 1;
                    }
                    return -1;
                }
                xVar3.M(i27 + read);
                i7 = 1;
            } else {
                int i29 = xVar3.f13522b;
                int i30 = xVar3.f13523c;
                byte[] bArr3 = xVar3.f13521a;
                int i31 = i29;
                while (i31 < i30 && bArr3[i31] != 71) {
                    i31++;
                }
                xVar3.N(i31);
                int i32 = i31 + 188;
                g0 g0Var2 = null;
                if (i32 > i30) {
                    int i33 = (i31 - i29) + this.f20223s;
                    this.f20223s = i33;
                    i11 = i10;
                    i12 = 2;
                    if (i11 == 2 && i33 > 376) {
                        throw t0.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i11 = i10;
                    i12 = 2;
                    this.f20223s = r12;
                }
                int i34 = xVar3.f13523c;
                if (i32 > i34) {
                    return r12;
                }
                int m10 = xVar3.m();
                if ((8388608 & m10) != 0) {
                    xVar3.N(i32);
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
                    xVar3.N(i32);
                    return r12;
                }
                if (i11 != i12) {
                    int i36 = m10 & 15;
                    SparseIntArray sparseIntArray = this.f20210e;
                    int i37 = sparseIntArray.get(i35, i36 - 1);
                    sparseIntArray.put(i35, i36);
                    if (i37 == i36) {
                        xVar3.N(i32);
                        return r12;
                    } else if (i36 != ((i37 + 1) & 15)) {
                        g0Var2.d();
                    }
                }
                if (z11) {
                    int A = xVar3.A();
                    if ((xVar3.A() & 64) != 0) {
                        i14 = i12;
                    } else {
                        i14 = r12;
                    }
                    i13 |= i14;
                    xVar3.O(A - 1);
                }
                boolean z13 = this.f20219o;
                if (i11 == i12 || z13 || !this.f20214j.get(i35, r12)) {
                    xVar3.M(i32);
                    g0Var2.a(i13, xVar3);
                    xVar3.M(i34);
                }
                if (i11 != i12 && !z13 && this.f20219o && length != -1) {
                    this.f20221q = true;
                }
                xVar3.N(i32);
                return r12;
            }
        }
    }

    @Override
    public final f3.o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
