package l4;

import android.util.SparseArray;
import g2.l0;
import g9.i0;
import g9.s1;
import java.util.List;
public final class z implements e3.o {
    public boolean f18029e;
    public boolean f18030f;
    public boolean f18031g;
    public long h;
    public j3.a f18032i;
    public e3.q f18033j;
    public boolean f18034k;
    public final l0 f18026a = new l0(0);
    public final g2.y f18028c = new g2.y(4096);
    public final SparseArray f18027b = new SparseArray();
    public final x d = new x(0);

    @Override
    public final boolean b(e3.p pVar) {
        byte[] bArr = new byte[14];
        e3.l lVar = (e3.l) pVar;
        lVar.h(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            lVar.w(bArr[13] & 7, false);
            lVar.h(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void c(e3.q qVar) {
        this.f18033j = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        boolean z10;
        l0 l0Var = this.f18026a;
        boolean z11 = true;
        if (l0Var.e() == -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            long d = l0Var.d();
            if (d == -9223372036854775807L || d == 0 || d == j11) {
                z11 = false;
            }
            z10 = z11;
        }
        if (z10) {
            l0Var.g(j11);
        }
        j3.a aVar = this.f18032i;
        if (aVar != null) {
            aVar.d(j11);
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f18027b;
            if (i3 < sparseArray.size()) {
                y yVar = (y) sparseArray.valueAt(i3);
                yVar.f18024f = false;
                yVar.f18020a.a();
                i3++;
            } else {
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
        int i3;
        int i10;
        long j10;
        long j11;
        long j12;
        i iVar;
        long j13;
        this.f18033j.getClass();
        long length = pVar.getLength();
        int i11 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j14 = -9223372036854775807L;
        x xVar = this.d;
        if (i11 != 0 && !xVar.d) {
            l0 l0Var = xVar.f18014b;
            g2.y yVar = xVar.f18015c;
            if (!xVar.f18017f) {
                long length2 = pVar.getLength();
                int min = (int) Math.min(20000L, length2);
                long j15 = length2 - min;
                if (pVar.getPosition() != j15) {
                    sVar.f9506a = j15;
                    return 1;
                }
                yVar.K(min);
                pVar.o();
                pVar.c(0, min, yVar.f11923a);
                int i12 = yVar.f11924b;
                int i13 = yVar.f11925c - 4;
                while (true) {
                    if (i13 < i12) {
                        break;
                    }
                    if (x.b(i13, yVar.f11923a) == 442) {
                        yVar.N(i13 + 4);
                        long c2 = x.c(yVar);
                        if (c2 != -9223372036854775807L) {
                            j14 = c2;
                            break;
                        }
                    }
                    i13--;
                }
                xVar.h = j14;
                xVar.f18017f = true;
                return 0;
            } else if (xVar.h == -9223372036854775807L) {
                xVar.a(pVar);
                return 0;
            } else if (!xVar.f18016e) {
                int min2 = (int) Math.min(20000L, pVar.getLength());
                long j16 = 0;
                if (pVar.getPosition() != j16) {
                    sVar.f9506a = j16;
                    return 1;
                }
                yVar.K(min2);
                pVar.o();
                pVar.c(0, min2, yVar.f11923a);
                int i14 = yVar.f11924b;
                int i15 = yVar.f11925c;
                while (true) {
                    if (i14 < i15 - 3) {
                        if (x.b(i14, yVar.f11923a) == 442) {
                            yVar.N(i14 + 4);
                            long c10 = x.c(yVar);
                            if (c10 != -9223372036854775807L) {
                                j13 = c10;
                                break;
                            }
                        }
                        i14++;
                    } else {
                        j13 = -9223372036854775807L;
                        break;
                    }
                }
                xVar.f18018g = j13;
                xVar.f18016e = true;
                return 0;
            } else {
                long j17 = xVar.f18018g;
                if (j17 == -9223372036854775807L) {
                    xVar.a(pVar);
                    return 0;
                }
                xVar.f18019i = l0Var.c(xVar.h) - l0Var.b(j17);
                xVar.a(pVar);
                return 0;
            }
        }
        if (!this.f18034k) {
            this.f18034k = true;
            long j18 = xVar.f18019i;
            if (j18 != -9223372036854775807L) {
                l0 l0Var2 = xVar.f18014b;
                v7.s sVar2 = new v7.s(5);
                ?? obj = new Object();
                obj.f53181a = l0Var2;
                obj.f53182b = new g2.y();
                i3 = i11;
                i10 = 4;
                j3.a aVar = new j3.a(sVar2, obj, j18, j18 + 1, 0L, length, 188L, 1000);
                this.f18032i = aVar;
                this.f18033j.f(aVar.f16175a);
            } else {
                i3 = i11;
                i10 = 4;
                this.f18033j.f(new e3.t(j18));
            }
        } else {
            i3 = i11;
            i10 = 4;
        }
        j3.a aVar2 = this.f18032i;
        if (aVar2 != null && aVar2.f16177c != null) {
            return aVar2.b(pVar, sVar);
        }
        pVar.o();
        if (i3 != 0) {
            j10 = length - pVar.k();
        } else {
            j10 = -1;
        }
        if (j10 == -1 || j10 >= 4) {
            g2.y yVar2 = this.f18028c;
            if (pVar.h(yVar2.f11923a, 0, i10, true)) {
                yVar2.N(0);
                int m10 = yVar2.m();
                if (m10 == 441) {
                    return -1;
                }
                if (m10 == 442) {
                    pVar.c(0, 10, yVar2.f11923a);
                    yVar2.N(9);
                    pVar.u((yVar2.A() & 7) + 14);
                    return 0;
                } else if (m10 == 443) {
                    pVar.c(0, 2, yVar2.f11923a);
                    yVar2.N(0);
                    pVar.u(yVar2.H() + 6);
                    return 0;
                } else if (((m10 & (-256)) >> 8) != 1) {
                    pVar.u(1);
                    return 0;
                } else {
                    int i16 = m10 & 255;
                    SparseArray sparseArray = this.f18027b;
                    y yVar3 = (y) sparseArray.get(i16);
                    if (!this.f18029e) {
                        if (yVar3 == null) {
                            if (i16 == 189) {
                                iVar = new b("video/mp2p");
                                this.f18030f = true;
                                this.h = pVar.getPosition();
                            } else if ((m10 & 224) == 192) {
                                iVar = new u(null, 0, "video/mp2p");
                                this.f18030f = true;
                                this.h = pVar.getPosition();
                            } else if ((m10 & 240) == 224) {
                                iVar = new k(null, "video/mp2p");
                                this.f18031g = true;
                                this.h = pVar.getPosition();
                            } else {
                                iVar = null;
                            }
                            if (iVar != null) {
                                iVar.f(this.f18033j, new f0(i16, 256));
                                yVar3 = new y(iVar, this.f18026a);
                                sparseArray.put(i16, yVar3);
                            }
                        }
                        if (this.f18030f && this.f18031g) {
                            j12 = this.h + 8192;
                        } else {
                            j12 = 1048576;
                        }
                        if (pVar.getPosition() > j12) {
                            this.f18029e = true;
                            this.f18033j.L();
                        }
                    }
                    pVar.c(0, 2, yVar2.f11923a);
                    yVar2.N(0);
                    int H = yVar2.H() + 6;
                    if (yVar3 == null) {
                        pVar.u(H);
                        return 0;
                    }
                    yVar2.K(H);
                    pVar.readFully(yVar2.f11923a, 0, H);
                    yVar2.N(6);
                    i iVar2 = yVar3.f18020a;
                    c4.f fVar = yVar3.f18022c;
                    yVar2.k(0, 3, (byte[]) fVar.f4190b);
                    fVar.J(0);
                    fVar.L(8);
                    yVar3.d = fVar.i();
                    yVar3.f18023e = fVar.i();
                    fVar.L(6);
                    yVar2.k(0, fVar.j(8), (byte[]) fVar.f4190b);
                    fVar.J(0);
                    l0 l0Var3 = yVar3.f18021b;
                    yVar3.f18025g = 0L;
                    if (yVar3.d) {
                        fVar.L(4);
                        fVar.L(1);
                        fVar.L(1);
                        long j19 = (fVar.j(3) << 30) | (fVar.j(15) << 15) | fVar.j(15);
                        fVar.L(1);
                        if (!yVar3.f18024f && yVar3.f18023e) {
                            fVar.L(4);
                            fVar.L(1);
                            long j20 = fVar.j(15) << 15;
                            fVar.L(1);
                            fVar.L(1);
                            l0Var3.b(j20 | (fVar.j(3) << 30) | fVar.j(15));
                            yVar3.f18024f = true;
                            j11 = j19;
                        } else {
                            j11 = j19;
                        }
                        yVar3.f18025g = l0Var3.b(j11);
                    }
                    iVar2.e(4, yVar3.f18025g);
                    iVar2.c(yVar2);
                    iVar2.d(false);
                    yVar2.M(yVar2.f11923a.length);
                    return 0;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override
    public final e3.o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
