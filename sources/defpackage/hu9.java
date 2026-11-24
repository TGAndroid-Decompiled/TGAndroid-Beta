package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.SecretMediaViewer;
public final class hu9 extends AnimatorListenerAdapter {
    public final byte a;
    public final SecretMediaViewer b;

    public hu9(SecretMediaViewer secretMediaViewer, byte b) {
        this.a = b;
        this.b = secretMediaViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        SecretMediaViewer secretMediaViewer = this.b;
        switch (b) {
            case 0:
                Runnable runnable = secretMediaViewer.n0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.n0 = null;
                    return;
                }
                return;
            case 1:
                AnimatorSet animatorSet = secretMediaViewer.H;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    secretMediaViewer.G.setVisibility(8);
                    secretMediaViewer.H = null;
                    secretMediaViewer.Z.scrollTo(0, 0);
                    return;
                }
                return;
            case 2:
                Runnable runnable2 = secretMediaViewer.n0;
                if (runnable2 != null) {
                    runnable2.run();
                    secretMediaViewer.n0 = null;
                    return;
                }
                return;
            default:
                secretMediaViewer.J0 = null;
                secretMediaViewer.e.invalidate();
                return;
        }
    }
}
