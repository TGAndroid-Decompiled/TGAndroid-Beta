package kg;
public final class g implements Runnable {
    public final int f17379a;
    public final m f17380b;

    public g(m mVar, int i7) {
        this.f17379a = i7;
        this.f17380b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f17379a) {
            case 0:
                m.d0(this.f17380b);
                return;
            case 1:
                m.e0(this.f17380b);
                return;
            default:
                g gVar = this.f17380b.f17425e;
                org.telegram.messenger.g0.r(gVar);
                org.telegram.messenger.g0.i3(gVar, 5000L);
                return;
        }
    }
}
