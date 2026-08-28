package kh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.uj0;
public final class l5 extends AnimatorListenerAdapter {
    public final int f15598a;
    public final uj0 f15599b;

    public l5(uj0 uj0Var, int i9) {
        this.f15598a = i9;
        this.f15599b = uj0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15598a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f15599b);
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f15599b.H0.unlock();
                return;
            default:
                super.onAnimationEnd(animator);
                uj0 uj0Var = this.f15599b;
                uj0Var.M = null;
                uj0Var.f33062j0 = 0.0f;
                uj0Var.f33060h0 = null;
                uj0Var.invalidate();
                return;
        }
    }
}
