package bg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e2 extends AnimatorListenerAdapter {
    public final a2 f1745a;
    public final f2 f1746b;

    public e2(f2 f2Var, a2 a2Var) {
        this.f1746b = f2Var;
        this.f1745a = a2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a2 a2Var = this.f1745a;
        a2Var.setLayerType(0, null);
        this.f1746b.d.removeView(a2Var);
    }
}
