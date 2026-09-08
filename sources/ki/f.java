package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.io;
public final class f extends AnimatorListenerAdapter {
    public final t1 f15020a;
    public final float f15021b;
    public final float f15022c;
    public final float d;
    public final float f15023e;
    public final o f15024f;

    public f(o oVar, t1 t1Var, float f7, float f10, float f11, float f12) {
        this.f15024f = oVar;
        this.f15020a = t1Var;
        this.f15021b = f7;
        this.f15022c = f10;
        this.d = f11;
        this.f15023e = f12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t1 t1Var = this.f15020a;
        t1Var.getTransitionParams().j();
        t1Var.getPhotoImage().setImageCoords(this.f15021b, this.f15022c, this.d, this.f15023e);
        io ioVar = this.f15024f.P;
        if (ioVar != null) {
            ioVar.h.setAlpha(1.0f);
        }
        t1Var.invalidate();
    }
}
