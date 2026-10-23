package j4;

import android.util.SparseArray;
import e2.k0;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
public final class z implements c3.q {
    public boolean e;
    public boolean f14290f;
    public boolean f14291g;
    public long h;
    public h3.a f14292i;
    public c3.s f14293j;
    public boolean f14294k;
    public final k0 f14287a = new k0(0);
    public final e2.x f14289c = new e2.x(4096);
    public final SparseArray f14288b = new SparseArray();
    public final x d = new x(0);

    @Override
    public final boolean a(c3.r rVar) {
        byte[] bArr = new byte[14];
        c3.l lVar = (c3.l) rVar;
        lVar.j(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            lVar.u(bArr[13] & 7, false);
            lVar.j(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void c(c3.s sVar) {
        this.f14293j = sVar;
    }

    @Override
    public final void d(long j10, long j11) {
        boolean z10;
        k0 k0Var = this.f14287a;
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
        h3.a aVar = this.f14292i;
        if (aVar != null) {
            aVar.d(j11);
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f14288b;
            if (i10 < sparseArray.size()) {
                y yVar = (y) sparseArray.valueAt(i10);
                yVar.f14285f = false;
                yVar.f14282a.c();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8481b;
        return x1.e;
    }

    @Override
    public final int f(c3.r rVar, c3.u uVar) {
        int i10;
        int i11;
        long j10;
        long j11;
        long j12;
        i iVar;
        long j13;
        this.f14293j.getClass();
        long length = rVar.getLength();
        int i12 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j14 = -9223372036854775807L;
        x xVar = this.d;
        if (i12 != 0 && !xVar.d) {
            k0 k0Var = xVar.f14277b;
            e2.x xVar2 = xVar.f14278c;
            if (!xVar.f14279f) {
                long length2 = rVar.getLength();
                int min = (int) Math.min(20000L, length2);
                long j15 = length2 - min;
                if (rVar.getPosition() != j15) {
                    uVar.f4664a = j15;
                    return 1;
                }
                xVar2.K(min);
                rVar.q();
                rVar.a(0, min, xVar2.f8298a);
                int i13 = xVar2.f8299b;
                int i14 = xVar2.f8300c - 4;
                while (true) {
                    if (i14 < i13) {
                        break;
                    }
                    if (x.b(i14, xVar2.f8298a) == 442) {
                        xVar2.N(i14 + 4);
                        long c10 = x.c(xVar2);
                        if (c10 != -9223372036854775807L) {
                            j14 = c10;
                            break;
                        }
                    }
                    i14--;
                }
                xVar.h = j14;
                xVar.f14279f = true;
                return 0;
            } else if (xVar.h == -9223372036854775807L) {
                xVar.a(rVar);
                return 0;
            } else if (!xVar.e) {
                int min2 = (int) Math.min(20000L, rVar.getLength());
                long j16 = 0;
                if (rVar.getPosition() != j16) {
                    uVar.f4664a = j16;
                    return 1;
                }
                xVar2.K(min2);
                rVar.q();
                rVar.a(0, min2, xVar2.f8298a);
                int i15 = xVar2.f8299b;
                int i16 = xVar2.f8300c;
                while (true) {
                    if (i15 < i16 - 3) {
                        if (x.b(i15, xVar2.f8298a) == 442) {
                            xVar2.N(i15 + 4);
                            long c11 = x.c(xVar2);
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
                xVar.f14280g = j13;
                xVar.e = true;
                return 0;
            } else {
                long j17 = xVar.f14280g;
                if (j17 == -9223372036854775807L) {
                    xVar.a(rVar);
                    return 0;
                }
                xVar.f14281i = k0Var.c(xVar.h) - k0Var.b(j17);
                xVar.a(rVar);
                return 0;
            }
        }
        if (!this.f14294k) {
            this.f14294k = true;
            long j18 = xVar.f14281i;
            if (j18 != -9223372036854775807L) {
                i10 = i12;
                i11 = 4;
                h3.a aVar = new h3.a(new t7.u(3), new n4.s(xVar.f14277b), j18, j18 + 1, 0L, length, 188L, 1000);
                this.f14292i = aVar;
                this.f14293j.g0(aVar.f11676a);
            } else {
                i10 = i12;
                i11 = 4;
                this.f14293j.g0(new c3.v(j18));
            }
        } else {
            i10 = i12;
            i11 = 4;
        }
        h3.a aVar2 = this.f14292i;
        if (aVar2 != null && aVar2.f11678c != null) {
            return aVar2.b(rVar, uVar);
        }
        rVar.q();
        if (i10 != 0) {
            j10 = length - rVar.k();
        } else {
            j10 = -1;
        }
        if (j10 == -1 || j10 >= 4) {
            e2.x xVar3 = this.f14289c;
            if (rVar.j(xVar3.f8298a, 0, i11, true)) {
                xVar3.N(0);
                int m10 = xVar3.m();
                if (m10 == 441) {
                    return -1;
                }
                if (m10 == 442) {
                    rVar.a(0, 10, xVar3.f8298a);
                    xVar3.N(9);
                    rVar.r((xVar3.A() & 7) + 14);
                    return 0;
                } else if (m10 == 443) {
                    rVar.a(0, 2, xVar3.f8298a);
                    xVar3.N(0);
                    rVar.r(xVar3.H() + 6);
                    return 0;
                } else if (((m10 & (-256)) >> 8) != 1) {
                    rVar.r(1);
                    return 0;
                } else {
                    int i17 = m10 & 255;
                    SparseArray sparseArray = this.f14288b;
                    y yVar = (y) sparseArray.get(i17);
                    if (!this.e) {
                        if (yVar == null) {
                            if (i17 == 189) {
                                iVar = new b("video/mp2p");
                                this.f14290f = true;
                                this.h = rVar.getPosition();
                            } else if ((m10 & 224) == 192) {
                                iVar = new u(null, 0, "video/mp2p");
                                this.f14290f = true;
                                this.h = rVar.getPosition();
                            } else if ((m10 & 240) == 224) {
                                iVar = new k(null, "video/mp2p");
                                this.f14291g = true;
                                this.h = rVar.getPosition();
                            } else {
                                iVar = null;
                            }
                            if (iVar != null) {
                                iVar.d(this.f14293j, new f0(i17, 256));
                                yVar = new y(iVar, this.f14287a);
                                sparseArray.put(i17, yVar);
                            }
                        }
                        if (this.f14290f && this.f14291g) {
                            j12 = this.h + 8192;
                        } else {
                            j12 = 1048576;
                        }
                        if (rVar.getPosition() > j12) {
                            this.e = true;
                            this.f14293j.C();
                        }
                    }
                    rVar.a(0, 2, xVar3.f8298a);
                    xVar3.N(0);
                    int H = xVar3.H() + 6;
                    if (yVar == null) {
                        rVar.r(H);
                        return 0;
                    }
                    xVar3.K(H);
                    rVar.readFully(xVar3.f8298a, 0, H);
                    xVar3.N(6);
                    i iVar2 = yVar.f14282a;
                    a4.g gVar = yVar.f14284c;
                    xVar3.k(0, 3, gVar.f260b);
                    gVar.m(0);
                    gVar.o(8);
                    yVar.d = gVar.f();
                    yVar.e = gVar.f();
                    gVar.o(6);
                    xVar3.k(0, gVar.g(8), gVar.f260b);
                    gVar.m(0);
                    k0 k0Var2 = yVar.f14283b;
                    yVar.f14286g = 0L;
                    if (yVar.d) {
                        gVar.o(4);
                        gVar.o(1);
                        gVar.o(1);
                        long g10 = (gVar.g(3) << 30) | (gVar.g(15) << 15) | gVar.g(15);
                        gVar.o(1);
                        if (!yVar.f14285f && yVar.e) {
                            gVar.o(4);
                            gVar.o(1);
                            long g11 = gVar.g(15) << 15;
                            gVar.o(1);
                            gVar.o(1);
                            k0Var2.b(g11 | (gVar.g(3) << 30) | gVar.g(15));
                            yVar.f14285f = true;
                            j11 = g10;
                        } else {
                            j11 = g10;
                        }
                        yVar.f14286g = k0Var2.b(j11);
                    }
                    iVar2.f(4, yVar.f14286g);
                    iVar2.a(xVar3);
                    iVar2.e(false);
                    xVar3.M(xVar3.f8298a.length);
                    return 0;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override
    public final c3.q b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
