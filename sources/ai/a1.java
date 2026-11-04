package ai;
public final class a1 implements Runnable {
    public final int f477a;
    public final i1 f478b;

    public a1(i1 i1Var, int i3) {
        this.f477a = i3;
        this.f478b = i1Var;
    }

    @Override
    public final void run() {
        switch (this.f477a) {
            case 0:
                i1 i1Var = this.f478b;
                sh.h hVar = i1Var.f696o1;
                kh.f fVar = i1Var.f695n1;
                if (fVar != null) {
                    fVar.d();
                }
                g1 g1Var = i1Var.f707z1;
                if (g1Var != null) {
                    g1Var.setTranslationY(-hVar.d());
                }
                org.telegram.ui.Components.h6 h6Var = i1Var.f701t1;
                if (h6Var != null) {
                    h6Var.setTranslationY(-hVar.d());
                }
                i1Var.I0();
                return;
            case 1:
                this.f478b.f707z1.performClick();
                return;
            case 2:
                this.f478b.f697p1.H0();
                return;
            default:
                this.f478b.dismiss();
                return;
        }
    }
}
