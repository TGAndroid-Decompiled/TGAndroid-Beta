package di;

import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.tgnet.tl.TL_stories;
public final class z1 implements c20 {
    public final int f10004a;
    public final i4 f10005b;

    public z1(i4 i4Var, int i7) {
        this.f10004a = i7;
        this.f10005b = i4Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f10004a) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                i4 i4Var = this.f10005b;
                if (tL_premium_boostsStatus == null) {
                    p9 p9Var = i4Var.f9192s0;
                    if (p9Var != null) {
                        p9Var.f9553j1 = false;
                        p9Var.V();
                        return;
                    }
                    return;
                }
                i4Var.f9195s3 = tL_premium_boostsStatus;
                qp.s1(i4Var.f9168l2).G0().b(i4Var.f9164k1, tL_premium_boostsStatus, new ai.f1(7, i4Var, tL_premium_boostsStatus));
                return;
            default:
                long longValue = ((Long) obj).longValue();
                i4 i4Var2 = this.f10005b;
                i4Var2.f9203u3 = longValue;
                o2 o2Var = i4Var2.K1;
                if (o2Var != null) {
                    o2Var.E(true);
                    i4Var2.K1.T1();
                }
                i4Var2.p0(true);
                return;
        }
    }
}
