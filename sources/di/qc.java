package di;
public final class qc implements Runnable {
    public final int f8051a;
    public final zc f8052b;

    public qc(zc zcVar, int i10) {
        this.f8051a = i10;
        this.f8052b = zcVar;
    }

    @Override
    public final void run() {
        switch (this.f8051a) {
            case 0:
                zc zcVar = this.f8052b;
                xc xcVar = zcVar.M;
                if (xcVar != null) {
                    long j3 = xcVar.f8456a;
                    if (j3 > 0) {
                        zcVar.H = j3;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                tc tcVar = this.f8052b.f8563a;
                if (tcVar != null) {
                    tcVar.V();
                    return;
                }
                return;
            default:
                tc tcVar2 = this.f8052b.f8563a;
                if (tcVar2 != null) {
                    tcVar2.n();
                    return;
                }
                return;
        }
    }
}
