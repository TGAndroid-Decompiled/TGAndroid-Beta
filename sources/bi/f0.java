package bi;
public final class f0 implements Runnable {
    public final int f3740a;
    public final j0 f3741b;

    public f0(j0 j0Var, int i3) {
        this.f3740a = i3;
        this.f3741b = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f3740a) {
            case 0:
                j0 j0Var = this.f3741b;
                if (j0Var.h == null && j0Var.d != null && !j0Var.isFinished && j0Var.getParentActivity() != null) {
                    j0Var.g0(j0Var.d.H0(), 0.0f, true);
                    j0Var.h.setVisibility(4);
                    c cVar = j0Var.f3776y;
                    if (cVar != null) {
                        cVar.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                j0 j0Var2 = this.f3741b;
                c cVar2 = j0Var2.f3776y;
                if (cVar2 != null) {
                    cVar2.invalidate();
                }
                j0Var2.m0();
                return;
            default:
                this.f3741b.k0();
                return;
        }
    }
}
