package b4;

import j3.m0;
import j3.n0;
import java.util.Arrays;
import java.util.Collections;
import l3.p0;
public final class e implements i {
    public static final byte[] v = {73, 68, 51};
    public final boolean f1454a;
    public final String d;
    public String f1457e;
    public r3.v f1458f;
    public r3.v f1459g;
    public boolean f1462k;
    public boolean f1463l;
    public int f1466o;
    public boolean f1467p;
    public int f1469r;
    public r3.v f1471t;
    public long f1472u;
    public final h5.v f1455b = new h5.v(new byte[7], 7);
    public final h5.w f1456c = new h5.w(Arrays.copyOf(v, 10));
    public int h = 0;
    public int f1460i = 0;
    public int f1461j = 256;
    public int f1464m = -1;
    public int f1465n = -1;
    public long f1468q = -9223372036854775807L;
    public long f1470s = -9223372036854775807L;

    public e(String str, boolean z4) {
        this.f1454a = z4;
        this.d = str;
    }

    @Override
    public final void a(h5.w wVar) {
        int i10;
        int i11;
        byte b10;
        boolean z4;
        int i12;
        this.f1458f.getClass();
        int i13 = h5.d0.f7237a;
        while (wVar.a() > 0) {
            int i14 = this.h;
            h5.w wVar2 = this.f1456c;
            int i15 = 0;
            h5.v vVar = this.f1455b;
            int i16 = 4;
            int i17 = 1;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 == 4) {
                                int min = Math.min(wVar.a(), this.f1469r - this.f1460i);
                                this.f1471t.d(min, wVar);
                                int i18 = this.f1460i + min;
                                this.f1460i = i18;
                                int i19 = this.f1469r;
                                if (i18 == i19) {
                                    long j10 = this.f1470s;
                                    if (j10 != -9223372036854775807L) {
                                        this.f1471t.c(j10, 1, i19, 0, null);
                                        this.f1470s += this.f1472u;
                                    }
                                    this.h = 0;
                                    this.f1460i = 0;
                                    this.f1461j = 256;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            if (this.f1462k) {
                                i10 = 7;
                            } else {
                                i10 = 5;
                            }
                            byte[] bArr = vVar.f7303b;
                            int min2 = Math.min(wVar.a(), i10 - this.f1460i);
                            wVar.e(this.f1460i, min2, bArr);
                            int i20 = this.f1460i + min2;
                            this.f1460i = i20;
                            if (i20 == i10) {
                                vVar.p(0);
                                if (!this.f1467p) {
                                    int i21 = vVar.i(2) + 1;
                                    if (i21 != 2) {
                                        h5.a.K("AdtsReader", "Detected audio object type: " + i21 + ", but assuming AAC LC.");
                                        i21 = 2;
                                    }
                                    vVar.s(5);
                                    int i22 = vVar.i(3);
                                    int i23 = this.f1465n;
                                    byte[] bArr2 = {(byte) (((i21 << 3) & 248) | ((i23 >> 1) & 7)), (byte) (((i22 << 3) & 120) | ((i23 << 7) & 128))};
                                    p0 h = l3.a.h(new h5.v(bArr2, 2), false);
                                    m0 m0Var = new m0();
                                    m0Var.f9253a = this.f1457e;
                                    m0Var.f9265o = "audio/mp4a-latm";
                                    m0Var.h = (String) h.f11583c;
                                    m0Var.B = h.f11582b;
                                    m0Var.C = h.f11581a;
                                    m0Var.f9267q = Collections.singletonList(bArr2);
                                    m0Var.f9255c = this.d;
                                    n0 n0Var = new n0(m0Var);
                                    this.f1468q = 1024000000 / n0Var.Q;
                                    this.f1458f.b(n0Var);
                                    this.f1467p = true;
                                } else {
                                    vVar.s(10);
                                }
                                vVar.s(4);
                                int i24 = vVar.i(13);
                                int i25 = i24 - 7;
                                if (this.f1462k) {
                                    i25 = i24 - 9;
                                }
                                r3.v vVar2 = this.f1458f;
                                long j11 = this.f1468q;
                                this.h = 4;
                                this.f1460i = 0;
                                this.f1471t = vVar2;
                                this.f1472u = j11;
                                this.f1469r = i25;
                            }
                        }
                    } else {
                        byte[] bArr3 = wVar2.f7308a;
                        int min3 = Math.min(wVar.a(), 10 - this.f1460i);
                        wVar.e(this.f1460i, min3, bArr3);
                        int i26 = this.f1460i + min3;
                        this.f1460i = i26;
                        if (i26 == 10) {
                            this.f1459g.d(10, wVar2);
                            wVar2.F(6);
                            r3.v vVar3 = this.f1459g;
                            this.h = 4;
                            this.f1460i = 10;
                            this.f1471t = vVar3;
                            this.f1472u = 0L;
                            this.f1469r = wVar2.t() + 10;
                        }
                    }
                } else if (wVar.a() != 0) {
                    vVar.f7303b[0] = wVar.f7308a[wVar.f7309b];
                    vVar.p(2);
                    int i27 = vVar.i(4);
                    int i28 = this.f1465n;
                    if (i28 != -1 && i27 != i28) {
                        this.f1463l = false;
                        this.h = 0;
                        this.f1460i = 0;
                        this.f1461j = 256;
                    } else {
                        if (!this.f1463l) {
                            this.f1463l = true;
                            this.f1464m = this.f1466o;
                            this.f1465n = i27;
                        }
                        this.h = 3;
                        this.f1460i = 0;
                    }
                }
            } else {
                byte[] bArr4 = wVar.f7308a;
                int i29 = wVar.f7309b;
                int i30 = wVar.f7310c;
                while (true) {
                    if (i29 < i30) {
                        i11 = i29 + 1;
                        b10 = bArr4[i29];
                        int i31 = b10 & 255;
                        if (this.f1461j == 512 && ((65280 | (((byte) i31) & 255)) & 65526) == 65520) {
                            if (!this.f1463l) {
                                int i32 = i29 - 1;
                                wVar.F(i29);
                                byte[] bArr5 = vVar.f7303b;
                                if (wVar.a() >= i17) {
                                    wVar.e(i15, i17, bArr5);
                                    vVar.p(i16);
                                    int i33 = vVar.i(i17);
                                    int i34 = this.f1464m;
                                    if (i34 == -1 || i33 == i34) {
                                        if (this.f1465n != -1) {
                                            byte[] bArr6 = vVar.f7303b;
                                            if (wVar.a() < i17) {
                                                break;
                                            }
                                            wVar.e(i15, i17, bArr6);
                                            vVar.p(2);
                                            i12 = 4;
                                            if (vVar.i(4) == this.f1465n) {
                                                wVar.F(i11);
                                            }
                                        } else {
                                            i12 = 4;
                                        }
                                        byte[] bArr7 = vVar.f7303b;
                                        if (wVar.a() >= i12) {
                                            wVar.e(i15, i12, bArr7);
                                            vVar.p(14);
                                            int i35 = vVar.i(13);
                                            if (i35 >= 7) {
                                                byte[] bArr8 = wVar.f7308a;
                                                int i36 = wVar.f7310c;
                                                int i37 = i32 + i35;
                                                if (i37 >= i36) {
                                                    break;
                                                }
                                                byte b11 = bArr8[i37];
                                                if (b11 == -1) {
                                                    int i38 = i37 + 1;
                                                    if (i38 != i36) {
                                                        byte b12 = bArr8[i38];
                                                        if (((65280 | (b12 & 255)) & 65526) == 65520 && ((b12 & 8) >> 3) == i33) {
                                                            break;
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                } else if (b11 == 73) {
                                                    int i39 = i37 + 1;
                                                    if (i39 != i36) {
                                                        if (bArr8[i39] == 68) {
                                                            int i40 = i37 + 2;
                                                            if (i40 != i36) {
                                                                if (bArr8[i40] == 51) {
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
                        int i41 = this.f1461j;
                        int i42 = i31 | i41;
                        if (i42 != 329) {
                            if (i42 != 511) {
                                if (i42 != 836) {
                                    if (i42 != 1075) {
                                        if (i41 != 256) {
                                            this.f1461j = 256;
                                            i15 = 0;
                                            i16 = 4;
                                            i17 = 1;
                                        }
                                    } else {
                                        this.h = 2;
                                        this.f1460i = 3;
                                        this.f1469r = 0;
                                        wVar2.F(0);
                                        wVar.F(i11);
                                        break;
                                    }
                                } else {
                                    this.f1461j = 1024;
                                }
                            } else {
                                this.f1461j = 512;
                            }
                        } else {
                            this.f1461j = 768;
                        }
                        i29 = i11;
                        i15 = 0;
                        i16 = 4;
                        i17 = 1;
                    } else {
                        wVar.F(i29);
                        break;
                    }
                }
                this.f1466o = (b10 & 8) >> 3;
                if ((b10 & 1) == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f1462k = z4;
                if (!this.f1463l) {
                    this.h = 1;
                    this.f1460i = 0;
                } else {
                    this.h = 3;
                    this.f1460i = 0;
                }
                wVar.F(i11);
            }
        }
    }

    @Override
    public final void b() {
        this.f1470s = -9223372036854775807L;
        this.f1463l = false;
        this.h = 0;
        this.f1460i = 0;
        this.f1461j = 256;
    }

    @Override
    public final void c(r3.m mVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f1457e = h0Var.f1514e;
        h0Var.b();
        r3.v i22 = mVar.i2(h0Var.d, 1);
        this.f1458f = i22;
        this.f1471t = i22;
        if (this.f1454a) {
            h0Var.a();
            h0Var.b();
            r3.v i23 = mVar.i2(h0Var.d, 5);
            this.f1459g = i23;
            m0 m0Var = new m0();
            h0Var.b();
            m0Var.f9253a = h0Var.f1514e;
            m0Var.f9265o = "application/id3";
            i23.b(new n0(m0Var));
            return;
        }
        this.f1459g = new r3.j();
    }

    @Override
    public final void e(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f1470s = j10;
        }
    }

    @Override
    public final void d() {
    }
}
