package j4;

import b2.v0;
import c3.k0;
import e2.l0;
import java.util.Arrays;
import java.util.Collections;
import v7.t6;
public final class e implements i {
    public static final byte[] f9435x = {73, 68, 51};
    public final boolean f9436a;
    public final String d;
    public final int e;
    public final String f9439f;
    public String f9440g;
    public k0 h;
    public k0 f9441i;
    public boolean f9445m;
    public boolean f9446n;
    public int f9449q;
    public boolean f9450r;
    public int f9452t;
    public k0 v;
    public long f9454w;
    public final a4.g f9437b = new a4.g(new byte[7], 7);
    public final e2.x f9438c = new e2.x(Arrays.copyOf(f9435x, 10));
    public int f9447o = -1;
    public int f9448p = -1;
    public long f9451s = -9223372036854775807L;
    public long f9453u = -9223372036854775807L;
    public int f9442j = 0;
    public int f9443k = 0;
    public int f9444l = 256;

    public e(int i10, String str, String str2, boolean z10) {
        this.f9436a = z10;
        this.d = str;
        this.e = i10;
        this.f9439f = str2;
    }

    @Override
    public final void c(e2.x xVar) {
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
        String str = l0.f6165a;
        while (xVar.a() > 0) {
            int i16 = this.f9442j;
            char c13 = 65535;
            e2.x xVar2 = this.f9438c;
            int i17 = 3;
            a4.g gVar = this.f9437b;
            int i18 = 0;
            int i19 = 4;
            boolean z11 = true;
            int i20 = 1;
            if (i16 != 0) {
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 != 3) {
                            if (i16 == 4) {
                                int min = Math.min(xVar.a(), this.f9452t - this.f9443k);
                                this.v.d(min, xVar);
                                int i21 = this.f9443k + min;
                                this.f9443k = i21;
                                if (i21 == this.f9452t) {
                                    if (this.f9453u == -9223372036854775807L) {
                                        z11 = false;
                                    }
                                    t6.p(z11);
                                    this.v.c(this.f9453u, 1, this.f9452t, 0, null);
                                    this.f9453u += this.f9454w;
                                    this.f9442j = 0;
                                    this.f9443k = 0;
                                    this.f9444l = 256;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            if (this.f9445m) {
                                i10 = 7;
                            } else {
                                i10 = 5;
                            }
                            int min2 = Math.min(xVar.a(), i10 - this.f9443k);
                            xVar.k(this.f9443k, min2, (byte[]) gVar.f260b);
                            int i22 = this.f9443k + min2;
                            this.f9443k = i22;
                            if (i22 == i10) {
                                gVar.d0(0);
                                if (!this.f9450r) {
                                    int i23 = gVar.i(2) + 1;
                                    if (i23 != 2) {
                                        e2.a.l("AdtsReader", "Detected audio object type: " + i23 + ", but assuming AAC LC.");
                                        i23 = 2;
                                    }
                                    gVar.f0(5);
                                    int i24 = gVar.i(3);
                                    int i25 = this.f9448p;
                                    byte[] bArr = {(byte) (((i23 << 3) & 248) | ((i25 >> 1) & 7)), (byte) (((i24 << 3) & 120) | ((i25 << 7) & 128))};
                                    c3.a n10 = c3.b.n(new a4.g(bArr, 2), false);
                                    b2.w wVar = new b2.w();
                                    wVar.f2356a = this.f9440g;
                                    wVar.f2369q = v0.n(this.f9439f);
                                    wVar.f2370r = v0.n("audio/mp4a-latm");
                                    wVar.f2362j = n10.f3592a;
                                    wVar.J = n10.f3594c;
                                    wVar.K = n10.f3593b;
                                    wVar.f2373u = Collections.singletonList(bArr);
                                    wVar.d = this.d;
                                    wVar.f2359f = this.e;
                                    b2.x xVar3 = new b2.x(wVar);
                                    this.f9451s = 1024000000 / xVar3.L;
                                    this.h.b(xVar3);
                                    this.f9450r = true;
                                } else {
                                    gVar.f0(10);
                                }
                                gVar.f0(4);
                                int i26 = gVar.i(13);
                                int i27 = i26 - 7;
                                if (this.f9445m) {
                                    i27 = i26 - 9;
                                }
                                k0 k0Var = this.h;
                                long j10 = this.f9451s;
                                this.f9442j = 4;
                                this.f9443k = 0;
                                this.v = k0Var;
                                this.f9454w = j10;
                                this.f9452t = i27;
                            }
                        }
                    } else {
                        byte[] bArr2 = xVar2.f6207a;
                        int min3 = Math.min(xVar.a(), 10 - this.f9443k);
                        xVar.k(this.f9443k, min3, bArr2);
                        int i28 = this.f9443k + min3;
                        this.f9443k = i28;
                        if (i28 == 10) {
                            this.f9441i.d(10, xVar2);
                            xVar2.N(6);
                            k0 k0Var2 = this.f9441i;
                            this.f9442j = 4;
                            this.f9443k = 10;
                            this.v = k0Var2;
                            this.f9454w = 0L;
                            this.f9452t = xVar2.z() + 10;
                        }
                    }
                } else if (xVar.a() != 0) {
                    ((byte[]) gVar.f260b)[0] = xVar.f6207a[xVar.f6208b];
                    gVar.d0(2);
                    int i29 = gVar.i(4);
                    int i30 = this.f9448p;
                    if (i30 != -1 && i29 != i30) {
                        this.f9446n = false;
                        this.f9442j = 0;
                        this.f9443k = 0;
                        this.f9444l = 256;
                    } else {
                        if (!this.f9446n) {
                            this.f9446n = true;
                            this.f9447o = this.f9449q;
                            this.f9448p = i29;
                        }
                        this.f9442j = 3;
                        this.f9443k = 0;
                    }
                }
            } else {
                byte[] bArr3 = xVar.f6207a;
                int i31 = xVar.f6208b;
                int i32 = xVar.f6209c;
                while (true) {
                    if (i31 < i32) {
                        i11 = i31 + 1;
                        i12 = i17;
                        b10 = bArr3[i31];
                        int i33 = b10 & 255;
                        if (this.f9444l == 512 && (((65280 | ((((byte) i33) & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520) {
                            if (this.f9446n) {
                                break;
                            }
                            int i34 = i31 - 1;
                            xVar.N(i31);
                            byte[] bArr4 = (byte[]) gVar.f260b;
                            if (xVar.a() >= i20) {
                                xVar.k(i18, i20, bArr4);
                                gVar.d0(i19);
                                int i35 = gVar.i(i20);
                                int i36 = this.f9447o;
                                if (i36 != -1 && i35 != i36) {
                                    c10 = 65535;
                                } else {
                                    if (this.f9448p != -1) {
                                        byte[] bArr5 = (byte[]) gVar.f260b;
                                        if (xVar.a() < i20) {
                                            break;
                                        }
                                        xVar.k(i18, i20, bArr5);
                                        gVar.d0(2);
                                        i15 = 4;
                                        if (gVar.i(4) == this.f9448p) {
                                            xVar.N(i11);
                                        }
                                    } else {
                                        i15 = 4;
                                    }
                                    byte[] bArr6 = (byte[]) gVar.f260b;
                                    if (xVar.a() >= i15) {
                                        xVar.k(i18, i15, bArr6);
                                        gVar.d0(14);
                                        int i37 = gVar.i(13);
                                        if (i37 >= 7) {
                                            byte[] bArr7 = xVar.f6207a;
                                            int i38 = xVar.f6209c;
                                            int i39 = i34 + i37;
                                            if (i39 < i38) {
                                                byte b11 = bArr7[i39];
                                                c10 = 65535;
                                                if (b11 == -1) {
                                                    int i40 = i39 + 1;
                                                    if (i40 != i38) {
                                                        byte b12 = bArr7[i40];
                                                        if ((((65280 | ((b12 & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520 && ((b12 & 8) >> 3) == i35) {
                                                            break;
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                } else if (b11 == 73) {
                                                    int i41 = i39 + 1;
                                                    if (i41 != i38) {
                                                        if (bArr7[i41] == 68) {
                                                            int i42 = i39 + 2;
                                                            if (i42 != i38) {
                                                                if (bArr7[i42] == 51) {
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
                        int i43 = this.f9444l;
                        int i44 = i33 | i43;
                        if (i44 != 329) {
                            if (i44 != 511) {
                                if (i44 != 836) {
                                    if (i44 != 1075) {
                                        c11 = 256;
                                        if (i43 != 256) {
                                            this.f9444l = 256;
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
                                        this.f9442j = 2;
                                        this.f9443k = 3;
                                        this.f9452t = 0;
                                        xVar2.N(0);
                                        xVar.N(i11);
                                        break;
                                    }
                                } else {
                                    i13 = 3;
                                    c11 = 256;
                                    i14 = 0;
                                    c12 = 2;
                                    this.f9444l = 1024;
                                }
                            } else {
                                i13 = 3;
                                c11 = 256;
                                i14 = 0;
                                c12 = 2;
                                this.f9444l = 512;
                            }
                        } else {
                            i13 = 3;
                            c11 = 256;
                            i14 = 0;
                            c12 = 2;
                            this.f9444l = 768;
                        }
                        i31 = i11;
                        i20 = r42;
                        c13 = c10;
                        i19 = 4;
                        i18 = i14;
                        i17 = i13;
                    } else {
                        xVar.N(i31);
                        break;
                    }
                }
                this.f9449q = (b10 & 8) >> 3;
                if ((b10 & 1) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f9445m = z10;
                if (!this.f9446n) {
                    this.f9442j = 1;
                    this.f9443k = 0;
                } else {
                    this.f9442j = i12;
                    this.f9443k = 0;
                }
                xVar.N(i11);
            }
        }
    }

    @Override
    public final void e() {
        this.f9453u = -9223372036854775807L;
        this.f9446n = false;
        this.f9442j = 0;
        this.f9443k = 0;
        this.f9444l = 256;
    }

    @Override
    public final void f(c3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.f9440g = (String) g0Var.e;
        g0Var.c();
        k0 I1 = qVar.I1(g0Var.f9492c, 1);
        this.h = I1;
        this.v = I1;
        if (this.f9436a) {
            g0Var.b();
            g0Var.c();
            k0 I12 = qVar.I1(g0Var.f9492c, 5);
            this.f9441i = I12;
            b2.w wVar = new b2.w();
            g0Var.c();
            wVar.f2356a = (String) g0Var.e;
            wVar.f2369q = v0.n(this.f9439f);
            wVar.f2370r = v0.n("application/id3");
            i0.a.r(wVar, I12);
            return;
        }
        this.f9441i = new c3.n();
    }

    @Override
    public final void h(int i10, long j10) {
        this.f9453u = j10;
    }

    @Override
    public final void g(boolean z10) {
    }
}
