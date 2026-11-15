package m4;

import android.util.SparseArray;
import h2.k0;
import h9.i0;
import h9.s1;
import java.util.List;
public final class z implements f3.o {
    public boolean f20459e;
    public boolean f20460f;
    public boolean f20461g;
    public long h;
    public k3.a f20462i;
    public f3.q f20463j;
    public boolean f20464k;
    public final k0 f20456a = new k0(0);
    public final h2.x f20458c = new h2.x(4096);
    public final SparseArray f20457b = new SparseArray();
    public final x d = new x(0);

    @Override
    public final boolean b(f3.p pVar) {
        byte[] bArr = new byte[14];
        f3.l lVar = (f3.l) pVar;
        lVar.h(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            lVar.n(bArr[13] & 7, false);
            lVar.h(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void c(f3.q qVar) {
        this.f20463j = qVar;
    }

    @Override
    public final void d(long j3, long j10) {
        boolean z10;
        k0 k0Var = this.f20456a;
        boolean z11 = true;
        if (k0Var.e() == -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            long d = k0Var.d();
            if (d == -9223372036854775807L || d == 0 || d == j10) {
                z11 = false;
            }
            z10 = z11;
        }
        if (z10) {
            k0Var.g(j10);
        }
        k3.a aVar = this.f20462i;
        if (aVar != null) {
            aVar.d(j10);
        }
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f20457b;
            if (i7 < sparseArray.size()) {
                y yVar = (y) sparseArray.valueAt(i7);
                yVar.f20454f = false;
                yVar.f20450a.d();
                i7++;
            } else {
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
        int i7;
        int i10;
        long j3;
        long j10;
        long j11;
        i iVar;
        long j12;
        this.f20463j.getClass();
        long length = pVar.getLength();
        int i11 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j13 = -9223372036854775807L;
        x xVar = this.d;
        if (i11 != 0 && !xVar.d) {
            k0 k0Var = xVar.f20444b;
            h2.x xVar2 = xVar.f20445c;
            if (!xVar.f20447f) {
                long length2 = pVar.getLength();
                int min = (int) Math.min(20000L, length2);
                long j14 = length2 - min;
                if (pVar.getPosition() != j14) {
                    sVar.f10877a = j14;
                    return 1;
                }
                xVar2.K(min);
                pVar.l();
                pVar.c(0, min, xVar2.f13521a);
                int i12 = xVar2.f13522b;
                int i13 = xVar2.f13523c - 4;
                while (true) {
                    if (i13 < i12) {
                        break;
                    }
                    if (x.b(i13, xVar2.f13521a) == 442) {
                        xVar2.N(i13 + 4);
                        long c10 = x.c(xVar2);
                        if (c10 != -9223372036854775807L) {
                            j13 = c10;
                            break;
                        }
                    }
                    i13--;
                }
                xVar.h = j13;
                xVar.f20447f = true;
                return 0;
            } else if (xVar.h == -9223372036854775807L) {
                xVar.a(pVar);
                return 0;
            } else if (!xVar.f20446e) {
                int min2 = (int) Math.min(20000L, pVar.getLength());
                long j15 = 0;
                if (pVar.getPosition() != j15) {
                    sVar.f10877a = j15;
                    return 1;
                }
                xVar2.K(min2);
                pVar.l();
                pVar.c(0, min2, xVar2.f13521a);
                int i14 = xVar2.f13522b;
                int i15 = xVar2.f13523c;
                while (true) {
                    if (i14 < i15 - 3) {
                        if (x.b(i14, xVar2.f13521a) == 442) {
                            xVar2.N(i14 + 4);
                            long c11 = x.c(xVar2);
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
                xVar.f20448g = j12;
                xVar.f20446e = true;
                return 0;
            } else {
                long j16 = xVar.f20448g;
                if (j16 == -9223372036854775807L) {
                    xVar.a(pVar);
                    return 0;
                }
                xVar.f20449i = k0Var.c(xVar.h) - k0Var.b(j16);
                xVar.a(pVar);
                return 0;
            }
        }
        if (!this.f20464k) {
            this.f20464k = true;
            long j17 = xVar.f20449i;
            if (j17 != -9223372036854775807L) {
                i7 = i11;
                i10 = 4;
                k3.a aVar = new k3.a(new pb.b(8), new k8.a(xVar.f20444b), j17, j17 + 1, 0L, length, 188L, 1000);
                this.f20462i = aVar;
                this.f20463j.f(aVar.f17750a);
            } else {
                i7 = i11;
                i10 = 4;
                this.f20463j.f(new f3.t(j17));
            }
        } else {
            i7 = i11;
            i10 = 4;
        }
        k3.a aVar2 = this.f20462i;
        if (aVar2 != null && aVar2.f17752c != null) {
            return aVar2.b(pVar, sVar);
        }
        pVar.l();
        if (i7 != 0) {
            j3 = length - pVar.j();
        } else {
            j3 = -1;
        }
        if (j3 == -1 || j3 >= 4) {
            h2.x xVar3 = this.f20458c;
            if (pVar.h(xVar3.f13521a, 0, i10, true)) {
                xVar3.N(0);
                int m10 = xVar3.m();
                if (m10 == 441) {
                    return -1;
                }
                if (m10 == 442) {
                    pVar.c(0, 10, xVar3.f13521a);
                    xVar3.N(9);
                    pVar.m((xVar3.A() & 7) + 14);
                    return 0;
                } else if (m10 == 443) {
                    pVar.c(0, 2, xVar3.f13521a);
                    xVar3.N(0);
                    pVar.m(xVar3.H() + 6);
                    return 0;
                } else if (((m10 & (-256)) >> 8) != 1) {
                    pVar.m(1);
                    return 0;
                } else {
                    int i16 = m10 & 255;
                    SparseArray sparseArray = this.f20457b;
                    y yVar = (y) sparseArray.get(i16);
                    if (!this.f20459e) {
                        if (yVar == null) {
                            if (i16 == 189) {
                                iVar = new b("video/mp2p");
                                this.f20460f = true;
                                this.h = pVar.getPosition();
                            } else if ((m10 & 224) == 192) {
                                iVar = new u(null, 0, "video/mp2p");
                                this.f20460f = true;
                                this.h = pVar.getPosition();
                            } else if ((m10 & 240) == 224) {
                                iVar = new k(null, "video/mp2p");
                                this.f20461g = true;
                                this.h = pVar.getPosition();
                            } else {
                                iVar = null;
                            }
                            if (iVar != null) {
                                iVar.g(this.f20463j, new f0(i16, 256));
                                yVar = new y(iVar, this.f20456a);
                                sparseArray.put(i16, yVar);
                            }
                        }
                        if (this.f20460f && this.f20461g) {
                            j11 = this.h + 8192;
                        } else {
                            j11 = 1048576;
                        }
                        if (pVar.getPosition() > j11) {
                            this.f20459e = true;
                            this.f20463j.d1();
                        }
                    }
                    pVar.c(0, 2, xVar3.f13521a);
                    xVar3.N(0);
                    int H = xVar3.H() + 6;
                    if (yVar == null) {
                        pVar.m(H);
                        return 0;
                    }
                    xVar3.K(H);
                    pVar.readFully(xVar3.f13521a, 0, H);
                    xVar3.N(6);
                    i iVar2 = yVar.f20450a;
                    d4.f fVar = yVar.f20452c;
                    xVar3.k(0, 3, (byte[]) fVar.f7553b);
                    fVar.J(0);
                    fVar.L(8);
                    yVar.d = fVar.i();
                    yVar.f20453e = fVar.i();
                    fVar.L(6);
                    xVar3.k(0, fVar.j(8), (byte[]) fVar.f7553b);
                    fVar.J(0);
                    k0 k0Var2 = yVar.f20451b;
                    yVar.f20455g = 0L;
                    if (yVar.d) {
                        fVar.L(4);
                        fVar.L(1);
                        fVar.L(1);
                        long j18 = (fVar.j(3) << 30) | (fVar.j(15) << 15) | fVar.j(15);
                        fVar.L(1);
                        if (!yVar.f20454f && yVar.f20453e) {
                            fVar.L(4);
                            fVar.L(1);
                            long j19 = fVar.j(15) << 15;
                            fVar.L(1);
                            fVar.L(1);
                            k0Var2.b(j19 | (fVar.j(3) << 30) | fVar.j(15));
                            yVar.f20454f = true;
                            j10 = j18;
                        } else {
                            j10 = j18;
                        }
                        yVar.f20455g = k0Var2.b(j10);
                    }
                    iVar2.f(4, yVar.f20455g);
                    iVar2.c(xVar3);
                    iVar2.e(false);
                    xVar3.M(xVar3.f13521a.length);
                    return 0;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override
    public final f3.o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
