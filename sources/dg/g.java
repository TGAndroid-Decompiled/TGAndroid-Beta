package dg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class g extends AnimatorListenerAdapter {
    public final int f4522a;
    public final j f4523b;

    public g(j jVar, int i10) {
        this.f4522a = i10;
        this.f4523b = jVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4522a) {
            case 0:
                j jVar = this.f4523b;
                if (animator == jVar.U) {
                    jVar.U = null;
                    return;
                }
                return;
            case 1:
                j jVar2 = this.f4523b;
                if (animator == jVar2.V) {
                    jVar2.V = null;
                    return;
                }
                return;
            case 2:
                j jVar3 = this.f4523b;
                if (animator == jVar3.M) {
                    jVar3.M = null;
                    jVar3.L = 0.0f;
                    return;
                }
                return;
            case 3:
                j jVar4 = this.f4523b;
                if (animator == jVar4.N) {
                    jVar4.N = null;
                    return;
                }
                return;
            default:
                j jVar5 = this.f4523b;
                if (!jVar5.f4596i0) {
                    AndroidUtilities.removeFromParent(jVar5.E);
                    jVar5.E = null;
                    return;
                }
                return;
        }
    }
}
