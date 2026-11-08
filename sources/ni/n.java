package ni;
public final class n implements Runnable {
    public final int f20639a;
    public final s f20640b;

    public n(s sVar, int i7) {
        this.f20639a = i7;
        this.f20640b = sVar;
    }

    @Override
    public final void run() {
        switch (this.f20639a) {
            case 0:
                d dVar = this.f20640b.f20655w;
                if (dVar != null) {
                    dVar.close();
                    return;
                }
                return;
            default:
                this.f20640b.a();
                return;
        }
    }
}
