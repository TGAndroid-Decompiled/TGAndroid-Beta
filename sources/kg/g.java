package kg;
public final class g implements Runnable {
    public final int f18352a;
    public final n f18353b;

    public g(n nVar, int i7) {
        this.f18352a = i7;
        this.f18353b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f18352a) {
            case 0:
                n.d0(this.f18353b);
                return;
            case 1:
                n.e0(this.f18353b);
                return;
            default:
                g gVar = this.f18353b.f18418e;
                org.telegram.messenger.g0.r(gVar);
                org.telegram.messenger.g0.h3(gVar, 5000L);
                return;
        }
    }
}
