package j4;

import b2.v0;
import b2.w0;
import c3.l0;
import e2.m0;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;
import v7.b8;
import v7.u6;
public final class g implements i {
    public final e2.x f14103a;
    public final String f14105c;
    public final int d;
    public String f14106f;
    public l0 f14107g;
    public int f14108i;
    public int f14109j;
    public long f14110k;
    public b2.w f14111l;
    public int f14112m;
    public int f14113n;
    public int h = 0;
    public long f14116q = -9223372036854775807L;
    public final AtomicInteger f14104b = new AtomicInteger();
    public int f14114o = -1;
    public int f14115p = -1;
    public final String e = "video/mp2t";

    public g(String str, int i10, int i11) {
        this.f14103a = new e2.x(new byte[i11]);
        this.f14105c = str;
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
        this.f14107g.getClass();
        while (xVar.a() > 0) {
            int i29 = this.h;
            e2.x xVar2 = this.f14103a;
            switch (i29) {
                case 0:
                    while (true) {
                        if (xVar.a() > 0) {
                            int i30 = this.f14109j << 8;
                            this.f14109j = i30;
                            int A = i30 | xVar.A();
                            this.f14109j = A;
                            int i31 = c3.b.i(A);
                            this.f14113n = i31;
                            if (i31 != 0) {
                                byte[] bArr = xVar2.f8298a;
                                int i32 = this.f14109j;
                                bArr[0] = (byte) ((i32 >> 24) & 255);
                                bArr[1] = (byte) ((i32 >> 16) & 255);
                                bArr[2] = (byte) ((i32 >> 8) & 255);
                                bArr[3] = (byte) (i32 & 255);
                                this.f14108i = 4;
                                this.f14109j = 0;
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
                    if (!b(xVar, xVar2.f8298a, 18)) {
                        break;
                    } else {
                        byte[] bArr2 = xVar2.f8298a;
                        if (this.f14111l == null) {
                            String str = this.f14106f;
                            a4.g k10 = c3.b.k(bArr2);
                            k10.o(60);
                            int i33 = c3.b.f4572j[k10.g(6)];
                            int i34 = c3.b.f4573k[k10.g(4)];
                            int g10 = k10.g(5);
                            int[] iArr = c3.b.f4574l;
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
                            b2.v vVar = new b2.v();
                            vVar.f4068a = str;
                            vVar.f4081q = v0.n(this.e);
                            vVar.f4082r = v0.n("audio/vnd.dts");
                            vVar.h = i13;
                            vVar.J = i35;
                            vVar.K = i34;
                            vVar.v = null;
                            vVar.d = this.f14105c;
                            vVar.f4071f = this.d;
                            b2.w wVar = new b2.w(vVar);
                            this.f14111l = wVar;
                            this.f14107g.b(wVar);
                        }
                        this.f14112m = c3.b.g(bArr2);
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
                            this.f14110k = b8.b(m0.Y(this.f14111l.L, (((i12 >> 2) | i11) + 1) * 32));
                            xVar2.N(0);
                            this.f14107g.d(18, xVar2);
                            this.h = 6;
                            break;
                        } else {
                            i11 = (bArr2[5] & 1) << 6;
                            b10 = bArr2[4];
                        }
                        i12 = b10 & 252;
                        this.f14110k = b8.b(m0.Y(this.f14111l.L, (((i12 >> 2) | i11) + 1) * 32));
                        xVar2.N(0);
                        this.f14107g.d(18, xVar2);
                        this.h = 6;
                    }
                case 2:
                    if (b(xVar, xVar2.f8298a, 7)) {
                        a4.g k11 = c3.b.k(xVar2.f8298a);
                        k11.o(42);
                        if (k11.f()) {
                            i15 = 12;
                        } else {
                            i15 = 8;
                        }
                        this.f14114o = k11.g(i15) + 1;
                        this.h = 3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    int i36 = 8;
                    if (b(xVar, xVar2.f8298a, this.f14114o)) {
                        a4.g k12 = c3.b.k(xVar2.f8298a);
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
                                throw w0.c("Multiple audio presentations or assets not supported");
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
                            i21 = c3.b.f4575m[k12.g(4)];
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
                                        throw w0.a(null, "Unsupported reference clock code in DTS HD header: " + i18);
                                    }
                                } else {
                                    i22 = 44100;
                                }
                            } else {
                                i22 = 32000;
                            }
                            String str2 = m0.f8259a;
                            j10 = m0.a0(i19, 1000000L, i22, RoundingMode.DOWN);
                        } else {
                            j10 = -9223372036854775807L;
                        }
                        g(new c3.a("audio/vnd.dts.hd;profile=lbr", i20, i21, g12, j10));
                        this.f14112m = g12;
                        if (j10 == -9223372036854775807L) {
                            j11 = 0;
                        } else {
                            j11 = j10;
                        }
                        this.f14110k = j11;
                        xVar2.N(0);
                        this.f14107g.d(this.f14114o, xVar2);
                        this.h = 6;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (b(xVar, xVar2.f8298a, 6)) {
                        a4.g k13 = c3.b.k(xVar2.f8298a);
                        k13.o(32);
                        int q6 = c3.b.q(k13, c3.b.f4580r) + 1;
                        this.f14115p = q6;
                        int i40 = this.f14108i;
                        if (i40 > q6) {
                            int i41 = i40 - q6;
                            this.f14108i = i40 - i41;
                            xVar.N(xVar.f8299b - i41);
                        }
                        this.h = 5;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (b(xVar, xVar2.f8298a, this.f14115p)) {
                        byte[] bArr3 = xVar2.f8298a;
                        a4.g k14 = c3.b.k(bArr3);
                        if (k14.g(32) == 1078008818) {
                            i23 = 1;
                        } else {
                            i23 = 0;
                        }
                        int q10 = c3.b.q(k14, c3.b.f4576n);
                        int i42 = q10 + 1;
                        if (i23 != 0) {
                            if (k14.f()) {
                                int i43 = q10 - 1;
                                int i44 = ((bArr3[i43] << 8) & 65535) | (bArr3[q10] & 255);
                                String str3 = m0.f8259a;
                                int i45 = 65535;
                                for (int i46 = 0; i46 < i43; i46++) {
                                    byte b13 = bArr3[i46];
                                    int[] iArr2 = m0.f8266k;
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
                                                throw w0.a(null, "Unsupported base duration index in DTS UHD header: " + g18);
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
                                                throw w0.a(null, "Unsupported clock rate index in DTS UHD header: " + g20);
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
                                    throw w0.a(null, "CRC check failed");
                                }
                            } else {
                                throw w0.c("Only supports full channel mask-based audio presentation");
                            }
                        } else {
                            j12 = -9223372036854775807L;
                            i24 = -2147483647;
                        }
                        int i48 = 0;
                        for (int i49 = 0; i49 < i23; i49++) {
                            i48 += c3.b.q(k14, c3.b.f4577o);
                        }
                        AtomicInteger atomicInteger = this.f14104b;
                        if (i23 != 0) {
                            atomicInteger.set(c3.b.q(k14, c3.b.f4578p));
                        }
                        if (atomicInteger.get() != 0) {
                            i25 = c3.b.q(k14, c3.b.f4579q);
                        } else {
                            i25 = 0;
                        }
                        int i50 = i48 + i25 + i42;
                        c3.a aVar = new c3.a("audio/vnd.dts.uhd;profile=p2", 2, i24, i50, j12);
                        if (this.f14113n == 3) {
                            g(aVar);
                        }
                        this.f14112m = i50;
                        if (j12 == -9223372036854775807L) {
                            j13 = 0;
                        } else {
                            j13 = j12;
                        }
                        this.f14110k = j13;
                        xVar2.N(0);
                        this.f14107g.d(this.f14115p, xVar2);
                        this.h = 6;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    int min = Math.min(xVar.a(), this.f14112m - this.f14108i);
                    this.f14107g.d(min, xVar);
                    int i51 = this.f14108i + min;
                    this.f14108i = i51;
                    if (i51 != this.f14112m) {
                        break;
                    } else {
                        if (this.f14116q != -9223372036854775807L) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        u6.p(z10);
                        l0 l0Var = this.f14107g;
                        long j14 = this.f14116q;
                        if (this.f14113n == 4) {
                            i10 = 0;
                        } else {
                            i10 = 1;
                        }
                        l0Var.c(j14, i10, this.f14112m, 0, null);
                        this.f14116q += this.f14110k;
                        this.h = 0;
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    public final boolean b(e2.x xVar, byte[] bArr, int i10) {
        int min = Math.min(xVar.a(), i10 - this.f14108i);
        xVar.k(this.f14108i, min, bArr);
        int i11 = this.f14108i + min;
        this.f14108i = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void c() {
        this.h = 0;
        this.f14108i = 0;
        this.f14109j = 0;
        this.f14116q = -9223372036854775807L;
        this.f14104b.set(0);
    }

    @Override
    public final void d(c3.s sVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f14106f = (String) f0Var.e;
        f0Var.c();
        this.f14107g = sVar.j0(f0Var.f14102c, 1);
    }

    @Override
    public final void f(int i10, long j10) {
        this.f14116q = j10;
    }

    public final void g(c3.a aVar) {
        b2.v a2;
        int i10 = aVar.f4563b;
        String str = aVar.f4562a;
        int i11 = aVar.f4564c;
        if (i10 != -2147483647 && i11 != -1) {
            b2.w wVar = this.f14111l;
            if (wVar == null || i11 != wVar.K || i10 != wVar.L || !str.equals(wVar.f4135s)) {
                b2.w wVar2 = this.f14111l;
                if (wVar2 == null) {
                    a2 = new b2.v();
                } else {
                    a2 = wVar2.a();
                }
                a2.f4068a = this.f14106f;
                a2.f4081q = v0.n(this.e);
                a2.f4082r = v0.n(str);
                a2.J = i11;
                a2.K = i10;
                a2.d = this.f14105c;
                a2.f4071f = this.d;
                b2.w wVar3 = new b2.w(a2);
                this.f14111l = wVar3;
                this.f14107g.b(wVar3);
            }
        }
    }

    @Override
    public final void e(boolean z10) {
    }
}
