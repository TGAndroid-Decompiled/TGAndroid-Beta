package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;
public final class a implements Runnable {
    public final int f15696a;
    public final ActionBarOverlayLayout f15697b;

    public a(ActionBarOverlayLayout actionBarOverlayLayout, int i10) {
        this.f15696a = i10;
        this.f15697b = actionBarOverlayLayout;
    }

    @Override
    public final void run() {
        switch (this.f15696a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f15697b;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.M = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.N);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f15697b;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.M = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.N);
                return;
        }
    }
}
