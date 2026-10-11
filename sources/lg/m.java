package lg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m extends AnimatorListenerAdapter {
    public final boolean f15597a;
    public final boolean f15598b;
    public final boolean f15599c;
    public final boolean d;
    public final p f15600e;

    public m(p pVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f15600e = pVar;
        this.f15597a = z10;
        this.f15598b = z11;
        this.f15599c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p pVar = this.f15600e;
        pVar.F = false;
        if (!this.f15597a) {
            pVar.e(this.f15598b, this.f15599c, this.d, true);
        }
    }
}
