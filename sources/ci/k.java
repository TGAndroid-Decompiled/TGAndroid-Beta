package ci;
public final class k extends org.telegram.ui.Components.q6 {
    public final int f5297d0;
    public final l f5298e0;

    public k(l lVar, int i10) {
        super(true, false, false);
        this.f5297d0 = i10;
        this.f5298e0 = lVar;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f5297d0) {
            case 0:
                this.f5298e0.invalidateSelf();
                return;
            default:
                this.f5298e0.invalidateSelf();
                return;
        }
    }
}
