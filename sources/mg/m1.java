package mg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m1 extends AnimatorListenerAdapter {
    public final j1 f13188a;
    public final n1 f13189b;

    public m1(n1 n1Var, j1 j1Var) {
        this.f13189b = n1Var;
        this.f13188a = j1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        j1 j1Var = this.f13188a;
        j1Var.setLayerType(0, null);
        this.f13189b.d.removeView(j1Var);
    }
}
