package lg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m extends AnimatorListenerAdapter {
    public final boolean f15560a;
    public final boolean f15561b;
    public final boolean f15562c;
    public final boolean d;
    public final p f15563e;

    public m(p pVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f15563e = pVar;
        this.f15560a = z10;
        this.f15561b = z11;
        this.f15562c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p pVar = this.f15563e;
        pVar.F = false;
        if (!this.f15560a) {
            pVar.e(this.f15561b, this.f15562c, this.d, true);
        }
    }
}
