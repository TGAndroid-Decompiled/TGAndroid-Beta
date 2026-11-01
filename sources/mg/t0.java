package mg;

import org.telegram.messenger.dd;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.p21;
import org.telegram.ui.Components.wb;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.un;
public final class t0 implements Runnable {
    public final int f13238a;
    public final un f13239b;
    public final long f13240c;

    public t0(long j10, un unVar) {
        this.f13238a = 7;
        this.f13240c = j10;
        this.f13239b = unVar;
    }

    @Override
    public final void run() {
        int i10 = this.f13238a;
        un unVar = this.f13239b;
        long j10 = this.f13240c;
        switch (i10) {
            case 0:
                cc.a0(unVar).I(2131624224, dd.L0(2131745110, null), org.telegram.messenger.i0.W2(dd.H(',', "StarsGiveawaySentPopupInfo", (int) j10))).k(true);
                return;
            case 1:
                un.s1(j10, unVar);
                return;
            case 2:
                unVar.getMessagesController().T2(0, j10, true);
                return;
            case 3:
                un unVar2 = this.f13239b;
                wb v = cc.v(unVar2.getParentActivity(), unVar2, null, 1, this.f13240c, 1, unVar2.getThemedColor(t6.tj), unVar2.getThemedColor(t6.vj), 5000, true, null);
                v.f32202k = true;
                v.k(true);
                return;
            case 4:
                unVar.f42023c6.put(j10, 0);
                p21 p21Var = unVar.f42057f2;
                if (p21Var != null) {
                    p21Var.setAllTopicsHidden(false);
                }
                if (j10 == unVar.f42205r4) {
                    unVar.C0.O(false);
                    return;
                }
                return;
            case 5:
                unVar.getClass();
                unVar.presentFragment(un.ma(j10));
                return;
            case 6:
                unVar.getClass();
                unVar.presentFragment(ProfileActivity.A4(j10));
                return;
            default:
                unVar.presentFragment(new ProfileActivity(org.telegram.ui.Cells.f1.k(j10, "user_id"), null));
                return;
        }
    }

    public t0(un unVar, long j10, int i10) {
        this.f13238a = i10;
        this.f13239b = unVar;
        this.f13240c = j10;
    }
}
