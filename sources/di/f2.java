package di;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class f2 implements Utilities.Callback {
    public final int f8547a;
    public final q4 f8548b;

    public f2(q4 q4Var, int i10) {
        this.f8547a = i10;
        this.f8548b = q4Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f8547a) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                q4 q4Var = this.f8548b;
                if (tL_premium_boostsStatus == null) {
                    y9 y9Var = q4Var.f9046y0;
                    if (y9Var != null) {
                        y9Var.f9440k1 = false;
                        y9Var.Q();
                        return;
                    }
                    return;
                }
                q4Var.y3 = tL_premium_boostsStatus;
                MessagesController.getInstance(q4Var.f9020r2).getBoostsController().userCanBoostChannel(q4Var.f9015q1, tL_premium_boostsStatus, new ai.n1(7, q4Var, tL_premium_boostsStatus));
                return;
            default:
                long longValue = ((Long) obj).longValue();
                q4 q4Var2 = this.f8548b;
                q4Var2.A3 = longValue;
                u2 u2Var = q4Var2.Q1;
                if (u2Var != null) {
                    u2Var.F(true);
                    q4Var2.Q1.O1();
                }
                q4Var2.p0(true);
                return;
        }
    }
}
