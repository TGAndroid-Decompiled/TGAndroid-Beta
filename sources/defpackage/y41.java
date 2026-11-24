package defpackage;
public final class y41 implements Runnable {
    public final byte a;
    public final f51 b;

    public y41(f51 f51Var, byte b) {
        this.a = b;
        this.b = f51Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        f51 f51Var = this.b;
        switch (b) {
            case 0:
                f51Var.j0();
                return;
            case 1:
                f51Var.n0();
                return;
            default:
                y41 y41Var = f51Var.e;
                gm.r(y41Var);
                gm.d3(y41Var, 5000L);
                return;
        }
    }
}
