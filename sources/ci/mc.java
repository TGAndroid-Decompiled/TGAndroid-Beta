package ci;
public final class mc implements Runnable {
    public final int f5193a;
    public final wc f5194b;

    public mc(wc wcVar, int i10) {
        this.f5193a = i10;
        this.f5194b = wcVar;
    }

    @Override
    public final void run() {
        switch (this.f5193a) {
            case 0:
                wc wcVar = this.f5194b;
                uc ucVar = wcVar.M;
                if (ucVar != null) {
                    long j3 = ucVar.f5651a;
                    if (j3 > 0) {
                        wcVar.H = j3;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                pc pcVar = this.f5194b.f5755a;
                if (pcVar != null) {
                    pcVar.b0();
                    return;
                }
                return;
            default:
                pc pcVar2 = this.f5194b.f5755a;
                if (pcVar2 != null) {
                    pcVar2.r();
                    return;
                }
                return;
        }
    }
}
