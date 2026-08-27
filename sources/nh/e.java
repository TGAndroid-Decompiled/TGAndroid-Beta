package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;

public final class e implements Runnable {

    public final int f18655a;

    public final k f18656b;

    public e(k kVar, int i10) {
        this.f18655a = i10;
        this.f18656b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f18655a) {
            case 0:
                k kVar = this.f18656b;
                hh.p pVar = kVar.P;
                int i10 = kVar.U.end_date;
                pVar.f(i10 == 0 ? null : gg.o.f(((long) (i10 - kVar.getConnectionsManager().getCurrentTime())) * 1000), true);
                if (kVar.U.end_date != 0 && kVar.X) {
                    AndroidUtilities.runOnUIThread(kVar.R, 1000L);
                    break;
                }
                break;
            case 1:
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                k kVar2 = this.f18656b;
                updatestarrefprogram.bot = kVar2.getMessagesController().getInputUser(kVar2.L);
                TL_payments.starRefProgram starrefprogram = kVar2.U;
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
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(kVar2.getParentActivity(), 3, null);
                b2Var.q(150L);
                kVar2.getConnectionsManager().sendRequest(updatestarrefprogram, new b(kVar2, b2Var, 1));
                break;
            default:
                k kVar3 = this.f18656b;
                we.e.s(kVar3.getParentActivity(), LocaleController.getString((kVar3.S || kVar3.U.end_date != 0) ? R.string.AffiliateProgramUpdateInfoLink : R.string.AffiliateProgramStartInfoLink));
                break;
        }
    }
}
