package ci;
public final class n implements Runnable {
    public final int f5586a;
    public final ac f5587b;

    public n(ac acVar, int i10) {
        this.f5586a = i10;
        this.f5587b = acVar;
    }

    @Override
    public final void run() {
        switch (this.f5586a) {
            case 0:
                this.f5587b.n();
                return;
            case 1:
                ac acVar = this.f5587b;
                acVar.K0 = false;
                acVar.L0 = Integer.MIN_VALUE;
                acVar.invalidate();
                acVar.S0.setVisibility(0);
                acVar.T0.setVisibility(0);
                return;
            default:
                kc kcVar = this.f5587b.S1;
                yb ybVar = kcVar.X0;
                if (ybVar != null) {
                    ybVar.O = false;
                    ybVar.c();
                    yb ybVar2 = kcVar.X0;
                    ybVar2.m(0L);
                    vc vcVar = ybVar2.F;
                    if (vcVar != null) {
                        vcVar.setProgress(0L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
