package cg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u extends AnimatorListenerAdapter {
    public final int f3388a;
    public final v f3389b;
    public final w f3390c;

    public u(w wVar, v vVar, int i10) {
        this.f3388a = i10;
        this.f3390c = wVar;
        this.f3389b = vVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3388a) {
            case 0:
                this.f3389b.f3400f = null;
                w.a(this.f3390c);
                return;
            default:
                this.f3389b.f3400f = null;
                w.a(this.f3390c);
                return;
        }
    }
}
