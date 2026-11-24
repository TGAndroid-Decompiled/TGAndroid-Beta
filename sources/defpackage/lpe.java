package defpackage;
public abstract class lpe {
    public static int a(qd1 qd1Var, int i, int i2, int i3) {
        boolean z;
        if (Math.max(Math.max(i, i2), i3) <= 31) {
            z = true;
        } else {
            z = false;
        }
        gre.f(z);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        cle.a(cle.a(i4, i5), 1 << i3);
        if (qd1Var.b() >= i) {
            int f = qd1Var.f(i);
            if (f == i4) {
                if (qd1Var.b() >= i2) {
                    int f2 = qd1Var.f(i2);
                    f += f2;
                    if (f2 == i5) {
                        if (qd1Var.b() < i3) {
                            return -1;
                        }
                        return qd1Var.f(i3) + f;
                    }
                } else {
                    return -1;
                }
            }
            return f;
        }
        return -1;
    }

    public static void b(qd1 qd1Var) {
        qd1Var.n(3);
        qd1Var.n(8);
        boolean e = qd1Var.e();
        boolean e2 = qd1Var.e();
        if (e) {
            qd1Var.n(5);
        }
        if (e2) {
            qd1Var.n(6);
        }
    }

    public static void c(qd1 qd1Var) {
        int i;
        int f;
        int f2 = qd1Var.f(2);
        int i2 = 6;
        if (f2 == 0) {
            qd1Var.n(6);
            return;
        }
        int i3 = 5;
        int a = a(qd1Var, 5, 8, 16) + 1;
        if (f2 == 1) {
            qd1Var.n(a * 7);
        } else if (f2 == 2) {
            if (qd1Var.e()) {
                i2 = 8;
                i = 1;
                i3 = 7;
            } else {
                i = 5;
            }
            int i4 = 0;
            while (i4 < a) {
                if (qd1Var.e()) {
                    qd1Var.n(7);
                    f = 0;
                } else {
                    if (qd1Var.f(2) == 3 && qd1Var.f(i3) * i != 0) {
                        qd1Var.m();
                    }
                    f = qd1Var.f(i2) * i;
                    if (f != 0 && f != 180) {
                        qd1Var.m();
                    }
                    qd1Var.m();
                }
                if (f != 0 && f != 180 && qd1Var.e()) {
                    i4++;
                }
                i4++;
            }
        }
    }
}
