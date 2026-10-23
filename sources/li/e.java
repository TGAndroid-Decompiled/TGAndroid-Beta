package li;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.to;
public final class e extends AnimatorListenerAdapter {
    public final t1 f16165a;
    public final float f16166b;
    public final float f16167c;
    public final float d;
    public final float e;
    public final m f16168f;

    public e(m mVar, t1 t1Var, float f7, float f10, float f11, float f12) {
        this.f16168f = mVar;
        this.f16165a = t1Var;
        this.f16166b = f7;
        this.f16167c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t1 t1Var = this.f16165a;
        t1Var.getTransitionParams().j();
        t1Var.getPhotoImage().setImageCoords(this.f16166b, this.f16167c, this.d, this.e);
        to toVar = this.f16168f.P;
        if (toVar != null) {
            toVar.h.setAlpha(1.0f);
        }
        t1Var.invalidate();
    }
}
