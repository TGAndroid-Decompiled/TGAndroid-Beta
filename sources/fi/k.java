package fi;
public final class k extends org.telegram.ui.Components.r6 {
    public final int f11073d0;
    public final Object f11074e0;

    public k(l lVar, int i10) {
        super(true, false, false);
        this.f11073d0 = i10;
        this.f11074e0 = lVar;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f11073d0) {
            case 0:
                ((l) this.f11074e0).invalidateSelf();
                return;
            case 1:
                ((l) this.f11074e0).invalidateSelf();
                return;
            default:
                ((Runnable) this.f11074e0).run();
                return;
        }
    }

    public k(Runnable runnable) {
        super(false, true, true, true, false);
        this.f11073d0 = 2;
        this.f11074e0 = runnable;
    }
}
