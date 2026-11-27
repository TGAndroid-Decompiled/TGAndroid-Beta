package defpackage;

import android.animation.ValueAnimator;
public final class uab implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final rbb b;

    public uab(rbb rbbVar, byte b) {
        this.a = b;
        this.b = rbbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        rbb rbbVar = this.b;
        switch (b) {
            case 0:
                rbbVar.d1.m();
                return;
            default:
                rbbVar.m0();
                return;
        }
    }
}
