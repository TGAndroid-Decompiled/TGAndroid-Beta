package bi;
public final class c1 implements Runnable {
    public final int f3449a;
    public final k1 f3450b;

    public c1(k1 k1Var, int i7) {
        this.f3449a = i7;
        this.f3450b = k1Var;
    }

    @Override
    public final void run() {
        switch (this.f3449a) {
            case 0:
                k1 k1Var = this.f3450b;
                rh.h hVar = k1Var.f3766r1;
                jh.f fVar = k1Var.f3765q1;
                if (fVar != null) {
                    fVar.d();
                }
                h1 h1Var = k1Var.C1;
                if (h1Var != null) {
                    h1Var.setTranslationY(-hVar.d());
                }
                org.telegram.ui.Components.o6 o6Var = k1Var.f3771w1;
                if (o6Var != null) {
                    o6Var.setTranslationY(-hVar.d());
                }
                k1Var.J0();
                return;
            case 1:
                this.f3450b.C1.performClick();
                return;
            case 2:
                this.f3450b.f3767s1.j1();
                return;
            default:
                this.f3450b.dismiss();
                return;
        }
    }
}
