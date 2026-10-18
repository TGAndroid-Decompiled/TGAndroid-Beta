package ei;
public final class wb implements Runnable {
    public final int f10059a;
    public final gc f10060b;

    public wb(gc gcVar, int i10) {
        this.f10059a = i10;
        this.f10060b = gcVar;
    }

    @Override
    public final void run() {
        switch (this.f10059a) {
            case 0:
                gc gcVar = this.f10060b;
                ec ecVar = gcVar.M;
                if (ecVar != null) {
                    long j10 = ecVar.f8983a;
                    if (j10 > 0) {
                        gcVar.H = j10;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                zb zbVar = this.f10060b.f9082a;
                if (zbVar != null) {
                    zbVar.Q();
                    return;
                }
                return;
            default:
                zb zbVar2 = this.f10060b.f9082a;
                if (zbVar2 != null) {
                    zbVar2.q();
                    return;
                }
                return;
        }
    }
}
