package ji;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.zo;
public final class e extends AnimatorListenerAdapter {
    public final u1 f14225a;
    public final float f14226b;
    public final float f14227c;
    public final float d;
    public final float f14228e;
    public final n f14229f;

    public e(n nVar, u1 u1Var, float f7, float f10, float f11, float f12) {
        this.f14229f = nVar;
        this.f14225a = u1Var;
        this.f14226b = f7;
        this.f14227c = f10;
        this.d = f11;
        this.f14228e = f12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u1 u1Var = this.f14225a;
        u1Var.getTransitionParams().j();
        u1Var.getPhotoImage().setImageCoords(this.f14226b, this.f14227c, this.d, this.f14228e);
        zo zoVar = this.f14229f.P;
        if (zoVar != null) {
            zoVar.h.setAlpha(1.0f);
        }
        u1Var.invalidate();
    }
}
