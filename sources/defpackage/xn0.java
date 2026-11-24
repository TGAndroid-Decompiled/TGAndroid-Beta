package defpackage;

import org.telegram.ui.ProfileActivity;
public final class xn0 implements Runnable {
    public final byte a;
    public final mu1 b;
    public final long c;

    public xn0(long j, mu1 mu1Var) {
        this.a = (byte) 7;
        this.c = j;
        this.b = mu1Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        mu1 mu1Var = this.b;
        long j = this.c;
        switch (b) {
            case 0:
                u21.b0(mu1Var).I(2131624221, k96.M0(2131744855, null), gl.S2(k96.H(',', "StarsGiveawaySentPopupInfo", (int) j))).k(true);
                return;
            case 1:
                mu1Var.W8(j);
                return;
            case 2:
                mu1Var.getMessagesController().Y2(0, j, true);
                return;
            case 3:
                mu1Var.e6.put(j, 0);
                kxb kxbVar = mu1Var.g2;
                if (kxbVar != null) {
                    kxbVar.setAllTopicsHidden(false);
                }
                if (j == mu1Var.s4) {
                    mu1Var.D0.J(false);
                    return;
                }
                return;
            case 4:
                mu1 mu1Var2 = this.b;
                m21 v = u21.v(mu1Var2.getParentActivity(), mu1Var2, null, 1, this.c, 1, mu1Var2.getThemedColor(bkb.vj), mu1Var2.getThemedColor(bkb.xj), 5000, true, null);
                v.k = true;
                v.k(true);
                return;
            case 5:
                mu1Var.presentFragment(mu1.W9(j));
                return;
            case 6:
                mu1Var.presentFragment(ProfileActivity.P2(j));
                return;
            default:
                mu1Var.presentFragment(new ProfileActivity(ls6.k(j, "user_id"), null));
                return;
        }
    }

    public xn0(mu1 mu1Var, long j, byte b) {
        this.a = b;
        this.b = mu1Var;
        this.c = j;
    }
}
