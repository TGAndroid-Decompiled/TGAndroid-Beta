package hi;
public final class n implements Runnable {
    public final int f14717a;
    public final ia f14718b;

    public n(ia iaVar, int i7) {
        this.f14717a = i7;
        this.f14718b = iaVar;
    }

    @Override
    public final void run() {
        switch (this.f14717a) {
            case 0:
                this.f14718b.n();
                return;
            case 1:
                ia iaVar = this.f14718b;
                iaVar.K0 = false;
                iaVar.L0 = Integer.MIN_VALUE;
                iaVar.invalidate();
                iaVar.S0.setVisibility(0);
                iaVar.T0.setVisibility(0);
                return;
            default:
                sa saVar = this.f14718b.S1;
                ga gaVar = saVar.Y0;
                if (gaVar != null) {
                    gaVar.P = false;
                    gaVar.c();
                    ga gaVar2 = saVar.Y0;
                    gaVar2.m(0L);
                    cb cbVar = gaVar2.G;
                    if (cbVar != null) {
                        cbVar.setProgress(0L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
