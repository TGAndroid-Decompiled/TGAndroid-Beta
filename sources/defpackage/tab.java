package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class tab extends AnimatorListenerAdapter {
    public final byte a;
    public final rbb b;

    public tab(rbb rbbVar, byte b) {
        this.a = b;
        this.b = rbbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        rbb rbbVar = this.b;
        switch (b) {
            case 0:
                rbbVar.k2 = null;
                rbbVar.r.setTranslationY(0.0f);
                rbbVar.r.b(0.0f);
                return;
            case 1:
                rbbVar.n.removeView(rbbVar.N0);
                rbbVar.N0 = null;
                rbbVar.o2 = null;
                rbbVar.q2 = null;
                rx5 rx5Var = rbbVar.d1.M;
                boolean z = true;
                if (rbbVar.g0 == 1) {
                    z = false;
                }
                rx5Var.b(z);
                return;
            default:
                bbb bbbVar = rbbVar.D2;
                if (bbbVar != null) {
                    if (bbbVar.getParent() != null) {
                        ((ViewGroup) rbbVar.D2.getParent()).removeView(rbbVar.D2);
                    }
                    rbbVar.D2 = null;
                }
                rbbVar.F2 = null;
                super.onAnimationEnd(animator);
                return;
        }
    }
}
