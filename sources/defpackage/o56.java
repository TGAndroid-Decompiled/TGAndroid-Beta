package defpackage;
public final class o56 implements Runnable {
    public final byte a;
    public final v56 b;

    public o56(v56 v56Var, byte b) {
        this.a = b;
        this.b = v56Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        v56 v56Var = this.b;
        switch (b) {
            case 0:
                m01.u(v56Var.getParentActivity(), ob6.M0(2131745883, null));
                return;
            case 1:
                v56Var.r.d.requestFocus();
                hl.E3(v56Var.r.d);
                return;
            default:
                v56Var.r.d.clearFocus();
                hl.t1(v56Var.r.d);
                return;
        }
    }
}
