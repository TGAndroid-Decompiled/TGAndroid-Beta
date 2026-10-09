package ai;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class g3 implements Utilities.Callback {
    public final int f1050a;
    public final f6 f1051b;

    public g3(f6 f6Var, int i10) {
        this.f1050a = i10;
        this.f1051b = f6Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f1050a) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                f6 f6Var = this.f1051b;
                if (tL_premium_boostsStatus == null) {
                    kc kcVar = f6Var.J0;
                    if (kcVar != null) {
                        kcVar.f1279k1 = false;
                        kcVar.P();
                        return;
                    }
                    return;
                }
                f6Var.J3 = tL_premium_boostsStatus;
                MessagesController.getInstance(f6Var.C2).getBoostsController().userCanBoostChannel(f6Var.B1, tL_premium_boostsStatus, new h3(0, f6Var, tL_premium_boostsStatus));
                return;
            default:
                long longValue = ((Long) obj).longValue();
                f6 f6Var2 = this.f1051b;
                f6Var2.L3 = longValue;
                b4 b4Var = f6Var2.f952b2;
                if (b4Var != null) {
                    b4Var.I(true);
                    f6Var2.f952b2.Q1();
                }
                f6Var2.r0(true);
                return;
        }
    }
}
