package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o2b extends AnimatorListenerAdapter {
    public final byte a;
    public final p2b b;

    public o2b(p2b p2bVar, byte b) {
        this.a = b;
        this.b = p2bVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        p2b p2bVar = this.b;
        switch (b) {
            case 0:
                p2bVar.E = 1.0f;
                p2bVar.invalidate();
                p2bVar.H = null;
                return;
            case 1:
                p2bVar.m(((Float) p2bVar.w.getAnimatedValue()).floatValue());
                p2bVar.w = null;
                return;
            default:
                super.onAnimationEnd(animator);
                p2bVar.G = null;
                return;
        }
    }
}
