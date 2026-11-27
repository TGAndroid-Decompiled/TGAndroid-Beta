package defpackage;

import org.telegram.tgnet.tl.TL_stories;
public final class b58 implements pcc {
    public final byte a;
    public final o68 b;

    public b58(o68 o68Var, byte b) {
        this.a = b;
        this.b = o68Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        o68 o68Var = this.b;
        switch (b) {
            case 0:
                o68Var.getClass();
                o68Var.u3 = ((Long) obj).longValue();
                h58 h58Var = o68Var.L1;
                if (h58Var != null) {
                    h58Var.P(true);
                    o68Var.L1.K2();
                }
                o68Var.h0(true);
                return;
            default:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus == null) {
                    lcb lcbVar = o68Var.t0;
                    if (lcbVar != null) {
                        lcbVar.k1 = false;
                        lcbVar.U();
                        return;
                    }
                    return;
                }
                o68Var.s3 = tL_premium_boostsStatus;
                uc7.s1(o68Var.m2).G0().b(o68Var.l1, tL_premium_boostsStatus, new v35(o68Var, tL_premium_boostsStatus, (byte) 18));
                return;
        }
    }
}
