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
import fi.f;
import i2.g;
import java.util.Arrays;
import java.util.List;
public final class b implements o {
    public q f10900e;
    public h0 f10901f;
    public p0 h;
    public u f10903i;
    public int f10904j;
    public int f10905k;
    public a f10906l;
    public int f10907m;
    public long f10908n;
    public final byte[] f10897a = new byte[42];
    public final v f10898b = new v(new byte[32768], 0);
    public final boolean f10899c = false;
    public final s d = new Object();
    public int f10902g = 0;

    @Override
    public final boolean b(p pVar) {
        c3.b.s(pVar, false);
        v vVar = new v(4);
        ((l) pVar).j(vVar.f8817a, 0, 4, false);
        if (vVar.z() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override
    public final void g(q qVar) {
        this.f10900e = qVar;
        this.f10901f = qVar.R1(0, 1);
        qVar.Z0();
    }

    @Override
    public final void h(long j3, long j10) {
        long j11 = 0;
        if (j3 == 0) {
            this.f10902g = 0;
        } else {
            a aVar = this.f10906l;
            if (aVar != null) {
                aVar.d(j10);
            }
        }
        if (j10 != 0) {
            j11 = -1;
        }
        this.f10908n = j11;
        this.f10907m = 0;
        this.f10898b.G(0);
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8985b;
        return a1.f8948e;
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
        int i11 = this.f10902g;
        boolean z12 = true;
        if (i11 != 0) {
            byte[] bArr = this.f10897a;
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
                                this.f10901f.getClass();
                                this.f10903i.getClass();
                                a aVar = this.f10906l;
                                if (aVar != null && aVar.f10896c != null) {
                                    return aVar.b(pVar, sVar);
                                }
                                if (this.f10908n == -1) {
                                    u uVar2 = this.f10903i;
                                    pVar.q();
                                    pVar.l(1);
                                    byte[] bArr2 = new byte[1];
                                    pVar.b(0, 1, bArr2);
                                    if ((bArr2[0] & 1) == 1) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    pVar.l(2);
                                    if (!z11) {
                                        i14 = 6;
                                    }
                                    v vVar = new v(i14);
                                    byte[] bArr3 = vVar.f8817a;
                                    int i16 = 0;
                                    while (i16 < i14) {
                                        int h = pVar.h(i16, i14 - i16, bArr3);
                                        if (h == -1) {
                                            break;
                                        }
                                        i16 += h;
                                    }
                                    vVar.I(i16);
                                    pVar.q();
                                    try {
                                        long E = vVar.E();
                                        if (!z11) {
                                            E *= uVar2.f4326b;
                                        }
                                        j12 = E;
                                    } catch (NumberFormatException unused) {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        this.f10908n = j12;
                                    } else {
                                        throw s0.a(null, null);
                                    }
                                } else {
                                    v vVar2 = this.f10898b;
                                    int i17 = vVar2.f8819c;
                                    if (i17 < 32768) {
                                        int read = pVar.read(vVar2.f8817a, i17, 32768 - i17);
                                        if (read != -1) {
                                            z12 = false;
                                        }
                                        if (!z12) {
                                            vVar2.I(i17 + read);
                                        } else if (vVar2.a() == 0) {
                                            u uVar3 = this.f10903i;
                                            String str = d0.f8765a;
                                            this.f10901f.c((this.f10908n * 1000000) / uVar3.f4328e, 1, this.f10907m, 0, null);
                                            return -1;
                                        }
                                    } else {
                                        z12 = false;
                                    }
                                    int i18 = vVar2.f8818b;
                                    int i19 = this.f10907m;
                                    int i20 = this.f10904j;
                                    if (i19 < i20) {
                                        vVar2.K(Math.min(i20 - i19, vVar2.a()));
                                    }
                                    this.f10903i.getClass();
                                    int i21 = vVar2.f8818b;
                                    while (true) {
                                        int i22 = vVar2.f8819c - 16;
                                        s sVar2 = this.d;
                                        if (i21 <= i22) {
                                            vVar2.J(i21);
                                            if (c3.b.b(vVar2, this.f10903i, this.f10905k, sVar2)) {
                                                vVar2.J(i21);
                                                j11 = sVar2.f4321a;
                                                break;
                                            }
                                            i21++;
                                        } else {
                                            if (z12) {
                                                while (true) {
                                                    int i23 = vVar2.f8819c;
                                                    if (i21 <= i23 - this.f10904j) {
                                                        vVar2.J(i21);
                                                        try {
                                                            z10 = c3.b.b(vVar2, this.f10903i, this.f10905k, sVar2);
                                                        } catch (IndexOutOfBoundsException unused2) {
                                                            z10 = false;
                                                        }
                                                        if (vVar2.f8818b > vVar2.f8819c) {
                                                            z10 = false;
                                                        }
                                                        if (z10) {
                                                            vVar2.J(i21);
                                                            j11 = sVar2.f4321a;
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
                                    int i24 = vVar2.f8818b - i18;
                                    vVar2.J(i18);
                                    this.f10901f.d(i24, vVar2);
                                    int i25 = this.f10907m + i24;
                                    this.f10907m = i25;
                                    if (j11 != -1) {
                                        u uVar4 = this.f10903i;
                                        String str2 = d0.f8765a;
                                        this.f10901f.c((this.f10908n * 1000000) / uVar4.f4328e, 1, i25, 0, null);
                                        this.f10907m = 0;
                                        this.f10908n = j11;
                                    }
                                    int length = vVar2.f8817a.length - vVar2.f8819c;
                                    if (vVar2.a() < 16 && length < 16) {
                                        int a2 = vVar2.a();
                                        byte[] bArr4 = vVar2.f8817a;
                                        System.arraycopy(bArr4, vVar2.f8818b, bArr4, 0, a2);
                                        vVar2.J(0);
                                        vVar2.I(a2);
                                    }
                                }
                                return 0;
                            }
                            throw new IllegalStateException();
                        }
                        pVar.q();
                        v vVar3 = new v(2);
                        pVar.b(0, 2, vVar3.f8817a);
                        int D = vVar3.D();
                        if ((D >> 2) == 16382) {
                            pVar.q();
                            this.f10905k = D;
                            q qVar = this.f10900e;
                            String str3 = d0.f8765a;
                            long position = pVar.getPosition();
                            long length2 = pVar.getLength();
                            this.f10903i.getClass();
                            u uVar5 = this.f10903i;
                            pf.b bVar = uVar5.f4333k;
                            if (bVar != null && ((long[]) bVar.f44073b).length > 0) {
                                tVar = new t(uVar5, position, 0);
                                i10 = 0;
                            } else if (length2 != -1 && uVar5.f4332j > 0) {
                                int i26 = this.f10905k;
                                int i27 = uVar5.f4327c;
                                f fVar = new f(uVar5, 3);
                                a5.a aVar2 = new a5.a(uVar5, i26);
                                long b10 = uVar5.b();
                                long j13 = uVar5.f4332j;
                                int i28 = uVar5.d;
                                if (i28 > 0) {
                                    i10 = 0;
                                    j10 = ((i28 + i27) / 2) + 1;
                                } else {
                                    i10 = 0;
                                    int i29 = uVar5.f4325a;
                                    if (i29 == uVar5.f4326b && i29 > 0) {
                                        j3 = i29;
                                    } else {
                                        j3 = 4096;
                                    }
                                    j10 = 64 + (((j3 * uVar5.f4330g) * uVar5.h) / 8);
                                }
                                a aVar3 = new a(fVar, aVar2, b10, j13, position, length2, j10, Math.max(6, i27));
                                this.f10906l = aVar3;
                                tVar = aVar3.f10894a;
                            } else {
                                i10 = 0;
                                tVar = new t(uVar5.b());
                            }
                            qVar.P1(tVar);
                            this.f10902g = 5;
                            return i10;
                        }
                        pVar.q();
                        throw s0.a(null, "First frame does not start with sync code.");
                    }
                    u uVar6 = this.f10903i;
                    boolean z13 = false;
                    while (!z13) {
                        pVar.q();
                        byte[] bArr5 = new byte[i12];
                        h hVar = new h(bArr5, i12);
                        pVar.b(0, i12, bArr5);
                        boolean h10 = hVar.h();
                        int i30 = hVar.i(i14);
                        int i31 = hVar.i(24) + i12;
                        if (i30 == 0) {
                            byte[] bArr6 = new byte[38];
                            pVar.readFully(bArr6, 0, 38);
                            uVar6 = new u(bArr6, i12);
                        } else if (uVar6 != null) {
                            p0 p0Var = uVar6.f4334l;
                            if (i30 == i13) {
                                v vVar4 = new v(i31);
                                pVar.readFully(vVar4.f8817a, 0, i31);
                                uVar6 = new u(uVar6.f4325a, uVar6.f4326b, uVar6.f4327c, uVar6.d, uVar6.f4328e, uVar6.f4330g, uVar6.h, uVar6.f4332j, c3.b.u(vVar4), uVar6.f4334l);
                            } else {
                                if (i30 == i12) {
                                    v vVar5 = new v(i31);
                                    pVar.readFully(vVar5.f8817a, 0, i31);
                                    vVar5.K(i12);
                                    p0 r10 = c3.b.r(Arrays.asList(c3.b.v(vVar5, false, false).f4302a));
                                    if (p0Var != null) {
                                        r10 = p0Var.b(r10);
                                    }
                                    uVar = new u(uVar6.f4325a, uVar6.f4326b, uVar6.f4327c, uVar6.d, uVar6.f4328e, uVar6.f4330g, uVar6.h, uVar6.f4332j, uVar6.f4333k, r10);
                                } else if (i30 == i15) {
                                    v vVar6 = new v(i31);
                                    pVar.readFully(vVar6.f8817a, 0, i31);
                                    vVar6.K(4);
                                    p0 p0Var2 = new p0(i0.z(o3.a.d(vVar6)));
                                    if (p0Var != null) {
                                        p0Var2 = p0Var.b(p0Var2);
                                    }
                                    uVar = new u(uVar6.f4325a, uVar6.f4326b, uVar6.f4327c, uVar6.d, uVar6.f4328e, uVar6.f4330g, uVar6.h, uVar6.f4332j, uVar6.f4333k, p0Var2);
                                } else {
                                    pVar.r(i31);
                                }
                                uVar6 = uVar;
                            }
                        } else {
                            throw new IllegalArgumentException();
                        }
                        String str4 = d0.f8765a;
                        this.f10903i = uVar6;
                        z13 = h10;
                        i12 = 4;
                        i13 = 3;
                        i14 = 7;
                        i15 = 6;
                    }
                    this.f10903i.getClass();
                    this.f10904j = Math.max(this.f10903i.f4327c, 6);
                    b2.s c10 = this.f10903i.c(bArr, this.h);
                    h0 h0Var = this.f10901f;
                    r a10 = c10.a();
                    a10.f2338p = r0.n("audio/flac");
                    g.u(a10, h0Var);
                    h0 h0Var2 = this.f10901f;
                    this.f10903i.b();
                    h0Var2.getClass();
                    this.f10902g = 4;
                    return 0;
                }
                v vVar7 = new v(4);
                pVar.readFully(vVar7.f8817a, 0, 4);
                if (vVar7.z() == 1716281667) {
                    this.f10902g = 3;
                    return 0;
                }
                throw s0.a(null, "Failed to read FLAC stream marker.");
            }
            pVar.b(0, bArr.length, bArr);
            pVar.q();
            this.f10902g = 2;
            return 0;
        }
        pVar.q();
        long k10 = pVar.k();
        p0 s10 = c3.b.s(pVar, !this.f10899c);
        pVar.r((int) (pVar.k() - k10));
        this.h = s10;
        this.f10902g = 1;
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
