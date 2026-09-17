package mg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m extends AnimatorListenerAdapter {
    public final boolean f16287a;
    public final boolean f16288b;
    public final boolean f16289c;
    public final boolean d;
    public final q f16290e;

    public m(q qVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f16290e = qVar;
        this.f16287a = z10;
        this.f16288b = z11;
        this.f16289c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        q qVar = this.f16290e;
        qVar.F = false;
        if (!this.f16287a) {
            qVar.e(this.f16288b, this.f16289c, this.d, true);
        }
    }
}
