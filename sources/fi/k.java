package fi;
public final class k extends org.telegram.ui.Components.r6 {
    public final int f11074d0;
    public final Object f11075e0;

    public k(l lVar, int i10) {
        super(true, false, false);
        this.f11074d0 = i10;
        this.f11075e0 = lVar;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f11074d0) {
            case 0:
                ((l) this.f11075e0).invalidateSelf();
                return;
            case 1:
                ((l) this.f11075e0).invalidateSelf();
                return;
            default:
                ((Runnable) this.f11075e0).run();
                return;
        }
    }

    public k(Runnable runnable) {
        super(false, true, true, true, false);
        this.f11074d0 = 2;
        this.f11075e0 = runnable;
    }
}
