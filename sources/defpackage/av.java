package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.o;
public final class av extends AnimatorListenerAdapter {
    public final o a;

    public av(o oVar) {
        this.a = oVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        gm.c3(new b1(this, (byte) 22));
    }
}
