package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u0a extends AnimatorListenerAdapter {
    public final byte a;
    public final w0a b;

    public u0a(w0a w0aVar, byte b) {
        this.a = b;
        this.b = w0aVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        w0a w0aVar = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                w0aVar.J = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                w0aVar.J = null;
                return;
            default:
                super.onAnimationEnd(animator);
                w0aVar.O = 0.0f;
                w0aVar.J = null;
                w0aVar.N = false;
                w0aVar.d(true, false);
                return;
        }
    }
}
