package hi;
public final class l extends org.telegram.ui.Components.m6 {
    public final int f14805e0;
    public final Object f14806f0;

    public l(m mVar, int i7) {
        super(true, false, false);
        this.f14805e0 = i7;
        this.f14806f0 = mVar;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f14805e0) {
            case 0:
                ((m) this.f14806f0).invalidateSelf();
                return;
            case 1:
                ((m) this.f14806f0).invalidateSelf();
                return;
            default:
                ((Runnable) this.f14806f0).run();
                return;
        }
    }

    public l(Runnable runnable) {
        super(false, true, true, true, false);
        this.f14805e0 = 2;
        this.f14806f0 = runnable;
    }
}
