package j4;

import b2.v0;
import c3.l0;
import e2.m0;
import i2.o1;
import java.util.Arrays;
import java.util.Collections;
import v7.u6;
public final class e implements i {
    public static final byte[] f14076x = {73, 68, 51};
    public final boolean f14077a;
    public final String d;
    public final int e;
    public final String f14080f;
    public String f14081g;
    public l0 h;
    public l0 f14082i;
    public boolean f14086m;
    public boolean f14087n;
    public int f14090q;
    public boolean f14091r;
    public int f14093t;
    public l0 v;
    public long f14095w;
    public final a4.g f14078b = new a4.g(new byte[7], 7);
    public final e2.x f14079c = new e2.x(Arrays.copyOf(f14076x, 10));
    public int f14088o = -1;
    public int f14089p = -1;
    public long f14092s = -9223372036854775807L;
    public long f14094u = -9223372036854775807L;
    public int f14083j = 0;
    public int f14084k = 0;
    public int f14085l = 256;

    public e(int i10, String str, String str2, boolean z10) {
        this.f14077a = z10;
        this.d = str;
        this.e = i10;
        this.f14080f = str2;
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
        String str = m0.f8259a;
        while (xVar.a() > 0) {
            int i16 = this.f14083j;
            char c13 = 65535;
            e2.x xVar2 = this.f14079c;
            int i17 = 3;
            a4.g gVar = this.f14078b;
            int i18 = 0;
            int i19 = 4;
            boolean z11 = true;
            int i20 = 1;
            if (i16 != 0) {
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 != 3) {
                            if (i16 == 4) {
                                int min = Math.min(xVar.a(), this.f14093t - this.f14084k);
                                this.v.d(min, xVar);
                                int i21 = this.f14084k + min;
                                this.f14084k = i21;
                                if (i21 == this.f14093t) {
                                    if (this.f14094u == -9223372036854775807L) {
                                        z11 = false;
                                    }
                                    u6.p(z11);
                                    this.v.c(this.f14094u, 1, this.f14093t, 0, null);
                                    this.f14094u += this.f14095w;
                                    this.f14083j = 0;
                                    this.f14084k = 0;
                                    this.f14085l = 256;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            if (this.f14086m) {
                                i10 = 7;
                            } else {
                                i10 = 5;
                            }
                            byte[] bArr = gVar.f260b;
                            int min2 = Math.min(xVar.a(), i10 - this.f14084k);
                            xVar.k(this.f14084k, min2, bArr);
                            int i22 = this.f14084k + min2;
                            this.f14084k = i22;
                            if (i22 == i10) {
                                gVar.m(0);
                                if (!this.f14091r) {
                                    int g10 = gVar.g(2) + 1;
                                    if (g10 != 2) {
                                        e2.a.l("AdtsReader", "Detected audio object type: " + g10 + ", but assuming AAC LC.");
                                        g10 = 2;
                                    }
                                    gVar.o(5);
                                    int g11 = gVar.g(3);
                                    int i23 = this.f14089p;
                                    byte[] bArr2 = {(byte) (((g10 << 3) & 248) | ((i23 >> 1) & 7)), (byte) (((g11 << 3) & 120) | ((i23 << 7) & 128))};
                                    c3.a n10 = c3.b.n(new a4.g(bArr2, 2), false);
                                    b2.v vVar = new b2.v();
                                    vVar.f4068a = this.f14081g;
                                    vVar.f4081q = v0.n(this.f14080f);
                                    vVar.f4082r = v0.n("audio/mp4a-latm");
                                    vVar.f4074j = n10.f4562a;
                                    vVar.J = n10.f4564c;
                                    vVar.K = n10.f4563b;
                                    vVar.f4085u = Collections.singletonList(bArr2);
                                    vVar.d = this.d;
                                    vVar.f4071f = this.e;
                                    b2.w wVar = new b2.w(vVar);
                                    this.f14092s = 1024000000 / wVar.L;
                                    this.h.b(wVar);
                                    this.f14091r = true;
                                } else {
                                    gVar.o(10);
                                }
                                gVar.o(4);
                                int g12 = gVar.g(13);
                                int i24 = g12 - 7;
                                if (this.f14086m) {
                                    i24 = g12 - 9;
                                }
                                l0 l0Var = this.h;
                                long j10 = this.f14092s;
                                this.f14083j = 4;
                                this.f14084k = 0;
                                this.v = l0Var;
                                this.f14095w = j10;
                                this.f14093t = i24;
                            }
                        }
                    } else {
                        byte[] bArr3 = xVar2.f8298a;
                        int min3 = Math.min(xVar.a(), 10 - this.f14084k);
                        xVar.k(this.f14084k, min3, bArr3);
                        int i25 = this.f14084k + min3;
                        this.f14084k = i25;
                        if (i25 == 10) {
                            this.f14082i.d(10, xVar2);
                            xVar2.N(6);
                            l0 l0Var2 = this.f14082i;
                            this.f14083j = 4;
                            this.f14084k = 10;
                            this.v = l0Var2;
                            this.f14095w = 0L;
                            this.f14093t = xVar2.z() + 10;
                        }
                    }
                } else if (xVar.a() != 0) {
                    gVar.f260b[0] = xVar.f8298a[xVar.f8299b];
                    gVar.m(2);
                    int g13 = gVar.g(4);
                    int i26 = this.f14089p;
                    if (i26 != -1 && g13 != i26) {
                        this.f14087n = false;
                        this.f14083j = 0;
                        this.f14084k = 0;
                        this.f14085l = 256;
                    } else {
                        if (!this.f14087n) {
                            this.f14087n = true;
                            this.f14088o = this.f14090q;
                            this.f14089p = g13;
                        }
                        this.f14083j = 3;
                        this.f14084k = 0;
                    }
                }
            } else {
                byte[] bArr4 = xVar.f8298a;
                int i27 = xVar.f8299b;
                int i28 = xVar.f8300c;
                while (true) {
                    if (i27 < i28) {
                        i11 = i27 + 1;
                        i12 = i17;
                        b10 = bArr4[i27];
                        int i29 = b10 & 255;
                        if (this.f14085l == 512 && (((65280 | ((((byte) i29) & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520) {
                            if (this.f14087n) {
                                break;
                            }
                            int i30 = i27 - 1;
                            xVar.N(i27);
                            byte[] bArr5 = gVar.f260b;
                            if (xVar.a() >= i20) {
                                xVar.k(i18, i20, bArr5);
                                gVar.m(i19);
                                int g14 = gVar.g(i20);
                                int i31 = this.f14088o;
                                if (i31 != -1 && g14 != i31) {
                                    c10 = 65535;
                                } else {
                                    if (this.f14089p != -1) {
                                        byte[] bArr6 = gVar.f260b;
                                        if (xVar.a() < i20) {
                                            break;
                                        }
                                        xVar.k(i18, i20, bArr6);
                                        gVar.m(2);
                                        i15 = 4;
                                        if (gVar.g(4) == this.f14089p) {
                                            xVar.N(i11);
                                        }
                                    } else {
                                        i15 = 4;
                                    }
                                    byte[] bArr7 = gVar.f260b;
                                    if (xVar.a() >= i15) {
                                        xVar.k(i18, i15, bArr7);
                                        gVar.m(14);
                                        int g15 = gVar.g(13);
                                        if (g15 >= 7) {
                                            byte[] bArr8 = xVar.f8298a;
                                            int i32 = xVar.f8300c;
                                            int i33 = i30 + g15;
                                            if (i33 < i32) {
                                                byte b11 = bArr8[i33];
                                                c10 = 65535;
                                                if (b11 == -1) {
                                                    int i34 = i33 + 1;
                                                    if (i34 != i32) {
                                                        byte b12 = bArr8[i34];
                                                        if ((((65280 | ((b12 & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520 && ((b12 & 8) >> 3) == g14) {
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
                        int i37 = this.f14085l;
                        int i38 = i29 | i37;
                        if (i38 != 329) {
                            if (i38 != 511) {
                                if (i38 != 836) {
                                    if (i38 != 1075) {
                                        c11 = 256;
                                        if (i37 != 256) {
                                            this.f14085l = 256;
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
                                        this.f14083j = 2;
                                        this.f14084k = 3;
                                        this.f14093t = 0;
                                        xVar2.N(0);
                                        xVar.N(i11);
                                        break;
                                    }
                                } else {
                                    i13 = 3;
                                    c11 = 256;
                                    i14 = 0;
                                    c12 = 2;
                                    this.f14085l = 1024;
                                }
                            } else {
                                i13 = 3;
                                c11 = 256;
                                i14 = 0;
                                c12 = 2;
                                this.f14085l = 512;
                            }
                        } else {
                            i13 = 3;
                            c11 = 256;
                            i14 = 0;
                            c12 = 2;
                            this.f14085l = 768;
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
                this.f14090q = (b10 & 8) >> 3;
                if ((b10 & 1) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f14086m = z10;
                if (!this.f14087n) {
                    this.f14083j = 1;
                    this.f14084k = 0;
                } else {
                    this.f14083j = i12;
                    this.f14084k = 0;
                }
                xVar.N(i11);
            }
        }
    }

    @Override
    public final void c() {
        this.f14094u = -9223372036854775807L;
        this.f14087n = false;
        this.f14083j = 0;
        this.f14084k = 0;
        this.f14085l = 256;
    }

    @Override
    public final void d(c3.s sVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f14081g = (String) f0Var.e;
        f0Var.c();
        l0 j02 = sVar.j0(f0Var.f14102c, 1);
        this.h = j02;
        this.v = j02;
        if (this.f14077a) {
            f0Var.b();
            f0Var.c();
            l0 j03 = sVar.j0(f0Var.f14102c, 5);
            this.f14082i = j03;
            b2.v vVar = new b2.v();
            f0Var.c();
            vVar.f4068a = (String) f0Var.e;
            vVar.f4081q = v0.n(this.f14080f);
            vVar.f4082r = v0.n("application/id3");
            o1.v(vVar, j03);
            return;
        }
        this.f14082i = new c3.p();
    }

    @Override
    public final void f(int i10, long j10) {
        this.f14094u = j10;
    }

    @Override
    public final void e(boolean z10) {
    }
}
