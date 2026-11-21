package hi;
public final class ta implements Runnable {
    public final int f15517a;
    public final cb f15518b;

    public ta(cb cbVar, int i7) {
        this.f15517a = i7;
        this.f15518b = cbVar;
    }

    @Override
    public final void run() {
        switch (this.f15517a) {
            case 0:
                cb cbVar = this.f15518b;
                ab abVar = cbVar.N;
                if (abVar != null) {
                    long j3 = abVar.f14265a;
                    if (j3 > 0) {
                        cbVar.I = j3;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                wa waVar = this.f15518b.f14394a;
                if (waVar != null) {
                    waVar.N1();
                    return;
                }
                return;
            default:
                wa waVar2 = this.f15518b.f14394a;
                if (waVar2 != null) {
                    waVar2.f0();
                    return;
                }
                return;
        }
    }
}
