package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d extends AnimatorListenerAdapter {
    public final int f14457a;
    public final e f14458b;

    public d(e eVar, int i7) {
        this.f14457a = i7;
        this.f14458b = eVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f14457a) {
            case 0:
                e eVar = this.f14458b;
                eVar.N = false;
                eVar.f14566e.t(null, false, true);
                return;
            default:
                e eVar2 = this.f14458b;
                eVar2.U = 1.0f;
                eVar2.invalidate();
                return;
        }
    }
}
