package defpackage;
public final class vp5 implements Runnable {
    public final byte a;
    public final yp5 b;

    public vp5(yp5 yp5Var, byte b) {
        this.a = b;
        this.b = yp5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        yp5 yp5Var = this.b;
        switch (b) {
            case 0:
                u11 u11Var = yp5Var.A;
                if (u11Var != null) {
                    yp5Var.a.g(u11Var);
                    yp5Var.A = null;
                    return;
                }
                return;
            default:
                yp5Var.a(null, true, null);
                return;
        }
    }
}
