package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;
public final class a implements Runnable {
    public final int f14316a;
    public final ActionBarOverlayLayout f14317b;

    public a(ActionBarOverlayLayout actionBarOverlayLayout, int i10) {
        this.f14316a = i10;
        this.f14317b = actionBarOverlayLayout;
    }

    @Override
    public final void run() {
        switch (this.f14316a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f14317b;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.M = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.N);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f14317b;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.M = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.N);
                return;
        }
    }
}
