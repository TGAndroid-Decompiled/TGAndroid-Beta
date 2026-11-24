package defpackage;
public final class jo1 implements Runnable {
    public final byte a = 1;
    public final mu1 b;
    public final int c;
    public final k27 d;

    public jo1(mu1 mu1Var, int i, k27 k27Var) {
        this.b = mu1Var;
        this.c = i;
        this.d = k27Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        k27 k27Var = this.d;
        int i = this.c;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                mu1Var.D4 = null;
                k27Var.k.replies.read_max_id = i;
                return;
            default:
                u21.b0(mu1Var).c(k96.M0(2131754485, null)).j();
                na7.q1(i).l0(false);
                mu1Var.Na(k27Var);
                mu1Var.Pa(k27Var);
                return;
        }
    }

    public jo1(mu1 mu1Var, k27 k27Var, int i) {
        this.b = mu1Var;
        this.d = k27Var;
        this.c = i;
    }
}
