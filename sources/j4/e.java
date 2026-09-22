package j4;

import b2.r0;
import c3.h0;
import java.util.Arrays;
import java.util.Collections;
public final class e implements i {
    public static final byte[] f12657x = {73, 68, 51};
    public final boolean f12658a;
    public final String d;
    public final int e;
    public final String f12661f;
    public String f12662g;
    public h0 h;
    public h0 f12663i;
    public boolean f12667m;
    public boolean f12668n;
    public int f12671q;
    public boolean f12672r;
    public int f12674t;
    public h0 v;
    public long f12676w;
    public final a4.h f12659b = new a4.h(new byte[7], 7);
    public final e2.v f12660c = new e2.v(Arrays.copyOf(f12657x, 10));
    public int f12669o = -1;
    public int f12670p = -1;
    public long f12673s = -9223372036854775807L;
    public long f12675u = -9223372036854775807L;
    public int f12664j = 0;
    public int f12665k = 0;
    public int f12666l = 256;

    public e(int i10, String str, String str2, boolean z10) {
        this.f12658a = z10;
        this.d = str;
        this.e = i10;
        this.f12661f = str2;
    }

    @Override
    public final void a(e2.v vVar) {
        int i10;
        int i11;
        byte b10;
        boolean z10;
        int i12;
        this.h.getClass();
        String str = e2.d0.f7885a;
        while (vVar.a() > 0) {
            int i13 = this.f12664j;
            e2.v vVar2 = this.f12660c;
            a4.h hVar = this.f12659b;
            int i14 = 0;
            int i15 = 4;
            boolean z11 = true;
            int i16 = 1;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 4) {
                                int min = Math.min(vVar.a(), this.f12674t - this.f12665k);
                                this.v.d(min, vVar);
                                int i17 = this.f12665k + min;
                                this.f12665k = i17;
                                if (i17 == this.f12674t) {
                                    if (this.f12675u == -9223372036854775807L) {
                                        z11 = false;
                                    }
                                    e2.d.g(z11);
                                    this.v.c(this.f12675u, 1, this.f12674t, 0, null);
                                    this.f12675u += this.f12676w;
                                    this.f12664j = 0;
                                    this.f12665k = 0;
                                    this.f12666l = 256;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            if (this.f12667m) {
                                i10 = 7;
                            } else {
                                i10 = 5;
                            }
                            byte[] bArr = hVar.f256b;
                            int min2 = Math.min(vVar.a(), i10 - this.f12665k);
                            vVar.h(this.f12665k, min2, bArr);
                            int i18 = this.f12665k + min2;
                            this.f12665k = i18;
                            if (i18 == i10) {
                                hVar.q(0);
                                if (!this.f12672r) {
                                    int i19 = hVar.i(2) + 1;
                                    if (i19 != 2) {
                                        e2.a.n("AdtsReader", "Detected audio object type: " + i19 + ", but assuming AAC LC.");
                                        i19 = 2;
                                    }
                                    hVar.t(5);
                                    int i20 = hVar.i(3);
                                    int i21 = this.f12670p;
                                    byte[] bArr2 = {(byte) (((i19 << 3) & 248) | ((i21 >> 1) & 7)), (byte) (((i20 << 3) & 120) | ((i21 << 7) & 128))};
                                    c3.a n10 = c3.b.n(new a4.h(bArr2, 2), false);
                                    b2.r rVar = new b2.r();
                                    rVar.f3237a = this.f12662g;
                                    rVar.f3249p = r0.n(this.f12661f);
                                    rVar.f3250q = r0.n("audio/mp4a-latm");
                                    rVar.f3243j = n10.f3705a;
                                    rVar.I = n10.f3707c;
                                    rVar.J = n10.f3706b;
                                    rVar.f3253t = Collections.singletonList(bArr2);
                                    rVar.d = this.d;
                                    rVar.f3240f = this.e;
                                    b2.s sVar = new b2.s(rVar);
                                    this.f12673s = 1024000000 / sVar.K;
                                    this.h.b(sVar);
                                    this.f12672r = true;
                                } else {
                                    hVar.t(10);
                                }
                                hVar.t(4);
                                int i22 = hVar.i(13);
                                int i23 = i22 - 7;
                                if (this.f12667m) {
                                    i23 = i22 - 9;
                                }
                                h0 h0Var = this.h;
                                long j3 = this.f12673s;
                                this.f12664j = 4;
                                this.f12665k = 0;
                                this.v = h0Var;
                                this.f12676w = j3;
                                this.f12674t = i23;
                            }
                        }
                    } else {
                        byte[] bArr3 = vVar2.f7931a;
                        int min3 = Math.min(vVar.a(), 10 - this.f12665k);
                        vVar.h(this.f12665k, min3, bArr3);
                        int i24 = this.f12665k + min3;
                        this.f12665k = i24;
                        if (i24 == 10) {
                            this.f12663i.d(10, vVar2);
                            vVar2.J(6);
                            h0 h0Var2 = this.f12663i;
                            this.f12664j = 4;
                            this.f12665k = 10;
                            this.v = h0Var2;
                            this.f12676w = 0L;
                            this.f12674t = vVar2.w() + 10;
                        }
                    }
                } else if (vVar.a() != 0) {
                    hVar.f256b[0] = vVar.f7931a[vVar.f7932b];
                    hVar.q(2);
                    int i25 = hVar.i(4);
                    int i26 = this.f12670p;
                    if (i26 != -1 && i25 != i26) {
                        this.f12668n = false;
                        this.f12664j = 0;
                        this.f12665k = 0;
                        this.f12666l = 256;
                    } else {
                        if (!this.f12668n) {
                            this.f12668n = true;
                            this.f12669o = this.f12671q;
                            this.f12670p = i25;
                        }
                        this.f12664j = 3;
                        this.f12665k = 0;
                    }
                }
            } else {
                byte[] bArr4 = vVar.f7931a;
                int i27 = vVar.f7932b;
                int i28 = vVar.f7933c;
                while (true) {
                    if (i27 < i28) {
                        i11 = i27 + 1;
                        b10 = bArr4[i27];
                        int i29 = b10 & 255;
                        if (this.f12666l == 512 && ((65280 | (((byte) i29) & 255 ? 1 : 0) ? 1 : 0) & 65526)) {
                            if (!this.f12668n) {
                                int i30 = i27 - 1;
                                vVar.J(i27);
                                byte[] bArr5 = hVar.f256b;
                                if (vVar.a() >= i16) {
                                    vVar.h(i14, i16, bArr5);
                                    hVar.q(i15);
                                    int i31 = hVar.i(i16);
                                    int i32 = this.f12669o;
                                    if (i32 == -1 || i31 == i32) {
                                        if (this.f12670p != -1) {
                                            byte[] bArr6 = hVar.f256b;
                                            if (vVar.a() < i16) {
                                                break;
                                            }
                                            vVar.h(i14, i16, bArr6);
                                            hVar.q(2);
                                            i12 = 4;
                                            if (hVar.i(4) == this.f12670p) {
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
                                                byte[] bArr8 = vVar.f7931a;
                                                int i34 = vVar.f7933c;
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
                        int i39 = this.f12666l;
                        int i40 = i29 | i39;
                        if (i40 != 329) {
                            if (i40 != 511) {
                                if (i40 != 836) {
                                    if (i40 != 1075) {
                                        if (i39 != 256) {
                                            this.f12666l = 256;
                                            i14 = 0;
                                            i15 = 4;
                                            i16 = 1;
                                        }
                                    } else {
                                        this.f12664j = 2;
                                        this.f12665k = 3;
                                        this.f12674t = 0;
                                        vVar2.J(0);
                                        vVar.J(i11);
                                        break;
                                    }
                                } else {
                                    this.f12666l = 1024;
                                }
                            } else {
                                this.f12666l = 512;
                            }
                        } else {
                            this.f12666l = 768;
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
                this.f12671q = (b10 & 8) >> 3;
                if ((b10 & 1) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f12667m = z10;
                if (!this.f12668n) {
                    this.f12664j = 1;
                    this.f12665k = 0;
                } else {
                    this.f12664j = 3;
                    this.f12665k = 0;
                }
                vVar.J(i11);
            }
        }
    }

    @Override
    public final void c() {
        this.f12675u = -9223372036854775807L;
        this.f12668n = false;
        this.f12664j = 0;
        this.f12665k = 0;
        this.f12666l = 256;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f12662g = f0Var.e;
        f0Var.b();
        h0 Z1 = qVar.Z1(f0Var.d, 1);
        this.h = Z1;
        this.v = Z1;
        if (this.f12658a) {
            f0Var.a();
            f0Var.b();
            h0 Z12 = qVar.Z1(f0Var.d, 5);
            this.f12663i = Z12;
            b2.r rVar = new b2.r();
            f0Var.b();
            rVar.f3237a = f0Var.e;
            rVar.f3249p = r0.n(this.f12661f);
            rVar.f3250q = r0.n("application/id3");
            hg.c.u(rVar, Z12);
            return;
        }
        this.f12663i = new c3.n();
    }

    @Override
    public final void f(int i10, long j3) {
        this.f12675u = j3;
    }

    @Override
    public final void e(boolean z10) {
    }
}
