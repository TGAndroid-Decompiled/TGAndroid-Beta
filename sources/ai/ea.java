package ai;
public final class ea implements Runnable {
    public final int f1258a;
    public final fa f1259b;
    public final long f1260c;

    public ea(fa faVar, long j10, int i10) {
        this.f1258a = i10;
        this.f1259b = faVar;
        this.f1260c = j10;
    }

    @Override
    public final void run() {
        switch (this.f1258a) {
            case 0:
                fa faVar = this.f1259b;
                faVar.f1309q.d0(faVar.f1297b, faVar.f1298c, this.f1260c, true, true, faVar.f1306n);
                return;
            default:
                fa faVar2 = this.f1259b;
                faVar2.f1309q.d0(faVar2.f1297b, faVar2.f1298c, this.f1260c, true, true, faVar2.f1306n);
                return;
        }
    }
}
