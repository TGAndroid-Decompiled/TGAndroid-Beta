package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.wo;
public final class f extends AnimatorListenerAdapter {
    public final u1 f14310a;
    public final float f14311b;
    public final float f14312c;
    public final float d;
    public final float e;
    public final n f14313f;

    public f(n nVar, u1 u1Var, float f7, float f10, float f11, float f12) {
        this.f14313f = nVar;
        this.f14310a = u1Var;
        this.f14311b = f7;
        this.f14312c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u1 u1Var = this.f14310a;
        u1Var.getTransitionParams().j();
        u1Var.getPhotoImage().setImageCoords(this.f14311b, this.f14312c, this.d, this.e);
        wo woVar = this.f14313f.P;
        if (woVar != null) {
            woVar.h.setAlpha(1.0f);
        }
        u1Var.invalidate();
    }
}
