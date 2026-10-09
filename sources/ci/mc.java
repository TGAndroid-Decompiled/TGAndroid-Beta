package ci;
public final class mc implements Runnable {
    public final int f5616a;
    public final wc f5617b;

    public mc(wc wcVar, int i10) {
        this.f5616a = i10;
        this.f5617b = wcVar;
    }

    @Override
    public final void run() {
        switch (this.f5616a) {
            case 0:
                wc wcVar = this.f5617b;
                uc ucVar = wcVar.M;
                if (ucVar != null) {
                    long j3 = ucVar.f6106a;
                    if (j3 > 0) {
                        wcVar.H = j3;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                pc pcVar = this.f5617b.f6227a;
                if (pcVar != null) {
                    pcVar.R();
                    return;
                }
                return;
            default:
                pc pcVar2 = this.f5617b.f6227a;
                if (pcVar2 != null) {
                    pcVar2.o();
                    return;
                }
                return;
        }
    }
}
