package ci;
public final class mc implements Runnable {
    public final int f5186a;
    public final wc f5187b;

    public mc(wc wcVar, int i10) {
        this.f5186a = i10;
        this.f5187b = wcVar;
    }

    @Override
    public final void run() {
        switch (this.f5186a) {
            case 0:
                wc wcVar = this.f5187b;
                uc ucVar = wcVar.M;
                if (ucVar != null) {
                    long j3 = ucVar.f5642a;
                    if (j3 > 0) {
                        wcVar.H = j3;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                pc pcVar = this.f5187b.f5743a;
                if (pcVar != null) {
                    pcVar.f0();
                    return;
                }
                return;
            default:
                pc pcVar2 = this.f5187b.f5743a;
                if (pcVar2 != null) {
                    pcVar2.s();
                    return;
                }
                return;
        }
    }
}
