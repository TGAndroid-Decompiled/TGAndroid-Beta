package mi;
public final class l implements Runnable {
    public final int f16963a;
    public final r f16964b;

    public l(r rVar, int i10) {
        this.f16963a = i10;
        this.f16964b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f16963a) {
            case 0:
                b bVar = this.f16964b.v;
                if (bVar != null) {
                    bVar.close();
                    return;
                }
                return;
            default:
                this.f16964b.a();
                return;
        }
    }
}
