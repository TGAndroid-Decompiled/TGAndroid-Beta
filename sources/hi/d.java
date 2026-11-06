package hi;

import android.app.Activity;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
public final class d implements Runnable {
    public final int f14598a;
    public final j f14599b;

    public d(j jVar, int i7) {
        this.f14598a = i7;
        this.f14599b = jVar;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        int i11 = this.f14598a;
        String str = null;
        j jVar = this.f14599b;
        switch (i11) {
            case 0:
                bi.w wVar = jVar.V;
                if (jVar.f14729a0.end_date != 0) {
                    str = ah.r.f((i7 - jVar.getConnectionsManager().getCurrentTime()) * 1000);
                }
                wVar.g(str, true);
                if (jVar.f14729a0.end_date != 0 && jVar.f14732d0) {
                    org.telegram.messenger.g0.i3(jVar.X, 1000L);
                    return;
                }
                return;
            case 1:
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = jVar.getMessagesController().o1(jVar.R);
                TL_payments.starRefProgram starrefprogram = jVar.f14729a0;
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
                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, jVar.getParentActivity(), null);
                u1Var.r(150L);
                jVar.getConnectionsManager().sendRequest(updatestarrefprogram, new b(jVar, u1Var, 1));
                return;
            default:
                Activity parentActivity = jVar.getParentActivity();
                if (!jVar.Y && jVar.f14729a0.end_date == 0) {
                    i10 = 2131754327;
                } else {
                    i10 = 2131754314;
                }
                vf.c.t(parentActivity, hd.M0(i10, null));
                return;
        }
    }
}
