package ii;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.oo;
public final class e extends AnimatorListenerAdapter {
    public final t1 f10649a;
    public final float f10650b;
    public final float f10651c;
    public final float d;
    public final float e;
    public final n f10652f;

    public e(n nVar, t1 t1Var, float f7, float f10, float f11, float f12) {
        this.f10652f = nVar;
        this.f10649a = t1Var;
        this.f10650b = f7;
        this.f10651c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t1 t1Var = this.f10649a;
        t1Var.getTransitionParams().j();
        t1Var.getPhotoImage().setImageCoords(this.f10650b, this.f10651c, this.d, this.e);
        oo ooVar = this.f10652f.P;
        if (ooVar != null) {
            ooVar.h.setAlpha(1.0f);
        }
        t1Var.invalidate();
    }
}
