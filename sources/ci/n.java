package ci;
public final class n implements Runnable {
    public final int f5057a;
    public final ec f5058b;

    public n(ec ecVar, int i10) {
        this.f5057a = i10;
        this.f5058b = ecVar;
    }

    @Override
    public final void run() {
        switch (this.f5057a) {
            case 0:
                this.f5058b.n();
                return;
            case 1:
                ec ecVar = this.f5058b;
                ecVar.K0 = false;
                ecVar.L0 = Integer.MIN_VALUE;
                ecVar.invalidate();
                ecVar.S0.setVisibility(0);
                ecVar.T0.setVisibility(0);
                return;
            default:
                oc ocVar = this.f5058b.S1;
                cc ccVar = ocVar.X0;
                if (ccVar != null) {
                    ccVar.O = false;
                    ccVar.c();
                    cc ccVar2 = ocVar.X0;
                    ccVar2.m(0L);
                    zc zcVar = ccVar2.F;
                    if (zcVar != null) {
                        zcVar.setProgress(0L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
