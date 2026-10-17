package ai;
public final class da implements Runnable {
    public final int f1174a;
    public final ea f1175b;
    public final long f1176c;

    public da(ea eaVar, long j10, int i10) {
        this.f1174a = i10;
        this.f1175b = eaVar;
        this.f1176c = j10;
    }

    @Override
    public final void run() {
        switch (this.f1174a) {
            case 0:
                ea eaVar = this.f1175b;
                eaVar.f1267q.d0(eaVar.f1255b, eaVar.f1256c, this.f1176c, true, true, eaVar.f1264n);
                return;
            default:
                ea eaVar2 = this.f1175b;
                eaVar2.f1267q.d0(eaVar2.f1255b, eaVar2.f1256c, this.f1176c, true, true, eaVar2.f1264n);
                return;
        }
    }
}
