package j4;

import b2.w0;
import b2.x0;
import c3.i0;
import e2.m0;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;
import v7.b8;
import v7.u6;
public final class g implements i {
    public final e2.x f12648a;
    public final String f12650c;
    public final int d;
    public String f12651f;
    public i0 f12652g;
    public int f12653i;
    public int f12654j;
    public long f12655k;
    public b2.x f12656l;
    public int f12657m;
    public int f12658n;
    public int h = 0;
    public long f12661q = -9223372036854775807L;
    public final AtomicInteger f12649b = new AtomicInteger();
    public int f12659o = -1;
    public int f12660p = -1;
    public final String e = "video/mp2t";

    public g(String str, int i10, int i11) {
        this.f12648a = new e2.x(new byte[i11]);
        this.f12650c = str;
        this.d = i10;
    }

    @Override
    public final void a(e2.x xVar) {
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
        this.f12652g.getClass();
        while (xVar.a() > 0) {
            int i29 = this.h;
            e2.x xVar2 = this.f12648a;
            switch (i29) {
                case 0:
                    while (true) {
                        if (xVar.a() > 0) {
                            int i30 = this.f12654j << 8;
                            this.f12654j = i30;
                            int A = i30 | xVar.A();
                            this.f12654j = A;
                            int i31 = c3.b.i(A);
                            this.f12658n = i31;
                            if (i31 != 0) {
                                byte[] bArr = xVar2.f8414a;
                                int i32 = this.f12654j;
                                bArr[0] = (byte) ((i32 >> 24) & 255);
                                bArr[1] = (byte) ((i32 >> 16) & 255);
                                bArr[2] = (byte) ((i32 >> 8) & 255);
                                bArr[3] = (byte) (i32 & 255);
                                this.f12653i = 4;
                                this.f12654j = 0;
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
                    if (!b(xVar, xVar2.f8414a, 18)) {
                        break;
                    } else {
                        byte[] bArr2 = xVar2.f8414a;
                        if (this.f12656l == null) {
                            String str = this.f12651f;
                            a4.g k10 = c3.b.k(bArr2);
                            k10.o(60);
                            int i33 = c3.b.f4202j[k10.g(6)];
                            int i34 = c3.b.f4203k[k10.g(4)];
                            int g10 = k10.g(5);
                            int[] iArr = c3.b.f4204l;
                            if (g10 >= 29) {
                                i13 = -1;
                            } else {
                                i13 = (iArr[g10] * 1000) / 2;
                            }
                            k10.o(10);
                            if (k10.g(2) > 0) {
                                i14 = 1;
                            } else {
                                i14 = 0;
                            }
                            int i35 = i33 + i14;
                            b2.w wVar = new b2.w();
                            wVar.f2456a = str;
                            wVar.f2469q = w0.n(this.e);
                            wVar.f2470r = w0.n("audio/vnd.dts");
                            wVar.h = i13;
                            wVar.J = i35;
                            wVar.K = i34;
                            wVar.v = null;
                            wVar.d = this.f12650c;
                            wVar.f2459f = this.d;
                            b2.x xVar3 = new b2.x(wVar);
                            this.f12656l = xVar3;
                            this.f12652g.b(xVar3);
                        }
                        this.f12657m = c3.b.g(bArr2);
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
                            this.f12655k = b8.b(m0.Y(this.f12656l.L, (((i12 >> 2) | i11) + 1) * 32));
                            xVar2.N(0);
                            this.f12652g.d(18, xVar2);
                            this.h = 6;
                            break;
                        } else {
                            i11 = (bArr2[5] & 1) << 6;
                            b10 = bArr2[4];
                        }
                        i12 = b10 & 252;
                        this.f12655k = b8.b(m0.Y(this.f12656l.L, (((i12 >> 2) | i11) + 1) * 32));
                        xVar2.N(0);
                        this.f12652g.d(18, xVar2);
                        this.h = 6;
                    }
                case 2:
                    if (b(xVar, xVar2.f8414a, 7)) {
                        a4.g k11 = c3.b.k(xVar2.f8414a);
                        k11.o(42);
                        if (k11.f()) {
                            i15 = 12;
                        } else {
                            i15 = 8;
                        }
                        this.f12659o = k11.g(i15) + 1;
                        this.h = 3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    int i36 = 8;
                    if (b(xVar, xVar2.f8414a, this.f12659o)) {
                        a4.g k12 = c3.b.k(xVar2.f8414a);
                        k12.o(40);
                        int g11 = k12.g(2);
                        if (!k12.f()) {
                            i16 = 16;
                            i17 = 8;
                        } else {
                            i16 = 20;
                            i17 = 12;
                        }
                        k12.o(i17);
                        int g12 = k12.g(i16) + 1;
                        boolean f7 = k12.f();
                        if (f7) {
                            i18 = k12.g(2);
                            i19 = (k12.g(3) + 1) * 512;
                            if (k12.f()) {
                                k12.o(36);
                            }
                            int g13 = k12.g(3) + 1;
                            int g14 = k12.g(3) + 1;
                            if (g13 == 1 && g14 == 1) {
                                int i37 = g11 + 1;
                                int g15 = k12.g(i37);
                                int i38 = 0;
                                while (i38 < i37) {
                                    if (((g15 >> i38) & 1) == 1) {
                                        k12.o(i36);
                                    }
                                    i38++;
                                    i36 = 8;
                                }
                                if (k12.f()) {
                                    k12.o(2);
                                    int g16 = (k12.g(2) + 1) << 2;
                                    int g17 = k12.g(2) + 1;
                                    for (int i39 = 0; i39 < g17; i39++) {
                                        k12.o(g16);
                                    }
                                }
                            } else {
                                throw x0.c("Multiple audio presentations or assets not supported");
                            }
                        } else {
                            i18 = -1;
                            i19 = 0;
                        }
                        k12.o(i16);
                        k12.o(12);
                        if (f7) {
                            if (k12.f()) {
                                k12.o(4);
                            }
                            if (k12.f()) {
                                k12.o(24);
                            }
                            if (k12.f()) {
                                k12.p(k12.g(10) + 1);
                            }
                            k12.o(5);
                            i21 = c3.b.f4205m[k12.g(4)];
                            i20 = k12.g(8) + 1;
                        } else {
                            i20 = -1;
                            i21 = -2147483647;
                        }
                        if (f7) {
                            if (i18 != 0) {
                                if (i18 != 1) {
                                    if (i18 == 2) {
                                        i22 = 48000;
                                    } else {
                                        throw x0.a(null, "Unsupported reference clock code in DTS HD header: " + i18);
                                    }
                                } else {
                                    i22 = 44100;
                                }
                            } else {
                                i22 = 32000;
                            }
                            String str2 = m0.f8375a;
                            j10 = m0.a0(i19, 1000000L, i22, RoundingMode.DOWN);
                        } else {
                            j10 = -9223372036854775807L;
                        }
                        g(new c3.a("audio/vnd.dts.hd;profile=lbr", i20, i21, g12, j10));
                        this.f12657m = g12;
                        if (j10 == -9223372036854775807L) {
                            j11 = 0;
                        } else {
                            j11 = j10;
                        }
                        this.f12655k = j11;
                        xVar2.N(0);
                        this.f12652g.d(this.f12659o, xVar2);
                        this.h = 6;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (b(xVar, xVar2.f8414a, 6)) {
                        a4.g k13 = c3.b.k(xVar2.f8414a);
                        k13.o(32);
                        int q6 = c3.b.q(k13, c3.b.f4210r) + 1;
                        this.f12660p = q6;
                        int i40 = this.f12653i;
                        if (i40 > q6) {
                            int i41 = i40 - q6;
                            this.f12653i = i40 - i41;
                            xVar.N(xVar.f8415b - i41);
                        }
                        this.h = 5;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (b(xVar, xVar2.f8414a, this.f12660p)) {
                        byte[] bArr3 = xVar2.f8414a;
                        a4.g k14 = c3.b.k(bArr3);
                        if (k14.g(32) == 1078008818) {
                            i23 = 1;
                        } else {
                            i23 = 0;
                        }
                        int q10 = c3.b.q(k14, c3.b.f4206n);
                        int i42 = q10 + 1;
                        if (i23 != 0) {
                            if (k14.f()) {
                                int i43 = q10 - 1;
                                int i44 = ((bArr3[i43] << 8) & 65535) | (bArr3[q10] & 255);
                                String str3 = m0.f8375a;
                                int i45 = 65535;
                                for (int i46 = 0; i46 < i43; i46++) {
                                    byte b13 = bArr3[i46];
                                    int[] iArr2 = m0.f8382k;
                                    int i47 = (iArr2[(((b13 & 255) >> 4) ^ ((i45 >> 12) & 255)) & 255] ^ ((i45 << 4) & 65535)) & 65535;
                                    i45 = (iArr2[((b13 & 15) ^ ((i47 >> 12) & 255)) & 255] ^ ((i47 << 4) & 65535)) & 65535;
                                }
                                if (i44 == i45) {
                                    int g18 = k14.g(2);
                                    if (g18 != 0) {
                                        if (g18 != 1) {
                                            if (g18 == 2) {
                                                i27 = 384;
                                            } else {
                                                throw x0.a(null, "Unsupported base duration index in DTS UHD header: " + g18);
                                            }
                                        } else {
                                            i27 = 480;
                                        }
                                        i26 = 3;
                                    } else {
                                        i26 = 3;
                                        i27 = 512;
                                    }
                                    int g19 = (k14.g(i26) + 1) * i27;
                                    int g20 = k14.g(2);
                                    if (g20 != 0) {
                                        if (g20 != 1) {
                                            if (g20 == 2) {
                                                i28 = 48000;
                                            } else {
                                                throw x0.a(null, "Unsupported clock rate index in DTS UHD header: " + g20);
                                            }
                                        } else {
                                            i28 = 44100;
                                        }
                                    } else {
                                        i28 = 32000;
                                    }
                                    if (k14.f()) {
                                        k14.o(36);
                                    }
                                    int g21 = i28 * (1 << k14.g(2));
                                    j12 = m0.a0(g19, 1000000L, i28, RoundingMode.DOWN);
                                    i24 = g21;
                                } else {
                                    throw x0.a(null, "CRC check failed");
                                }
                            } else {
                                throw x0.c("Only supports full channel mask-based audio presentation");
                            }
                        } else {
                            j12 = -9223372036854775807L;
                            i24 = -2147483647;
                        }
                        int i48 = 0;
                        for (int i49 = 0; i49 < i23; i49++) {
                            i48 += c3.b.q(k14, c3.b.f4207o);
                        }
                        AtomicInteger atomicInteger = this.f12649b;
                        if (i23 != 0) {
                            atomicInteger.set(c3.b.q(k14, c3.b.f4208p));
                        }
                        if (atomicInteger.get() != 0) {
                            i25 = c3.b.q(k14, c3.b.f4209q);
                        } else {
                            i25 = 0;
                        }
                        int i50 = i48 + i25 + i42;
                        c3.a aVar = new c3.a("audio/vnd.dts.uhd;profile=p2", 2, i24, i50, j12);
                        if (this.f12658n == 3) {
                            g(aVar);
                        }
                        this.f12657m = i50;
                        if (j12 == -9223372036854775807L) {
                            j13 = 0;
                        } else {
                            j13 = j12;
                        }
                        this.f12655k = j13;
                        xVar2.N(0);
                        this.f12652g.d(this.f12660p, xVar2);
                        this.h = 6;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    int min = Math.min(xVar.a(), this.f12657m - this.f12653i);
                    this.f12652g.d(min, xVar);
                    int i51 = this.f12653i + min;
                    this.f12653i = i51;
                    if (i51 != this.f12657m) {
                        break;
                    } else {
                        if (this.f12661q != -9223372036854775807L) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        u6.p(z10);
                        i0 i0Var = this.f12652g;
                        long j14 = this.f12661q;
                        if (this.f12658n == 4) {
                            i10 = 0;
                        } else {
                            i10 = 1;
                        }
                        i0Var.c(j14, i10, this.f12657m, 0, null);
                        this.f12661q += this.f12655k;
                        this.h = 0;
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    public final boolean b(e2.x xVar, byte[] bArr, int i10) {
        int min = Math.min(xVar.a(), i10 - this.f12653i);
        xVar.k(this.f12653i, min, bArr);
        int i11 = this.f12653i + min;
        this.f12653i = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void c() {
        this.h = 0;
        this.f12653i = 0;
        this.f12654j = 0;
        this.f12661q = -9223372036854775807L;
        this.f12649b.set(0);
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f12651f = (String) f0Var.e;
        f0Var.c();
        this.f12652g = qVar.W(f0Var.f12647c, 1);
    }

    @Override
    public final void f(int i10, long j10) {
        this.f12661q = j10;
    }

    public final void g(c3.a aVar) {
        b2.w a2;
        int i10 = aVar.f4192b;
        String str = aVar.f4191a;
        int i11 = aVar.f4193c;
        if (i10 != -2147483647 && i11 != -1) {
            b2.x xVar = this.f12656l;
            if (xVar == null || i11 != xVar.K || i10 != xVar.L || !str.equals(xVar.f2523s)) {
                b2.x xVar2 = this.f12656l;
                if (xVar2 == null) {
                    a2 = new b2.w();
                } else {
                    a2 = xVar2.a();
                }
                a2.f2456a = this.f12651f;
                a2.f2469q = w0.n(this.e);
                a2.f2470r = w0.n(str);
                a2.J = i11;
                a2.K = i10;
                a2.d = this.f12650c;
                a2.f2459f = this.d;
                b2.x xVar3 = new b2.x(a2);
                this.f12656l = xVar3;
                this.f12652g.b(xVar3);
            }
        }
    }

    @Override
    public final void e(boolean z10) {
    }
}
