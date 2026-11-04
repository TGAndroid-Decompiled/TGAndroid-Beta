package l4;

import b8.od;
import b8.zb;
import d2.u0;
import d2.v0;
import e3.i0;
import g2.n0;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;
public final class g implements i {
    public final g2.y f17824a;
    public final String f17826c;
    public final int d;
    public String f17828f;
    public i0 f17829g;
    public int f17830i;
    public int f17831j;
    public long f17832k;
    public d2.v f17833l;
    public int f17834m;
    public int f17835n;
    public int h = 0;
    public long f17838q = -9223372036854775807L;
    public final AtomicInteger f17825b = new AtomicInteger();
    public int f17836o = -1;
    public int f17837p = -1;
    public final String f17827e = "video/mp2t";

    public g(String str, int i3, int i10) {
        this.f17824a = new g2.y(new byte[i10]);
        this.f17826c = str;
        this.d = i3;
    }

    @Override
    public final void a() {
        this.h = 0;
        this.f17830i = 0;
        this.f17831j = 0;
        this.f17838q = -9223372036854775807L;
        this.f17825b.set(0);
    }

    public final boolean b(g2.y yVar, byte[] bArr, int i3) {
        int min = Math.min(yVar.a(), i3 - this.f17830i);
        yVar.k(this.f17830i, min, bArr);
        int i10 = this.f17830i + min;
        this.f17830i = i10;
        if (i10 == i3) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(g2.y yVar) {
        boolean z10;
        int i3;
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
        long j10;
        long j11;
        int i21;
        int i22;
        long j12;
        int i23;
        int i24;
        long j13;
        int i25;
        int i26;
        int i27;
        this.f17829g.getClass();
        while (yVar.a() > 0) {
            int i28 = this.h;
            g2.y yVar2 = this.f17824a;
            switch (i28) {
                case 0:
                    while (true) {
                        if (yVar.a() > 0) {
                            int i29 = this.f17831j << 8;
                            this.f17831j = i29;
                            int A = i29 | yVar.A();
                            this.f17831j = A;
                            int i30 = e3.b.i(A);
                            this.f17835n = i30;
                            if (i30 != 0) {
                                byte[] bArr = yVar2.f11923a;
                                int i31 = this.f17831j;
                                bArr[0] = (byte) ((i31 >> 24) & 255);
                                bArr[1] = (byte) ((i31 >> 16) & 255);
                                bArr[2] = (byte) ((i31 >> 8) & 255);
                                bArr[3] = (byte) (i31 & 255);
                                this.f17830i = 4;
                                this.f17831j = 0;
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
                    if (!b(yVar, yVar2.f11923a, 18)) {
                        break;
                    } else {
                        byte[] bArr2 = yVar2.f11923a;
                        if (this.f17833l == null) {
                            String str = this.f17828f;
                            c4.f k10 = e3.b.k(bArr2);
                            k10.L(60);
                            int i32 = e3.b.f9415j[k10.j(6)];
                            int i33 = e3.b.f9416k[k10.j(4)];
                            int j14 = k10.j(5);
                            int[] iArr = e3.b.f9417l;
                            if (j14 >= 29) {
                                i12 = -1;
                            } else {
                                i12 = (iArr[j14] * 1000) / 2;
                            }
                            k10.L(10);
                            if (k10.j(2) > 0) {
                                i13 = 1;
                            } else {
                                i13 = 0;
                            }
                            int i34 = i32 + i13;
                            d2.u uVar = new d2.u();
                            uVar.f8416a = str;
                            uVar.f8430q = u0.n(this.f17827e);
                            uVar.f8431r = u0.n("audio/vnd.dts");
                            uVar.h = i12;
                            uVar.J = i34;
                            uVar.K = i33;
                            uVar.v = null;
                            uVar.d = this.f17826c;
                            uVar.f8420f = this.d;
                            d2.v vVar = new d2.v(uVar);
                            this.f17833l = vVar;
                            this.f17829g.g(vVar);
                        }
                        this.f17834m = e3.b.g(bArr2);
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
                            this.f17832k = od.b(n0.Y(this.f17833l.L, (((i11 >> 2) | i10) + 1) * 32));
                            yVar2.N(0);
                            this.f17829g.e(18, yVar2);
                            this.h = 6;
                            break;
                        } else {
                            i10 = (bArr2[5] & 1) << 6;
                            b10 = bArr2[4];
                        }
                        i11 = b10 & 252;
                        this.f17832k = od.b(n0.Y(this.f17833l.L, (((i11 >> 2) | i10) + 1) * 32));
                        yVar2.N(0);
                        this.f17829g.e(18, yVar2);
                        this.h = 6;
                    }
                case 2:
                    if (b(yVar, yVar2.f11923a, 7)) {
                        c4.f k11 = e3.b.k(yVar2.f11923a);
                        k11.L(42);
                        if (k11.i()) {
                            i14 = 12;
                        } else {
                            i14 = 8;
                        }
                        this.f17836o = k11.j(i14) + 1;
                        this.h = 3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    int i35 = 8;
                    if (b(yVar, yVar2.f11923a, this.f17836o)) {
                        c4.f k12 = e3.b.k(yVar2.f11923a);
                        k12.L(40);
                        int j15 = k12.j(2);
                        if (!k12.i()) {
                            i15 = 16;
                            i16 = 8;
                        } else {
                            i15 = 20;
                            i16 = 12;
                        }
                        k12.L(i16);
                        int j16 = k12.j(i15) + 1;
                        boolean i36 = k12.i();
                        if (i36) {
                            i17 = k12.j(2);
                            i18 = (k12.j(3) + 1) * 512;
                            if (k12.i()) {
                                k12.L(36);
                            }
                            int j17 = k12.j(3) + 1;
                            int j18 = k12.j(3) + 1;
                            if (j17 == 1 && j18 == 1) {
                                int i37 = j15 + 1;
                                int j19 = k12.j(i37);
                                int i38 = 0;
                                while (i38 < i37) {
                                    if (((j19 >> i38) & 1) == 1) {
                                        k12.L(i35);
                                    }
                                    i38++;
                                    i35 = 8;
                                }
                                if (k12.i()) {
                                    k12.L(2);
                                    int j20 = (k12.j(2) + 1) << 2;
                                    int j21 = k12.j(2) + 1;
                                    for (int i39 = 0; i39 < j21; i39++) {
                                        k12.L(j20);
                                    }
                                }
                            } else {
                                throw v0.c("Multiple audio presentations or assets not supported");
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
                            i20 = e3.b.f9418m[k12.j(4)];
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
                                        throw v0.a(null, "Unsupported reference clock code in DTS HD header: " + i17);
                                    }
                                } else {
                                    i21 = 44100;
                                }
                            } else {
                                i21 = 32000;
                            }
                            String str2 = n0.f11873a;
                            j10 = n0.a0(i18, 1000000L, i21, RoundingMode.DOWN);
                        } else {
                            j10 = -9223372036854775807L;
                        }
                        g(new e3.a("audio/vnd.dts.hd;profile=lbr", i19, i20, j16, j10));
                        this.f17834m = j16;
                        if (j10 == -9223372036854775807L) {
                            j11 = 0;
                        } else {
                            j11 = j10;
                        }
                        this.f17832k = j11;
                        yVar2.N(0);
                        this.f17829g.e(this.f17836o, yVar2);
                        this.h = 6;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (b(yVar, yVar2.f11923a, 6)) {
                        c4.f k13 = e3.b.k(yVar2.f11923a);
                        k13.L(32);
                        int q10 = e3.b.q(k13, e3.b.f9423r) + 1;
                        this.f17837p = q10;
                        int i40 = this.f17830i;
                        if (i40 > q10) {
                            int i41 = i40 - q10;
                            this.f17830i = i40 - i41;
                            yVar.N(yVar.f11924b - i41);
                        }
                        this.h = 5;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (b(yVar, yVar2.f11923a, this.f17837p)) {
                        byte[] bArr3 = yVar2.f11923a;
                        c4.f k14 = e3.b.k(bArr3);
                        if (k14.j(32) == 1078008818) {
                            i22 = 1;
                        } else {
                            i22 = 0;
                        }
                        int q11 = e3.b.q(k14, e3.b.f9419n);
                        int i42 = q11 + 1;
                        if (i22 != 0) {
                            if (k14.i()) {
                                int i43 = q11 - 1;
                                int i44 = ((bArr3[i43] << 8) & 65535) | (bArr3[q11] & 255);
                                String str3 = n0.f11873a;
                                int i45 = 65535;
                                for (int i46 = 0; i46 < i43; i46++) {
                                    byte b13 = bArr3[i46];
                                    int[] iArr2 = n0.f11881k;
                                    int i47 = (iArr2[(((b13 & 255) >> 4) ^ ((i45 >> 12) & 255)) & 255] ^ ((i45 << 4) & 65535)) & 65535;
                                    i45 = (iArr2[((b13 & 15) ^ ((i47 >> 12) & 255)) & 255] ^ ((i47 << 4) & 65535)) & 65535;
                                }
                                if (i44 == i45) {
                                    int j22 = k14.j(2);
                                    if (j22 != 0) {
                                        if (j22 != 1) {
                                            if (j22 == 2) {
                                                i26 = 384;
                                            } else {
                                                throw v0.a(null, "Unsupported base duration index in DTS UHD header: " + j22);
                                            }
                                        } else {
                                            i26 = 480;
                                        }
                                        i25 = 3;
                                    } else {
                                        i25 = 3;
                                        i26 = 512;
                                    }
                                    int j23 = (k14.j(i25) + 1) * i26;
                                    int j24 = k14.j(2);
                                    if (j24 != 0) {
                                        if (j24 != 1) {
                                            if (j24 == 2) {
                                                i27 = 48000;
                                            } else {
                                                throw v0.a(null, "Unsupported clock rate index in DTS UHD header: " + j24);
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
                                    int j25 = i27 * (1 << k14.j(2));
                                    j12 = n0.a0(j23, 1000000L, i27, RoundingMode.DOWN);
                                    i23 = j25;
                                } else {
                                    throw v0.a(null, "CRC check failed");
                                }
                            } else {
                                throw v0.c("Only supports full channel mask-based audio presentation");
                            }
                        } else {
                            j12 = -9223372036854775807L;
                            i23 = -2147483647;
                        }
                        int i48 = 0;
                        for (int i49 = 0; i49 < i22; i49++) {
                            i48 += e3.b.q(k14, e3.b.f9420o);
                        }
                        AtomicInteger atomicInteger = this.f17825b;
                        if (i22 != 0) {
                            atomicInteger.set(e3.b.q(k14, e3.b.f9421p));
                        }
                        if (atomicInteger.get() != 0) {
                            i24 = e3.b.q(k14, e3.b.f9422q);
                        } else {
                            i24 = 0;
                        }
                        int i50 = i48 + i24 + i42;
                        e3.a aVar = new e3.a("audio/vnd.dts.uhd;profile=p2", 2, i23, i50, j12);
                        if (this.f17835n == 3) {
                            g(aVar);
                        }
                        this.f17834m = i50;
                        if (j12 == -9223372036854775807L) {
                            j13 = 0;
                        } else {
                            j13 = j12;
                        }
                        this.f17832k = j13;
                        yVar2.N(0);
                        this.f17829g.e(this.f17837p, yVar2);
                        this.h = 6;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    int min = Math.min(yVar.a(), this.f17834m - this.f17830i);
                    this.f17829g.e(min, yVar);
                    int i51 = this.f17830i + min;
                    this.f17830i = i51;
                    if (i51 != this.f17834m) {
                        break;
                    } else {
                        if (this.f17838q != -9223372036854775807L) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        zb.p(z10);
                        i0 i0Var = this.f17829g;
                        long j26 = this.f17838q;
                        if (this.f17835n == 4) {
                            i3 = 0;
                        } else {
                            i3 = 1;
                        }
                        i0Var.d(j26, i3, this.f17834m, 0, null);
                        this.f17838q += this.f17832k;
                        this.h = 0;
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override
    public final void e(int i3, long j10) {
        this.f17838q = j10;
    }

    @Override
    public final void f(e3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f17828f = (String) f0Var.f17823e;
        f0Var.c();
        this.f17829g = qVar.i0(f0Var.f17822c, 1);
    }

    public final void g(e3.a aVar) {
        d2.u a10;
        int i3 = aVar.f9404b;
        String str = aVar.f9403a;
        int i10 = aVar.f9405c;
        if (i3 != -2147483647 && i10 != -1) {
            d2.v vVar = this.f17833l;
            if (vVar == null || i10 != vVar.K || i3 != vVar.L || !str.equals(vVar.f8489s)) {
                d2.v vVar2 = this.f17833l;
                if (vVar2 == null) {
                    a10 = new d2.u();
                } else {
                    a10 = vVar2.a();
                }
                a10.f8416a = this.f17828f;
                a10.f8430q = u0.n(this.f17827e);
                a10.f8431r = u0.n(str);
                a10.J = i10;
                a10.K = i3;
                a10.d = this.f17826c;
                a10.f8420f = this.d;
                d2.v vVar3 = new d2.v(a10);
                this.f17833l = vVar3;
                this.f17829g.g(vVar3);
            }
        }
    }

    @Override
    public final void d(boolean z10) {
    }
}
