package ai;
public final class ea implements Runnable {
    public final int f1255a;
    public final fa f1256b;
    public final long f1257c;

    public ea(fa faVar, long j10, int i10) {
        this.f1255a = i10;
        this.f1256b = faVar;
        this.f1257c = j10;
    }

    @Override
    public final void run() {
        switch (this.f1255a) {
            case 0:
                fa faVar = this.f1256b;
                faVar.f1308q.d0(faVar.f1296b, faVar.f1297c, this.f1257c, true, true, faVar.f1305n);
                return;
            default:
                fa faVar2 = this.f1256b;
                faVar2.f1308q.d0(faVar2.f1296b, faVar2.f1297c, this.f1257c, true, true, faVar2.f1305n);
                return;
        }
    }
}
