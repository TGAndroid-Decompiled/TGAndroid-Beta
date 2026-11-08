package og;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l extends AnimatorListenerAdapter {
    public final boolean f20993a;
    public final boolean f20994b;
    public final boolean f20995c;
    public final boolean d;
    public final o f20996e;

    public l(o oVar, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f20996e = oVar;
        this.f20993a = z9;
        this.f20994b = z10;
        this.f20995c = z11;
        this.d = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        o oVar = this.f20996e;
        oVar.F = false;
        if (!this.f20993a) {
            oVar.e(this.f20994b, this.f20995c, this.d, true);
        }
    }
}
