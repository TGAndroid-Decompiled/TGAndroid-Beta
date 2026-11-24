package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class wnb extends AnimatorListenerAdapter {
    public final byte a;
    public final rob b;

    public wnb(rob robVar, byte b) {
        this.a = b;
        this.b = robVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        rob robVar = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                robVar.z0.invalidate();
                robVar.y0[1].setVisibility(8);
                robVar.e2 = null;
                return;
            case 1:
                robVar.D0 = null;
                return;
            case 2:
                if (robVar.F0.getTag() == null) {
                    robVar.F0.setVisibility(4);
                }
                robVar.J0 = null;
                return;
            case 3:
                if (robVar.G0.getTag() == null) {
                    robVar.G0.setVisibility(4);
                }
                robVar.K0 = null;
                return;
            case 4:
                fi1 fi1Var = robVar.j2;
                if (fi1Var != null) {
                    if (fi1Var.getParent() != null) {
                        ((ViewGroup) robVar.j2.getParent()).removeView(robVar.j2);
                    }
                    robVar.j2 = null;
                }
                robVar.l2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                if (!robVar.r1.a()) {
                    robVar.T1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
