package hi;
public final class p implements Runnable {
    public final int f15243a;
    public final ia f15244b;

    public p(ia iaVar, int i7) {
        this.f15243a = i7;
        this.f15244b = iaVar;
    }

    @Override
    public final void run() {
        switch (this.f15243a) {
            case 0:
                this.f15244b.n();
                return;
            case 1:
                ia iaVar = this.f15244b;
                iaVar.K0 = false;
                iaVar.L0 = Integer.MIN_VALUE;
                iaVar.invalidate();
                iaVar.S0.setVisibility(0);
                iaVar.T0.setVisibility(0);
                return;
            default:
                sa saVar = this.f15244b.S1;
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
