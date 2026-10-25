package ni;
public final class l implements Runnable {
    public final int f18890a;
    public final q f18891b;

    public l(q qVar, int i10) {
        this.f18890a = i10;
        this.f18891b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f18890a) {
            case 0:
                b bVar = this.f18891b.v;
                if (bVar != null) {
                    bVar.close();
                    return;
                }
                return;
            default:
                this.f18891b.a();
                return;
        }
    }
}
