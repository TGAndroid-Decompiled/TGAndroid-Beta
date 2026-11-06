package fi;
public final class k extends org.telegram.ui.Components.i6 {
    public final int f12247d0;
    public final Object f12248e0;

    public k(l lVar, int i7) {
        super(true, false, false);
        this.f12247d0 = i7;
        this.f12248e0 = lVar;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f12247d0) {
            case 0:
                ((l) this.f12248e0).invalidateSelf();
                return;
            case 1:
                ((l) this.f12248e0).invalidateSelf();
                return;
            default:
                ((Runnable) this.f12248e0).run();
                return;
        }
    }

    public k(Runnable runnable) {
        super(false, true, true, true, false);
        this.f12247d0 = 2;
        this.f12248e0 = runnable;
    }
}
