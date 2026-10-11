package ci;
public final class mc implements Runnable {
    public final int f5615a;
    public final wc f5616b;

    public mc(wc wcVar, int i10) {
        this.f5615a = i10;
        this.f5616b = wcVar;
    }

    @Override
    public final void run() {
        switch (this.f5615a) {
            case 0:
                wc wcVar = this.f5616b;
                uc ucVar = wcVar.M;
                if (ucVar != null) {
                    long j3 = ucVar.f6105a;
                    if (j3 > 0) {
                        wcVar.H = j3;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                pc pcVar = this.f5616b.f6226a;
                if (pcVar != null) {
                    pcVar.Q();
                    return;
                }
                return;
            default:
                pc pcVar2 = this.f5616b.f6226a;
                if (pcVar2 != null) {
                    pcVar2.o();
                    return;
                }
                return;
        }
    }
}
