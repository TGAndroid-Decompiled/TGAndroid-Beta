package ci;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class g2 implements Utilities.Callback {
    public final int f5415a;
    public final q4 f5416b;

    public g2(q4 q4Var, int i10) {
        this.f5415a = i10;
        this.f5416b = q4Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f5415a) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                q4 q4Var = this.f5416b;
                if (tL_premium_boostsStatus == null) {
                    aa aaVar = q4Var.J0;
                    if (aaVar != null) {
                        aaVar.f5201k1 = false;
                        aaVar.P();
                        return;
                    }
                    return;
                }
                q4Var.J3 = tL_premium_boostsStatus;
                MessagesController.getInstance(q4Var.C2).getBoostsController().userCanBoostChannel(q4Var.B1, tL_premium_boostsStatus, new ai.n2(6, q4Var, tL_premium_boostsStatus));
                return;
            default:
                long longValue = ((Long) obj).longValue();
                q4 q4Var2 = this.f5416b;
                q4Var2.L3 = longValue;
                v2 v2Var = q4Var2.f5768b2;
                if (v2Var != null) {
                    v2Var.I(true);
                    q4Var2.f5768b2.Q1();
                }
                q4Var2.r0(true);
                return;
        }
    }
}
