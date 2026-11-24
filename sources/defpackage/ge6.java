package defpackage;
public final class ge6 implements ee {
    public final byte a;
    public final mh6 b;

    public ge6(mh6 mh6Var, byte b) {
        this.a = b;
        this.b = mh6Var;
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        mh6 mh6Var = this.b;
        switch (b) {
            case 0:
                mh6Var.b[mh6Var.a].e();
                mh6Var.y1(true, true);
                return;
            default:
                mh6Var.m0 = true;
                if (mh6Var.a != 0) {
                    mh6Var.J1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
