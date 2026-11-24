package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class oya extends AnimatorListenerAdapter {
    public final byte a;
    public final pya b;

    public oya(pya pyaVar, byte b) {
        this.a = b;
        this.b = pyaVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        pya pyaVar = this.b;
        switch (b) {
            case 0:
                pyaVar.E = 1.0f;
                pyaVar.invalidate();
                pyaVar.H = null;
                return;
            case 1:
                pyaVar.m(((Float) pyaVar.w.getAnimatedValue()).floatValue());
                pyaVar.w = null;
                return;
            default:
                super.onAnimationEnd(animator);
                pyaVar.G = null;
                return;
        }
    }
}
