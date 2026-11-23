package fi;

import org.telegram.messenger.np;
import org.telegram.messenger.y10;
import org.telegram.tgnet.tl.TL_stories;
public final class u1 implements y10 {
    public final int f12650a;
    public final z3 f12651b;

    public u1(z3 z3Var, int i7) {
        this.f12650a = i7;
        this.f12651b = z3Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f12650a) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                z3 z3Var = this.f12651b;
                if (tL_premium_boostsStatus == null) {
                    f9 f9Var = z3Var.f12916t0;
                    if (f9Var != null) {
                        f9Var.f12022k1 = false;
                        f9Var.V();
                        return;
                    }
                    return;
                }
                z3Var.f12919t3 = tL_premium_boostsStatus;
                np.u1(z3Var.f12891m2).I0().b(z3Var.l1, tL_premium_boostsStatus, new ai.y1(14, z3Var, tL_premium_boostsStatus));
                return;
            default:
                long longValue = ((Long) obj).longValue();
                z3 z3Var2 = this.f12651b;
                z3Var2.f12927v3 = longValue;
                i2 i2Var = z3Var2.L1;
                if (i2Var != null) {
                    i2Var.P(true);
                    z3Var2.L1.y2();
                }
                z3Var2.p0(true);
                return;
        }
    }
}
