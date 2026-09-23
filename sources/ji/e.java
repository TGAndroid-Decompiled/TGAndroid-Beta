package ji;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.ko;
public final class e extends AnimatorListenerAdapter {
    public final t1 f13049a;
    public final float f13050b;
    public final float f13051c;
    public final float d;
    public final float e;
    public final n f13052f;

    public e(n nVar, t1 t1Var, float f7, float f10, float f11, float f12) {
        this.f13052f = nVar;
        this.f13049a = t1Var;
        this.f13050b = f7;
        this.f13051c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t1 t1Var = this.f13049a;
        t1Var.getTransitionParams().j();
        t1Var.getPhotoImage().setImageCoords(this.f13050b, this.f13051c, this.d, this.e);
        ko koVar = this.f13052f.P;
        if (koVar != null) {
            koVar.h.setAlpha(1.0f);
        }
        t1Var.invalidate();
    }
}
