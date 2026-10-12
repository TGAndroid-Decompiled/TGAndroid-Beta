package ji;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.bp;
public final class e extends AnimatorListenerAdapter {
    public final u1 f14222a;
    public final float f14223b;
    public final float f14224c;
    public final float d;
    public final float f14225e;
    public final n f14226f;

    public e(n nVar, u1 u1Var, float f7, float f10, float f11, float f12) {
        this.f14226f = nVar;
        this.f14222a = u1Var;
        this.f14223b = f7;
        this.f14224c = f10;
        this.d = f11;
        this.f14225e = f12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u1 u1Var = this.f14222a;
        u1Var.getTransitionParams().j();
        u1Var.getPhotoImage().setImageCoords(this.f14223b, this.f14224c, this.d, this.f14225e);
        bp bpVar = this.f14226f.P;
        if (bpVar != null) {
            bpVar.h.setAlpha(1.0f);
        }
        u1Var.invalidate();
    }
}
