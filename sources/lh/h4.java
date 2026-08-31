package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h4 extends AnimatorListenerAdapter {
    public final int f12795a;
    public final boolean f12796b;
    public final r5 f12797c;

    public h4(r5 r5Var, boolean z4, int i10) {
        this.f12795a = i10;
        this.f12797c = r5Var;
        this.f12796b = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f12795a) {
            case 0:
                if (!this.f12796b) {
                    this.f12797c.f12935y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f12796b) {
                    this.f12797c.f12933w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
