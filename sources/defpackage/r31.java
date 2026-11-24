package defpackage;
public final class r31 implements Runnable {
    public final byte a;
    public final y31 b;

    public r31(y31 y31Var, byte b) {
        this.a = b;
        this.b = y31Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        y31 y31Var = this.b;
        switch (b) {
            case 0:
                y31Var.i0();
                return;
            case 1:
                y31Var.m0();
                return;
            default:
                r31 r31Var = y31Var.e;
                gl.r(r31Var);
                gl.e3(r31Var, 5000L);
                return;
        }
    }
}
