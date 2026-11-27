package defpackage;
public final class xt4 implements Runnable {
    public final byte a;
    public final au4 b;

    public xt4(au4 au4Var, byte b) {
        this.a = b;
        this.b = au4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        au4 au4Var = this.b;
        switch (b) {
            case 0:
                au4Var.dismiss();
                return;
            default:
                au4Var.F0();
                return;
        }
    }
}
