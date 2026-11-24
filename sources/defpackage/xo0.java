package defpackage;

import org.telegram.ui.ProfileActivity;
public final class xo0 implements Runnable {
    public final byte a;
    public final yv1 b;
    public final long c;

    public xo0(long j, yv1 yv1Var) {
        this.a = (byte) 7;
        this.c = j;
        this.b = yv1Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        yv1 yv1Var = this.b;
        long j = this.c;
        switch (b) {
            case 0:
                c41.b0(yv1Var).I(2131624221, jb6.M0(2131744781, null), gm.S2(jb6.H(',', "StarsGiveawaySentPopupInfo", (int) j))).k(true);
                return;
            case 1:
                yv1Var.g9(j);
                return;
            case 2:
                yv1Var.getMessagesController().a3(0, j, true);
                return;
            case 3:
                yv1Var.presentFragment(yv1.ga(j));
                return;
            case 4:
                yv1Var.presentFragment(ProfileActivity.S2(j));
                return;
            case 5:
                yv1Var.e6.put(j, 0);
                mzb mzbVar = yv1Var.g2;
                if (mzbVar != null) {
                    mzbVar.setAllTopicsHidden(false);
                }
                if (j == yv1Var.s4) {
                    yv1Var.D0.J(false);
                    return;
                }
                return;
            case 6:
                yv1 yv1Var2 = this.b;
                u31 v = c41.v(yv1Var2.getParentActivity(), yv1Var2, null, 1, this.c, 1, yv1Var2.getThemedColor(cmb.vj), yv1Var2.getThemedColor(cmb.xj), 5000, true, null);
                v.k = true;
                v.k(true);
                return;
            default:
                yv1Var.presentFragment(new ProfileActivity(kt6.k(j, "user_id"), null));
                return;
        }
    }

    public xo0(yv1 yv1Var, long j, byte b) {
        this.a = b;
        this.b = yv1Var;
        this.c = j;
    }
}
