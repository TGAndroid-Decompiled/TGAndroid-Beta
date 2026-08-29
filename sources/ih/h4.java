package ih;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h4 extends AnimatorListenerAdapter {
    public final int f9221a;
    public final boolean f9222b;
    public final r5 f9223c;

    public h4(r5 r5Var, boolean z10, int i10) {
        this.f9221a = i10;
        this.f9223c = r5Var;
        this.f9222b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9221a) {
            case 0:
                if (!this.f9222b) {
                    this.f9223c.f9364y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f9222b) {
                    this.f9223c.f9362w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
