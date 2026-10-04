package ji;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.mo;
public final class e extends AnimatorListenerAdapter {
    public final u1 f14188a;
    public final float f14189b;
    public final float f14190c;
    public final float d;
    public final float f14191e;
    public final n f14192f;

    public e(n nVar, u1 u1Var, float f7, float f10, float f11, float f12) {
        this.f14192f = nVar;
        this.f14188a = u1Var;
        this.f14189b = f7;
        this.f14190c = f10;
        this.d = f11;
        this.f14191e = f12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u1 u1Var = this.f14188a;
        u1Var.getTransitionParams().j();
        u1Var.getPhotoImage().setImageCoords(this.f14189b, this.f14190c, this.d, this.f14191e);
        mo moVar = this.f14192f.P;
        if (moVar != null) {
            moVar.h.setAlpha(1.0f);
        }
        u1Var.invalidate();
    }
}
