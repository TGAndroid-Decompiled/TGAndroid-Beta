package ai;
public final class ea implements Runnable {
    public final int f1231a;
    public final fa f1232b;
    public final long f1233c;

    public ea(fa faVar, long j10, int i10) {
        this.f1231a = i10;
        this.f1232b = faVar;
        this.f1233c = j10;
    }

    @Override
    public final void run() {
        switch (this.f1231a) {
            case 0:
                fa faVar = this.f1232b;
                faVar.f1318q.d0(faVar.f1306b, faVar.f1307c, this.f1233c, true, true, faVar.f1315n);
                return;
            default:
                fa faVar2 = this.f1232b;
                faVar2.f1318q.d0(faVar2.f1306b, faVar2.f1307c, this.f1233c, true, true, faVar2.f1315n);
                return;
        }
    }
}
