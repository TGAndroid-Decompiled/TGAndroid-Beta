package defpackage;
public final class yj3 implements Runnable {
    public final byte a;
    public final gk3 b;

    public yj3(gk3 gk3Var, byte b) {
        this.a = b;
        this.b = gk3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        gk3 gk3Var = this.b;
        switch (b) {
            case 0:
                for (tj3 tj3Var : gk3Var.S.f0) {
                    ((x46) tj3Var.a.getLayoutManager()).u = false;
                }
                return;
            default:
                gk3Var.K();
                return;
        }
    }
}
