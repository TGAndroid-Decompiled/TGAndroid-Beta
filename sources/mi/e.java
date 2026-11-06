package mi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.pn;
public final class e extends AnimatorListenerAdapter {
    public final q1 f20064a;
    public final float f20065b;
    public final float f20066c;
    public final float d;
    public final float f20067e;
    public final l f20068f;

    public e(l lVar, q1 q1Var, float f10, float f11, float f12, float f13) {
        this.f20068f = lVar;
        this.f20064a = q1Var;
        this.f20065b = f10;
        this.f20066c = f11;
        this.d = f12;
        this.f20067e = f13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        q1 q1Var = this.f20064a;
        q1Var.getTransitionParams().e();
        q1Var.getPhotoImage().y0(this.f20065b, this.f20066c, this.d, this.f20067e);
        pn pnVar = this.f20068f.P;
        if (pnVar != null) {
            pnVar.h.setAlpha(1.0f);
        }
        q1Var.invalidate();
    }
}
