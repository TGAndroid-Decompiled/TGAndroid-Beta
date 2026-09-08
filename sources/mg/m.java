package mg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m extends AnimatorListenerAdapter {
    public final boolean f16314a;
    public final boolean f16315b;
    public final boolean f16316c;
    public final boolean d;
    public final q f16317e;

    public m(q qVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f16317e = qVar;
        this.f16314a = z10;
        this.f16315b = z11;
        this.f16316c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        q qVar = this.f16317e;
        qVar.F = false;
        if (!this.f16314a) {
            qVar.e(this.f16315b, this.f16316c, this.d, true);
        }
    }
}
