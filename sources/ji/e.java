package ji;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.jo;
public final class e extends AnimatorListenerAdapter {
    public final u1 f13060a;
    public final float f13061b;
    public final float f13062c;
    public final float d;
    public final float e;
    public final n f13063f;

    public e(n nVar, u1 u1Var, float f7, float f10, float f11, float f12) {
        this.f13063f = nVar;
        this.f13060a = u1Var;
        this.f13061b = f7;
        this.f13062c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u1 u1Var = this.f13060a;
        u1Var.getTransitionParams().j();
        u1Var.getPhotoImage().setImageCoords(this.f13061b, this.f13062c, this.d, this.e);
        jo joVar = this.f13063f.P;
        if (joVar != null) {
            joVar.h.setAlpha(1.0f);
        }
        u1Var.invalidate();
    }
}
