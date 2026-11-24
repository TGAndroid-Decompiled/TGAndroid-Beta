package defpackage;

import j$.util.Objects;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;
public final class fr3 implements gu3 {
    public final xu7 a;
    public final String c;
    public final int d;
    public String e;
    public wxb f;
    public int h;
    public int i;
    public int j;
    public long k;
    public fm4 l;
    public int m;
    public int n;
    public int o;
    public boolean r;
    public boolean u;
    public boolean v;
    public byte g = 0;
    public long s = -9223372036854775807L;
    public long t = -9223372036854775807L;
    public final AtomicInteger b = new AtomicInteger();
    public int p = -1;
    public int q = -1;

    public fr3(String str, int i, int i2) {
        this.a = new xu7(new byte[i2]);
        this.c = str;
        this.d = i;
    }

    public final boolean a(xu7 xu7Var, byte[] bArr, int i) {
        int min = Math.min(xu7Var.a(), i - this.h);
        xu7Var.k(this.h, min, bArr);
        int i2 = this.h + min;
        this.h = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    @Override
    public final void b(xu7 xu7Var) {
        boolean z;
        char c;
        char c2;
        int i;
        byte b;
        int i2;
        byte b2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        this.f.getClass();
        while (xu7Var.a() > 0) {
            byte b3 = this.g;
            long j2 = -9223372036854775807L;
            xu7 xu7Var2 = this.a;
            switch (b3) {
                case 0:
                    while (true) {
                        if (xu7Var.a() > 0) {
                            int i13 = this.j << 8;
                            this.j = i13;
                            int A = i13 | xu7Var.A();
                            this.j = A;
                            int b4 = bzc.b(A);
                            this.o = b4;
                            if (b4 != 0) {
                                c(this.j);
                                this.j = 0;
                                if (this.v && this.o == 2) {
                                    this.h = 0;
                                    break;
                                } else {
                                    int i14 = this.o;
                                    if (i14 == 1) {
                                        this.v = false;
                                    }
                                    if (i14 != 3 && i14 != 4) {
                                        if (i14 == 1) {
                                            this.g = (byte) 1;
                                            break;
                                        } else {
                                            this.g = (byte) 2;
                                            break;
                                        }
                                    } else {
                                        this.g = (byte) 4;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    break;
                case 1:
                    if (!a(xu7Var, xu7Var2.a, 18)) {
                        break;
                    } else {
                        this.u = true;
                        byte[] bArr = xu7Var2.a;
                        if (this.l == null) {
                            String str = this.e;
                            qd1 c3 = bzc.c(bArr);
                            c3.n(60);
                            int i15 = bzc.a[c3.f(6)];
                            int i16 = bzc.b[c3.f(4)];
                            c2 = 7;
                            int f = c3.f(5);
                            c = 5;
                            if (f >= 29) {
                                i3 = -1;
                            } else {
                                i3 = (bzc.c[f] * 1000) / 2;
                            }
                            c3.n(10);
                            if (c3.f(2) > 0) {
                                i4 = 1;
                            } else {
                                i4 = 0;
                            }
                            int i17 = i15 + i4;
                            em4 em4Var = new em4();
                            em4Var.a = str;
                            em4Var.r = ud7.n("video/mp2t");
                            em4Var.s = ud7.n("audio/vnd.dts");
                            em4Var.i = i3;
                            em4Var.M = i17;
                            em4Var.O = i16;
                            em4Var.w = null;
                            em4Var.d = this.c;
                            em4Var.f = this.d;
                            this.l = new fm4(em4Var);
                            this.r = true;
                        } else {
                            c = 5;
                            c2 = 7;
                        }
                        this.m = bzc.a(bArr);
                        byte b5 = bArr[0];
                        if (b5 != -2) {
                            if (b5 != -1) {
                                if (b5 != 31) {
                                    i = (bArr[4] & 1) << 6;
                                    b = bArr[c];
                                } else {
                                    i = (bArr[c] & 7) << 4;
                                    b2 = bArr[6];
                                }
                            } else {
                                i = (bArr[4] & 7) << 4;
                                b2 = bArr[c2];
                            }
                            i2 = b2 & 60;
                            this.k = gle.b(g8c.Z(this.l.P, ((i | (i2 >> 2)) + 1) << 5));
                            xu7Var2.N(0);
                            this.f.e(18, xu7Var2);
                            this.g = (byte) 6;
                            break;
                        } else {
                            i = (bArr[c] & 1) << 6;
                            b = bArr[4];
                        }
                        i2 = b & 252;
                        this.k = gle.b(g8c.Z(this.l.P, ((i | (i2 >> 2)) + 1) << 5));
                        xu7Var2.N(0);
                        this.f.e(18, xu7Var2);
                        this.g = (byte) 6;
                    }
                case 2:
                    if (a(xu7Var, xu7Var2.a, 7)) {
                        qd1 c4 = bzc.c(xu7Var2.a);
                        c4.n(42);
                        if (c4.e()) {
                            i5 = 12;
                        } else {
                            i5 = 8;
                        }
                        this.p = c4.f(i5) + 1;
                        this.g = (byte) 3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (a(xu7Var, xu7Var2.a, this.p)) {
                        gr3 f2 = bzc.f(xu7Var2.a);
                        i(f2);
                        this.m = f2.d;
                        long j3 = f2.e;
                        if (j3 != -9223372036854775807L) {
                            this.k = j3;
                        }
                        xu7Var2.N(0);
                        this.f.e(this.p, xu7Var2);
                        this.g = (byte) 6;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (a(xu7Var, xu7Var2.a, 6)) {
                        qd1 c5 = bzc.c(xu7Var2.a);
                        c5.n(32);
                        int g = bzc.g(c5, bzc.i) + 1;
                        this.q = g;
                        int i18 = this.h;
                        if (i18 > g) {
                            int i19 = i18 - g;
                            this.h = i18 - i19;
                            xu7Var.N(xu7Var.b - i19);
                        }
                        this.g = (byte) 5;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (a(xu7Var, xu7Var2.a, this.q)) {
                        byte[] bArr2 = xu7Var2.a;
                        qd1 c6 = bzc.c(bArr2);
                        if (c6.f(32) == 1078008818) {
                            i6 = 1;
                        } else {
                            i6 = 0;
                        }
                        int g2 = bzc.g(c6, bzc.e);
                        int i20 = g2 + 1;
                        if (i6 != 0) {
                            if (c6.e()) {
                                j = -9223372036854775807L;
                                int i21 = g2 - 1;
                                int i22 = ((bArr2[i21] << 8) & 65535) | (bArr2[g2] & 255);
                                String str2 = g8c.a;
                                int i23 = 65535;
                                for (int i24 = 0; i24 < i21; i24++) {
                                    byte b6 = bArr2[i24];
                                    int[] iArr = g8c.k;
                                    int i25 = (((i23 << 4) & 65535) ^ iArr[(((i23 >> 12) & 255) ^ ((b6 & 255) >> 4)) & 255]) & 65535;
                                    i23 = (((i25 << 4) & 65535) ^ iArr[(((i25 >> 12) & 255) ^ (b6 & 15)) & 255]) & 65535;
                                }
                                if (i22 == i23) {
                                    int f3 = c6.f(2);
                                    if (f3 != 0) {
                                        if (f3 != 1) {
                                            if (f3 == 2) {
                                                i9 = 384;
                                            } else {
                                                throw av7.a("Unsupported base duration index in DTS UHD header: " + f3, null);
                                            }
                                        } else {
                                            i9 = 480;
                                        }
                                    } else {
                                        i9 = 512;
                                    }
                                    int f4 = (c6.f(3) + 1) * i9;
                                    int f5 = c6.f(2);
                                    if (f5 != 0) {
                                        if (f5 != 1) {
                                            if (f5 == 2) {
                                                i10 = 48000;
                                            } else {
                                                throw av7.a("Unsupported clock rate index in DTS UHD header: " + f5, null);
                                            }
                                        } else {
                                            i10 = 44100;
                                        }
                                    } else {
                                        i10 = 32000;
                                    }
                                    if (c6.e()) {
                                        c6.n(36);
                                    }
                                    i7 = (1 << c6.f(2)) * i10;
                                    j2 = g8c.b0(f4, 1000000L, i10, RoundingMode.DOWN);
                                } else {
                                    throw av7.a("CRC check failed", null);
                                }
                            } else {
                                throw av7.d("Only supports full channel mask-based audio presentation");
                            }
                        } else {
                            j = -9223372036854775807L;
                            i7 = -2147483647;
                        }
                        int i26 = i7;
                        int i27 = 0;
                        for (int i28 = 0; i28 < i6; i28++) {
                            i27 += bzc.g(c6, bzc.f);
                        }
                        AtomicInteger atomicInteger = this.b;
                        if (i6 != 0) {
                            atomicInteger.set(bzc.g(c6, bzc.g));
                        }
                        if (atomicInteger.get() != 0) {
                            i8 = bzc.g(c6, bzc.h);
                        } else {
                            i8 = 0;
                        }
                        int i29 = i27 + i8 + i20;
                        gr3 gr3Var = new gr3("audio/vnd.dts.uhd;profile=p2", 2, i26, i29, j2);
                        if (this.o == 3) {
                            i(gr3Var);
                        }
                        this.m = i29;
                        if (j2 == j) {
                            j2 = 0;
                        }
                        this.k = j2;
                        xu7Var2.N(0);
                        this.f.e(this.q, xu7Var2);
                        this.g = (byte) 6;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    int min = Math.min(xu7Var.a(), this.m - this.h);
                    this.f.e(min, xu7Var);
                    int i30 = this.h + min;
                    this.h = i30;
                    int i31 = this.m;
                    if (i30 != i31) {
                        break;
                    } else if (this.o == 1) {
                        this.n = i31;
                        this.h = 0;
                        this.i = 0;
                        this.g = (byte) 7;
                        break;
                    } else {
                        if (this.s != -9223372036854775807L) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        gre.p(z2);
                        int i32 = this.m;
                        int i33 = this.o;
                        if (i33 == 2) {
                            i11 = this.n;
                        } else {
                            i11 = 0;
                        }
                        int i34 = i32 + i11;
                        long j4 = this.s;
                        wxb wxbVar = this.f;
                        if (i33 == 4) {
                            i12 = 0;
                        } else {
                            i12 = 1;
                        }
                        wxbVar.a(j4, i12, i34, 0, null);
                        this.s += this.k;
                        long j5 = this.t;
                        if (j5 != -9223372036854775807L) {
                            if (j5 != j4) {
                                this.s = j5;
                            }
                            this.t = -9223372036854775807L;
                        }
                        this.n = 0;
                        this.g = (byte) 0;
                        break;
                    }
                case 7:
                    while (xu7Var.a() > 0 && this.h < 4) {
                        int i35 = this.i << 8;
                        this.i = i35;
                        this.i = i35 | xu7Var.A();
                        this.h++;
                    }
                    if (this.h != 4) {
                        break;
                    } else if (bzc.b(this.i) == 2) {
                        c(this.i);
                        this.o = 2;
                        this.i = 0;
                        this.g = (byte) 2;
                        break;
                    } else {
                        if (this.r) {
                            wxb wxbVar2 = this.f;
                            fm4 fm4Var = this.l;
                            fm4Var.getClass();
                            wxbVar2.g(fm4Var);
                            this.r = false;
                        }
                        if (this.s != -9223372036854775807L) {
                            z = true;
                        } else {
                            z = false;
                        }
                        gre.p(z);
                        long j6 = this.s;
                        this.f.a(j6, 1, this.n, 0, null);
                        this.s += this.k;
                        long j7 = this.t;
                        if (j7 != -9223372036854775807L) {
                            if (j7 != j6) {
                                this.s = j7;
                            }
                            this.t = -9223372036854775807L;
                        }
                        this.n = 0;
                        int i36 = this.i;
                        this.j = i36;
                        this.i = 0;
                        int b7 = bzc.b(i36);
                        this.o = b7;
                        if (b7 != 3 && b7 != 4) {
                            if (b7 == 1) {
                                c(this.j);
                                this.j = 0;
                                this.g = (byte) 1;
                                break;
                            } else {
                                this.h = 0;
                                this.g = (byte) 0;
                                break;
                            }
                        } else {
                            c(this.j);
                            this.j = 0;
                            this.g = (byte) 4;
                            break;
                        }
                    }
                default:
                    sdb.a();
                    return;
            }
        }
    }

    public final void c(int i) {
        byte[] bArr = this.a.a;
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        this.h = 4;
    }

    @Override
    public final void d() {
        this.g = (byte) 0;
        this.h = 0;
        this.j = 0;
        this.i = 0;
        this.n = 0;
        this.s = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.b.set(0);
        this.r = false;
        this.v = this.u;
    }

    @Override
    public final void f() {
        if (this.g == 7) {
            this.f.getClass();
            if (this.r) {
                wxb wxbVar = this.f;
                fm4 fm4Var = this.l;
                fm4Var.getClass();
                wxbVar.g(fm4Var);
                this.r = false;
            }
            long j = this.s;
            if (j != -9223372036854775807L) {
                this.f.a(j, 1, this.n, 0, null);
                this.s += this.k;
            }
            this.n = 0;
            this.h = 0;
            this.j = 0;
            this.i = 0;
            this.g = (byte) 0;
        }
    }

    @Override
    public final void g(int i, long j) {
        if (j != -9223372036854775807L) {
            if (this.g != 0) {
                this.t = j;
                return;
            }
            this.s = j;
            this.t = -9223372036854775807L;
        }
    }

    @Override
    public final void h(l74 l74Var, l2c l2cVar) {
        l2cVar.a();
        l2cVar.b();
        this.e = l2cVar.e;
        l2cVar.b();
        this.f = l74Var.S(l2cVar.d, 1);
    }

    public final void i(gr3 gr3Var) {
        em4 a;
        int i = gr3Var.b;
        int i2 = gr3Var.c;
        if (i != -2147483647 && i2 != -1) {
            String str = gr3Var.a;
            if (str == null) {
                fm4 fm4Var = this.l;
                if (fm4Var != null) {
                    str = fm4Var.t;
                } else {
                    str = null;
                }
            }
            fm4 fm4Var2 = this.l;
            if (fm4Var2 == null || this.r || i2 != fm4Var2.N || i != fm4Var2.P || !Objects.equals(str, fm4Var2.t)) {
                fm4 fm4Var3 = this.l;
                if (fm4Var3 == null) {
                    a = new em4();
                } else {
                    a = fm4Var3.a();
                }
                a.a = this.e;
                a.r = ud7.n("video/mp2t");
                a.s = ud7.n(str);
                a.M = i2;
                a.O = i;
                a.d = this.c;
                a.f = this.d;
                fm4 fm4Var4 = new fm4(a);
                this.l = fm4Var4;
                this.f.g(fm4Var4);
                this.r = false;
            }
        }
    }

    @Override
    public final void e() {
    }
}
