package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wb extends AnimatorListenerAdapter {
    public final int f1885a;
    public final yb f1886b;

    public wb(yb ybVar, int i10) {
        this.f1885a = i10;
        this.f1886b = ybVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1885a) {
            case 0:
                kc kcVar = this.f1886b.I0;
                kcVar.X = 0.0f;
                kc.k(kcVar);
                return;
            default:
                kc kcVar2 = this.f1886b.I0;
                kcVar2.W = 0.0f;
                kcVar2.Z = 0.0f;
                kc.k(kcVar2);
                return;
        }
    }
}
