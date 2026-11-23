package ci;
public final class f0 implements Runnable {
    public final int f5657a;
    public final j0 f5658b;

    public f0(j0 j0Var, int i7) {
        this.f5657a = i7;
        this.f5658b = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f5657a) {
            case 0:
                j0 j0Var = this.f5658b;
                if (j0Var.h == null && j0Var.d != null && !j0Var.isFinished && j0Var.getParentActivity() != null) {
                    j0Var.g0(j0Var.d.H0(), 0.0f, true);
                    j0Var.h.setVisibility(4);
                    c cVar = j0Var.f5693y;
                    if (cVar != null) {
                        cVar.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                j0 j0Var2 = this.f5658b;
                c cVar2 = j0Var2.f5693y;
                if (cVar2 != null) {
                    cVar2.invalidate();
                }
                j0Var2.m0();
                return;
            default:
                this.f5658b.k0();
                return;
        }
    }
}
