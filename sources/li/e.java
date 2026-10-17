package li;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.to;
public final class e extends AnimatorListenerAdapter {
    public final u1 f16096a;
    public final float f16097b;
    public final float f16098c;
    public final float d;
    public final float e;
    public final m f16099f;

    public e(m mVar, u1 u1Var, float f7, float f10, float f11, float f12) {
        this.f16099f = mVar;
        this.f16096a = u1Var;
        this.f16097b = f7;
        this.f16098c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u1 u1Var = this.f16096a;
        u1Var.getTransitionParams().j();
        u1Var.getPhotoImage().setImageCoords(this.f16097b, this.f16098c, this.d, this.e);
        to toVar = this.f16099f.P;
        if (toVar != null) {
            toVar.h.setAlpha(1.0f);
        }
        u1Var.invalidate();
    }
}
