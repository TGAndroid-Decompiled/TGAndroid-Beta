package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;
public final class b implements Runnable {
    public final int f16898a;
    public final ActionBarOverlayLayout f16899b;

    public b(ActionBarOverlayLayout actionBarOverlayLayout, int i9) {
        this.f16898a = i9;
        this.f16899b = actionBarOverlayLayout;
    }

    @Override
    public final void run() {
        switch (this.f16898a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f16899b;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.I = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.J);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f16899b;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.I = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.J);
                return;
        }
    }
}
