package di;
public final class n implements Runnable {
    public final int f7668a;
    public final fc f7669b;

    public n(fc fcVar, int i10) {
        this.f7668a = i10;
        this.f7669b = fcVar;
    }

    @Override
    public final void run() {
        switch (this.f7668a) {
            case 0:
                this.f7669b.n();
                return;
            case 1:
                fc fcVar = this.f7669b;
                fcVar.K0 = false;
                fcVar.L0 = Integer.MIN_VALUE;
                fcVar.invalidate();
                fcVar.S0.setVisibility(0);
                fcVar.T0.setVisibility(0);
                return;
            default:
                pc pcVar = this.f7669b.S1;
                dc dcVar = pcVar.X0;
                if (dcVar != null) {
                    dcVar.O = false;
                    dcVar.c();
                    dc dcVar2 = pcVar.X0;
                    dcVar2.m(0L);
                    zc zcVar = dcVar2.F;
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
