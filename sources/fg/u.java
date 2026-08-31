package fg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u extends AnimatorListenerAdapter {
    public final int f6568a;
    public final v f6569b;
    public final w f6570c;

    public u(w wVar, v vVar, int i10) {
        this.f6568a = i10;
        this.f6570c = wVar;
        this.f6569b = vVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6568a) {
            case 0:
                this.f6569b.f6580f = null;
                w.a(this.f6570c);
                return;
            default:
                this.f6569b.f6580f = null;
                w.a(this.f6570c);
                return;
        }
    }
}
