package li;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.to;
public final class e extends AnimatorListenerAdapter {
    public final u1 f16102a;
    public final float f16103b;
    public final float f16104c;
    public final float d;
    public final float e;
    public final m f16105f;

    public e(m mVar, u1 u1Var, float f7, float f10, float f11, float f12) {
        this.f16105f = mVar;
        this.f16102a = u1Var;
        this.f16103b = f7;
        this.f16104c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u1 u1Var = this.f16102a;
        u1Var.getTransitionParams().j();
        u1Var.getPhotoImage().setImageCoords(this.f16103b, this.f16104c, this.d, this.e);
        to toVar = this.f16105f.P;
        if (toVar != null) {
            toVar.h.setAlpha(1.0f);
        }
        u1Var.invalidate();
    }
}
