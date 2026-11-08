package mi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.pn;
public final class e extends AnimatorListenerAdapter {
    public final q1 f20067a;
    public final float f20068b;
    public final float f20069c;
    public final float d;
    public final float f20070e;
    public final l f20071f;

    public e(l lVar, q1 q1Var, float f10, float f11, float f12, float f13) {
        this.f20071f = lVar;
        this.f20067a = q1Var;
        this.f20068b = f10;
        this.f20069c = f11;
        this.d = f12;
        this.f20070e = f13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        q1 q1Var = this.f20067a;
        q1Var.getTransitionParams().e();
        q1Var.getPhotoImage().y0(this.f20068b, this.f20069c, this.d, this.f20070e);
        pn pnVar = this.f20071f.P;
        if (pnVar != null) {
            pnVar.h.setAlpha(1.0f);
        }
        q1Var.invalidate();
    }
}
