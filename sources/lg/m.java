package lg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m extends AnimatorListenerAdapter {
    public final boolean f15558a;
    public final boolean f15559b;
    public final boolean f15560c;
    public final boolean d;
    public final p f15561e;

    public m(p pVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f15561e = pVar;
        this.f15558a = z10;
        this.f15559b = z11;
        this.f15560c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p pVar = this.f15561e;
        pVar.F = false;
        if (!this.f15558a) {
            pVar.e(this.f15559b, this.f15560c, this.d, true);
        }
    }
}
