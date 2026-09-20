package j4;

import b2.r0;
import c3.h0;
import hg.k0;
import java.util.Arrays;
import java.util.Collections;
public final class e implements i {
    public static final byte[] f12659x = {73, 68, 51};
    public final boolean f12660a;
    public final String d;
    public final int e;
    public final String f12663f;
    public String f12664g;
    public h0 h;
    public h0 f12665i;
    public boolean f12669m;
    public boolean f12670n;
    public int f12673q;
    public boolean f12674r;
    public int f12676t;
    public h0 v;
    public long f12678w;
    public final a4.h f12661b = new a4.h(new byte[7], 7);
    public final e2.v f12662c = new e2.v(Arrays.copyOf(f12659x, 10));
    public int f12671o = -1;
    public int f12672p = -1;
    public long f12675s = -9223372036854775807L;
    public long f12677u = -9223372036854775807L;
    public int f12666j = 0;
    public int f12667k = 0;
    public int f12668l = 256;

    public e(int i10, String str, String str2, boolean z10) {
        this.f12660a = z10;
        this.d = str;
        this.e = i10;
        this.f12663f = str2;
    }

    @Override
    public final void b(e2.v vVar) {
        int i10;
        int i11;
        byte b10;
        boolean z10;
        int i12;
        this.h.getClass();
        String str = e2.d0.f7888a;
        while (vVar.a() > 0) {
            int i13 = this.f12666j;
            e2.v vVar2 = this.f12662c;
            a4.h hVar = this.f12661b;
            int i14 = 0;
            int i15 = 4;
            boolean z11 = true;
            int i16 = 1;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 4) {
                                int min = Math.min(vVar.a(), this.f12676t - this.f12667k);
                                this.v.d(min, vVar);
                                int i17 = this.f12667k + min;
                                this.f12667k = i17;
                                if (i17 == this.f12676t) {
                                    if (this.f12677u == -9223372036854775807L) {
                                        z11 = false;
                                    }
                                    e2.d.g(z11);
                                    this.v.c(this.f12677u, 1, this.f12676t, 0, null);
                                    this.f12677u += this.f12678w;
                                    this.f12666j = 0;
                                    this.f12667k = 0;
                                    this.f12668l = 256;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            if (this.f12669m) {
                                i10 = 7;
                            } else {
                                i10 = 5;
                            }
                            byte[] bArr = hVar.f256b;
                            int min2 = Math.min(vVar.a(), i10 - this.f12667k);
                            vVar.h(this.f12667k, min2, bArr);
                            int i18 = this.f12667k + min2;
                            this.f12667k = i18;
                            if (i18 == i10) {
                                hVar.q(0);
                                if (!this.f12674r) {
                                    int i19 = hVar.i(2) + 1;
                                    if (i19 != 2) {
                                        e2.a.n("AdtsReader", "Detected audio object type: " + i19 + ", but assuming AAC LC.");
                                        i19 = 2;
                                    }
                                    hVar.t(5);
                                    int i20 = hVar.i(3);
                                    int i21 = this.f12672p;
                                    byte[] bArr2 = {(byte) (((i19 << 3) & 248) | ((i21 >> 1) & 7)), (byte) (((i20 << 3) & 120) | ((i21 << 7) & 128))};
                                    c3.a n10 = c3.b.n(new a4.h(bArr2, 2), false);
                                    b2.r rVar = new b2.r();
                                    rVar.f3240a = this.f12664g;
                                    rVar.f3252p = r0.n(this.f12663f);
                                    rVar.f3253q = r0.n("audio/mp4a-latm");
                                    rVar.f3246j = n10.f3708a;
                                    rVar.I = n10.f3710c;
                                    rVar.J = n10.f3709b;
                                    rVar.f3256t = Collections.singletonList(bArr2);
                                    rVar.d = this.d;
                                    rVar.f3243f = this.e;
                                    b2.s sVar = new b2.s(rVar);
                                    this.f12675s = 1024000000 / sVar.K;
                                    this.h.b(sVar);
                                    this.f12674r = true;
                                } else {
                                    hVar.t(10);
                                }
                                hVar.t(4);
                                int i22 = hVar.i(13);
                                int i23 = i22 - 7;
                                if (this.f12669m) {
                                    i23 = i22 - 9;
                                }
                                h0 h0Var = this.h;
                                long j3 = this.f12675s;
                                this.f12666j = 4;
                                this.f12667k = 0;
                                this.v = h0Var;
                                this.f12678w = j3;
                                this.f12676t = i23;
                            }
                        }
                    } else {
                        byte[] bArr3 = vVar2.f7934a;
                        int min3 = Math.min(vVar.a(), 10 - this.f12667k);
                        vVar.h(this.f12667k, min3, bArr3);
                        int i24 = this.f12667k + min3;
                        this.f12667k = i24;
                        if (i24 == 10) {
                            this.f12665i.d(10, vVar2);
                            vVar2.J(6);
                            h0 h0Var2 = this.f12665i;
                            this.f12666j = 4;
                            this.f12667k = 10;
                            this.v = h0Var2;
                            this.f12678w = 0L;
                            this.f12676t = vVar2.w() + 10;
                        }
                    }
                } else if (vVar.a() != 0) {
                    hVar.f256b[0] = vVar.f7934a[vVar.f7935b];
                    hVar.q(2);
                    int i25 = hVar.i(4);
                    int i26 = this.f12672p;
                    if (i26 != -1 && i25 != i26) {
                        this.f12670n = false;
                        this.f12666j = 0;
                        this.f12667k = 0;
                        this.f12668l = 256;
                    } else {
                        if (!this.f12670n) {
                            this.f12670n = true;
                            this.f12671o = this.f12673q;
                            this.f12672p = i25;
                        }
                        this.f12666j = 3;
                        this.f12667k = 0;
                    }
                }
            } else {
                byte[] bArr4 = vVar.f7934a;
                int i27 = vVar.f7935b;
                int i28 = vVar.f7936c;
                while (true) {
                    if (i27 < i28) {
                        i11 = i27 + 1;
                        b10 = bArr4[i27];
                        int i29 = b10 & 255;
                        if (this.f12668l == 512 && ((65280 | (((byte) i29) & 255 ? 1 : 0) ? 1 : 0) & 65526)) {
                            if (!this.f12670n) {
                                int i30 = i27 - 1;
                                vVar.J(i27);
                                byte[] bArr5 = hVar.f256b;
                                if (vVar.a() >= i16) {
                                    vVar.h(i14, i16, bArr5);
                                    hVar.q(i15);
                                    int i31 = hVar.i(i16);
                                    int i32 = this.f12671o;
                                    if (i32 == -1 || i31 == i32) {
                                        if (this.f12672p != -1) {
                                            byte[] bArr6 = hVar.f256b;
                                            if (vVar.a() < i16) {
                                                break;
                                            }
                                            vVar.h(i14, i16, bArr6);
                                            hVar.q(2);
                                            i12 = 4;
                                            if (hVar.i(4) == this.f12672p) {
                                                vVar.J(i11);
                                            }
                                        } else {
                                            i12 = 4;
                                        }
                                        byte[] bArr7 = hVar.f256b;
                                        if (vVar.a() >= i12) {
                                            vVar.h(i14, i12, bArr7);
                                            hVar.q(14);
                                            int i33 = hVar.i(13);
                                            if (i33 >= 7) {
                                                byte[] bArr8 = vVar.f7934a;
                                                int i34 = vVar.f7936c;
                                                int i35 = i30 + i33;
                                                if (i35 >= i34) {
                                                    break;
                                                }
                                                byte b11 = bArr8[i35];
                                                if (b11 == -1) {
                                                    int i36 = i35 + 1;
                                                    if (i36 != i34) {
                                                        byte b12 = bArr8[i36];
                                                        if (((65280 | (b12 & 255 ? 1 : 0) ? 1 : 0) & 65526) && ((b12 & 8) >> 3) == i31) {
                                                            break;
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                } else if (b11 == 73) {
                                                    int i37 = i35 + 1;
                                                    if (i37 != i34) {
                                                        if (bArr8[i37] == 68) {
                                                            int i38 = i35 + 2;
                                                            if (i38 != i34) {
                                                                if (bArr8[i38] == 51) {
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
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                        int i39 = this.f12668l;
                        int i40 = i29 | i39;
                        if (i40 != 329) {
                            if (i40 != 511) {
                                if (i40 != 836) {
                                    if (i40 != 1075) {
                                        if (i39 != 256) {
                                            this.f12668l = 256;
                                            i14 = 0;
                                            i15 = 4;
                                            i16 = 1;
                                        }
                                    } else {
                                        this.f12666j = 2;
                                        this.f12667k = 3;
                                        this.f12676t = 0;
                                        vVar2.J(0);
                                        vVar.J(i11);
                                        break;
                                    }
                                } else {
                                    this.f12668l = 1024;
                                }
                            } else {
                                this.f12668l = 512;
                            }
                        } else {
                            this.f12668l = 768;
                        }
                        i27 = i11;
                        i14 = 0;
                        i15 = 4;
                        i16 = 1;
                    } else {
                        vVar.J(i27);
                        break;
                    }
                }
                this.f12673q = (b10 & 8) >> 3;
                if ((b10 & 1) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f12669m = z10;
                if (!this.f12670n) {
                    this.f12666j = 1;
                    this.f12667k = 0;
                } else {
                    this.f12666j = 3;
                    this.f12667k = 0;
                }
                vVar.J(i11);
            }
        }
    }

    @Override
    public final void d() {
        this.f12677u = -9223372036854775807L;
        this.f12670n = false;
        this.f12666j = 0;
        this.f12667k = 0;
        this.f12668l = 256;
    }

    @Override
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f12664g = f0Var.e;
        f0Var.b();
        h0 Z1 = qVar.Z1(f0Var.d, 1);
        this.h = Z1;
        this.v = Z1;
        if (this.f12660a) {
            f0Var.a();
            f0Var.b();
            h0 Z12 = qVar.Z1(f0Var.d, 5);
            this.f12665i = Z12;
            b2.r rVar = new b2.r();
            f0Var.b();
            rVar.f3240a = f0Var.e;
            rVar.f3252p = r0.n(this.f12663f);
            rVar.f3253q = r0.n("application/id3");
            k0.s(rVar, Z12);
            return;
        }
        this.f12665i = new c3.n();
    }

    @Override
    public final void g(int i10, long j3) {
        this.f12677u = j3;
    }

    @Override
    public final void f(boolean z10) {
    }
}
