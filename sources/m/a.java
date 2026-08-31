package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;
public final class a implements Runnable {
    public final int f13136a;
    public final ActionBarOverlayLayout f13137b;

    public a(ActionBarOverlayLayout actionBarOverlayLayout, int i10) {
        this.f13136a = i10;
        this.f13137b = actionBarOverlayLayout;
    }

    @Override
    public final void run() {
        switch (this.f13136a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f13137b;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.J = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.K);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f13137b;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.J = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.K);
                return;
        }
    }
}
