package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f8805a;
    public final d f8806b;

    public c(d dVar, int i10) {
        this.f8805a = i10;
        this.f8806b = dVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f8805a) {
            case 0:
                d dVar = this.f8806b;
                dVar.J = false;
                dVar.e.t(null, false, true);
                return;
            default:
                d dVar2 = this.f8806b;
                dVar2.P = 1.0f;
                dVar2.invalidate();
                return;
        }
    }
}
