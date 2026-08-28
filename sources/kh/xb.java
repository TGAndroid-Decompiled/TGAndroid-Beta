package kh;
public final class xb implements Runnable {
    public final int f16387a;
    public final gc f16388b;

    public xb(gc gcVar, int i9) {
        this.f16387a = i9;
        this.f16388b = gcVar;
    }

    @Override
    public final void run() {
        switch (this.f16387a) {
            case 0:
                gc gcVar = this.f16388b;
                ec ecVar = gcVar.I;
                if (ecVar != null) {
                    long j10 = ecVar.f15180a;
                    if (j10 > 0) {
                        gcVar.D = j10;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ac acVar = this.f16388b.f15326a;
                if (acVar != null) {
                    acVar.a2();
                    return;
                }
                return;
            default:
                ac acVar2 = this.f16388b.f15326a;
                if (acVar2 != null) {
                    acVar2.g0();
                    return;
                }
                return;
        }
    }
}
