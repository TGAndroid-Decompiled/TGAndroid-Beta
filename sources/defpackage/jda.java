package defpackage;

import android.animation.ValueAnimator;
public final class jda implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final iea b;
    public final nfa c;

    public jda(nfa nfaVar, iea ieaVar, byte b) {
        this.a = b;
        this.c = nfaVar;
        this.b = ieaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        iea ieaVar = this.b;
        nfa nfaVar = this.c;
        switch (b) {
            case 0:
                nfaVar.q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ieaVar.h.invalidate();
                return;
            default:
                nfaVar.q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ieaVar.h.invalidate();
                return;
        }
    }
}
