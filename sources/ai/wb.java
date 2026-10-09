package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wb extends AnimatorListenerAdapter {
    public final int f1887a;
    public final yb f1888b;

    public wb(yb ybVar, int i10) {
        this.f1887a = i10;
        this.f1888b = ybVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1887a) {
            case 0:
                kc kcVar = this.f1888b.I0;
                kcVar.X = 0.0f;
                kc.k(kcVar);
                return;
            default:
                kc kcVar2 = this.f1888b.I0;
                kcVar2.W = 0.0f;
                kcVar2.Z = 0.0f;
                kc.k(kcVar2);
                return;
        }
    }
}
