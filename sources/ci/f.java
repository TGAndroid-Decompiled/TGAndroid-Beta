package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.xn;
public final class f extends AnimatorListenerAdapter {
    public final q1 f4206a;
    public final float f4207b;
    public final float f4208c;
    public final float d;
    public final float e;
    public final o f4209f;

    public f(o oVar, q1 q1Var, float f7, float f10, float f11, float f12) {
        this.f4209f = oVar;
        this.f4206a = q1Var;
        this.f4207b = f7;
        this.f4208c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        q1 q1Var = this.f4206a;
        q1Var.getTransitionParams().e();
        q1Var.getPhotoImage().y0(this.f4207b, this.f4208c, this.d, this.e);
        xn xnVar = this.f4209f.P;
        if (xnVar != null) {
            xnVar.h.setAlpha(1.0f);
        }
        q1Var.invalidate();
    }
}
