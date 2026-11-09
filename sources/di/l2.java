package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class l2 extends AnimatorListenerAdapter {
    public final int f9306a;
    public final View f9307b;

    public l2(int i7, View view) {
        this.f9306a = i7;
        this.f9307b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9306a) {
            case 0:
                org.telegram.messenger.g0.E2(this.f9307b);
                return;
            case 1:
                org.telegram.messenger.g0.E2(this.f9307b);
                return;
            default:
                this.f9307b.setTranslationX(0.0f);
                return;
        }
    }
}
