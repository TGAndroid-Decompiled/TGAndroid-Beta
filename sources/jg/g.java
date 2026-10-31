package jg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g extends AnimatorListenerAdapter {
    public final int f9978a;
    public final j f9979b;

    public g(j jVar, int i10) {
        this.f9978a = i10;
        this.f9979b = jVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9978a) {
            case 0:
                j jVar = this.f9979b;
                if (animator == jVar.f10032a0) {
                    jVar.f10032a0 = null;
                    return;
                }
                return;
            case 1:
                j jVar2 = this.f9979b;
                if (animator == jVar2.f10034b0) {
                    jVar2.f10034b0 = null;
                    return;
                }
                return;
            case 2:
                j jVar3 = this.f9979b;
                if (animator == jVar3.P) {
                    jVar3.P = null;
                    jVar3.O = 0.0f;
                    return;
                }
                return;
            case 3:
                j jVar4 = this.f9979b;
                if (animator == jVar4.Q) {
                    jVar4.Q = null;
                    return;
                }
                return;
            default:
                j jVar5 = this.f9979b;
                if (!jVar5.f10046l0) {
                    org.telegram.messenger.i0.E2(jVar5.H);
                    jVar5.H = null;
                    return;
                }
                return;
        }
    }
}
