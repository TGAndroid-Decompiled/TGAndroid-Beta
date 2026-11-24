package defpackage;
public final class ll1 implements h8c {
    public final byte a;
    public final mu1 b;

    public ll1(mu1 mu1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
    }

    @Override
    public final Object run() {
        byte b = this.a;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                return mu1Var.getSimpleMenuOverlay();
            default:
                if (e66.e(65536) && ijb.c()) {
                    ijb ijbVar = mu1Var.y0;
                    if (ijbVar == null || ijbVar.e) {
                        if (mu1Var.getParentActivity() != null && ijb.c() && mu1Var.A0 != null && mu1Var.m1 != null) {
                            ijb ijbVar2 = mu1Var.y0;
                            if (ijbVar2 != null) {
                                gl.B2(ijbVar2);
                            }
                            ijb ijbVar3 = new ijb(mu1Var.getParentActivity(), new aj1(mu1Var, r1, (byte) 4));
                            mu1Var.y0 = ijbVar3;
                            ijb[] ijbVarArr = {ijbVar3};
                            at1 at1Var = mu1Var.m1;
                            at1Var.addView(ijbVar3, at1Var.indexOfChild(mu1Var.A0) + 1, nme.c(-1.0f, -1));
                        }
                    }
                    return mu1Var.y0;
                }
                return null;
        }
    }
}
