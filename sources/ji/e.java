package ji;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.ko;
public final class e extends AnimatorListenerAdapter {
    public final u1 f13049a;
    public final float f13050b;
    public final float f13051c;
    public final float d;
    public final float e;
    public final n f13052f;

    public e(n nVar, u1 u1Var, float f7, float f10, float f11, float f12) {
        this.f13052f = nVar;
        this.f13049a = u1Var;
        this.f13050b = f7;
        this.f13051c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u1 u1Var = this.f13049a;
        u1Var.getTransitionParams().j();
        u1Var.getPhotoImage().setImageCoords(this.f13050b, this.f13051c, this.d, this.e);
        ko koVar = this.f13052f.P;
        if (koVar != null) {
            koVar.h.setAlpha(1.0f);
        }
        u1Var.invalidate();
    }
}
