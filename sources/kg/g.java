package kg;
public final class g implements Runnable {
    public final int f18317a;
    public final n f18318b;

    public g(n nVar, int i7) {
        this.f18317a = i7;
        this.f18318b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f18317a) {
            case 0:
                n.d0(this.f18318b);
                return;
            case 1:
                n.e0(this.f18318b);
                return;
            default:
                g gVar = this.f18318b.f18385e;
                org.telegram.messenger.g0.r(gVar);
                org.telegram.messenger.g0.h3(gVar, 5000L);
                return;
        }
    }
}
