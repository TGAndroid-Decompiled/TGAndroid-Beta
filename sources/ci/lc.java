package ci;
public final class lc implements Runnable {
    public final int f5507a;
    public final vc f5508b;

    public lc(vc vcVar, int i10) {
        this.f5507a = i10;
        this.f5508b = vcVar;
    }

    @Override
    public final void run() {
        switch (this.f5507a) {
            case 0:
                vc vcVar = this.f5508b;
                tc tcVar = vcVar.M;
                if (tcVar != null) {
                    long j3 = tcVar.f6025a;
                    if (j3 > 0) {
                        vcVar.H = j3;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                oc ocVar = this.f5508b.f6135a;
                if (ocVar != null) {
                    ocVar.m0();
                    return;
                }
                return;
            default:
                oc ocVar2 = this.f5508b.f6135a;
                if (ocVar2 != null) {
                    ocVar2.s();
                    return;
                }
                return;
        }
    }
}
