package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;
public final class a implements Runnable {
    public final int f14785a;
    public final ActionBarOverlayLayout f14786b;

    public a(ActionBarOverlayLayout actionBarOverlayLayout, int i10) {
        this.f14785a = i10;
        this.f14786b = actionBarOverlayLayout;
    }

    @Override
    public final void run() {
        switch (this.f14785a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f14786b;
                actionBarOverlayLayout.c();
                actionBarOverlayLayout.M = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.N);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f14786b;
                actionBarOverlayLayout2.c();
                actionBarOverlayLayout2.M = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.N);
                return;
        }
    }
}
