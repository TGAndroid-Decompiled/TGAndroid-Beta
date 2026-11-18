package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class f2 extends AnimatorListenerAdapter {
    public final int f11923a;
    public final View f11924b;

    public f2(int i7, View view) {
        this.f11923a = i7;
        this.f11924b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f11923a) {
            case 0:
                org.telegram.messenger.g0.E2(this.f11924b);
                return;
            case 1:
                org.telegram.messenger.g0.E2(this.f11924b);
                return;
            default:
                this.f11924b.setTranslationX(0.0f);
                return;
        }
    }
}
