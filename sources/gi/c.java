package gi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f12473a;
    public final d f12474b;

    public c(d dVar, int i3) {
        this.f12473a = i3;
        this.f12474b = dVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f12473a) {
            case 0:
                d dVar = this.f12474b;
                dVar.N = false;
                dVar.f12518e.t(null, false, true);
                return;
            default:
                d dVar2 = this.f12474b;
                dVar2.T = 1.0f;
                dVar2.invalidate();
                return;
        }
    }
}
