package hi;
public final class k extends org.telegram.ui.Components.n6 {
    public final int f14792e0;
    public final Object f14793f0;

    public k(l lVar, int i7) {
        super(true, false, false);
        this.f14792e0 = i7;
        this.f14793f0 = lVar;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f14792e0) {
            case 0:
                ((l) this.f14793f0).invalidateSelf();
                return;
            case 1:
                ((l) this.f14793f0).invalidateSelf();
                return;
            default:
                ((Runnable) this.f14793f0).run();
                return;
        }
    }

    public k(Runnable runnable) {
        super(false, true, true, true, false);
        this.f14792e0 = 2;
        this.f14793f0 = runnable;
    }
}
