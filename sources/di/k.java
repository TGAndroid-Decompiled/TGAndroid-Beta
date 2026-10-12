package di;
public final class k extends org.telegram.ui.Components.r6 {
    public final int f7148d0;
    public final l f7149e0;

    public k(l lVar, int i10) {
        super(true, false, false);
        this.f7148d0 = i10;
        this.f7149e0 = lVar;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f7148d0) {
            case 0:
                this.f7149e0.invalidateSelf();
                return;
            default:
                this.f7149e0.invalidateSelf();
                return;
        }
    }
}
