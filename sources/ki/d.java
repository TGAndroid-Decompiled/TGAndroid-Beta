package ki;

import android.app.Activity;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
public final class d implements Runnable {
    public final int f18248a;
    public final k f18249b;

    public d(k kVar, int i7) {
        this.f18248a = i7;
        this.f18249b = kVar;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        int i11 = this.f18248a;
        String str = null;
        k kVar = this.f18249b;
        switch (i11) {
            case 0:
                bi.s sVar = kVar.W;
                if (kVar.f18378b0.end_date != 0) {
                    str = ah.r.f((i7 - kVar.getConnectionsManager().getCurrentTime()) * 1000);
                }
                sVar.g(str, true);
                if (kVar.f18378b0.end_date != 0 && kVar.f18381e0) {
                    org.telegram.messenger.g0.i3(kVar.Y, 1000L);
                    return;
                }
                return;
            case 1:
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = kVar.getMessagesController().o1(kVar.S);
                TL_payments.starRefProgram starrefprogram = kVar.f18378b0;
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
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, kVar.getParentActivity(), null);
                t1Var.r(150L);
                kVar.getConnectionsManager().sendRequest(updatestarrefprogram, new b(kVar, t1Var, 1));
                return;
            default:
                Activity parentActivity = kVar.getParentActivity();
                if (!kVar.Z && kVar.f18378b0.end_date == 0) {
                    i10 = 2131754327;
                } else {
                    i10 = 2131754314;
                }
                vf.c.t(parentActivity, hd.M0(i10, null));
                return;
        }
    }
}
