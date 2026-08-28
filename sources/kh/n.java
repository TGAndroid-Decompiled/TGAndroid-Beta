package kh;
public final class n implements Runnable {
    public final int f15718a;
    public final mb f15719b;

    public n(mb mbVar, int i9) {
        this.f15718a = i9;
        this.f15719b = mbVar;
    }

    @Override
    public final void run() {
        switch (this.f15718a) {
            case 0:
                this.f15719b.n();
                return;
            case 1:
                mb mbVar = this.f15719b;
                mbVar.G0 = false;
                mbVar.H0 = Integer.MIN_VALUE;
                mbVar.invalidate();
                mbVar.O0.setVisibility(0);
                mbVar.P0.setVisibility(0);
                return;
            default:
                wb wbVar = this.f15719b.O1;
                kb kbVar = wbVar.T0;
                if (kbVar != null) {
                    kbVar.K = false;
                    kbVar.c();
                    kb kbVar2 = wbVar.T0;
                    kbVar2.m(0L);
                    gc gcVar = kbVar2.B;
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
