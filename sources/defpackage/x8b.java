package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class x8b extends AnimatorListenerAdapter {
    public final byte a;
    public final v9b b;

    public x8b(v9b v9bVar, byte b) {
        this.a = b;
        this.b = v9bVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        v9b v9bVar = this.b;
        switch (b) {
            case 0:
                v9bVar.k2 = null;
                v9bVar.r.setTranslationY(0.0f);
                v9bVar.r.b(0.0f);
                return;
            case 1:
                v9bVar.n.removeView(v9bVar.N0);
                v9bVar.N0 = null;
                v9bVar.o2 = null;
                v9bVar.q2 = null;
                mx5 mx5Var = v9bVar.d1.M;
                boolean z = true;
                if (v9bVar.g0 == 1) {
                    z = false;
                }
                mx5Var.b(z);
                return;
            default:
                f9b f9bVar = v9bVar.D2;
                if (f9bVar != null) {
                    if (f9bVar.getParent() != null) {
                        ((ViewGroup) v9bVar.D2.getParent()).removeView(v9bVar.D2);
                    }
                    v9bVar.D2 = null;
                }
                v9bVar.F2 = null;
                super.onAnimationEnd(animator);
                return;
        }
    }
}
