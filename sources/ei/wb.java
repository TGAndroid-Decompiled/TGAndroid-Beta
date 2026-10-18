package ei;
public final class wb implements Runnable {
    public final int f10057a;
    public final gc f10058b;

    public wb(gc gcVar, int i10) {
        this.f10057a = i10;
        this.f10058b = gcVar;
    }

    @Override
    public final void run() {
        switch (this.f10057a) {
            case 0:
                gc gcVar = this.f10058b;
                ec ecVar = gcVar.M;
                if (ecVar != null) {
                    long j10 = ecVar.f8981a;
                    if (j10 > 0) {
                        gcVar.H = j10;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                zb zbVar = this.f10058b.f9080a;
                if (zbVar != null) {
                    zbVar.Q();
                    return;
                }
                return;
            default:
                zb zbVar2 = this.f10058b.f9080a;
                if (zbVar2 != null) {
                    zbVar2.q();
                    return;
                }
                return;
        }
    }
}
