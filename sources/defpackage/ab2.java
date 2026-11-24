package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ab2 extends AnimatorListenerAdapter {
    public final byte a;
    public final gb2 b;

    public ab2(gb2 gb2Var, byte b) {
        this.a = b;
        this.b = gb2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        gb2 gb2Var = this.b;
        switch (b) {
            case 0:
                gb2Var.Q5.O0 = true;
                gb2Var.invalidate();
                return;
            default:
                gb2Var.setSelectedBackgroundProgress(0.0f);
                return;
        }
    }
}
