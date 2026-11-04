package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;
public final class a implements Runnable {
    public final int f18538a;
    public final ActionBarOverlayLayout f18539b;

    public a(ActionBarOverlayLayout actionBarOverlayLayout, int i3) {
        this.f18538a = i3;
        this.f18539b = actionBarOverlayLayout;
    }

    @Override
    public final void run() {
        switch (this.f18538a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f18539b;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.N = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.O);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f18539b;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.N = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.O);
                return;
        }
    }
}
