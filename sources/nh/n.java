package nh;
public final class n implements Runnable {
    public final int f18160a;
    public final wa f18161b;

    public n(wa waVar, int i10) {
        this.f18160a = i10;
        this.f18161b = waVar;
    }

    @Override
    public final void run() {
        switch (this.f18160a) {
            case 0:
                this.f18161b.n();
                return;
            case 1:
                wa waVar = this.f18161b;
                waVar.G0 = false;
                waVar.H0 = Integer.MIN_VALUE;
                waVar.invalidate();
                waVar.O0.setVisibility(0);
                waVar.P0.setVisibility(0);
                return;
            default:
                gb gbVar = this.f18161b.O1;
                va vaVar = gbVar.T0;
                if (vaVar != null) {
                    vaVar.K = false;
                    vaVar.c();
                    va vaVar2 = gbVar.T0;
                    vaVar2.m(0L);
                    qb qbVar = vaVar2.B;
                    if (qbVar != null) {
                        qbVar.setProgress(0L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
