package ci;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class f2 implements Utilities.Callback {
    public final int f5316a;
    public final p4 f5317b;

    public f2(p4 p4Var, int i10) {
        this.f5316a = i10;
        this.f5317b = p4Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f5316a) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                p4 p4Var = this.f5317b;
                if (tL_premium_boostsStatus == null) {
                    z9 z9Var = p4Var.J0;
                    if (z9Var != null) {
                        z9Var.f6245k1 = false;
                        z9Var.P();
                        return;
                    }
                    return;
                }
                p4Var.J3 = tL_premium_boostsStatus;
                MessagesController.getInstance(p4Var.C2).getBoostsController().userCanBoostChannel(p4Var.B1, tL_premium_boostsStatus, new ai.o2(6, p4Var, tL_premium_boostsStatus));
                return;
            default:
                long longValue = ((Long) obj).longValue();
                p4 p4Var2 = this.f5317b;
                p4Var2.L3 = longValue;
                u2 u2Var = p4Var2.f5653b2;
                if (u2Var != null) {
                    u2Var.F(true);
                    p4Var2.f5653b2.O1();
                }
                p4Var2.q0(true);
                return;
        }
    }
}
