package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.o;
public final class au extends AnimatorListenerAdapter {
    public final o a;

    public au(o oVar) {
        this.a = oVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        gl.d3(new b1(this, (byte) 20));
    }
}
