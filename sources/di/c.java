package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f6979a;
    public final d f6980b;

    public c(d dVar, int i10) {
        this.f6979a = i10;
        this.f6980b = dVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6979a) {
            case 0:
                d dVar = this.f6980b;
                dVar.J = false;
                dVar.f7014e.q(null, false, true);
                return;
            default:
                d dVar2 = this.f6980b;
                dVar2.P = 1.0f;
                dVar2.invalidate();
                return;
        }
    }
}
