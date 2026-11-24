package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.ui.PhotoViewer;
public final class o88 extends AnimatorListenerAdapter {
    public final byte a;
    public final byte b;
    public final PhotoViewer c;

    public o88(PhotoViewer photoViewer, int i, byte b) {
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
                p88 p88Var = photoViewer.O1;
                p88Var.e.setVisibility(0);
                FrameLayout frameLayout = p88Var.r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(gl.L(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                s33 s33Var = s33.h;
                ug8.t(translationY, s33Var, 320L);
                p88Var.x.animate().alpha(1.0f).translationX(0.0f).setInterpolator(s33Var).setDuration(320L).start();
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
