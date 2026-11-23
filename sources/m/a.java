package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;
public final class a implements Runnable {
    public final int f20108a;
    public final ActionBarOverlayLayout f20109b;

    public a(ActionBarOverlayLayout actionBarOverlayLayout, int i7) {
        this.f20108a = i7;
        this.f20109b = actionBarOverlayLayout;
    }

    @Override
    public final void run() {
        switch (this.f20108a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f20109b;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.N = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.O);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f20109b;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.N = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.O);
                return;
        }
    }
}
