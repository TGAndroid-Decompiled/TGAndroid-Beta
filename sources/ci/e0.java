package ci;
public final class e0 implements Runnable {
    public final int f5353a;
    public final i0 f5354b;

    public e0(i0 i0Var, int i7) {
        this.f5353a = i7;
        this.f5354b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f5353a) {
            case 0:
                i0 i0Var = this.f5354b;
                if (i0Var.h == null && i0Var.d != null && !i0Var.isFinished && i0Var.getParentActivity() != null) {
                    i0Var.g0(i0Var.d.H0(), 0.0f, true);
                    i0Var.h.setVisibility(4);
                    c cVar = i0Var.f5412y;
                    if (cVar != null) {
                        cVar.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                i0 i0Var2 = this.f5354b;
                c cVar2 = i0Var2.f5412y;
                if (cVar2 != null) {
                    cVar2.invalidate();
                }
                i0Var2.m0();
                return;
            default:
                this.f5354b.k0();
                return;
        }
    }
}
