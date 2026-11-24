package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class qsa extends AnimatorListenerAdapter {
    public final byte a;
    public final ssa b;

    public qsa(ssa ssaVar, byte b) {
        this.a = b;
        this.b = ssaVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ssa ssaVar = this.b;
        switch (b) {
            case 0:
                ssaVar.k0 = false;
                return;
            case 1:
                ssaVar.k0 = false;
                return;
            case 2:
                ssaVar.P.setVisibility(4);
                return;
            case 3:
                ssaVar.z0 = ssaVar.y0;
                ssaVar.d(ssaVar.b0);
                return;
            default:
                ssaVar.A0 = 1.0f;
                FrameLayout frameLayout = ssaVar.b;
                frameLayout.setScaleX(1.0f);
                frameLayout.setScaleY(ssaVar.A0);
                ssaVar.invalidate();
                return;
        }
    }
}
