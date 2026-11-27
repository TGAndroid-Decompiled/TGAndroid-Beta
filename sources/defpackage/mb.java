package defpackage;

import java.util.Arrays;
import java.util.Collections;
public final class mb implements av3 {
    public static final byte[] x = {73, 68, 51};
    public final boolean a;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public x1c h;
    public x1c i;
    public boolean m;
    public boolean n;
    public int q;
    public boolean r;
    public int t;
    public x1c v;
    public long w;
    public final zd1 b = new zd1(7, new byte[7]);
    public final ey7 c = new ey7(Arrays.copyOf(x, 10));
    public int o = -1;
    public int p = -1;
    public long s = -9223372036854775807L;
    public long u = -9223372036854775807L;
    public byte j = 0;
    public int k = 0;
    public short l = 256;

    public mb(int i, String str, String str2, boolean z) {
        this.a = z;
        this.d = str;
        this.e = i;
        this.f = str2;
    }

    @Override
    public final void b(ey7 ey7Var) {
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
        String str = gcc.a;
        while (ey7Var.a() > 0) {
            byte b4 = this.j;
            ey7 ey7Var2 = this.c;
            byte b5 = 3;
            zd1 zd1Var = this.b;
            int i5 = 0;
            int i6 = 4;
            boolean z2 = true;
            int i7 = 1;
            if (b4 != 0) {
                if (b4 != 1) {
                    if (b4 != 2) {
                        if (b4 != 3) {
                            if (b4 == 4) {
                                int min = Math.min(ey7Var.a(), this.t - this.k);
                                this.v.e(min, ey7Var);
                                int i8 = this.k + min;
                                this.k = i8;
                                if (i8 == this.t) {
                                    if (this.u == -9223372036854775807L) {
                                        z2 = false;
                                    }
                                    yve.p(z2);
                                    this.v.a(this.u, 1, this.t, 0, null);
                                    this.u += this.w;
                                    this.j = (byte) 0;
                                    this.k = 0;
                                    this.l = (short) 256;
                                }
                            } else {
                                grb.g();
                                return;
                            }
                        } else {
                            if (this.m) {
                                i = 7;
                            } else {
                                i = 5;
                            }
                            byte[] bArr = zd1Var.b;
                            int min2 = Math.min(ey7Var.a(), i - this.k);
                            ey7Var.k(this.k, min2, bArr);
                            int i9 = this.k + min2;
                            this.k = i9;
                            if (i9 == i) {
                                zd1Var.l(0);
                                if (!this.r) {
                                    int f = zd1Var.f(2) + 1;
                                    if (f != 2) {
                                        efd.f("AdtsReader", "Detected audio object type: " + f + ", but assuming AAC LC.");
                                        f = 2;
                                    }
                                    zd1Var.n(5);
                                    int f2 = zd1Var.f(3);
                                    int i10 = this.p;
                                    byte[] bArr2 = {(byte) (((f << 3) & 248) | ((i10 >> 1) & 7)), (byte) (((i10 << 7) & 128) | ((f2 << 3) & 120))};
                                    h1 j = jn2.j(new zd1(2, bArr2), false);
                                    jo4 jo4Var = new jo4();
                                    jo4Var.a = this.g;
                                    jo4Var.r = dg7.n(this.f);
                                    jo4Var.s = dg7.n("audio/mp4a-latm");
                                    jo4Var.k = j.c;
                                    jo4Var.M = j.b;
                                    jo4Var.O = j.a;
                                    jo4Var.v = Collections.singletonList(bArr2);
                                    jo4Var.d = this.d;
                                    jo4Var.f = this.e;
                                    ko4 ko4Var = new ko4(jo4Var);
                                    this.s = 1024000000 / ko4Var.P;
                                    this.h.g(ko4Var);
                                    this.r = true;
                                } else {
                                    zd1Var.n(10);
                                }
                                zd1Var.n(4);
                                int f3 = zd1Var.f(13);
                                int i11 = f3 - 7;
                                if (this.m) {
                                    i11 = f3 - 9;
                                }
                                x1c x1cVar = this.h;
                                long j2 = this.s;
                                this.j = (byte) 4;
                                this.k = 0;
                                this.v = x1cVar;
                                this.w = j2;
                                this.t = i11;
                            }
                        }
                    } else {
                        byte[] bArr3 = ey7Var2.a;
                        int min3 = Math.min(ey7Var.a(), 10 - this.k);
                        ey7Var.k(this.k, min3, bArr3);
                        int i12 = this.k + min3;
                        this.k = i12;
                        if (i12 == 10) {
                            this.i.e(10, ey7Var2);
                            ey7Var2.N(6);
                            x1c x1cVar2 = this.i;
                            this.j = (byte) 4;
                            this.k = 10;
                            this.v = x1cVar2;
                            this.w = 0L;
                            this.t = ey7Var2.z() + 10;
                        }
                    }
                } else if (ey7Var.a() != 0) {
                    zd1Var.b[0] = ey7Var.a[ey7Var.b];
                    zd1Var.l(2);
                    int f4 = zd1Var.f(4);
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
                byte[] bArr4 = ey7Var.a;
                int i14 = ey7Var.b;
                int i15 = ey7Var.c;
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
                            ey7Var.N(i14);
                            byte[] bArr5 = zd1Var.b;
                            if (ey7Var.a() >= i7) {
                                ey7Var.k(i5, i7, bArr5);
                                zd1Var.l(i6);
                                int f5 = zd1Var.f(i7);
                                int i18 = this.o;
                                if (i18 == -1 || f5 == i18) {
                                    if (this.p != -1) {
                                        byte[] bArr6 = zd1Var.b;
                                        if (ey7Var.a() < i7) {
                                            break;
                                        }
                                        ey7Var.k(i5, i7, bArr6);
                                        zd1Var.l(2);
                                        i4 = 4;
                                        if (zd1Var.f(4) == this.p) {
                                            ey7Var.N(i2);
                                        }
                                    } else {
                                        i4 = 4;
                                    }
                                    byte[] bArr7 = zd1Var.b;
                                    if (ey7Var.a() < i4) {
                                        break;
                                    }
                                    ey7Var.k(i5, i4, bArr7);
                                    zd1Var.l(14);
                                    int f6 = zd1Var.f(13);
                                    if (f6 >= 7) {
                                        byte[] bArr8 = ey7Var.a;
                                        int i19 = ey7Var.c;
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
                                        ey7Var2.N(0);
                                        ey7Var.N(i2);
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
                        ey7Var.N(i14);
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
                ey7Var.N(i2);
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
    public final void h(g84 g84Var, l6c l6cVar) {
        l6cVar.a();
        l6cVar.b();
        this.g = l6cVar.e;
        l6cVar.b();
        x1c e0 = g84Var.e0(l6cVar.d, 1);
        this.h = e0;
        this.v = e0;
        if (this.a) {
            l6cVar.a();
            l6cVar.b();
            x1c e02 = g84Var.e0(l6cVar.d, 5);
            this.i = e02;
            jo4 jo4Var = new jo4();
            l6cVar.b();
            jo4Var.a = l6cVar.e;
            jo4Var.r = dg7.n(this.f);
            jo4Var.s = dg7.n("application/id3");
            xnb.v(jo4Var, e02);
            return;
        }
        this.i = new po3();
    }

    @Override
    public final void e() {
    }

    @Override
    public final void f() {
    }
}
