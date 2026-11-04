package lg;
public final class g implements Runnable {
    public final int f18305a;
    public final m f18306b;

    public g(m mVar, int i3) {
        this.f18305a = i3;
        this.f18306b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f18305a) {
            case 0:
                m.d0(this.f18306b);
                return;
            case 1:
                m.e0(this.f18306b);
                return;
            default:
                g gVar = this.f18306b.f18357e;
                org.telegram.messenger.g0.r(gVar);
                org.telegram.messenger.g0.i3(gVar, 5000L);
                return;
        }
    }
}
