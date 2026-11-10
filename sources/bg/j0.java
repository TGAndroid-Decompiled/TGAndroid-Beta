package bg;

import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.m11;
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
                cnVar.f44453c6.put(j3, 0);
                m11 m11Var = cnVar.f44490f2;
                if (m11Var != null) {
                    m11Var.setAllTopicsHidden(false);
                }
                if (j3 == cnVar.f44643r4) {
                    cnVar.C0.O(false);
                    return;
                }
                return;
            case 4:
                cn cnVar2 = this.f3331b;
                bc v = gc.v(cnVar2.getParentActivity(), cnVar2, null, 1, this.f3332c, 1, cnVar2.getThemedColor(m6.tj), cnVar2.getThemedColor(m6.vj), 5000, true, null);
                v.f32204k = true;
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
                gc.a0(cnVar).I(2131624226, id.M0(2131745092, null), org.telegram.messenger.g0.X2(id.H(',', "StarsGiveawaySentPopupInfo", (int) j3))).k(true);
                return;
        }
    }

    public j0(cn cnVar, long j3, int i7) {
        this.f3330a = i7;
        this.f3331b = cnVar;
        this.f3332c = j3;
    }
}
