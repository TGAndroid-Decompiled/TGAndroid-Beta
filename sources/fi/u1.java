package fi;

import org.telegram.messenger.mp;
import org.telegram.messenger.w10;
import org.telegram.tgnet.tl.TL_stories;
public final class u1 implements w10 {
    public final int f12612a;
    public final z3 f12613b;

    public u1(z3 z3Var, int i7) {
        this.f12612a = i7;
        this.f12613b = z3Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f12612a) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                z3 z3Var = this.f12613b;
                if (tL_premium_boostsStatus == null) {
                    f9 f9Var = z3Var.f12878t0;
                    if (f9Var != null) {
                        f9Var.f11984k1 = false;
                        f9Var.V();
                        return;
                    }
                    return;
                }
                z3Var.f12881t3 = tL_premium_boostsStatus;
                mp.u1(z3Var.f12853m2).I0().b(z3Var.l1, tL_premium_boostsStatus, new ai.s1(14, z3Var, tL_premium_boostsStatus));
                return;
            default:
                long longValue = ((Long) obj).longValue();
                z3 z3Var2 = this.f12613b;
                z3Var2.f12889v3 = longValue;
                i2 i2Var = z3Var2.L1;
                if (i2Var != null) {
                    i2Var.P(true);
                    z3Var2.L1.B2();
                }
                z3Var2.p0(true);
                return;
        }
    }
}
