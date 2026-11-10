package ni;
public final class n implements Runnable {
    public final int f20644a;
    public final s f20645b;

    public n(s sVar, int i7) {
        this.f20644a = i7;
        this.f20645b = sVar;
    }

    @Override
    public final void run() {
        switch (this.f20644a) {
            case 0:
                d dVar = this.f20645b.f20660w;
                if (dVar != null) {
                    dVar.close();
                    return;
                }
                return;
            default:
                this.f20645b.a();
                return;
        }
    }
}
