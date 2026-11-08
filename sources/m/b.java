package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;
public final class b implements Runnable {
    public final int f19068a;
    public final ActionBarOverlayLayout f19069b;

    public b(ActionBarOverlayLayout actionBarOverlayLayout, int i7) {
        this.f19068a = i7;
        this.f19069b = actionBarOverlayLayout;
    }

    @Override
    public final void run() {
        switch (this.f19068a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f19069b;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.M = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.N);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f19069b;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.M = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.N);
                return;
        }
    }
}
