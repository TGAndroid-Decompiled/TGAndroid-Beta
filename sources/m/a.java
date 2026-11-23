package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;
public final class a implements Runnable {
    public final int f20011a;
    public final ActionBarOverlayLayout f20012b;

    public a(ActionBarOverlayLayout actionBarOverlayLayout, int i7) {
        this.f20011a = i7;
        this.f20012b = actionBarOverlayLayout;
    }

    @Override
    public final void run() {
        switch (this.f20011a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f20012b;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.N = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.O);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f20012b;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.N = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.O);
                return;
        }
    }
}
