package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f6678a;
    public final d f6679b;

    public c(d dVar, int i10) {
        this.f6678a = i10;
        this.f6679b = dVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6678a) {
            case 0:
                d dVar = this.f6679b;
                dVar.J = false;
                dVar.e.t(null, false, true);
                return;
            default:
                d dVar2 = this.f6679b;
                dVar2.P = 1.0f;
                dVar2.invalidate();
                return;
        }
    }
}
