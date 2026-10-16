package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.wo;
public final class f extends AnimatorListenerAdapter {
    public final u1 f14312a;
    public final float f14313b;
    public final float f14314c;
    public final float d;
    public final float e;
    public final n f14315f;

    public f(n nVar, u1 u1Var, float f7, float f10, float f11, float f12) {
        this.f14315f = nVar;
        this.f14312a = u1Var;
        this.f14313b = f7;
        this.f14314c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u1 u1Var = this.f14312a;
        u1Var.getTransitionParams().j();
        u1Var.getPhotoImage().setImageCoords(this.f14313b, this.f14314c, this.d, this.e);
        wo woVar = this.f14315f.P;
        if (woVar != null) {
            woVar.h.setAlpha(1.0f);
        }
        u1Var.invalidate();
    }
}
