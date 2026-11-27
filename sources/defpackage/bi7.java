package defpackage;
public final class bi7 implements av3 {
    public final ey7 a;
    public final ci7 b;
    public final String c;
    public final int d;
    public final String e;
    public x1c f;
    public String g;
    public byte h = 0;
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public long n;

    public bi7(String str, int i, String str2) {
        ey7 ey7Var = new ey7(4);
        this.a = ey7Var;
        ey7Var.a[0] = -1;
        this.b = new Object();
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override
    public final void b(ey7 ey7Var) {
        boolean z;
        boolean z2;
        this.f.getClass();
        while (ey7Var.a() > 0) {
            byte b = this.h;
            ey7 ey7Var2 = this.a;
            boolean z3 = true;
            if (b != 0) {
                if (b != 1) {
                    if (b == 2) {
                        int min = Math.min(ey7Var.a(), this.m - this.i);
                        this.f.e(min, ey7Var);
                        int i = this.i + min;
                        this.i = i;
                        if (i >= this.m) {
                            if (this.n == -9223372036854775807L) {
                                z3 = false;
                            }
                            yve.p(z3);
                            this.f.a(this.n, 1, this.m, 0, null);
                            this.n += this.l;
                            this.i = 0;
                            this.h = (byte) 0;
                        }
                    } else {
                        grb.g();
                        return;
                    }
                } else {
                    int min2 = Math.min(ey7Var.a(), 4 - this.i);
                    ey7Var.k(this.i, min2, ey7Var2.a);
                    int i2 = this.i + min2;
                    this.i = i2;
                    if (i2 >= 4) {
                        ey7Var2.N(0);
                        int m = ey7Var2.m();
                        ci7 ci7Var = this.b;
                        if (!ci7Var.a(m)) {
                            this.i = 0;
                            this.h = (byte) 1;
                        } else {
                            this.m = ci7Var.c;
                            if (!this.j) {
                                this.l = (ci7Var.g * 1000000) / ci7Var.d;
                                jo4 jo4Var = new jo4();
                                jo4Var.a = this.g;
                                jo4Var.r = dg7.n(this.e);
                                jo4Var.s = dg7.n(ci7Var.b);
                                jo4Var.t = 4096;
                                jo4Var.M = ci7Var.e;
                                jo4Var.O = ci7Var.d;
                                jo4Var.d = this.c;
                                jo4Var.f = this.d;
                                this.f.g(new ko4(jo4Var));
                                this.j = true;
                            }
                            ey7Var2.N(0);
                            this.f.e(4, ey7Var2);
                            this.h = (byte) 2;
                        }
                    }
                }
            } else {
                byte[] bArr = ey7Var.a;
                int i3 = ey7Var.b;
                int i4 = ey7Var.c;
                while (true) {
                    if (i3 < i4) {
                        byte b2 = bArr[i3];
                        if ((b2 & 255) == 255) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (this.k && (b2 & 224) == 224) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.k = z;
                        if (z2) {
                            ey7Var.N(i3 + 1);
                            this.k = false;
                            ey7Var2.a[1] = bArr[i3];
                            this.i = 2;
                            this.h = (byte) 1;
                            break;
                        }
                        i3++;
                    } else {
                        ey7Var.N(i4);
                        break;
                    }
                }
            }
        }
    }

    @Override
    public final void d() {
        this.h = (byte) 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }

    @Override
    public final void g(int i, long j) {
        this.n = j;
    }

    @Override
    public final void h(g84 g84Var, l6c l6cVar) {
        l6cVar.a();
        l6cVar.b();
        this.g = l6cVar.e;
        l6cVar.b();
        this.f = g84Var.e0(l6cVar.d, 1);
    }

    @Override
    public final void e() {
    }

    @Override
    public final void f() {
    }
}
