package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
public final class nfc implements ViewTreeObserver.OnPreDrawListener {
    public final float a;
    public final float b;
    public final pfc c;

    public nfc(pfc pfcVar, float f, float f2) {
        this.c = pfcVar;
        this.a = f;
        this.b = f2;
    }

    @Override
    public final boolean onPreDraw() {
        pfc pfcVar = this.c;
        if (!pfcVar.Q) {
            ValueAnimator valueAnimator = pfcVar.e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(pfcVar.K, 0.0f);
            pfcVar.e0 = ofFloat;
            ofFloat.addUpdateListener(pfcVar.f0);
            pfcVar.e0.setDuration(300L);
            pfcVar.e0.start();
            float measuredWidth = this.a - ((pfcVar.getMeasuredWidth() - (pfcVar.getMeasuredWidth() * 0.23f)) / 2.0f);
            float measuredHeight = this.b - ((pfcVar.getMeasuredHeight() - (pfcVar.getMeasuredHeight() * 0.23f)) / 2.0f);
            pfcVar.getViewTreeObserver().removeOnPreDrawListener(this);
            pfcVar.setTranslationX(measuredWidth);
            pfcVar.setTranslationY(measuredHeight);
            pfcVar.setScaleX(0.23f);
            pfcVar.setScaleY(0.23f);
            pfcVar.animate().setListener(null).cancel();
            pfcVar.animate().setListener(new iab(this, (byte) 19)).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).setStartDelay(0L).setInterpolator(s33.f).start();
            return false;
        }
        pfcVar.N = false;
        pfcVar.requestLayout();
        return false;
    }
}
