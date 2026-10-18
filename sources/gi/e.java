package gi;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
public final class e implements Runnable {
    public final int f11172a;
    public final l f11173b;

    public e(l lVar, int i10) {
        this.f11172a = i10;
        this.f11173b = lVar;
    }

    @Override
    public final void run() {
        int i10;
        String f7;
        int i11;
        switch (this.f11172a) {
            case 0:
                l lVar = this.f11173b;
                ai.v vVar = lVar.T;
                if (lVar.Y.end_date == 0) {
                    f7 = null;
                } else {
                    f7 = yg.k.f((i10 - lVar.getConnectionsManager().getCurrentTime()) * 1000);
                }
                vVar.f(f7, true);
                if (lVar.Y.end_date != 0 && lVar.f11310b0) {
                    AndroidUtilities.runOnUIThread(lVar.V, 1000L);
                    return;
                }
                return;
            case 1:
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                l lVar2 = this.f11173b;
                updatestarrefprogram.bot = lVar2.getMessagesController().getInputUser(lVar2.P);
                TL_payments.starRefProgram starrefprogram = lVar2.Y;
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
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(lVar2.getParentActivity(), 3, null);
                b2Var.q(150L);
                lVar2.getConnectionsManager().sendRequest(updatestarrefprogram, new b(lVar2, b2Var, 1));
                return;
            default:
                l lVar3 = this.f11173b;
                Activity parentActivity = lVar3.getParentActivity();
                if (!lVar3.W && lVar3.Y.end_date == 0) {
                    i11 = R.string.AffiliateProgramStartInfoLink;
                } else {
                    i11 = R.string.AffiliateProgramUpdateInfoLink;
                }
                pf.d.r(parentActivity, LocaleController.getString(i11));
                return;
        }
    }
}
