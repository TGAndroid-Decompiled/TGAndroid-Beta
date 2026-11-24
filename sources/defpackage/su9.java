package defpackage;
public final class su9 implements m2c {
    public final ru9 a;
    public final xu7 b = new xu7(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public su9(ru9 ru9Var) {
        this.a = ru9Var;
    }

    @Override
    public final void a(int i, xu7 xu7Var) {
        boolean z;
        int i2;
        boolean z2;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = xu7Var.b + xu7Var.A();
        } else {
            i2 = -1;
        }
        if (this.f) {
            if (z) {
                this.f = false;
                xu7Var.N(i2);
                this.d = 0;
            } else {
                return;
            }
        }
        while (xu7Var.a() > 0) {
            int i3 = this.d;
            xu7 xu7Var2 = this.b;
            if (i3 < 3) {
                if (i3 == 0) {
                    int A = xu7Var.A();
                    xu7Var.N(xu7Var.b - 1);
                    if (A == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(xu7Var.a(), 3 - this.d);
                xu7Var.k(this.d, min, xu7Var2.a);
                int i4 = this.d + min;
                this.d = i4;
                if (i4 == 3) {
                    xu7Var2.N(0);
                    xu7Var2.M(3);
                    xu7Var2.O(1);
                    int A2 = xu7Var2.A();
                    int A3 = xu7Var2.A();
                    if ((A2 & 128) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.e = z2;
                    int i5 = (((A2 & 15) << 8) | A3) + 3;
                    this.c = i5;
                    byte[] bArr = xu7Var2.a;
                    if (bArr.length < i5) {
                        xu7Var2.c(Math.min(4098, Math.max(i5, bArr.length << 1)));
                    }
                }
            } else {
                int min2 = Math.min(xu7Var.a(), this.c - this.d);
                xu7Var.k(this.d, min2, xu7Var2.a);
                int i6 = this.d + min2;
                this.d = i6;
                int i7 = this.c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (this.e) {
                        if (g8c.p(0, i7, -1, xu7Var2.a) != 0) {
                            this.f = true;
                            return;
                        }
                        xu7Var2.M(this.c - 4);
                    } else {
                        xu7Var2.M(i7);
                    }
                    xu7Var2.N(0);
                    this.a.b(xu7Var2);
                    this.d = 0;
                }
            }
        }
    }

    @Override
    public final void c(uob uobVar, l74 l74Var, l2c l2cVar) {
        this.a.c(uobVar, l74Var, l2cVar);
        this.f = true;
    }

    @Override
    public final void d() {
        this.f = true;
    }
}
