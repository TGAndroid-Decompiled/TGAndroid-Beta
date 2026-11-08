package m4;

import a8.ia;
import c8.e1;
import e2.s0;
import e2.t0;
import f3.j0;
import h2.m0;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;
public final class g implements i {
    public final h2.x f19656a;
    public final String f19658c;
    public final int d;
    public String f19660f;
    public j0 f19661g;
    public int f19662i;
    public int f19663j;
    public long f19664k;
    public e2.u f19665l;
    public int f19666m;
    public int f19667n;
    public int h = 0;
    public long f19670q = -9223372036854775807L;
    public final AtomicInteger f19657b = new AtomicInteger();
    public int f19668o = -1;
    public int f19669p = -1;
    public final String f19659e = "video/mp2t";

    public g(String str, int i7, int i10) {
        this.f19656a = new h2.x(new byte[i10]);
        this.f19658c = str;
        this.d = i7;
    }

    public final boolean a(h2.x xVar, byte[] bArr, int i7) {
        int min = Math.min(xVar.a(), i7 - this.f19662i);
        xVar.k(this.f19662i, min, bArr);
        int i10 = this.f19662i + min;
        this.f19662i = i10;
        if (i10 == i7) {
            return true;
        }
        return false;
    }

    public final void b(f3.a aVar) {
        e2.t a10;
        int i7 = aVar.f10962b;
        String str = aVar.f10961a;
        int i10 = aVar.f10963c;
        if (i7 != -2147483647 && i10 != -1) {
            e2.u uVar = this.f19665l;
            if (uVar == null || i10 != uVar.K || i7 != uVar.L || !str.equals(uVar.f10615s)) {
                e2.u uVar2 = this.f19665l;
                if (uVar2 == null) {
                    a10 = new e2.t();
                } else {
                    a10 = uVar2.a();
                }
                a10.f10548a = this.f19660f;
                a10.f10562q = s0.n(this.f19659e);
                a10.f10563r = s0.n(str);
                a10.J = i10;
                a10.K = i7;
                a10.d = this.f19658c;
                a10.f10552f = this.d;
                e2.u uVar3 = new e2.u(a10);
                this.f19665l = uVar3;
                this.f19661g.g(uVar3);
            }
        }
    }

    @Override
    public final void c(h2.x xVar) {
        boolean z9;
        int i7;
        int i10;
        byte b10;
        int i11;
        byte b11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        long j3;
        long j10;
        int i21;
        int i22;
        long j11;
        int i23;
        int i24;
        long j12;
        int i25;
        int i26;
        int i27;
        this.f19661g.getClass();
        while (xVar.a() > 0) {
            int i28 = this.h;
            h2.x xVar2 = this.f19656a;
            switch (i28) {
                case 0:
                    while (true) {
                        if (xVar.a() > 0) {
                            int i29 = this.f19663j << 8;
                            this.f19663j = i29;
                            int A = i29 | xVar.A();
                            this.f19663j = A;
                            int i30 = f3.b.i(A);
                            this.f19667n = i30;
                            if (i30 != 0) {
                                byte[] bArr = xVar2.f14162a;
                                int i31 = this.f19663j;
                                bArr[0] = (byte) ((i31 >> 24) & 255);
                                bArr[1] = (byte) ((i31 >> 16) & 255);
                                bArr[2] = (byte) ((i31 >> 8) & 255);
                                bArr[3] = (byte) (i31 & 255);
                                this.f19662i = 4;
                                this.f19663j = 0;
                                if (i30 != 3 && i30 != 4) {
                                    if (i30 == 1) {
                                        this.h = 1;
                                        break;
                                    } else {
                                        this.h = 2;
                                        break;
                                    }
                                } else {
                                    this.h = 4;
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case 1:
                    if (!a(xVar, xVar2.f14162a, 18)) {
                        break;
                    } else {
                        byte[] bArr2 = xVar2.f14162a;
                        if (this.f19665l == null) {
                            String str = this.f19660f;
                            d4.f k10 = f3.b.k(bArr2);
                            k10.L(60);
                            int i32 = f3.b.f10977j[k10.j(6)];
                            int i33 = f3.b.f10978k[k10.j(4)];
                            int j13 = k10.j(5);
                            int[] iArr = f3.b.f10979l;
                            if (j13 >= 29) {
                                i12 = -1;
                            } else {
                                i12 = (iArr[j13] * 1000) / 2;
                            }
                            k10.L(10);
                            if (k10.j(2) > 0) {
                                i13 = 1;
                            } else {
                                i13 = 0;
                            }
                            int i34 = i32 + i13;
                            e2.t tVar = new e2.t();
                            tVar.f10548a = str;
                            tVar.f10562q = s0.n(this.f19659e);
                            tVar.f10563r = s0.n("audio/vnd.dts");
                            tVar.h = i12;
                            tVar.J = i34;
                            tVar.K = i33;
                            tVar.v = null;
                            tVar.d = this.f19658c;
                            tVar.f10552f = this.d;
                            e2.u uVar = new e2.u(tVar);
                            this.f19665l = uVar;
                            this.f19661g.g(uVar);
                        }
                        this.f19666m = f3.b.g(bArr2);
                        byte b12 = bArr2[0];
                        if (b12 != -2) {
                            if (b12 != -1) {
                                if (b12 != 31) {
                                    i10 = (bArr2[4] & 1) << 6;
                                    b10 = bArr2[5];
                                } else {
                                    i10 = (bArr2[5] & 7) << 4;
                                    b11 = bArr2[6];
                                }
                            } else {
                                i10 = (bArr2[4] & 7) << 4;
                                b11 = bArr2[7];
                            }
                            i11 = b11 & 60;
                            this.f19664k = e1.b(m0.Y(this.f19665l.L, (((i11 >> 2) | i10) + 1) * 32));
                            xVar2.N(0);
                            this.f19661g.b(18, xVar2);
                            this.h = 6;
                            break;
                        } else {
                            i10 = (bArr2[5] & 1) << 6;
                            b10 = bArr2[4];
                        }
                        i11 = b10 & 252;
                        this.f19664k = e1.b(m0.Y(this.f19665l.L, (((i11 >> 2) | i10) + 1) * 32));
                        xVar2.N(0);
                        this.f19661g.b(18, xVar2);
                        this.h = 6;
                    }
                case 2:
                    if (a(xVar, xVar2.f14162a, 7)) {
                        d4.f k11 = f3.b.k(xVar2.f14162a);
                        k11.L(42);
                        if (k11.i()) {
                            i14 = 12;
                        } else {
                            i14 = 8;
                        }
                        this.f19668o = k11.j(i14) + 1;
                        this.h = 3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    int i35 = 8;
                    if (a(xVar, xVar2.f14162a, this.f19668o)) {
                        d4.f k12 = f3.b.k(xVar2.f14162a);
                        k12.L(40);
                        int j14 = k12.j(2);
                        if (!k12.i()) {
                            i15 = 16;
                            i16 = 8;
                        } else {
                            i15 = 20;
                            i16 = 12;
                        }
                        k12.L(i16);
                        int j15 = k12.j(i15) + 1;
                        boolean i36 = k12.i();
                        if (i36) {
                            i17 = k12.j(2);
                            i18 = (k12.j(3) + 1) * 512;
                            if (k12.i()) {
                                k12.L(36);
                            }
                            int j16 = k12.j(3) + 1;
                            int j17 = k12.j(3) + 1;
                            if (j16 == 1 && j17 == 1) {
                                int i37 = j14 + 1;
                                int j18 = k12.j(i37);
                                int i38 = 0;
                                while (i38 < i37) {
                                    if (((j18 >> i38) & 1) == 1) {
                                        k12.L(i35);
                                    }
                                    i38++;
                                    i35 = 8;
                                }
                                if (k12.i()) {
                                    k12.L(2);
                                    int j19 = (k12.j(2) + 1) << 2;
                                    int j20 = k12.j(2) + 1;
                                    for (int i39 = 0; i39 < j20; i39++) {
                                        k12.L(j19);
                                    }
                                }
                            } else {
                                throw t0.c("Multiple audio presentations or assets not supported");
                            }
                        } else {
                            i17 = -1;
                            i18 = 0;
                        }
                        k12.L(i15);
                        k12.L(12);
                        if (i36) {
                            if (k12.i()) {
                                k12.L(4);
                            }
                            if (k12.i()) {
                                k12.L(24);
                            }
                            if (k12.i()) {
                                k12.M(k12.j(10) + 1);
                            }
                            k12.L(5);
                            i20 = f3.b.f10980m[k12.j(4)];
                            i19 = k12.j(8) + 1;
                        } else {
                            i19 = -1;
                            i20 = -2147483647;
                        }
                        if (i36) {
                            if (i17 != 0) {
                                if (i17 != 1) {
                                    if (i17 == 2) {
                                        i21 = 48000;
                                    } else {
                                        throw t0.a(null, "Unsupported reference clock code in DTS HD header: " + i17);
                                    }
                                } else {
                                    i21 = 44100;
                                }
                            } else {
                                i21 = 32000;
                            }
                            String str2 = m0.f14112a;
                            j3 = m0.a0(i18, 1000000L, i21, RoundingMode.DOWN);
                        } else {
                            j3 = -9223372036854775807L;
                        }
                        b(new f3.a("audio/vnd.dts.hd;profile=lbr", i19, i20, j15, j3));
                        this.f19666m = j15;
                        if (j3 == -9223372036854775807L) {
                            j10 = 0;
                        } else {
                            j10 = j3;
                        }
                        this.f19664k = j10;
                        xVar2.N(0);
                        this.f19661g.b(this.f19668o, xVar2);
                        this.h = 6;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (a(xVar, xVar2.f14162a, 6)) {
                        d4.f k13 = f3.b.k(xVar2.f14162a);
                        k13.L(32);
                        int q10 = f3.b.q(k13, f3.b.f10985r) + 1;
                        this.f19669p = q10;
                        int i40 = this.f19662i;
                        if (i40 > q10) {
                            int i41 = i40 - q10;
                            this.f19662i = i40 - i41;
                            xVar.N(xVar.f14163b - i41);
                        }
                        this.h = 5;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (a(xVar, xVar2.f14162a, this.f19669p)) {
                        byte[] bArr3 = xVar2.f14162a;
                        d4.f k14 = f3.b.k(bArr3);
                        if (k14.j(32) == 1078008818) {
                            i22 = 1;
                        } else {
                            i22 = 0;
                        }
                        int q11 = f3.b.q(k14, f3.b.f10981n);
                        int i42 = q11 + 1;
                        if (i22 != 0) {
                            if (k14.i()) {
                                int i43 = q11 - 1;
                                int i44 = ((bArr3[i43] << 8) & 65535) | (bArr3[q11] & 255);
                                String str3 = m0.f14112a;
                                int i45 = 65535;
                                for (int i46 = 0; i46 < i43; i46++) {
                                    byte b13 = bArr3[i46];
                                    int[] iArr2 = m0.f14120k;
                                    int i47 = (iArr2[(((b13 & 255) >> 4) ^ ((i45 >> 12) & 255)) & 255] ^ ((i45 << 4) & 65535)) & 65535;
                                    i45 = (iArr2[((b13 & 15) ^ ((i47 >> 12) & 255)) & 255] ^ ((i47 << 4) & 65535)) & 65535;
                                }
                                if (i44 == i45) {
                                    int j21 = k14.j(2);
                                    if (j21 != 0) {
                                        if (j21 != 1) {
                                            if (j21 == 2) {
                                                i26 = 384;
                                            } else {
                                                throw t0.a(null, "Unsupported base duration index in DTS UHD header: " + j21);
                                            }
                                        } else {
                                            i26 = 480;
                                        }
                                        i25 = 3;
                                    } else {
                                        i25 = 3;
                                        i26 = 512;
                                    }
                                    int j22 = (k14.j(i25) + 1) * i26;
                                    int j23 = k14.j(2);
                                    if (j23 != 0) {
                                        if (j23 != 1) {
                                            if (j23 == 2) {
                                                i27 = 48000;
                                            } else {
                                                throw t0.a(null, "Unsupported clock rate index in DTS UHD header: " + j23);
                                            }
                                        } else {
                                            i27 = 44100;
                                        }
                                    } else {
                                        i27 = 32000;
                                    }
                                    if (k14.i()) {
                                        k14.L(36);
                                    }
                                    int j24 = i27 * (1 << k14.j(2));
                                    j11 = m0.a0(j22, 1000000L, i27, RoundingMode.DOWN);
                                    i23 = j24;
                                } else {
                                    throw t0.a(null, "CRC check failed");
                                }
                            } else {
                                throw t0.c("Only supports full channel mask-based audio presentation");
                            }
                        } else {
                            j11 = -9223372036854775807L;
                            i23 = -2147483647;
                        }
                        int i48 = 0;
                        for (int i49 = 0; i49 < i22; i49++) {
                            i48 += f3.b.q(k14, f3.b.f10982o);
                        }
                        AtomicInteger atomicInteger = this.f19657b;
                        if (i22 != 0) {
                            atomicInteger.set(f3.b.q(k14, f3.b.f10983p));
                        }
                        if (atomicInteger.get() != 0) {
                            i24 = f3.b.q(k14, f3.b.f10984q);
                        } else {
                            i24 = 0;
                        }
                        int i50 = i48 + i24 + i42;
                        f3.a aVar = new f3.a("audio/vnd.dts.uhd;profile=p2", 2, i23, i50, j11);
                        if (this.f19667n == 3) {
                            b(aVar);
                        }
                        this.f19666m = i50;
                        if (j11 == -9223372036854775807L) {
                            j12 = 0;
                        } else {
                            j12 = j11;
                        }
                        this.f19664k = j12;
                        xVar2.N(0);
                        this.f19661g.b(this.f19669p, xVar2);
                        this.h = 6;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    int min = Math.min(xVar.a(), this.f19666m - this.f19662i);
                    this.f19661g.b(min, xVar);
                    int i51 = this.f19662i + min;
                    this.f19662i = i51;
                    if (i51 != this.f19666m) {
                        break;
                    } else {
                        if (this.f19670q != -9223372036854775807L) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        ia.p(z9);
                        j0 j0Var = this.f19661g;
                        long j25 = this.f19670q;
                        if (this.f19667n == 4) {
                            i7 = 0;
                        } else {
                            i7 = 1;
                        }
                        j0Var.c(j25, i7, this.f19666m, 0, null);
                        this.f19670q += this.f19664k;
                        this.h = 0;
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override
    public final void d() {
        this.h = 0;
        this.f19662i = 0;
        this.f19663j = 0;
        this.f19670q = -9223372036854775807L;
        this.f19657b.set(0);
    }

    @Override
    public final void f(int i7, long j3) {
        this.f19670q = j3;
    }

    @Override
    public final void g(f3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.f19660f = (String) g0Var.f19674e;
        g0Var.c();
        this.f19661g = qVar.O1(g0Var.f19673c, 1);
    }

    @Override
    public final void e(boolean z9) {
    }
}
