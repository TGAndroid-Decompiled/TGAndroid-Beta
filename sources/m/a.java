package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;
public final class a implements Runnable {
    public final int f20045a;
    public final ActionBarOverlayLayout f20046b;

    public a(ActionBarOverlayLayout actionBarOverlayLayout, int i7) {
        this.f20045a = i7;
        this.f20046b = actionBarOverlayLayout;
    }

    @Override
    public final void run() {
        switch (this.f20045a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f20046b;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.N = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.O);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f20046b;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.N = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.O);
                return;
        }
    }
}
