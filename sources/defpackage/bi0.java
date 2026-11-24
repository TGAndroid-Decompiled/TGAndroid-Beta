package defpackage;
public final class bi0 implements r76 {
    public final r76 a;
    public byte b = 0;
    public int c = -1;
    public int d = -1;

    public bi0(r76 r76Var) {
        this.a = r76Var;
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
    public final void C0(int i, int i2) {
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

    @Override
    public final void O0(int i, int i2) {
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

    public final void a() {
        byte b = this.b;
        if (b == 0) {
            return;
        }
        r76 r76Var = this.a;
        if (b != 1) {
            if (b != 2) {
                if (b == 3) {
                    r76Var.O0(this.c, this.d);
                }
            } else {
                r76Var.C0(this.c, this.d);
            }
        } else {
            r76Var.C(this.c, this.d);
        }
        this.b = (byte) 0;
    }

    @Override
    public final void l(int i, int i2) {
        a();
        this.a.l(i, i2);
    }
}
