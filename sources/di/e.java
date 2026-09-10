package di;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
public final class e implements Runnable {
    public final int f6592a;
    public final m f6593b;

    public e(m mVar, int i10) {
        this.f6592a = i10;
        this.f6593b = mVar;
    }

    @Override
    public final void run() {
        int i10;
        String f7;
        int i11;
        switch (this.f6592a) {
            case 0:
                m mVar = this.f6593b;
                ai.w wVar = mVar.T;
                if (mVar.Y.end_date == 0) {
                    f7 = null;
                } else {
                    f7 = wg.k.f((i10 - mVar.getConnectionsManager().getCurrentTime()) * 1000);
                }
                wVar.f(f7, true);
                if (mVar.Y.end_date != 0 && mVar.f6754b0) {
                    AndroidUtilities.runOnUIThread(mVar.V, 1000L);
                    return;
                }
                return;
            case 1:
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                m mVar2 = this.f6593b;
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
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(mVar2.getParentActivity(), 3, null);
                d2Var.q(150L);
                mVar2.getConnectionsManager().sendRequest(updatestarrefprogram, new b(mVar2, d2Var, 1));
                return;
            default:
                m mVar3 = this.f6593b;
                Activity parentActivity = mVar3.getParentActivity();
                if (!mVar3.W && mVar3.Y.end_date == 0) {
                    i11 = R.string.AffiliateProgramStartInfoLink;
                } else {
                    i11 = R.string.AffiliateProgramUpdateInfoLink;
                }
                nf.f.s(parentActivity, LocaleController.getString(i11));
                return;
        }
    }
}
