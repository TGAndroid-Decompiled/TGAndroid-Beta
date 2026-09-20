package ci;
public final class pc implements Runnable {
    public final int f5321a;
    public final zc f5322b;

    public pc(zc zcVar, int i10) {
        this.f5321a = i10;
        this.f5322b = zcVar;
    }

    @Override
    public final void run() {
        switch (this.f5321a) {
            case 0:
                zc zcVar = this.f5322b;
                xc xcVar = zcVar.M;
                if (xcVar != null) {
                    long j3 = xcVar.f5789a;
                    if (j3 > 0) {
                        zcVar.H = j3;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                sc scVar = this.f5322b.f5884a;
                if (scVar != null) {
                    scVar.b0();
                    return;
                }
                return;
            default:
                sc scVar2 = this.f5322b.f5884a;
                if (scVar2 != null) {
                    scVar2.r();
                    return;
                }
                return;
        }
    }
}
