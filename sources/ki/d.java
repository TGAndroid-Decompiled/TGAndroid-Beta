package ki;

import android.app.Activity;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
public final class d implements Runnable {
    public final int f18620a;
    public final k f18621b;

    public d(k kVar, int i7) {
        this.f18620a = i7;
        this.f18621b = kVar;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        int i11 = this.f18620a;
        String str = null;
        k kVar = this.f18621b;
        switch (i11) {
            case 0:
                bi.s sVar = kVar.W;
                if (kVar.f18740b0.end_date != 0) {
                    str = ah.r.f((i7 - kVar.getConnectionsManager().getCurrentTime()) * 1000);
                }
                sVar.g(str, true);
                if (kVar.f18740b0.end_date != 0 && kVar.f18743e0) {
                    org.telegram.messenger.g0.h3(kVar.Y, 1000L);
                    return;
                }
                return;
            case 1:
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = kVar.getMessagesController().q1(kVar.S);
                TL_payments.starRefProgram starrefprogram = kVar.f18740b0;
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
                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, kVar.getParentActivity(), null);
                u1Var.r(150L);
                kVar.getConnectionsManager().sendRequest(updatestarrefprogram, new b(kVar, u1Var, 1));
                return;
            default:
                Activity parentActivity = kVar.getParentActivity();
                if (!kVar.Z && kVar.f18740b0.end_date == 0) {
                    i10 = 2131754325;
                } else {
                    i10 = 2131754312;
                }
                vf.c.t(parentActivity, gd.M0(i10, null));
                return;
        }
    }
}
