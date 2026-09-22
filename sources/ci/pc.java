package ci;
public final class pc implements Runnable {
    public final int f5319a;
    public final zc f5320b;

    public pc(zc zcVar, int i10) {
        this.f5319a = i10;
        this.f5320b = zcVar;
    }

    @Override
    public final void run() {
        switch (this.f5319a) {
            case 0:
                zc zcVar = this.f5320b;
                xc xcVar = zcVar.M;
                if (xcVar != null) {
                    long j3 = xcVar.f5787a;
                    if (j3 > 0) {
                        zcVar.H = j3;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                sc scVar = this.f5320b.f5882a;
                if (scVar != null) {
                    scVar.Y();
                    return;
                }
                return;
            default:
                sc scVar2 = this.f5320b.f5882a;
                if (scVar2 != null) {
                    scVar2.r();
                    return;
                }
                return;
        }
    }
}
