package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class upb extends AnimatorListenerAdapter {
    public final byte a;
    public final pqb b;

    public upb(pqb pqbVar, byte b) {
        this.a = b;
        this.b = pqbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        pqb pqbVar = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                pqbVar.z0.invalidate();
                pqbVar.y0[1].setVisibility(8);
                pqbVar.e2 = null;
                return;
            case 1:
                pqbVar.D0 = null;
                return;
            case 2:
                if (pqbVar.F0.getTag() == null) {
                    pqbVar.F0.setVisibility(4);
                }
                pqbVar.J0 = null;
                return;
            case 3:
                if (pqbVar.G0.getTag() == null) {
                    pqbVar.G0.setVisibility(4);
                }
                pqbVar.K0 = null;
                return;
            case 4:
                gh1 gh1Var = pqbVar.j2;
                if (gh1Var != null) {
                    if (gh1Var.getParent() != null) {
                        ((ViewGroup) pqbVar.j2.getParent()).removeView(pqbVar.j2);
                    }
                    pqbVar.j2 = null;
                }
                pqbVar.l2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                if (!pqbVar.r1.a()) {
                    pqbVar.T1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
