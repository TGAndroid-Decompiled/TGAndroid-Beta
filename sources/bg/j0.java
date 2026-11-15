package bg;

import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.p11;
import org.telegram.ui.Components.xb;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
public final class j0 implements Runnable {
    public final int f3285a;
    public final an f3286b;
    public final long f3287c;

    public j0(long j3, an anVar) {
        this.f3285a = 0;
        this.f3287c = j3;
        this.f3286b = anVar;
    }

    @Override
    public final void run() {
        int i7 = this.f3285a;
        long j3 = this.f3287c;
        an anVar = this.f3286b;
        switch (i7) {
            case 0:
                anVar.presentFragment(new ProfileActivity(a8.p0.j(j3, "user_id"), null));
                return;
            case 1:
                an.z1(j3, anVar);
                return;
            case 2:
                anVar.getMessagesController().V2(0, j3, true);
                return;
            case 3:
                anVar.f45166d6.put(j3, 0);
                p11 p11Var = anVar.f45202g2;
                if (p11Var != null) {
                    p11Var.setAllTopicsHidden(false);
                }
                if (j3 == anVar.f45358s4) {
                    anVar.D0.O(false);
                    return;
                }
                return;
            case 4:
                an anVar2 = this.f3286b;
                xb v = cc.v(anVar2.getParentActivity(), anVar2, null, 1, this.f3287c, 1, anVar2.getThemedColor(j6.wj), anVar2.getThemedColor(j6.yj), 5000, true, null);
                v.f41644k = true;
                v.k(true);
                return;
            case 5:
                anVar.getClass();
                anVar.presentFragment(an.ua(j3));
                return;
            case 6:
                anVar.getClass();
                anVar.presentFragment(ProfileActivity.C4(j3));
                return;
            default:
                cc.a0(anVar).I(2131624227, hd.M0(2131745092, null), org.telegram.messenger.g0.X2(hd.H(',', "StarsGiveawaySentPopupInfo", (int) j3))).k(true);
                return;
        }
    }

    public j0(an anVar, long j3, int i7) {
        this.f3285a = i7;
        this.f3286b = anVar;
        this.f3287c = j3;
    }
}
