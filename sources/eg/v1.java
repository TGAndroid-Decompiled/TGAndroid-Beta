package eg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v1 extends AnimatorListenerAdapter {
    public final t1 f6149a;
    public final w1 f6150b;

    public v1(w1 w1Var, t1 t1Var) {
        this.f6150b = w1Var;
        this.f6149a = t1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t1 t1Var = this.f6149a;
        t1Var.setLayerType(0, null);
        this.f6150b.d.removeView(t1Var);
    }
}
