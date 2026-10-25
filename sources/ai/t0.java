package ai;
public final class t0 implements Runnable {
    public final int f1678a;
    public final z0 f1679b;

    public t0(z0 z0Var, int i10) {
        this.f1678a = i10;
        this.f1679b = z0Var;
    }

    @Override
    public final void run() {
        switch (this.f1678a) {
            case 0:
                z0 z0Var = this.f1679b;
                if (z0Var.h == null && z0Var.d != null && !z0Var.isFinished && z0Var.getParentActivity() != null) {
                    z0Var.c0(z0Var.d.H0(), 0.0f, true);
                    z0Var.h.setVisibility(4);
                    d dVar = z0Var.f2011x;
                    if (dVar != null) {
                        dVar.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                z0 z0Var2 = this.f1679b;
                d dVar2 = z0Var2.f2011x;
                if (dVar2 != null) {
                    dVar2.invalidate();
                }
                z0Var2.i0();
                return;
            default:
                this.f1679b.g0();
                return;
        }
    }
}
