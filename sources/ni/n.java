package ni;
public final class n implements Runnable {
    public final int f20636a;
    public final s f20637b;

    public n(s sVar, int i7) {
        this.f20636a = i7;
        this.f20637b = sVar;
    }

    @Override
    public final void run() {
        switch (this.f20636a) {
            case 0:
                d dVar = this.f20637b.f20652w;
                if (dVar != null) {
                    dVar.close();
                    return;
                }
                return;
            default:
                this.f20637b.a();
                return;
        }
    }
}
