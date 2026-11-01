package jg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g extends AnimatorListenerAdapter {
    public final int f9979a;
    public final j f9980b;

    public g(j jVar, int i10) {
        this.f9979a = i10;
        this.f9980b = jVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9979a) {
            case 0:
                j jVar = this.f9980b;
                if (animator == jVar.f10033a0) {
                    jVar.f10033a0 = null;
                    return;
                }
                return;
            case 1:
                j jVar2 = this.f9980b;
                if (animator == jVar2.f10035b0) {
                    jVar2.f10035b0 = null;
                    return;
                }
                return;
            case 2:
                j jVar3 = this.f9980b;
                if (animator == jVar3.P) {
                    jVar3.P = null;
                    jVar3.O = 0.0f;
                    return;
                }
                return;
            case 3:
                j jVar4 = this.f9980b;
                if (animator == jVar4.Q) {
                    jVar4.Q = null;
                    return;
                }
                return;
            default:
                j jVar5 = this.f9980b;
                if (!jVar5.f10047l0) {
                    org.telegram.messenger.i0.E2(jVar5.H);
                    jVar5.H = null;
                    return;
                }
                return;
        }
    }
}
