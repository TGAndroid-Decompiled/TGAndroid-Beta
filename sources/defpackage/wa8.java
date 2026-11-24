package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.PipRoundVideoView;
public final class wa8 extends AnimatorListenerAdapter {
    public final byte a;
    public final PipRoundVideoView b;

    public wa8(PipRoundVideoView pipRoundVideoView, byte b) {
        this.a = b;
        this.b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        PipRoundVideoView pipRoundVideoView = this.b;
        switch (b) {
            case 0:
                if (animator.equals(pipRoundVideoView.r)) {
                    pipRoundVideoView.r = null;
                    return;
                }
                return;
            default:
                pipRoundVideoView.a(false);
                Runnable runnable = pipRoundVideoView.s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
