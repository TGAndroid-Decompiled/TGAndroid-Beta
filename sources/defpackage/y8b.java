package defpackage;

import android.animation.ValueAnimator;
public final class y8b implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final v9b b;

    public y8b(v9b v9bVar, byte b) {
        this.a = b;
        this.b = v9bVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        v9b v9bVar = this.b;
        switch (b) {
            case 0:
                v9bVar.d1.m();
                return;
            default:
                v9bVar.m0();
                return;
        }
    }
}
