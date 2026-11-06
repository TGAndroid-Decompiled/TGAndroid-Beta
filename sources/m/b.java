package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;
public final class b implements Runnable {
    public final int f19065a;
    public final ActionBarOverlayLayout f19066b;

    public b(ActionBarOverlayLayout actionBarOverlayLayout, int i7) {
        this.f19065a = i7;
        this.f19066b = actionBarOverlayLayout;
    }

    @Override
    public final void run() {
        switch (this.f19065a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f19066b;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.M = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.N);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f19066b;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.M = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.N);
                return;
        }
    }
}
