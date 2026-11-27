package defpackage;
public final class ch0 implements v76 {
    public final v76 a;
    public byte b = 0;
    public int c = -1;
    public int d = -1;

    public ch0(v76 v76Var) {
        this.a = v76Var;
    }

    @Override
    public final void C(int i, int i2) {
        int i3;
        if (this.b == 1 && i >= (i3 = this.c)) {
            int i4 = this.d;
            if (i <= i3 + i4) {
                this.d = i4 + i2;
                this.c = Math.min(i, i3);
                return;
            }
        }
        a();
        this.c = i;
        this.d = i2;
        this.b = (byte) 1;
    }

    @Override
    public final void X(int i, int i2) {
        int i3;
        if (this.b == 2 && (i3 = this.c) >= i && i3 <= i + i2) {
            this.d += i2;
            this.c = i;
            return;
        }
        a();
        this.c = i;
        this.d = i2;
        this.b = (byte) 2;
    }

    public final void a() {
        byte b = this.b;
        if (b == 0) {
            return;
        }
        v76 v76Var = this.a;
        if (b != 1) {
            if (b != 2) {
                if (b == 3) {
                    v76Var.x0(this.c, this.d);
                }
            } else {
                v76Var.X(this.c, this.d);
            }
        } else {
            v76Var.C(this.c, this.d);
        }
        this.b = (byte) 0;
    }

    @Override
    public final void n(int i, int i2) {
        a();
        this.a.n(i, i2);
    }

    @Override
    public final void x0(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.b == 3 && i <= (i4 = this.d + (i3 = this.c)) && (i5 = i + i2) >= i3) {
            this.c = Math.min(i, i3);
            this.d = Math.max(i4, i5) - this.c;
            return;
        }
        a();
        this.c = i;
        this.d = i2;
        this.b = (byte) 3;
    }
}
