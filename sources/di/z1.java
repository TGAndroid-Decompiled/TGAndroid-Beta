package di;

import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.tgnet.tl.TL_stories;
public final class z1 implements c20 {
    public final int f9991a;
    public final j4 f9992b;

    public z1(j4 j4Var, int i7) {
        this.f9991a = i7;
        this.f9992b = j4Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f9991a) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                j4 j4Var = this.f9992b;
                if (tL_premium_boostsStatus == null) {
                    q9 q9Var = j4Var.f9229s0;
                    if (q9Var != null) {
                        q9Var.f9623j1 = false;
                        q9Var.V();
                        return;
                    }
                    return;
                }
                j4Var.f9232s3 = tL_premium_boostsStatus;
                qp.s1(j4Var.f9205l2).G0().b(j4Var.f9201k1, tL_premium_boostsStatus, new ai.f1(7, j4Var, tL_premium_boostsStatus));
                return;
            default:
                long longValue = ((Long) obj).longValue();
                j4 j4Var2 = this.f9992b;
                j4Var2.f9240u3 = longValue;
                o2 o2Var = j4Var2.K1;
                if (o2Var != null) {
                    o2Var.E(true);
                    j4Var2.K1.T1();
                }
                j4Var2.p0(true);
                return;
        }
    }
}
