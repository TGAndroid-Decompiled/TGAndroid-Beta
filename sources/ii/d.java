package ii;

import android.app.Activity;
import org.telegram.messenger.bd;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
public final class d implements Runnable {
    public final int f14885a;
    public final k f14886b;

    public d(k kVar, int i3) {
        this.f14885a = i3;
        this.f14886b = kVar;
    }

    @Override
    public final void run() {
        int i3;
        int i10;
        int i11 = this.f14885a;
        String str = null;
        k kVar = this.f14886b;
        switch (i11) {
            case 0:
                ai.x xVar = kVar.W;
                if (kVar.f15034b0.end_date != 0) {
                    str = bh.p.f((i3 - kVar.getConnectionsManager().getCurrentTime()) * 1000);
                }
                xVar.g(str, true);
                if (kVar.f15034b0.end_date != 0 && kVar.f15037e0) {
                    org.telegram.messenger.g0.i3(kVar.Y, 1000L);
                    return;
                }
                return;
            case 1:
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = kVar.getMessagesController().o1(kVar.S);
                TL_payments.starRefProgram starrefprogram = kVar.f15034b0;
                updatestarrefprogram.commission_permille = starrefprogram.commission_permille;
                int i12 = starrefprogram.duration_months;
                updatestarrefprogram.duration_months = i12;
                if (i12 > 0) {
                    updatestarrefprogram.flags |= 1;
                    starrefprogram.duration_months = i12 | 1;
                } else {
                    updatestarrefprogram.flags &= -2;
                    starrefprogram.duration_months = i12 & (-2);
                }
                org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, kVar.getParentActivity(), null);
                s1Var.r(150L);
                kVar.getConnectionsManager().sendRequest(updatestarrefprogram, new b(kVar, s1Var, 1));
                return;
            default:
                Activity parentActivity = kVar.getParentActivity();
                if (!kVar.Z && kVar.f15034b0.end_date == 0) {
                    i10 = 2131754327;
                } else {
                    i10 = 2131754314;
                }
                sf.c.t(parentActivity, bd.M0(i10, null));
                return;
        }
    }
}
