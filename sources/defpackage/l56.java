package defpackage;
public final class l56 implements Runnable {
    public final byte a;
    public final s56 b;

    public l56(s56 s56Var, byte b) {
        this.a = b;
        this.b = s56Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        s56 s56Var = this.b;
        switch (b) {
            case 0:
                l11.u(s56Var.getParentActivity(), jb6.M0(2131745889, null));
                return;
            case 1:
                s56Var.r.d.requestFocus();
                gm.E3(s56Var.r.d);
                return;
            default:
                s56Var.r.d.clearFocus();
                gm.t1(s56Var.r.d);
                return;
        }
    }
}
