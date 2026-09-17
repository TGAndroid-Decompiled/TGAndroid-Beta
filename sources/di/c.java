package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f7007a;
    public final d f7008b;

    public c(d dVar, int i10) {
        this.f7007a = i10;
        this.f7008b = dVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f7007a) {
            case 0:
                d dVar = this.f7008b;
                dVar.J = false;
                dVar.f7042e.q(null, false, true);
                return;
            default:
                d dVar2 = this.f7008b;
                dVar2.P = 1.0f;
                dVar2.invalidate();
                return;
        }
    }
}
