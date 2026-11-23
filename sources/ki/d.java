package ki;

import android.app.Activity;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
public final class d implements Runnable {
    public final int f18711a;
    public final j f18712b;

    public d(j jVar, int i7) {
        this.f18711a = i7;
        this.f18712b = jVar;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        int i11 = this.f18711a;
        String str = null;
        j jVar = this.f18712b;
        switch (i11) {
            case 0:
                bi.s sVar = jVar.W;
                if (jVar.f18815b0.end_date != 0) {
                    str = ah.r.f((i7 - jVar.getConnectionsManager().getCurrentTime()) * 1000);
                }
                sVar.g(str, true);
                if (jVar.f18815b0.end_date != 0 && jVar.f18818e0) {
                    org.telegram.messenger.g0.h3(jVar.Y, 1000L);
                    return;
                }
                return;
            case 1:
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = jVar.getMessagesController().q1(jVar.S);
                TL_payments.starRefProgram starrefprogram = jVar.f18815b0;
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
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, jVar.getParentActivity(), null);
                t1Var.r(150L);
                jVar.getConnectionsManager().sendRequest(updatestarrefprogram, new b(jVar, t1Var, 1));
                return;
            default:
                Activity parentActivity = jVar.getParentActivity();
                if (!jVar.Z && jVar.f18815b0.end_date == 0) {
                    i10 = 2131754324;
                } else {
                    i10 = 2131754311;
                }
                vf.c.t(parentActivity, gd.N0(i10, null));
                return;
        }
    }
}
