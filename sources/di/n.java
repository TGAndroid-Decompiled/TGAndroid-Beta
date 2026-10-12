package di;
public final class n implements Runnable {
    public final int f7438a;
    public final ac f7439b;

    public n(ac acVar, int i10) {
        this.f7438a = i10;
        this.f7439b = acVar;
    }

    @Override
    public final void run() {
        switch (this.f7438a) {
            case 0:
                this.f7439b.n();
                return;
            case 1:
                ac acVar = this.f7439b;
                acVar.K0 = false;
                acVar.L0 = Integer.MIN_VALUE;
                acVar.invalidate();
                acVar.S0.setVisibility(0);
                acVar.T0.setVisibility(0);
                return;
            default:
                kc kcVar = this.f7439b.S1;
                yb ybVar = kcVar.X0;
                if (ybVar != null) {
                    ybVar.O = false;
                    ybVar.c();
                    yb ybVar2 = kcVar.X0;
                    ybVar2.m(0L);
                    uc ucVar = ybVar2.F;
                    if (ucVar != null) {
                        ucVar.setProgress(0L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
