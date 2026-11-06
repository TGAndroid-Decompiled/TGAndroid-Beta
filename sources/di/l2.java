package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class l2 extends AnimatorListenerAdapter {
    public final int f9331a;
    public final View f9332b;

    public l2(int i7, View view) {
        this.f9331a = i7;
        this.f9332b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9331a) {
            case 0:
                org.telegram.messenger.g0.E2(this.f9332b);
                return;
            case 1:
                org.telegram.messenger.g0.E2(this.f9332b);
                return;
            default:
                this.f9332b.setTranslationX(0.0f);
                return;
        }
    }
}
