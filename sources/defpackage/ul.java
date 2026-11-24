package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class ul extends AnimatorListenerAdapter {
    public final byte a;
    public final View b;

    public ul(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.setTranslationX(0.0f);
                return;
            case 1:
                gm.B2(this.b);
                return;
            default:
                gm.B2(this.b);
                return;
        }
    }
}
