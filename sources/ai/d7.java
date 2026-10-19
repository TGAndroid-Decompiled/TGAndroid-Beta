package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d7 extends AnimatorListenerAdapter {
    public final int f1146a;
    public final f7 f1147b;

    public d7(f7 f7Var, int i10) {
        this.f1146a = i10;
        this.f1147b = f7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1146a) {
            case 0:
                this.f1147b.f1271g0 = false;
                return;
            case 1:
                this.f1147b.f1271g0 = false;
                return;
            case 2:
                this.f1147b.O.setVisibility(4);
                return;
            case 3:
                f7 f7Var = this.f1147b;
                f7Var.f1288v0 = f7Var.f1287u0;
                f7Var.d(f7Var.f1262a0);
                return;
            default:
                f7 f7Var2 = this.f1147b;
                f7Var2.f1290w0 = 1.0f;
                f7Var2.f1263b.setScaleX(1.0f);
                f7Var2.f1263b.setScaleY(f7Var2.f1290w0);
                f7Var2.invalidate();
                return;
        }
    }
}
