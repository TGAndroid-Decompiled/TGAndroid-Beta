package mg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m extends AnimatorListenerAdapter {
    public final boolean f15547a;
    public final boolean f15548b;
    public final boolean f15549c;
    public final boolean d;
    public final p e;

    public m(p pVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.e = pVar;
        this.f15547a = z10;
        this.f15548b = z11;
        this.f15549c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p pVar = this.e;
        pVar.F = false;
        if (!this.f15547a) {
            pVar.e(this.f15548b, this.f15549c, this.d, true);
        }
    }
}
