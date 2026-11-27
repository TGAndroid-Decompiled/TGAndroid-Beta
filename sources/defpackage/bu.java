package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.o;
public final class bu extends AnimatorListenerAdapter {
    public final o a;

    public bu(o oVar) {
        this.a = oVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        hl.c3(new c1(this, (byte) 20));
    }
}
