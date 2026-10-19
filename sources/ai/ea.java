package ai;
public final class ea implements Runnable {
    public final int f1254a;
    public final fa f1255b;
    public final long f1256c;

    public ea(fa faVar, long j10, int i10) {
        this.f1254a = i10;
        this.f1255b = faVar;
        this.f1256c = j10;
    }

    @Override
    public final void run() {
        switch (this.f1254a) {
            case 0:
                fa faVar = this.f1255b;
                faVar.f1303q.d0(faVar.f1291b, faVar.f1292c, this.f1256c, true, true, faVar.f1300n);
                return;
            default:
                fa faVar2 = this.f1255b;
                faVar2.f1303q.d0(faVar2.f1291b, faVar2.f1292c, this.f1256c, true, true, faVar2.f1300n);
                return;
        }
    }
}
