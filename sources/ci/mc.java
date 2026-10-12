package ci;
public final class mc implements Runnable {
    public final int f5614a;
    public final wc f5615b;

    public mc(wc wcVar, int i10) {
        this.f5614a = i10;
        this.f5615b = wcVar;
    }

    @Override
    public final void run() {
        switch (this.f5614a) {
            case 0:
                wc wcVar = this.f5615b;
                uc ucVar = wcVar.M;
                if (ucVar != null) {
                    long j3 = ucVar.f6104a;
                    if (j3 > 0) {
                        wcVar.H = j3;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                pc pcVar = this.f5615b.f6225a;
                if (pcVar != null) {
                    pcVar.R();
                    return;
                }
                return;
            default:
                pc pcVar2 = this.f5615b.f6225a;
                if (pcVar2 != null) {
                    pcVar2.p();
                    return;
                }
                return;
        }
    }
}
