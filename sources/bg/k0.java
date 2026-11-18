package bg;

import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.z11;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
public final class k0 implements Runnable {
    public final int f3293a;
    public final bn f3294b;
    public final long f3295c;

    public k0(long j3, bn bnVar) {
        this.f3293a = 0;
        this.f3295c = j3;
        this.f3294b = bnVar;
    }

    @Override
    public final void run() {
        int i7 = this.f3293a;
        long j3 = this.f3295c;
        bn bnVar = this.f3294b;
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
                bnVar.f45985e6.put(j3, 0);
                z11 z11Var = bnVar.f46007g2;
                if (z11Var != null) {
                    z11Var.setAllTopicsHidden(false);
                }
                if (j3 == bnVar.f46164s4) {
                    bnVar.D0.O(false);
                    return;
                }
                return;
            case 4:
                bn bnVar2 = this.f3294b;
                gc v = lc.v(bnVar2.getParentActivity(), bnVar2, null, 1, this.f3295c, 1, bnVar2.getThemedColor(n6.wj), bnVar2.getThemedColor(n6.yj), 5000, true, null);
                v.f35462k = true;
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
                lc.b0(bnVar).I(2131624227, gd.M0(2131744857, null), org.telegram.messenger.g0.W2(gd.H(',', "StarsGiveawaySentPopupInfo", (int) j3))).k(true);
                return;
        }
    }

    public k0(bn bnVar, long j3, int i7) {
        this.f3293a = i7;
        this.f3294b = bnVar;
        this.f3295c = j3;
    }
}
