package j4;

import android.util.SparseArray;
import e2.k0;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
public final class a0 implements c3.o {
    public boolean e;
    public boolean f9399f;
    public boolean f9400g;
    public long h;
    public h3.a f9401i;
    public c3.q f9402j;
    public boolean f9403k;
    public final k0 f9396a = new k0(0);
    public final e2.x f9398c = new e2.x(4096);
    public final SparseArray f9397b = new SparseArray();
    public final y d = new y(0);

    @Override
    public final boolean a(c3.p pVar) {
        byte[] bArr = new byte[14];
        c3.l lVar = (c3.l) pVar;
        lVar.j(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            lVar.r(bArr[13] & 7, false);
            lVar.j(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void c(c3.q qVar) {
        this.f9402j = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        boolean z10;
        k0 k0Var = this.f9396a;
        boolean z11 = true;
        if (k0Var.e() == -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            long d = k0Var.d();
            if (d == -9223372036854775807L || d == 0 || d == j11) {
                z11 = false;
            }
            z10 = z11;
        }
        if (z10) {
            k0Var.g(j11);
        }
        h3.a aVar = this.f9401i;
        if (aVar != null) {
            aVar.d(j11);
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f9397b;
            if (i10 < sparseArray.size()) {
                z zVar = (z) sparseArray.valueAt(i10);
                zVar.f9664f = false;
                zVar.f9661a.e();
                i10++;
            } else {
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
        int i10;
        int i11;
        long j10;
        long j11;
        long j12;
        i iVar;
        long j13;
        this.f9402j.getClass();
        long length = pVar.getLength();
        int i12 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j14 = -9223372036854775807L;
        y yVar = this.d;
        if (i12 != 0 && !yVar.d) {
            k0 k0Var = yVar.f9656b;
            e2.x xVar = yVar.f9657c;
            if (!yVar.f9658f) {
                long length2 = pVar.getLength();
                int min = (int) Math.min(20000L, length2);
                long j15 = length2 - min;
                if (pVar.getPosition() != j15) {
                    sVar.f3687a = j15;
                    return 1;
                }
                xVar.K(min);
                pVar.m();
                pVar.b(0, min, xVar.f6207a);
                int i13 = xVar.f6208b;
                int i14 = xVar.f6209c - 4;
                while (true) {
                    if (i14 < i13) {
                        break;
                    }
                    if (y.b(i14, xVar.f6207a) == 442) {
                        xVar.N(i14 + 4);
                        long c10 = y.c(xVar);
                        if (c10 != -9223372036854775807L) {
                            j14 = c10;
                            break;
                        }
                    }
                    i14--;
                }
                yVar.h = j14;
                yVar.f9658f = true;
                return 0;
            } else if (yVar.h == -9223372036854775807L) {
                yVar.a(pVar);
                return 0;
            } else if (!yVar.e) {
                int min2 = (int) Math.min(20000L, pVar.getLength());
                long j16 = 0;
                if (pVar.getPosition() != j16) {
                    sVar.f3687a = j16;
                    return 1;
                }
                xVar.K(min2);
                pVar.m();
                pVar.b(0, min2, xVar.f6207a);
                int i15 = xVar.f6208b;
                int i16 = xVar.f6209c;
                while (true) {
                    if (i15 < i16 - 3) {
                        if (y.b(i15, xVar.f6207a) == 442) {
                            xVar.N(i15 + 4);
                            long c11 = y.c(xVar);
                            if (c11 != -9223372036854775807L) {
                                j13 = c11;
                                break;
                            }
                        }
                        i15++;
                    } else {
                        j13 = -9223372036854775807L;
                        break;
                    }
                }
                yVar.f9659g = j13;
                yVar.e = true;
                return 0;
            } else {
                long j17 = yVar.f9659g;
                if (j17 == -9223372036854775807L) {
                    yVar.a(pVar);
                    return 0;
                }
                yVar.f9660i = k0Var.c(yVar.h) - k0Var.b(j17);
                yVar.a(pVar);
                return 0;
            }
        }
        if (!this.f9403k) {
            this.f9403k = true;
            long j18 = yVar.f9660i;
            if (j18 != -9223372036854775807L) {
                k0 k0Var2 = yVar.f9656b;
                hb.a aVar = new hb.a(4);
                ?? obj = new Object();
                obj.f13527a = k0Var2;
                obj.f13528b = new e2.x();
                i10 = i12;
                i11 = 4;
                h3.a aVar2 = new h3.a(aVar, obj, j18, j18 + 1, 0L, length, 188L, 1000);
                this.f9401i = aVar2;
                this.f9402j.G1(aVar2.f7603a);
            } else {
                i10 = i12;
                i11 = 4;
                this.f9402j.G1(new c3.t(j18));
            }
        } else {
            i10 = i12;
            i11 = 4;
        }
        h3.a aVar3 = this.f9401i;
        if (aVar3 != null && aVar3.f7605c != null) {
            return aVar3.b(pVar, sVar);
        }
        pVar.m();
        if (i10 != 0) {
            j10 = length - pVar.k();
        } else {
            j10 = -1;
        }
        if (j10 == -1 || j10 >= 4) {
            e2.x xVar2 = this.f9398c;
            if (pVar.j(xVar2.f6207a, 0, i11, true)) {
                xVar2.N(0);
                int m10 = xVar2.m();
                if (m10 == 441) {
                    return -1;
                }
                if (m10 == 442) {
                    pVar.b(0, 10, xVar2.f6207a);
                    xVar2.N(9);
                    pVar.q((xVar2.A() & 7) + 14);
                    return 0;
                } else if (m10 == 443) {
                    pVar.b(0, 2, xVar2.f6207a);
                    xVar2.N(0);
                    pVar.q(xVar2.H() + 6);
                    return 0;
                } else if (((m10 & (-256)) >> 8) != 1) {
                    pVar.q(1);
                    return 0;
                } else {
                    int i17 = m10 & 255;
                    SparseArray sparseArray = this.f9397b;
                    z zVar = (z) sparseArray.get(i17);
                    if (!this.e) {
                        if (zVar == null) {
                            if (i17 == 189) {
                                iVar = new b("video/mp2p");
                                this.f9399f = true;
                                this.h = pVar.getPosition();
                            } else if ((m10 & 224) == 192) {
                                iVar = new u(null, 0, "video/mp2p");
                                this.f9399f = true;
                                this.h = pVar.getPosition();
                            } else if ((m10 & 240) == 224) {
                                iVar = new k(null, "video/mp2p");
                                this.f9400g = true;
                                this.h = pVar.getPosition();
                            } else {
                                iVar = null;
                            }
                            if (iVar != null) {
                                iVar.f(this.f9402j, new g0(i17, 256));
                                zVar = new z(iVar, this.f9396a);
                                sparseArray.put(i17, zVar);
                            }
                        }
                        if (this.f9399f && this.f9400g) {
                            j12 = this.h + 8192;
                        } else {
                            j12 = 1048576;
                        }
                        if (pVar.getPosition() > j12) {
                            this.e = true;
                            this.f9402j.Q0();
                        }
                    }
                    pVar.b(0, 2, xVar2.f6207a);
                    xVar2.N(0);
                    int H = xVar2.H() + 6;
                    if (zVar == null) {
                        pVar.q(H);
                        return 0;
                    }
                    xVar2.K(H);
                    pVar.readFully(xVar2.f6207a, 0, H);
                    xVar2.N(6);
                    i iVar2 = zVar.f9661a;
                    a4.g gVar = zVar.f9663c;
                    xVar2.k(0, 3, (byte[]) gVar.f260b);
                    gVar.d0(0);
                    gVar.f0(8);
                    zVar.d = gVar.h();
                    zVar.e = gVar.h();
                    gVar.f0(6);
                    xVar2.k(0, gVar.i(8), (byte[]) gVar.f260b);
                    gVar.d0(0);
                    k0 k0Var3 = zVar.f9662b;
                    zVar.f9665g = 0L;
                    if (zVar.d) {
                        gVar.f0(4);
                        gVar.f0(1);
                        gVar.f0(1);
                        long i18 = (gVar.i(3) << 30) | (gVar.i(15) << 15) | gVar.i(15);
                        gVar.f0(1);
                        if (!zVar.f9664f && zVar.e) {
                            gVar.f0(4);
                            gVar.f0(1);
                            long i19 = gVar.i(15) << 15;
                            gVar.f0(1);
                            gVar.f0(1);
                            k0Var3.b(i19 | (gVar.i(3) << 30) | gVar.i(15));
                            zVar.f9664f = true;
                            j11 = i18;
                        } else {
                            j11 = i18;
                        }
                        zVar.f9665g = k0Var3.b(j11);
                    }
                    iVar2.h(4, zVar.f9665g);
                    iVar2.c(xVar2);
                    iVar2.g(false);
                    xVar2.M(xVar2.f6207a.length);
                    return 0;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override
    public final c3.o b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
