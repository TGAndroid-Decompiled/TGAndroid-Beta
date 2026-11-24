package defpackage;
public final class r76 implements Runnable {
    public final byte a;
    public final t76 b;

    public r76(t76 t76Var, byte b) {
        this.a = b;
        this.b = t76Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        t76 t76Var = this.b;
        switch (b) {
            case 0:
                t76Var.B();
                return;
            case 1:
                if (!t76Var.w) {
                    t76Var.x();
                    return;
                }
                return;
            case 2:
            case 5:
                t76Var.G();
                return;
            case 3:
                t76Var.A();
                return;
            case 4:
                t76Var.u();
                kk7.f(t76Var.e).k(176, Long.valueOf(t76Var.s.id));
                t76Var.E(true);
                return;
            case 6:
                t76Var.A();
                return;
            case 7:
                t76Var.B();
                return;
            case 8:
                kk7.f(t76Var.e).k(176, Long.valueOf(t76Var.j()));
                return;
            default:
                t76Var.f();
                return;
        }
    }
}
