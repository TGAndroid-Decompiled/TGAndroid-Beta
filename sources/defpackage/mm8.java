package defpackage;
public final class mm8 implements egc {
    public int a = 0;
    public byte b;
    public final om8 c;

    public mm8(om8 om8Var) {
        this.c = om8Var;
    }

    @Override
    public final void a(int i) {
        int i2 = this.a;
        om8 om8Var = this.c;
        ?? r2 = om8Var.E;
        if (i2 == 0) {
            if (i <= r2) {
                om8Var.n = (byte) 1;
            } else {
                om8Var.n = (byte) 2;
            }
            om8Var.b();
        } else if (i <= r2) {
            this.b = (byte) 1;
        } else {
            this.b = (byte) 2;
        }
    }

    @Override
    public final void b(float f, int i, int i2) {
        om8 om8Var = this.c;
        om8Var.y = i;
        om8Var.x = f;
        om8Var.d();
    }

    @Override
    public final void c(int i) {
        this.a = i;
        if (i == 0) {
            byte b = this.b;
            om8 om8Var = this.c;
            om8Var.n = b;
            om8Var.b();
        }
    }
}
