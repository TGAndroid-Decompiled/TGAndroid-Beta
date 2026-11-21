package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d extends AnimatorListenerAdapter {
    public final int f14454a;
    public final e f14455b;

    public d(e eVar, int i7) {
        this.f14454a = i7;
        this.f14455b = eVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f14454a) {
            case 0:
                e eVar = this.f14455b;
                eVar.N = false;
                eVar.f14563e.t(null, false, true);
                return;
            default:
                e eVar2 = this.f14455b;
                eVar2.U = 1.0f;
                eVar2.invalidate();
                return;
        }
    }
}
