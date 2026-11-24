package defpackage;
public final class wt4 implements Runnable {
    public final byte a;
    public final du4 b;

    public wt4(du4 du4Var, byte b) {
        this.a = b;
        this.b = du4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        du4 du4Var = this.b;
        switch (b) {
            case 0:
                fyc fycVar = du4Var.q1;
                j92 j92Var = du4Var.p1;
                if (j92Var != null) {
                    j92Var.d();
                }
                bu4 bu4Var = du4Var.B1;
                if (bu4Var != null) {
                    bu4Var.setTranslationY(-fycVar.d());
                }
                hn hnVar = du4Var.v1;
                if (hnVar != null) {
                    hnVar.setTranslationY(-fycVar.d());
                }
                du4Var.D0();
                return;
            case 1:
                du4Var.B1.performClick();
                return;
            case 2:
                du4Var.r1.i1();
                return;
            default:
                du4Var.dismiss();
                return;
        }
    }
}
