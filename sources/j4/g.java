package j4;

import a8.ed;
import a8.yb;
import b2.w0;
import b2.x0;
import c3.j0;
import e2.n0;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;
public final class g implements i {
    public final e2.x f15316a;
    public final String f15318c;
    public final int d;
    public String f15319f;
    public j0 f15320g;
    public int f15321i;
    public int f15322j;
    public long f15323k;
    public b2.x f15324l;
    public int f15325m;
    public int f15326n;
    public int h = 0;
    public long f15329q = -9223372036854775807L;
    public final AtomicInteger f15317b = new AtomicInteger();
    public int f15327o = -1;
    public int f15328p = -1;
    public final String e = "video/mp2t";

    public g(String str, int i10, int i11) {
        this.f15316a = new e2.x(new byte[i11]);
        this.f15318c = str;
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
        this.f15320g.getClass();
        while (xVar.a() > 0) {
            int i29 = this.h;
            e2.x xVar2 = this.f15316a;
            switch (i29) {
                case 0:
                    while (true) {
                        if (xVar.a() > 0) {
                            int i30 = this.f15322j << 8;
                            this.f15322j = i30;
                            int A = i30 | xVar.A();
                            this.f15322j = A;
                            int i31 = c3.b.i(A);
                            this.f15326n = i31;
                            if (i31 != 0) {
                                byte[] bArr = xVar2.f9732a;
                                int i32 = this.f15322j;
                                bArr[0] = (byte) ((i32 >> 24) & 255);
                                bArr[1] = (byte) ((i32 >> 16) & 255);
                                bArr[2] = (byte) ((i32 >> 8) & 255);
                                bArr[3] = (byte) (i32 & 255);
                                this.f15321i = 4;
                                this.f15322j = 0;
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
                    if (!b(xVar, xVar2.f9732a, 18)) {
                        break;
                    } else {
                        byte[] bArr2 = xVar2.f9732a;
                        if (this.f15324l == null) {
                            String str = this.f15319f;
                            a4.g k10 = c3.b.k(bArr2);
                            k10.o(60);
                            int i33 = c3.b.f6010j[k10.g(6)];
                            int i34 = c3.b.f6011k[k10.g(4)];
                            int g7 = k10.g(5);
                            int[] iArr = c3.b.f6012l;
                            if (g7 >= 29) {
                                i13 = -1;
                            } else {
                                i13 = (iArr[g7] * 1000) / 2;
                            }
                            k10.o(10);
                            if (k10.g(2) > 0) {
                                i14 = 1;
                            } else {
                                i14 = 0;
                            }
                            int i35 = i33 + i14;
                            b2.w wVar = new b2.w();
                            wVar.f3519a = str;
                            wVar.f3532q = w0.n(this.e);
                            wVar.f3533r = w0.n("audio/vnd.dts");
                            wVar.h = i13;
                            wVar.J = i35;
                            wVar.K = i34;
                            wVar.v = null;
                            wVar.d = this.f15318c;
                            wVar.f3522f = this.d;
                            b2.x xVar3 = new b2.x(wVar);
                            this.f15324l = xVar3;
                            this.f15320g.b(xVar3);
                        }
                        this.f15325m = c3.b.g(bArr2);
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
                            this.f15323k = ed.b(n0.Y(this.f15324l.L, (((i12 >> 2) | i11) + 1) * 32));
                            xVar2.N(0);
                            this.f15320g.d(18, xVar2);
                            this.h = 6;
                            break;
                        } else {
                            i11 = (bArr2[5] & 1) << 6;
                            b10 = bArr2[4];
                        }
                        i12 = b10 & 252;
                        this.f15323k = ed.b(n0.Y(this.f15324l.L, (((i12 >> 2) | i11) + 1) * 32));
                        xVar2.N(0);
                        this.f15320g.d(18, xVar2);
                        this.h = 6;
                    }
                case 2:
                    if (b(xVar, xVar2.f9732a, 7)) {
                        a4.g k11 = c3.b.k(xVar2.f9732a);
                        k11.o(42);
                        if (k11.f()) {
                            i15 = 12;
                        } else {
                            i15 = 8;
                        }
                        this.f15327o = k11.g(i15) + 1;
                        this.h = 3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    int i36 = 8;
                    if (b(xVar, xVar2.f9732a, this.f15327o)) {
                        a4.g k12 = c3.b.k(xVar2.f9732a);
                        k12.o(40);
                        int g10 = k12.g(2);
                        if (!k12.f()) {
                            i16 = 16;
                            i17 = 8;
                        } else {
                            i16 = 20;
                            i17 = 12;
                        }
                        k12.o(i17);
                        int g11 = k12.g(i16) + 1;
                        boolean f7 = k12.f();
                        if (f7) {
                            i18 = k12.g(2);
                            i19 = (k12.g(3) + 1) * 512;
                            if (k12.f()) {
                                k12.o(36);
                            }
                            int g12 = k12.g(3) + 1;
                            int g13 = k12.g(3) + 1;
                            if (g12 == 1 && g13 == 1) {
                                int i37 = g10 + 1;
                                int g14 = k12.g(i37);
                                int i38 = 0;
                                while (i38 < i37) {
                                    if (((g14 >> i38) & 1) == 1) {
                                        k12.o(i36);
                                    }
                                    i38++;
                                    i36 = 8;
                                }
                                if (k12.f()) {
                                    k12.o(2);
                                    int g15 = (k12.g(2) + 1) << 2;
                                    int g16 = k12.g(2) + 1;
                                    for (int i39 = 0; i39 < g16; i39++) {
                                        k12.o(g15);
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
                            i21 = c3.b.f6013m[k12.g(4)];
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
                            String str2 = n0.f9692a;
                            j10 = n0.a0(i19, 1000000L, i22, RoundingMode.DOWN);
                        } else {
                            j10 = -9223372036854775807L;
                        }
                        g(new c3.a("audio/vnd.dts.hd;profile=lbr", i20, i21, g11, j10));
                        this.f15325m = g11;
                        if (j10 == -9223372036854775807L) {
                            j11 = 0;
                        } else {
                            j11 = j10;
                        }
                        this.f15323k = j11;
                        xVar2.N(0);
                        this.f15320g.d(this.f15327o, xVar2);
                        this.h = 6;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (b(xVar, xVar2.f9732a, 6)) {
                        a4.g k13 = c3.b.k(xVar2.f9732a);
                        k13.o(32);
                        int q5 = c3.b.q(k13, c3.b.f6018r) + 1;
                        this.f15328p = q5;
                        int i40 = this.f15321i;
                        if (i40 > q5) {
                            int i41 = i40 - q5;
                            this.f15321i = i40 - i41;
                            xVar.N(xVar.f9733b - i41);
                        }
                        this.h = 5;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (b(xVar, xVar2.f9732a, this.f15328p)) {
                        byte[] bArr3 = xVar2.f9732a;
                        a4.g k14 = c3.b.k(bArr3);
                        if (k14.g(32) == 1078008818) {
                            i23 = 1;
                        } else {
                            i23 = 0;
                        }
                        int q9 = c3.b.q(k14, c3.b.f6014n);
                        int i42 = q9 + 1;
                        if (i23 != 0) {
                            if (k14.f()) {
                                int i43 = q9 - 1;
                                int i44 = ((bArr3[i43] << 8) & 65535) | (bArr3[q9] & 255);
                                String str3 = n0.f9692a;
                                int i45 = 65535;
                                for (int i46 = 0; i46 < i43; i46++) {
                                    byte b13 = bArr3[i46];
                                    int[] iArr2 = n0.f9699k;
                                    int i47 = (iArr2[(((b13 & 255) >> 4) ^ ((i45 >> 12) & 255)) & 255] ^ ((i45 << 4) & 65535)) & 65535;
                                    i45 = (iArr2[((b13 & 15) ^ ((i47 >> 12) & 255)) & 255] ^ ((i47 << 4) & 65535)) & 65535;
                                }
                                if (i44 == i45) {
                                    int g17 = k14.g(2);
                                    if (g17 != 0) {
                                        if (g17 != 1) {
                                            if (g17 == 2) {
                                                i27 = 384;
                                            } else {
                                                throw x0.a(null, "Unsupported base duration index in DTS UHD header: " + g17);
                                            }
                                        } else {
                                            i27 = 480;
                                        }
                                        i26 = 3;
                                    } else {
                                        i26 = 3;
                                        i27 = 512;
                                    }
                                    int g18 = (k14.g(i26) + 1) * i27;
                                    int g19 = k14.g(2);
                                    if (g19 != 0) {
                                        if (g19 != 1) {
                                            if (g19 == 2) {
                                                i28 = 48000;
                                            } else {
                                                throw x0.a(null, "Unsupported clock rate index in DTS UHD header: " + g19);
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
                                    int g20 = i28 * (1 << k14.g(2));
                                    j12 = n0.a0(g18, 1000000L, i28, RoundingMode.DOWN);
                                    i24 = g20;
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
                            i48 += c3.b.q(k14, c3.b.f6015o);
                        }
                        AtomicInteger atomicInteger = this.f15317b;
                        if (i23 != 0) {
                            atomicInteger.set(c3.b.q(k14, c3.b.f6016p));
                        }
                        if (atomicInteger.get() != 0) {
                            i25 = c3.b.q(k14, c3.b.f6017q);
                        } else {
                            i25 = 0;
                        }
                        int i50 = i48 + i25 + i42;
                        c3.a aVar = new c3.a("audio/vnd.dts.uhd;profile=p2", 2, i24, i50, j12);
                        if (this.f15326n == 3) {
                            g(aVar);
                        }
                        this.f15325m = i50;
                        if (j12 == -9223372036854775807L) {
                            j13 = 0;
                        } else {
                            j13 = j12;
                        }
                        this.f15323k = j13;
                        xVar2.N(0);
                        this.f15320g.d(this.f15328p, xVar2);
                        this.h = 6;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    int min = Math.min(xVar.a(), this.f15325m - this.f15321i);
                    this.f15320g.d(min, xVar);
                    int i51 = this.f15321i + min;
                    this.f15321i = i51;
                    if (i51 != this.f15325m) {
                        break;
                    } else {
                        if (this.f15329q != -9223372036854775807L) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        yb.p(z10);
                        j0 j0Var = this.f15320g;
                        long j14 = this.f15329q;
                        if (this.f15326n == 4) {
                            i10 = 0;
                        } else {
                            i10 = 1;
                        }
                        j0Var.c(j14, i10, this.f15325m, 0, null);
                        this.f15329q += this.f15323k;
                        this.h = 0;
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    public final boolean b(e2.x xVar, byte[] bArr, int i10) {
        int min = Math.min(xVar.a(), i10 - this.f15321i);
        xVar.k(this.f15321i, min, bArr);
        int i11 = this.f15321i + min;
        this.f15321i = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void c() {
        this.h = 0;
        this.f15321i = 0;
        this.f15322j = 0;
        this.f15329q = -9223372036854775807L;
        this.f15317b.set(0);
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f15319f = (String) f0Var.e;
        f0Var.c();
        this.f15320g = qVar.F1(f0Var.f15315c, 1);
    }

    @Override
    public final void f(int i10, long j10) {
        this.f15329q = j10;
    }

    public final void g(c3.a aVar) {
        b2.w a2;
        int i10 = aVar.f6000b;
        String str = aVar.f5999a;
        int i11 = aVar.f6001c;
        if (i10 != -2147483647 && i11 != -1) {
            b2.x xVar = this.f15324l;
            if (xVar == null || i11 != xVar.K || i10 != xVar.L || !str.equals(xVar.f3586s)) {
                b2.x xVar2 = this.f15324l;
                if (xVar2 == null) {
                    a2 = new b2.w();
                } else {
                    a2 = xVar2.a();
                }
                a2.f3519a = this.f15319f;
                a2.f3532q = w0.n(this.e);
                a2.f3533r = w0.n(str);
                a2.J = i11;
                a2.K = i10;
                a2.d = this.f15318c;
                a2.f3522f = this.d;
                b2.x xVar3 = new b2.x(a2);
                this.f15324l = xVar3;
                this.f15320g.b(xVar3);
            }
        }
    }

    @Override
    public final void e(boolean z10) {
    }
}
