package defpackage;
public final class ja9 implements Runnable {
    public final byte a;
    public final pa9 b;

    public ja9(pa9 pa9Var, byte b) {
        this.a = b;
        this.b = pa9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        pa9 pa9Var = this.b;
        switch (b) {
            case 0:
                oa9 oa9Var = pa9Var.a;
                if (oa9Var != null) {
                    oa9Var.u();
                    return;
                }
                return;
            case 1:
                pa9Var.c.a(pa9Var.r);
                na9 na9Var = pa9Var.d;
                na9Var.getClass();
                na9Var.postRunnable(new ma9(na9Var, (byte) 1));
                pa9Var.d = null;
                return;
            default:
                pa9Var.c.q(pa9Var.y);
                return;
        }
    }
}
