package bi;
public final class de implements Runnable {
    public final int f2569a;
    public final me f2570b;

    public de(me meVar, int i10) {
        this.f2569a = i10;
        this.f2570b = meVar;
    }

    @Override
    public final void run() {
        switch (this.f2569a) {
            case 0:
                me meVar = this.f2570b;
                ke keVar = meVar.M;
                if (keVar != null) {
                    long j3 = keVar.f3022a;
                    if (j3 > 0) {
                        meVar.H = j3;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ge geVar = this.f2570b.f3148a;
                if (geVar != null) {
                    geVar.h0();
                    return;
                }
                return;
            default:
                ge geVar2 = this.f2570b.f3148a;
                if (geVar2 != null) {
                    geVar2.r();
                    return;
                }
                return;
        }
    }
}
