package defpackage;

import android.animation.ValueAnimator;
public final class w6b implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final t7b b;

    public w6b(t7b t7bVar, byte b) {
        this.a = b;
        this.b = t7bVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        t7b t7bVar = this.b;
        switch (b) {
            case 0:
                t7bVar.d1.m();
                return;
            default:
                t7bVar.m0();
                return;
        }
    }
}
