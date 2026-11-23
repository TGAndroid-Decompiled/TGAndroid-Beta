package hi;
public final class ua implements Runnable {
    public final int f15507a;
    public final db f15508b;

    public ua(db dbVar, int i7) {
        this.f15507a = i7;
        this.f15508b = dbVar;
    }

    @Override
    public final void run() {
        switch (this.f15507a) {
            case 0:
                db dbVar = this.f15508b;
                bb bbVar = dbVar.N;
                if (bbVar != null) {
                    long j3 = bbVar.f14233a;
                    if (j3 > 0) {
                        dbVar.I = j3;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                xa xaVar = this.f15508b.f14421a;
                if (xaVar != null) {
                    xaVar.N1();
                    return;
                }
                return;
            default:
                xa xaVar2 = this.f15508b.f14421a;
                if (xaVar2 != null) {
                    xaVar2.f0();
                    return;
                }
                return;
        }
    }
}
