package bg;

import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.b21;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
public final class k0 implements Runnable {
    public final int f3305a;
    public final bn f3306b;
    public final long f3307c;

    public k0(long j3, bn bnVar) {
        this.f3305a = 0;
        this.f3307c = j3;
        this.f3306b = bnVar;
    }

    @Override
    public final void run() {
        int i7 = this.f3305a;
        long j3 = this.f3307c;
        bn bnVar = this.f3306b;
        switch (i7) {
            case 0:
                bnVar.presentFragment(new ProfileActivity(a8.p0.j(j3, "user_id"), null));
                return;
            case 1:
                bn.z1(j3, bnVar);
                return;
            case 2:
                bnVar.getMessagesController().b3(0, j3, true);
                return;
            case 3:
                bnVar.f46008e6.put(j3, 0);
                b21 b21Var = bnVar.f46030g2;
                if (b21Var != null) {
                    b21Var.setAllTopicsHidden(false);
                }
                if (j3 == bnVar.f46187s4) {
                    bnVar.D0.O(false);
                    return;
                }
                return;
            case 4:
                bn bnVar2 = this.f3306b;
                gc v = lc.v(bnVar2.getParentActivity(), bnVar2, null, 1, this.f3307c, 1, bnVar2.getThemedColor(m6.wj), bnVar2.getThemedColor(m6.yj), 5000, true, null);
                v.f35509k = true;
                v.k(true);
                return;
            case 5:
                bnVar.getClass();
                bnVar.presentFragment(bn.ua(j3));
                return;
            case 6:
                bnVar.getClass();
                bnVar.presentFragment(ProfileActivity.D4(j3));
                return;
            default:
                lc.b0(bnVar).I(2131624227, gd.N0(2131744851, null), org.telegram.messenger.g0.W2(gd.H(',', "StarsGiveawaySentPopupInfo", (int) j3))).k(true);
                return;
        }
    }

    public k0(bn bnVar, long j3, int i7) {
        this.f3305a = i7;
        this.f3306b = bnVar;
        this.f3307c = j3;
    }
}
