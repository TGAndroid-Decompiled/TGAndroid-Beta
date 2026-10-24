package ei;
public final class k extends org.telegram.ui.Components.n6 {
    public final int f9299d0;
    public final Object f9300e0;

    public k(l lVar, int i10) {
        super(true, false, false);
        this.f9299d0 = i10;
        this.f9300e0 = lVar;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f9299d0) {
            case 0:
                ((l) this.f9300e0).invalidateSelf();
                return;
            case 1:
                ((l) this.f9300e0).invalidateSelf();
                return;
            default:
                ((Runnable) this.f9300e0).run();
                return;
        }
    }

    public k(Runnable runnable) {
        super(false, true, true, true, false);
        this.f9299d0 = 2;
        this.f9300e0 = runnable;
    }
}
