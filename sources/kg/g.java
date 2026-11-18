package kg;
public final class g implements Runnable {
    public final int f18318a;
    public final n f18319b;

    public g(n nVar, int i7) {
        this.f18318a = i7;
        this.f18319b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f18318a) {
            case 0:
                n.d0(this.f18319b);
                return;
            case 1:
                n.e0(this.f18319b);
                return;
            default:
                g gVar = this.f18319b.f18389e;
                org.telegram.messenger.g0.r(gVar);
                org.telegram.messenger.g0.h3(gVar, 5000L);
                return;
        }
    }
}
