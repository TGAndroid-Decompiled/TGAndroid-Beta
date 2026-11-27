package defpackage;
public final class xn8 implements dic {
    public int a = 0;
    public byte b;
    public final zn8 c;

    public xn8(zn8 zn8Var) {
        this.c = zn8Var;
    }

    @Override
    public final void a(int i) {
        int i2 = this.a;
        zn8 zn8Var = this.c;
        ?? r2 = zn8Var.E;
        if (i2 == 0) {
            if (i <= r2) {
                zn8Var.n = (byte) 1;
            } else {
                zn8Var.n = (byte) 2;
            }
            zn8Var.b();
        } else if (i <= r2) {
            this.b = (byte) 1;
        } else {
            this.b = (byte) 2;
        }
    }

    @Override
    public final void b(float f, int i, int i2) {
        zn8 zn8Var = this.c;
        zn8Var.y = i;
        zn8Var.x = f;
        zn8Var.d();
    }

    @Override
    public final void c(int i) {
        this.a = i;
        if (i == 0) {
            byte b = this.b;
            zn8 zn8Var = this.c;
            zn8Var.n = b;
            zn8Var.b();
        }
    }
}
