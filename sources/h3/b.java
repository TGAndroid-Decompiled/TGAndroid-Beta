package h3;

import a4.h;
import b2.p0;
import b2.r;
import b2.r0;
import b2.s0;
import c3.b0;
import c3.h0;
import c3.l;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import c3.t;
import c3.u;
import e2.d0;
import e2.v;
import e9.a1;
import e9.g0;
import e9.i0;
import ei.f;
import hg.k0;
import java.util.Arrays;
import java.util.List;
public final class b implements o {
    public q f11003e;
    public h0 f11004f;
    public p0 h;
    public u f11006i;
    public int f11007j;
    public int f11008k;
    public a f11009l;
    public int f11010m;
    public long f11011n;
    public final byte[] f11000a = new byte[42];
    public final v f11001b = new v(new byte[32768], 0);
    public final boolean f11002c = false;
    public final s d = new Object();
    public int f11005g = 0;

    @Override
    public final boolean b(p pVar) {
        c3.b.s(pVar, false);
        v vVar = new v(4);
        ((l) pVar).f(vVar.f8589a, 0, 4, false);
        if (vVar.z() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override
    public final void g(q qVar) {
        this.f11003e = qVar;
        this.f11004f = qVar.Z1(0, 1);
        qVar.e1();
    }

    @Override
    public final void h(long j3, long j10) {
        long j11 = 0;
        if (j3 == 0) {
            this.f11005g = 0;
        } else {
            a aVar = this.f11009l;
            if (aVar != null) {
                aVar.d(j10);
            }
        }
        if (j10 != 0) {
            j11 = -1;
        }
        this.f11011n = j11;
        this.f11010m = 0;
        this.f11001b.G(0);
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8757b;
        return a1.f8720e;
    }

    @Override
    public final int m(p pVar, s sVar) {
        u uVar;
        int i10;
        b0 tVar;
        long j3;
        long j10;
        long j11;
        boolean z10;
        boolean z11;
        int i11 = this.f11005g;
        boolean z12 = true;
        if (i11 != 0) {
            byte[] bArr = this.f11000a;
            if (i11 != 1) {
                int i12 = 4;
                int i13 = 3;
                if (i11 != 2) {
                    int i14 = 7;
                    int i15 = 6;
                    if (i11 != 3) {
                        long j12 = 0;
                        if (i11 != 4) {
                            if (i11 == 5) {
                                this.f11004f.getClass();
                                this.f11006i.getClass();
                                a aVar = this.f11009l;
                                if (aVar != null && aVar.f10999c != null) {
                                    return aVar.b(pVar, sVar);
                                }
                                if (this.f11011n == -1) {
                                    u uVar2 = this.f11006i;
                                    pVar.m();
                                    pVar.h(1);
                                    byte[] bArr2 = new byte[1];
                                    pVar.b(0, 1, bArr2);
                                    if ((bArr2[0] & 1) == 1) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    pVar.h(2);
                                    if (!z11) {
                                        i14 = 6;
                                    }
                                    v vVar = new v(i14);
                                    byte[] bArr3 = vVar.f8589a;
                                    int i16 = 0;
                                    while (i16 < i14) {
                                        int d = pVar.d(i16, i14 - i16, bArr3);
                                        if (d == -1) {
                                            break;
                                        }
                                        i16 += d;
                                    }
                                    vVar.I(i16);
                                    pVar.m();
                                    try {
                                        long E = vVar.E();
                                        if (!z11) {
                                            E *= uVar2.f4105b;
                                        }
                                        j12 = E;
                                    } catch (NumberFormatException unused) {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        this.f11011n = j12;
                                    } else {
                                        throw s0.a(null, null);
                                    }
                                } else {
                                    v vVar2 = this.f11001b;
                                    int i17 = vVar2.f8591c;
                                    if (i17 < 32768) {
                                        int read = pVar.read(vVar2.f8589a, i17, 32768 - i17);
                                        if (read != -1) {
                                            z12 = false;
                                        }
                                        if (!z12) {
                                            vVar2.I(i17 + read);
                                        } else if (vVar2.a() == 0) {
                                            u uVar3 = this.f11006i;
                                            String str = d0.f8537a;
                                            this.f11004f.c((this.f11011n * 1000000) / uVar3.f4107e, 1, this.f11010m, 0, null);
                                            return -1;
                                        }
                                    } else {
                                        z12 = false;
                                    }
                                    int i18 = vVar2.f8590b;
                                    int i19 = this.f11010m;
                                    int i20 = this.f11007j;
                                    if (i19 < i20) {
                                        vVar2.K(Math.min(i20 - i19, vVar2.a()));
                                    }
                                    this.f11006i.getClass();
                                    int i21 = vVar2.f8590b;
                                    while (true) {
                                        int i22 = vVar2.f8591c - 16;
                                        s sVar2 = this.d;
                                        if (i21 <= i22) {
                                            vVar2.J(i21);
                                            if (c3.b.b(vVar2, this.f11006i, this.f11008k, sVar2)) {
                                                vVar2.J(i21);
                                                j11 = sVar2.f4100a;
                                                break;
                                            }
                                            i21++;
                                        } else {
                                            if (z12) {
                                                while (true) {
                                                    int i23 = vVar2.f8591c;
                                                    if (i21 <= i23 - this.f11007j) {
                                                        vVar2.J(i21);
                                                        try {
                                                            z10 = c3.b.b(vVar2, this.f11006i, this.f11008k, sVar2);
                                                        } catch (IndexOutOfBoundsException unused2) {
                                                            z10 = false;
                                                        }
                                                        if (vVar2.f8590b > vVar2.f8591c) {
                                                            z10 = false;
                                                        }
                                                        if (z10) {
                                                            vVar2.J(i21);
                                                            j11 = sVar2.f4100a;
                                                            break;
                                                        }
                                                        i21++;
                                                    } else {
                                                        vVar2.J(i23);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                vVar2.J(i21);
                                            }
                                            j11 = -1;
                                        }
                                    }
                                    int i24 = vVar2.f8590b - i18;
                                    vVar2.J(i18);
                                    this.f11004f.d(i24, vVar2);
                                    int i25 = this.f11010m + i24;
                                    this.f11010m = i25;
                                    if (j11 != -1) {
                                        u uVar4 = this.f11006i;
                                        String str2 = d0.f8537a;
                                        this.f11004f.c((this.f11011n * 1000000) / uVar4.f4107e, 1, i25, 0, null);
                                        this.f11010m = 0;
                                        this.f11011n = j11;
                                    }
                                    int length = vVar2.f8589a.length - vVar2.f8591c;
                                    if (vVar2.a() < 16 && length < 16) {
                                        int a2 = vVar2.a();
                                        byte[] bArr4 = vVar2.f8589a;
                                        System.arraycopy(bArr4, vVar2.f8590b, bArr4, 0, a2);
                                        vVar2.J(0);
                                        vVar2.I(a2);
                                    }
                                }
                                return 0;
                            }
                            throw new IllegalStateException();
                        }
                        pVar.m();
                        v vVar3 = new v(2);
                        pVar.b(0, 2, vVar3.f8589a);
                        int D = vVar3.D();
                        if ((D >> 2) == 16382) {
                            pVar.m();
                            this.f11008k = D;
                            q qVar = this.f11003e;
                            String str3 = d0.f8537a;
                            long position = pVar.getPosition();
                            long length2 = pVar.getLength();
                            this.f11006i.getClass();
                            u uVar5 = this.f11006i;
                            of.b bVar = uVar5.f4112k;
                            if (bVar != null && ((long[]) bVar.f17157b).length > 0) {
                                tVar = new t(uVar5, position, 0);
                                i10 = 0;
                            } else if (length2 != -1 && uVar5.f4111j > 0) {
                                int i26 = this.f11008k;
                                int i27 = uVar5.f4106c;
                                f fVar = new f(uVar5, 3);
                                a5.a aVar2 = new a5.a(uVar5, i26);
                                long b10 = uVar5.b();
                                long j13 = uVar5.f4111j;
                                int i28 = uVar5.d;
                                if (i28 > 0) {
                                    i10 = 0;
                                    j10 = ((i28 + i27) / 2) + 1;
                                } else {
                                    i10 = 0;
                                    int i29 = uVar5.f4104a;
                                    if (i29 == uVar5.f4105b && i29 > 0) {
                                        j3 = i29;
                                    } else {
                                        j3 = 4096;
                                    }
                                    j10 = 64 + (((j3 * uVar5.f4109g) * uVar5.h) / 8);
                                }
                                a aVar3 = new a(fVar, aVar2, b10, j13, position, length2, j10, Math.max(6, i27));
                                this.f11009l = aVar3;
                                tVar = aVar3.f10997a;
                            } else {
                                i10 = 0;
                                tVar = new t(uVar5.b());
                            }
                            qVar.X1(tVar);
                            this.f11005g = 5;
                            return i10;
                        }
                        pVar.m();
                        throw s0.a(null, "First frame does not start with sync code.");
                    }
                    u uVar6 = this.f11006i;
                    boolean z13 = false;
                    while (!z13) {
                        pVar.m();
                        byte[] bArr5 = new byte[i12];
                        h hVar = new h(bArr5, i12);
                        pVar.b(0, i12, bArr5);
                        boolean h = hVar.h();
                        int i30 = hVar.i(i14);
                        int i31 = hVar.i(24) + i12;
                        if (i30 == 0) {
                            byte[] bArr6 = new byte[38];
                            pVar.readFully(bArr6, 0, 38);
                            uVar6 = new u(bArr6, i12);
                        } else if (uVar6 != null) {
                            p0 p0Var = uVar6.f4113l;
                            if (i30 == i13) {
                                v vVar4 = new v(i31);
                                pVar.readFully(vVar4.f8589a, 0, i31);
                                uVar6 = new u(uVar6.f4104a, uVar6.f4105b, uVar6.f4106c, uVar6.d, uVar6.f4107e, uVar6.f4109g, uVar6.h, uVar6.f4111j, c3.b.u(vVar4), uVar6.f4113l);
                            } else {
                                if (i30 == i12) {
                                    v vVar5 = new v(i31);
                                    pVar.readFully(vVar5.f8589a, 0, i31);
                                    vVar5.K(i12);
                                    p0 r10 = c3.b.r(Arrays.asList((String[]) c3.b.v(vVar5, false, false).f297b));
                                    if (p0Var != null) {
                                        r10 = p0Var.b(r10);
                                    }
                                    uVar = new u(uVar6.f4104a, uVar6.f4105b, uVar6.f4106c, uVar6.d, uVar6.f4107e, uVar6.f4109g, uVar6.h, uVar6.f4111j, uVar6.f4112k, r10);
                                } else if (i30 == i15) {
                                    v vVar6 = new v(i31);
                                    pVar.readFully(vVar6.f8589a, 0, i31);
                                    vVar6.K(4);
                                    p0 p0Var2 = new p0(i0.z(o3.a.d(vVar6)));
                                    if (p0Var != null) {
                                        p0Var2 = p0Var.b(p0Var2);
                                    }
                                    uVar = new u(uVar6.f4104a, uVar6.f4105b, uVar6.f4106c, uVar6.d, uVar6.f4107e, uVar6.f4109g, uVar6.h, uVar6.f4111j, uVar6.f4112k, p0Var2);
                                } else {
                                    pVar.o(i31);
                                }
                                uVar6 = uVar;
                            }
                        } else {
                            throw new IllegalArgumentException();
                        }
                        String str4 = d0.f8537a;
                        this.f11006i = uVar6;
                        z13 = h;
                        i12 = 4;
                        i13 = 3;
                        i14 = 7;
                        i15 = 6;
                    }
                    this.f11006i.getClass();
                    this.f11007j = Math.max(this.f11006i.f4106c, 6);
                    b2.s c10 = this.f11006i.c(bArr, this.h);
                    h0 h0Var = this.f11004f;
                    r a10 = c10.a();
                    a10.f3505p = r0.n("audio/flac");
                    k0.r(a10, h0Var);
                    h0 h0Var2 = this.f11004f;
                    this.f11006i.b();
                    h0Var2.getClass();
                    this.f11005g = 4;
                    return 0;
                }
                v vVar7 = new v(4);
                pVar.readFully(vVar7.f8589a, 0, 4);
                if (vVar7.z() == 1716281667) {
                    this.f11005g = 3;
                    return 0;
                }
                throw s0.a(null, "Failed to read FLAC stream marker.");
            }
            pVar.b(0, bArr.length, bArr);
            pVar.m();
            this.f11005g = 2;
            return 0;
        }
        pVar.m();
        long g10 = pVar.g();
        p0 s10 = c3.b.s(pVar, !this.f11002c);
        pVar.o((int) (pVar.g() - g10));
        this.h = s10;
        this.f11005g = 1;
        return 0;
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
