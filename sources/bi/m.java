package bi;
public final class m extends org.telegram.ui.Components.n6 {
    public final int W;
    public final n X;

    public m(n nVar, int i10) {
        super(true, false, false, false);
        this.W = i10;
        this.X = nVar;
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
