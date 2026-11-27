package defpackage;

import android.app.Activity;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
public final class pb implements Runnable {
    public final byte a;
    public final cc b;

    public pb(cc ccVar, byte b) {
        this.a = b;
        this.b = ccVar;
    }

    @Override
    public final void run() {
        int i;
        byte b = this.a;
        String str = null;
        cc ccVar = this.b;
        switch (b) {
            case 0:
                Activity parentActivity = ccVar.getParentActivity();
                if (!ccVar.Z && ccVar.b0.end_date == 0) {
                    i = 2131754320;
                } else {
                    i = 2131754307;
                }
                m01.u(parentActivity, ob6.M0(i, null));
                return;
            case 1:
                ub ubVar = ccVar.W;
                int i2 = ccVar.b0.end_date;
                if (i2 != 0) {
                    str = e3a.f((i2 - ccVar.getConnectionsManager().getCurrentTime()) * 1000);
                }
                ubVar.g(str, true);
                if (ccVar.b0.end_date != 0 && ccVar.e0) {
                    hl.d3(ccVar.Y, 1000L);
                    return;
                }
                return;
            default:
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = ccVar.getMessagesController().o1(ccVar.S);
                TL_payments.starRefProgram starrefprogram = ccVar.b0;
                updatestarrefprogram.commission_permille = starrefprogram.commission_permille;
                int i3 = starrefprogram.duration_months;
                updatestarrefprogram.duration_months = i3;
                int i4 = updatestarrefprogram.flags;
                if (i3 > 0) {
                    updatestarrefprogram.flags = i4 | 1;
                    starrefprogram.duration_months = i3 | 1;
                } else {
                    updatestarrefprogram.flags = i4 & (-2);
                    starrefprogram.duration_months = i3 & (-2);
                }
                id idVar = new id(3, null, ccVar.getParentActivity());
                idVar.q(150L);
                ccVar.getConnectionsManager().sendRequest(updatestarrefprogram, new qb(ccVar, idVar, (byte) 1));
                return;
        }
    }
}
