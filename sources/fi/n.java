package fi;
public final class n implements Runnable {
    public final int f11277a;
    public final ib f11278b;

    public n(ib ibVar, int i10) {
        this.f11277a = i10;
        this.f11278b = ibVar;
    }

    @Override
    public final void run() {
        switch (this.f11277a) {
            case 0:
                this.f11278b.n();
                return;
            case 1:
                ib ibVar = this.f11278b;
                ibVar.K0 = false;
                ibVar.L0 = Integer.MIN_VALUE;
                ibVar.invalidate();
                ibVar.S0.setVisibility(0);
                ibVar.T0.setVisibility(0);
                return;
            default:
                sb sbVar = this.f11278b.S1;
                gb gbVar = sbVar.X0;
                if (gbVar != null) {
                    gbVar.O = false;
                    gbVar.c();
                    gb gbVar2 = sbVar.X0;
                    gbVar2.m(0L);
                    cc ccVar = gbVar2.F;
                    if (ccVar != null) {
                        ccVar.setProgress(0L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
