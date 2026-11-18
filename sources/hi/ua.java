package hi;
public final class ua implements Runnable {
    public final int f15551a;
    public final db f15552b;

    public ua(db dbVar, int i7) {
        this.f15551a = i7;
        this.f15552b = dbVar;
    }

    @Override
    public final void run() {
        switch (this.f15551a) {
            case 0:
                db dbVar = this.f15552b;
                bb bbVar = dbVar.N;
                if (bbVar != null) {
                    long j3 = bbVar.f14287a;
                    if (j3 > 0) {
                        dbVar.I = j3;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                xa xaVar = this.f15552b.f14447a;
                if (xaVar != null) {
                    xaVar.N1();
                    return;
                }
                return;
            default:
                xa xaVar2 = this.f15552b.f14447a;
                if (xaVar2 != null) {
                    xaVar2.f0();
                    return;
                }
                return;
        }
    }
}
