package defpackage;

import org.telegram.tgnet.TLRPC;
public final class cf2 implements job {
    public final if2 a;

    public cf2(if2 if2Var) {
        this.a = if2Var;
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
        if2 if2Var = this.a;
        yv1 yv1Var = if2Var.u1;
        if2Var.G1 = !if2Var.G1;
        if (if2Var.F1 != null) {
            if2Var.I1 = true;
            yv1Var.w7 = true;
            if (if2Var.J0()) {
                wallPaper = null;
            } else {
                wallPaper = if2Var.r1.g;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            tz3 tz3Var = if2Var.F1.a;
            boolean z2 = tz3Var.a;
            wv1 wv1Var = if2Var.r1;
            if (z2) {
                wv1Var.q(null, wallPaper2, z, Boolean.valueOf(if2Var.G1), false);
            } else {
                wv1Var.q(tz3Var, wallPaper2, z, Boolean.valueOf(if2Var.G1), false);
            }
            yv1Var.w7 = false;
        }
    }
}
