package ci;
public final class pc implements Runnable {
    public final int f5315a;
    public final zc f5316b;

    public pc(zc zcVar, int i10) {
        this.f5315a = i10;
        this.f5316b = zcVar;
    }

    @Override
    public final void run() {
        switch (this.f5315a) {
            case 0:
                zc zcVar = this.f5316b;
                xc xcVar = zcVar.M;
                if (xcVar != null) {
                    long j3 = xcVar.f5783a;
                    if (j3 > 0) {
                        zcVar.H = j3;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                sc scVar = this.f5316b.f5878a;
                if (scVar != null) {
                    scVar.f0();
                    return;
                }
                return;
            default:
                sc scVar2 = this.f5316b.f5878a;
                if (scVar2 != null) {
                    scVar2.s();
                    return;
                }
                return;
        }
    }
}
