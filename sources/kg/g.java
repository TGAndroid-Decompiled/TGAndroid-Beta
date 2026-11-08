package kg;
public final class g implements Runnable {
    public final int f17382a;
    public final m f17383b;

    public g(m mVar, int i7) {
        this.f17382a = i7;
        this.f17383b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f17382a) {
            case 0:
                m.d0(this.f17383b);
                return;
            case 1:
                m.e0(this.f17383b);
                return;
            default:
                g gVar = this.f17383b.f17428e;
                org.telegram.messenger.g0.r(gVar);
                org.telegram.messenger.g0.i3(gVar, 5000L);
                return;
        }
    }
}
