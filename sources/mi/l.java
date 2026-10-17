package mi;
public final class l implements Runnable {
    public final int f16958a;
    public final r f16959b;

    public l(r rVar, int i10) {
        this.f16958a = i10;
        this.f16959b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f16958a) {
            case 0:
                b bVar = this.f16959b.v;
                if (bVar != null) {
                    bVar.close();
                    return;
                }
                return;
            default:
                this.f16959b.a();
                return;
        }
    }
}
