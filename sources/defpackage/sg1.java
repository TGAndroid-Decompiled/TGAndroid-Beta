package defpackage;
public final class sg1 implements Runnable {
    public final byte a;
    public final nh1 b;

    public sg1(nh1 nh1Var, byte b) {
        this.a = b;
        this.b = nh1Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        nh1 nh1Var = this.b;
        switch (b) {
            case 0:
                nh1Var.X0();
                return;
            default:
                nh1Var.getClass();
                ir2.v(null, 2131752248, u21.b0(nh1Var), 2131624000, 36);
                return;
        }
    }
}
