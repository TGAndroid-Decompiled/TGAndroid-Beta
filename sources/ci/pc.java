package ci;
public final class pc implements Runnable {
    public final int f5317a;
    public final zc f5318b;

    public pc(zc zcVar, int i10) {
        this.f5317a = i10;
        this.f5318b = zcVar;
    }

    @Override
    public final void run() {
        switch (this.f5317a) {
            case 0:
                zc zcVar = this.f5318b;
                xc xcVar = zcVar.M;
                if (xcVar != null) {
                    long j3 = xcVar.f5785a;
                    if (j3 > 0) {
                        zcVar.H = j3;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                sc scVar = this.f5318b.f5880a;
                if (scVar != null) {
                    scVar.f0();
                    return;
                }
                return;
            default:
                sc scVar2 = this.f5318b.f5880a;
                if (scVar2 != null) {
                    scVar2.s();
                    return;
                }
                return;
        }
    }
}
