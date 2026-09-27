package ji;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.lo;
public final class e extends AnimatorListenerAdapter {
    public final u1 f13052a;
    public final float f13053b;
    public final float f13054c;
    public final float d;
    public final float e;
    public final n f13055f;

    public e(n nVar, u1 u1Var, float f7, float f10, float f11, float f12) {
        this.f13055f = nVar;
        this.f13052a = u1Var;
        this.f13053b = f7;
        this.f13054c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u1 u1Var = this.f13052a;
        u1Var.getTransitionParams().j();
        u1Var.getPhotoImage().setImageCoords(this.f13053b, this.f13054c, this.d, this.e);
        lo loVar = this.f13055f.P;
        if (loVar != null) {
            loVar.h.setAlpha(1.0f);
        }
        u1Var.invalidate();
    }
}
