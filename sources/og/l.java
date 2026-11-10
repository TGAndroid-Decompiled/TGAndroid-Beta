package og;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l extends AnimatorListenerAdapter {
    public final boolean f20998a;
    public final boolean f20999b;
    public final boolean f21000c;
    public final boolean d;
    public final o f21001e;

    public l(o oVar, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f21001e = oVar;
        this.f20998a = z9;
        this.f20999b = z10;
        this.f21000c = z11;
        this.d = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        o oVar = this.f21001e;
        oVar.F = false;
        if (!this.f20998a) {
            oVar.e(this.f20999b, this.f21000c, this.d, true);
        }
    }
}
