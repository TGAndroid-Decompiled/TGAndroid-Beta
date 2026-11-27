package defpackage;
public final class my9 implements m6c {
    public final ly9 a;
    public final ey7 b = new ey7(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public my9(ly9 ly9Var) {
        this.a = ly9Var;
    }

    @Override
    public final void a(int i, ey7 ey7Var) {
        boolean z;
        int i2;
        boolean z2;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = ey7Var.b + ey7Var.A();
        } else {
            i2 = -1;
        }
        if (this.f) {
            if (z) {
                this.f = false;
                ey7Var.N(i2);
                this.d = 0;
            } else {
                return;
            }
        }
        while (ey7Var.a() > 0) {
            int i3 = this.d;
            ey7 ey7Var2 = this.b;
            if (i3 < 3) {
                if (i3 == 0) {
                    int A = ey7Var.A();
                    ey7Var.N(ey7Var.b - 1);
                    if (A == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(ey7Var.a(), 3 - this.d);
                ey7Var.k(this.d, min, ey7Var2.a);
                int i4 = this.d + min;
                this.d = i4;
                if (i4 == 3) {
                    ey7Var2.N(0);
                    ey7Var2.M(3);
                    ey7Var2.O(1);
                    int A2 = ey7Var2.A();
                    int A3 = ey7Var2.A();
                    if ((A2 & 128) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.e = z2;
                    int i5 = (((A2 & 15) << 8) | A3) + 3;
                    this.c = i5;
                    byte[] bArr = ey7Var2.a;
                    if (bArr.length < i5) {
                        ey7Var2.c(Math.min(4098, Math.max(i5, bArr.length << 1)));
                    }
                }
            } else {
                int min2 = Math.min(ey7Var.a(), this.c - this.d);
                ey7Var.k(this.d, min2, ey7Var2.a);
                int i6 = this.d + min2;
                this.d = i6;
                int i7 = this.c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (this.e) {
                        if (gcc.p(0, i7, -1, ey7Var2.a) != 0) {
                            this.f = true;
                            return;
                        }
                        ey7Var2.M(this.c - 4);
                    } else {
                        ey7Var2.M(i7);
                    }
                    ey7Var2.N(0);
                    this.a.b(ey7Var2);
                    this.d = 0;
                }
            }
        }
    }

    @Override
    public final void c(usb usbVar, g84 g84Var, l6c l6cVar) {
        this.a.c(usbVar, g84Var, l6cVar);
        this.f = true;
    }

    @Override
    public final void d() {
        this.f = true;
    }
}
