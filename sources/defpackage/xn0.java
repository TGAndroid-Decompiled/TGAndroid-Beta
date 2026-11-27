package defpackage;

import org.telegram.ui.ProfileActivity;
public final class xn0 implements Runnable {
    public final byte a;
    public final zu1 b;
    public final long c;

    public xn0(long j, zu1 zu1Var) {
        this.a = (byte) 7;
        this.c = j;
        this.b = zu1Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        zu1 zu1Var = this.b;
        long j = this.c;
        switch (b) {
            case 0:
                d31.b0(zu1Var).I(2131624221, ob6.M0(2131744749, null), hl.S2(ob6.H(',', "StarsGiveawaySentPopupInfo", (int) j))).k(true);
                return;
            case 1:
                zu1Var.getMessagesController().e3(0, j, true);
                return;
            case 2:
                zu1Var.e6.put(j, 0);
                l1c l1cVar = zu1Var.g2;
                if (l1cVar != null) {
                    l1cVar.setAllTopicsHidden(false);
                }
                if (j == zu1Var.s4) {
                    zu1Var.D0.J(false);
                    return;
                }
                return;
            case 3:
                zu1 zu1Var2 = this.b;
                v21 v = d31.v(zu1Var2.getParentActivity(), zu1Var2, null, 1, this.c, 1, zu1Var2.getThemedColor(aob.wj), zu1Var2.getThemedColor(aob.yj), 5000, true, null);
                v.k = true;
                v.k(true);
                return;
            case 4:
                zu1Var.presentFragment(zu1.ha(j));
                return;
            case 5:
                zu1Var.presentFragment(ProfileActivity.Q2(j));
                return;
            case 6:
                zu1Var.h9(j);
                return;
            default:
                zu1Var.presentFragment(new ProfileActivity(qu6.k(j, "user_id"), null));
                return;
        }
    }

    public xn0(zu1 zu1Var, long j, byte b) {
        this.a = b;
        this.b = zu1Var;
        this.c = j;
    }
}
