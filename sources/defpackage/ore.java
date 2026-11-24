package defpackage;
public abstract class ore {
    public static int a(ye1 ye1Var, int i, int i2, int i3) {
        boolean z;
        if (Math.max(Math.max(i, i2), i3) <= 31) {
            z = true;
        } else {
            z = false;
        }
        jte.f(z);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        ene.a(ene.a(i4, i5), 1 << i3);
        if (ye1Var.b() >= i) {
            int f = ye1Var.f(i);
            if (f == i4) {
                if (ye1Var.b() >= i2) {
                    int f2 = ye1Var.f(i2);
                    f += f2;
                    if (f2 == i5) {
                        if (ye1Var.b() < i3) {
                            return -1;
                        }
                        return ye1Var.f(i3) + f;
                    }
                } else {
                    return -1;
                }
            }
            return f;
        }
        return -1;
    }

    public static void b(ye1 ye1Var) {
        ye1Var.n(3);
        ye1Var.n(8);
        boolean e = ye1Var.e();
        boolean e2 = ye1Var.e();
        if (e) {
            ye1Var.n(5);
        }
        if (e2) {
            ye1Var.n(6);
        }
    }

    public static void c(ye1 ye1Var) {
        int i;
        int f;
        int f2 = ye1Var.f(2);
        int i2 = 6;
        if (f2 == 0) {
            ye1Var.n(6);
            return;
        }
        int i3 = 5;
        int a = a(ye1Var, 5, 8, 16) + 1;
        if (f2 == 1) {
            ye1Var.n(a * 7);
        } else if (f2 == 2) {
            if (ye1Var.e()) {
                i2 = 8;
                i = 1;
                i3 = 7;
            } else {
                i = 5;
            }
            int i4 = 0;
            while (i4 < a) {
                if (ye1Var.e()) {
                    ye1Var.n(7);
                    f = 0;
                } else {
                    if (ye1Var.f(2) == 3 && ye1Var.f(i3) * i != 0) {
                        ye1Var.m();
                    }
                    f = ye1Var.f(i2) * i;
                    if (f != 0 && f != 180) {
                        ye1Var.m();
                    }
                    ye1Var.m();
                }
                if (f != 0 && f != 180 && ye1Var.e()) {
                    i4++;
                }
                i4++;
            }
        }
    }
}
