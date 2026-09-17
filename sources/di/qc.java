package di;
public final class qc implements Runnable {
    public final int f8023a;
    public final zc f8024b;

    public qc(zc zcVar, int i10) {
        this.f8023a = i10;
        this.f8024b = zcVar;
    }

    @Override
    public final void run() {
        switch (this.f8023a) {
            case 0:
                zc zcVar = this.f8024b;
                xc xcVar = zcVar.M;
                if (xcVar != null) {
                    long j3 = xcVar.f8428a;
                    if (j3 > 0) {
                        zcVar.H = j3;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                tc tcVar = this.f8024b.f8535a;
                if (tcVar != null) {
                    tcVar.V();
                    return;
                }
                return;
            default:
                tc tcVar2 = this.f8024b.f8535a;
                if (tcVar2 != null) {
                    tcVar2.n();
                    return;
                }
                return;
        }
    }
}
