package mi;
public final class l implements Runnable {
    public final int f17027a;
    public final r f17028b;

    public l(r rVar, int i10) {
        this.f17027a = i10;
        this.f17028b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f17027a) {
            case 0:
                b bVar = this.f17028b.v;
                if (bVar != null) {
                    bVar.close();
                    return;
                }
                return;
            default:
                this.f17028b.a();
                return;
        }
    }
}
