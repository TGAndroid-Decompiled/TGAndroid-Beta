package hi;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
public final class d implements Runnable {
    public final int f12929a;
    public final k f12930b;

    public d(k kVar, int i10) {
        this.f12929a = i10;
        this.f12930b = kVar;
    }

    @Override
    public final void run() {
        int i10;
        String f7;
        int i11;
        switch (this.f12929a) {
            case 0:
                k kVar = this.f12930b;
                bi.v vVar = kVar.V;
                if (kVar.f13052a0.end_date == 0) {
                    f7 = null;
                } else {
                    f7 = zg.l.f((i10 - kVar.getConnectionsManager().getCurrentTime()) * 1000);
                }
                vVar.g(f7, true);
                if (kVar.f13052a0.end_date != 0 && kVar.f13055d0) {
                    AndroidUtilities.runOnUIThread(kVar.X, 1000L);
                    return;
                }
                return;
            case 1:
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                k kVar2 = this.f12930b;
                updatestarrefprogram.bot = kVar2.getMessagesController().getInputUser(kVar2.R);
                TL_payments.starRefProgram starrefprogram = kVar2.f13052a0;
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
                org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(kVar2.getParentActivity(), 3, null);
                e2Var.r(150L);
                kVar2.getConnectionsManager().sendRequest(updatestarrefprogram, new b(kVar2, e2Var, 1));
                return;
            default:
                k kVar3 = this.f12930b;
                Activity parentActivity = kVar3.getParentActivity();
                if (!kVar3.Y && kVar3.f13052a0.end_date == 0) {
                    i11 = R.string.AffiliateProgramStartInfoLink;
                } else {
                    i11 = R.string.AffiliateProgramUpdateInfoLink;
                }
                qf.d.r(parentActivity, LocaleController.getString(i11));
                return;
        }
    }
}
