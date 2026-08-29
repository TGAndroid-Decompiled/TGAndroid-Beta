package nh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fk0;
public final class a5 extends AnimatorListenerAdapter {
    public final int f17383a;
    public final fk0 f17384b;

    public a5(fk0 fk0Var, int i10) {
        this.f17383a = i10;
        this.f17384b = fk0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f17383a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f17384b);
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f17384b.H0.unlock();
                return;
            default:
                super.onAnimationEnd(animator);
                fk0 fk0Var = this.f17384b;
                fk0Var.M = null;
                fk0Var.f28451j0 = 0.0f;
                fk0Var.f28449h0 = null;
                fk0Var.invalidate();
                return;
        }
    }
}
