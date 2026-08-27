package ag;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class z extends AnimatorListenerAdapter {

    public final int f733a;

    public final a0 f734b;

    public final b0 f735c;

    public z(b0 b0Var, a0 a0Var, int i10) {
        this.f733a = i10;
        this.f735c = b0Var;
        this.f734b = a0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f733a) {
            case 0:
                this.f734b.f284f = null;
                b0.a(this.f735c);
                break;
            default:
                this.f734b.f284f = null;
                b0.a(this.f735c);
                break;
        }
    }
}
