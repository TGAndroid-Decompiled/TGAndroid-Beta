package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class p2 extends AnimatorListenerAdapter {
    public final int f10752a;
    public final View f10753b;

    public p2(int i3, View view) {
        this.f10752a = i3;
        this.f10753b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f10752a) {
            case 0:
                org.telegram.messenger.g0.E2(this.f10753b);
                return;
            case 1:
                org.telegram.messenger.g0.E2(this.f10753b);
                return;
            default:
                this.f10753b.setTranslationX(0.0f);
                return;
        }
    }
}
