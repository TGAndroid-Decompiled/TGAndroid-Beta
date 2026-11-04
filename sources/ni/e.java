package ni;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.on;
public final class e extends AnimatorListenerAdapter {
    public final q1 f20417a;
    public final float f20418b;
    public final float f20419c;
    public final float d;
    public final float f20420e;
    public final l f20421f;

    public e(l lVar, q1 q1Var, float f10, float f11, float f12, float f13) {
        this.f20421f = lVar;
        this.f20417a = q1Var;
        this.f20418b = f10;
        this.f20419c = f11;
        this.d = f12;
        this.f20420e = f13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        q1 q1Var = this.f20417a;
        q1Var.getTransitionParams().e();
        q1Var.getPhotoImage().y0(this.f20418b, this.f20419c, this.d, this.f20420e);
        on onVar = this.f20421f.P;
        if (onVar != null) {
            onVar.h.setAlpha(1.0f);
        }
        q1Var.invalidate();
    }
}
