package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;
public final class a implements Runnable {
    public final int f14119a;
    public final ActionBarOverlayLayout f14120b;

    public a(ActionBarOverlayLayout actionBarOverlayLayout, int i10) {
        this.f14119a = i10;
        this.f14120b = actionBarOverlayLayout;
    }

    @Override
    public final void run() {
        switch (this.f14119a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f14120b;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.M = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.N);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f14120b;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.M = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.N);
                return;
        }
    }
}
