package j4;

import b2.v0;
import c3.j0;
import e2.m0;
import java.util.Arrays;
import java.util.Collections;
import v7.u6;
public final class e implements i {
    public static final byte[] f14031x = {73, 68, 51};
    public final boolean f14032a;
    public final String d;
    public final int e;
    public final String f14035f;
    public String f14036g;
    public j0 h;
    public j0 f14037i;
    public boolean f14041m;
    public boolean f14042n;
    public int f14045q;
    public boolean f14046r;
    public int f14048t;
    public j0 v;
    public long f14050w;
    public final a4.g f14033b = new a4.g(new byte[7], 7);
    public final e2.x f14034c = new e2.x(Arrays.copyOf(f14031x, 10));
    public int f14043o = -1;
    public int f14044p = -1;
    public long f14047s = -9223372036854775807L;
    public long f14049u = -9223372036854775807L;
    public int f14038j = 0;
    public int f14039k = 0;
    public int f14040l = 256;

    public e(int i10, String str, String str2, boolean z10) {
        this.f14032a = z10;
        this.d = str;
        this.e = i10;
        this.f14035f = str2;
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
        String str = m0.f8252a;
        while (xVar.a() > 0) {
            int i16 = this.f14038j;
            char c13 = 65535;
            e2.x xVar2 = this.f14034c;
            int i17 = 3;
            a4.g gVar = this.f14033b;
            int i18 = 0;
            int i19 = 4;
            boolean z11 = true;
            int i20 = 1;
            if (i16 != 0) {
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 != 3) {
                            if (i16 == 4) {
                                int min = Math.min(xVar.a(), this.f14048t - this.f14039k);
                                this.v.d(min, xVar);
                                int i21 = this.f14039k + min;
                                this.f14039k = i21;
                                if (i21 == this.f14048t) {
                                    if (this.f14049u == -9223372036854775807L) {
                                        z11 = false;
                                    }
                                    u6.p(z11);
                                    this.v.c(this.f14049u, 1, this.f14048t, 0, null);
                                    this.f14049u += this.f14050w;
                                    this.f14038j = 0;
                                    this.f14039k = 0;
                                    this.f14040l = 256;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            if (this.f14041m) {
                                i10 = 7;
                            } else {
                                i10 = 5;
                            }
                            byte[] bArr = gVar.f260b;
                            int min2 = Math.min(xVar.a(), i10 - this.f14039k);
                            xVar.k(this.f14039k, min2, bArr);
                            int i22 = this.f14039k + min2;
                            this.f14039k = i22;
                            if (i22 == i10) {
                                gVar.m(0);
                                if (!this.f14046r) {
                                    int g10 = gVar.g(2) + 1;
                                    if (g10 != 2) {
                                        e2.a.l("AdtsReader", "Detected audio object type: " + g10 + ", but assuming AAC LC.");
                                        g10 = 2;
                                    }
                                    gVar.o(5);
                                    int g11 = gVar.g(3);
                                    int i23 = this.f14044p;
                                    byte[] bArr2 = {(byte) (((g10 << 3) & 248) | ((i23 >> 1) & 7)), (byte) (((g11 << 3) & 120) | ((i23 << 7) & 128))};
                                    c3.a n10 = c3.b.n(new a4.g(bArr2, 2), false);
                                    b2.v vVar = new b2.v();
                                    vVar.f4061a = this.f14036g;
                                    vVar.f4074q = v0.n(this.f14035f);
                                    vVar.f4075r = v0.n("audio/mp4a-latm");
                                    vVar.f4067j = n10.f4558a;
                                    vVar.J = n10.f4560c;
                                    vVar.K = n10.f4559b;
                                    vVar.f4078u = Collections.singletonList(bArr2);
                                    vVar.d = this.d;
                                    vVar.f4064f = this.e;
                                    b2.w wVar = new b2.w(vVar);
                                    this.f14047s = 1024000000 / wVar.L;
                                    this.h.b(wVar);
                                    this.f14046r = true;
                                } else {
                                    gVar.o(10);
                                }
                                gVar.o(4);
                                int g12 = gVar.g(13);
                                int i24 = g12 - 7;
                                if (this.f14041m) {
                                    i24 = g12 - 9;
                                }
                                j0 j0Var = this.h;
                                long j10 = this.f14047s;
                                this.f14038j = 4;
                                this.f14039k = 0;
                                this.v = j0Var;
                                this.f14050w = j10;
                                this.f14048t = i24;
                            }
                        }
                    } else {
                        byte[] bArr3 = xVar2.f8291a;
                        int min3 = Math.min(xVar.a(), 10 - this.f14039k);
                        xVar.k(this.f14039k, min3, bArr3);
                        int i25 = this.f14039k + min3;
                        this.f14039k = i25;
                        if (i25 == 10) {
                            this.f14037i.d(10, xVar2);
                            xVar2.N(6);
                            j0 j0Var2 = this.f14037i;
                            this.f14038j = 4;
                            this.f14039k = 10;
                            this.v = j0Var2;
                            this.f14050w = 0L;
                            this.f14048t = xVar2.z() + 10;
                        }
                    }
                } else if (xVar.a() != 0) {
                    gVar.f260b[0] = xVar.f8291a[xVar.f8292b];
                    gVar.m(2);
                    int g13 = gVar.g(4);
                    int i26 = this.f14044p;
                    if (i26 != -1 && g13 != i26) {
                        this.f14042n = false;
                        this.f14038j = 0;
                        this.f14039k = 0;
                        this.f14040l = 256;
                    } else {
                        if (!this.f14042n) {
                            this.f14042n = true;
                            this.f14043o = this.f14045q;
                            this.f14044p = g13;
                        }
                        this.f14038j = 3;
                        this.f14039k = 0;
                    }
                }
            } else {
                byte[] bArr4 = xVar.f8291a;
                int i27 = xVar.f8292b;
                int i28 = xVar.f8293c;
                while (true) {
                    if (i27 < i28) {
                        i11 = i27 + 1;
                        i12 = i17;
                        b10 = bArr4[i27];
                        int i29 = b10 & 255;
                        if (this.f14040l == 512 && (((65280 | ((((byte) i29) & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520) {
                            if (this.f14042n) {
                                break;
                            }
                            int i30 = i27 - 1;
                            xVar.N(i27);
                            byte[] bArr5 = gVar.f260b;
                            if (xVar.a() >= i20) {
                                xVar.k(i18, i20, bArr5);
                                gVar.m(i19);
                                int g14 = gVar.g(i20);
                                int i31 = this.f14043o;
                                if (i31 != -1 && g14 != i31) {
                                    c10 = 65535;
                                } else {
                                    if (this.f14044p != -1) {
                                        byte[] bArr6 = gVar.f260b;
                                        if (xVar.a() < i20) {
                                            break;
                                        }
                                        xVar.k(i18, i20, bArr6);
                                        gVar.m(2);
                                        i15 = 4;
                                        if (gVar.g(4) == this.f14044p) {
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
                                            byte[] bArr8 = xVar.f8291a;
                                            int i32 = xVar.f8293c;
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
                        int i37 = this.f14040l;
                        int i38 = i29 | i37;
                        if (i38 != 329) {
                            if (i38 != 511) {
                                if (i38 != 836) {
                                    if (i38 != 1075) {
                                        c11 = 256;
                                        if (i37 != 256) {
                                            this.f14040l = 256;
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
                                        this.f14038j = 2;
                                        this.f14039k = 3;
                                        this.f14048t = 0;
                                        xVar2.N(0);
                                        xVar.N(i11);
                                        break;
                                    }
                                } else {
                                    i13 = 3;
                                    c11 = 256;
                                    i14 = 0;
                                    c12 = 2;
                                    this.f14040l = 1024;
                                }
                            } else {
                                i13 = 3;
                                c11 = 256;
                                i14 = 0;
                                c12 = 2;
                                this.f14040l = 512;
                            }
                        } else {
                            i13 = 3;
                            c11 = 256;
                            i14 = 0;
                            c12 = 2;
                            this.f14040l = 768;
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
                this.f14045q = (b10 & 8) >> 3;
                if ((b10 & 1) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f14041m = z10;
                if (!this.f14042n) {
                    this.f14038j = 1;
                    this.f14039k = 0;
                } else {
                    this.f14038j = i12;
                    this.f14039k = 0;
                }
                xVar.N(i11);
            }
        }
    }

    @Override
    public final void c() {
        this.f14049u = -9223372036854775807L;
        this.f14042n = false;
        this.f14038j = 0;
        this.f14039k = 0;
        this.f14040l = 256;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f14036g = (String) f0Var.e;
        f0Var.c();
        j0 j02 = qVar.j0(f0Var.f14057c, 1);
        this.h = j02;
        this.v = j02;
        if (this.f14032a) {
            f0Var.b();
            f0Var.c();
            j0 j03 = qVar.j0(f0Var.f14057c, 5);
            this.f14037i = j03;
            b2.v vVar = new b2.v();
            f0Var.c();
            vVar.f4061a = (String) f0Var.e;
            vVar.f4074q = v0.n(this.f14035f);
            vVar.f4075r = v0.n("application/id3");
            i2.e.u(vVar, j03);
            return;
        }
        this.f14037i = new c3.n();
    }

    @Override
    public final void f(int i10, long j10) {
        this.f14049u = j10;
    }

    @Override
    public final void e(boolean z10) {
    }
}
