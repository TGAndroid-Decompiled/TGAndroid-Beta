package defpackage;

import org.telegram.ui.ActionBar.d;
public final class wp1 extends bl0 {
    public final byte s;
    public final mu1 w;

    public wp1(mu1 mu1Var, wjb wjbVar, int i, byte b) {
        super(i, wjbVar);
        this.s = b;
        this.w = mu1Var;
    }

    @Override
    public final int t1() {
        int i;
        int i2;
        byte b = this.s;
        mu1 mu1Var = this.w;
        switch (b) {
            case 0:
                i = ((d) mu1Var).currentAccount;
                if (!nod.d(i, mu1Var.Ba)) {
                    return bm2.o(mu1Var.getThemedColor(bkb.Ie), 255);
                }
                ku1 ku1Var = mu1Var.Ba;
                if (ku1Var != null && !ku1Var.a()) {
                    a();
                    return bm2.o(this.d, 216);
                }
                a();
                return this.d;
            case 1:
                return mu1Var.x.t1();
            default:
                i2 = ((d) mu1Var).currentAccount;
                if (!nod.d(i2, mu1Var.Ba)) {
                    return bm2.o(mu1Var.getThemedColor(bkb.c6), 255);
                }
                ku1 ku1Var2 = mu1Var.Ba;
                if (ku1Var2 != null && !ku1Var2.a()) {
                    a();
                    return bm2.o(this.d, 216);
                }
                a();
                return this.d;
        }
    }
}
