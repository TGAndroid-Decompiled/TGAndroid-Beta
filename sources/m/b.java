package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;
public final class b implements Runnable {
    public final int f16151a;
    public final ActionBarOverlayLayout f16152b;

    public b(ActionBarOverlayLayout actionBarOverlayLayout, int i10) {
        this.f16151a = i10;
        this.f16152b = actionBarOverlayLayout;
    }

    @Override
    public final void run() {
        switch (this.f16151a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f16152b;
                actionBarOverlayLayout.c();
                actionBarOverlayLayout.M = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.N);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f16152b;
                actionBarOverlayLayout2.c();
                actionBarOverlayLayout2.M = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.N);
                return;
        }
    }
}
