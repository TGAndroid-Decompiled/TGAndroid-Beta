package kg;
public final class g implements Runnable {
    public final int f18413a;
    public final n f18414b;

    public g(n nVar, int i7) {
        this.f18413a = i7;
        this.f18414b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f18413a) {
            case 0:
                n.d0(this.f18414b);
                return;
            case 1:
                n.e0(this.f18414b);
                return;
            default:
                g gVar = this.f18414b.f18480e;
                org.telegram.messenger.g0.r(gVar);
                org.telegram.messenger.g0.h3(gVar, 5000L);
                return;
        }
    }
}
