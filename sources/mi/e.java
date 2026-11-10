package mi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.on;
public final class e extends AnimatorListenerAdapter {
    public final q1 f20072a;
    public final float f20073b;
    public final float f20074c;
    public final float d;
    public final float f20075e;
    public final l f20076f;

    public e(l lVar, q1 q1Var, float f10, float f11, float f12, float f13) {
        this.f20076f = lVar;
        this.f20072a = q1Var;
        this.f20073b = f10;
        this.f20074c = f11;
        this.d = f12;
        this.f20075e = f13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        q1 q1Var = this.f20072a;
        q1Var.getTransitionParams().e();
        q1Var.getPhotoImage().y0(this.f20073b, this.f20074c, this.d, this.f20075e);
        on onVar = this.f20076f.P;
        if (onVar != null) {
            onVar.h.setAlpha(1.0f);
        }
        q1Var.invalidate();
    }
}
