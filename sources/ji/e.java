package ji;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.jo;
public final class e extends AnimatorListenerAdapter {
    public final t1 f13057a;
    public final float f13058b;
    public final float f13059c;
    public final float d;
    public final float e;
    public final n f13060f;

    public e(n nVar, t1 t1Var, float f7, float f10, float f11, float f12) {
        this.f13060f = nVar;
        this.f13057a = t1Var;
        this.f13058b = f7;
        this.f13059c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t1 t1Var = this.f13057a;
        t1Var.getTransitionParams().j();
        t1Var.getPhotoImage().setImageCoords(this.f13058b, this.f13059c, this.d, this.e);
        jo joVar = this.f13060f.P;
        if (joVar != null) {
            joVar.h.setAlpha(1.0f);
        }
        t1Var.invalidate();
    }
}
