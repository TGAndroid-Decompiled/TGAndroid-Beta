package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.io;
public final class f extends AnimatorListenerAdapter {
    public final t1 f14994a;
    public final float f14995b;
    public final float f14996c;
    public final float d;
    public final float f14997e;
    public final o f14998f;

    public f(o oVar, t1 t1Var, float f7, float f10, float f11, float f12) {
        this.f14998f = oVar;
        this.f14994a = t1Var;
        this.f14995b = f7;
        this.f14996c = f10;
        this.d = f11;
        this.f14997e = f12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t1 t1Var = this.f14994a;
        t1Var.getTransitionParams().j();
        t1Var.getPhotoImage().setImageCoords(this.f14995b, this.f14996c, this.d, this.f14997e);
        io ioVar = this.f14998f.P;
        if (ioVar != null) {
            ioVar.h.setAlpha(1.0f);
        }
        t1Var.invalidate();
    }
}
