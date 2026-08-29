package bg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class h extends AnimatorListenerAdapter {
    public final int f2276a;
    public final k f2277b;

    public h(k kVar, int i10) {
        this.f2276a = i10;
        this.f2277b = kVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2276a) {
            case 0:
                k kVar = this.f2277b;
                if (animator == kVar.T) {
                    kVar.T = null;
                    return;
                }
                return;
            case 1:
                k kVar2 = this.f2277b;
                if (animator == kVar2.U) {
                    kVar2.U = null;
                    return;
                }
                return;
            case 2:
                k kVar3 = this.f2277b;
                if (animator == kVar3.L) {
                    kVar3.L = null;
                    kVar3.K = 0.0f;
                    return;
                }
                return;
            case 3:
                k kVar4 = this.f2277b;
                if (animator == kVar4.M) {
                    kVar4.M = null;
                    return;
                }
                return;
            default:
                k kVar5 = this.f2277b;
                if (!kVar5.f2355h0) {
                    AndroidUtilities.removeFromParent(kVar5.D);
                    kVar5.D = null;
                    return;
                }
                return;
        }
    }
}
