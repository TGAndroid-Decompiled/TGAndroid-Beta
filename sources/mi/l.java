package mi;
public final class l implements Runnable {
    public final int f16965a;
    public final r f16966b;

    public l(r rVar, int i10) {
        this.f16965a = i10;
        this.f16966b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f16965a) {
            case 0:
                b bVar = this.f16966b.v;
                if (bVar != null) {
                    bVar.close();
                    return;
                }
                return;
            default:
                this.f16966b.a();
                return;
        }
    }
}
