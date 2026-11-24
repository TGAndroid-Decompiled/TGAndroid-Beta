package defpackage;

import org.telegram.ui.ActionBar.d;
public final class jr1 extends bm0 {
    public final byte s;
    public final yv1 w;

    public jr1(yv1 yv1Var, ylb ylbVar, int i, byte b) {
        super(i, ylbVar);
        this.s = b;
        this.w = yv1Var;
    }

    @Override
    public final int K1() {
        int i;
        int i2;
        byte b = this.s;
        yv1 yv1Var = this.w;
        switch (b) {
            case 0:
                i = ((d) yv1Var).currentAccount;
                if (!qqd.d(i, yv1Var.Ba)) {
                    return on2.p(yv1Var.getThemedColor(cmb.Ie), 255);
                }
                wv1 wv1Var = yv1Var.Ba;
                if (wv1Var != null && !wv1Var.a()) {
                    a();
                    return on2.p(this.d, 216);
                }
                a();
                return this.d;
            case 1:
                return yv1Var.x.K1();
            default:
                i2 = ((d) yv1Var).currentAccount;
                if (!qqd.d(i2, yv1Var.Ba)) {
                    return on2.p(yv1Var.getThemedColor(cmb.c6), 255);
                }
                wv1 wv1Var2 = yv1Var.Ba;
                if (wv1Var2 != null && !wv1Var2.a()) {
                    a();
                    return on2.p(this.d, 216);
                }
                a();
                return this.d;
        }
    }
}
