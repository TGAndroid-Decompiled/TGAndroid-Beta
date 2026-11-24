package defpackage;
public final class um1 implements iac {
    public final byte a;
    public final yv1 b;

    public um1(yv1 yv1Var, byte b) {
        this.a = b;
        this.b = yv1Var;
    }

    @Override
    public final Object run() {
        byte b = this.a;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                return yv1Var.getSimpleMenuOverlay();
            default:
                if (e86.e(65536) && jlb.c()) {
                    jlb jlbVar = yv1Var.y0;
                    if (jlbVar == null || jlbVar.e) {
                        if (yv1Var.getParentActivity() != null && jlb.c() && yv1Var.A0 != null && yv1Var.m1 != null) {
                            jlb jlbVar2 = yv1Var.y0;
                            if (jlbVar2 != null) {
                                gm.B2(jlbVar2);
                            }
                            jlb jlbVar3 = new jlb(yv1Var.getParentActivity(), new uj1(yv1Var, r1, (byte) 5));
                            yv1Var.y0 = jlbVar3;
                            jlb[] jlbVarArr = {jlbVar3};
                            mu1 mu1Var = yv1Var.m1;
                            mu1Var.addView(jlbVar3, mu1Var.indexOfChild(yv1Var.A0) + 1, qoe.c(-1.0f, -1));
                        }
                    }
                    return yv1Var.y0;
                }
                return null;
        }
    }
}
