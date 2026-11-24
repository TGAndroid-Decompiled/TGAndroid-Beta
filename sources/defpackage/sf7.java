package defpackage;
public final class sf7 implements gu3 {
    public final xu7 a;
    public final tf7 b;
    public final String c;
    public final int d;
    public final String e;
    public wxb f;
    public String g;
    public byte h = 0;
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public long n;

    public sf7(String str, int i, String str2) {
        xu7 xu7Var = new xu7(4);
        this.a = xu7Var;
        xu7Var.a[0] = -1;
        this.b = new Object();
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override
    public final void b(xu7 xu7Var) {
        boolean z;
        boolean z2;
        this.f.getClass();
        while (xu7Var.a() > 0) {
            byte b = this.h;
            xu7 xu7Var2 = this.a;
            boolean z3 = true;
            if (b != 0) {
                if (b != 1) {
                    if (b == 2) {
                        int min = Math.min(xu7Var.a(), this.m - this.i);
                        this.f.e(min, xu7Var);
                        int i = this.i + min;
                        this.i = i;
                        if (i >= this.m) {
                            if (this.n == -9223372036854775807L) {
                                z3 = false;
                            }
                            gre.p(z3);
                            this.f.a(this.n, 1, this.m, 0, null);
                            this.n += this.l;
                            this.i = 0;
                            this.h = (byte) 0;
                        }
                    } else {
                        sdb.a();
                        return;
                    }
                } else {
                    int min2 = Math.min(xu7Var.a(), 4 - this.i);
                    xu7Var.k(this.i, min2, xu7Var2.a);
                    int i2 = this.i + min2;
                    this.i = i2;
                    if (i2 >= 4) {
                        xu7Var2.N(0);
                        int m = xu7Var2.m();
                        tf7 tf7Var = this.b;
                        if (!tf7Var.a(m)) {
                            this.i = 0;
                            this.h = (byte) 1;
                        } else {
                            this.m = tf7Var.c;
                            if (!this.j) {
                                this.l = (tf7Var.g * 1000000) / tf7Var.d;
                                em4 em4Var = new em4();
                                em4Var.a = this.g;
                                em4Var.r = ud7.n(this.e);
                                em4Var.s = ud7.n(tf7Var.b);
                                em4Var.t = 4096;
                                em4Var.M = tf7Var.e;
                                em4Var.O = tf7Var.d;
                                em4Var.d = this.c;
                                em4Var.f = this.d;
                                this.f.g(new fm4(em4Var));
                                this.j = true;
                            }
                            xu7Var2.N(0);
                            this.f.e(4, xu7Var2);
                            this.h = (byte) 2;
                        }
                    }
                }
            } else {
                byte[] bArr = xu7Var.a;
                int i3 = xu7Var.b;
                int i4 = xu7Var.c;
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
                            xu7Var.N(i3 + 1);
                            this.k = false;
                            xu7Var2.a[1] = bArr[i3];
                            this.i = 2;
                            this.h = (byte) 1;
                            break;
                        }
                        i3++;
                    } else {
                        xu7Var.N(i4);
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
    public final void h(l74 l74Var, l2c l2cVar) {
        l2cVar.a();
        l2cVar.b();
        this.g = l2cVar.e;
        l2cVar.b();
        this.f = l74Var.S(l2cVar.d, 1);
    }

    @Override
    public final void e() {
    }

    @Override
    public final void f() {
    }
}
