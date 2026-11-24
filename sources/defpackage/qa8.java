package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.ui.PhotoViewer;
public final class qa8 extends AnimatorListenerAdapter {
    public final byte a;
    public final byte b;
    public final PhotoViewer c;

    public qa8(PhotoViewer photoViewer, int i, byte b) {
        this.a = b;
        this.c = photoViewer;
        this.b = i;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        byte b2 = this.b;
        PhotoViewer photoViewer = this.c;
        switch (b) {
            case 0:
                ra8 ra8Var = photoViewer.O1;
                ra8Var.e.setVisibility(0);
                FrameLayout frameLayout = ra8Var.r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(gm.L(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                d53 d53Var = d53.h;
                wi8.t(translationY, d53Var, 320L);
                ra8Var.x.animate().alpha(1.0f).translationX(0.0f).setInterpolator(d53Var).setDuration(320L).start();
                photoViewer.t4 = b2;
                photoViewer.p6 = null;
                photoViewer.n6 = -1;
                return;
            default:
                photoViewer.t4 = b2;
                photoViewer.p6 = null;
                photoViewer.n6 = -1;
                return;
        }
    }
}
