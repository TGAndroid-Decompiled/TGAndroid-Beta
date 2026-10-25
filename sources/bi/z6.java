package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z6 extends AnimatorListenerAdapter {
    public final int f5850a;
    public final b7 f5851b;

    public z6(b7 b7Var, int i10) {
        this.f5850a = i10;
        this.f5851b = b7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5850a) {
            case 0:
                this.f5851b.f4353g0 = false;
                return;
            case 1:
                this.f5851b.f4353g0 = false;
                return;
            case 2:
                this.f5851b.O.setVisibility(4);
                return;
            case 3:
                b7 b7Var = this.f5851b;
                b7Var.f4370v0 = b7Var.f4369u0;
                b7Var.d(b7Var.f4344a0);
                return;
            default:
                b7 b7Var2 = this.f5851b;
                b7Var2.f4372w0 = 1.0f;
                b7Var2.f4345b.setScaleX(1.0f);
                b7Var2.f4345b.setScaleY(b7Var2.f4372w0);
                b7Var2.invalidate();
                return;
        }
    }
}
