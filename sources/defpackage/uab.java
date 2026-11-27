package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class uab extends AnimatorListenerAdapter {
    public final byte a;
    public final sbb b;

    public uab(sbb sbbVar, byte b) {
        this.a = b;
        this.b = sbbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        sbb sbbVar = this.b;
        switch (b) {
            case 0:
                sbbVar.k2 = null;
                sbbVar.r.setTranslationY(0.0f);
                sbbVar.r.b(0.0f);
                return;
            case 1:
                sbbVar.n.removeView(sbbVar.N0);
                sbbVar.N0 = null;
                sbbVar.o2 = null;
                sbbVar.q2 = null;
                rx5 rx5Var = sbbVar.d1.M;
                boolean z = true;
                if (sbbVar.g0 == 1) {
                    z = false;
                }
                rx5Var.b(z);
                return;
            default:
                cbb cbbVar = sbbVar.D2;
                if (cbbVar != null) {
                    if (cbbVar.getParent() != null) {
                        ((ViewGroup) sbbVar.D2.getParent()).removeView(sbbVar.D2);
                    }
                    sbbVar.D2 = null;
                }
                sbbVar.F2 = null;
                super.onAnimationEnd(animator);
                return;
        }
    }
}
