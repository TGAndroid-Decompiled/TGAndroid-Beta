package kg;
public final class g implements Runnable {
    public final int f18315a;
    public final n f18316b;

    public g(n nVar, int i7) {
        this.f18315a = i7;
        this.f18316b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f18315a) {
            case 0:
                n.d0(this.f18316b);
                return;
            case 1:
                n.e0(this.f18316b);
                return;
            default:
                g gVar = this.f18316b.f18386e;
                org.telegram.messenger.g0.r(gVar);
                org.telegram.messenger.g0.h3(gVar, 5000L);
                return;
        }
    }
}
