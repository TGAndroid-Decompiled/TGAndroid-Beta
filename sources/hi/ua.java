package hi;
public final class ua implements Runnable {
    public final int f15548a;
    public final db f15549b;

    public ua(db dbVar, int i7) {
        this.f15548a = i7;
        this.f15549b = dbVar;
    }

    @Override
    public final void run() {
        switch (this.f15548a) {
            case 0:
                db dbVar = this.f15549b;
                bb bbVar = dbVar.N;
                if (bbVar != null) {
                    long j3 = bbVar.f14284a;
                    if (j3 > 0) {
                        dbVar.I = j3;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                xa xaVar = this.f15549b.f14444a;
                if (xaVar != null) {
                    xaVar.N1();
                    return;
                }
                return;
            default:
                xa xaVar2 = this.f15549b.f14444a;
                if (xaVar2 != null) {
                    xaVar2.f0();
                    return;
                }
                return;
        }
    }
}
