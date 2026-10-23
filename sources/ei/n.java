package ei;
public final class n implements Runnable {
    public final int f9500a;
    public final lb f9501b;

    public n(lb lbVar, int i10) {
        this.f9500a = i10;
        this.f9501b = lbVar;
    }

    @Override
    public final void run() {
        switch (this.f9500a) {
            case 0:
                this.f9501b.n();
                return;
            case 1:
                lb lbVar = this.f9501b;
                lbVar.K0 = false;
                lbVar.L0 = Integer.MIN_VALUE;
                lbVar.invalidate();
                lbVar.S0.setVisibility(0);
                lbVar.T0.setVisibility(0);
                return;
            default:
                vb vbVar = this.f9501b.S1;
                jb jbVar = vbVar.X0;
                if (jbVar != null) {
                    jbVar.O = false;
                    jbVar.c();
                    jb jbVar2 = vbVar.X0;
                    jbVar2.m(0L);
                    gc gcVar = jbVar2.F;
                    if (gcVar != null) {
                        gcVar.setProgress(0L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
