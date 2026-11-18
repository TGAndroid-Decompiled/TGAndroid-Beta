package hi;
public final class l extends org.telegram.ui.Components.m6 {
    public final int f14881e0;
    public final Object f14882f0;

    public l(m mVar, int i7) {
        super(true, false, false);
        this.f14881e0 = i7;
        this.f14882f0 = mVar;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f14881e0) {
            case 0:
                ((m) this.f14882f0).invalidateSelf();
                return;
            case 1:
                ((m) this.f14882f0).invalidateSelf();
                return;
            default:
                ((Runnable) this.f14882f0).run();
                return;
        }
    }

    public l(Runnable runnable) {
        super(false, true, true, true, false);
        this.f14881e0 = 2;
        this.f14882f0 = runnable;
    }
}
