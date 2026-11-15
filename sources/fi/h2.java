package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class h2 extends AnimatorListenerAdapter {
    public final int f11757a;
    public final View f11758b;

    public h2(int i7, View view) {
        this.f11757a = i7;
        this.f11758b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f11757a) {
            case 0:
                org.telegram.messenger.g0.E2(this.f11758b);
                return;
            case 1:
                org.telegram.messenger.g0.E2(this.f11758b);
                return;
            default:
                this.f11758b.setTranslationX(0.0f);
                return;
        }
    }
}
