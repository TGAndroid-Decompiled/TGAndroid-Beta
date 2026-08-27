package gh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class o4 extends AnimatorListenerAdapter {

    public final int f7479a;

    public final boolean f7480b;

    public final y5 f7481c;

    public o4(y5 y5Var, boolean z10, int i10) {
        this.f7479a = i10;
        this.f7481c = y5Var;
        this.f7480b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f7479a) {
            case 0:
                if (!this.f7480b) {
                    this.f7481c.f7690y.setVisibility(8);
                }
                break;
            default:
                if (!this.f7480b) {
                    this.f7481c.f7688w.setVisibility(8);
                }
                break;
        }
    }
}
