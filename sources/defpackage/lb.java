package defpackage;

import java.util.Arrays;
import java.util.Collections;
public final class lb implements rv3 {
    public static final byte[] x = {73, 68, 51};
    public final boolean a;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public yzb h;
    public yzb i;
    public boolean m;
    public boolean n;
    public int q;
    public boolean r;
    public int t;
    public yzb v;
    public long w;
    public final ye1 b = new ye1(7, new byte[7]);
    public final yw7 c = new yw7(Arrays.copyOf(x, 10));
    public int o = -1;
    public int p = -1;
    public long s = -9223372036854775807L;
    public long u = -9223372036854775807L;
    public byte j = 0;
    public int k = 0;
    public short l = 256;

    public lb(int i, String str, String str2, boolean z) {
        this.a = z;
        this.d = str;
        this.e = i;
        this.f = str2;
    }

    @Override
    public final void b(yw7 yw7Var) {
        int i;
        int i2;
        byte b;
        byte b2;
        ?? r4;
        byte b3;
        int i3;
        boolean z;
        int i4;
        this.h.getClass();
        String str = hac.a;
        while (yw7Var.a() > 0) {
            byte b4 = this.j;
            yw7 yw7Var2 = this.c;
            byte b5 = 3;
            ye1 ye1Var = this.b;
            int i5 = 0;
            int i6 = 4;
            boolean z2 = true;
            int i7 = 1;
            if (b4 != 0) {
                if (b4 != 1) {
                    if (b4 != 2) {
                        if (b4 != 3) {
                            if (b4 == 4) {
                                int min = Math.min(yw7Var.a(), this.t - this.k);
                                this.v.e(min, yw7Var);
                                int i8 = this.k + min;
                                this.k = i8;
                                if (i8 == this.t) {
                                    if (this.u == -9223372036854775807L) {
                                        z2 = false;
                                    }
                                    jte.p(z2);
                                    this.v.a(this.u, 1, this.t, 0, null);
                                    this.u += this.w;
                                    this.j = (byte) 0;
                                    this.k = 0;
                                    this.l = (short) 256;
                                }
                            } else {
                                rjb.h();
                                return;
                            }
                        } else {
                            if (this.m) {
                                i = 7;
                            } else {
                                i = 5;
                            }
                            byte[] bArr = ye1Var.b;
                            int min2 = Math.min(yw7Var.a(), i - this.k);
                            yw7Var.k(this.k, min2, bArr);
                            int i9 = this.k + min2;
                            this.k = i9;
                            if (i9 == i) {
                                ye1Var.l(0);
                                if (!this.r) {
                                    int f = ye1Var.f(2) + 1;
                                    if (f != 2) {
                                        ncd.f("AdtsReader", "Detected audio object type: " + f + ", but assuming AAC LC.");
                                        f = 2;
                                    }
                                    ye1Var.n(5);
                                    int f2 = ye1Var.f(3);
                                    int i10 = this.p;
                                    byte[] bArr2 = {(byte) (((f << 3) & 248) | ((i10 >> 1) & 7)), (byte) (((i10 << 7) & 128) | ((f2 << 3) & 120))};
                                    g1 j = bo2.j(new ye1(2, bArr2), false);
                                    fo4 fo4Var = new fo4();
                                    fo4Var.a = this.g;
                                    fo4Var.r = wf7.n(this.f);
                                    fo4Var.s = wf7.n("audio/mp4a-latm");
                                    fo4Var.k = j.c;
                                    fo4Var.M = j.b;
                                    fo4Var.O = j.a;
                                    fo4Var.v = Collections.singletonList(bArr2);
                                    fo4Var.d = this.d;
                                    fo4Var.f = this.e;
                                    go4 go4Var = new go4(fo4Var);
                                    this.s = 1024000000 / go4Var.P;
                                    this.h.g(go4Var);
                                    this.r = true;
                                } else {
                                    ye1Var.n(10);
                                }
                                ye1Var.n(4);
                                int f3 = ye1Var.f(13);
                                int i11 = f3 - 7;
                                if (this.m) {
                                    i11 = f3 - 9;
                                }
                                yzb yzbVar = this.h;
                                long j2 = this.s;
                                this.j = (byte) 4;
                                this.k = 0;
                                this.v = yzbVar;
                                this.w = j2;
                                this.t = i11;
                            }
                        }
                    } else {
                        byte[] bArr3 = yw7Var2.a;
                        int min3 = Math.min(yw7Var.a(), 10 - this.k);
                        yw7Var.k(this.k, min3, bArr3);
                        int i12 = this.k + min3;
                        this.k = i12;
                        if (i12 == 10) {
                            this.i.e(10, yw7Var2);
                            yw7Var2.N(6);
                            yzb yzbVar2 = this.i;
                            this.j = (byte) 4;
                            this.k = 10;
                            this.v = yzbVar2;
                            this.w = 0L;
                            this.t = yw7Var2.z() + 10;
                        }
                    }
                } else if (yw7Var.a() != 0) {
                    ye1Var.b[0] = yw7Var.a[yw7Var.b];
                    ye1Var.l(2);
                    int f4 = ye1Var.f(4);
                    int i13 = this.p;
                    if (i13 != -1 && f4 != i13) {
                        this.n = false;
                        this.j = (byte) 0;
                        this.k = 0;
                        this.l = (short) 256;
                    } else {
                        if (!this.n) {
                            this.n = true;
                            this.o = this.q;
                            this.p = f4;
                        }
                        this.j = (byte) 3;
                        this.k = 0;
                    }
                }
            } else {
                byte[] bArr4 = yw7Var.a;
                int i14 = yw7Var.b;
                int i15 = yw7Var.c;
                while (true) {
                    if (i14 < i15) {
                        i2 = i14 + 1;
                        b = b5;
                        b2 = bArr4[i14];
                        int i16 = b2 & 255;
                        if (this.l == 512 && (((65280 | ((((byte) i16) & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520) {
                            if (this.n) {
                                break;
                            }
                            int i17 = i14 - 1;
                            yw7Var.N(i14);
                            byte[] bArr5 = ye1Var.b;
                            if (yw7Var.a() >= i7) {
                                yw7Var.k(i5, i7, bArr5);
                                ye1Var.l(i6);
                                int f5 = ye1Var.f(i7);
                                int i18 = this.o;
                                if (i18 == -1 || f5 == i18) {
                                    if (this.p != -1) {
                                        byte[] bArr6 = ye1Var.b;
                                        if (yw7Var.a() < i7) {
                                            break;
                                        }
                                        yw7Var.k(i5, i7, bArr6);
                                        ye1Var.l(2);
                                        i4 = 4;
                                        if (ye1Var.f(4) == this.p) {
                                            yw7Var.N(i2);
                                        }
                                    } else {
                                        i4 = 4;
                                    }
                                    byte[] bArr7 = ye1Var.b;
                                    if (yw7Var.a() < i4) {
                                        break;
                                    }
                                    yw7Var.k(i5, i4, bArr7);
                                    ye1Var.l(14);
                                    int f6 = ye1Var.f(13);
                                    if (f6 >= 7) {
                                        byte[] bArr8 = yw7Var.a;
                                        int i19 = yw7Var.c;
                                        int i20 = i17 + f6;
                                        if (i20 < i19) {
                                            byte b6 = bArr8[i20];
                                            if (b6 == -1) {
                                                int i21 = i20 + 1;
                                                if (i21 == i19) {
                                                    break;
                                                }
                                                byte b7 = bArr8[i21];
                                                if ((((65280 | ((b7 & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520 && ((b7 & 8) >> 3) == f5) {
                                                    break;
                                                }
                                            } else if (b6 == 73) {
                                                int i22 = i20 + 1;
                                                if (i22 == i19) {
                                                    break;
                                                } else if (bArr8[i22] == 68) {
                                                    int i23 = i20 + 2;
                                                    if (i23 == i19) {
                                                        break;
                                                    } else if (bArr8[i23] == 51) {
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            }
                            r4 = true;
                        } else {
                            r4 = i7;
                        }
                        short s = this.l;
                        int i24 = i16 | s;
                        if (i24 != 329) {
                            if (i24 != 511) {
                                if (i24 != 836) {
                                    if (i24 != 1075) {
                                        if (s != 256) {
                                            this.l = (short) 256;
                                            b3 = 3;
                                            i3 = 0;
                                            i7 = r4;
                                            i6 = 4;
                                            i5 = i3;
                                            b5 = b3;
                                        } else {
                                            b3 = 3;
                                            i3 = 0;
                                        }
                                    } else {
                                        this.j = (byte) 2;
                                        this.k = 3;
                                        this.t = 0;
                                        yw7Var2.N(0);
                                        yw7Var.N(i2);
                                        break;
                                    }
                                } else {
                                    b3 = 3;
                                    i3 = 0;
                                    this.l = (short) 1024;
                                }
                            } else {
                                b3 = 3;
                                i3 = 0;
                                this.l = (short) 512;
                            }
                        } else {
                            b3 = 3;
                            i3 = 0;
                            this.l = (short) 768;
                        }
                        i14 = i2;
                        i7 = r4;
                        i6 = 4;
                        i5 = i3;
                        b5 = b3;
                    } else {
                        yw7Var.N(i14);
                        break;
                    }
                }
                this.q = (b2 & 8) >> 3;
                if ((b2 & 1) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.m = z;
                if (!this.n) {
                    this.j = (byte) 1;
                    this.k = 0;
                } else {
                    this.j = b;
                    this.k = 0;
                }
                yw7Var.N(i2);
            }
        }
    }

    @Override
    public final void d() {
        this.u = -9223372036854775807L;
        this.n = false;
        this.j = (byte) 0;
        this.k = 0;
        this.l = (short) 256;
    }

    @Override
    public final void g(int i, long j) {
        this.u = j;
    }

    @Override
    public final void h(u84 u84Var, l4c l4cVar) {
        l4cVar.a();
        l4cVar.b();
        this.g = l4cVar.e;
        l4cVar.b();
        yzb c0 = u84Var.c0(l4cVar.d, 1);
        this.h = c0;
        this.v = c0;
        if (this.a) {
            l4cVar.a();
            l4cVar.b();
            yzb c02 = u84Var.c0(l4cVar.d, 5);
            this.i = c02;
            fo4 fo4Var = new fo4();
            l4cVar.b();
            fo4Var.a = l4cVar.e;
            fo4Var.r = wf7.n(this.f);
            fo4Var.s = wf7.n("application/id3");
            mlb.w(fo4Var, c02);
            return;
        }
        this.i = new ip3();
    }

    @Override
    public final void e() {
    }

    @Override
    public final void f() {
    }
}
