package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;
public final class b implements Runnable {
    public final int f16220a;
    public final ActionBarOverlayLayout f16221b;

    public b(ActionBarOverlayLayout actionBarOverlayLayout, int i10) {
        this.f16220a = i10;
        this.f16221b = actionBarOverlayLayout;
    }

    @Override
    public final void run() {
        switch (this.f16220a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f16221b;
                actionBarOverlayLayout.c();
                actionBarOverlayLayout.M = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.N);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f16221b;
                actionBarOverlayLayout2.c();
                actionBarOverlayLayout2.M = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.N);
                return;
        }
    }
}
