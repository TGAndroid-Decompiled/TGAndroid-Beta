package defpackage;
public final class hc6 implements ed {
    public final byte a;
    public final mf6 b;

    public hc6(mf6 mf6Var, byte b) {
        this.a = b;
        this.b = mf6Var;
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        mf6 mf6Var = this.b;
        switch (b) {
            case 0:
                mf6Var.b[mf6Var.a].e();
                mf6Var.x1(true, true);
                return;
            default:
                mf6Var.m0 = true;
                if (mf6Var.a != 0) {
                    mf6Var.I1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
