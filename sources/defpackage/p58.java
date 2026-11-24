package defpackage;
public final class p58 implements m4c {
    public final rv3 a;
    public final ye1 b = new ye1(10, new byte[10]);
    public byte c = 0;
    public int d;
    public vqb e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;

    public p58(rv3 rv3Var) {
        this.a = rv3Var;
    }

    @Override
    public final void a(int i, yw7 yw7Var) {
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
        rv3 rv3Var = this.a;
        if (i4 != 0) {
            byte b5 = this.c;
            if (b5 != 0 && b5 != 1) {
                if (b5 != 2) {
                    if (b5 == 3) {
                        if (this.j != -1) {
                            ncd.f("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                        }
                        rv3Var.e();
                    } else {
                        rjb.h();
                        return;
                    }
                } else {
                    ncd.f("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            if (yw7Var.c == 0) {
                rv3Var.f();
            }
            this.c = (byte) 1;
            this.d = 0;
        }
        int i7 = i;
        while (yw7Var.a() > 0) {
            byte b6 = this.c;
            if (b6 != 0) {
                ye1 ye1Var = this.b;
                if (b6 != 1) {
                    if (b6 != b3) {
                        if (b6 == b4) {
                            int a = yw7Var.a();
                            int i8 = this.j;
                            if (i8 == i5) {
                                i3 = i6;
                            } else {
                                i3 = a - i8;
                            }
                            if (i3 > 0) {
                                a -= i3;
                                yw7Var.M(yw7Var.b + a);
                            }
                            rv3Var.b(yw7Var);
                            int i9 = this.j;
                            if (i9 != i5) {
                                int i10 = i9 - a;
                                this.j = i10;
                                if (i10 == 0) {
                                    rv3Var.e();
                                    this.c = (byte) 1;
                                    this.d = i6;
                                }
                            }
                            i2 = i6;
                            b = b4;
                        } else {
                            rjb.h();
                            return;
                        }
                    } else {
                        if (b(yw7Var, ye1Var.b, Math.min(10, this.i)) && b(yw7Var, null, this.i)) {
                            ye1Var.l(i6);
                            int i11 = 4;
                            if (this.f) {
                                ye1Var.n(4);
                                ye1Var.n(1);
                                ye1Var.n(1);
                                long f = (ye1Var.f(b4) << 30) | (ye1Var.f(15) << 15) | ye1Var.f(15);
                                ye1Var.n(1);
                                if (!this.h && this.g) {
                                    ye1Var.n(4);
                                    ye1Var.n(1);
                                    ye1Var.n(1);
                                    ye1Var.n(1);
                                    this.e.b((ye1Var.f(b4) << 30) | (ye1Var.f(15) << 15) | ye1Var.f(15));
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
                            rv3Var.g(i7, j);
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
                    if (b(yw7Var, ye1Var.b, 9)) {
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
                yw7Var.O(yw7Var.a());
            }
            b4 = b;
            i6 = i2;
            i5 = -1;
            b3 = 2;
        }
    }

    public final boolean b(yw7 yw7Var, byte[] bArr, int i) {
        int min = Math.min(yw7Var.a(), i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            yw7Var.O(min);
        } else {
            yw7Var.k(this.d, min, bArr);
        }
        int i2 = this.d + min;
        this.d = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(vqb vqbVar, u84 u84Var, l4c l4cVar) {
        this.e = vqbVar;
        this.a.h(u84Var, l4cVar);
    }

    @Override
    public final void d() {
        this.c = (byte) 0;
        this.d = 0;
        this.h = false;
        this.a.d();
    }

    public final boolean e() {
        ye1 ye1Var = this.b;
        ye1Var.l(0);
        int f = ye1Var.f(24);
        if (f != 1) {
            b10.o(f, "Unexpected start code prefix: ", "PesReader");
            this.j = -1;
            return false;
        }
        ye1Var.n(8);
        int f2 = ye1Var.f(16);
        ye1Var.n(5);
        this.k = ye1Var.e();
        ye1Var.n(2);
        this.f = ye1Var.e();
        this.g = ye1Var.e();
        ye1Var.n(6);
        int f3 = ye1Var.f(8);
        this.i = f3;
        if (f2 == 0) {
            this.j = -1;
            return true;
        }
        int i = (f2 - 3) - f3;
        this.j = i;
        if (i < 0) {
            ncd.f("PesReader", "Found negative packet payload size: " + this.j);
            this.j = -1;
        }
        return true;
    }
}
