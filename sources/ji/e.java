package ji;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.mo;
public final class e extends AnimatorListenerAdapter {
    public final u1 f13064a;
    public final float f13065b;
    public final float f13066c;
    public final float d;
    public final float e;
    public final n f13067f;

    public e(n nVar, u1 u1Var, float f7, float f10, float f11, float f12) {
        this.f13067f = nVar;
        this.f13064a = u1Var;
        this.f13065b = f7;
        this.f13066c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u1 u1Var = this.f13064a;
        u1Var.getTransitionParams().j();
        u1Var.getPhotoImage().setImageCoords(this.f13065b, this.f13066c, this.d, this.e);
        mo moVar = this.f13067f.P;
        if (moVar != null) {
            moVar.h.setAlpha(1.0f);
        }
        u1Var.invalidate();
    }
}
