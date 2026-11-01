package org.telegram.messenger;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class x extends AnimatorListenerAdapter {
    public final int f19364a;
    public final View f19365b;

    public x(int i10, View view) {
        this.f19364a = i10;
        this.f19365b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f19364a) {
            case 0:
                this.f19365b.setTranslationX(0.0f);
                return;
            case 1:
                i0.E2(this.f19365b);
                return;
            default:
                i0.E2(this.f19365b);
                return;
        }
    }
}
