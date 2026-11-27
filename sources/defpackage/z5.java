package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;
public final class z5 extends AnimatorListenerAdapter {
    public final byte a;
    public final TransitionValues b;

    public z5(TransitionValues transitionValues, byte b) {
        this.a = b;
        this.b = transitionValues;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        TransitionValues transitionValues = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                transitionValues.view.setLayerType(0, null);
                return;
            default:
                super.onAnimationEnd(animator);
                transitionValues.view.setEnabled(true);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        TransitionValues transitionValues = this.b;
        switch (b) {
            case 0:
                super.onAnimationStart(animator);
                transitionValues.view.setLayerType(2, null);
                return;
            default:
                super.onAnimationStart(animator);
                transitionValues.view.setEnabled(false);
                return;
        }
    }
}
