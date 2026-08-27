package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;

public final class b implements Runnable {

    public final int f17273a;

    public final ActionBarOverlayLayout f17274b;

    public b(ActionBarOverlayLayout actionBarOverlayLayout, int i10) {
        this.f17273a = i10;
        this.f17274b = actionBarOverlayLayout;
    }

    @Override
    public final void run() {
        switch (this.f17273a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f17274b;
                actionBarOverlayLayout.c();
                actionBarOverlayLayout.I = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.J);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f17274b;
                actionBarOverlayLayout2.c();
                actionBarOverlayLayout2.I = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.J);
                break;
        }
    }
}
