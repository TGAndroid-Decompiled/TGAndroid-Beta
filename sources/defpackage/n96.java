package defpackage;
public abstract class n96 {
    public final fq7 a;
    public boolean b;
    public int c = -1;
    public final kj7 d;

    public n96(kj7 kj7Var, fq7 fq7Var) {
        this.d = kj7Var;
        this.a = fq7Var;
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
            kj7 kj7Var = this.d;
            int i2 = kj7Var.c;
            kj7Var.c = i + i2;
            if (!kj7Var.d) {
                kj7Var.d = true;
                while (true) {
                    try {
                        int i3 = kj7Var.c;
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
                            kj7Var.e();
                        } else if (z3) {
                            kj7Var.f();
                        }
                        i2 = i3;
                    } finally {
                        kj7Var.d = false;
                    }
                }
            }
            if (this.b) {
                kj7Var.c(this);
            }
        }
    }

    public boolean d(e36 e36Var) {
        return false;
    }

    public boolean e() {
        return true;
    }

    public void c() {
    }
}
