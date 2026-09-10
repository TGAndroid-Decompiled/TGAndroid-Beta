package j4;

import android.util.SparseArray;
import e9.a1;
import e9.i0;
import java.util.List;
public final class a0 implements c3.o {
    public boolean e;
    public boolean f11501f;
    public boolean f11502g;
    public long h;
    public h3.a f11503i;
    public c3.q f11504j;
    public boolean f11505k;
    public final e2.b0 f11498a = new e2.b0(0);
    public final e2.v f11500c = new e2.v(4096);
    public final SparseArray f11499b = new SparseArray();
    public final y d = new y(0);

    @Override
    public final boolean b(c3.p pVar) {
        byte[] bArr = new byte[14];
        c3.l lVar = (c3.l) pVar;
        lVar.g(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            lVar.s(bArr[13] & 7, false);
            lVar.g(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void g(c3.q qVar) {
        this.f11504j = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        boolean z10;
        e2.b0 b0Var = this.f11498a;
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
        h3.a aVar = this.f11503i;
        if (aVar != null) {
            aVar.d(j10);
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f11499b;
            if (i10 < sparseArray.size()) {
                z zVar = (z) sparseArray.valueAt(i10);
                zVar.f11766f = false;
                zVar.f11763a.b();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final List i() {
        e9.g0 g0Var = i0.f7384b;
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
        e2.d.h(this.f11504j);
        long length = pVar.getLength();
        y yVar = this.d;
        int i11 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        if (i11 != 0 && !yVar.d) {
            e2.b0 b0Var = yVar.f11758b;
            e2.v vVar = yVar.f11759c;
            if (!yVar.f11760f) {
                long length2 = pVar.getLength();
                int min = (int) Math.min(20000L, length2);
                long j14 = length2 - min;
                if (pVar.getPosition() != j14) {
                    sVar.f4212a = j14;
                    return 1;
                }
                vVar.G(min);
                pVar.p();
                pVar.b(0, min, vVar.f7234a);
                int i12 = vVar.f7235b;
                int i13 = vVar.f7236c - 4;
                while (true) {
                    if (i13 >= i12) {
                        if (y.b(i13, vVar.f7234a) == 442) {
                            vVar.J(i13 + 4);
                            long c10 = y.c(vVar);
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
                yVar.h = j13;
                yVar.f11760f = true;
                return 0;
            } else if (yVar.h == -9223372036854775807L) {
                yVar.a(pVar);
                return 0;
            } else if (!yVar.e) {
                int min2 = (int) Math.min(20000L, pVar.getLength());
                long j15 = 0;
                if (pVar.getPosition() != j15) {
                    sVar.f4212a = j15;
                    return 1;
                }
                vVar.G(min2);
                pVar.p();
                pVar.b(0, min2, vVar.f7234a);
                int i14 = vVar.f7235b;
                int i15 = vVar.f7236c;
                while (true) {
                    if (i14 < i15 - 3) {
                        if (y.b(i14, vVar.f7234a) == 442) {
                            vVar.J(i14 + 4);
                            long c11 = y.c(vVar);
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
                yVar.f11761g = j12;
                yVar.e = true;
                return 0;
            } else {
                long j16 = yVar.f11761g;
                if (j16 == -9223372036854775807L) {
                    yVar.a(pVar);
                    return 0;
                }
                yVar.f11762i = b0Var.c(yVar.h) - b0Var.b(j16);
                yVar.a(pVar);
                return 0;
            }
        }
        if (!this.f11505k) {
            this.f11505k = true;
            long j17 = yVar.f11762i;
            if (j17 != -9223372036854775807L) {
                e2.b0 b0Var2 = yVar.f11758b;
                rb.a aVar = new rb.a(5);
                of.b bVar = new of.b(b0Var2);
                long j18 = 1 + j17;
                i10 = 4;
                h3.a aVar2 = new h3.a(aVar, bVar, j17, j18, 0L, length, 188L, 1000);
                this.f11503i = aVar2;
                this.f11504j.G(aVar2.f9226a);
            } else {
                i10 = 4;
                this.f11504j.G(new c3.t(j17));
            }
        } else {
            i10 = 4;
        }
        h3.a aVar3 = this.f11503i;
        if (aVar3 != null && aVar3.f9228c != null) {
            return aVar3.b(pVar, sVar);
        }
        pVar.p();
        if (i11 != 0) {
            j3 = length - pVar.h();
        } else {
            j3 = -1;
        }
        if (j3 == -1 || j3 >= 4) {
            e2.v vVar2 = this.f11500c;
            if (pVar.g(vVar2.f7234a, 0, i10, true)) {
                vVar2.J(0);
                int j19 = vVar2.j();
                if (j19 == 441) {
                    return -1;
                }
                if (j19 == 442) {
                    pVar.b(0, 10, vVar2.f7234a);
                    vVar2.J(9);
                    pVar.q((vVar2.x() & 7) + 14);
                    return 0;
                } else if (j19 == 443) {
                    pVar.b(0, 2, vVar2.f7234a);
                    vVar2.J(0);
                    pVar.q(vVar2.D() + 6);
                    return 0;
                } else if (((j19 & (-256)) >> 8) != 1) {
                    pVar.q(1);
                    return 0;
                } else {
                    int i16 = j19 & 255;
                    SparseArray sparseArray = this.f11499b;
                    z zVar = (z) sparseArray.get(i16);
                    if (!this.e) {
                        if (zVar == null) {
                            if (i16 == 189) {
                                iVar = new b("video/mp2p");
                                this.f11501f = true;
                                this.h = pVar.getPosition();
                            } else if ((j19 & 224) == 192) {
                                iVar = new u(null, 0, "video/mp2p");
                                this.f11501f = true;
                                this.h = pVar.getPosition();
                            } else if ((j19 & 240) == 224) {
                                iVar = new k(null, "video/mp2p");
                                this.f11502g = true;
                                this.h = pVar.getPosition();
                            } else {
                                iVar = null;
                            }
                            if (iVar != null) {
                                iVar.c(this.f11504j, new g0(i16, 256));
                                zVar = new z(iVar, this.f11498a);
                                sparseArray.put(i16, zVar);
                            }
                        }
                        if (this.f11501f && this.f11502g) {
                            j11 = this.h + 8192;
                        } else {
                            j11 = 1048576;
                        }
                        if (pVar.getPosition() > j11) {
                            this.e = true;
                            this.f11504j.B();
                        }
                    }
                    pVar.b(0, 2, vVar2.f7234a);
                    vVar2.J(0);
                    int D = vVar2.D() + 6;
                    if (zVar == null) {
                        pVar.q(D);
                        return 0;
                    }
                    vVar2.G(D);
                    pVar.readFully(vVar2.f7234a, 0, D);
                    vVar2.J(6);
                    i iVar2 = zVar.f11763a;
                    a4.h hVar = zVar.f11765c;
                    vVar2.h(0, 3, hVar.f254b);
                    hVar.q(0);
                    hVar.t(8);
                    zVar.d = hVar.h();
                    zVar.e = hVar.h();
                    hVar.t(6);
                    vVar2.h(0, hVar.i(8), hVar.f254b);
                    hVar.q(0);
                    e2.b0 b0Var3 = zVar.f11764b;
                    zVar.f11767g = 0L;
                    if (zVar.d) {
                        hVar.t(4);
                        hVar.t(1);
                        hVar.t(1);
                        long i17 = (hVar.i(3) << 30) | (hVar.i(15) << 15) | hVar.i(15);
                        hVar.t(1);
                        if (!zVar.f11766f && zVar.e) {
                            hVar.t(4);
                            hVar.t(1);
                            long i18 = hVar.i(15) << 15;
                            hVar.t(1);
                            hVar.t(1);
                            b0Var3.b(i18 | (hVar.i(3) << 30) | hVar.i(15));
                            zVar.f11766f = true;
                            j10 = i17;
                        } else {
                            j10 = i17;
                        }
                        zVar.f11767g = b0Var3.b(j10);
                    }
                    iVar2.e(4, zVar.f11767g);
                    iVar2.a(vVar2);
                    iVar2.d(false);
                    vVar2.I(vVar2.f7234a.length);
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
