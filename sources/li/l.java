package li;
public final class l implements Runnable {
    public final int f14764a;
    public final q f14765b;

    public l(q qVar, int i10) {
        this.f14764a = i10;
        this.f14765b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f14764a) {
            case 0:
                b bVar = this.f14765b.v;
                if (bVar != null) {
                    bVar.close();
                    return;
                }
                return;
            default:
                this.f14765b.a();
                return;
        }
    }
}
