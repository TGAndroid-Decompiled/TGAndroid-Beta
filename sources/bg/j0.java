package bg;

import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.g11;
import org.telegram.ui.Components.hc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
public final class j0 implements Runnable {
    public final int f3330a;
    public final an f3331b;
    public final long f3332c;

    public j0(long j3, an anVar) {
        this.f3330a = 0;
        this.f3332c = j3;
        this.f3331b = anVar;
    }

    @Override
    public final void run() {
        int i7 = this.f3330a;
        long j3 = this.f3332c;
        an anVar = this.f3331b;
        switch (i7) {
            case 0:
                anVar.presentFragment(new ProfileActivity(a8.p0.j(j3, "user_id"), null));
                return;
            case 1:
                an.v1(j3, anVar);
                return;
            case 2:
                anVar.getMessagesController().V2(0, j3, true);
                return;
            case 3:
                anVar.f43727c6.put(j3, 0);
                g11 g11Var = anVar.f43764f2;
                if (g11Var != null) {
                    g11Var.setAllTopicsHidden(false);
                }
                if (j3 == anVar.f43915r4) {
                    anVar.C0.O(false);
                    return;
                }
                return;
            case 4:
                an anVar2 = this.f3331b;
                cc v = hc.v(anVar2.getParentActivity(), anVar2, null, 1, this.f3332c, 1, anVar2.getThemedColor(k6.tj), anVar2.getThemedColor(k6.vj), 5000, true, null);
                v.f32524k = true;
                v.k(true);
                return;
            case 5:
                anVar.getClass();
                anVar.presentFragment(an.ra(j3));
                return;
            case 6:
                anVar.getClass();
                anVar.presentFragment(ProfileActivity.A4(j3));
                return;
            default:
                hc.a0(anVar).I(2131624226, hd.M0(2131745093, null), org.telegram.messenger.g0.X2(hd.H(',', "StarsGiveawaySentPopupInfo", (int) j3))).k(true);
                return;
        }
    }

    public j0(an anVar, long j3, int i7) {
        this.f3330a = i7;
        this.f3331b = anVar;
        this.f3332c = j3;
    }
}
