package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class v6b extends AnimatorListenerAdapter {
    public final byte a;
    public final t7b b;

    public v6b(t7b t7bVar, byte b) {
        this.a = b;
        this.b = t7bVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        t7b t7bVar = this.b;
        switch (b) {
            case 0:
                t7bVar.k2 = null;
                t7bVar.r.setTranslationY(0.0f);
                t7bVar.r.b(0.0f);
                return;
            case 1:
                t7bVar.n.removeView(t7bVar.N0);
                t7bVar.N0 = null;
                t7bVar.o2 = null;
                t7bVar.q2 = null;
                mv5 mv5Var = t7bVar.d1.M;
                boolean z = true;
                if (t7bVar.g0 == 1) {
                    z = false;
                }
                mv5Var.b(z);
                return;
            default:
                d7b d7bVar = t7bVar.D2;
                if (d7bVar != null) {
                    if (d7bVar.getParent() != null) {
                        ((ViewGroup) t7bVar.D2.getParent()).removeView(t7bVar.D2);
                    }
                    t7bVar.D2 = null;
                }
                t7bVar.F2 = null;
                super.onAnimationEnd(animator);
                return;
        }
    }
}
