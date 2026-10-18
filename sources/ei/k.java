package ei;
public final class k extends org.telegram.ui.Components.p6 {
    public final int f9289e0;
    public final Object f9290f0;

    public k(l lVar, int i10) {
        super(true, false, false);
        this.f9289e0 = i10;
        this.f9290f0 = lVar;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f9289e0) {
            case 0:
                ((l) this.f9290f0).invalidateSelf();
                return;
            case 1:
                ((l) this.f9290f0).invalidateSelf();
                return;
            default:
                ((Runnable) this.f9290f0).run();
                return;
        }
    }

    public k(Runnable runnable) {
        super(false, true, true, true, false);
        this.f9289e0 = 2;
        this.f9290f0 = runnable;
    }
}
