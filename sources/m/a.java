package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;
public final class a implements Runnable {
    public final int f15624a;
    public final ActionBarOverlayLayout f15625b;

    public a(ActionBarOverlayLayout actionBarOverlayLayout, int i10) {
        this.f15624a = i10;
        this.f15625b = actionBarOverlayLayout;
    }

    @Override
    public final void run() {
        switch (this.f15624a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f15625b;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.M = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.N);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f15625b;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.M = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.N);
                return;
        }
    }
}
