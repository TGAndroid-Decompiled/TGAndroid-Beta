package ei;

import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.tgnet.tl.TL_stories;
public final class d2 implements u10 {
    public final int f10193a;
    public final j4 f10194b;

    public d2(j4 j4Var, int i3) {
        this.f10193a = i3;
        this.f10194b = j4Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f10193a) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                j4 j4Var = this.f10194b;
                if (tL_premium_boostsStatus == null) {
                    r9 r9Var = j4Var.f10506t0;
                    if (r9Var != null) {
                        r9Var.f10935l1 = false;
                        r9Var.d0();
                        return;
                    }
                    return;
                }
                j4Var.f10509t3 = tL_premium_boostsStatus;
                hp.s1(j4Var.f10480m2).G0().b(j4Var.f10477l1, tL_premium_boostsStatus, new ai.o1(11, j4Var, tL_premium_boostsStatus));
                return;
            default:
                long longValue = ((Long) obj).longValue();
                j4 j4Var2 = this.f10194b;
                j4Var2.f10517v3 = longValue;
                s2 s2Var = j4Var2.L1;
                if (s2Var != null) {
                    s2Var.E(true);
                    j4Var2.L1.S1();
                }
                j4Var2.p0(true);
                return;
        }
    }
}
