package j4;

import b2.r0;
import c3.h0;
import java.util.Arrays;
import java.util.Collections;
public final class e implements i {
    public static final byte[] f13781x = {73, 68, 51};
    public final boolean f13782a;
    public final String d;
    public final int f13785e;
    public final String f13786f;
    public String f13787g;
    public h0 h;
    public h0 f13788i;
    public boolean f13792m;
    public boolean f13793n;
    public int f13796q;
    public boolean f13797r;
    public int f13799t;
    public h0 v;
    public long f13801w;
    public final a4.g f13783b = new a4.g(new byte[7], 7);
    public final e2.v f13784c = new e2.v(Arrays.copyOf(f13781x, 10));
    public int f13794o = -1;
    public int f13795p = -1;
    public long f13798s = -9223372036854775807L;
    public long f13800u = -9223372036854775807L;
    public int f13789j = 0;
    public int f13790k = 0;
    public int f13791l = 256;

    public e(int i10, String str, String str2, boolean z10) {
        this.f13782a = z10;
        this.d = str;
        this.f13785e = i10;
        this.f13786f = str2;
    }

    @Override
    public final void a(e2.v vVar) {
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
        String str = e2.d0.f8532a;
        while (vVar.a() > 0) {
            int i16 = this.f13789j;
            char c13 = 65535;
            e2.v vVar2 = this.f13784c;
            int i17 = 3;
            a4.g gVar = this.f13783b;
            int i18 = 0;
            int i19 = 4;
            boolean z11 = true;
            int i20 = 1;
            if (i16 != 0) {
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 != 3) {
                            if (i16 == 4) {
                                int min = Math.min(vVar.a(), this.f13799t - this.f13790k);
                                this.v.d(min, vVar);
                                int i21 = this.f13790k + min;
                                this.f13790k = i21;
                                if (i21 == this.f13799t) {
                                    if (this.f13800u == -9223372036854775807L) {
                                        z11 = false;
                                    }
                                    e2.d.g(z11);
                                    this.v.c(this.f13800u, 1, this.f13799t, 0, null);
                                    this.f13800u += this.f13801w;
                                    this.f13789j = 0;
                                    this.f13790k = 0;
                                    this.f13791l = 256;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            if (this.f13792m) {
                                i10 = 7;
                            } else {
                                i10 = 5;
                            }
                            byte[] bArr = gVar.f276b;
                            int min2 = Math.min(vVar.a(), i10 - this.f13790k);
                            vVar.h(this.f13790k, min2, bArr);
                            int i22 = this.f13790k + min2;
                            this.f13790k = i22;
                            if (i22 == i10) {
                                gVar.q(0);
                                if (!this.f13797r) {
                                    int i23 = gVar.i(2) + 1;
                                    if (i23 != 2) {
                                        e2.a.n("AdtsReader", "Detected audio object type: " + i23 + ", but assuming AAC LC.");
                                        i23 = 2;
                                    }
                                    gVar.t(5);
                                    int i24 = gVar.i(3);
                                    int i25 = this.f13795p;
                                    byte[] bArr2 = {(byte) (((i23 << 3) & 248) | ((i25 >> 1) & 7)), (byte) (((i24 << 3) & 120) | ((i25 << 7) & 128))};
                                    c3.a n10 = c3.b.n(new a4.g(bArr2, 2), false);
                                    b2.r rVar = new b2.r();
                                    rVar.f3571a = this.f13787g;
                                    rVar.f3584p = r0.n(this.f13786f);
                                    rVar.f3585q = r0.n("audio/mp4a-latm");
                                    rVar.f3578j = n10.f4050a;
                                    rVar.I = n10.f4052c;
                                    rVar.J = n10.f4051b;
                                    rVar.f3588t = Collections.singletonList(bArr2);
                                    rVar.d = this.d;
                                    rVar.f3575f = this.f13785e;
                                    b2.s sVar = new b2.s(rVar);
                                    this.f13798s = 1024000000 / sVar.K;
                                    this.h.b(sVar);
                                    this.f13797r = true;
                                } else {
                                    gVar.t(10);
                                }
                                gVar.t(4);
                                int i26 = gVar.i(13);
                                int i27 = i26 - 7;
                                if (this.f13792m) {
                                    i27 = i26 - 9;
                                }
                                h0 h0Var = this.h;
                                long j3 = this.f13798s;
                                this.f13789j = 4;
                                this.f13790k = 0;
                                this.v = h0Var;
                                this.f13801w = j3;
                                this.f13799t = i27;
                            }
                        }
                    } else {
                        byte[] bArr3 = vVar2.f8584a;
                        int min3 = Math.min(vVar.a(), 10 - this.f13790k);
                        vVar.h(this.f13790k, min3, bArr3);
                        int i28 = this.f13790k + min3;
                        this.f13790k = i28;
                        if (i28 == 10) {
                            this.f13788i.d(10, vVar2);
                            vVar2.J(6);
                            h0 h0Var2 = this.f13788i;
                            this.f13789j = 4;
                            this.f13790k = 10;
                            this.v = h0Var2;
                            this.f13801w = 0L;
                            this.f13799t = vVar2.w() + 10;
                        }
                    }
                } else if (vVar.a() != 0) {
                    gVar.f276b[0] = vVar.f8584a[vVar.f8585b];
                    gVar.q(2);
                    int i29 = gVar.i(4);
                    int i30 = this.f13795p;
                    if (i30 != -1 && i29 != i30) {
                        this.f13793n = false;
                        this.f13789j = 0;
                        this.f13790k = 0;
                        this.f13791l = 256;
                    } else {
                        if (!this.f13793n) {
                            this.f13793n = true;
                            this.f13794o = this.f13796q;
                            this.f13795p = i29;
                        }
                        this.f13789j = 3;
                        this.f13790k = 0;
                    }
                }
            } else {
                byte[] bArr4 = vVar.f8584a;
                int i31 = vVar.f8585b;
                int i32 = vVar.f8586c;
                while (true) {
                    if (i31 < i32) {
                        i11 = i31 + 1;
                        i12 = i17;
                        b10 = bArr4[i31];
                        int i33 = b10 & 255;
                        if (this.f13791l == 512 && (((65280 | ((((byte) i33) & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520) {
                            if (this.f13793n) {
                                break;
                            }
                            int i34 = i31 - 1;
                            vVar.J(i31);
                            byte[] bArr5 = gVar.f276b;
                            if (vVar.a() >= i20) {
                                vVar.h(i18, i20, bArr5);
                                gVar.q(i19);
                                int i35 = gVar.i(i20);
                                int i36 = this.f13794o;
                                if (i36 != -1 && i35 != i36) {
                                    c10 = 65535;
                                } else {
                                    if (this.f13795p != -1) {
                                        byte[] bArr6 = gVar.f276b;
                                        if (vVar.a() < i20) {
                                            break;
                                        }
                                        vVar.h(i18, i20, bArr6);
                                        gVar.q(2);
                                        i15 = 4;
                                        if (gVar.i(4) == this.f13795p) {
                                            vVar.J(i11);
                                        }
                                    } else {
                                        i15 = 4;
                                    }
                                    byte[] bArr7 = gVar.f276b;
                                    if (vVar.a() >= i15) {
                                        vVar.h(i18, i15, bArr7);
                                        gVar.q(14);
                                        int i37 = gVar.i(13);
                                        if (i37 >= 7) {
                                            byte[] bArr8 = vVar.f8584a;
                                            int i38 = vVar.f8586c;
                                            int i39 = i34 + i37;
                                            if (i39 < i38) {
                                                byte b11 = bArr8[i39];
                                                c10 = 65535;
                                                if (b11 == -1) {
                                                    int i40 = i39 + 1;
                                                    if (i40 != i38) {
                                                        byte b12 = bArr8[i40];
                                                        if ((((65280 | ((b12 & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520 && ((b12 & 8) >> 3) == i35) {
                                                            break;
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                } else if (b11 == 73) {
                                                    int i41 = i39 + 1;
                                                    if (i41 != i38) {
                                                        if (bArr8[i41] == 68) {
                                                            int i42 = i39 + 2;
                                                            if (i42 != i38) {
                                                                if (bArr8[i42] == 51) {
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
                        int i43 = this.f13791l;
                        int i44 = i33 | i43;
                        if (i44 != 329) {
                            if (i44 != 511) {
                                if (i44 != 836) {
                                    if (i44 != 1075) {
                                        c11 = 256;
                                        if (i43 != 256) {
                                            this.f13791l = 256;
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
                                        this.f13789j = 2;
                                        this.f13790k = 3;
                                        this.f13799t = 0;
                                        vVar2.J(0);
                                        vVar.J(i11);
                                        break;
                                    }
                                } else {
                                    i13 = 3;
                                    c11 = 256;
                                    i14 = 0;
                                    c12 = 2;
                                    this.f13791l = 1024;
                                }
                            } else {
                                i13 = 3;
                                c11 = 256;
                                i14 = 0;
                                c12 = 2;
                                this.f13791l = 512;
                            }
                        } else {
                            i13 = 3;
                            c11 = 256;
                            i14 = 0;
                            c12 = 2;
                            this.f13791l = 768;
                        }
                        i31 = i11;
                        i20 = r42;
                        c13 = c10;
                        i19 = 4;
                        i18 = i14;
                        i17 = i13;
                    } else {
                        vVar.J(i31);
                        break;
                    }
                }
                this.f13796q = (b10 & 8) >> 3;
                if ((b10 & 1) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f13792m = z10;
                if (!this.f13793n) {
                    this.f13789j = 1;
                    this.f13790k = 0;
                } else {
                    this.f13789j = i12;
                    this.f13790k = 0;
                }
                vVar.J(i11);
            }
        }
    }

    @Override
    public final void c() {
        this.f13800u = -9223372036854775807L;
        this.f13793n = false;
        this.f13789j = 0;
        this.f13790k = 0;
        this.f13791l = 256;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f13787g = (String) f0Var.f13809e;
        f0Var.c();
        h0 f22 = qVar.f2(f0Var.f13808c, 1);
        this.h = f22;
        this.v = f22;
        if (this.f13782a) {
            f0Var.b();
            f0Var.c();
            h0 f23 = qVar.f2(f0Var.f13808c, 5);
            this.f13788i = f23;
            b2.r rVar = new b2.r();
            f0Var.c();
            rVar.f3571a = (String) f0Var.f13809e;
            rVar.f3584p = r0.n(this.f13786f);
            rVar.f3585q = r0.n("application/id3");
            hg.c.s(rVar, f23);
            return;
        }
        this.f13788i = new c3.n();
    }

    @Override
    public final void f(int i10, long j3) {
        this.f13800u = j3;
    }

    @Override
    public final void e(boolean z10) {
    }
}
