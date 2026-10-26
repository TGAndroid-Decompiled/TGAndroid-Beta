package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fl0;
public final class j5 extends AnimatorListenerAdapter {
    public final int f11055a;
    public final fl0 f11056b;

    public j5(fl0 fl0Var, int i10) {
        this.f11055a = i10;
        this.f11056b = fl0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f11055a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f11056b);
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f11056b.L0.unlock();
                return;
            default:
                super.onAnimationEnd(animator);
                fl0 fl0Var = this.f11056b;
                fl0Var.Q = null;
                fl0Var.f28256n0 = 0.0f;
                fl0Var.f28254l0 = null;
                fl0Var.invalidate();
                return;
        }
    }
}
