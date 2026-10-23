package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d7 extends AnimatorListenerAdapter {
    public final int f1140a;
    public final f7 f1141b;

    public d7(f7 f7Var, int i10) {
        this.f1140a = i10;
        this.f1141b = f7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1140a) {
            case 0:
                this.f1141b.f1274g0 = false;
                return;
            case 1:
                this.f1141b.f1274g0 = false;
                return;
            case 2:
                this.f1141b.O.setVisibility(4);
                return;
            case 3:
                f7 f7Var = this.f1141b;
                f7Var.f1291v0 = f7Var.f1290u0;
                f7Var.d(f7Var.f1265a0);
                return;
            default:
                f7 f7Var2 = this.f1141b;
                f7Var2.f1293w0 = 1.0f;
                f7Var2.f1266b.setScaleX(1.0f);
                f7Var2.f1266b.setScaleY(f7Var2.f1293w0);
                f7Var2.invalidate();
                return;
        }
    }
}
