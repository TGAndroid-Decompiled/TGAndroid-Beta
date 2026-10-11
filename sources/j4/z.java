package j4;

import android.util.SparseArray;
import e9.a1;
import e9.i0;
import java.util.List;
public final class z implements c3.o {
    public boolean f14014e;
    public boolean f14015f;
    public boolean f14016g;
    public long h;
    public h3.a f14017i;
    public c3.q f14018j;
    public boolean f14019k;
    public final e2.b0 f14011a = new e2.b0(0);
    public final e2.v f14013c = new e2.v(4096);
    public final SparseArray f14012b = new SparseArray();
    public final x d = new x(0);

    @Override
    public final boolean a(c3.p pVar) {
        byte[] bArr = new byte[14];
        c3.l lVar = (c3.l) pVar;
        lVar.i(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            lVar.v(bArr[13] & 7, false);
            lVar.i(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void g(c3.q qVar) {
        this.f14018j = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        boolean z10;
        e2.b0 b0Var = this.f14011a;
        boolean z11 = true;
        if (b0Var.e() == -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            long d = b0Var.d();
            if (d == -9223372036854775807L || d == 0 || d == j10) {
                z11 = false;
            }
            z10 = z11;
        }
        if (z10) {
            b0Var.g(j10);
        }
        h3.a aVar = this.f14017i;
        if (aVar != null) {
            aVar.d(j10);
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f14012b;
            if (i10 < sparseArray.size()) {
                y yVar = (y) sparseArray.valueAt(i10);
                yVar.f14009f = false;
                yVar.f14005a.d();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final List i() {
        e9.g0 g0Var = i0.f8751b;
        return a1.f8714e;
    }

    @Override
    public final int m(c3.p pVar, c3.s sVar) {
        int i10;
        int i11;
        long j3;
        long j10;
        long j11;
        i iVar;
        long j12;
        e2.d.h(this.f14018j);
        long length = pVar.getLength();
        int i12 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j13 = -9223372036854775807L;
        x xVar = this.d;
        if (i12 != 0 && !xVar.d) {
            e2.b0 b0Var = xVar.f13999b;
            e2.v vVar = xVar.f14000c;
            if (!xVar.f14002f) {
                long length2 = pVar.getLength();
                int min = (int) Math.min(20000L, length2);
                long j14 = length2 - min;
                if (pVar.getPosition() != j14) {
                    sVar.f4150a = j14;
                    return 1;
                }
                vVar.G(min);
                pVar.q();
                pVar.a(0, min, vVar.f8583a);
                int i13 = vVar.f8584b;
                int i14 = vVar.f8585c - 4;
                while (true) {
                    if (i14 < i13) {
                        break;
                    }
                    if (x.b(i14, vVar.f8583a) == 442) {
                        vVar.J(i14 + 4);
                        long c10 = x.c(vVar);
                        if (c10 != -9223372036854775807L) {
                            j13 = c10;
                            break;
                        }
                    }
                    i14--;
                }
                xVar.h = j13;
                xVar.f14002f = true;
                return 0;
            } else if (xVar.h == -9223372036854775807L) {
                xVar.a(pVar);
                return 0;
            } else if (!xVar.f14001e) {
                int min2 = (int) Math.min(20000L, pVar.getLength());
                long j15 = 0;
                if (pVar.getPosition() != j15) {
                    sVar.f4150a = j15;
                    return 1;
                }
                vVar.G(min2);
                pVar.q();
                pVar.a(0, min2, vVar.f8583a);
                int i15 = vVar.f8584b;
                int i16 = vVar.f8585c;
                while (true) {
                    if (i15 < i16 - 3) {
                        if (x.b(i15, vVar.f8583a) == 442) {
                            vVar.J(i15 + 4);
                            long c11 = x.c(vVar);
                            if (c11 != -9223372036854775807L) {
                                j12 = c11;
                                break;
                            }
                        }
                        i15++;
                    } else {
                        j12 = -9223372036854775807L;
                        break;
                    }
                }
                xVar.f14003g = j12;
                xVar.f14001e = true;
                return 0;
            } else {
                long j16 = xVar.f14003g;
                if (j16 == -9223372036854775807L) {
                    xVar.a(pVar);
                    return 0;
                }
                xVar.f14004i = b0Var.c(xVar.h) - b0Var.b(j16);
                xVar.a(pVar);
                return 0;
            }
        }
        if (!this.f14019k) {
            this.f14019k = true;
            long j17 = xVar.f14004i;
            if (j17 != -9223372036854775807L) {
                i10 = i12;
                i11 = 4;
                h3.a aVar = new h3.a(new Object(), new n4.x(xVar.f13999b), j17, j17 + 1, 0L, length, 188L, 1000);
                this.f14017i = aVar;
                this.f14018j.d2(aVar.f11001a);
            } else {
                i10 = i12;
                i11 = 4;
                this.f14018j.d2(new c3.t(j17));
            }
        } else {
            i10 = i12;
            i11 = 4;
        }
        h3.a aVar2 = this.f14017i;
        if (aVar2 != null && aVar2.f11003c != null) {
            return aVar2.b(pVar, sVar);
        }
        pVar.q();
        if (i10 != 0) {
            j3 = length - pVar.j();
        } else {
            j3 = -1;
        }
        if (j3 == -1 || j3 >= 4) {
            e2.v vVar2 = this.f14013c;
            if (pVar.i(vVar2.f8583a, 0, i11, true)) {
                vVar2.J(0);
                int j18 = vVar2.j();
                if (j18 == 441) {
                    return -1;
                }
                if (j18 == 442) {
                    pVar.a(0, 10, vVar2.f8583a);
                    vVar2.J(9);
                    pVar.r((vVar2.x() & 7) + 14);
                    return 0;
                } else if (j18 == 443) {
                    pVar.a(0, 2, vVar2.f8583a);
                    vVar2.J(0);
                    pVar.r(vVar2.D() + 6);
                    return 0;
                } else if (((j18 & (-256)) >> 8) != 1) {
                    pVar.r(1);
                    return 0;
                } else {
                    int i17 = j18 & 255;
                    SparseArray sparseArray = this.f14012b;
                    y yVar = (y) sparseArray.get(i17);
                    if (!this.f14014e) {
                        if (yVar == null) {
                            if (i17 == 189) {
                                iVar = new b("video/mp2p");
                                this.f14015f = true;
                                this.h = pVar.getPosition();
                            } else if ((j18 & 224) == 192) {
                                iVar = new u(null, 0, "video/mp2p");
                                this.f14015f = true;
                                this.h = pVar.getPosition();
                            } else if ((j18 & 240) == 224) {
                                iVar = new k(null, "video/mp2p");
                                this.f14016g = true;
                                this.h = pVar.getPosition();
                            } else {
                                iVar = null;
                            }
                            if (iVar != null) {
                                iVar.e(this.f14018j, new f0(i17, 256));
                                yVar = new y(iVar, this.f14011a);
                                sparseArray.put(i17, yVar);
                            }
                        }
                        if (this.f14015f && this.f14016g) {
                            j11 = this.h + 8192;
                        } else {
                            j11 = 1048576;
                        }
                        if (pVar.getPosition() > j11) {
                            this.f14014e = true;
                            this.f14018j.k1();
                        }
                    }
                    pVar.a(0, 2, vVar2.f8583a);
                    vVar2.J(0);
                    int D = vVar2.D() + 6;
                    if (yVar == null) {
                        pVar.r(D);
                        return 0;
                    }
                    vVar2.G(D);
                    pVar.readFully(vVar2.f8583a, 0, D);
                    vVar2.J(6);
                    i iVar2 = yVar.f14005a;
                    a4.g gVar = yVar.f14007c;
                    vVar2.h(0, 3, gVar.f276b);
                    gVar.q(0);
                    gVar.t(8);
                    yVar.d = gVar.h();
                    yVar.f14008e = gVar.h();
                    gVar.t(6);
                    vVar2.h(0, gVar.i(8), gVar.f276b);
                    gVar.q(0);
                    e2.b0 b0Var2 = yVar.f14006b;
                    yVar.f14010g = 0L;
                    if (yVar.d) {
                        gVar.t(4);
                        gVar.t(1);
                        gVar.t(1);
                        long i18 = (gVar.i(3) << 30) | (gVar.i(15) << 15) | gVar.i(15);
                        gVar.t(1);
                        if (!yVar.f14009f && yVar.f14008e) {
                            gVar.t(4);
                            gVar.t(1);
                            long i19 = gVar.i(15) << 15;
                            gVar.t(1);
                            gVar.t(1);
                            b0Var2.b(i19 | (gVar.i(3) << 30) | gVar.i(15));
                            yVar.f14009f = true;
                            j10 = i18;
                        } else {
                            j10 = i18;
                        }
                        yVar.f14010g = b0Var2.b(j10);
                    }
                    iVar2.g(4, yVar.f14010g);
                    iVar2.b(vVar2);
                    iVar2.f(false);
                    vVar2.I(vVar2.f8583a.length);
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
