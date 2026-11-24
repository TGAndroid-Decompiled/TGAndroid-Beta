package defpackage;
public final class zb2 implements Runnable {
    public final byte a;
    public final fc2 b;

    public zb2(fc2 fc2Var, byte b) {
        this.a = b;
        this.b = fc2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        fc2 fc2Var = this.b;
        switch (b) {
            case 0:
                kk7.f(fc2Var.C.a).k(166, Long.valueOf(fc2Var.c), Long.valueOf(fc2Var.b.id), Boolean.FALSE);
                return;
            case 1:
                fc2Var.E = false;
                fc2Var.d();
                kk7.f(fc2Var.C.a).k(172, new Object[0]);
                return;
            case 2:
            default:
                fc2Var.e();
                return;
        }
    }
}
