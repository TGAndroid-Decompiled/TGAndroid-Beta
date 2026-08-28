package mh;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
public final class e implements Runnable {
    public final int f17809a;
    public final l f17810b;

    public e(l lVar, int i9) {
        this.f17809a = i9;
        this.f17810b = lVar;
    }

    @Override
    public final void run() {
        int i9;
        String f10;
        int i10;
        switch (this.f17809a) {
            case 0:
                l lVar = this.f17810b;
                gh.p pVar = lVar.P;
                if (lVar.U.end_date == 0) {
                    f10 = null;
                } else {
                    f10 = fg.p.f((i9 - lVar.getConnectionsManager().getCurrentTime()) * 1000);
                }
                pVar.f(f10, true);
                if (lVar.U.end_date != 0 && lVar.X) {
                    AndroidUtilities.runOnUIThread(lVar.R, 1000L);
                    return;
                }
                return;
            case 1:
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                l lVar2 = this.f17810b;
                updatestarrefprogram.bot = lVar2.getMessagesController().getInputUser(lVar2.L);
                TL_payments.starRefProgram starrefprogram = lVar2.U;
                updatestarrefprogram.commission_permille = starrefprogram.commission_permille;
                int i11 = starrefprogram.duration_months;
                updatestarrefprogram.duration_months = i11;
                if (i11 > 0) {
                    updatestarrefprogram.flags |= 1;
                    starrefprogram.duration_months = i11 | 1;
                } else {
                    updatestarrefprogram.flags &= -2;
                    starrefprogram.duration_months = i11 & (-2);
                }
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(lVar2.getParentActivity(), 3, null);
                c2Var.q(150L);
                lVar2.getConnectionsManager().sendRequest(updatestarrefprogram, new b(lVar2, c2Var, 1));
                return;
            default:
                l lVar3 = this.f17810b;
                Activity parentActivity = lVar3.getParentActivity();
                if (!lVar3.S && lVar3.U.end_date == 0) {
                    i10 = R.string.AffiliateProgramStartInfoLink;
                } else {
                    i10 = R.string.AffiliateProgramUpdateInfoLink;
                }
                ve.e.s(parentActivity, LocaleController.getString(i10));
                return;
        }
    }
}
