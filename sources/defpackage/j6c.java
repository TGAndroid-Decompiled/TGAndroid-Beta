package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class j6c implements e84 {
    public final byte a;
    public final int b;
    public final List c;
    public final ey7 d;
    public final SparseIntArray e;
    public final ed f;
    public final peb g;
    public final SparseArray h;
    public final SparseBooleanArray i;
    public final SparseBooleanArray j;
    public final px8 k;
    public dk4 l;
    public g84 m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public m6c r;
    public int s;
    public int t;

    public j6c(int i, int i2, peb pebVar, usb usbVar, ed edVar) {
        this.f = edVar;
        this.a = i;
        this.b = i2;
        this.g = pebVar;
        if (i != 1 && i != 2) {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(usbVar);
        } else {
            this.c = Collections.singletonList(usbVar);
        }
        this.d = new ey7(0, new byte[9400]);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.i = sparseBooleanArray;
        this.j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        this.e = new SparseIntArray();
        this.k = new px8((byte) 1);
        this.m = g84.v;
        this.t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (m6c) sparseArray2.valueAt(i3));
        }
        sparseArray.put(0, new my9(new k7b(this)));
        this.r = null;
    }

    @Override
    public final int b(f84 f84Var, v11 v11Var) {
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
        long j2 = ((cb3) f84Var).c;
        byte b7 = this.a;
        if (b7 == 2) {
            z = true;
        } else {
            z = false;
        }
        if (this.o) {
            int i2 = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
            long j3 = -9223372036854775807L;
            px8 px8Var = this.k;
            if (i2 != 0 && !z && !px8Var.d) {
                int i3 = this.t;
                usb usbVar = px8Var.b;
                ey7 ey7Var = px8Var.c;
                if (i3 <= 0) {
                    px8Var.a((cb3) f84Var);
                    return 0;
                } else if (!px8Var.f) {
                    cb3 cb3Var = (cb3) f84Var;
                    long j4 = cb3Var.c;
                    int min = (int) Math.min(112800L, j4);
                    long j5 = j4 - min;
                    if (cb3Var.d != j5) {
                        v11Var.a = j5;
                        return 1;
                    }
                    ey7Var.K(min);
                    cb3Var.f = 0;
                    cb3Var.d(ey7Var.a, 0, min, false);
                    int i4 = ey7Var.b;
                    int i5 = ey7Var.c;
                    int i6 = i5 - 188;
                    while (true) {
                        if (i6 < i4) {
                            break;
                        }
                        byte[] bArr = ey7Var.a;
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
                                    long a = r0f.a(ey7Var, i6, i3);
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
                    px8Var.h = j3;
                    px8Var.f = true;
                    return 0;
                } else if (px8Var.h == -9223372036854775807L) {
                    px8Var.a((cb3) f84Var);
                    return 0;
                } else if (!px8Var.e) {
                    cb3 cb3Var2 = (cb3) f84Var;
                    int min2 = (int) Math.min(112800L, cb3Var2.c);
                    if (cb3Var2.d != 0) {
                        v11Var.a = 0L;
                        return 1;
                    }
                    ey7Var.K(min2);
                    cb3Var2.f = 0;
                    cb3Var2.d(ey7Var.a, 0, min2, false);
                    int i10 = ey7Var.b;
                    int i11 = ey7Var.c;
                    while (true) {
                        if (i10 < i11) {
                            if (ey7Var.a[i10] == 71) {
                                j = r0f.a(ey7Var, i10, i3);
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
                    px8Var.g = j;
                    px8Var.e = true;
                    return 0;
                } else {
                    long j6 = px8Var.g;
                    if (j6 == -9223372036854775807L) {
                        px8Var.a((cb3) f84Var);
                        return 0;
                    }
                    px8Var.i = usbVar.c(px8Var.h) - usbVar.b(j6);
                    px8Var.a((cb3) f84Var);
                    return 0;
                }
            }
            if (!this.p) {
                this.p = true;
                long j7 = px8Var.i;
                if (j7 != -9223372036854775807L) {
                    b = 1;
                    b2 = b7;
                    z3 = false;
                    dk4 dk4Var = new dk4(new Object(), new lp(this.t, px8Var.b), j7, 1 + j7, 0L, j2, 188L, 940);
                    this.l = dk4Var;
                    this.m.m0(dk4Var.a);
                } else {
                    b = 1;
                    z3 = false;
                    b2 = b7;
                    this.m.m0(new qc0(j7));
                }
            } else {
                b = 1;
                z3 = false;
                b2 = b7;
            }
            if (this.q) {
                this.q = z3;
                d(0L, 0L);
                if (((cb3) f84Var).d != 0) {
                    v11Var.a = 0L;
                    return b;
                }
            }
            dk4 dk4Var2 = this.l;
            r2 = z3;
            if (dk4Var2 != null) {
                r2 = z3;
                if (dk4Var2.c != null) {
                    return dk4Var2.a((cb3) f84Var, v11Var);
                }
            }
        } else {
            b = 1;
            r2 = 0;
            b2 = b7;
        }
        ey7 ey7Var2 = this.d;
        byte[] bArr2 = ey7Var2.a;
        if (9400 - ey7Var2.b < 188) {
            int a2 = ey7Var2.a();
            if (a2 > 0) {
                System.arraycopy(bArr2, ey7Var2.b, bArr2, r2, a2);
            }
            ey7Var2.L(a2, bArr2);
        }
        while (true) {
            int a3 = ey7Var2.a();
            SparseArray sparseArray = this.h;
            if (a3 < 188) {
                int i12 = ey7Var2.c;
                int read = ((cb3) f84Var).read(bArr2, i12, 9400 - i12);
                if (read == -1) {
                    int i13 = r2;
                    while (i13 < sparseArray.size()) {
                        m6c m6cVar = (m6c) sparseArray.valueAt(i13);
                        if (m6cVar instanceof d78) {
                            d78 d78Var = (d78) m6cVar;
                            if (z && !d78Var.e()) {
                                b6 = r2;
                            } else {
                                b6 = b;
                            }
                            byte b8 = d78Var.c;
                            if (((b8 == 3 && d78Var.j == -1) || b8 == b) && ((!z || !(d78Var.a instanceof zd5)) && b6 != 0)) {
                                d78Var.a(1, new ey7());
                            }
                        }
                        i13++;
                        b = 1;
                    }
                    return -1;
                }
                ey7Var2.M(i12 + read);
                b = 1;
            } else {
                int i14 = ey7Var2.b;
                int i15 = ey7Var2.c;
                byte[] bArr3 = ey7Var2.a;
                int i16 = i14;
                while (i16 < i15 && bArr3[i16] != 71) {
                    i16++;
                }
                ey7Var2.N(i16);
                int i17 = i16 + 188;
                m6c m6cVar2 = null;
                if (i17 > i15) {
                    int i18 = (i16 - i14) + this.s;
                    this.s = i18;
                    b3 = b2;
                    b4 = 2;
                    if (b3 == 2 && i18 > 376) {
                        throw hy7.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
                    }
                } else {
                    b3 = b2;
                    b4 = 2;
                    this.s = r2;
                }
                int i19 = ey7Var2.c;
                if (i17 > i19) {
                    return r2;
                }
                int m = ey7Var2.m();
                if ((8388608 & m) != 0) {
                    ey7Var2.N(i17);
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
                    m6cVar2 = (m6c) sparseArray.get(i20);
                }
                if (m6cVar2 == null) {
                    ey7Var2.N(i17);
                    return r2;
                }
                if (b3 != b4) {
                    int i21 = m & 15;
                    SparseIntArray sparseIntArray = this.e;
                    int i22 = sparseIntArray.get(i20, i21 - 1);
                    sparseIntArray.put(i20, i21);
                    if (i22 == i21) {
                        ey7Var2.N(i17);
                        return r2;
                    } else if (i21 != ((i22 + 1) & 15)) {
                        m6cVar2.d();
                    }
                }
                if (z2) {
                    int A = ey7Var2.A();
                    if ((ey7Var2.A() & 64) != 0) {
                        b5 = b4;
                    } else {
                        b5 = r2;
                    }
                    i |= b5;
                    ey7Var2.O(A - 1);
                }
                boolean z4 = this.o;
                if (b3 == b4 || z4 || !this.j.get(i20, r2)) {
                    ey7Var2.M(i17);
                    m6cVar2.a(i, ey7Var2);
                    ey7Var2.M(i19);
                }
                if (b3 != b4 && !z4 && this.o && j2 != -1) {
                    this.q = true;
                }
                ey7Var2.N(i17);
                return r2;
            }
        }
    }

    @Override
    public final boolean c(defpackage.f84 r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j6c.c(f84):boolean");
    }

    @Override
    public final void d(long j, long j2) {
        boolean z;
        dk4 dk4Var;
        boolean z2;
        if (this.a != 2) {
            z = true;
        } else {
            z = false;
        }
        yve.p(z);
        List list = this.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            usb usbVar = (usb) list.get(i);
            if (usbVar.e() == -9223372036854775807L) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                long d = usbVar.d();
                if (d != -9223372036854775807L && d != 0 && d != j2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                usbVar.g(j2);
            }
        }
        if (j2 != 0 && (dk4Var = this.l) != null) {
            dk4Var.d(j2);
        }
        this.d.K(0);
        this.e.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.h;
            if (i2 < sparseArray.size()) {
                ((m6c) sparseArray.valueAt(i2)).d();
                i2++;
            } else {
                this.s = 0;
                return;
            }
        }
    }

    @Override
    public final List e() {
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override
    public final void f(g84 g84Var) {
        if ((this.b & 1) == 0) {
            g84Var = new vh4(g84Var, this.g);
        }
        this.m = g84Var;
    }

    @Override
    public final e84 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
