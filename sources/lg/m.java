package lg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m extends AnimatorListenerAdapter {
    public final boolean f15561a;
    public final boolean f15562b;
    public final boolean f15563c;
    public final boolean d;
    public final p f15564e;

    public m(p pVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f15564e = pVar;
        this.f15561a = z10;
        this.f15562b = z11;
        this.f15563c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p pVar = this.f15564e;
        pVar.F = false;
        if (!this.f15561a) {
            pVar.e(this.f15562b, this.f15563c, this.d, true);
        }
    }
}
