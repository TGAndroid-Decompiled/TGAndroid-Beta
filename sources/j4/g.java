package j4;

import b2.v0;
import b2.w0;
import c3.k0;
import e2.l0;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;
import v7.c8;
import v7.t6;
public final class g implements i {
    public final e2.x f9475a;
    public final String f9477c;
    public final int d;
    public String f9478f;
    public k0 f9479g;
    public int f9480i;
    public int f9481j;
    public long f9482k;
    public b2.x f9483l;
    public int f9484m;
    public int f9485n;
    public int h = 0;
    public long f9488q = -9223372036854775807L;
    public final AtomicInteger f9476b = new AtomicInteger();
    public int f9486o = -1;
    public int f9487p = -1;
    public final String e = "video/mp2t";

    public g(String str, int i10, int i11) {
        this.f9475a = new e2.x(new byte[i11]);
        this.f9477c = str;
        this.d = i10;
    }

    public final boolean a(e2.x xVar, byte[] bArr, int i10) {
        int min = Math.min(xVar.a(), i10 - this.f9480i);
        xVar.k(this.f9480i, min, bArr);
        int i11 = this.f9480i + min;
        this.f9480i = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    public final void b(c3.a aVar) {
        b2.w a2;
        int i10 = aVar.f3593b;
        String str = aVar.f3592a;
        int i11 = aVar.f3594c;
        if (i10 != -2147483647 && i11 != -1) {
            b2.x xVar = this.f9483l;
            if (xVar == null || i11 != xVar.K || i10 != xVar.L || !str.equals(xVar.f2423s)) {
                b2.x xVar2 = this.f9483l;
                if (xVar2 == null) {
                    a2 = new b2.w();
                } else {
                    a2 = xVar2.a();
                }
                a2.f2356a = this.f9478f;
                a2.f2369q = v0.n(this.e);
                a2.f2370r = v0.n(str);
                a2.J = i11;
                a2.K = i10;
                a2.d = this.f9477c;
                a2.f2359f = this.d;
                b2.x xVar3 = new b2.x(a2);
                this.f9483l = xVar3;
                this.f9479g.b(xVar3);
            }
        }
    }

    @Override
    public final void c(e2.x xVar) {
        boolean z10;
        int i10;
        int i11;
        byte b10;
        int i12;
        byte b11;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        long j10;
        long j11;
        int i22;
        int i23;
        long j12;
        int i24;
        int i25;
        long j13;
        int i26;
        int i27;
        int i28;
        this.f9479g.getClass();
        while (xVar.a() > 0) {
            int i29 = this.h;
            e2.x xVar2 = this.f9475a;
            switch (i29) {
                case 0:
                    while (true) {
                        if (xVar.a() > 0) {
                            int i30 = this.f9481j << 8;
                            this.f9481j = i30;
                            int A = i30 | xVar.A();
                            this.f9481j = A;
                            int i31 = c3.b.i(A);
                            this.f9485n = i31;
                            if (i31 != 0) {
                                byte[] bArr = xVar2.f6207a;
                                int i32 = this.f9481j;
                                bArr[0] = (byte) ((i32 >> 24) & 255);
                                bArr[1] = (byte) ((i32 >> 16) & 255);
                                bArr[2] = (byte) ((i32 >> 8) & 255);
                                bArr[3] = (byte) (i32 & 255);
                                this.f9480i = 4;
                                this.f9481j = 0;
                                if (i31 != 3 && i31 != 4) {
                                    if (i31 == 1) {
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
                    if (!a(xVar, xVar2.f6207a, 18)) {
                        break;
                    } else {
                        byte[] bArr2 = xVar2.f6207a;
                        if (this.f9483l == null) {
                            String str = this.f9478f;
                            a4.g k10 = c3.b.k(bArr2);
                            k10.f0(60);
                            int i33 = c3.b.f3603j[k10.i(6)];
                            int i34 = c3.b.f3604k[k10.i(4)];
                            int i35 = k10.i(5);
                            int[] iArr = c3.b.f3605l;
                            if (i35 >= 29) {
                                i13 = -1;
                            } else {
                                i13 = (iArr[i35] * 1000) / 2;
                            }
                            k10.f0(10);
                            if (k10.i(2) > 0) {
                                i14 = 1;
                            } else {
                                i14 = 0;
                            }
                            int i36 = i33 + i14;
                            b2.w wVar = new b2.w();
                            wVar.f2356a = str;
                            wVar.f2369q = v0.n(this.e);
                            wVar.f2370r = v0.n("audio/vnd.dts");
                            wVar.h = i13;
                            wVar.J = i36;
                            wVar.K = i34;
                            wVar.v = null;
                            wVar.d = this.f9477c;
                            wVar.f2359f = this.d;
                            b2.x xVar3 = new b2.x(wVar);
                            this.f9483l = xVar3;
                            this.f9479g.b(xVar3);
                        }
                        this.f9484m = c3.b.g(bArr2);
                        byte b12 = bArr2[0];
                        if (b12 != -2) {
                            if (b12 != -1) {
                                if (b12 != 31) {
                                    i11 = (bArr2[4] & 1) << 6;
                                    b10 = bArr2[5];
                                } else {
                                    i11 = (bArr2[5] & 7) << 4;
                                    b11 = bArr2[6];
                                }
                            } else {
                                i11 = (bArr2[4] & 7) << 4;
                                b11 = bArr2[7];
                            }
                            i12 = b11 & 60;
                            this.f9482k = c8.b(l0.Y(this.f9483l.L, (((i12 >> 2) | i11) + 1) * 32));
                            xVar2.N(0);
                            this.f9479g.d(18, xVar2);
                            this.h = 6;
                            break;
                        } else {
                            i11 = (bArr2[5] & 1) << 6;
                            b10 = bArr2[4];
                        }
                        i12 = b10 & 252;
                        this.f9482k = c8.b(l0.Y(this.f9483l.L, (((i12 >> 2) | i11) + 1) * 32));
                        xVar2.N(0);
                        this.f9479g.d(18, xVar2);
                        this.h = 6;
                    }
                case 2:
                    if (a(xVar, xVar2.f6207a, 7)) {
                        a4.g k11 = c3.b.k(xVar2.f6207a);
                        k11.f0(42);
                        if (k11.h()) {
                            i15 = 12;
                        } else {
                            i15 = 8;
                        }
                        this.f9486o = k11.i(i15) + 1;
                        this.h = 3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    int i37 = 8;
                    if (a(xVar, xVar2.f6207a, this.f9486o)) {
                        a4.g k12 = c3.b.k(xVar2.f6207a);
                        k12.f0(40);
                        int i38 = k12.i(2);
                        if (!k12.h()) {
                            i16 = 16;
                            i17 = 8;
                        } else {
                            i16 = 20;
                            i17 = 12;
                        }
                        k12.f0(i17);
                        int i39 = k12.i(i16) + 1;
                        boolean h = k12.h();
                        if (h) {
                            i18 = k12.i(2);
                            i19 = (k12.i(3) + 1) * 512;
                            if (k12.h()) {
                                k12.f0(36);
                            }
                            int i40 = k12.i(3) + 1;
                            int i41 = k12.i(3) + 1;
                            if (i40 == 1 && i41 == 1) {
                                int i42 = i38 + 1;
                                int i43 = k12.i(i42);
                                int i44 = 0;
                                while (i44 < i42) {
                                    if (((i43 >> i44) & 1) == 1) {
                                        k12.f0(i37);
                                    }
                                    i44++;
                                    i37 = 8;
                                }
                                if (k12.h()) {
                                    k12.f0(2);
                                    int i45 = (k12.i(2) + 1) << 2;
                                    int i46 = k12.i(2) + 1;
                                    for (int i47 = 0; i47 < i46; i47++) {
                                        k12.f0(i45);
                                    }
                                }
                            } else {
                                throw w0.c("Multiple audio presentations or assets not supported");
                            }
                        } else {
                            i18 = -1;
                            i19 = 0;
                        }
                        k12.f0(i16);
                        k12.f0(12);
                        if (h) {
                            if (k12.h()) {
                                k12.f0(4);
                            }
                            if (k12.h()) {
                                k12.f0(24);
                            }
                            if (k12.h()) {
                                k12.g0(k12.i(10) + 1);
                            }
                            k12.f0(5);
                            i21 = c3.b.f3606m[k12.i(4)];
                            i20 = k12.i(8) + 1;
                        } else {
                            i20 = -1;
                            i21 = -2147483647;
                        }
                        if (h) {
                            if (i18 != 0) {
                                if (i18 != 1) {
                                    if (i18 == 2) {
                                        i22 = 48000;
                                    } else {
                                        throw w0.a(null, "Unsupported reference clock code in DTS HD header: " + i18);
                                    }
                                } else {
                                    i22 = 44100;
                                }
                            } else {
                                i22 = 32000;
                            }
                            String str2 = l0.f6165a;
                            j10 = l0.a0(i19, 1000000L, i22, RoundingMode.DOWN);
                        } else {
                            j10 = -9223372036854775807L;
                        }
                        b(new c3.a("audio/vnd.dts.hd;profile=lbr", i20, i21, i39, j10));
                        this.f9484m = i39;
                        if (j10 == -9223372036854775807L) {
                            j11 = 0;
                        } else {
                            j11 = j10;
                        }
                        this.f9482k = j11;
                        xVar2.N(0);
                        this.f9479g.d(this.f9486o, xVar2);
                        this.h = 6;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (a(xVar, xVar2.f6207a, 6)) {
                        a4.g k13 = c3.b.k(xVar2.f6207a);
                        k13.f0(32);
                        int q6 = c3.b.q(k13, c3.b.f3611r) + 1;
                        this.f9487p = q6;
                        int i48 = this.f9480i;
                        if (i48 > q6) {
                            int i49 = i48 - q6;
                            this.f9480i = i48 - i49;
                            xVar.N(xVar.f6208b - i49);
                        }
                        this.h = 5;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (a(xVar, xVar2.f6207a, this.f9487p)) {
                        byte[] bArr3 = xVar2.f6207a;
                        a4.g k14 = c3.b.k(bArr3);
                        if (k14.i(32) == 1078008818) {
                            i23 = 1;
                        } else {
                            i23 = 0;
                        }
                        int q10 = c3.b.q(k14, c3.b.f3607n);
                        int i50 = q10 + 1;
                        if (i23 != 0) {
                            if (k14.h()) {
                                int i51 = q10 - 1;
                                int i52 = ((bArr3[i51] << 8) & 65535) | (bArr3[q10] & 255);
                                String str3 = l0.f6165a;
                                int i53 = 65535;
                                for (int i54 = 0; i54 < i51; i54++) {
                                    byte b13 = bArr3[i54];
                                    int[] iArr2 = l0.f6172k;
                                    int i55 = (iArr2[(((b13 & 255) >> 4) ^ ((i53 >> 12) & 255)) & 255] ^ ((i53 << 4) & 65535)) & 65535;
                                    i53 = (iArr2[((b13 & 15) ^ ((i55 >> 12) & 255)) & 255] ^ ((i55 << 4) & 65535)) & 65535;
                                }
                                if (i52 == i53) {
                                    int i56 = k14.i(2);
                                    if (i56 != 0) {
                                        if (i56 != 1) {
                                            if (i56 == 2) {
                                                i27 = 384;
                                            } else {
                                                throw w0.a(null, "Unsupported base duration index in DTS UHD header: " + i56);
                                            }
                                        } else {
                                            i27 = 480;
                                        }
                                        i26 = 3;
                                    } else {
                                        i26 = 3;
                                        i27 = 512;
                                    }
                                    int i57 = (k14.i(i26) + 1) * i27;
                                    int i58 = k14.i(2);
                                    if (i58 != 0) {
                                        if (i58 != 1) {
                                            if (i58 == 2) {
                                                i28 = 48000;
                                            } else {
                                                throw w0.a(null, "Unsupported clock rate index in DTS UHD header: " + i58);
                                            }
                                        } else {
                                            i28 = 44100;
                                        }
                                    } else {
                                        i28 = 32000;
                                    }
                                    if (k14.h()) {
                                        k14.f0(36);
                                    }
                                    int i59 = i28 * (1 << k14.i(2));
                                    j12 = l0.a0(i57, 1000000L, i28, RoundingMode.DOWN);
                                    i24 = i59;
                                } else {
                                    throw w0.a(null, "CRC check failed");
                                }
                            } else {
                                throw w0.c("Only supports full channel mask-based audio presentation");
                            }
                        } else {
                            j12 = -9223372036854775807L;
                            i24 = -2147483647;
                        }
                        int i60 = 0;
                        for (int i61 = 0; i61 < i23; i61++) {
                            i60 += c3.b.q(k14, c3.b.f3608o);
                        }
                        AtomicInteger atomicInteger = this.f9476b;
                        if (i23 != 0) {
                            atomicInteger.set(c3.b.q(k14, c3.b.f3609p));
                        }
                        if (atomicInteger.get() != 0) {
                            i25 = c3.b.q(k14, c3.b.f3610q);
                        } else {
                            i25 = 0;
                        }
                        int i62 = i60 + i25 + i50;
                        c3.a aVar = new c3.a("audio/vnd.dts.uhd;profile=p2", 2, i24, i62, j12);
                        if (this.f9485n == 3) {
                            b(aVar);
                        }
                        this.f9484m = i62;
                        if (j12 == -9223372036854775807L) {
                            j13 = 0;
                        } else {
                            j13 = j12;
                        }
                        this.f9482k = j13;
                        xVar2.N(0);
                        this.f9479g.d(this.f9487p, xVar2);
                        this.h = 6;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    int min = Math.min(xVar.a(), this.f9484m - this.f9480i);
                    this.f9479g.d(min, xVar);
                    int i63 = this.f9480i + min;
                    this.f9480i = i63;
                    if (i63 != this.f9484m) {
                        break;
                    } else {
                        if (this.f9488q != -9223372036854775807L) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        t6.p(z10);
                        k0 k0Var = this.f9479g;
                        long j14 = this.f9488q;
                        if (this.f9485n == 4) {
                            i10 = 0;
                        } else {
                            i10 = 1;
                        }
                        k0Var.c(j14, i10, this.f9484m, 0, null);
                        this.f9488q += this.f9482k;
                        this.h = 0;
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override
    public final void e() {
        this.h = 0;
        this.f9480i = 0;
        this.f9481j = 0;
        this.f9488q = -9223372036854775807L;
        this.f9476b.set(0);
    }

    @Override
    public final void f(c3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.f9478f = (String) g0Var.e;
        g0Var.c();
        this.f9479g = qVar.I1(g0Var.f9491c, 1);
    }

    @Override
    public final void h(int i10, long j10) {
        this.f9488q = j10;
    }

    @Override
    public final void g(boolean z10) {
    }
}
