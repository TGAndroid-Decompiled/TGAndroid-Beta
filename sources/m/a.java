package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;
public final class a implements Runnable {
    public final int f17667a;
    public final ActionBarOverlayLayout f17668b;

    public a(ActionBarOverlayLayout actionBarOverlayLayout, int i10) {
        this.f17667a = i10;
        this.f17668b = actionBarOverlayLayout;
    }

    @Override
    public final void run() {
        switch (this.f17667a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f17668b;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.M = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.N);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f17668b;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.M = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.N);
                return;
        }
    }
}
