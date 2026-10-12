package ki;
public final class l implements Runnable {
    public final int f14897a;
    public final q f14898b;

    public l(q qVar, int i10) {
        this.f14897a = i10;
        this.f14898b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f14897a) {
            case 0:
                b bVar = this.f14898b.v;
                if (bVar != null) {
                    bVar.close();
                    return;
                }
                return;
            default:
                this.f14898b.a();
                return;
        }
    }
}
