package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class ngc extends AnimatorListenerAdapter {
    public boolean a;
    public final View b;
    public final float c;
    public final wgc d;

    public ngc(wgc wgcVar, View view, float f) {
        this.d = wgcVar;
        this.b = view;
        this.c = f;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.a) {
            this.d.F(this.b, this.c);
        }
    }
}
