package kh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g4 extends AnimatorListenerAdapter {
    public final int f10750a;
    public final boolean f10751b;
    public final q5 f10752c;

    public g4(q5 q5Var, boolean z4, int i10) {
        this.f10750a = i10;
        this.f10752c = q5Var;
        this.f10751b = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f10750a) {
            case 0:
                if (!this.f10751b) {
                    this.f10752c.f10884y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f10751b) {
                    this.f10752c.f10882w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
