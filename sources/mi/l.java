package mi;
public final class l implements Runnable {
    public final int f16966a;
    public final r f16967b;

    public l(r rVar, int i10) {
        this.f16966a = i10;
        this.f16967b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f16966a) {
            case 0:
                b bVar = this.f16967b.v;
                if (bVar != null) {
                    bVar.close();
                    return;
                }
                return;
            default:
                this.f16967b.a();
                return;
        }
    }
}
