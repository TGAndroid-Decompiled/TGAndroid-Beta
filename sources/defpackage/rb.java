package defpackage;

import android.app.Activity;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
public final class rb implements Runnable {
    public final byte a;
    public final bc b;

    public rb(bc bcVar, byte b) {
        this.a = b;
        this.b = bcVar;
    }

    @Override
    public final void run() {
        int i;
        byte b = this.a;
        String str = null;
        bc bcVar = this.b;
        switch (b) {
            case 0:
                tb tbVar = bcVar.W;
                int i2 = bcVar.b0.end_date;
                if (i2 != 0) {
                    str = m1a.f((i2 - bcVar.getConnectionsManager().getCurrentTime()) * 1000);
                }
                tbVar.g(str, true);
                if (bcVar.b0.end_date != 0 && bcVar.e0) {
                    gm.d3(bcVar.Y, 1000L);
                    return;
                }
                return;
            case 1:
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = bcVar.getMessagesController().n1(bcVar.S);
                TL_payments.starRefProgram starrefprogram = bcVar.b0;
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
                he heVar = new he(3, null, bcVar.getParentActivity());
                heVar.q(150L);
                bcVar.getConnectionsManager().sendRequest(updatestarrefprogram, new ob(bcVar, heVar, (byte) 1));
                return;
            default:
                Activity parentActivity = bcVar.getParentActivity();
                if (!bcVar.Z && bcVar.b0.end_date == 0) {
                    i = 2131754324;
                } else {
                    i = 2131754311;
                }
                l11.u(parentActivity, jb6.M0(i, null));
                return;
        }
    }
}
