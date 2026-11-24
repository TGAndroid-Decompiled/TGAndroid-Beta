package defpackage;
public final class l36 implements Runnable {
    public final byte a;
    public final s36 b;

    public l36(s36 s36Var, byte b) {
        this.a = b;
        this.b = s36Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        s36 s36Var = this.b;
        switch (b) {
            case 0:
                d01.t(s36Var.getParentActivity(), k96.M0(2131745963, null));
                return;
            case 1:
                s36Var.r.d.requestFocus();
                gl.E3(s36Var.r.d);
                return;
            default:
                s36Var.r.d.clearFocus();
                gl.t1(s36Var.r.d);
                return;
        }
    }
}
