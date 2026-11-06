package ai;
public final class n0 implements Runnable {
    public final int f1582a;
    public final s0 f1583b;

    public n0(s0 s0Var, int i7) {
        this.f1582a = i7;
        this.f1583b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f1582a) {
            case 0:
                s0 s0Var = this.f1583b;
                if (s0Var.h == null && s0Var.d != null && !s0Var.isFinished && s0Var.getParentActivity() != null) {
                    s0Var.g0(s0Var.d.H0(), 0.0f, true);
                    s0Var.h.setVisibility(4);
                    d dVar = s0Var.f1640y;
                    if (dVar != null) {
                        dVar.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                s0 s0Var2 = this.f1583b;
                d dVar2 = s0Var2.f1640y;
                if (dVar2 != null) {
                    dVar2.invalidate();
                }
                s0Var2.m0();
                return;
            default:
                this.f1583b.k0();
                return;
        }
    }
}
