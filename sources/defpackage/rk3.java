package defpackage;
public final class rk3 implements Runnable {
    public final byte a;
    public final zk3 b;

    public rk3(zk3 zk3Var, byte b) {
        this.a = b;
        this.b = zk3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        zk3 zk3Var = this.b;
        switch (b) {
            case 0:
                for (mk3 mk3Var : zk3Var.S.f0) {
                    ((u46) mk3Var.a.getLayoutManager()).u = false;
                }
                return;
            default:
                zk3Var.K();
                return;
        }
    }
}
