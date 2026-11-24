package defpackage;
public final class c82 implements Runnable {
    public final byte a;
    public final su3 b;

    public c82(su3 su3Var, byte b) {
        this.a = b;
        this.b = su3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        su3 su3Var = this.b;
        switch (b) {
            case 0:
                ru3 ru3Var = su3Var.d;
                ru3Var.requestFocus();
                gm.E3(ru3Var);
                return;
            default:
                gm.t1(su3Var.d);
                return;
        }
    }
}
