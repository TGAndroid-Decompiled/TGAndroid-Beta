package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;
public final class a implements Runnable {
    public final int f15370a;
    public final ActionBarOverlayLayout f15371b;

    public a(ActionBarOverlayLayout actionBarOverlayLayout, int i10) {
        this.f15370a = i10;
        this.f15371b = actionBarOverlayLayout;
    }

    @Override
    public final void run() {
        switch (this.f15370a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f15371b;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.M = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.N);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f15371b;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.M = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.N);
                return;
        }
    }
}
