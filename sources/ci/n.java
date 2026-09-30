package ci;
public final class n implements Runnable {
    public final int f5195a;
    public final bc f5196b;

    public n(bc bcVar, int i10) {
        this.f5195a = i10;
        this.f5196b = bcVar;
    }

    @Override
    public final void run() {
        switch (this.f5195a) {
            case 0:
                this.f5196b.n();
                return;
            case 1:
                bc bcVar = this.f5196b;
                bcVar.K0 = false;
                bcVar.L0 = Integer.MIN_VALUE;
                bcVar.invalidate();
                bcVar.S0.setVisibility(0);
                bcVar.T0.setVisibility(0);
                return;
            default:
                lc lcVar = this.f5196b.S1;
                zb zbVar = lcVar.X0;
                if (zbVar != null) {
                    zbVar.O = false;
                    zbVar.c();
                    zb zbVar2 = lcVar.X0;
                    zbVar2.m(0L);
                    wc wcVar = zbVar2.F;
                    if (wcVar != null) {
                        wcVar.setProgress(0L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
