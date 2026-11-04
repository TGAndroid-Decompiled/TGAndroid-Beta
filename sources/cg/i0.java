package cg;

import org.telegram.messenger.bd;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.g11;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.wm;
public final class i0 implements Runnable {
    public final int f4695a;
    public final wm f4696b;
    public final long f4697c;

    public i0(long j10, wm wmVar) {
        this.f4695a = 0;
        this.f4697c = j10;
        this.f4696b = wmVar;
    }

    @Override
    public final void run() {
        int i3 = this.f4695a;
        long j10 = this.f4697c;
        wm wmVar = this.f4696b;
        switch (i3) {
            case 0:
                wmVar.presentFragment(new ProfileActivity(a1.g.j(j10, "user_id"), null));
                return;
            case 1:
                wm.v1(j10, wmVar);
                return;
            case 2:
                wmVar.getMessagesController().V2(0, j10, true);
                return;
            case 3:
                wmVar.f51284d6.put(j10, 0);
                g11 g11Var = wmVar.f51323g2;
                if (g11Var != null) {
                    g11Var.setAllTopicsHidden(false);
                }
                if (j10 == wmVar.f51475s4) {
                    wmVar.D0.O(false);
                    return;
                }
                return;
            case 4:
                wm wmVar2 = this.f4696b;
                ac v = fc.v(wmVar2.getParentActivity(), wmVar2, null, 1, this.f4697c, 1, wmVar2.getThemedColor(k6.tj), wmVar2.getThemedColor(k6.vj), 5000, true, null);
                v.f31793k = true;
                v.k(true);
                return;
            case 5:
                wmVar.getClass();
                wmVar.presentFragment(wm.ra(j10));
                return;
            case 6:
                wmVar.getClass();
                wmVar.presentFragment(ProfileActivity.A4(j10));
                return;
            default:
                fc.a0(wmVar).I(2131624226, bd.M0(2131745102, null), org.telegram.messenger.g0.X2(bd.H(',', "StarsGiveawaySentPopupInfo", (int) j10))).k(true);
                return;
        }
    }

    public i0(wm wmVar, long j10, int i3) {
        this.f4695a = i3;
        this.f4696b = wmVar;
        this.f4697c = j10;
    }
}
