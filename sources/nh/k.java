package nh;
public final class k extends org.telegram.ui.Components.n6 {
    public final int W;
    public final l X;

    public k(l lVar, int i10) {
        super(true, false, false, false);
        this.W = i10;
        this.X = lVar;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.W) {
            case 0:
                this.X.invalidateSelf();
                return;
            default:
                this.X.invalidateSelf();
                return;
        }
    }
}
