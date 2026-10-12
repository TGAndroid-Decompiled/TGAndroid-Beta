package di;
public final class lc implements Runnable {
    public final int f7372a;
    public final uc f7373b;

    public lc(uc ucVar, int i10) {
        this.f7372a = i10;
        this.f7373b = ucVar;
    }

    @Override
    public final void run() {
        switch (this.f7372a) {
            case 0:
                uc ucVar = this.f7373b;
                sc scVar = ucVar.M;
                if (scVar != null) {
                    long j10 = scVar.f7797a;
                    if (j10 > 0) {
                        ucVar.H = j10;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                oc ocVar = this.f7373b.f7908a;
                if (ocVar != null) {
                    ocVar.f0();
                    return;
                }
                return;
            default:
                oc ocVar2 = this.f7373b.f7908a;
                if (ocVar2 != null) {
                    ocVar2.r();
                    return;
                }
                return;
        }
    }
}
