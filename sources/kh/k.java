package kh;
public final class k extends org.telegram.ui.Components.i6 {
    public final int W;
    public final l X;

    public k(l lVar, int i9) {
        super(true, false, false, false);
        this.W = i9;
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
