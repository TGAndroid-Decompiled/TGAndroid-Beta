package defpackage;

import org.telegram.tgnet.tl.TL_stories;
public final class k38 implements qac {
    public final byte a;
    public final a58 b;

    public k38(a58 a58Var, byte b) {
        this.a = b;
        this.b = a58Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        a58 a58Var = this.b;
        switch (b) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus == null) {
                    oab oabVar = a58Var.z0;
                    if (oabVar != null) {
                        oabVar.k1 = false;
                        oabVar.U();
                        return;
                    }
                    return;
                }
                a58Var.y3 = tL_premium_boostsStatus;
                oc7.r1(a58Var.s2).F0().b(a58Var.r1, tL_premium_boostsStatus, new u35(a58Var, tL_premium_boostsStatus, (byte) 18));
                return;
            default:
                a58Var.A3 = ((Long) obj).longValue();
                t38 t38Var = a58Var.R1;
                if (t38Var != null) {
                    t38Var.M(true);
                    a58Var.R1.C2();
                }
                a58Var.h0(true);
                return;
        }
    }
}
