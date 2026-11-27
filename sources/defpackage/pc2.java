package defpackage;
public final class pc2 implements Runnable {
    public final byte a;
    public final vc2 b;

    public pc2(vc2 vc2Var, byte b) {
        this.a = b;
        this.b = vc2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        vc2 vc2Var = this.b;
        switch (b) {
            case 0:
                jn7.f(vc2Var.C.a).k(167, Long.valueOf(vc2Var.c), Long.valueOf(vc2Var.b.id), Boolean.FALSE);
                return;
            case 1:
                vc2Var.E = false;
                vc2Var.d();
                jn7.f(vc2Var.C.a).k(173, new Object[0]);
                return;
            case 2:
            default:
                vc2Var.e();
                return;
        }
    }
}
