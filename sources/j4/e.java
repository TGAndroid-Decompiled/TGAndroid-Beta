package j4;

import b2.r0;
import c3.h0;
import java.util.Arrays;
import java.util.Collections;
public final class e implements i {
    public static final byte[] f13744x = {73, 68, 51};
    public final boolean f13745a;
    public final String d;
    public final int f13748e;
    public final String f13749f;
    public String f13750g;
    public h0 h;
    public h0 f13751i;
    public boolean f13755m;
    public boolean f13756n;
    public int f13759q;
    public boolean f13760r;
    public int f13762t;
    public h0 v;
    public long f13764w;
    public final a4.h f13746b = new a4.h(new byte[7], 7);
    public final e2.v f13747c = new e2.v(Arrays.copyOf(f13744x, 10));
    public int f13757o = -1;
    public int f13758p = -1;
    public long f13761s = -9223372036854775807L;
    public long f13763u = -9223372036854775807L;
    public int f13752j = 0;
    public int f13753k = 0;
    public int f13754l = 256;

    public e(int i10, String str, String str2, boolean z10) {
        this.f13745a = z10;
        this.d = str;
        this.f13748e = i10;
        this.f13749f = str2;
    }

    @Override
    public final void a(e2.v vVar) {
        int i10;
        int i11;
        byte b10;
        boolean z10;
        int i12;
        this.h.getClass();
        String str = e2.d0.f8538a;
        while (vVar.a() > 0) {
            int i13 = this.f13752j;
            e2.v vVar2 = this.f13747c;
            a4.h hVar = this.f13746b;
            int i14 = 0;
            int i15 = 4;
            boolean z11 = true;
            int i16 = 1;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 4) {
                                int min = Math.min(vVar.a(), this.f13762t - this.f13753k);
                                this.v.d(min, vVar);
                                int i17 = this.f13753k + min;
                                this.f13753k = i17;
                                if (i17 == this.f13762t) {
                                    if (this.f13763u == -9223372036854775807L) {
                                        z11 = false;
                                    }
                                    e2.d.g(z11);
                                    this.v.c(this.f13763u, 1, this.f13762t, 0, null);
                                    this.f13763u += this.f13764w;
                                    this.f13752j = 0;
                                    this.f13753k = 0;
                                    this.f13754l = 256;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            if (this.f13755m) {
                                i10 = 7;
                            } else {
                                i10 = 5;
                            }
                            byte[] bArr = hVar.f276b;
                            int min2 = Math.min(vVar.a(), i10 - this.f13753k);
                            vVar.h(this.f13753k, min2, bArr);
                            int i18 = this.f13753k + min2;
                            this.f13753k = i18;
                            if (i18 == i10) {
                                hVar.q(0);
                                if (!this.f13760r) {
                                    int i19 = hVar.i(2) + 1;
                                    if (i19 != 2) {
                                        e2.a.n("AdtsReader", "Detected audio object type: " + i19 + ", but assuming AAC LC.");
                                        i19 = 2;
                                    }
                                    hVar.t(5);
                                    int i20 = hVar.i(3);
                                    int i21 = this.f13758p;
                                    byte[] bArr2 = {(byte) (((i19 << 3) & 248) | ((i21 >> 1) & 7)), (byte) (((i20 << 3) & 120) | ((i21 << 7) & 128))};
                                    c3.a n10 = c3.b.n(new a4.h(bArr2, 2), false);
                                    b2.r rVar = new b2.r();
                                    rVar.f3492a = this.f13750g;
                                    rVar.f3505p = r0.n(this.f13749f);
                                    rVar.f3506q = r0.n("audio/mp4a-latm");
                                    rVar.f3499j = n10.f4001a;
                                    rVar.I = n10.f4003c;
                                    rVar.J = n10.f4002b;
                                    rVar.f3509t = Collections.singletonList(bArr2);
                                    rVar.d = this.d;
                                    rVar.f3496f = this.f13748e;
                                    b2.s sVar = new b2.s(rVar);
                                    this.f13761s = 1024000000 / sVar.K;
                                    this.h.b(sVar);
                                    this.f13760r = true;
                                } else {
                                    hVar.t(10);
                                }
                                hVar.t(4);
                                int i22 = hVar.i(13);
                                int i23 = i22 - 7;
                                if (this.f13755m) {
                                    i23 = i22 - 9;
                                }
                                h0 h0Var = this.h;
                                long j3 = this.f13761s;
                                this.f13752j = 4;
                                this.f13753k = 0;
                                this.v = h0Var;
                                this.f13764w = j3;
                                this.f13762t = i23;
                            }
                        }
                    } else {
                        byte[] bArr3 = vVar2.f8590a;
                        int min3 = Math.min(vVar.a(), 10 - this.f13753k);
                        vVar.h(this.f13753k, min3, bArr3);
                        int i24 = this.f13753k + min3;
                        this.f13753k = i24;
                        if (i24 == 10) {
                            this.f13751i.d(10, vVar2);
                            vVar2.J(6);
                            h0 h0Var2 = this.f13751i;
                            this.f13752j = 4;
                            this.f13753k = 10;
                            this.v = h0Var2;
                            this.f13764w = 0L;
                            this.f13762t = vVar2.w() + 10;
                        }
                    }
                } else if (vVar.a() != 0) {
                    hVar.f276b[0] = vVar.f8590a[vVar.f8591b];
                    hVar.q(2);
                    int i25 = hVar.i(4);
                    int i26 = this.f13758p;
                    if (i26 != -1 && i25 != i26) {
                        this.f13756n = false;
                        this.f13752j = 0;
                        this.f13753k = 0;
                        this.f13754l = 256;
                    } else {
                        if (!this.f13756n) {
                            this.f13756n = true;
                            this.f13757o = this.f13759q;
                            this.f13758p = i25;
                        }
                        this.f13752j = 3;
                        this.f13753k = 0;
                    }
                }
            } else {
                byte[] bArr4 = vVar.f8590a;
                int i27 = vVar.f8591b;
                int i28 = vVar.f8592c;
                while (true) {
                    if (i27 < i28) {
                        i11 = i27 + 1;
                        b10 = bArr4[i27];
                        int i29 = b10 & 255;
                        if (this.f13754l == 512 && ((65280 | (((byte) i29) & 255 ? 1 : 0) ? 1 : 0) & 65526)) {
                            if (!this.f13756n) {
                                int i30 = i27 - 1;
                                vVar.J(i27);
                                byte[] bArr5 = hVar.f276b;
                                if (vVar.a() >= i16) {
                                    vVar.h(i14, i16, bArr5);
                                    hVar.q(i15);
                                    int i31 = hVar.i(i16);
                                    int i32 = this.f13757o;
                                    if (i32 == -1 || i31 == i32) {
                                        if (this.f13758p != -1) {
                                            byte[] bArr6 = hVar.f276b;
                                            if (vVar.a() < i16) {
                                                break;
                                            }
                                            vVar.h(i14, i16, bArr6);
                                            hVar.q(2);
                                            i12 = 4;
                                            if (hVar.i(4) == this.f13758p) {
                                                vVar.J(i11);
                                            }
                                        } else {
                                            i12 = 4;
                                        }
                                        byte[] bArr7 = hVar.f276b;
                                        if (vVar.a() >= i12) {
                                            vVar.h(i14, i12, bArr7);
                                            hVar.q(14);
                                            int i33 = hVar.i(13);
                                            if (i33 >= 7) {
                                                byte[] bArr8 = vVar.f8590a;
                                                int i34 = vVar.f8592c;
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
                        int i39 = this.f13754l;
                        int i40 = i29 | i39;
                        if (i40 != 329) {
                            if (i40 != 511) {
                                if (i40 != 836) {
                                    if (i40 != 1075) {
                                        if (i39 != 256) {
                                            this.f13754l = 256;
                                            i14 = 0;
                                            i15 = 4;
                                            i16 = 1;
                                        }
                                    } else {
                                        this.f13752j = 2;
                                        this.f13753k = 3;
                                        this.f13762t = 0;
                                        vVar2.J(0);
                                        vVar.J(i11);
                                        break;
                                    }
                                } else {
                                    this.f13754l = 1024;
                                }
                            } else {
                                this.f13754l = 512;
                            }
                        } else {
                            this.f13754l = 768;
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
                this.f13759q = (b10 & 8) >> 3;
                if ((b10 & 1) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f13755m = z10;
                if (!this.f13756n) {
                    this.f13752j = 1;
                    this.f13753k = 0;
                } else {
                    this.f13752j = 3;
                    this.f13753k = 0;
                }
                vVar.J(i11);
            }
        }
    }

    @Override
    public final void c() {
        this.f13763u = -9223372036854775807L;
        this.f13756n = false;
        this.f13752j = 0;
        this.f13753k = 0;
        this.f13754l = 256;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f13750g = f0Var.f13772e;
        f0Var.b();
        h0 Z1 = qVar.Z1(f0Var.d, 1);
        this.h = Z1;
        this.v = Z1;
        if (this.f13745a) {
            f0Var.a();
            f0Var.b();
            h0 Z12 = qVar.Z1(f0Var.d, 5);
            this.f13751i = Z12;
            b2.r rVar = new b2.r();
            f0Var.b();
            rVar.f3492a = f0Var.f13772e;
            rVar.f3505p = r0.n(this.f13749f);
            rVar.f3506q = r0.n("application/id3");
            hg.c.s(rVar, Z12);
            return;
        }
        this.f13751i = new c3.n();
    }

    @Override
    public final void f(int i10, long j3) {
        this.f13763u = j3;
    }

    @Override
    public final void e(boolean z10) {
    }
}
