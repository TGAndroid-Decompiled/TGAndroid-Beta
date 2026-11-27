package defpackage;

import org.telegram.tgnet.TLRPC;
public final class ie2 implements hqb {
    public final oe2 a;

    public ie2(oe2 oe2Var) {
        this.a = oe2Var;
    }

    @Override
    public final boolean a() {
        return this.a.G1;
    }

    @Override
    public final boolean s() {
        return true;
    }

    @Override
    public final void w(boolean z) {
        TLRPC.WallPaper wallPaper;
        oe2 oe2Var = this.a;
        zu1 zu1Var = oe2Var.u1;
        oe2Var.G1 = !oe2Var.G1;
        if (oe2Var.F1 != null) {
            oe2Var.I1 = true;
            zu1Var.w7 = true;
            if (oe2Var.K0()) {
                wallPaper = null;
            } else {
                wallPaper = oe2Var.r1.g;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            ez3 ez3Var = oe2Var.F1.a;
            boolean z2 = ez3Var.a;
            xu1 xu1Var = oe2Var.r1;
            if (z2) {
                xu1Var.q(null, wallPaper2, z, Boolean.valueOf(oe2Var.G1), false);
            } else {
                xu1Var.q(ez3Var, wallPaper2, z, Boolean.valueOf(oe2Var.G1), false);
            }
            zu1Var.w7 = false;
        }
    }
}
