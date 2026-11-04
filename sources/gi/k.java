package gi;
public final class k extends org.telegram.ui.Components.g6 {
    public final int f13024d0;
    public final Object f13025e0;

    public k(l lVar, int i3) {
        super(true, false, false);
        this.f13024d0 = i3;
        this.f13025e0 = lVar;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f13024d0) {
            case 0:
                ((l) this.f13025e0).invalidateSelf();
                return;
            case 1:
                ((l) this.f13025e0).invalidateSelf();
                return;
            default:
                ((Runnable) this.f13025e0).run();
                return;
        }
    }

    public k(Runnable runnable) {
        super(false, true, true, true, false);
        this.f13024d0 = 2;
        this.f13025e0 = runnable;
    }
}
