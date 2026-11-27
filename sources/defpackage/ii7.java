package defpackage;
public final class ii7 implements Runnable {
    public final byte a;
    public final qi7 b;

    public ii7(qi7 qi7Var, byte b) {
        this.a = b;
        this.b = qi7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        qi7 qi7Var = this.b;
        switch (b) {
            case 0:
                qi7Var.dismiss();
                return;
            case 1:
                qi7Var.c1(true, false);
                return;
            default:
                qi7Var.c1(true, false);
                return;
        }
    }
}
