package mi;
public final class l implements Runnable {
    public final int f16964a;
    public final r f16965b;

    public l(r rVar, int i10) {
        this.f16964a = i10;
        this.f16965b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f16964a) {
            case 0:
                b bVar = this.f16965b.v;
                if (bVar != null) {
                    bVar.close();
                    return;
                }
                return;
            default:
                this.f16965b.a();
                return;
        }
    }
}
