package ai;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class f3 implements Utilities.Callback {
    public final int f871a;
    public final e6 f872b;

    public f3(e6 e6Var, int i10) {
        this.f871a = i10;
        this.f872b = e6Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f871a) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                e6 e6Var = this.f872b;
                if (tL_premium_boostsStatus == null) {
                    jc jcVar = e6Var.J0;
                    if (jcVar != null) {
                        jcVar.f1083k1 = false;
                        jcVar.P();
                        return;
                    }
                    return;
                }
                e6Var.J3 = tL_premium_boostsStatus;
                MessagesController.getInstance(e6Var.C2).getBoostsController().userCanBoostChannel(e6Var.B1, tL_premium_boostsStatus, new g3(0, e6Var, tL_premium_boostsStatus));
                return;
            default:
                long longValue = ((Long) obj).longValue();
                e6 e6Var2 = this.f872b;
                e6Var2.L3 = longValue;
                a4 a4Var = e6Var2.f773b2;
                if (a4Var != null) {
                    a4Var.L(true);
                    e6Var2.f773b2.S1();
                }
                e6Var2.r0(true);
                return;
        }
    }
}
