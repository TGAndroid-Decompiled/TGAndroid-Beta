package ei;
public final class wb implements Runnable {
    public final int f10073a;
    public final gc f10074b;

    public wb(gc gcVar, int i10) {
        this.f10073a = i10;
        this.f10074b = gcVar;
    }

    @Override
    public final void run() {
        switch (this.f10073a) {
            case 0:
                gc gcVar = this.f10074b;
                ec ecVar = gcVar.M;
                if (ecVar != null) {
                    long j10 = ecVar.f8991a;
                    if (j10 > 0) {
                        gcVar.H = j10;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                zb zbVar = this.f10074b.f9089a;
                if (zbVar != null) {
                    zbVar.D();
                    return;
                }
                return;
            default:
                zb zbVar2 = this.f10074b.f9089a;
                if (zbVar2 != null) {
                    zbVar2.j();
                    return;
                }
                return;
        }
    }
}
