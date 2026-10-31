package org.telegram.messenger;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class x extends AnimatorListenerAdapter {
    public final int f19165a;
    public final View f19166b;

    public x(int i10, View view) {
        this.f19165a = i10;
        this.f19166b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f19165a) {
            case 0:
                this.f19166b.setTranslationX(0.0f);
                return;
            case 1:
                i0.E2(this.f19166b);
                return;
            default:
                i0.E2(this.f19166b);
                return;
        }
    }
}
