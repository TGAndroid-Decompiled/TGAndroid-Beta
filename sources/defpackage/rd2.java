package defpackage;

import org.telegram.tgnet.TLRPC;
public final class rd2 implements imb {
    public final xd2 a;

    public rd2(xd2 xd2Var) {
        this.a = xd2Var;
    }

    @Override
    public final void E(boolean z) {
        TLRPC.WallPaper wallPaper;
        xd2 xd2Var = this.a;
        mu1 mu1Var = xd2Var.u1;
        xd2Var.G1 = !xd2Var.G1;
        if (xd2Var.F1 != null) {
            xd2Var.I1 = true;
            mu1Var.w7 = true;
            if (xd2Var.J0()) {
                wallPaper = null;
            } else {
                wallPaper = xd2Var.r1.g;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            jy3 jy3Var = xd2Var.F1.a;
            boolean z2 = jy3Var.a;
            ku1 ku1Var = xd2Var.r1;
            if (z2) {
                ku1Var.q(null, wallPaper2, z, Boolean.valueOf(xd2Var.G1), false);
            } else {
                ku1Var.q(jy3Var, wallPaper2, z, Boolean.valueOf(xd2Var.G1), false);
            }
            mu1Var.w7 = false;
        }
    }

    @Override
    public final boolean a() {
        return this.a.G1;
    }

    @Override
    public final boolean w() {
        return true;
    }
}
