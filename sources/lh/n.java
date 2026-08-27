package lh;

public final class n implements Runnable {

    public final int f16410a;

    public final ib f16411b;

    public n(ib ibVar, int i10) {
        this.f16410a = i10;
        this.f16411b = ibVar;
    }

    @Override
    public final void run() {
        switch (this.f16410a) {
            case 0:
                this.f16411b.n();
                break;
            case 1:
                ib ibVar = this.f16411b;
                ibVar.G0 = false;
                ibVar.H0 = Integer.MIN_VALUE;
                ibVar.invalidate();
                ibVar.O0.setVisibility(0);
                ibVar.P0.setVisibility(0);
                break;
            default:
                sb sbVar = this.f16411b.O1;
                hb hbVar = sbVar.T0;
                if (hbVar != null) {
                    hbVar.K = false;
                    hbVar.c();
                    hb hbVar2 = sbVar.T0;
                    hbVar2.m(0L);
                    cc ccVar = hbVar2.B;
                    if (ccVar != null) {
                        ccVar.setProgress(0L);
                    }
                }
                break;
        }
    }
}
