package bi;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class u2 implements Utilities.Callback {
    public final int f3780a;
    public final q5 f3781b;

    public u2(q5 q5Var, int i10) {
        this.f3780a = i10;
        this.f3781b = q5Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f3780a) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                q5 q5Var = this.f3781b;
                if (tL_premium_boostsStatus == null) {
                    sb sbVar = q5Var.J0;
                    if (sbVar != null) {
                        sbVar.f3689k1 = false;
                        sbVar.P();
                        return;
                    }
                    return;
                }
                q5Var.J3 = tL_premium_boostsStatus;
                MessagesController.getInstance(q5Var.C2).getBoostsController().userCanBoostChannel(q5Var.B1, tL_premium_boostsStatus, new v2(0, q5Var, tL_premium_boostsStatus));
                return;
            default:
                long longValue = ((Long) obj).longValue();
                q5 q5Var2 = this.f3781b;
                q5Var2.L3 = longValue;
                q3 q3Var = q5Var2.f3512b2;
                if (q3Var != null) {
                    q3Var.I(true);
                    q5Var2.f3512b2.O1();
                }
                q5Var2.r0(true);
                return;
        }
    }
}
