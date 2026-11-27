package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
public final class sjc implements ViewTreeObserver.OnPreDrawListener {
    public final float a;
    public final float b;
    public final ujc c;

    public sjc(ujc ujcVar, float f, float f2) {
        this.c = ujcVar;
        this.a = f;
        this.b = f2;
    }

    @Override
    public final boolean onPreDraw() {
        ujc ujcVar = this.c;
        if (!ujcVar.Q) {
            ValueAnimator valueAnimator = ujcVar.e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(ujcVar.K, 0.0f);
            ujcVar.e0 = ofFloat;
            ofFloat.addUpdateListener(ujcVar.f0);
            ujcVar.e0.setDuration(300L);
            ujcVar.e0.start();
            float measuredWidth = this.a - ((ujcVar.getMeasuredWidth() - (ujcVar.getMeasuredWidth() * 0.23f)) / 2.0f);
            float measuredHeight = this.b - ((ujcVar.getMeasuredHeight() - (ujcVar.getMeasuredHeight() * 0.23f)) / 2.0f);
            ujcVar.getViewTreeObserver().removeOnPreDrawListener(this);
            ujcVar.setTranslationX(measuredWidth);
            ujcVar.setTranslationY(measuredHeight);
            ujcVar.setScaleX(0.23f);
            ujcVar.setScaleY(0.23f);
            ujcVar.animate().setListener(null).cancel();
            ujcVar.animate().setListener(new omb(this, (byte) 18)).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).setStartDelay(0L).setInterpolator(k43.f).start();
            return false;
        }
        ujcVar.N = false;
        ujcVar.requestLayout();
        return false;
    }
}
