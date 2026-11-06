package og;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l extends AnimatorListenerAdapter {
    public final boolean f20990a;
    public final boolean f20991b;
    public final boolean f20992c;
    public final boolean d;
    public final o f20993e;

    public l(o oVar, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f20993e = oVar;
        this.f20990a = z9;
        this.f20991b = z10;
        this.f20992c = z11;
        this.d = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        o oVar = this.f20993e;
        oVar.F = false;
        if (!this.f20990a) {
            oVar.e(this.f20991b, this.f20992c, this.d, true);
        }
    }
}
