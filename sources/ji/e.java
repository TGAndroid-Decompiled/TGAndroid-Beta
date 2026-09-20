package ji;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.jo;
public final class e extends AnimatorListenerAdapter {
    public final u1 f13061a;
    public final float f13062b;
    public final float f13063c;
    public final float d;
    public final float e;
    public final n f13064f;

    public e(n nVar, u1 u1Var, float f7, float f10, float f11, float f12) {
        this.f13064f = nVar;
        this.f13061a = u1Var;
        this.f13062b = f7;
        this.f13063c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u1 u1Var = this.f13061a;
        u1Var.getTransitionParams().j();
        u1Var.getPhotoImage().setImageCoords(this.f13062b, this.f13063c, this.d, this.e);
        jo joVar = this.f13064f.P;
        if (joVar != null) {
            joVar.h.setAlpha(1.0f);
        }
        u1Var.invalidate();
    }
}
