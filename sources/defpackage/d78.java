package defpackage;
public final class d78 implements m6c {
    public final av3 a;
    public final zd1 b = new zd1(10, new byte[10]);
    public byte c = 0;
    public int d;
    public usb e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;

    public d78(av3 av3Var) {
        this.a = av3Var;
    }

    @Override
    public final void a(int i, ey7 ey7Var) {
        int i2;
        byte b;
        byte b2;
        int i3;
        long j;
        this.e.getClass();
        int i4 = i & 1;
        int i5 = -1;
        byte b3 = 2;
        int i6 = 0;
        byte b4 = 3;
        av3 av3Var = this.a;
        if (i4 != 0) {
            byte b5 = this.c;
            if (b5 != 0 && b5 != 1) {
                if (b5 != 2) {
                    if (b5 == 3) {
                        if (this.j != -1) {
                            efd.f("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                        }
                        av3Var.e();
                    } else {
                        grb.g();
                        return;
                    }
                } else {
                    efd.f("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            if (ey7Var.c == 0) {
                av3Var.f();
            }
            this.c = (byte) 1;
            this.d = 0;
        }
        int i7 = i;
        while (ey7Var.a() > 0) {
            byte b6 = this.c;
            if (b6 != 0) {
                zd1 zd1Var = this.b;
                if (b6 != 1) {
                    if (b6 != b3) {
                        if (b6 == b4) {
                            int a = ey7Var.a();
                            int i8 = this.j;
                            if (i8 == i5) {
                                i3 = i6;
                            } else {
                                i3 = a - i8;
                            }
                            if (i3 > 0) {
                                a -= i3;
                                ey7Var.M(ey7Var.b + a);
                            }
                            av3Var.b(ey7Var);
                            int i9 = this.j;
                            if (i9 != i5) {
                                int i10 = i9 - a;
                                this.j = i10;
                                if (i10 == 0) {
                                    av3Var.e();
                                    this.c = (byte) 1;
                                    this.d = i6;
                                }
                            }
                            i2 = i6;
                            b = b4;
                        } else {
                            grb.g();
                            return;
                        }
                    } else {
                        if (b(ey7Var, zd1Var.b, Math.min(10, this.i)) && b(ey7Var, null, this.i)) {
                            zd1Var.l(i6);
                            int i11 = 4;
                            if (this.f) {
                                zd1Var.n(4);
                                zd1Var.n(1);
                                zd1Var.n(1);
                                long f = (zd1Var.f(b4) << 30) | (zd1Var.f(15) << 15) | zd1Var.f(15);
                                zd1Var.n(1);
                                if (!this.h && this.g) {
                                    zd1Var.n(4);
                                    zd1Var.n(1);
                                    zd1Var.n(1);
                                    zd1Var.n(1);
                                    this.e.b((zd1Var.f(b4) << 30) | (zd1Var.f(15) << 15) | zd1Var.f(15));
                                    this.h = true;
                                }
                                j = this.e.b(f);
                            } else {
                                j = -9223372036854775807L;
                            }
                            if (!this.k) {
                                i11 = 0;
                            }
                            i7 |= i11;
                            av3Var.g(i7, j);
                            this.c = (byte) 3;
                            this.d = 0;
                            b4 = 3;
                            i5 = -1;
                            b3 = 2;
                            i6 = 0;
                        } else {
                            b = b4;
                            i2 = i6;
                        }
                    }
                } else {
                    b = b4;
                    if (b(ey7Var, zd1Var.b, 9)) {
                        if (e()) {
                            b2 = 2;
                        } else {
                            b2 = 0;
                        }
                        this.c = b2;
                        i2 = 0;
                        this.d = 0;
                    } else {
                        i2 = 0;
                    }
                }
            } else {
                i2 = i6;
                b = b4;
                ey7Var.O(ey7Var.a());
            }
            b4 = b;
            i6 = i2;
            i5 = -1;
            b3 = 2;
        }
    }

    public final boolean b(ey7 ey7Var, byte[] bArr, int i) {
        int min = Math.min(ey7Var.a(), i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            ey7Var.O(min);
        } else {
            ey7Var.k(this.d, min, bArr);
        }
        int i2 = this.d + min;
        this.d = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(usb usbVar, g84 g84Var, l6c l6cVar) {
        this.e = usbVar;
        this.a.h(g84Var, l6cVar);
    }

    @Override
    public final void d() {
        this.c = (byte) 0;
        this.d = 0;
        this.h = false;
        this.a.d();
    }

    public final boolean e() {
        zd1 zd1Var = this.b;
        zd1Var.l(0);
        int f = zd1Var.f(24);
        if (f != 1) {
            c00.p(f, "Unexpected start code prefix: ", "PesReader");
            this.j = -1;
            return false;
        }
        zd1Var.n(8);
        int f2 = zd1Var.f(16);
        zd1Var.n(5);
        this.k = zd1Var.e();
        zd1Var.n(2);
        this.f = zd1Var.e();
        this.g = zd1Var.e();
        zd1Var.n(6);
        int f3 = zd1Var.f(8);
        this.i = f3;
        if (f2 == 0) {
            this.j = -1;
            return true;
        }
        int i = (f2 - 3) - f3;
        this.j = i;
        if (i < 0) {
            efd.f("PesReader", "Found negative packet payload size: " + this.j);
            this.j = -1;
        }
        return true;
    }
}
