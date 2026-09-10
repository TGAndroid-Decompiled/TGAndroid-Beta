package bi;
public final class p implements Runnable {
    public final int f3352a;
    public final qd f3353b;

    public p(qd qdVar, int i10) {
        this.f3352a = i10;
        this.f3353b = qdVar;
    }

    @Override
    public final void run() {
        switch (this.f3352a) {
            case 0:
                this.f3353b.n();
                return;
            case 1:
                qd qdVar = this.f3353b;
                qdVar.K0 = false;
                qdVar.L0 = Integer.MIN_VALUE;
                qdVar.invalidate();
                qdVar.S0.setVisibility(0);
                qdVar.T0.setVisibility(0);
                return;
            default:
                ce ceVar = this.f3353b.S1;
                nd ndVar = ceVar.X0;
                if (ndVar != null) {
                    ndVar.O = false;
                    ndVar.c();
                    nd ndVar2 = ceVar.X0;
                    ndVar2.m(0L);
                    me meVar = ndVar2.F;
                    if (meVar != null) {
                        meVar.setProgress(0L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
