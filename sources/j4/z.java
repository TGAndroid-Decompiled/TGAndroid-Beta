package j4;

import android.util.SparseArray;
import e9.a1;
import e9.i0;
import java.util.List;
public final class z implements c3.o {
    public boolean e;
    public boolean f12872f;
    public boolean f12873g;
    public long h;
    public h3.a f12874i;
    public c3.q f12875j;
    public boolean f12876k;
    public final e2.b0 f12869a = new e2.b0(0);
    public final e2.v f12871c = new e2.v(4096);
    public final SparseArray f12870b = new SparseArray();
    public final x d = new x(0);

    @Override
    public final boolean a(c3.p pVar) {
        byte[] bArr = new byte[14];
        c3.l lVar = (c3.l) pVar;
        lVar.h(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            lVar.t(bArr[13] & 7, false);
            lVar.h(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void g(c3.q qVar) {
        this.f12875j = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        boolean z10;
        e2.b0 b0Var = this.f12869a;
        boolean z11 = true;
        if (b0Var.e() == -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            long d = b0Var.d();
            z10 = (d == -9223372036854775807L || d == 0 || d == j10) ? false : false;
        }
        if (z10) {
            b0Var.g(j10);
        }
        h3.a aVar = this.f12874i;
        if (aVar != null) {
            aVar.d(j10);
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f12870b;
            if (i10 < sparseArray.size()) {
                y yVar = (y) sparseArray.valueAt(i10);
                yVar.f12867f = false;
                yVar.f12864a.c();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final List i() {
        e9.g0 g0Var = i0.f8083b;
        return a1.e;
    }

    @Override
    public final int m(c3.p pVar, c3.s sVar) {
        int i10;
        long j3;
        long j10;
        long j11;
        i iVar;
        long j12;
        long j13;
        e2.d.h(this.f12875j);
        long length = pVar.getLength();
        x xVar = this.d;
        int i11 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        if (i11 != 0 && !xVar.d) {
            e2.b0 b0Var = xVar.f12859b;
            e2.v vVar = xVar.f12860c;
            if (!xVar.f12861f) {
                long length2 = pVar.getLength();
                int min = (int) Math.min(20000L, length2);
                long j14 = length2 - min;
                if (pVar.getPosition() != j14) {
                    sVar.f3798a = j14;
                    return 1;
                }
                vVar.G(min);
                pVar.p();
                pVar.a(0, min, vVar.f7933a);
                int i12 = vVar.f7934b;
                int i13 = vVar.f7935c - 4;
                while (true) {
                    if (i13 >= i12) {
                        if (x.b(i13, vVar.f7933a) == 442) {
                            vVar.J(i13 + 4);
                            long c10 = x.c(vVar);
                            if (c10 != -9223372036854775807L) {
                                j13 = c10;
                                break;
                            }
                        }
                        i13--;
                    } else {
                        j13 = -9223372036854775807L;
                        break;
                    }
                }
                xVar.h = j13;
                xVar.f12861f = true;
                return 0;
            } else if (xVar.h == -9223372036854775807L) {
                xVar.a(pVar);
                return 0;
            } else if (!xVar.e) {
                int min2 = (int) Math.min(20000L, pVar.getLength());
                long j15 = 0;
                if (pVar.getPosition() != j15) {
                    sVar.f3798a = j15;
                    return 1;
                }
                vVar.G(min2);
                pVar.p();
                pVar.a(0, min2, vVar.f7933a);
                int i14 = vVar.f7934b;
                int i15 = vVar.f7935c;
                while (true) {
                    if (i14 < i15 - 3) {
                        if (x.b(i14, vVar.f7933a) == 442) {
                            vVar.J(i14 + 4);
                            long c11 = x.c(vVar);
                            if (c11 != -9223372036854775807L) {
                                j12 = c11;
                                break;
                            }
                        }
                        i14++;
                    } else {
                        j12 = -9223372036854775807L;
                        break;
                    }
                }
                xVar.f12862g = j12;
                xVar.e = true;
                return 0;
            } else {
                long j16 = xVar.f12862g;
                if (j16 == -9223372036854775807L) {
                    xVar.a(pVar);
                    return 0;
                }
                xVar.f12863i = b0Var.c(xVar.h) - b0Var.b(j16);
                xVar.a(pVar);
                return 0;
            }
        }
        if (!this.f12876k) {
            this.f12876k = true;
            long j17 = xVar.f12863i;
            if (j17 != -9223372036854775807L) {
                e2.b0 b0Var2 = xVar.f12859b;
                ?? obj = new Object();
                n4.y yVar = new n4.y(b0Var2);
                long j18 = 1 + j17;
                i10 = 4;
                h3.a aVar = new h3.a(obj, yVar, j17, j18, 0L, length, 188L, 1000);
                this.f12874i = aVar;
                this.f12875j.X1(aVar.f10112a);
            } else {
                i10 = 4;
                this.f12875j.X1(new c3.t(j17));
            }
        } else {
            i10 = 4;
        }
        h3.a aVar2 = this.f12874i;
        if (aVar2 != null && aVar2.f10114c != null) {
            return aVar2.b(pVar, sVar);
        }
        pVar.p();
        if (i11 != 0) {
            j3 = length - pVar.i();
        } else {
            j3 = -1;
        }
        if (j3 == -1 || j3 >= 4) {
            e2.v vVar2 = this.f12871c;
            if (pVar.h(vVar2.f7933a, 0, i10, true)) {
                vVar2.J(0);
                int j19 = vVar2.j();
                if (j19 == 441) {
                    return -1;
                }
                if (j19 == 442) {
                    pVar.a(0, 10, vVar2.f7933a);
                    vVar2.J(9);
                    pVar.q((vVar2.x() & 7) + 14);
                    return 0;
                } else if (j19 == 443) {
                    pVar.a(0, 2, vVar2.f7933a);
                    vVar2.J(0);
                    pVar.q(vVar2.D() + 6);
                    return 0;
                } else if (((j19 & (-256)) >> 8) != 1) {
                    pVar.q(1);
                    return 0;
                } else {
                    int i16 = j19 & 255;
                    SparseArray sparseArray = this.f12870b;
                    y yVar2 = (y) sparseArray.get(i16);
                    if (!this.e) {
                        if (yVar2 == null) {
                            if (i16 == 189) {
                                iVar = new b("video/mp2p");
                                this.f12872f = true;
                                this.h = pVar.getPosition();
                            } else if ((j19 & 224) == 192) {
                                iVar = new u(null, 0, "video/mp2p");
                                this.f12872f = true;
                                this.h = pVar.getPosition();
                            } else if ((j19 & 240) == 224) {
                                iVar = new k(null, "video/mp2p");
                                this.f12873g = true;
                                this.h = pVar.getPosition();
                            } else {
                                iVar = null;
                            }
                            if (iVar != null) {
                                iVar.d(this.f12875j, new f0(i16, 256));
                                yVar2 = new y(iVar, this.f12869a);
                                sparseArray.put(i16, yVar2);
                            }
                        }
                        if (this.f12872f && this.f12873g) {
                            j11 = this.h + 8192;
                        } else {
                            j11 = 1048576;
                        }
                        if (pVar.getPosition() > j11) {
                            this.e = true;
                            this.f12875j.e1();
                        }
                    }
                    pVar.a(0, 2, vVar2.f7933a);
                    vVar2.J(0);
                    int D = vVar2.D() + 6;
                    if (yVar2 == null) {
                        pVar.q(D);
                        return 0;
                    }
                    vVar2.G(D);
                    pVar.readFully(vVar2.f7933a, 0, D);
                    vVar2.J(6);
                    i iVar2 = yVar2.f12864a;
                    a4.h hVar = yVar2.f12866c;
                    vVar2.h(0, 3, hVar.f256b);
                    hVar.q(0);
                    hVar.t(8);
                    yVar2.d = hVar.h();
                    yVar2.e = hVar.h();
                    hVar.t(6);
                    vVar2.h(0, hVar.i(8), hVar.f256b);
                    hVar.q(0);
                    e2.b0 b0Var3 = yVar2.f12865b;
                    yVar2.f12868g = 0L;
                    if (yVar2.d) {
                        hVar.t(4);
                        hVar.t(1);
                        hVar.t(1);
                        long i17 = (hVar.i(3) << 30) | (hVar.i(15) << 15) | hVar.i(15);
                        hVar.t(1);
                        if (!yVar2.f12867f && yVar2.e) {
                            hVar.t(4);
                            hVar.t(1);
                            long i18 = hVar.i(15) << 15;
                            hVar.t(1);
                            hVar.t(1);
                            b0Var3.b(i18 | (hVar.i(3) << 30) | hVar.i(15));
                            yVar2.f12867f = true;
                            j10 = i17;
                        } else {
                            j10 = i17;
                        }
                        yVar2.f12868g = b0Var3.b(j10);
                    }
                    iVar2.f(4, yVar2.f12868g);
                    iVar2.a(vVar2);
                    iVar2.e(false);
                    vVar2.I(vVar2.f7933a.length);
                    return 0;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override
    public final c3.o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
