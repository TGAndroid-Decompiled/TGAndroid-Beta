package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wj0;

public final class k5 extends AnimatorListenerAdapter {

    public final int f16238a;

    public final wj0 f16239b;

    public k5(wj0 wj0Var, int i10) {
        this.f16238a = i10;
        this.f16239b = wj0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f16238a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f16239b);
                break;
            case 1:
                super.onAnimationEnd(animator);
                this.f16239b.H0.unlock();
                break;
            default:
                super.onAnimationEnd(animator);
                wj0 wj0Var = this.f16239b;
                wj0Var.M = null;
                wj0Var.f34253j0 = 0.0f;
                wj0Var.f34251h0 = null;
                wj0Var.invalidate();
                break;
        }
    }
}
