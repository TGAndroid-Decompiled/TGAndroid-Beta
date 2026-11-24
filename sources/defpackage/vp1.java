package defpackage;
public final class vp1 implements Runnable {
    public final byte a = 1;
    public final yv1 b;
    public final int c;
    public final k47 d;

    public vp1(yv1 yv1Var, int i, k47 k47Var) {
        this.b = yv1Var;
        this.c = i;
        this.d = k47Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        k47 k47Var = this.d;
        int i = this.c;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                yv1Var.D4 = null;
                k47Var.k.replies.read_max_id = i;
                return;
            default:
                c41.b0(yv1Var).c(jb6.M0(2131754485, null)).j();
                oc7.r1(i).l0(false);
                yv1Var.Za(k47Var);
                yv1Var.bb(k47Var);
                return;
        }
    }

    public vp1(yv1 yv1Var, k47 k47Var, int i) {
        this.b = yv1Var;
        this.d = k47Var;
        this.c = i;
    }
}
