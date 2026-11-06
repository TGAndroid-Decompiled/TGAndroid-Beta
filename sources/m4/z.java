package m4;

import android.util.SparseArray;
import h2.k0;
import h9.i0;
import h9.t1;
import java.util.List;
public final class z implements f3.o {
    public boolean f19862e;
    public boolean f19863f;
    public boolean f19864g;
    public long h;
    public k3.a f19865i;
    public f3.q f19866j;
    public boolean f19867k;
    public final k0 f19859a = new k0(0);
    public final h2.x f19861c = new h2.x(4096);
    public final SparseArray f19860b = new SparseArray();
    public final x d = new x(0);

    @Override
    public final boolean b(f3.p pVar) {
        byte[] bArr = new byte[14];
        f3.l lVar = (f3.l) pVar;
        lVar.k(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            lVar.v(bArr[13] & 7, false);
            lVar.k(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void c(f3.q qVar) {
        this.f19866j = qVar;
    }

    @Override
    public final void d(long j3, long j10) {
        boolean z9;
        k0 k0Var = this.f19859a;
        boolean z10 = true;
        if (k0Var.e() == -9223372036854775807L) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            long d = k0Var.d();
            if (d == -9223372036854775807L || d == 0 || d == j10) {
                z10 = false;
            }
            z9 = z10;
        }
        if (z9) {
            k0Var.g(j10);
        }
        k3.a aVar = this.f19865i;
        if (aVar != null) {
            aVar.d(j10);
        }
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f19860b;
            if (i7 < sparseArray.size()) {
                y yVar = (y) sparseArray.valueAt(i7);
                yVar.f19857f = false;
                yVar.f19853a.d();
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final List e() {
        h9.g0 g0Var = i0.f14329b;
        return t1.f14397e;
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
        this.f19866j.getClass();
        long length = pVar.getLength();
        int i11 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j13 = -9223372036854775807L;
        x xVar = this.d;
        if (i11 != 0 && !xVar.d) {
            k0 k0Var = xVar.f19847b;
            h2.x xVar2 = xVar.f19848c;
            if (!xVar.f19850f) {
                long length2 = pVar.getLength();
                int min = (int) Math.min(20000L, length2);
                long j14 = length2 - min;
                if (pVar.getPosition() != j14) {
                    sVar.f11070a = j14;
                    return 1;
                }
                xVar2.K(min);
                pVar.q();
                pVar.b(0, min, xVar2.f14162a);
                int i12 = xVar2.f14163b;
                int i13 = xVar2.f14164c - 4;
                while (true) {
                    if (i13 < i12) {
                        break;
                    }
                    if (x.b(i13, xVar2.f14162a) == 442) {
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
                xVar.f19850f = true;
                return 0;
            } else if (xVar.h == -9223372036854775807L) {
                xVar.a(pVar);
                return 0;
            } else if (!xVar.f19849e) {
                int min2 = (int) Math.min(20000L, pVar.getLength());
                long j15 = 0;
                if (pVar.getPosition() != j15) {
                    sVar.f11070a = j15;
                    return 1;
                }
                xVar2.K(min2);
                pVar.q();
                pVar.b(0, min2, xVar2.f14162a);
                int i14 = xVar2.f14163b;
                int i15 = xVar2.f14164c;
                while (true) {
                    if (i14 < i15 - 3) {
                        if (x.b(i14, xVar2.f14162a) == 442) {
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
                xVar.f19851g = j12;
                xVar.f19849e = true;
                return 0;
            } else {
                long j16 = xVar.f19851g;
                if (j16 == -9223372036854775807L) {
                    xVar.a(pVar);
                    return 0;
                }
                xVar.f19852i = k0Var.c(xVar.h) - k0Var.b(j16);
                xVar.a(pVar);
                return 0;
            }
        }
        if (!this.f19867k) {
            this.f19867k = true;
            long j17 = xVar.f19852i;
            if (j17 != -9223372036854775807L) {
                i7 = i11;
                i10 = 4;
                k3.a aVar = new k3.a(new nb.a(8), new j2.n(xVar.f19847b), j17, j17 + 1, 0L, length, 188L, 1000);
                this.f19865i = aVar;
                this.f19866j.f(aVar.f17190a);
            } else {
                i7 = i11;
                i10 = 4;
                this.f19866j.f(new f3.t(j17));
            }
        } else {
            i7 = i11;
            i10 = 4;
        }
        k3.a aVar2 = this.f19865i;
        if (aVar2 != null && aVar2.f17192c != null) {
            return aVar2.b(pVar, sVar);
        }
        pVar.q();
        if (i7 != 0) {
            j3 = length - pVar.l();
        } else {
            j3 = -1;
        }
        if (j3 == -1 || j3 >= 4) {
            h2.x xVar3 = this.f19861c;
            if (pVar.k(xVar3.f14162a, 0, i10, true)) {
                xVar3.N(0);
                int m10 = xVar3.m();
                if (m10 == 441) {
                    return -1;
                }
                if (m10 == 442) {
                    pVar.b(0, 10, xVar3.f14162a);
                    xVar3.N(9);
                    pVar.s((xVar3.A() & 7) + 14);
                    return 0;
                } else if (m10 == 443) {
                    pVar.b(0, 2, xVar3.f14162a);
                    xVar3.N(0);
                    pVar.s(xVar3.H() + 6);
                    return 0;
                } else if (((m10 & (-256)) >> 8) != 1) {
                    pVar.s(1);
                    return 0;
                } else {
                    int i16 = m10 & 255;
                    SparseArray sparseArray = this.f19860b;
                    y yVar = (y) sparseArray.get(i16);
                    if (!this.f19862e) {
                        if (yVar == null) {
                            if (i16 == 189) {
                                iVar = new b("video/mp2p");
                                this.f19863f = true;
                                this.h = pVar.getPosition();
                            } else if ((m10 & 224) == 192) {
                                iVar = new u(null, 0, "video/mp2p");
                                this.f19863f = true;
                                this.h = pVar.getPosition();
                            } else if ((m10 & 240) == 224) {
                                iVar = new k(null, "video/mp2p");
                                this.f19864g = true;
                                this.h = pVar.getPosition();
                            } else {
                                iVar = null;
                            }
                            if (iVar != null) {
                                iVar.g(this.f19866j, new g0(i16, 256));
                                yVar = new y(iVar, this.f19859a);
                                sparseArray.put(i16, yVar);
                            }
                        }
                        if (this.f19863f && this.f19864g) {
                            j11 = this.h + 8192;
                        } else {
                            j11 = 1048576;
                        }
                        if (pVar.getPosition() > j11) {
                            this.f19862e = true;
                            this.f19866j.U0();
                        }
                    }
                    pVar.b(0, 2, xVar3.f14162a);
                    xVar3.N(0);
                    int H = xVar3.H() + 6;
                    if (yVar == null) {
                        pVar.s(H);
                        return 0;
                    }
                    xVar3.K(H);
                    pVar.readFully(xVar3.f14162a, 0, H);
                    xVar3.N(6);
                    i iVar2 = yVar.f19853a;
                    d4.f fVar = yVar.f19855c;
                    xVar3.k(0, 3, (byte[]) fVar.f8164b);
                    fVar.J(0);
                    fVar.L(8);
                    yVar.d = fVar.i();
                    yVar.f19856e = fVar.i();
                    fVar.L(6);
                    xVar3.k(0, fVar.j(8), (byte[]) fVar.f8164b);
                    fVar.J(0);
                    k0 k0Var2 = yVar.f19854b;
                    yVar.f19858g = 0L;
                    if (yVar.d) {
                        fVar.L(4);
                        fVar.L(1);
                        fVar.L(1);
                        long j18 = (fVar.j(3) << 30) | (fVar.j(15) << 15) | fVar.j(15);
                        fVar.L(1);
                        if (!yVar.f19857f && yVar.f19856e) {
                            fVar.L(4);
                            fVar.L(1);
                            long j19 = fVar.j(15) << 15;
                            fVar.L(1);
                            fVar.L(1);
                            k0Var2.b(j19 | (fVar.j(3) << 30) | fVar.j(15));
                            yVar.f19857f = true;
                            j10 = j18;
                        } else {
                            j10 = j18;
                        }
                        yVar.f19858g = k0Var2.b(j10);
                    }
                    iVar2.f(4, yVar.f19858g);
                    iVar2.c(xVar3);
                    iVar2.e(false);
                    xVar3.M(xVar3.f14162a.length);
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
