package ji;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.mo;
public final class e extends AnimatorListenerAdapter {
    public final u1 f14189a;
    public final float f14190b;
    public final float f14191c;
    public final float d;
    public final float f14192e;
    public final n f14193f;

    public e(n nVar, u1 u1Var, float f7, float f10, float f11, float f12) {
        this.f14193f = nVar;
        this.f14189a = u1Var;
        this.f14190b = f7;
        this.f14191c = f10;
        this.d = f11;
        this.f14192e = f12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u1 u1Var = this.f14189a;
        u1Var.getTransitionParams().j();
        u1Var.getPhotoImage().setImageCoords(this.f14190b, this.f14191c, this.d, this.f14192e);
        mo moVar = this.f14193f.P;
        if (moVar != null) {
            moVar.h.setAlpha(1.0f);
        }
        u1Var.invalidate();
    }
}
