package defpackage;

import android.widget.FrameLayout;
public final class lea extends rb0 {
    public final byte M;
    public final FrameLayout N;

    public lea(FrameLayout frameLayout, vnb vnbVar, byte b) {
        super(vnbVar);
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
                ((nea) frameLayout).a.invalidate();
                return;
            default:
                super.invalidateSelf();
                ((tea) frameLayout).a.invalidate();
                return;
        }
    }
}
