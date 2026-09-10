package j4;

import b2.r0;
import java.util.Arrays;
import java.util.Collections;
public final class e implements i {
    public static final byte[] f11537x = {73, 68, 51};
    public final boolean f11538a;
    public final String d;
    public final int e;
    public final String f11541f;
    public String f11542g;
    public c3.h0 h;
    public c3.h0 f11543i;
    public boolean f11547m;
    public boolean f11548n;
    public int f11551q;
    public boolean f11552r;
    public int f11554t;
    public c3.h0 v;
    public long f11556w;
    public final a4.h f11539b = new a4.h(new byte[7], 7);
    public final e2.v f11540c = new e2.v(Arrays.copyOf(f11537x, 10));
    public int f11549o = -1;
    public int f11550p = -1;
    public long f11553s = -9223372036854775807L;
    public long f11555u = -9223372036854775807L;
    public int f11544j = 0;
    public int f11545k = 0;
    public int f11546l = 256;

    public e(int i10, String str, String str2, boolean z10) {
        this.f11538a = z10;
        this.d = str;
        this.e = i10;
        this.f11541f = str2;
    }

    @Override
    public final void a(e2.v vVar) {
        int i10;
        int i11;
        byte b10;
        boolean z10;
        int i12;
        this.h.getClass();
        String str = e2.d0.f7188a;
        while (vVar.a() > 0) {
            int i13 = this.f11544j;
            e2.v vVar2 = this.f11540c;
            a4.h hVar = this.f11539b;
            int i14 = 0;
            int i15 = 4;
            boolean z11 = true;
            int i16 = 1;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 4) {
                                int min = Math.min(vVar.a(), this.f11554t - this.f11545k);
                                this.v.d(min, vVar);
                                int i17 = this.f11545k + min;
                                this.f11545k = i17;
                                if (i17 == this.f11554t) {
                                    if (this.f11555u == -9223372036854775807L) {
                                        z11 = false;
                                    }
                                    e2.d.g(z11);
                                    this.v.c(this.f11555u, 1, this.f11554t, 0, null);
                                    this.f11555u += this.f11556w;
                                    this.f11544j = 0;
                                    this.f11545k = 0;
                                    this.f11546l = 256;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            if (this.f11547m) {
                                i10 = 7;
                            } else {
                                i10 = 5;
                            }
                            byte[] bArr = hVar.f254b;
                            int min2 = Math.min(vVar.a(), i10 - this.f11545k);
                            vVar.h(this.f11545k, min2, bArr);
                            int i18 = this.f11545k + min2;
                            this.f11545k = i18;
                            if (i18 == i10) {
                                hVar.q(0);
                                if (!this.f11552r) {
                                    int i19 = hVar.i(2) + 1;
                                    if (i19 != 2) {
                                        e2.a.n("AdtsReader", "Detected audio object type: " + i19 + ", but assuming AAC LC.");
                                        i19 = 2;
                                    }
                                    hVar.t(5);
                                    int i20 = hVar.i(3);
                                    int i21 = this.f11550p;
                                    byte[] bArr2 = {(byte) (((i19 << 3) & 248) | ((i21 >> 1) & 7)), (byte) (((i20 << 3) & 120) | ((i21 << 7) & 128))};
                                    c3.a n10 = c3.b.n(new a4.h(bArr2, 2), false);
                                    b2.r rVar = new b2.r();
                                    rVar.f1933a = this.f11542g;
                                    rVar.f1945p = r0.n(this.f11541f);
                                    rVar.f1946q = r0.n("audio/mp4a-latm");
                                    rVar.f1939j = n10.f4122a;
                                    rVar.I = n10.f4124c;
                                    rVar.J = n10.f4123b;
                                    rVar.f1949t = Collections.singletonList(bArr2);
                                    rVar.d = this.d;
                                    rVar.f1936f = this.e;
                                    b2.s sVar = new b2.s(rVar);
                                    this.f11553s = 1024000000 / sVar.K;
                                    this.h.b(sVar);
                                    this.f11552r = true;
                                } else {
                                    hVar.t(10);
                                }
                                hVar.t(4);
                                int i22 = hVar.i(13);
                                int i23 = i22 - 7;
                                if (this.f11547m) {
                                    i23 = i22 - 9;
                                }
                                c3.h0 h0Var = this.h;
                                long j3 = this.f11553s;
                                this.f11544j = 4;
                                this.f11545k = 0;
                                this.v = h0Var;
                                this.f11556w = j3;
                                this.f11554t = i23;
                            }
                        }
                    } else {
                        byte[] bArr3 = vVar2.f7234a;
                        int min3 = Math.min(vVar.a(), 10 - this.f11545k);
                        vVar.h(this.f11545k, min3, bArr3);
                        int i24 = this.f11545k + min3;
                        this.f11545k = i24;
                        if (i24 == 10) {
                            this.f11543i.d(10, vVar2);
                            vVar2.J(6);
                            c3.h0 h0Var2 = this.f11543i;
                            this.f11544j = 4;
                            this.f11545k = 10;
                            this.v = h0Var2;
                            this.f11556w = 0L;
                            this.f11554t = vVar2.w() + 10;
                        }
                    }
                } else if (vVar.a() != 0) {
                    hVar.f254b[0] = vVar.f7234a[vVar.f7235b];
                    hVar.q(2);
                    int i25 = hVar.i(4);
                    int i26 = this.f11550p;
                    if (i26 != -1 && i25 != i26) {
                        this.f11548n = false;
                        this.f11544j = 0;
                        this.f11545k = 0;
                        this.f11546l = 256;
                    } else {
                        if (!this.f11548n) {
                            this.f11548n = true;
                            this.f11549o = this.f11551q;
                            this.f11550p = i25;
                        }
                        this.f11544j = 3;
                        this.f11545k = 0;
                    }
                }
            } else {
                byte[] bArr4 = vVar.f7234a;
                int i27 = vVar.f7235b;
                int i28 = vVar.f7236c;
                while (true) {
                    if (i27 < i28) {
                        i11 = i27 + 1;
                        b10 = bArr4[i27];
                        int i29 = b10 & 255;
                        if (this.f11546l == 512 && ((65280 | (((byte) i29) & 255 ? 1 : 0) ? 1 : 0) & 65526)) {
                            if (!this.f11548n) {
                                int i30 = i27 - 1;
                                vVar.J(i27);
                                byte[] bArr5 = hVar.f254b;
                                if (vVar.a() >= i16) {
                                    vVar.h(i14, i16, bArr5);
                                    hVar.q(i15);
                                    int i31 = hVar.i(i16);
                                    int i32 = this.f11549o;
                                    if (i32 == -1 || i31 == i32) {
                                        if (this.f11550p != -1) {
                                            byte[] bArr6 = hVar.f254b;
                                            if (vVar.a() < i16) {
                                                break;
                                            }
                                            vVar.h(i14, i16, bArr6);
                                            hVar.q(2);
                                            i12 = 4;
                                            if (hVar.i(4) == this.f11550p) {
                                                vVar.J(i11);
                                            }
                                        } else {
                                            i12 = 4;
                                        }
                                        byte[] bArr7 = hVar.f254b;
                                        if (vVar.a() >= i12) {
                                            vVar.h(i14, i12, bArr7);
                                            hVar.q(14);
                                            int i33 = hVar.i(13);
                                            if (i33 >= 7) {
                                                byte[] bArr8 = vVar.f7234a;
                                                int i34 = vVar.f7236c;
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
                        int i39 = this.f11546l;
                        int i40 = i29 | i39;
                        if (i40 != 329) {
                            if (i40 != 511) {
                                if (i40 != 836) {
                                    if (i40 != 1075) {
                                        if (i39 != 256) {
                                            this.f11546l = 256;
                                            i14 = 0;
                                            i15 = 4;
                                            i16 = 1;
                                        }
                                    } else {
                                        this.f11544j = 2;
                                        this.f11545k = 3;
                                        this.f11554t = 0;
                                        vVar2.J(0);
                                        vVar.J(i11);
                                        break;
                                    }
                                } else {
                                    this.f11546l = 1024;
                                }
                            } else {
                                this.f11546l = 512;
                            }
                        } else {
                            this.f11546l = 768;
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
                this.f11551q = (b10 & 8) >> 3;
                if ((b10 & 1) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f11547m = z10;
                if (!this.f11548n) {
                    this.f11544j = 1;
                    this.f11545k = 0;
                } else {
                    this.f11544j = 3;
                    this.f11545k = 0;
                }
                vVar.J(i11);
            }
        }
    }

    @Override
    public final void b() {
        this.f11555u = -9223372036854775807L;
        this.f11548n = false;
        this.f11544j = 0;
        this.f11545k = 0;
        this.f11546l = 256;
    }

    @Override
    public final void c(c3.q qVar, g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f11542g = g0Var.e;
        g0Var.b();
        c3.h0 I = qVar.I(g0Var.d, 1);
        this.h = I;
        this.v = I;
        if (this.f11538a) {
            g0Var.a();
            g0Var.b();
            c3.h0 I2 = qVar.I(g0Var.d, 5);
            this.f11543i = I2;
            b2.r rVar = new b2.r();
            g0Var.b();
            rVar.f1933a = g0Var.e;
            rVar.f1945p = r0.n(this.f11541f);
            rVar.f1946q = r0.n("application/id3");
            hc.b.u(rVar, I2);
            return;
        }
        this.f11543i = new c3.n();
    }

    @Override
    public final void e(int i10, long j3) {
        this.f11555u = j3;
    }

    @Override
    public final void d(boolean z10) {
    }
}
