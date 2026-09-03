package eg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u extends AnimatorListenerAdapter {
    public final int f5501a;
    public final v f5502b;
    public final w f5503c;

    public u(w wVar, v vVar, int i10) {
        this.f5501a = i10;
        this.f5503c = wVar;
        this.f5502b = vVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5501a) {
            case 0:
                this.f5502b.f5522f = null;
                w.a(this.f5503c);
                return;
            default:
                this.f5502b.f5522f = null;
                w.a(this.f5503c);
                return;
        }
    }
}
