package hi;
public final class m extends org.telegram.ui.Components.n6 {
    public final int f15016e0;
    public final Object f15017f0;

    public m(n nVar, int i7) {
        super(true, false, false);
        this.f15016e0 = i7;
        this.f15017f0 = nVar;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f15016e0) {
            case 0:
                ((n) this.f15017f0).invalidateSelf();
                return;
            case 1:
                ((n) this.f15017f0).invalidateSelf();
                return;
            default:
                ((Runnable) this.f15017f0).run();
                return;
        }
    }

    public m(Runnable runnable) {
        super(false, true, true, true, false);
        this.f15016e0 = 2;
        this.f15017f0 = runnable;
    }
}
