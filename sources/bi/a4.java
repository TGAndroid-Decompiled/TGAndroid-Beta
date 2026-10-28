package bi;
public final class a4 implements Runnable {
    public final int f4257a;
    public final zh.i0 f4258b;

    public a4(zh.i0 i0Var, int i10) {
        this.f4257a = i10;
        this.f4258b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f4257a) {
            case 0:
                this.f4258b.dismiss();
                return;
            case 1:
                zh.i0 i0Var = this.f4258b;
                rh.i iVar = i0Var.h;
                jh.f fVar = i0Var.f53097f;
                if (fVar != null) {
                    fVar.d();
                }
                zh.h0 h0Var = i0Var.H;
                if (h0Var != null) {
                    h0Var.setTranslationY(-iVar.d());
                }
                org.telegram.ui.Components.s6 s6Var = i0Var.f53101w;
                if (s6Var != null) {
                    s6Var.setTranslationY(-iVar.d());
                }
                i0Var.q();
                return;
            case 2:
                this.f4258b.H.performClick();
                return;
            default:
                this.f4258b.f53098n.F0();
                return;
        }
    }
}
