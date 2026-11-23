package bi;
public final class c1 implements Runnable {
    public final int f3454a;
    public final k1 f3455b;

    public c1(k1 k1Var, int i7) {
        this.f3454a = i7;
        this.f3455b = k1Var;
    }

    @Override
    public final void run() {
        switch (this.f3454a) {
            case 0:
                k1 k1Var = this.f3455b;
                rh.h hVar = k1Var.f3775r1;
                jh.f fVar = k1Var.f3774q1;
                if (fVar != null) {
                    fVar.d();
                }
                h1 h1Var = k1Var.C1;
                if (h1Var != null) {
                    h1Var.setTranslationY(-hVar.d());
                }
                org.telegram.ui.Components.o6 o6Var = k1Var.f3780w1;
                if (o6Var != null) {
                    o6Var.setTranslationY(-hVar.d());
                }
                k1Var.J0();
                return;
            case 1:
                this.f3455b.C1.performClick();
                return;
            case 2:
                this.f3455b.f3776s1.j1();
                return;
            default:
                this.f3455b.dismiss();
                return;
        }
    }
}
