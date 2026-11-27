package defpackage;
public abstract class due {
    public static int a(zd1 zd1Var, int i, int i2, int i3) {
        boolean z;
        if (Math.max(Math.max(i, i2), i3) <= 31) {
            z = true;
        } else {
            z = false;
        }
        yve.f(z);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        upe.a(upe.a(i4, i5), 1 << i3);
        if (zd1Var.b() >= i) {
            int f = zd1Var.f(i);
            if (f == i4) {
                if (zd1Var.b() >= i2) {
                    int f2 = zd1Var.f(i2);
                    f += f2;
                    if (f2 == i5) {
                        if (zd1Var.b() < i3) {
                            return -1;
                        }
                        return zd1Var.f(i3) + f;
                    }
                } else {
                    return -1;
                }
            }
            return f;
        }
        return -1;
    }

    public static void b(zd1 zd1Var) {
        zd1Var.n(3);
        zd1Var.n(8);
        boolean e = zd1Var.e();
        boolean e2 = zd1Var.e();
        if (e) {
            zd1Var.n(5);
        }
        if (e2) {
            zd1Var.n(6);
        }
    }

    public static void c(zd1 zd1Var) {
        int i;
        int f;
        int f2 = zd1Var.f(2);
        int i2 = 6;
        if (f2 == 0) {
            zd1Var.n(6);
            return;
        }
        int i3 = 5;
        int a = a(zd1Var, 5, 8, 16) + 1;
        if (f2 == 1) {
            zd1Var.n(a * 7);
        } else if (f2 == 2) {
            if (zd1Var.e()) {
                i2 = 8;
                i = 1;
                i3 = 7;
            } else {
                i = 5;
            }
            int i4 = 0;
            while (i4 < a) {
                if (zd1Var.e()) {
                    zd1Var.n(7);
                    f = 0;
                } else {
                    if (zd1Var.f(2) == 3 && zd1Var.f(i3) * i != 0) {
                        zd1Var.m();
                    }
                    f = zd1Var.f(i2) * i;
                    if (f != 0 && f != 180) {
                        zd1Var.m();
                    }
                    zd1Var.m();
                }
                if (f != 0 && f != 180 && zd1Var.e()) {
                    i4++;
                }
                i4++;
            }
        }
    }
}
