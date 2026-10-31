package ag;
public final class n implements Runnable {
    public final int f646a;
    public final w f647b;

    public n(w wVar, int i10) {
        this.f646a = i10;
        this.f647b = wVar;
    }

    @Override
    public final void run() {
        switch (this.f646a) {
            case 0:
                w.c0(this.f647b);
                return;
            case 1:
                w.d0(this.f647b);
                return;
            default:
                n nVar = this.f647b.e;
                org.telegram.messenger.i0.r(nVar);
                org.telegram.messenger.i0.h3(nVar, 5000L);
                return;
        }
    }
}
