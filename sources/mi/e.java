package mi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.vo;
public final class e extends AnimatorListenerAdapter {
    public final s1 f18514a;
    public final float f18515b;
    public final float f18516c;
    public final float d;
    public final float e;
    public final m f18517f;

    public e(m mVar, s1 s1Var, float f7, float f10, float f11, float f12) {
        this.f18517f = mVar;
        this.f18514a = s1Var;
        this.f18515b = f7;
        this.f18516c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        s1 s1Var = this.f18514a;
        s1Var.getTransitionParams().j();
        s1Var.getPhotoImage().setImageCoords(this.f18515b, this.f18516c, this.d, this.e);
        vo voVar = this.f18517f.P;
        if (voVar != null) {
            voVar.h.setAlpha(1.0f);
        }
        s1Var.invalidate();
    }
}
