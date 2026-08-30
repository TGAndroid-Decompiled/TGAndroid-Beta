package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;
public final class a implements Runnable {
    public final int f13451a;
    public final ActionBarOverlayLayout f13452b;

    public a(ActionBarOverlayLayout actionBarOverlayLayout, int i10) {
        this.f13451a = i10;
        this.f13452b = actionBarOverlayLayout;
    }

    @Override
    public final void run() {
        switch (this.f13451a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f13452b;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.J = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.K);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f13452b;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.J = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.K);
                return;
        }
    }
}
