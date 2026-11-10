package fi;
public final class k extends org.telegram.ui.Components.h6 {
    public final int f12250d0;
    public final Object f12251e0;

    public k(l lVar, int i7) {
        super(true, false, false);
        this.f12250d0 = i7;
        this.f12251e0 = lVar;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f12250d0) {
            case 0:
                ((l) this.f12251e0).invalidateSelf();
                return;
            case 1:
                ((l) this.f12251e0).invalidateSelf();
                return;
            default:
                ((Runnable) this.f12251e0).run();
                return;
        }
    }

    public k(Runnable runnable) {
        super(false, true, true, true, false);
        this.f12250d0 = 2;
        this.f12251e0 = runnable;
    }
}
