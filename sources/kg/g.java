package kg;
public final class g implements Runnable {
    public final int f17941a;
    public final n f17942b;

    public g(n nVar, int i7) {
        this.f17941a = i7;
        this.f17942b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f17941a) {
            case 0:
                n.d0(this.f17942b);
                return;
            case 1:
                n.e0(this.f17942b);
                return;
            default:
                g gVar = this.f17942b.f17997e;
                org.telegram.messenger.g0.r(gVar);
                org.telegram.messenger.g0.i3(gVar, 5000L);
                return;
        }
    }
}
