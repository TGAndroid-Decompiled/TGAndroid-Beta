package ai;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class g3 implements Utilities.Callback {
    public final int f1048a;
    public final f6 f1049b;

    public g3(f6 f6Var, int i10) {
        this.f1048a = i10;
        this.f1049b = f6Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f1048a) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                f6 f6Var = this.f1049b;
                if (tL_premium_boostsStatus == null) {
                    kc kcVar = f6Var.J0;
                    if (kcVar != null) {
                        kcVar.f1277k1 = false;
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
                f6 f6Var2 = this.f1049b;
                f6Var2.L3 = longValue;
                b4 b4Var = f6Var2.f950b2;
                if (b4Var != null) {
                    b4Var.L(true);
                    f6Var2.f950b2.U1();
                }
                f6Var2.r0(true);
                return;
        }
    }
}
