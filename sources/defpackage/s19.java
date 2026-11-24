package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s19 extends AnimatorListenerAdapter {
    public final r19 a;
    public final t19 b;

    public s19(t19 t19Var, r19 r19Var) {
        this.b = t19Var;
        this.a = r19Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        r19 r19Var = this.a;
        r19Var.setLayerType(0, null);
        this.b.d.removeView(r19Var);
    }
}
