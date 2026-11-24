package defpackage;
public abstract class n76 {
    public final co7 a;
    public boolean b;
    public int c = -1;
    public final hh7 d;

    public n76(hh7 hh7Var, co7 co7Var) {
        this.d = hh7Var;
        this.a = co7Var;
    }

    public final void a(boolean z) {
        int i;
        boolean z2;
        boolean z3;
        if (z != this.b) {
            this.b = z;
            if (z) {
                i = 1;
            } else {
                i = -1;
            }
            hh7 hh7Var = this.d;
            int i2 = hh7Var.c;
            hh7Var.c = i + i2;
            if (!hh7Var.d) {
                hh7Var.d = true;
                while (true) {
                    try {
                        int i3 = hh7Var.c;
                        if (i2 == i3) {
                            break;
                        }
                        if (i2 == 0 && i3 > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (i2 > 0 && i3 == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z2) {
                            hh7Var.e();
                        } else if (z3) {
                            hh7Var.f();
                        }
                        i2 = i3;
                    } finally {
                        hh7Var.d = false;
                    }
                }
            }
            if (this.b) {
                hh7Var.c(this);
            }
        }
    }

    public boolean d(e16 e16Var) {
        return false;
    }

    public boolean e() {
        return true;
    }

    public void c() {
    }
}
