package ai;
public final class ea implements Runnable {
    public final int f1224a;
    public final fa f1225b;
    public final long f1226c;

    public ea(fa faVar, long j10, int i10) {
        this.f1224a = i10;
        this.f1225b = faVar;
        this.f1226c = j10;
    }

    @Override
    public final void run() {
        switch (this.f1224a) {
            case 0:
                fa faVar = this.f1225b;
                faVar.f1321q.d0(faVar.f1309b, faVar.f1310c, this.f1226c, true, true, faVar.f1318n);
                return;
            default:
                fa faVar2 = this.f1225b;
                faVar2.f1321q.d0(faVar2.f1309b, faVar2.f1310c, this.f1226c, true, true, faVar2.f1318n);
                return;
        }
    }
}
