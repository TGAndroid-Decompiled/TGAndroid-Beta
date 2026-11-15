package og;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l extends AnimatorListenerAdapter {
    public final boolean f21516a;
    public final boolean f21517b;
    public final boolean f21518c;
    public final boolean d;
    public final o f21519e;

    public l(o oVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f21519e = oVar;
        this.f21516a = z10;
        this.f21517b = z11;
        this.f21518c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        o oVar = this.f21519e;
        oVar.G = false;
        if (!this.f21516a) {
            oVar.e(this.f21517b, this.f21518c, this.d, true);
        }
    }
}
