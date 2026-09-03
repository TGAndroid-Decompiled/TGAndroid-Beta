package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;
public final class a implements Runnable {
    public final int f13435a;
    public final ActionBarOverlayLayout f13436b;

    public a(ActionBarOverlayLayout actionBarOverlayLayout, int i10) {
        this.f13435a = i10;
        this.f13436b = actionBarOverlayLayout;
    }

    @Override
    public final void run() {
        switch (this.f13435a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f13436b;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.J = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.K);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f13436b;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.J = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.K);
                return;
        }
    }
}
