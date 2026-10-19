package ei;
public final class wb implements Runnable {
    public final int f10058a;
    public final gc f10059b;

    public wb(gc gcVar, int i10) {
        this.f10058a = i10;
        this.f10059b = gcVar;
    }

    @Override
    public final void run() {
        switch (this.f10058a) {
            case 0:
                gc gcVar = this.f10059b;
                ec ecVar = gcVar.M;
                if (ecVar != null) {
                    long j10 = ecVar.f8982a;
                    if (j10 > 0) {
                        gcVar.H = j10;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                zb zbVar = this.f10059b.f9081a;
                if (zbVar != null) {
                    zbVar.P();
                    return;
                }
                return;
            default:
                zb zbVar2 = this.f10059b.f9081a;
                if (zbVar2 != null) {
                    zbVar2.q();
                    return;
                }
                return;
        }
    }
}
