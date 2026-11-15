package hi;
public final class ta implements Runnable {
    public final int f15160a;
    public final cb f15161b;

    public ta(cb cbVar, int i7) {
        this.f15160a = i7;
        this.f15161b = cbVar;
    }

    @Override
    public final void run() {
        switch (this.f15160a) {
            case 0:
                cb cbVar = this.f15161b;
                ab abVar = cbVar.N;
                if (abVar != null) {
                    long j3 = abVar.f13900a;
                    if (j3 > 0) {
                        cbVar.I = j3;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                wa waVar = this.f15161b.f13990a;
                if (waVar != null) {
                    waVar.k0();
                    return;
                }
                return;
            default:
                wa waVar2 = this.f15161b.f13990a;
                if (waVar2 != null) {
                    waVar2.s();
                    return;
                }
                return;
        }
    }
}
