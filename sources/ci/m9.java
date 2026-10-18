package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m9 extends AnimatorListenerAdapter {
    public final int f5626a;
    public final o9 f5627b;

    public m9(o9 o9Var, int i10) {
        this.f5626a = i10;
        this.f5627b = o9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5626a) {
            case 0:
                aa aaVar = this.f5627b.I0;
                aaVar.X = 0.0f;
                aa.k(aaVar);
                return;
            default:
                aa aaVar2 = this.f5627b.I0;
                aaVar2.W = 0.0f;
                aaVar2.Z = 0.0f;
                aa.k(aaVar2);
                return;
        }
    }
}
