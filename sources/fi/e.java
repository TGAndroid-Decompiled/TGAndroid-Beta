package fi;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
public final class e implements Runnable {
    public final int f9624a;
    public final m f9625b;

    public e(m mVar, int i10) {
        this.f9624a = i10;
        this.f9625b = mVar;
    }

    @Override
    public final void run() {
        int i10;
        String f7;
        int i11;
        switch (this.f9624a) {
            case 0:
                m mVar = this.f9625b;
                ci.p pVar = mVar.T;
                if (mVar.Y.end_date == 0) {
                    f7 = null;
                } else {
                    f7 = yg.l.f((i10 - mVar.getConnectionsManager().getCurrentTime()) * 1000);
                }
                pVar.f(f7, true);
                if (mVar.Y.end_date != 0 && mVar.f9815b0) {
                    AndroidUtilities.runOnUIThread(mVar.V, 1000L);
                    return;
                }
                return;
            case 1:
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                m mVar2 = this.f9625b;
                updatestarrefprogram.bot = mVar2.getMessagesController().getInputUser(mVar2.P);
                TL_payments.starRefProgram starrefprogram = mVar2.Y;
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
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(mVar2.getParentActivity(), 3, null);
                b2Var.q(150L);
                mVar2.getConnectionsManager().sendRequest(updatestarrefprogram, new b(mVar2, b2Var, 1));
                return;
            default:
                m mVar3 = this.f9625b;
                Activity parentActivity = mVar3.getParentActivity();
                if (!mVar3.W && mVar3.Y.end_date == 0) {
                    i11 = R.string.AffiliateProgramStartInfoLink;
                } else {
                    i11 = R.string.AffiliateProgramUpdateInfoLink;
                }
                of.f.s(parentActivity, LocaleController.getString(i11));
                return;
        }
    }
}
