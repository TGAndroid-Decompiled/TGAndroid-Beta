package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;
public final class b implements Runnable {
    public final int f19073a;
    public final ActionBarOverlayLayout f19074b;

    public b(ActionBarOverlayLayout actionBarOverlayLayout, int i7) {
        this.f19073a = i7;
        this.f19074b = actionBarOverlayLayout;
    }

    @Override
    public final void run() {
        switch (this.f19073a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f19074b;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.M = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.N);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f19074b;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.M = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.N);
                return;
        }
    }
}
