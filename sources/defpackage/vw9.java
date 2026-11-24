package defpackage;
public final class vw9 implements m4c {
    public final uw9 a;
    public final yw7 b = new yw7(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public vw9(uw9 uw9Var) {
        this.a = uw9Var;
    }

    @Override
    public final void a(int i, yw7 yw7Var) {
        boolean z;
        int i2;
        boolean z2;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = yw7Var.b + yw7Var.A();
        } else {
            i2 = -1;
        }
        if (this.f) {
            if (z) {
                this.f = false;
                yw7Var.N(i2);
                this.d = 0;
            } else {
                return;
            }
        }
        while (yw7Var.a() > 0) {
            int i3 = this.d;
            yw7 yw7Var2 = this.b;
            if (i3 < 3) {
                if (i3 == 0) {
                    int A = yw7Var.A();
                    yw7Var.N(yw7Var.b - 1);
                    if (A == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(yw7Var.a(), 3 - this.d);
                yw7Var.k(this.d, min, yw7Var2.a);
                int i4 = this.d + min;
                this.d = i4;
                if (i4 == 3) {
                    yw7Var2.N(0);
                    yw7Var2.M(3);
                    yw7Var2.O(1);
                    int A2 = yw7Var2.A();
                    int A3 = yw7Var2.A();
                    if ((A2 & 128) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.e = z2;
                    int i5 = (((A2 & 15) << 8) | A3) + 3;
                    this.c = i5;
                    byte[] bArr = yw7Var2.a;
                    if (bArr.length < i5) {
                        yw7Var2.c(Math.min(4098, Math.max(i5, bArr.length << 1)));
                    }
                }
            } else {
                int min2 = Math.min(yw7Var.a(), this.c - this.d);
                yw7Var.k(this.d, min2, yw7Var2.a);
                int i6 = this.d + min2;
                this.d = i6;
                int i7 = this.c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (this.e) {
                        if (hac.p(0, i7, -1, yw7Var2.a) != 0) {
                            this.f = true;
                            return;
                        }
                        yw7Var2.M(this.c - 4);
                    } else {
                        yw7Var2.M(i7);
                    }
                    yw7Var2.N(0);
                    this.a.b(yw7Var2);
                    this.d = 0;
                }
            }
        }
    }

    @Override
    public final void c(vqb vqbVar, u84 u84Var, l4c l4cVar) {
        this.a.c(vqbVar, u84Var, l4cVar);
        this.f = true;
    }

    @Override
    public final void d() {
        this.f = true;
    }
}
