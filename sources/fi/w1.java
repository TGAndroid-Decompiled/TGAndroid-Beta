package fi;

import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.tgnet.tl.TL_stories;
public final class w1 implements z10 {
    public final int f12456a;
    public final b4 f12457b;

    public w1(b4 b4Var, int i7) {
        this.f12456a = i7;
        this.f12457b = b4Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f12456a) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                b4 b4Var = this.f12457b;
                if (tL_premium_boostsStatus == null) {
                    i9 i9Var = b4Var.f11522t0;
                    if (i9Var != null) {
                        i9Var.f11856k1 = false;
                        i9Var.V();
                        return;
                    }
                    return;
                }
                b4Var.f11525t3 = tL_premium_boostsStatus;
                np.s1(b4Var.f11497m2).G0().b(b4Var.l1, tL_premium_boostsStatus, new ai.u1(12, b4Var, tL_premium_boostsStatus));
                return;
            default:
                long longValue = ((Long) obj).longValue();
                b4 b4Var2 = this.f12457b;
                b4Var2.f11533v3 = longValue;
                k2 k2Var = b4Var2.L1;
                if (k2Var != null) {
                    k2Var.N(true);
                    b4Var2.L1.l2();
                }
                b4Var2.p0(true);
                return;
        }
    }
}
