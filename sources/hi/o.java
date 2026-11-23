package hi;
public final class o implements Runnable {
    public final int f15139a;
    public final db f15140b;

    public o(db dbVar, int i7) {
        this.f15139a = i7;
        this.f15140b = dbVar;
    }

    @Override
    public final void run() {
        switch (this.f15139a) {
            case 0:
                this.f15140b.n();
                return;
            case 1:
                db dbVar = this.f15140b;
                dbVar.K0 = false;
                dbVar.L0 = Integer.MIN_VALUE;
                dbVar.invalidate();
                dbVar.S0.setVisibility(0);
                dbVar.T0.setVisibility(0);
                return;
            default:
                nb nbVar = this.f15140b.S1;
                bb bbVar = nbVar.Y0;
                if (bbVar != null) {
                    bbVar.P = false;
                    bbVar.c();
                    bb bbVar2 = nbVar.Y0;
                    bbVar2.m(0L);
                    xb xbVar = bbVar2.G;
                    if (xbVar != null) {
                        xbVar.setProgress(0L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
