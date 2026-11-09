package bg;

import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.n11;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cn;
public final class j0 implements Runnable {
    public final int f3330a;
    public final cn f3331b;
    public final long f3332c;

    public j0(long j3, cn cnVar) {
        this.f3330a = 0;
        this.f3332c = j3;
        this.f3331b = cnVar;
    }

    @Override
    public final void run() {
        int i7 = this.f3330a;
        long j3 = this.f3332c;
        cn cnVar = this.f3331b;
        switch (i7) {
            case 0:
                cnVar.presentFragment(new ProfileActivity(a8.p0.j(j3, "user_id"), null));
                return;
            case 1:
                cn.z1(j3, cnVar);
                return;
            case 2:
                cnVar.getMessagesController().V2(0, j3, true);
                return;
            case 3:
                cnVar.f44412c6.put(j3, 0);
                n11 n11Var = cnVar.f44449f2;
                if (n11Var != null) {
                    n11Var.setAllTopicsHidden(false);
                }
                if (j3 == cnVar.f44602r4) {
                    cnVar.C0.O(false);
                    return;
                }
                return;
            case 4:
                cn cnVar2 = this.f3331b;
                cc v = hc.v(cnVar2.getParentActivity(), cnVar2, null, 1, this.f3332c, 1, cnVar2.getThemedColor(l6.tj), cnVar2.getThemedColor(l6.vj), 5000, true, null);
                v.f32628k = true;
                v.k(true);
                return;
            case 5:
                cnVar.getClass();
                cnVar.presentFragment(cn.ta(j3));
                return;
            case 6:
                cnVar.getClass();
                cnVar.presentFragment(ProfileActivity.D4(j3));
                return;
            default:
                hc.a0(cnVar).I(2131624226, id.M0(2131745092, null), org.telegram.messenger.g0.X2(id.H(',', "StarsGiveawaySentPopupInfo", (int) j3))).k(true);
                return;
        }
    }

    public j0(cn cnVar, long j3, int i7) {
        this.f3330a = i7;
        this.f3331b = cnVar;
        this.f3332c = j3;
    }
}
