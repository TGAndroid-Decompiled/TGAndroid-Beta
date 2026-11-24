package defpackage;
public final class vh7 implements rv3 {
    public final yw7 a;
    public final wh7 b;
    public final String c;
    public final int d;
    public final String e;
    public yzb f;
    public String g;
    public byte h = 0;
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public long n;

    public vh7(String str, int i, String str2) {
        yw7 yw7Var = new yw7(4);
        this.a = yw7Var;
        yw7Var.a[0] = -1;
        this.b = new Object();
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override
    public final void b(yw7 yw7Var) {
        boolean z;
        boolean z2;
        this.f.getClass();
        while (yw7Var.a() > 0) {
            byte b = this.h;
            yw7 yw7Var2 = this.a;
            boolean z3 = true;
            if (b != 0) {
                if (b != 1) {
                    if (b == 2) {
                        int min = Math.min(yw7Var.a(), this.m - this.i);
                        this.f.e(min, yw7Var);
                        int i = this.i + min;
                        this.i = i;
                        if (i >= this.m) {
                            if (this.n == -9223372036854775807L) {
                                z3 = false;
                            }
                            jte.p(z3);
                            this.f.a(this.n, 1, this.m, 0, null);
                            this.n += this.l;
                            this.i = 0;
                            this.h = (byte) 0;
                        }
                    } else {
                        rjb.h();
                        return;
                    }
                } else {
                    int min2 = Math.min(yw7Var.a(), 4 - this.i);
                    yw7Var.k(this.i, min2, yw7Var2.a);
                    int i2 = this.i + min2;
                    this.i = i2;
                    if (i2 >= 4) {
                        yw7Var2.N(0);
                        int m = yw7Var2.m();
                        wh7 wh7Var = this.b;
                        if (!wh7Var.a(m)) {
                            this.i = 0;
                            this.h = (byte) 1;
                        } else {
                            this.m = wh7Var.c;
                            if (!this.j) {
                                this.l = (wh7Var.g * 1000000) / wh7Var.d;
                                fo4 fo4Var = new fo4();
                                fo4Var.a = this.g;
                                fo4Var.r = wf7.n(this.e);
                                fo4Var.s = wf7.n(wh7Var.b);
                                fo4Var.t = 4096;
                                fo4Var.M = wh7Var.e;
                                fo4Var.O = wh7Var.d;
                                fo4Var.d = this.c;
                                fo4Var.f = this.d;
                                this.f.g(new go4(fo4Var));
                                this.j = true;
                            }
                            yw7Var2.N(0);
                            this.f.e(4, yw7Var2);
                            this.h = (byte) 2;
                        }
                    }
                }
            } else {
                byte[] bArr = yw7Var.a;
                int i3 = yw7Var.b;
                int i4 = yw7Var.c;
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
                            yw7Var.N(i3 + 1);
                            this.k = false;
                            yw7Var2.a[1] = bArr[i3];
                            this.i = 2;
                            this.h = (byte) 1;
                            break;
                        }
                        i3++;
                    } else {
                        yw7Var.N(i4);
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
    public final void h(u84 u84Var, l4c l4cVar) {
        l4cVar.a();
        l4cVar.b();
        this.g = l4cVar.e;
        l4cVar.b();
        this.f = u84Var.c0(l4cVar.d, 1);
    }

    @Override
    public final void e() {
    }

    @Override
    public final void f() {
    }
}
