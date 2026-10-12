package ki;
public final class l implements Runnable {
    public final int f14896a;
    public final q f14897b;

    public l(q qVar, int i10) {
        this.f14896a = i10;
        this.f14897b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f14896a) {
            case 0:
                b bVar = this.f14897b.v;
                if (bVar != null) {
                    bVar.close();
                    return;
                }
                return;
            default:
                this.f14897b.a();
                return;
        }
    }
}
