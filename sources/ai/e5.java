package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e5 extends AnimatorListenerAdapter {
    public final int f622a;
    public final boolean f623b;
    public final i6 f624c;

    public e5(i6 i6Var, boolean z10, int i3) {
        this.f622a = i3;
        this.f624c = i6Var;
        this.f623b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f622a) {
            case 0:
                if (!this.f623b) {
                    this.f624c.E.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f623b) {
                    this.f624c.f725x.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
