package mg;

import org.telegram.messenger.cd;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.o21;
import org.telegram.ui.Components.wb;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.un;
public final class t0 implements Runnable {
    public final int f13237a;
    public final un f13238b;
    public final long f13239c;

    public t0(long j10, un unVar) {
        this.f13237a = 7;
        this.f13239c = j10;
        this.f13238b = unVar;
    }

    @Override
    public final void run() {
        int i10 = this.f13237a;
        un unVar = this.f13238b;
        long j10 = this.f13239c;
        switch (i10) {
            case 0:
                cc.a0(unVar).I(2131624224, cd.L0(2131745110, null), org.telegram.messenger.i0.W2(cd.H(',', "StarsGiveawaySentPopupInfo", (int) j10))).k(true);
                return;
            case 1:
                un.v1(j10, unVar);
                return;
            case 2:
                unVar.getMessagesController().T2(0, j10, true);
                return;
            case 3:
                unVar.f42212c6.put(j10, 0);
                o21 o21Var = unVar.f42246f2;
                if (o21Var != null) {
                    o21Var.setAllTopicsHidden(false);
                }
                if (j10 == unVar.f42394r4) {
                    unVar.C0.O(false);
                    return;
                }
                return;
            case 4:
                un unVar2 = this.f13238b;
                wb v = cc.v(unVar2.getParentActivity(), unVar2, null, 1, this.f13239c, 1, unVar2.getThemedColor(t6.tj), unVar2.getThemedColor(t6.vj), 5000, true, null);
                v.f32136k = true;
                v.k(true);
                return;
            case 5:
                unVar.getClass();
                unVar.presentFragment(un.ha(j10));
                return;
            case 6:
                unVar.getClass();
                unVar.presentFragment(ProfileActivity.z4(j10));
                return;
            default:
                unVar.presentFragment(new ProfileActivity(org.telegram.ui.Cells.f1.k(j10, "user_id"), null));
                return;
        }
    }

    public t0(un unVar, long j10, int i10) {
        this.f13237a = i10;
        this.f13238b = unVar;
        this.f13239c = j10;
    }
}
