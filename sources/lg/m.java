package lg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m extends AnimatorListenerAdapter {
    public final boolean f15562a;
    public final boolean f15563b;
    public final boolean f15564c;
    public final boolean d;
    public final p f15565e;

    public m(p pVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f15565e = pVar;
        this.f15562a = z10;
        this.f15563b = z11;
        this.f15564c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p pVar = this.f15565e;
        pVar.F = false;
        if (!this.f15562a) {
            pVar.e(this.f15563b, this.f15564c, this.d, true);
        }
    }
}
