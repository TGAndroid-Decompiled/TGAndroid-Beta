package ji;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.zo;
public final class e extends AnimatorListenerAdapter {
    public final u1 f14224a;
    public final float f14225b;
    public final float f14226c;
    public final float d;
    public final float f14227e;
    public final n f14228f;

    public e(n nVar, u1 u1Var, float f7, float f10, float f11, float f12) {
        this.f14228f = nVar;
        this.f14224a = u1Var;
        this.f14225b = f7;
        this.f14226c = f10;
        this.d = f11;
        this.f14227e = f12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u1 u1Var = this.f14224a;
        u1Var.getTransitionParams().j();
        u1Var.getPhotoImage().setImageCoords(this.f14225b, this.f14226c, this.d, this.f14227e);
        zo zoVar = this.f14228f.P;
        if (zoVar != null) {
            zoVar.h.setAlpha(1.0f);
        }
        u1Var.invalidate();
    }
}
