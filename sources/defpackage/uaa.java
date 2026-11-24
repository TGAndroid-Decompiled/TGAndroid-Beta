package defpackage;

import android.widget.FrameLayout;
public final class uaa extends pb0 {
    public final byte M;
    public final FrameLayout N;

    public uaa(FrameLayout frameLayout, wjb wjbVar, byte b) {
        super(wjbVar);
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
                ((waa) frameLayout).a.invalidate();
                return;
            default:
                super.invalidateSelf();
                ((cba) frameLayout).a.invalidate();
                return;
        }
    }
}
