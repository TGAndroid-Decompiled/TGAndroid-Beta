package defpackage;
public final class lo1 implements Runnable {
    public final byte a;
    public final qy b;

    public lo1(qy qyVar, byte b) {
        this.a = b;
        this.b = qyVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        qy qyVar = this.b;
        switch (b) {
            case 0:
                hl.E3(qyVar);
                return;
            default:
                xg8 xg8Var = (xg8) qyVar.g2;
                wb2 wb2Var = xg8Var.n;
                if (wb2Var != null && wb2Var.getDelegate() != null) {
                    xg8Var.n.getDelegate().l1(xg8Var.n, false);
                    return;
                }
                return;
        }
    }
}
