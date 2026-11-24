package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p0b extends AnimatorListenerAdapter {
    public final byte a;
    public final q0b b;

    public p0b(q0b q0bVar, byte b) {
        this.a = b;
        this.b = q0bVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        q0b q0bVar = this.b;
        switch (b) {
            case 0:
                q0bVar.E = 1.0f;
                q0bVar.invalidate();
                q0bVar.H = null;
                return;
            case 1:
                q0bVar.m(((Float) q0bVar.w.getAnimatedValue()).floatValue());
                q0bVar.w = null;
                return;
            default:
                super.onAnimationEnd(animator);
                q0bVar.G = null;
                return;
        }
    }
}
