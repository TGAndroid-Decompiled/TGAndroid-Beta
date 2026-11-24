package defpackage;
public final class n38 implements m2c {
    public final gu3 a;
    public final qd1 b = new qd1(10, new byte[10]);
    public byte c = 0;
    public int d;
    public uob e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;

    public n38(gu3 gu3Var) {
        this.a = gu3Var;
    }

    @Override
    public final void a(int i, xu7 xu7Var) {
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
        gu3 gu3Var = this.a;
        if (i4 != 0) {
            byte b5 = this.c;
            if (b5 != 0 && b5 != 1) {
                if (b5 != 2) {
                    if (b5 == 3) {
                        if (this.j != -1) {
                            lad.f("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                        }
                        gu3Var.e();
                    } else {
                        sdb.a();
                        return;
                    }
                } else {
                    lad.f("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            if (xu7Var.c == 0) {
                gu3Var.f();
            }
            this.c = (byte) 1;
            this.d = 0;
        }
        int i7 = i;
        while (xu7Var.a() > 0) {
            byte b6 = this.c;
            if (b6 != 0) {
                qd1 qd1Var = this.b;
                if (b6 != 1) {
                    if (b6 != b3) {
                        if (b6 == b4) {
                            int a = xu7Var.a();
                            int i8 = this.j;
                            if (i8 == i5) {
                                i3 = i6;
                            } else {
                                i3 = a - i8;
                            }
                            if (i3 > 0) {
                                a -= i3;
                                xu7Var.M(xu7Var.b + a);
                            }
                            gu3Var.b(xu7Var);
                            int i9 = this.j;
                            if (i9 != i5) {
                                int i10 = i9 - a;
                                this.j = i10;
                                if (i10 == 0) {
                                    gu3Var.e();
                                    this.c = (byte) 1;
                                    this.d = i6;
                                }
                            }
                            i2 = i6;
                            b = b4;
                        } else {
                            sdb.a();
                            return;
                        }
                    } else {
                        if (b(xu7Var, qd1Var.b, Math.min(10, this.i)) && b(xu7Var, null, this.i)) {
                            qd1Var.l(i6);
                            int i11 = 4;
                            if (this.f) {
                                qd1Var.n(4);
                                qd1Var.n(1);
                                qd1Var.n(1);
                                long f = (qd1Var.f(b4) << 30) | (qd1Var.f(15) << 15) | qd1Var.f(15);
                                qd1Var.n(1);
                                if (!this.h && this.g) {
                                    qd1Var.n(4);
                                    qd1Var.n(1);
                                    qd1Var.n(1);
                                    qd1Var.n(1);
                                    this.e.b((qd1Var.f(b4) << 30) | (qd1Var.f(15) << 15) | qd1Var.f(15));
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
                            gu3Var.g(i7, j);
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
                    if (b(xu7Var, qd1Var.b, 9)) {
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
                xu7Var.O(xu7Var.a());
            }
            b4 = b;
            i6 = i2;
            i5 = -1;
            b3 = 2;
        }
    }

    public final boolean b(xu7 xu7Var, byte[] bArr, int i) {
        int min = Math.min(xu7Var.a(), i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            xu7Var.O(min);
        } else {
            xu7Var.k(this.d, min, bArr);
        }
        int i2 = this.d + min;
        this.d = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(uob uobVar, l74 l74Var, l2c l2cVar) {
        this.e = uobVar;
        this.a.h(l74Var, l2cVar);
    }

    @Override
    public final void d() {
        this.c = (byte) 0;
        this.d = 0;
        this.h = false;
        this.a.d();
    }

    public final boolean e() {
        qd1 qd1Var = this.b;
        qd1Var.l(0);
        int f = qd1Var.f(24);
        if (f != 1) {
            b00.o(f, "Unexpected start code prefix: ", "PesReader");
            this.j = -1;
            return false;
        }
        qd1Var.n(8);
        int f2 = qd1Var.f(16);
        qd1Var.n(5);
        this.k = qd1Var.e();
        qd1Var.n(2);
        this.f = qd1Var.e();
        this.g = qd1Var.e();
        qd1Var.n(6);
        int f3 = qd1Var.f(8);
        this.i = f3;
        if (f2 == 0) {
            this.j = -1;
            return true;
        }
        int i = (f2 - 3) - f3;
        this.j = i;
        if (i < 0) {
            lad.f("PesReader", "Found negative packet payload size: " + this.j);
            this.j = -1;
        }
        return true;
    }
}
