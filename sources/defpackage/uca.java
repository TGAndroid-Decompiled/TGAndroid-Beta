package defpackage;

import android.widget.FrameLayout;
public final class uca extends pc0 {
    public final byte M;
    public final FrameLayout N;

    public uca(FrameLayout frameLayout, ylb ylbVar, byte b) {
        super(ylbVar);
        this.M = b;
        this.N = frameLayout;
    }

    @Override
    public final void invalidateSelf() {
        byte b = this.M;
        FrameLayout frameLayout = this.N;
        switch (b) {
            case 0:
                super.invalidateSelf();
                ((wca) frameLayout).a.invalidate();
                return;
            default:
                super.invalidateSelf();
                ((cda) frameLayout).a.invalidate();
                return;
        }
    }
}
