package j4;

import a8.yb;
import b2.w0;
import c3.j0;
import e2.n0;
import java.util.Arrays;
import java.util.Collections;
public final class e implements i {
    public static final byte[] f15288x = {73, 68, 51};
    public final boolean f15289a;
    public final String d;
    public final int e;
    public final String f15292f;
    public String f15293g;
    public j0 h;
    public j0 f15294i;
    public boolean f15298m;
    public boolean f15299n;
    public int f15302q;
    public boolean f15303r;
    public int f15305t;
    public j0 v;
    public long f15307w;
    public final a4.g f15290b = new a4.g(new byte[7], 7);
    public final e2.x f15291c = new e2.x(Arrays.copyOf(f15288x, 10));
    public int f15300o = -1;
    public int f15301p = -1;
    public long f15304s = -9223372036854775807L;
    public long f15306u = -9223372036854775807L;
    public int f15295j = 0;
    public int f15296k = 0;
    public int f15297l = 256;

    public e(int i10, String str, String str2, boolean z10) {
        this.f15289a = z10;
        this.d = str;
        this.e = i10;
        this.f15292f = str2;
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
        String str = n0.f9691a;
        while (xVar.a() > 0) {
            int i16 = this.f15295j;
            char c13 = 65535;
            e2.x xVar2 = this.f15291c;
            int i17 = 3;
            a4.g gVar = this.f15290b;
            int i18 = 0;
            int i19 = 4;
            boolean z11 = true;
            int i20 = 1;
            if (i16 != 0) {
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 != 3) {
                            if (i16 == 4) {
                                int min = Math.min(xVar.a(), this.f15305t - this.f15296k);
                                this.v.d(min, xVar);
                                int i21 = this.f15296k + min;
                                this.f15296k = i21;
                                if (i21 == this.f15305t) {
                                    if (this.f15306u == -9223372036854775807L) {
                                        z11 = false;
                                    }
                                    yb.p(z11);
                                    this.v.c(this.f15306u, 1, this.f15305t, 0, null);
                                    this.f15306u += this.f15307w;
                                    this.f15295j = 0;
                                    this.f15296k = 0;
                                    this.f15297l = 256;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            if (this.f15298m) {
                                i10 = 7;
                            } else {
                                i10 = 5;
                            }
                            byte[] bArr = gVar.f260b;
                            int min2 = Math.min(xVar.a(), i10 - this.f15296k);
                            xVar.k(this.f15296k, min2, bArr);
                            int i22 = this.f15296k + min2;
                            this.f15296k = i22;
                            if (i22 == i10) {
                                gVar.m(0);
                                if (!this.f15303r) {
                                    int g7 = gVar.g(2) + 1;
                                    if (g7 != 2) {
                                        e2.a.l("AdtsReader", "Detected audio object type: " + g7 + ", but assuming AAC LC.");
                                        g7 = 2;
                                    }
                                    gVar.o(5);
                                    int g10 = gVar.g(3);
                                    int i23 = this.f15301p;
                                    byte[] bArr2 = {(byte) (((g7 << 3) & 248) | ((i23 >> 1) & 7)), (byte) (((g10 << 3) & 120) | ((i23 << 7) & 128))};
                                    c3.a n10 = c3.b.n(new a4.g(bArr2, 2), false);
                                    b2.w wVar = new b2.w();
                                    wVar.f3519a = this.f15293g;
                                    wVar.f3532q = w0.n(this.f15292f);
                                    wVar.f3533r = w0.n("audio/mp4a-latm");
                                    wVar.f3525j = n10.f5999a;
                                    wVar.J = n10.f6001c;
                                    wVar.K = n10.f6000b;
                                    wVar.f3536u = Collections.singletonList(bArr2);
                                    wVar.d = this.d;
                                    wVar.f3522f = this.e;
                                    b2.x xVar3 = new b2.x(wVar);
                                    this.f15304s = 1024000000 / xVar3.L;
                                    this.h.b(xVar3);
                                    this.f15303r = true;
                                } else {
                                    gVar.o(10);
                                }
                                gVar.o(4);
                                int g11 = gVar.g(13);
                                int i24 = g11 - 7;
                                if (this.f15298m) {
                                    i24 = g11 - 9;
                                }
                                j0 j0Var = this.h;
                                long j10 = this.f15304s;
                                this.f15295j = 4;
                                this.f15296k = 0;
                                this.v = j0Var;
                                this.f15307w = j10;
                                this.f15305t = i24;
                            }
                        }
                    } else {
                        byte[] bArr3 = xVar2.f9731a;
                        int min3 = Math.min(xVar.a(), 10 - this.f15296k);
                        xVar.k(this.f15296k, min3, bArr3);
                        int i25 = this.f15296k + min3;
                        this.f15296k = i25;
                        if (i25 == 10) {
                            this.f15294i.d(10, xVar2);
                            xVar2.N(6);
                            j0 j0Var2 = this.f15294i;
                            this.f15295j = 4;
                            this.f15296k = 10;
                            this.v = j0Var2;
                            this.f15307w = 0L;
                            this.f15305t = xVar2.z() + 10;
                        }
                    }
                } else if (xVar.a() != 0) {
                    gVar.f260b[0] = xVar.f9731a[xVar.f9732b];
                    gVar.m(2);
                    int g12 = gVar.g(4);
                    int i26 = this.f15301p;
                    if (i26 != -1 && g12 != i26) {
                        this.f15299n = false;
                        this.f15295j = 0;
                        this.f15296k = 0;
                        this.f15297l = 256;
                    } else {
                        if (!this.f15299n) {
                            this.f15299n = true;
                            this.f15300o = this.f15302q;
                            this.f15301p = g12;
                        }
                        this.f15295j = 3;
                        this.f15296k = 0;
                    }
                }
            } else {
                byte[] bArr4 = xVar.f9731a;
                int i27 = xVar.f9732b;
                int i28 = xVar.f9733c;
                while (true) {
                    if (i27 < i28) {
                        i11 = i27 + 1;
                        i12 = i17;
                        b10 = bArr4[i27];
                        int i29 = b10 & 255;
                        if (this.f15297l == 512 && (((65280 | ((((byte) i29) & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520) {
                            if (this.f15299n) {
                                break;
                            }
                            int i30 = i27 - 1;
                            xVar.N(i27);
                            byte[] bArr5 = gVar.f260b;
                            if (xVar.a() >= i20) {
                                xVar.k(i18, i20, bArr5);
                                gVar.m(i19);
                                int g13 = gVar.g(i20);
                                int i31 = this.f15300o;
                                if (i31 != -1 && g13 != i31) {
                                    c10 = 65535;
                                } else {
                                    if (this.f15301p != -1) {
                                        byte[] bArr6 = gVar.f260b;
                                        if (xVar.a() < i20) {
                                            break;
                                        }
                                        xVar.k(i18, i20, bArr6);
                                        gVar.m(2);
                                        i15 = 4;
                                        if (gVar.g(4) == this.f15301p) {
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
                                            byte[] bArr8 = xVar.f9731a;
                                            int i32 = xVar.f9733c;
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
                        int i37 = this.f15297l;
                        int i38 = i29 | i37;
                        if (i38 != 329) {
                            if (i38 != 511) {
                                if (i38 != 836) {
                                    if (i38 != 1075) {
                                        c11 = 256;
                                        if (i37 != 256) {
                                            this.f15297l = 256;
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
                                        this.f15295j = 2;
                                        this.f15296k = 3;
                                        this.f15305t = 0;
                                        xVar2.N(0);
                                        xVar.N(i11);
                                        break;
                                    }
                                } else {
                                    i13 = 3;
                                    c11 = 256;
                                    i14 = 0;
                                    c12 = 2;
                                    this.f15297l = 1024;
                                }
                            } else {
                                i13 = 3;
                                c11 = 256;
                                i14 = 0;
                                c12 = 2;
                                this.f15297l = 512;
                            }
                        } else {
                            i13 = 3;
                            c11 = 256;
                            i14 = 0;
                            c12 = 2;
                            this.f15297l = 768;
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
                this.f15302q = (b10 & 8) >> 3;
                if ((b10 & 1) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f15298m = z10;
                if (!this.f15299n) {
                    this.f15295j = 1;
                    this.f15296k = 0;
                } else {
                    this.f15295j = i12;
                    this.f15296k = 0;
                }
                xVar.N(i11);
            }
        }
    }

    @Override
    public final void c() {
        this.f15306u = -9223372036854775807L;
        this.f15299n = false;
        this.f15295j = 0;
        this.f15296k = 0;
        this.f15297l = 256;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f15293g = (String) f0Var.e;
        f0Var.c();
        j0 F1 = qVar.F1(f0Var.f15314c, 1);
        this.h = F1;
        this.v = F1;
        if (this.f15289a) {
            f0Var.b();
            f0Var.c();
            j0 F12 = qVar.F1(f0Var.f15314c, 5);
            this.f15294i = F12;
            b2.w wVar = new b2.w();
            f0Var.c();
            wVar.f3519a = (String) f0Var.e;
            wVar.f3532q = w0.n(this.f15292f);
            wVar.f3533r = w0.n("application/id3");
            ic.a.u(wVar, F12);
            return;
        }
        this.f15294i = new c3.n();
    }

    @Override
    public final void f(int i10, long j10) {
        this.f15306u = j10;
    }

    @Override
    public final void e(boolean z10) {
    }
}
