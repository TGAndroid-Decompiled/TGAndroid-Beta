package ei;
public final class k extends org.telegram.ui.Components.p6 {
    public final int f9290d0;
    public final Object f9291e0;

    public k(l lVar, int i10) {
        super(true, false, false);
        this.f9290d0 = i10;
        this.f9291e0 = lVar;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f9290d0) {
            case 0:
                ((l) this.f9291e0).invalidateSelf();
                return;
            case 1:
                ((l) this.f9291e0).invalidateSelf();
                return;
            default:
                ((Runnable) this.f9291e0).run();
                return;
        }
    }

    public k(Runnable runnable) {
        super(false, true, true, true, false);
        this.f9290d0 = 2;
        this.f9291e0 = runnable;
    }
}
