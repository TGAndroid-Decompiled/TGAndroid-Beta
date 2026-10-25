package di;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class f2 implements Utilities.Callback {
    public final int f8548a;
    public final q4 f8549b;

    public f2(q4 q4Var, int i10) {
        this.f8548a = i10;
        this.f8549b = q4Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f8548a) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                q4 q4Var = this.f8549b;
                if (tL_premium_boostsStatus == null) {
                    y9 y9Var = q4Var.f9047y0;
                    if (y9Var != null) {
                        y9Var.f9441k1 = false;
                        y9Var.P();
                        return;
                    }
                    return;
                }
                q4Var.y3 = tL_premium_boostsStatus;
                MessagesController.getInstance(q4Var.f9021r2).getBoostsController().userCanBoostChannel(q4Var.f9016q1, tL_premium_boostsStatus, new ai.n1(7, q4Var, tL_premium_boostsStatus));
                return;
            default:
                long longValue = ((Long) obj).longValue();
                q4 q4Var2 = this.f8549b;
                q4Var2.A3 = longValue;
                u2 u2Var = q4Var2.Q1;
                if (u2Var != null) {
                    u2Var.G(true);
                    q4Var2.Q1.O1();
                }
                q4Var2.p0(true);
                return;
        }
    }
}
