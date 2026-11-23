package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class f2 extends AnimatorListenerAdapter {
    public final int f11930a;
    public final View f11931b;

    public f2(int i7, View view) {
        this.f11930a = i7;
        this.f11931b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f11930a) {
            case 0:
                org.telegram.messenger.g0.E2(this.f11931b);
                return;
            case 1:
                org.telegram.messenger.g0.E2(this.f11931b);
                return;
            default:
                this.f11931b.setTranslationX(0.0f);
                return;
        }
    }
}
