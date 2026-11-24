package defpackage;

import android.util.SparseArray;
import java.util.List;
public final class iu8 implements j74 {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public zh4 i;
    public l74 j;
    public boolean k;
    public final uob a = new uob(0);
    public final xu7 c = new xu7(4096);
    public final SparseArray b = new SparseArray();
    public final gu8 d = new gu8((byte) 0);

    @Override
    public final int b(k74 k74Var, m11 m11Var) {
        long j;
        ?? r3;
        ?? r2;
        long j2;
        long j3;
        long j4;
        gu3 gu3Var;
        gu8 gu8Var = this.d;
        uob uobVar = gu8Var.b;
        this.j.getClass();
        long j5 = ((ja3) k74Var).c;
        int i = (j5 > (-1L) ? 1 : (j5 == (-1L) ? 0 : -1));
        long j6 = -9223372036854775807L;
        if (i != 0 && !gu8Var.d) {
            xu7 xu7Var = gu8Var.c;
            if (!gu8Var.f) {
                ja3 ja3Var = (ja3) k74Var;
                long j7 = ja3Var.c;
                int min = (int) Math.min(20000L, j7);
                long j8 = j7 - min;
                if (ja3Var.d != j8) {
                    m11Var.a = j8;
                    return 1;
                }
                xu7Var.K(min);
                ja3Var.f = 0;
                ja3Var.d(xu7Var.a, 0, min, false);
                int i2 = xu7Var.b;
                int i3 = xu7Var.c - 4;
                while (true) {
                    if (i3 < i2) {
                        break;
                    }
                    if (gu8.b(i3, xu7Var.a) == 442) {
                        xu7Var.N(i3 + 4);
                        long c = gu8.c(xu7Var);
                        if (c != -9223372036854775807L) {
                            j6 = c;
                            break;
                        }
                    }
                    i3--;
                }
                gu8Var.h = j6;
                gu8Var.f = true;
                return 0;
            } else if (gu8Var.h == -9223372036854775807L) {
                gu8Var.a((ja3) k74Var);
                return 0;
            } else if (!gu8Var.e) {
                ja3 ja3Var2 = (ja3) k74Var;
                int min2 = (int) Math.min(20000L, ja3Var2.c);
                if (ja3Var2.d != 0) {
                    m11Var.a = 0L;
                    return 1;
                }
                xu7Var.K(min2);
                ja3Var2.f = 0;
                ja3Var2.d(xu7Var.a, 0, min2, false);
                int i4 = xu7Var.b;
                int i5 = xu7Var.c;
                while (true) {
                    if (i4 >= i5 - 3) {
                        break;
                    }
                    if (gu8.b(i4, xu7Var.a) == 442) {
                        xu7Var.N(i4 + 4);
                        long c2 = gu8.c(xu7Var);
                        if (c2 != -9223372036854775807L) {
                            j6 = c2;
                            break;
                        }
                    }
                    i4++;
                }
                gu8Var.g = j6;
                gu8Var.e = true;
                return 0;
            } else {
                long j9 = gu8Var.g;
                if (j9 == -9223372036854775807L) {
                    gu8Var.a((ja3) k74Var);
                    return 0;
                }
                gu8Var.i = uobVar.c(gu8Var.h) - uobVar.b(j9);
                gu8Var.a((ja3) k74Var);
                return 0;
            }
        }
        if (!this.k) {
            this.k = true;
            long j10 = gu8Var.i;
            if (j10 != -9223372036854775807L) {
                j = 0;
                r3 = 1;
                r2 = 0;
                zh4 zh4Var = new zh4(new Object(), new sk4(uobVar), j10, 1 + j10, 0L, j5, 188L, 1000);
                this.i = zh4Var;
                this.j.f0(zh4Var.a);
            } else {
                r3 = 1;
                r2 = 0;
                j = 0;
                this.j.f0(new oc0(j10));
            }
        } else {
            j = 0;
            r3 = 1;
            r2 = 0;
        }
        zh4 zh4Var2 = this.i;
        if (zh4Var2 != null && zh4Var2.c != null) {
            return zh4Var2.a((ja3) k74Var, m11Var);
        }
        ja3 ja3Var3 = (ja3) k74Var;
        ja3Var3.f = r2;
        if (i != 0) {
            j2 = j5 - ja3Var3.f();
        } else {
            j2 = -1;
        }
        if (j2 != -1 && j2 < 4) {
            g();
            return -1;
        }
        xu7 xu7Var2 = this.c;
        if (!ja3Var3.d(xu7Var2.a, r2, 4, r3)) {
            g();
            return -1;
        }
        xu7Var2.N(r2);
        int m = xu7Var2.m();
        if (m == 441) {
            g();
            return -1;
        } else if (m == 442) {
            ja3Var3.d(xu7Var2.a, r2, 10, r2);
            xu7Var2.N(9);
            ja3Var3.l((xu7Var2.A() & 7) + 14, r2);
            return r2;
        } else if (m == 443) {
            ja3Var3.d(xu7Var2.a, r2, 2, r2);
            xu7Var2.N(r2);
            ja3Var3.l(xu7Var2.H() + 6, r2);
            return r2;
        } else if (((m & (-256)) >> 8) != r3) {
            ja3Var3.l(r3, r2);
            return r2;
        } else {
            int i6 = m & 255;
            SparseArray sparseArray = this.b;
            hu8 hu8Var = (hu8) sparseArray.get(i6);
            if (!this.e) {
                if (hu8Var == null) {
                    if (i6 == 189) {
                        gu3Var = new f4("video/mp2p");
                        this.f = r3;
                        this.h = ja3Var3.d;
                    } else if ((m & 224) == 192) {
                        gu3Var = new sf7(null, r2, "video/mp2p");
                        this.f = r3;
                        this.h = ja3Var3.d;
                    } else if ((m & 240) == 224) {
                        gu3Var = new yb5(null, "video/mp2p");
                        this.g = r3;
                        this.h = ja3Var3.d;
                    } else {
                        gu3Var = null;
                    }
                    if (gu3Var != null) {
                        gu3Var.h(this.j, new l2c(i6, 256));
                        hu8Var = new hu8(gu3Var, this.a);
                        sparseArray.put(i6, hu8Var);
                    }
                }
                if (this.f && this.g) {
                    j4 = this.h + 8192;
                } else {
                    j4 = 1048576;
                }
                if (ja3Var3.d > j4) {
                    this.e = r3;
                    this.j.B();
                }
            }
            ja3Var3.d(xu7Var2.a, r2, 2, r2);
            xu7Var2.N(r2);
            int H = xu7Var2.H() + 6;
            if (hu8Var == null) {
                ja3Var3.l(H, r2);
                return r2;
            }
            xu7Var2.K(H);
            ja3Var3.c(xu7Var2.a, r2, H, r2);
            xu7Var2.N(6);
            gu3 gu3Var2 = hu8Var.a;
            qd1 qd1Var = hu8Var.c;
            xu7Var2.k(r2, 3, qd1Var.b);
            qd1Var.l(r2);
            qd1Var.n(8);
            hu8Var.d = qd1Var.e();
            hu8Var.e = qd1Var.e();
            qd1Var.n(6);
            xu7Var2.k(r2, qd1Var.f(8), qd1Var.b);
            qd1Var.l(r2);
            uob uobVar2 = hu8Var.b;
            if (hu8Var.d) {
                qd1Var.n(4);
                qd1Var.n(r3);
                qd1Var.n(r3);
                long f = (qd1Var.f(3) << 30) | (qd1Var.f(15) << 15) | qd1Var.f(15);
                qd1Var.n(r3);
                if (!hu8Var.f && hu8Var.e) {
                    qd1Var.n(4);
                    qd1Var.n(r3);
                    qd1Var.n(r3);
                    qd1Var.n(r3);
                    uobVar2.b((qd1Var.f(3) << 30) | (qd1Var.f(15) << 15) | qd1Var.f(15));
                    hu8Var.f = r3;
                }
                j3 = uobVar2.b(f);
            } else {
                j3 = j;
            }
            gu3Var2.g(4, j3);
            gu3Var2.b(xu7Var2);
            gu3Var2.e();
            xu7Var2.M(xu7Var2.a.length);
            return r2;
        }
    }

    @Override
    public final boolean c(k74 k74Var) {
        byte[] bArr = new byte[14];
        ja3 ja3Var = (ja3) k74Var;
        ja3Var.d(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            ja3Var.a(bArr[13] & 7, false);
            ja3Var.d(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void d(long j, long j2) {
        boolean z;
        uob uobVar = this.a;
        boolean z2 = true;
        if (uobVar.e() == -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            long d = uobVar.d();
            if (d == -9223372036854775807L || d == 0 || d == j2) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            uobVar.g(j2);
        }
        zh4 zh4Var = this.i;
        if (zh4Var != null) {
            zh4Var.d(j2);
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i < sparseArray.size()) {
                hu8 hu8Var = (hu8) sparseArray.valueAt(i);
                hu8Var.f = false;
                hu8Var.a.d();
                i++;
            } else {
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
        this.j = l74Var;
    }

    public final void g() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i < sparseArray.size()) {
                ((hu8) sparseArray.valueAt(i)).a.f();
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final j74 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
