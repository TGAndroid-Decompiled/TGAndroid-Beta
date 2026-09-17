package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;
public final class a implements Runnable {
    public final int f15471a;
    public final ActionBarOverlayLayout f15472b;

    public a(ActionBarOverlayLayout actionBarOverlayLayout, int i10) {
        this.f15471a = i10;
        this.f15472b = actionBarOverlayLayout;
    }

    @Override
    public final void run() {
        switch (this.f15471a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f15472b;
                actionBarOverlayLayout.c();
                actionBarOverlayLayout.M = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.N);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f15472b;
                actionBarOverlayLayout2.c();
                actionBarOverlayLayout2.M = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.N);
                return;
        }
    }
}
