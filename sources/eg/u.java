package eg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u extends AnimatorListenerAdapter {
    public final int f5512a;
    public final v f5513b;
    public final w f5514c;

    public u(w wVar, v vVar, int i10) {
        this.f5512a = i10;
        this.f5514c = wVar;
        this.f5513b = vVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5512a) {
            case 0:
                this.f5513b.f5533f = null;
                w.a(this.f5514c);
                return;
            default:
                this.f5513b.f5533f = null;
                w.a(this.f5514c);
                return;
        }
    }
}
