package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d extends AnimatorListenerAdapter {
    public final int f14288a;
    public final e f14289b;

    public d(e eVar, int i7) {
        this.f14288a = i7;
        this.f14289b = eVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f14288a) {
            case 0:
                e eVar = this.f14289b;
                eVar.N = false;
                eVar.f14339e.t(null, false, true);
                return;
            default:
                e eVar2 = this.f14289b;
                eVar2.U = 1.0f;
                eVar2.invalidate();
                return;
        }
    }
}
