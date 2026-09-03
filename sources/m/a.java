package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;
public final class a implements Runnable {
    public final int f13138a;
    public final ActionBarOverlayLayout f13139b;

    public a(ActionBarOverlayLayout actionBarOverlayLayout, int i10) {
        this.f13138a = i10;
        this.f13139b = actionBarOverlayLayout;
    }

    @Override
    public final void run() {
        switch (this.f13138a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f13139b;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.J = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.K);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f13139b;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.J = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.K);
                return;
        }
    }
}
