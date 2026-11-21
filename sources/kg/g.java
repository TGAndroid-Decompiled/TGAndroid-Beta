package kg;
public final class g implements Runnable {
    public final int f18349a;
    public final n f18350b;

    public g(n nVar, int i7) {
        this.f18349a = i7;
        this.f18350b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f18349a) {
            case 0:
                n.d0(this.f18350b);
                return;
            case 1:
                n.e0(this.f18350b);
                return;
            default:
                g gVar = this.f18350b.f18415e;
                org.telegram.messenger.g0.r(gVar);
                org.telegram.messenger.g0.h3(gVar, 5000L);
                return;
        }
    }
}
