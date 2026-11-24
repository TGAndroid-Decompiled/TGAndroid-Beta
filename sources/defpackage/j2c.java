package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class j2c implements j74 {
    public final byte a;
    public final int b;
    public final List c;
    public final xu7 d;
    public final SparseIntArray e;
    public final dd f;
    public final sab g;
    public final SparseArray h;
    public final SparseBooleanArray i;
    public final SparseBooleanArray j;
    public final gu8 k;
    public zh4 l;
    public l74 m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public m2c r;
    public int s;
    public int t;

    public j2c(int i, int i2, sab sabVar, uob uobVar, dd ddVar) {
        this.f = ddVar;
        this.a = i;
        this.b = i2;
        this.g = sabVar;
        if (i != 1 && i != 2) {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(uobVar);
        } else {
            this.c = Collections.singletonList(uobVar);
        }
        this.d = new xu7(0, new byte[9400]);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.i = sparseBooleanArray;
        this.j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        this.e = new SparseIntArray();
        this.k = new gu8((byte) 1);
        this.m = l74.v;
        this.t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (m2c) sparseArray2.valueAt(i3));
        }
        sparseArray.put(0, new su9(new v8b(this)));
        this.r = null;
    }

    @Override
    public final int b(k74 k74Var, m11 m11Var) {
        boolean z;
        byte b;
        ?? r2;
        byte b2;
        byte b3;
        byte b4;
        int i;
        boolean z2;
        byte b5;
        byte b6;
        boolean z3;
        long j;
        long j2 = ((ja3) k74Var).c;
        byte b7 = this.a;
        if (b7 == 2) {
            z = true;
        } else {
            z = false;
        }
        if (this.o) {
            int i2 = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
            long j3 = -9223372036854775807L;
            gu8 gu8Var = this.k;
            if (i2 != 0 && !z && !gu8Var.d) {
                int i3 = this.t;
                uob uobVar = gu8Var.b;
                xu7 xu7Var = gu8Var.c;
                if (i3 <= 0) {
                    gu8Var.a((ja3) k74Var);
                    return 0;
                } else if (!gu8Var.f) {
                    ja3 ja3Var = (ja3) k74Var;
                    long j4 = ja3Var.c;
                    int min = (int) Math.min(112800L, j4);
                    long j5 = j4 - min;
                    if (ja3Var.d != j5) {
                        m11Var.a = j5;
                        return 1;
                    }
                    xu7Var.K(min);
                    ja3Var.f = 0;
                    ja3Var.d(xu7Var.a, 0, min, false);
                    int i4 = xu7Var.b;
                    int i5 = xu7Var.c;
                    int i6 = i5 - 188;
                    while (true) {
                        if (i6 < i4) {
                            break;
                        }
                        byte[] bArr = xu7Var.a;
                        int i7 = -4;
                        int i8 = 0;
                        while (true) {
                            if (i7 > 4) {
                                break;
                            }
                            int i9 = (i7 * 188) + i6;
                            if (i9 >= i4 && i9 < i5 && bArr[i9] == 71) {
                                i8++;
                                if (i8 == 5) {
                                    long a = zve.a(xu7Var, i6, i3);
                                    if (a != -9223372036854775807L) {
                                        j3 = a;
                                        break;
                                    }
                                }
                            } else {
                                i8 = 0;
                            }
                            i7++;
                        }
                        i6--;
                    }
                    gu8Var.h = j3;
                    gu8Var.f = true;
                    return 0;
                } else if (gu8Var.h == -9223372036854775807L) {
                    gu8Var.a((ja3) k74Var);
                    return 0;
                } else if (!gu8Var.e) {
                    ja3 ja3Var2 = (ja3) k74Var;
                    int min2 = (int) Math.min(112800L, ja3Var2.c);
                    if (ja3Var2.d != 0) {
                        m11Var.a = 0L;
                        return 1;
                    }
                    xu7Var.K(min2);
                    ja3Var2.f = 0;
                    ja3Var2.d(xu7Var.a, 0, min2, false);
                    int i10 = xu7Var.b;
                    int i11 = xu7Var.c;
                    while (true) {
                        if (i10 < i11) {
                            if (xu7Var.a[i10] == 71) {
                                j = zve.a(xu7Var, i10, i3);
                                if (j != -9223372036854775807L) {
                                    break;
                                }
                            }
                            i10++;
                        } else {
                            j = -9223372036854775807L;
                            break;
                        }
                    }
                    gu8Var.g = j;
                    gu8Var.e = true;
                    return 0;
                } else {
                    long j6 = gu8Var.g;
                    if (j6 == -9223372036854775807L) {
                        gu8Var.a((ja3) k74Var);
                        return 0;
                    }
                    gu8Var.i = uobVar.c(gu8Var.h) - uobVar.b(j6);
                    gu8Var.a((ja3) k74Var);
                    return 0;
                }
            }
            if (!this.p) {
                this.p = true;
                long j7 = gu8Var.i;
                if (j7 != -9223372036854775807L) {
                    b = 1;
                    b2 = b7;
                    z3 = false;
                    zh4 zh4Var = new zh4(new Object(), new kp(this.t, gu8Var.b), j7, 1 + j7, 0L, j2, 188L, 940);
                    this.l = zh4Var;
                    this.m.f0(zh4Var.a);
                } else {
                    b = 1;
                    z3 = false;
                    b2 = b7;
                    this.m.f0(new oc0(j7));
                }
            } else {
                b = 1;
                z3 = false;
                b2 = b7;
            }
            if (this.q) {
                this.q = z3;
                d(0L, 0L);
                if (((ja3) k74Var).d != 0) {
                    m11Var.a = 0L;
                    return b;
                }
            }
            zh4 zh4Var2 = this.l;
            r2 = z3;
            if (zh4Var2 != null) {
                r2 = z3;
                if (zh4Var2.c != null) {
                    return zh4Var2.a((ja3) k74Var, m11Var);
                }
            }
        } else {
            b = 1;
            r2 = 0;
            b2 = b7;
        }
        xu7 xu7Var2 = this.d;
        byte[] bArr2 = xu7Var2.a;
        if (9400 - xu7Var2.b < 188) {
            int a2 = xu7Var2.a();
            if (a2 > 0) {
                System.arraycopy(bArr2, xu7Var2.b, bArr2, r2, a2);
            }
            xu7Var2.L(a2, bArr2);
        }
        while (true) {
            int a3 = xu7Var2.a();
            SparseArray sparseArray = this.h;
            if (a3 < 188) {
                int i12 = xu7Var2.c;
                int read = ((ja3) k74Var).read(bArr2, i12, 9400 - i12);
                if (read == -1) {
                    int i13 = r2;
                    while (i13 < sparseArray.size()) {
                        m2c m2cVar = (m2c) sparseArray.valueAt(i13);
                        if (m2cVar instanceof n38) {
                            n38 n38Var = (n38) m2cVar;
                            if (z && !n38Var.e()) {
                                b6 = r2;
                            } else {
                                b6 = b;
                            }
                            byte b8 = n38Var.c;
                            if (((b8 == 3 && n38Var.j == -1) || b8 == b) && ((!z || !(n38Var.a instanceof yb5)) && b6 != 0)) {
                                n38Var.a(1, new xu7());
                            }
                        }
                        i13++;
                        b = 1;
                    }
                    return -1;
                }
                xu7Var2.M(i12 + read);
                b = 1;
            } else {
                int i14 = xu7Var2.b;
                int i15 = xu7Var2.c;
                byte[] bArr3 = xu7Var2.a;
                int i16 = i14;
                while (i16 < i15 && bArr3[i16] != 71) {
                    i16++;
                }
                xu7Var2.N(i16);
                int i17 = i16 + 188;
                m2c m2cVar2 = null;
                if (i17 > i15) {
                    int i18 = (i16 - i14) + this.s;
                    this.s = i18;
                    b3 = b2;
                    b4 = 2;
                    if (b3 == 2 && i18 > 376) {
                        throw av7.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
                    }
                } else {
                    b3 = b2;
                    b4 = 2;
                    this.s = r2;
                }
                int i19 = xu7Var2.c;
                if (i17 > i19) {
                    return r2;
                }
                int m = xu7Var2.m();
                if ((8388608 & m) != 0) {
                    xu7Var2.N(i17);
                    return r2;
                }
                if ((4194304 & m) != 0) {
                    i = 1;
                } else {
                    i = r2;
                }
                int i20 = (2096896 & m) >> 8;
                if ((m & 32) != 0) {
                    z2 = true;
                } else {
                    z2 = r2;
                }
                if ((m & 16) != 0) {
                    m2cVar2 = (m2c) sparseArray.get(i20);
                }
                if (m2cVar2 == null) {
                    xu7Var2.N(i17);
                    return r2;
                }
                if (b3 != b4) {
                    int i21 = m & 15;
                    SparseIntArray sparseIntArray = this.e;
                    int i22 = sparseIntArray.get(i20, i21 - 1);
                    sparseIntArray.put(i20, i21);
                    if (i22 == i21) {
                        xu7Var2.N(i17);
                        return r2;
                    } else if (i21 != ((i22 + 1) & 15)) {
                        m2cVar2.d();
                    }
                }
                if (z2) {
                    int A = xu7Var2.A();
                    if ((xu7Var2.A() & 64) != 0) {
                        b5 = b4;
                    } else {
                        b5 = r2;
                    }
                    i |= b5;
                    xu7Var2.O(A - 1);
                }
                boolean z4 = this.o;
                if (b3 == b4 || z4 || !this.j.get(i20, r2)) {
                    xu7Var2.M(i17);
                    m2cVar2.a(i, xu7Var2);
                    xu7Var2.M(i19);
                }
                if (b3 != b4 && !z4 && this.o && j2 != -1) {
                    this.q = true;
                }
                xu7Var2.N(i17);
                return r2;
            }
        }
    }

    @Override
    public final boolean c(defpackage.k74 r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j2c.c(k74):boolean");
    }

    @Override
    public final void d(long j, long j2) {
        boolean z;
        zh4 zh4Var;
        boolean z2;
        if (this.a != 2) {
            z = true;
        } else {
            z = false;
        }
        gre.p(z);
        List list = this.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            uob uobVar = (uob) list.get(i);
            if (uobVar.e() == -9223372036854775807L) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                long d = uobVar.d();
                if (d != -9223372036854775807L && d != 0 && d != j2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                uobVar.g(j2);
            }
        }
        if (j2 != 0 && (zh4Var = this.l) != null) {
            zh4Var.d(j2);
        }
        this.d.K(0);
        this.e.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.h;
            if (i2 < sparseArray.size()) {
                ((m2c) sparseArray.valueAt(i2)).d();
                i2++;
            } else {
                this.s = 0;
                return;
            }
        }
    }

    @Override
    public final List e() {
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override
    public final void f(l74 l74Var) {
        if ((this.b & 1) == 0) {
            l74Var = new xf4(l74Var, this.g);
        }
        this.m = l74Var;
    }

    @Override
    public final j74 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
