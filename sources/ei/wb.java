package ei;
public final class wb implements Runnable {
    public final int f10056a;
    public final gc f10057b;

    public wb(gc gcVar, int i10) {
        this.f10056a = i10;
        this.f10057b = gcVar;
    }

    @Override
    public final void run() {
        switch (this.f10056a) {
            case 0:
                gc gcVar = this.f10057b;
                ec ecVar = gcVar.M;
                if (ecVar != null) {
                    long j10 = ecVar.f8980a;
                    if (j10 > 0) {
                        gcVar.H = j10;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                zb zbVar = this.f10057b.f9079a;
                if (zbVar != null) {
                    zbVar.P();
                    return;
                }
                return;
            default:
                zb zbVar2 = this.f10057b.f9079a;
                if (zbVar2 != null) {
                    zbVar2.q();
                    return;
                }
                return;
        }
    }
}
