package di;
public final class lc implements Runnable {
    public final int f7375a;
    public final uc f7376b;

    public lc(uc ucVar, int i10) {
        this.f7375a = i10;
        this.f7376b = ucVar;
    }

    @Override
    public final void run() {
        switch (this.f7375a) {
            case 0:
                uc ucVar = this.f7376b;
                sc scVar = ucVar.M;
                if (scVar != null) {
                    long j10 = scVar.f7800a;
                    if (j10 > 0) {
                        ucVar.H = j10;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                oc ocVar = this.f7376b.f7911a;
                if (ocVar != null) {
                    ocVar.c0();
                    return;
                }
                return;
            default:
                oc ocVar2 = this.f7376b.f7911a;
                if (ocVar2 != null) {
                    ocVar2.r();
                    return;
                }
                return;
        }
    }
}
