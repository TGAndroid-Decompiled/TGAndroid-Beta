package bg;

import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.a21;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
public final class k0 implements Runnable {
    public final int f3312a;
    public final bn f3313b;
    public final long f3314c;

    public k0(long j3, bn bnVar) {
        this.f3312a = 0;
        this.f3314c = j3;
        this.f3313b = bnVar;
    }

    @Override
    public final void run() {
        int i7 = this.f3312a;
        long j3 = this.f3314c;
        bn bnVar = this.f3313b;
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
                bnVar.f46012e6.put(j3, 0);
                a21 a21Var = bnVar.f46034g2;
                if (a21Var != null) {
                    a21Var.setAllTopicsHidden(false);
                }
                if (j3 == bnVar.f46191s4) {
                    bnVar.D0.O(false);
                    return;
                }
                return;
            case 4:
                bn bnVar2 = this.f3313b;
                gc v = lc.v(bnVar2.getParentActivity(), bnVar2, null, 1, this.f3314c, 1, bnVar2.getThemedColor(m6.wj), bnVar2.getThemedColor(m6.yj), 5000, true, null);
                v.f35528k = true;
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
                lc.b0(bnVar).I(2131624227, hd.N0(2131744849, null), org.telegram.messenger.g0.W2(hd.H(',', "StarsGiveawaySentPopupInfo", (int) j3))).k(true);
                return;
        }
    }

    public k0(bn bnVar, long j3, int i7) {
        this.f3312a = i7;
        this.f3313b = bnVar;
        this.f3314c = j3;
    }
}
