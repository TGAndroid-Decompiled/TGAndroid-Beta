package ci;
public final class k extends org.telegram.ui.Components.q6 {
    public final int f5299d0;
    public final l f5300e0;

    public k(l lVar, int i10) {
        super(true, false, false);
        this.f5299d0 = i10;
        this.f5300e0 = lVar;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f5299d0) {
            case 0:
                this.f5300e0.invalidateSelf();
                return;
            default:
                this.f5300e0.invalidateSelf();
                return;
        }
    }
}
