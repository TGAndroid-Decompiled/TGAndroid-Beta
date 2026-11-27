package defpackage;
public final class aw4 implements Runnable {
    public final byte a;
    public final hw4 b;

    public aw4(hw4 hw4Var, byte b) {
        this.a = b;
        this.b = hw4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        hw4 hw4Var = this.b;
        switch (b) {
            case 0:
                v2d v2dVar = hw4Var.q1;
                z92 z92Var = hw4Var.p1;
                if (z92Var != null) {
                    z92Var.d();
                }
                fw4 fw4Var = hw4Var.B1;
                if (fw4Var != null) {
                    fw4Var.setTranslationY(-v2dVar.d());
                }
                in inVar = hw4Var.v1;
                if (inVar != null) {
                    inVar.setTranslationY(-v2dVar.d());
                }
                hw4Var.E0();
                return;
            case 1:
                hw4Var.B1.performClick();
                return;
            case 2:
                hw4Var.r1.p1();
                return;
            default:
                hw4Var.dismiss();
                return;
        }
    }
}
