package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f6681a;
    public final d f6682b;

    public c(d dVar, int i10) {
        this.f6681a = i10;
        this.f6682b = dVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6681a) {
            case 0:
                d dVar = this.f6682b;
                dVar.J = false;
                dVar.e.t(null, false, true);
                return;
            default:
                d dVar2 = this.f6682b;
                dVar2.P = 1.0f;
                dVar2.invalidate();
                return;
        }
    }
}
