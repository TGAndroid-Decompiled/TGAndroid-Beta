package j4;

import a8.yb;
import b2.w0;
import c3.j0;
import e2.n0;
import java.util.Arrays;
import java.util.Collections;
public final class e implements i {
    public static final byte[] f15289x = {73, 68, 51};
    public final boolean f15290a;
    public final String d;
    public final int e;
    public final String f15293f;
    public String f15294g;
    public j0 h;
    public j0 f15295i;
    public boolean f15299m;
    public boolean f15300n;
    public int f15303q;
    public boolean f15304r;
    public int f15306t;
    public j0 v;
    public long f15308w;
    public final a4.g f15291b = new a4.g(new byte[7], 7);
    public final e2.x f15292c = new e2.x(Arrays.copyOf(f15289x, 10));
    public int f15301o = -1;
    public int f15302p = -1;
    public long f15305s = -9223372036854775807L;
    public long f15307u = -9223372036854775807L;
    public int f15296j = 0;
    public int f15297k = 0;
    public int f15298l = 256;

    public e(int i10, String str, String str2, boolean z10) {
        this.f15290a = z10;
        this.d = str;
        this.e = i10;
        this.f15293f = str2;
    }

    @Override
    public final void a(e2.x xVar) {
        int i10;
        int i11;
        int i12;
        byte b10;
        char c10;
        ?? r42;
        int i13;
        char c11;
        int i14;
        char c12;
        boolean z10;
        int i15;
        this.h.getClass();
        String str = n0.f9692a;
        while (xVar.a() > 0) {
            int i16 = this.f15296j;
            char c13 = 65535;
            e2.x xVar2 = this.f15292c;
            int i17 = 3;
            a4.g gVar = this.f15291b;
            int i18 = 0;
            int i19 = 4;
            boolean z11 = true;
            int i20 = 1;
            if (i16 != 0) {
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 != 3) {
                            if (i16 == 4) {
                                int min = Math.min(xVar.a(), this.f15306t - this.f15297k);
                                this.v.d(min, xVar);
                                int i21 = this.f15297k + min;
                                this.f15297k = i21;
                                if (i21 == this.f15306t) {
                                    if (this.f15307u == -9223372036854775807L) {
                                        z11 = false;
                                    }
                                    yb.p(z11);
                                    this.v.c(this.f15307u, 1, this.f15306t, 0, null);
                                    this.f15307u += this.f15308w;
                                    this.f15296j = 0;
                                    this.f15297k = 0;
                                    this.f15298l = 256;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            if (this.f15299m) {
                                i10 = 7;
                            } else {
                                i10 = 5;
                            }
                            byte[] bArr = gVar.f260b;
                            int min2 = Math.min(xVar.a(), i10 - this.f15297k);
                            xVar.k(this.f15297k, min2, bArr);
                            int i22 = this.f15297k + min2;
                            this.f15297k = i22;
                            if (i22 == i10) {
                                gVar.m(0);
                                if (!this.f15304r) {
                                    int g7 = gVar.g(2) + 1;
                                    if (g7 != 2) {
                                        e2.a.l("AdtsReader", "Detected audio object type: " + g7 + ", but assuming AAC LC.");
                                        g7 = 2;
                                    }
                                    gVar.o(5);
                                    int g10 = gVar.g(3);
                                    int i23 = this.f15302p;
                                    byte[] bArr2 = {(byte) (((g7 << 3) & 248) | ((i23 >> 1) & 7)), (byte) (((g10 << 3) & 120) | ((i23 << 7) & 128))};
                                    c3.a n10 = c3.b.n(new a4.g(bArr2, 2), false);
                                    b2.w wVar = new b2.w();
                                    wVar.f3519a = this.f15294g;
                                    wVar.f3532q = w0.n(this.f15293f);
                                    wVar.f3533r = w0.n("audio/mp4a-latm");
                                    wVar.f3525j = n10.f5999a;
                                    wVar.J = n10.f6001c;
                                    wVar.K = n10.f6000b;
                                    wVar.f3536u = Collections.singletonList(bArr2);
                                    wVar.d = this.d;
                                    wVar.f3522f = this.e;
                                    b2.x xVar3 = new b2.x(wVar);
                                    this.f15305s = 1024000000 / xVar3.L;
                                    this.h.b(xVar3);
                                    this.f15304r = true;
                                } else {
                                    gVar.o(10);
                                }
                                gVar.o(4);
                                int g11 = gVar.g(13);
                                int i24 = g11 - 7;
                                if (this.f15299m) {
                                    i24 = g11 - 9;
                                }
                                j0 j0Var = this.h;
                                long j10 = this.f15305s;
                                this.f15296j = 4;
                                this.f15297k = 0;
                                this.v = j0Var;
                                this.f15308w = j10;
                                this.f15306t = i24;
                            }
                        }
                    } else {
                        byte[] bArr3 = xVar2.f9732a;
                        int min3 = Math.min(xVar.a(), 10 - this.f15297k);
                        xVar.k(this.f15297k, min3, bArr3);
                        int i25 = this.f15297k + min3;
                        this.f15297k = i25;
                        if (i25 == 10) {
                            this.f15295i.d(10, xVar2);
                            xVar2.N(6);
                            j0 j0Var2 = this.f15295i;
                            this.f15296j = 4;
                            this.f15297k = 10;
                            this.v = j0Var2;
                            this.f15308w = 0L;
                            this.f15306t = xVar2.z() + 10;
                        }
                    }
                } else if (xVar.a() != 0) {
                    gVar.f260b[0] = xVar.f9732a[xVar.f9733b];
                    gVar.m(2);
                    int g12 = gVar.g(4);
                    int i26 = this.f15302p;
                    if (i26 != -1 && g12 != i26) {
                        this.f15300n = false;
                        this.f15296j = 0;
                        this.f15297k = 0;
                        this.f15298l = 256;
                    } else {
                        if (!this.f15300n) {
                            this.f15300n = true;
                            this.f15301o = this.f15303q;
                            this.f15302p = g12;
                        }
                        this.f15296j = 3;
                        this.f15297k = 0;
                    }
                }
            } else {
                byte[] bArr4 = xVar.f9732a;
                int i27 = xVar.f9733b;
                int i28 = xVar.f9734c;
                while (true) {
                    if (i27 < i28) {
                        i11 = i27 + 1;
                        i12 = i17;
                        b10 = bArr4[i27];
                        int i29 = b10 & 255;
                        if (this.f15298l == 512 && (((65280 | ((((byte) i29) & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520) {
                            if (this.f15300n) {
                                break;
                            }
                            int i30 = i27 - 1;
                            xVar.N(i27);
                            byte[] bArr5 = gVar.f260b;
                            if (xVar.a() >= i20) {
                                xVar.k(i18, i20, bArr5);
                                gVar.m(i19);
                                int g13 = gVar.g(i20);
                                int i31 = this.f15301o;
                                if (i31 != -1 && g13 != i31) {
                                    c10 = 65535;
                                } else {
                                    if (this.f15302p != -1) {
                                        byte[] bArr6 = gVar.f260b;
                                        if (xVar.a() < i20) {
                                            break;
                                        }
                                        xVar.k(i18, i20, bArr6);
                                        gVar.m(2);
                                        i15 = 4;
                                        if (gVar.g(4) == this.f15302p) {
                                            xVar.N(i11);
                                        }
                                    } else {
                                        i15 = 4;
                                    }
                                    byte[] bArr7 = gVar.f260b;
                                    if (xVar.a() >= i15) {
                                        xVar.k(i18, i15, bArr7);
                                        gVar.m(14);
                                        int g14 = gVar.g(13);
                                        if (g14 >= 7) {
                                            byte[] bArr8 = xVar.f9732a;
                                            int i32 = xVar.f9734c;
                                            int i33 = i30 + g14;
                                            if (i33 < i32) {
                                                byte b11 = bArr8[i33];
                                                c10 = 65535;
                                                if (b11 == -1) {
                                                    int i34 = i33 + 1;
                                                    if (i34 != i32) {
                                                        byte b12 = bArr8[i34];
                                                        if ((((65280 | ((b12 & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520 && ((b12 & 8) >> 3) == g13) {
                                                            break;
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                } else if (b11 == 73) {
                                                    int i35 = i33 + 1;
                                                    if (i35 != i32) {
                                                        if (bArr8[i35] == 68) {
                                                            int i36 = i33 + 2;
                                                            if (i36 != i32) {
                                                                if (bArr8[i36] == 51) {
                                                                    break;
                                                                }
                                                            } else {
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                r42 = true;
                            }
                            c10 = 65535;
                            r42 = true;
                        } else {
                            c10 = c13;
                            r42 = i20;
                        }
                        int i37 = this.f15298l;
                        int i38 = i29 | i37;
                        if (i38 != 329) {
                            if (i38 != 511) {
                                if (i38 != 836) {
                                    if (i38 != 1075) {
                                        c11 = 256;
                                        if (i37 != 256) {
                                            this.f15298l = 256;
                                            i13 = 3;
                                            i14 = 0;
                                            c12 = 2;
                                            i20 = r42;
                                            c13 = c10;
                                            i19 = 4;
                                            i18 = i14;
                                            i17 = i13;
                                        } else {
                                            i13 = 3;
                                            i14 = 0;
                                            c12 = 2;
                                        }
                                    } else {
                                        this.f15296j = 2;
                                        this.f15297k = 3;
                                        this.f15306t = 0;
                                        xVar2.N(0);
                                        xVar.N(i11);
                                        break;
                                    }
                                } else {
                                    i13 = 3;
                                    c11 = 256;
                                    i14 = 0;
                                    c12 = 2;
                                    this.f15298l = 1024;
                                }
                            } else {
                                i13 = 3;
                                c11 = 256;
                                i14 = 0;
                                c12 = 2;
                                this.f15298l = 512;
                            }
                        } else {
                            i13 = 3;
                            c11 = 256;
                            i14 = 0;
                            c12 = 2;
                            this.f15298l = 768;
                        }
                        i27 = i11;
                        i20 = r42;
                        c13 = c10;
                        i19 = 4;
                        i18 = i14;
                        i17 = i13;
                    } else {
                        xVar.N(i27);
                        break;
                    }
                }
                this.f15303q = (b10 & 8) >> 3;
                if ((b10 & 1) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f15299m = z10;
                if (!this.f15300n) {
                    this.f15296j = 1;
                    this.f15297k = 0;
                } else {
                    this.f15296j = i12;
                    this.f15297k = 0;
                }
                xVar.N(i11);
            }
        }
    }

    @Override
    public final void c() {
        this.f15307u = -9223372036854775807L;
        this.f15300n = false;
        this.f15296j = 0;
        this.f15297k = 0;
        this.f15298l = 256;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f15294g = (String) f0Var.e;
        f0Var.c();
        j0 F1 = qVar.F1(f0Var.f15315c, 1);
        this.h = F1;
        this.v = F1;
        if (this.f15290a) {
            f0Var.b();
            f0Var.c();
            j0 F12 = qVar.F1(f0Var.f15315c, 5);
            this.f15295i = F12;
            b2.w wVar = new b2.w();
            f0Var.c();
            wVar.f3519a = (String) f0Var.e;
            wVar.f3532q = w0.n(this.f15293f);
            wVar.f3533r = w0.n("application/id3");
            ic.a.u(wVar, F12);
            return;
        }
        this.f15295i = new c3.n();
    }

    @Override
    public final void f(int i10, long j10) {
        this.f15307u = j10;
    }

    @Override
    public final void e(boolean z10) {
    }
}
